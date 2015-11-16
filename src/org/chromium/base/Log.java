// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.Locale;

public class Log
{

    private Log()
    {
    }

    private static String a()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        String s = org/chromium/base/Log.getName();
        int i = 0;
        do
        {
label0:
            {
                int j = i;
                if (i < astacktraceelement.length)
                {
                    if (!astacktraceelement[i].getClassName().equals(s))
                    {
                        break label0;
                    }
                    j = i + 4;
                }
                return (new StringBuilder()).append(astacktraceelement[j].getFileName()).append(":").append(astacktraceelement[j].getLineNumber()).toString();
            }
            i++;
        } while (true);
    }

    private static transient String a(String s, Object aobj[])
    {
        String s1 = s;
        if (aobj != null)
        {
            s1 = s;
            if (aobj.length != 0)
            {
                s1 = String.format(Locale.US, s, aobj);
            }
        }
        return s1;
    }

    public static void a(String s, String s1)
    {
        if (android.util.Log.isLoggable(s, 3))
        {
            (new StringBuilder("[")).append(a()).append("] ").append(a(s1, new Object[0]));
        }
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        if (android.util.Log.isLoggable(s, 5))
        {
            a(s1, aobj);
        }
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        String s2;
label0:
        {
            if (android.util.Log.isLoggable(s, 6))
            {
                s2 = a(s1, aobj);
                s1 = ((String) (aobj[0]));
                if (!(s1 instanceof Throwable))
                {
                    s1 = null;
                } else
                {
                    s1 = (Throwable)s1;
                }
                if (s1 == null)
                {
                    break label0;
                }
                android.util.Log.e(s, s2, s1);
            }
            return;
        }
        android.util.Log.e(s, s2);
    }
}
