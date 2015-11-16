// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.SortedSet;

final class jkh extends jkc
    implements SortedSet
{

    final jjt a;

    jkh(jjt jjt, Object obj, SortedSet sortedset, jkc jkc1)
    {
        a = jjt;
        super(jjt, obj, sortedset, jkc1);
    }

    public Comparator comparator()
    {
        return ((SortedSet)e()).comparator();
    }

    public Object first()
    {
        a();
        return ((SortedSet)e()).first();
    }

    public SortedSet headSet(Object obj)
    {
        a();
        jjt jjt = a;
        Object obj1 = c();
        SortedSet sortedset = ((SortedSet)e()).headSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jkh(jjt, obj1, sortedset, ((jkc) (obj)));
    }

    public Object last()
    {
        a();
        return ((SortedSet)e()).last();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        a();
        jjt jjt = a;
        Object obj2 = c();
        obj1 = ((SortedSet)e()).subSet(obj, obj1);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jkh(jjt, obj2, ((SortedSet) (obj1)), ((jkc) (obj)));
    }

    public SortedSet tailSet(Object obj)
    {
        a();
        jjt jjt = a;
        Object obj1 = c();
        SortedSet sortedset = ((SortedSet)e()).tailSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jkh(jjt, obj1, sortedset, ((jkc) (obj)));
    }
}
