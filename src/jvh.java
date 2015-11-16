// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractSet;
import java.util.ArrayList;

public abstract class jvh extends AbstractSet
{

    jvh()
    {
    }

    public Object[] toArray()
    {
        return MapMakerInternalMap.a(this).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return MapMakerInternalMap.a(this).toArray(aobj);
    }
}
