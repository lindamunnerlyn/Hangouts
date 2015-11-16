// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class kty
{

    private static volatile boolean a = false;
    private static final kty c = new kty((byte)0);
    private final Map b;

    kty()
    {
        b = new HashMap();
    }

    private kty(byte byte0)
    {
        b = Collections.emptyMap();
    }

    public static kty a()
    {
        return c;
    }

    public kul a(kvb kvb, int i)
    {
        return (kul)b.get(new ktz(kvb, i));
    }

}
