// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class djk
{

    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final long d;
    public static final long e;
    public static final boolean f;
    public static final String g = null;
    public static final String h = null;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;

    static 
    {
        d = TimeUnit.HOURS.toMillis(1L);
        e = TimeUnit.HOURS.toMillis(1L);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        i = TimeUnit.DAYS.toMillis(1L);
        j = TimeUnit.MINUTES.toMillis(1L);
        k = TimeUnit.HOURS.toMillis(1L);
        l = TimeUnit.MINUTES.toMillis(1L);
        m = TimeUnit.MINUTES.toMillis(4L);
        n = TimeUnit.MINUTES.toMillis(5L);
        o = TimeUnit.SECONDS.toMillis(30L);
        p = TimeUnit.HOURS.toMillis(24L);
        q = TimeUnit.MINUTES.toMillis(10L);
        r = TimeUnit.MINUTES.toMillis(50L);
        s = TimeUnit.HOURS.toMillis(23L);
        t = TimeUnit.SECONDS.toMillis(10L);
    }
}
