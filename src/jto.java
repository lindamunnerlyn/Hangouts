// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class jto extends jtr
    implements NavigableSet, jxu
{

    final transient Comparator a;
    transient jto b;

    jto(Comparator comparator1)
    {
        a = comparator1;
    }

    static jxm a(Comparator comparator1)
    {
        if (jwx.a.equals(comparator1))
        {
            return jxm.c;
        } else
        {
            return new jxm(jxj.a, comparator1);
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract int a(Object obj);

    int a(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    abstract jto a(Object obj, boolean flag);

    abstract jto a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract jyh a();

    public jto b()
    {
        jto jto2 = b;
        jto jto1 = jto2;
        if (jto2 == null)
        {
            jto1 = d();
            b = jto1;
            jto1.b = this;
        }
        return jto1;
    }

    public jto b(Object obj, Object obj1)
    {
        return b(obj, true, obj1, false);
    }

    abstract jto b(Object obj, boolean flag);

    public jto b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        n.b(obj);
        n.b(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        n.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public jto c(Object obj)
    {
        return c(obj, false);
    }

    public jto c(Object obj, boolean flag)
    {
        return a(n.b(obj), flag);
    }

    public abstract jyh c();

    public Object ceiling(Object obj)
    {
        return g.a(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    jto d()
    {
        return new jrp(this);
    }

    public jto d(Object obj)
    {
        return d(obj, true);
    }

    public jto d(Object obj, boolean flag)
    {
        return b(n.b(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return b();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return jts.b(c(obj, true).c(), null);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return c(obj, flag);
    }

    public SortedSet headSet(Object obj)
    {
        return c(obj);
    }

    public Object higher(Object obj)
    {
        return g.a(d(obj, false));
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return c().next();
    }

    public Object lower(Object obj)
    {
        return jts.b(c(obj, false).c(), null);
    }

    public final Object pollFirst()
    {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast()
    {
        throw new UnsupportedOperationException();
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag, obj1, flag1);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return b(obj, obj1);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return d(obj, flag);
    }

    public SortedSet tailSet(Object obj)
    {
        return d(obj);
    }

    Object writeReplace()
    {
        return new jtq(a, toArray());
    }
}
