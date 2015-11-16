// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class jpi extends AbstractMap
{

    private transient Set a;
    private transient Set b;
    private transient Collection c;

    jpi()
    {
    }

    abstract Set a();

    Set b()
    {
        return new jpj(this);
    }

    Collection c()
    {
        return new jpk(this);
    }

    public Set entrySet()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = a();
            a = set;
        }
        return set;
    }

    public Set keySet()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = b();
            b = set;
        }
        return set;
    }

    public Collection values()
    {
        Collection collection1 = c;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = c();
            c = collection;
        }
        return collection;
    }
}
