// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class jqx extends jqr
    implements SortedMap
{

    SortedSet c;
    final jqq d;

    jqx(jqq jqq, SortedMap sortedmap)
    {
        d = jqq;
        super(jqq, sortedmap);
    }

    private SortedSet d()
    {
        return new jqy(d, (SortedMap)a);
    }

    Set b()
    {
        return d();
    }

    public Comparator comparator()
    {
        return ((SortedMap)a).comparator();
    }

    public Object firstKey()
    {
        return ((SortedMap)a).firstKey();
    }

    public SortedMap headMap(Object obj)
    {
        return new jqx(d, ((SortedMap)a).headMap(obj));
    }

    public Set keySet()
    {
        SortedSet sortedset1 = c;
        SortedSet sortedset = sortedset1;
        if (sortedset1 == null)
        {
            sortedset = d();
            c = sortedset;
        }
        return sortedset;
    }

    public Object lastKey()
    {
        return ((SortedMap)a).lastKey();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return new jqx(d, ((SortedMap)a).subMap(obj, obj1));
    }

    public SortedMap tailMap(Object obj)
    {
        return new jqx(d, ((SortedMap)a).tailMap(obj));
    }
}
