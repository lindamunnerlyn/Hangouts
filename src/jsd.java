// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class jsd extends AbstractCollection
    implements Serializable
{

    private transient jsh a;

    jsd()
    {
    }

    int a(Object aobj[], int i)
    {
        for (jyh jyh1 = a(); jyh1.hasNext();)
        {
            aobj[i] = jyh1.next();
            i++;
        }

        return i;
    }

    public abstract jyh a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    abstract boolean e();

    public jsh f()
    {
        jsh jsh2 = a;
        jsh jsh1 = jsh2;
        if (jsh2 == null)
        {
            jsh1 = g();
            a = jsh1;
        }
        return jsh1;
    }

    jsh g()
    {
        switch (size())
        {
        default:
            return new jxd(this, toArray());

        case 0: // '\0'
            return jxj.a;

        case 1: // '\001'
            return jsh.a(a().next());
        }
    }

    public Iterator iterator()
    {
        return a();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        int i = size();
        if (i == 0)
        {
            return jxa.a;
        } else
        {
            Object aobj[] = new Object[i];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        n.b(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
_L4:
        a(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Object writeReplace()
    {
        return new jsl(toArray());
    }
}
