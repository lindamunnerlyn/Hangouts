// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class jmn extends jmq
    implements NavigableSet, jqm
{

    private static final Comparator c;
    private static final jmn d;
    final transient Comparator a;
    transient jmn b;

    jmn(Comparator comparator1)
    {
        a = comparator1;
    }

    static jmn a(Comparator comparator1)
    {
        if (c.equals(comparator1))
        {
            return d;
        } else
        {
            return new jks(comparator1);
        }
    }

    static transient jmn a(Comparator comparator1, int i, Object aobj[])
    {
        if (i == 0)
        {
            return a(comparator1);
        }
        jpo.c(aobj, i);
        Arrays.sort(aobj, 0, i, comparator1);
        int k = 1;
        int j = 1;
        for (; k < i; k++)
        {
            Object obj = aobj[k];
            if (comparator1.compare(obj, aobj[j - 1]) != 0)
            {
                int l = j + 1;
                aobj[j] = obj;
                j = l;
            }
        }

        Arrays.fill(aobj, j, i, null);
        return new jqe(jlk.b(aobj, j), comparator1);
    }

    public static jmn a(Comparator comparator1, Collection collection)
    {
        n.b(comparator1);
        if (g.a(comparator1, collection) && (collection instanceof jmn))
        {
            jmn jmn1 = (jmn)collection;
            if (!jmn1.e())
            {
                return jmn1;
            }
        }
        collection = ((Collection) ((Object[])g.b(collection)));
        return a(comparator1, collection.length, ((Object []) (collection)));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public jmn G_()
    {
        jmn jmn2 = b;
        jmn jmn1 = jmn2;
        if (jmn2 == null)
        {
            jmn1 = d();
            b = jmn1;
            jmn1.b = this;
        }
        return jmn1;
    }

    abstract int a(Object obj);

    abstract jmn a(Object obj, boolean flag);

    abstract jmn a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract jqy a();

    int b(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    abstract jmn b(Object obj, boolean flag);

    public jmn b(Object obj, boolean flag, Object obj1, boolean flag1)
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

    public jmn c(Object obj)
    {
        return c(obj, false);
    }

    public jmn c(Object obj, Object obj1)
    {
        return b(obj, true, obj1, false);
    }

    public jmn c(Object obj, boolean flag)
    {
        return a(n.b(obj), flag);
    }

    public abstract jqy c();

    public Object ceiling(Object obj)
    {
        return g.c(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    jmn d()
    {
        return new jko(this);
    }

    public jmn d(Object obj)
    {
        return d(obj, true);
    }

    public jmn d(Object obj, boolean flag)
    {
        return b(n.b(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return G_();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return jmr.b(c(obj, true).c(), null);
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
        return g.c(d(obj, false));
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
        return jmr.b(c(obj, false).c(), null);
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
        return c(obj, obj1);
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
        return new jmp(a, toArray());
    }

    static 
    {
        c = jpp.b();
        d = new jks(c);
    }
}
