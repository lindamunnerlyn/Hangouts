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

public class drf
{

    private static final boolean a = false;
    private static final AtomicLong b = new AtomicLong(1L);
    private static final Uri c = Uri.parse("content://hangoutsmmssend");
    private final SmsManager d;
    private ConcurrentHashMap e;

    public drf(SmsManager smsmanager)
    {
        e = new ConcurrentHashMap();
        d = smsmanager;
    }

    private acw a(Context context, String s, acd acd, boolean flag)
    {
        Uri uri;
        long l3;
        uri = a(context, acd);
        acd = new drg(uri, flag);
        l3 = b.getAndIncrement();
        if (a)
        {
            String s2 = String.valueOf(uri);
            ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s2).length())).append("MmsSender: sending MMS. locationUrl=").append(s).append(" pduContentUri=").append(s2).toString());
        }
        acd;
        JVM INSTR monitorenter ;
        long l2;
        long l4;
        e.put(Long.valueOf(l3), acd);
        a(context, uri, s, new Intent("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT", ContentUris.withAppendedId(c, l3), context, com/google/android/apps/hangouts/sms/SendStatusReceiver));
        l2 = ((alw)hgx.a(context, alw)).a("babel_mms_network_acquire_timeout_in_millis", 0x2bf20L);
        l4 = SystemClock.elapsedRealtime();
        long l = l2;
_L8:
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        acd.wait(l);
_L3:
        if (!((drg) (acd)).c)
        {
            l = l2 - (SystemClock.elapsedRealtime() - l4);
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        ebw.g("Babel_SMS", "MmsSender: sending wait interrupted");
        if (true) goto _L3; else goto _L2
        context;
        acd;
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
        ebw.b("Babel_SMS", s);
_L5:
        acd;
        JVM INSTR monitorexit ;
        if (!((drg) (acd)).c)
        {
            ebw.f("Babel_SMS", "MmsSender: timed out waiting for MMS send");
            throw new drh("Timeout waiting for MMS send");
        }
        break MISSING_BLOCK_LABEL_302;
        s = new String("MmsSender: send completed. locationUrl=");
          goto _L6
        switch (acd.a())
        {
        case 0: // '\0'
        default:
            context = MmsFileProvider.a(((drg) (acd)).a, context);
            if (context.exists())
            {
                context.delete();
                if (a)
                {
                    s = String.valueOf("MmsSender: Deleted temp file with outgoing MMS [pduContentUri=");
                    String s1 = String.valueOf(((drg) (acd)).a);
                    long l1 = context.length();
                    ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append(s).append(s1).append(", size=").append(l1).append("].").toString());
                }
            }
            if (((drg) (acd)).b)
            {
                return a(((drg) (acd)).e);
            }
            break;

        case 1: // '\001'
            int i = ((drg) (acd)).d;
            ebw.f("Babel_SMS", (new StringBuilder(57)).append("MmsSender: temporary failure with status code ").append(i).toString());
            throw new drh("Temporary failure sending MMS");

        case 2: // '\002'
            int j = ((drg) (acd)).d;
            ebw.g("Babel_SMS", (new StringBuilder(57)).append("MmsSender: permanent failure with status code ").append(j).toString());
            throw new dra();
        }
        return null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public acw a(Context context, acx acx)
    {
        return a(context, ((String) (null)), ((acd) (acx)), true);
    }

    acw a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (new aco(abyte0)).a();
            if (abyte0 != null)
            {
                if (abyte0 instanceof acw)
                {
                    return (acw)abyte0;
                }
                ebw.g("Babel_SMS", "MmsSender: send response not SendConf");
            } else
            {
                ebw.g("Babel_SMS", "MmsSender: send invalid response");
            }
        }
        return null;
    }

    Uri a(Context context, acd acd)
    {
        File file;
        Uri uri;
        uri = MmsFileProvider.a(context);
        file = MmsFileProvider.a(uri, context);
        FileOutputStream fileoutputstream1;
        file.getParentFile().mkdirs();
        fileoutputstream1 = new FileOutputStream(file);
        FileOutputStream fileoutputstream = fileoutputstream1;
        context = (new aci(context, acd)).a();
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
        acd = String.valueOf(file.getAbsolutePath());
        fileoutputstream = fileoutputstream1;
        if (acd.length() == 0) goto _L4; else goto _L3
_L3:
        fileoutputstream = fileoutputstream1;
        acd = "Cannot create temporary file ".concat(acd);
_L5:
        fileoutputstream = fileoutputstream1;
        ebw.e("Babel_SMS", acd, context);
        fileoutputstream = fileoutputstream1;
        throw new drh("Cannot create raw mms file");
        context;
_L6:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (acd acd) { }
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
        acd = new String("Cannot create temporary file ");
          goto _L5
_L7:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        fileoutputstream = fileoutputstream1;
        file.delete();
        fileoutputstream = fileoutputstream1;
        ebw.e("Babel_SMS", "Out of memory in composing PDU", context);
        fileoutputstream = fileoutputstream1;
        throw new dra(context);
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
        ebw.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 70)).append(s).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
_L7:
        if (l < 0L) goto _L4; else goto _L3
_L3:
        Object obj = (drg)e.get(Long.valueOf(l));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj;
        JVM INSTR monitorenter ;
        ((drg) (obj)).a(i, j, abyte0);
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        if (a)
        {
            obj = String.valueOf("MmsSender: received result.  requestId=");
            ebw.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 70)).append(((String) (obj))).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
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
        d.sendMultimediaMessage(context, uri, s, dqv.y(), intent);
    }

    public void a(Context context, byte abyte0[], String s)
    {
        if (!dqv.a().s())
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
            ebw.b("Babel_SMS", s1);
        }
        a(context, s, ((acd) (new acg(abyte0, 129))), false);
    }

    static 
    {
        hik hik = ebw.r;
    }
}
