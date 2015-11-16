// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class gne
{

    public static gnh a;
    public static int b;

    public static String a(String s)
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

    public static void a(int i, String s, String s1)
    {
        if (i >= b)
        {
            Log.println(i, s, s1);
        }
        gnh gnh1 = a;
        if (gnh1 != null && i >= 3)
        {
            gnh1.a(i, s, s1);
        }
    }

    public static void a(int i, String s, String s1, Throwable throwable)
    {
        if (a(i))
        {
            String s2 = String.valueOf(throwable.toString());
            throwable = String.valueOf(Log.getStackTraceString(throwable));
            a(i, s, (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s2).length() + String.valueOf(throwable).length())).append(s1).append("\n").append(s2).append("\n").append(throwable).toString());
        }
    }

    public static transient void a(int i, String s, String s1, Object aobj[])
    {
        if (a(i))
        {
            a(i, s, String.format(s1, aobj));
        }
    }

    public static void a(String s, String s1)
    {
        a(6, s, s1);
        Log.wtf(s, s1);
        if (a())
        {
            throw new AssertionError(s1);
        } else
        {
            return;
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        a(6, s, s1, throwable);
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        a(4, s, String.format(s1, aobj));
    }

    public static boolean a()
    {
        return 2 >= b;
    }

    public static boolean a(int i)
    {
        return i >= b || a != null && i >= 3;
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        a(s, s1, throwable);
        Log.wtf(s, s1, throwable);
        if (a())
        {
            throw new AssertionError(s1);
        } else
        {
            return;
        }
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        a(5, s, String.format(s1, aobj));
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        a(6, s, String.format(s1, aobj));
    }

    static 
    {
        int i = 2;
        if (!Log.isLoggable("vclib", 2))
        {
            if (Log.isLoggable("vclib", 3))
            {
                i = 3;
            } else
            if (Log.isLoggable("vclib", 4))
            {
                i = 4;
            } else
            if (Log.isLoggable("vclib", 5))
            {
                i = 5;
            } else
            {
                i = 6;
            }
        }
        b = i;
    }
}
