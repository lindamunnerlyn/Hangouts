// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.sms.SendStatusReceiver;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class dun
{

    public static final boolean a = false;
    private static ConcurrentHashMap b = new ConcurrentHashMap();
    private static final Random c = new Random();
    private static Boolean d = null;
    private static final Uri e = Uri.parse("content://babelsmssend");
    private static Method f = null;
    private static final Class g[];
    private static final Integer h = Integer.valueOf(0);
    private static final Boolean i = Boolean.valueOf(false);

    private static int a(Context context, String s, String s1, long l, String s2, boolean flag, long l1)
    {
        SmsManager smsmanager;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i1;
        gdv.b("Expected non-null", context);
        if (TextUtils.isEmpty(s))
        {
            throw new dui("SmsSender: empty destination address");
        }
        if (TextUtils.isEmpty(s1))
        {
            throw new dui("SmsSender: empty text message");
        }
        smsmanager = SmsManager.getDefault();
        if (dtp.a().k() != null && (adf.c(s) || dtp.a().a(s)))
        {
            s1 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(" ").append(s1).toString();
            s = dtp.a().k();
            s1 = smsmanager.divideMessage(s1);
        } else
        {
            s = PhoneNumberUtils.stripSeparators(s);
            s1 = smsmanager.divideMessage(s1);
        }
        i1 = s1.size();
        if (i1 <= 0)
        {
            throw new dui("SmsSender: fails to divide message");
        }
        arraylist = new ArrayList(i1);
        arraylist1 = new ArrayList(i1);
        int j = 0;
        while (j < i1) 
        {
            if (flag && j == i1 - 1)
            {
                arraylist.add(PendingIntent.getBroadcast(context, 0, a(context, "com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_DELIVERED", l1), 0));
            } else
            {
                arraylist.add(null);
            }
            arraylist1.add(PendingIntent.getBroadcast(context, 0, a(context, "com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_SENT", l), 0));
            j++;
        }
        if (d == null)
        {
            d = Boolean.valueOf(dtp.a().q());
        }
        flag = g.a(d, false);
        if (!g.a(g.nU, "babel_sms_use_samsung_galaxy_s2_hidden_api", false)) goto _L2; else goto _L1
_L1:
        if (a)
        {
            eev.b("Babel_SMS", "SmsSender: Samsung phone. Try the fix");
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        int k = 0;
_L6:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        context = new ArrayList();
        context.add(s1.get(k));
        ArrayList arraylist2 = new ArrayList();
        arraylist2.add(arraylist1.get(k));
        ArrayList arraylist3 = new ArrayList();
        arraylist3.add(arraylist.get(k));
        a(smsmanager, s, s2, ((ArrayList) (context)), arraylist2, arraylist3);
        k++;
        if (true) goto _L6; else goto _L5
_L4:
        a(smsmanager, s, s2, ((ArrayList) (s1)), arraylist1, arraylist);
_L5:
        return i1;
        context;
        try
        {
            eev.d("Babel_SMS", "SmsSender: failed Samsung Galaxy S2 SmsManager fix", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new dui("SmsSender: caught exception in sending", context);
        }
          goto _L2
_L12:
        if (k >= i1) goto _L8; else goto _L7
_L7:
        smsmanager.sendTextMessage(s, s2, (String)s1.get(k), (PendingIntent)arraylist1.get(k), (PendingIntent)arraylist.get(k));
        k++;
        continue; /* Loop/switch isn't completed */
_L10:
        smsmanager.sendMultipartTextMessage(s, s2, s1, arraylist1, arraylist);
_L8:
        return i1;
_L2:
        if (!flag) goto _L10; else goto _L9
_L9:
        k = 0;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static Intent a(Context context, String s, long l)
    {
        return new Intent(s, ContentUris.withAppendedId(e, l), context, com/google/android/apps/hangouts/sms/SendStatusReceiver);
    }

    public static duo a(Context context, String s, String s1, String s2, boolean flag, long l)
    {
        duo duo1;
        long l2;
        duo1 = new duo();
        l2 = Math.abs(c.nextLong());
        if (a)
        {
            String s3 = String.valueOf("SmsSender: sending message. dest=");
            String s4 = String.valueOf(eev.b(s));
            String s5 = String.valueOf(eev.b(s1));
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(s3).length() + 83 + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s2).length())).append(s3).append(s4).append(" message=").append(s5).append(" serviceCenter=").append(s2).append(" requireDeliveryReport=").append(flag).append(" requestId=").append(l2).toString());
        }
        duo1;
        JVM INSTR monitorenter ;
        long l1;
        long l3;
        b.put(Long.valueOf(l2), duo1);
        int j = a(context, s, s1, l2, s2, flag, l);
        if (a)
        {
            eev.b("Babel_SMS", (new StringBuilder(32)).append("Sending SMS in ").append(j).append(" parts").toString());
        }
        duo1.a(j);
        l1 = g.a(g.nU, "babel_sms_send_timeout_in_millis", 0x493e0L);
        l3 = System.currentTimeMillis();
        l = l1;
_L5:
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (a)
        {
            eev.b("Babel_SMS", (new StringBuilder(28)).append("Waiting ").append(l).toString());
        }
        duo1.wait(l);
_L3:
        if (duo1.a())
        {
            break MISSING_BLOCK_LABEL_497;
        }
        if (a)
        {
            eev.b("Babel_SMS", (new StringBuilder(59)).append("No more pending messages after waiting ").append(l).toString());
        }
_L2:
        b.remove(Long.valueOf(l2));
        if (a)
        {
            context = String.valueOf("SmsSender: sending completed. dest=");
            s = String.valueOf(eev.b(s));
            s1 = String.valueOf(eev.b(s1));
            s2 = String.valueOf(duo1);
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(context).length() + 17 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append(context).append(s).append(" message=").append(s1).append(" result=").append(s2).toString());
        }
        duo1;
        JVM INSTR monitorexit ;
        return duo1;
        context;
        eev.g("Babel_SMS", "SmsSender: sending wait interrupted");
          goto _L3
        context;
        duo1;
        JVM INSTR monitorexit ;
        throw context;
        l = System.currentTimeMillis();
        l = l1 - (l - l3);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(long l, int j)
    {
        if (j == -1) goto _L2; else goto _L1
_L1:
        String s = String.valueOf("SmsSender: failure in sending message part.  requestId=");
        eev.g("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 43)).append(s).append(l).append(" resultCode=").append(j).toString());
_L7:
        if (l < 0L) goto _L4; else goto _L3
_L3:
        Object obj = (duo)b.get(Long.valueOf(l));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj;
        JVM INSTR monitorenter ;
        ((duo) (obj)).b(j);
        if (!((duo) (obj)).a())
        {
            obj.notifyAll();
        }
        obj;
        JVM INSTR monitorexit ;
_L4:
        return;
_L2:
        if (a)
        {
            obj = String.valueOf("SmsSender: received sent result.  requestId=");
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 43)).append(((String) (obj))).append(l).append(" resultCode=").append(j).toString());
        }
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void a(SmsManager smsmanager, String s, String s1, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2)
    {
        if (f == null)
        {
            Method method = smsmanager.getClass().getMethod("sendMultipartTextMessage", g);
            f = method;
            if (method == null)
            {
                throw new NoSuchMethodException();
            }
        }
        f.invoke(smsmanager, new Object[] {
            s, s1, arraylist, arraylist1, arraylist2, i, h, h, h
        });
    }

    static 
    {
        hnc hnc = eev.r;
        g = (new Class[] {
            java/lang/String, java/lang/String, java/util/ArrayList, java/util/ArrayList, java/util/ArrayList, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE
        });
    }
}
