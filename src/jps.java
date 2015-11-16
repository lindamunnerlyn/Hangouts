// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public class jps extends jor
{

    final Object g;
    final int h;
    final com.google.common.cache.LocalCache.ReferenceEntry i;
    volatile jpw j;

    jps(Object obj, int k, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        j = LocalCache.i();
        g = obj;
        h = k;
        i = referenceentry;
    }

    public int getHash()
    {
        return h;
    }

    public Object getKey()
    {
        return g;
    }

    public com.google.common.cache.LocalCache.ReferenceEntry getNext()
    {
        return i;
    }

    public jpw getValueReference()
    {
        return j;
    }

    public void setValueReference(jpw jpw)
    {
        j = jpw;
    }
}
