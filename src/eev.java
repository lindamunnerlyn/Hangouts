// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class eev
{

    private static volatile boolean A;
    private static final Map B;
    private static final Pattern C;
    public static final hnc a = d("audioplayer");
    public static final hnc b = d("callerid");
    public static final hnc c = d("clearcut");
    public static final hnc d = d("content");
    public static final hnc e = d("fragment");
    public static final hnc f = d("hangout");
    public static final hnc g = d("latencytracker");
    public static final hnc h = d("network");
    public static final hnc i = d("networkqueue");
    public static final hnc j = d("phone");
    public static final hnc k = d("protocol");
    public static final hnc l = d("pstn");
    public static final hnc m = d("pstn_meta");
    public static final hnc n = d("realtimechat");
    public static final hnc o = d("requestwriter");
    public static final hnc p = d("service");
    public static final hnc q = d("setting");
    public static final hnc r = d("sms");
    public static final hnc s = d("telephony");
    public static final hnc t = d("uploader");
    public static final hnc u = d("util");
    public static final hnc v = d("cve");
    public static final hnc w = d("view");
    public static final hnb x = new hnb("pii", true);
    public static final hnc y = d("tracing");
    public static gnh z;

    public static String a(Throwable throwable)
    {
        StringBuffer stringbuffer = new StringBuffer();
        throwable = Log.getStackTraceString(throwable);
        for (throwable = C.matcher(throwable); throwable.find(); throwable.appendReplacement(stringbuffer, (String)B.get(throwable.group(1)))) { }
        throwable.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    public static void a()
    {
        int i1 = 2;
        boolean flag = g.a(g.nU, "babel_log_dump", false);
        A = flag;
        gnh gnh1;
        if (flag && z == null)
        {
            z = new gnh();
        } else
        if (!A && z != null)
        {
            z = null;
        }
        gnh1 = z;
        if (!Log.isLoggable("vclib", 2))
        {
            if (Log.isLoggable("vclib", 3))
            {
                i1 = 3;
            } else
            if (Log.isLoggable("vclib", 4))
            {
                i1 = 4;
            } else
            if (Log.isLoggable("vclib", 5))
            {
                i1 = 5;
            } else
            {
                i1 = 6;
            }
        }
        gne.b = i1;
        gne.a = gnh1;
    }

    public static void a(PrintWriter printwriter)
    {
        gnh gnh1 = z;
        if (gnh1 != null)
        {
            gnh1.a(printwriter);
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
            gic.b(s2);
        }
        gnh gnh1 = z;
        if (gnh1 != null && i1 >= 3)
        {
            gnh1.a(i1, s1, s2);
        }
    }

    public static boolean a(String s1)
    {
        return Log.isLoggable(s1, 3);
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

    private static hnc d(String s1)
    {
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "debug.chat.".concat(s1);
        } else
        {
            s1 = new String("debug.chat.");
        }
        return new hnc(s1);
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

    static 
    {
        B = jso.a("\t", "", "\n", " ==> ", "com.google.android.apps.hangouts", "", ".java", "");
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = B.keySet().iterator(); iterator.hasNext(); arraylist.add(Pattern.quote((String)iterator.next()))) { }
        C = Pattern.compile(String.format("(%s)", new Object[] {
            jno.a("|").a(arraylist)
        }));
    }
}
