// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.SortedSet;

final class jre extends jqz
    implements SortedSet
{

    final jqq a;

    jre(jqq jqq, Object obj, SortedSet sortedset, jqz jqz1)
    {
        a = jqq;
        super(jqq, obj, sortedset, jqz1);
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
        jqq jqq = a;
        Object obj1 = c();
        SortedSet sortedset = ((SortedSet)e()).headSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jre(jqq, obj1, sortedset, ((jqz) (obj)));
    }

    public Object last()
    {
        a();
        return ((SortedSet)e()).last();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        a();
        jqq jqq = a;
        Object obj2 = c();
        obj1 = ((SortedSet)e()).subSet(obj, obj1);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jre(jqq, obj2, ((SortedSet) (obj1)), ((jqz) (obj)));
    }

    public SortedSet tailSet(Object obj)
    {
        a();
        jqq jqq = a;
        Object obj1 = c();
        SortedSet sortedset = ((SortedSet)e()).tailSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new jre(jqq, obj1, sortedset, ((jqz) (obj)));
    }
}
