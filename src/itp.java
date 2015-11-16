// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class itp
{

    static final Map a = new HashMap();
    private static final AtomicInteger b = new AtomicInteger();

    static Runnable a(itc itc, Runnable runnable)
    {
        return new itq(itc, runnable);
    }

    public static Runnable a(Runnable runnable)
    {
        return a(its.b(), runnable);
    }

}
