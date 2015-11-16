// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

final class jqy extends jqu
    implements SortedSet
{

    final jqq b;

    jqy(jqq jqq, SortedMap sortedmap)
    {
        b = jqq;
        super(jqq, sortedmap);
    }

    public Comparator comparator()
    {
        return ((SortedMap)super.a()).comparator();
    }

    public Object first()
    {
        return ((SortedMap)super.a()).firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        return new jqy(b, ((SortedMap)super.a()).headMap(obj));
    }

    public Object last()
    {
        return ((SortedMap)super.a()).lastKey();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new jqy(b, ((SortedMap)super.a()).subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new jqy(b, ((SortedMap)super.a()).tailMap(obj));
    }
}
