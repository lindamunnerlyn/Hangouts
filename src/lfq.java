// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class lfq
    implements joj
{

    private final Map a;

    lfq(LinkedHashMap linkedhashmap)
    {
        a = Collections.unmodifiableMap(linkedhashmap);
    }

    public static lfr b()
    {
        return new lfr(1);
    }

    public Object a()
    {
        return a;
    }
}
