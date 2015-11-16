// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import hsj;
import hsu;

// Referenced classes of package com.google.api.client.http:
//            ExponentialBackOffPolicy

public class A
{

    final hsj exponentialBackOffBuilder = new hsj();

    public ExponentialBackOffPolicy build()
    {
        return new ExponentialBackOffPolicy(this);
    }

    public final int getInitialIntervalMillis()
    {
        return exponentialBackOffBuilder.a;
    }

    public final int getMaxElapsedTimeMillis()
    {
        return exponentialBackOffBuilder.e;
    }

    public final int getMaxIntervalMillis()
    {
        return exponentialBackOffBuilder.d;
    }

    public final double getMultiplier()
    {
        return exponentialBackOffBuilder.c;
    }

    public final hsu getNanoClock()
    {
        return exponentialBackOffBuilder.f;
    }

    public final double getRandomizationFactor()
    {
        return exponentialBackOffBuilder.b;
    }

    public exponentialBackOffBuilder setInitialIntervalMillis(int i)
    {
        exponentialBackOffBuilder.a(i);
        return this;
    }

    public exponentialBackOffBuilder setMaxElapsedTimeMillis(int i)
    {
        exponentialBackOffBuilder.c(i);
        return this;
    }

    public exponentialBackOffBuilder setMaxIntervalMillis(int i)
    {
        exponentialBackOffBuilder.b(i);
        return this;
    }

    public exponentialBackOffBuilder setMultiplier(double d)
    {
        exponentialBackOffBuilder.b(d);
        return this;
    }

    public exponentialBackOffBuilder setNanoClock(hsu hsu)
    {
        exponentialBackOffBuilder.a(hsu);
        return this;
    }

    public exponentialBackOffBuilder setRandomizationFactor(double d)
    {
        exponentialBackOffBuilder.a(d);
        return this;
    }

    protected A()
    {
    }
}
