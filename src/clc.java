// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;

public final class clc
{

    public final long a = System.currentTimeMillis();
    private final String b;
    private final StackTraceElement c[] = (new Exception()).getStackTrace();

    public clc(String s)
    {
        b = s;
    }

    public void a(int i, PrintWriter printwriter, long l)
    {
        long l1 = 0L;
        if (l != 0L)
        {
            l = a - l;
            l1 = l / 1000L;
            l %= 1000L;
        } else
        {
            long l2 = 0L;
            l = l1;
            l1 = l2;
        }
        printwriter.write(String.format("@ %d; time %d [+%d.%03d] %s\n", new Object[] {
            Integer.valueOf(i), Long.valueOf(a), Long.valueOf(l1), Long.valueOf(l), b
        }));
        for (i = 2; i < c.length; i++)
        {
            String s = String.valueOf(c[i].toString());
            printwriter.write((new StringBuilder(String.valueOf(s).length() + 5)).append("    ").append(s).append("\n").toString());
        }

        printwriter.write("\n");
    }
}
