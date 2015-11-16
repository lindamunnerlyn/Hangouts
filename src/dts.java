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
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class dts
{

    private static final boolean a = false;
    private static final AtomicLong b = new AtomicLong(1L);
    private static final Uri c = Uri.parse("content://hangoutsmmsdownload");
    private static ConcurrentHashMap e = new ConcurrentHashMap();
    private final SmsManager d;

    public dts(SmsManager smsmanager)
    {
        d = smsmanager;
    }

    private static acx a(byte abyte0[], Context context)
    {
        acf acf = null;
        acf acf1 = (new acq(abyte0)).a();
        acf = acf1;
_L2:
        if (due.j() && acf != null)
        {
            due.a(abyte0, acf, context);
        }
        return (acx)acf;
        RuntimeException runtimeexception;
        runtimeexception;
        eev.e("Babel_SMS", "MmsDownloader: Parsing retrieved PDU failure", runtimeexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private dtt a(Context context, String s)
    {
        Object obj;
        long l2;
        if (a)
        {
            obj = String.valueOf(s);
            Uri uri;
            String s2;
            String s3;
            long l;
            long l1;
            long l3;
            if (((String) (obj)).length() != 0)
            {
                obj = "MmsDownloader.downloadMessage: ".concat(((String) (obj)));
            } else
            {
                obj = new String("MmsDownloader.downloadMessage: ");
            }
            eev.b("Babel_SMS", ((String) (obj)));
        }
        uri = MmsFileProvider.a(context);
        obj = new dtt(uri);
        l2 = b.getAndIncrement();
        if (a)
        {
            s2 = String.valueOf("MmsDownloader: downloading MMS. contentLocation=");
            s3 = String.valueOf(uri);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s2).length() + 47 + String.valueOf(s).length() + String.valueOf(s3).length())).append(s2).append(s).append(" destinationUri=").append(s3).append(" requestId=").append(l2).toString());
        }
        obj;
        JVM INSTR monitorenter ;
        e.put(Long.valueOf(l2), obj);
        a(context, s, uri, new Intent("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_DOWNLOADED", ContentUris.withAppendedId(c, l2), context, com/google/android/apps/hangouts/sms/SendStatusReceiver));
        l1 = ((amo)hlp.a(context, amo)).a("babel_mms_network_acquire_timeout_in_millis", 0x2bf20L);
        l3 = SystemClock.elapsedRealtime();
        l = l1;
_L3:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        obj.wait(l);
_L1:
        if (((dtt) (obj)).b)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        l = SystemClock.elapsedRealtime();
        l = l1 - (l - l3);
        continue; /* Loop/switch isn't completed */
        context;
        eev.g("Babel_SMS", "MmsDownloader: sending wait interrupted");
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        e.remove(Long.valueOf(l2));
        if (a)
        {
            context = String.valueOf("MmsDownloader: download completed. contentLocation=");
            String s1 = String.valueOf(obj);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 8 + String.valueOf(s).length() + String.valueOf(s1).length())).append(context).append(s).append(" result=").append(s1).toString());
        }
        obj;
        JVM INSTR monitorexit ;
        return ((dtt) (obj));
        if (true) goto _L3; else goto _L2
_L2:
    }

    public acx a(Context context, byte abyte0[], String s)
    {
        Object obj;
        if (a)
        {
            obj = String.valueOf(s);
            String s1;
            if (((String) (obj)).length() != 0)
            {
                obj = "MmsDownloader.retrieveMmsPdu: ".concat(((String) (obj)));
            } else
            {
                obj = new String("MmsDownloader.retrieveMmsPdu: ");
            }
            eev.b("Babel_SMS", ((String) (obj)));
        }
        g.w();
        obj = a(context, s);
        if (a)
        {
            s1 = String.valueOf(obj);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 35)).append("MmsDownloader: downloadMms result: ").append(s1).toString());
        }
        if (!((dtt) (obj)).b)
        {
            eev.f("Babel_SMS", "MmsDownloader: timed out waiting for MMS download");
            throw new dub("Timeout waiting for MMS download");
        }
        switch (((dtt) (obj)).a())
        {
        case 0: // '\0'
        default:
            obj = a(((dtt) (obj)).a, s, context);
            int i;
            if (obj == null)
            {
                eev.g("Babel_SMS", "MmsDownloader: empty bytes received");
                throw new dtu(137, "MmsDownloader got empty or invalid response");
            } else
            {
                ((dtz)hlp.a(context, dtz)).a(context, abyte0, s);
                return ((acx) (obj));
            }

        case 1: // '\001'
            i = ((dtt) (obj)).c;
            eev.f("Babel_SMS", (new StringBuilder(61)).append("MmsDownloader: temporary failure with status code ").append(i).toString());
            throw new dub("Temporary failure downloading MMS");

        case 2: // '\002'
            i = ((dtt) (obj)).c;
            eev.g("Babel_SMS", (new StringBuilder(61)).append("MmsDownloader: permanent failure with status code ").append(i).toString());
            throw new dtu();
        }
    }

    acx a(Uri uri, String s, Context context)
    {
        File file = MmsFileProvider.a(uri, context);
        String s3 = file.getAbsolutePath();
        uri = new File(s3);
        try
        {
            uri = g.a(g.a(uri, false));
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri = String.valueOf(s3);
            if (uri.length() != 0)
            {
                uri = "MmsDownloader: error reading bytes from file ".concat(uri);
            } else
            {
                uri = new String("MmsDownloader: error reading bytes from file ");
            }
            eev.g("Babel_SMS", uri);
            uri = null;
        }
        if (file.exists())
        {
            file.delete();
            if (a)
            {
                String s1 = String.valueOf(s3);
                int i;
                if (s1.length() != 0)
                {
                    s1 = "MmsDownloader: Deleted temp file with downloaded MMS pdu: ".concat(s1);
                } else
                {
                    s1 = new String("MmsDownloader: Deleted temp file with downloaded MMS pdu: ");
                }
                eev.b("Babel_SMS", s1);
            }
        }
        if (uri != null && uri.length > 0)
        {
            if (a)
            {
                s1 = String.valueOf("MmsDownloader: retrieved MMS data from file. contentLocation=");
                i = uri.length;
                eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 31 + String.valueOf(s).length() + String.valueOf(s3).length())).append(s1).append(s).append(" filePath=").append(s3).append(" numBytes=").append(i).toString());
            }
            return a(((byte []) (uri)), context);
        } else
        {
            context = String.valueOf("MmsDownloader: Read 0 bytes from MMS destination file. contentLocation=");
            String s2 = String.valueOf(file.getPath());
            int j = uri.length;
            eev.f("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 31 + String.valueOf(s).length() + String.valueOf(s2).length())).append(context).append(s).append(" fileName=").append(s2).append(" numBytes=").append(j).toString());
            return null;
        }
    }

    public void a(long l, int i, int j)
    {
        if (i == -1) goto _L2; else goto _L1
_L1:
        String s = String.valueOf("MmsDownloader: failure in downloading mms.  requestId=");
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 70)).append(s).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
_L7:
        if (l < 0L) goto _L4; else goto _L3
_L3:
        Object obj = (dtt)e.get(Long.valueOf(l));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj;
        JVM INSTR monitorenter ;
        ((dtt) (obj)).a(i, j);
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        if (a)
        {
            obj = String.valueOf("MmsDownloader: received result.  requestId=");
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 70)).append(((String) (obj))).append(l).append(" resultCode=").append(i).append(" httpStatusCode=").append(j).toString());
        }
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(Context context, String s, Uri uri, Intent intent)
    {
        intent = PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
        d.downloadMultimediaMessage(context, s, uri, dtp.y(), intent);
    }

    static 
    {
        hnc hnc = eev.r;
    }
}
