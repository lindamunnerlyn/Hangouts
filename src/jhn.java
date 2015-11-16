// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class jhn
{

    private final jhp a;
    private boolean b;
    private long c;
    private long d;

    public jhn()
    {
        this(jhp.b());
    }

    private jhn(jhp jhp1)
    {
        a = (jhp)n.b(jhp1, "ticker");
    }

    private long b()
    {
        if (b)
        {
            return (a.a() - d) + c;
        } else
        {
            return c;
        }
    }

    public long a(TimeUnit timeunit)
    {
        return timeunit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public jhn a()
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "This stopwatch is already running.");
        b = true;
        d = a.a();
        return this;
    }

    public String toString()
    {
        double d1;
        long l = b();
        TimeUnit timeunit;
        if (TimeUnit.DAYS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.DAYS;
        } else
        if (TimeUnit.HOURS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.HOURS;
        } else
        if (TimeUnit.MINUTES.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.MINUTES;
        } else
        if (TimeUnit.SECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.SECONDS;
        } else
        if (TimeUnit.MILLISECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.MILLISECONDS;
        } else
        if (TimeUnit.MICROSECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.MICROSECONDS;
        } else
        {
            timeunit = TimeUnit.NANOSECONDS;
        }
        d1 = (double)l / (double)TimeUnit.NANOSECONDS.convert(1L, timeunit);
        jho.a[timeunit.ordinal()];
        JVM INSTR tableswitch 1 7: default 92
    //                   1 222
    //                   2 246
    //                   3 252
    //                   4 258
    //                   5 264
    //                   6 270
    //                   7 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new AssertionError();
_L2:
        String s = "ns";
_L10:
        return String.format("%.4g %s", new Object[] {
            Double.valueOf(d1), s
        });
_L3:
        s = "\u03BCs";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ms";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "s";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "min";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "h";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "d";
        if (true) goto _L10; else goto _L9
_L9:
    }
}
