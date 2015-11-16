// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class klv
{

    private static volatile boolean a = false;
    private static final klv c = new klv((byte)0);
    private final Map b;

    klv()
    {
        b = new HashMap();
    }

    private klv(byte byte0)
    {
        b = Collections.emptyMap();
    }

    public static klv a()
    {
        return c;
    }

    public kmi a(kmy kmy, int i)
    {
        return (kmi)b.get(new klw(kmy, i));
    }

}
