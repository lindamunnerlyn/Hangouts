// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public abstract class jkt extends jku
    implements ConcurrentMap
{

    protected jkt()
    {
    }

    protected abstract ConcurrentMap a();

    protected Map b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        return a().putIfAbsent(obj, obj1);
    }

    public boolean remove(Object obj, Object obj1)
    {
        return a().remove(obj, obj1);
    }

    public Object replace(Object obj, Object obj1)
    {
        return a().replace(obj, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        return a().replace(obj, obj1, obj2);
    }
}
