// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.SmsManager;
import com.google.android.apps.hangouts.sms.MmsFileProvider;
import com.google.android.apps.hangouts.sms.SendStatusReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class dtz
{

    private static final boolean a = false;
    private static final AtomicLong b = new AtomicLong(1L);
    private static final Uri c = Uri.parse("content://hangoutsmmssend");
    private final SmsManager d;
    private ConcurrentHashMap e;

    public dtz(SmsManager smsmanager)
    {
        e = new ConcurrentHashMap();
        d = smsmanager;
    }

    private acy a(Context context, String s, acf acf, boolean flag)
    {
        Uri uri;
        long l3;
        uri = a(context, acf);
        acf = new dua(uri, flag);
        l3 = b.getAndIncrement();
        if (a)
        {
            String s2 = String.valueOf(uri);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s2).length())).append("MmsSender: sending MMS. locationUrl=").append(s).append(" pduContentUri=").append(s2).toString());
        }
        acf;
        JVM INSTR monitorenter ;
        long l2;
        long l4;
        e.put(Long.valueOf(l3), acf);
        a(context, uri, s, new Intent("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT", ContentUris.withAppendedId(c, l3), context, com/google/android/apps/hangouts/sms/SendStatusReceiver));
        l2 = ((amo)hlp.a(context, amo)).a("babel_mms_network_acquire_timeout_in_millis", 0x2bf20L);
        l4 = SystemClock.elapsedRealtime();
        long l = l2;
_L8:
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        acf.wait(l);
_L3:
        if (!((dua) (acf)).c)
        {
            l = l2 - (SystemClock.elapsedRealtime() - l4);
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        eev.g("Babel_SMS", "MmsSender: sending wait interrupted");
        if (true) goto _L3; else goto _L2
        context;
        acf;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        e.remove(Long.valueOf(l3));
        if (!a) goto _L5; else goto _L4
_L4:
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        s = "MmsSender: send completed. locationUrl=".concat(s);
_L6:
        eev.b("Babel_SMS", s);
_L5:
        acf;
        JVM INSTR monitorexit ;
        if (!((dua) (acf)).c)
        {
            eev.f("Babel_SMS", "MmsSender: timed out waiting for MMS send");
            throw new dub("Timeout waiting for MMS send");
        }
        break MISSING_BLOCK_LABEL_302;
        s = new String("MmsSender: send completed. locationUrl=");
          goto _L6
        switch (acf.a())
        {
        case 0: // '\0'
        default:
            context = MmsFileProvider.a(((dua) (acf)).a, context);
            if (context.exists())
            {
                context.delete();
                if (a)
                {
                    s = String.valueOf("MmsSender: Deleted temp file with outgoing MMS [pduContentUri=");
                    String s1 = String.valueOf(((dua) (acf)).a);
                    long l1 = context.length();
                    eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append(s).append(s1).append(", size=").append(l1).append("].").toString());
                }
            }
            if (((dua) (acf)).b)
            {
                return a(((dua) (acf)).e);
            }
            break;

        case 1: // '\001'
            int i = ((dua) (acf)).d;
            eev.f("Babel_SMS", (new StringBuilder(57)).append("MmsSender: temporary failure with status code ").append(i).toString());
            throw new dub("Temporary failure sending MMS");

        case 2: // '\002'
            int j = ((dua) (acf)).d;
            eev.g("Babel_SMS", (new StringBuilder(57)).append("MmsSender: permanent failure with status code ").append(j).toString());
            throw new dtu();
        }
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public acy a(Context context, acz acz)
    {
        return a(context, ((String) (null)), ((acf) (acz)), true);
    }

    acy a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (new acq(abyte0)).a();
            if (abyte0 != null)
            {
                if (abyte0 instanceof acy)
                {
                    return (acy)abyte0;
                }
                eev.g("Babel_SMS", "MmsSender: send response not SendConf");
            } else
            {
                eev.g("Babel_SMS", "MmsSender: send invalid response");
            }
        }
        return null;
    }

    Uri a(Context context, acf acf)
    {
        File file;
        Uri uri;
        uri = MmsFileProvider.a(context);
        file = MmsFileProvider.a(uri, context);
        FileOutputStream fileoutputstream1;
        file.getParentFile().mkdirs();
        fileoutputstream1 = new FileOutputStream(file);
        FileOutputStream fileoutputstream = fileoutputstream1;
        context = (new ack(context, acf)).a();
        if (context != null) goto _L2; else goto _L1
_L1:
        fileoutputstream = fileoutputstream1;
        throw new IllegalArgumentException("Empty or zero length PDU data");
        context;
_L8:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        fileoutputstream = fileoutputstream1;
        file.delete();
        fileoutputstream = fileoutputstream1;
        acf = String.valueOf(file.getAbsolutePath());
        fileoutputstream = fileoutputstream1;
        if (acf.length() == 0) goto _L4; else goto _L3
_L3:
        fileoutputstream = fileoutputstream1;
        acf = "Cannot create temporary file ".concat(acf);
_L5:
        fileoutputstream = fileoutputstream1;
        eev.e("Babel_SMS", acf, context);
        fileoutputstream = fileoutputstream1;
        throw new dub("Cannot create raw mms file");
        context;
_L6:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (acf acf) { }
        }
        throw context;
_L2:
        fileoutputstream = fileoutputstream1;
        fileoutputstream1.write(context);
        try
        {
            fileoutputstream1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return uri;
        }
        return uri;
_L4:
        fileoutputstream = fileoutputstream1;
        acf = new String("Cannot create temporary file ");
          goto _L5
_L7:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        fileoutputstream = fileoutputstream1;
        file.delete();
        fileoutputstream = fileoutputstream1;
        eev.e("Babel_SMS", "Out of memory in composing PDU", context);
        fileoutputstream = fileoutputstream1;
        throw new dtu(context);
        context;
        fileoutputstream = null;
          goto _L6
        context;
          goto _L7
        context;
        fileoutputstream1 = null;
          goto _L8
        context;
        fileoutputstream1 = null;
          goto _L7
    }

    public void a(long l, int i, int j, byte abyte0[])
    {
        if (i == -1) goto _L2; else goto _L1
_L1:
        String s = String.valueOf("MmsSender: failure in sending mms.  requestId=");
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 70)).append(s).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
_L7:
        if (l < 0L) goto _L4; else goto _L3
_L3:
        Object obj = (dua)e.get(Long.valueOf(l));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj;
        JVM INSTR monitorenter ;
        ((dua) (obj)).a(i, j, abyte0);
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        if (a)
        {
            obj = String.valueOf("MmsSender: received result.  requestId=");
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 70)).append(((String) (obj))).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
        }
        if (true) goto _L7; else goto _L6
_L6:
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    void a(Context context, Uri uri, String s, Intent intent)
    {
        intent = PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
        d.sendMultimediaMessage(context, uri, s, dtp.y(), intent);
    }

    public void a(Context context, byte abyte0[], String s)
    {
        if (!dtp.a().s())
        {
            s = null;
        }
        if (a)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "MmsSender: sending NotifyResp. locationUrl=".concat(s1);
            } else
            {
                s1 = new String("MmsSender: sending NotifyResp. locationUrl=");
            }
            eev.b("Babel_SMS", s1);
        }
        a(context, s, ((acf) (new aci(abyte0, 129))), false);
    }

    static 
    {
        hnc hnc = eev.r;
    }
}
