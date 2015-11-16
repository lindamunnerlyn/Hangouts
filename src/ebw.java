// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.PrintWriter;

public final class ebw
{

    private static volatile boolean A;
    public static final hik a = d("audioplayer");
    public static final hik b = d("callerid");
    public static final hik c = d("clearcut");
    public static final hik d = d("content");
    public static final hik e = d("fragment");
    public static final hik f = d("hangout");
    public static final hik g = d("latencytracker");
    public static final hik h = d("network");
    public static final hik i = d("networkqueue");
    public static final hik j = d("phone");
    public static final hik k = d("protocol");
    public static final hik l = d("pstn");
    public static final hik m = d("pstn_meta");
    public static final hik n = d("realtimechat");
    public static final hik o = d("requestwriter");
    public static final hik p = d("service");
    public static final hik q = d("setting");
    public static final hik r = d("sms");
    public static final hik s = d("telephony");
    public static final hik t = d("uploader");
    public static final hik u = d("util");
    public static final hik v = d("cve");
    public static final hik w = d("view");
    public static final hij x = new hij("pii", true);
    public static final hik y = d("tracing");
    public static gkf z;

    public static String a(Throwable throwable)
    {
        return Log.getStackTraceString(throwable).replace("\t", "").replace("\n", " ==> ").replace("com.google.android.apps.hangouts", "").replace(".java", "");
    }

    public static void a()
    {
        boolean flag;
        flag = g.a(g.nS, "babel_log_dump", false);
        A = flag;
        if (!flag || z != null) goto _L2; else goto _L1
_L1:
        z = new gkf();
_L4:
        gkc.a(z);
        return;
_L2:
        if (!A && z != null)
        {
            z = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(PrintWriter printwriter)
    {
        gkf gkf1 = z;
        if (gkf1 != null)
        {
            gkf1.a(printwriter);
        }
    }

    public static void a(String s1, String s2)
    {
        a(false, 2, s1, s2);
    }

    public static void a(String s1, String s2, Throwable throwable)
    {
        throwable = String.valueOf(Log.getStackTraceString(throwable));
        a(true, 2, s1, (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(throwable).length())).append(s2).append("\n").append(throwable).toString());
    }

    private static void a(boolean flag, int i1, String s1, String s2)
    {
        if (flag || i1 >= 4 || Log.isLoggable(s1, i1))
        {
            Log.println(i1, s1, s2);
        }
        if (i1 >= 4 && "Babel_telephony".equals(s1))
        {
            gfd.a(s2);
        }
        gkf gkf1 = z;
        if (gkf1 != null && i1 >= 3)
        {
            gkf1.a(i1, s1, s2);
        }
    }

    public static boolean a(String s1)
    {
        return gkc.a(s1);
    }

    public static boolean a(String s1, int i1)
    {
        boolean flag1 = false;
        if (i1 != 3) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (z != null)
        {
            flag = true;
        }
_L4:
        flag1 = flag;
        if (!flag)
        {
            flag1 = Log.isLoggable(s1, i1);
        }
        return flag1;
_L2:
        flag = flag1;
        if (i1 == 2)
        {
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(String s1)
    {
        if (Log.isLoggable("Babel", 3))
        {
            return s1;
        }
        int i1;
        if (s1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = s1.length();
        }
        return (new StringBuilder(20)).append("Redacted-").append(i1).toString();
    }

    public static void b(String s1, String s2)
    {
        a(true, 2, s1, s2);
    }

    public static void b(String s1, String s2, Throwable throwable)
    {
        throwable = String.valueOf(Log.getStackTraceString(throwable));
        a(false, 3, s1, (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(throwable).length())).append(s2).append("\n").append(throwable).toString());
    }

    public static boolean b()
    {
        return A;
    }

    public static String c(String s1)
    {
        String s2 = String.valueOf("Babel.");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s2.concat(s1);
        } else
        {
            return new String(s2);
        }
    }

    public static void c(String s1, String s2)
    {
        a(false, 3, s1, s2);
    }

    public static void c(String s1, String s2, Throwable throwable)
    {
        throwable = String.valueOf(Log.getStackTraceString(throwable));
        a(true, 4, s1, (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(throwable).length())).append(s2).append("\n").append(throwable).toString());
    }

    private static hik d(String s1)
    {
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "debug.chat.".concat(s1);
        } else
        {
            s1 = new String("debug.chat.");
        }
        return new hik(s1);
    }

    public static void d(String s1, String s2)
    {
        a(true, 3, s1, s2);
    }

    public static void d(String s1, String s2, Throwable throwable)
    {
        a(true, 5, s1, s2);
        a(true, 5, s1, Log.getStackTraceString(throwable));
    }

    public static void e(String s1, String s2)
    {
        a(true, 4, s1, s2);
    }

    public static void e(String s1, String s2, Throwable throwable)
    {
        a(true, 6, s1, s2);
        a(true, 6, s1, Log.getStackTraceString(throwable));
    }

    public static void f(String s1, String s2)
    {
        a(true, 5, s1, s2);
    }

    public static void g(String s1, String s2)
    {
        a(true, 6, s1, s2);
    }

}
