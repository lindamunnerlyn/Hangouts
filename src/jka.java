// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class jka extends jju
    implements SortedMap
{

    SortedSet c;
    final jjt d;

    jka(jjt jjt, SortedMap sortedmap)
    {
        d = jjt;
        super(jjt, sortedmap);
    }

    private SortedSet d()
    {
        return new jkb(d, (SortedMap)a);
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
        return new jka(d, ((SortedMap)a).headMap(obj));
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
        return new jka(d, ((SortedMap)a).subMap(obj, obj1));
    }

    public SortedMap tailMap(Object obj)
    {
        return new jka(d, ((SortedMap)a).tailMap(obj));
    }
}
