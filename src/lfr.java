// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;

public final class lfr
{

    private final LinkedHashMap a = new LinkedHashMap(g.q(1));

    lfr(int i)
    {
    }

    public lfq a()
    {
        return new lfq(a);
    }

    public lfr a(Object obj, joj joj)
    {
        if (joj == null)
        {
            throw new NullPointerException("The provider of the value is null");
        } else
        {
            a.put(obj, joj);
            return this;
        }
    }
}
