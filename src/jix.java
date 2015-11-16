// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;

public class jix
    implements jja
{

    final Object a;

    jix(Object obj)
    {
        a = obj;
    }

    public int a()
    {
        return 1;
    }

    public jja a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return this;
    }

    public void a(Object obj)
    {
    }

    public com.google.common.cache.LocalCache.ReferenceEntry b()
    {
        return null;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }

    public Object get()
    {
        return a;
    }
}
