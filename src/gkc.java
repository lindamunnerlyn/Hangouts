// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class gkc
{

    private static gkf a;
    private static int b = d();

    public static int a()
    {
        return b;
    }

    public static int a(gkf gkf1)
    {
        b = d();
        a = gkf1;
        return b;
    }

    private static void a(int i, String s, String s1)
    {
        if (i >= b)
        {
            Log.println(i, s, s1);
        }
        gkf gkf1 = a;
        if (gkf1 != null && i >= 3)
        {
            gkf1.a(i, s, s1);
        }
    }

    private static void a(int i, String s, String s1, Throwable throwable)
    {
        if (a(i))
        {
            String s2 = String.valueOf(throwable.toString());
            throwable = String.valueOf(Log.getStackTraceString(throwable));
            a(i, s, (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s2).length() + String.valueOf(throwable).length())).append(s1).append("\n").append(s2).append("\n").append(throwable).toString());
        }
    }

    private static transient void a(int i, String s, String s1, Object aobj[])
    {
        if (a(i))
        {
            a(i, s, String.format(s1, aobj));
        }
    }

    public static void a(String s, String s1)
    {
        a(2, s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        a(5, s, s1, throwable);
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        a(2, s, s1, aobj);
    }

    public static boolean a(int i)
    {
        return i >= b || a != null && i >= 3;
    }

    public static boolean a(String s)
    {
        return Log.isLoggable(s, 3);
    }

    public static String b(String s)
    {
        if (a(3))
        {
            return s;
        }
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        return (new StringBuilder(20)).append("Redacted-").append(i).toString();
    }

    public static void b(String s, String s1)
    {
        a(3, s, s1);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        a(6, s, s1, throwable);
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        a(3, s, s1, aobj);
    }

    public static boolean b()
    {
        return 2 >= b;
    }

    public static void c(String s, String s1)
    {
        a(4, s, s1);
    }

    public static void c(String s, String s1, Throwable throwable)
    {
        b(s, s1, throwable);
        Log.wtf(s, s1, throwable);
        if (b())
        {
            throw new AssertionError(s1);
        } else
        {
            return;
        }
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        a(4, s, String.format(s1, aobj));
    }

    public static boolean c()
    {
        return a(3);
    }

    private static int d()
    {
        if (Log.isLoggable("vclib", 2))
        {
            return 2;
        }
        if (Log.isLoggable("vclib", 3))
        {
            return 3;
        }
        if (Log.isLoggable("vclib", 4))
        {
            return 4;
        }
        return !Log.isLoggable("vclib", 5) ? 6 : 5;
    }

    public static void d(String s, String s1)
    {
        a(5, s, s1);
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        a(5, s, String.format(s1, aobj));
    }

    public static void e(String s, String s1)
    {
        a(6, s, s1);
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        a(6, s, String.format(s1, aobj));
    }

    public static void f(String s, String s1)
    {
        a(6, s, s1);
        Log.wtf(s, s1);
        if (b())
        {
            throw new AssertionError(s1);
        } else
        {
            return;
        }
    }

}
