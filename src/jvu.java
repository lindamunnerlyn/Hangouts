// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public final class jvu extends jvd
{

    final MapMakerInternalMap a;

    jvu(MapMakerInternalMap mapmakerinternalmap)
    {
        a = mapmakerinternalmap;
        super(mapmakerinternalmap);
    }

    public Object next()
    {
        return c().getValue();
    }
}
