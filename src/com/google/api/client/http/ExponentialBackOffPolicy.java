// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import hsi;
import hsj;

// Referenced classes of package com.google.api.client.http:
//            BackOffPolicy

public class ExponentialBackOffPolicy
    implements BackOffPolicy
{

    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 0xdbba0;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5D;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5D;
    private final hsi exponentialBackOff;

    public ExponentialBackOffPolicy()
    {
        this(new Builder());
    }

    protected ExponentialBackOffPolicy(Builder builder1)
    {
        exponentialBackOff = builder1.exponentialBackOffBuilder.a();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public final int getCurrentIntervalMillis()
    {
        return exponentialBackOff.c;
    }

    public final long getElapsedTimeMillis()
    {
        return exponentialBackOff.c();
    }

    public final int getInitialIntervalMillis()
    {
        return exponentialBackOff.d;
    }

    public final int getMaxElapsedTimeMillis()
    {
        return exponentialBackOff.i;
    }

    public final int getMaxIntervalMillis()
    {
        return exponentialBackOff.g;
    }

    public final double getMultiplier()
    {
        return exponentialBackOff.f;
    }

    public long getNextBackOffMillis()
    {
        return exponentialBackOff.a();
    }

    public final double getRandomizationFactor()
    {
        return exponentialBackOff.e;
    }

    public boolean isBackOffRequired(int i)
    {
        switch (i)
        {
        case 501: 
        case 502: 
        default:
            return false;

        case 500: 
        case 503: 
            return true;
        }
    }

    public final void reset()
    {
        exponentialBackOff.b();
    }

    private class Builder
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

        public Builder setInitialIntervalMillis(int i)
        {
            exponentialBackOffBuilder.a(i);
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i)
        {
            exponentialBackOffBuilder.c(i);
            return this;
        }

        public Builder setMaxIntervalMillis(int i)
        {
            exponentialBackOffBuilder.b(i);
            return this;
        }

        public Builder setMultiplier(double d)
        {
            exponentialBackOffBuilder.b(d);
            return this;
        }

        public Builder setNanoClock(hsu hsu)
        {
            exponentialBackOffBuilder.a(hsu);
            return this;
        }

        public Builder setRandomizationFactor(double d)
        {
            exponentialBackOffBuilder.a(d);
            return this;
        }

        protected Builder()
        {
        }
    }

}
