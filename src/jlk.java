// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class jlk extends jle
    implements List, RandomAccess
{

    static final jlk a;

    jlk()
    {
    }

    public static jlk a(Object obj)
    {
        return new jqk(obj);
    }

    public static transient jlk a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9, Object obj10, Object obj11, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 12];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        aobj1[6] = obj6;
        aobj1[7] = obj7;
        aobj1[8] = obj8;
        aobj1[9] = obj9;
        aobj1[10] = obj10;
        aobj1[11] = obj11;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 12, aobj.length);
        obj = ((Object) (jpo.a(aobj1)));
        return b(((Object []) (obj)), obj.length);
    }

    public static jlk a(Collection collection)
    {
        if (collection instanceof jle)
        {
            jlk jlk1 = ((jle)collection).b();
            collection = jlk1;
            if (jlk1.e())
            {
                collection = ((Collection) (jlk1.toArray()));
                collection = b(collection, collection.length);
            }
            return collection;
        } else
        {
            collection = ((Collection) (jpo.a(collection.toArray())));
            return b(collection, collection.length);
        }
    }

    public static jlk a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new jpz(jpo.a((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new jqk(aobj[0]);
        }
    }

    static jlk b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = jpo.b(aobj, i);
            }
            return new jpz(aobj1);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new jqk(aobj[0]);
        }
    }

    public static jlk d()
    {
        return a;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int a(Object aobj[], int i)
    {
        int k = size();
        for (int j = 0; j < k; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + k;
    }

    public jlk a(int i, int j)
    {
        n.a(i, j, size());
        switch (j - i)
        {
        default:
            return b(i, j);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return a(get(i));
        }
    }

    public jqy a()
    {
        return g();
    }

    public jqz a(int i)
    {
        return new jll(this, size(), i);
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final jlk b()
    {
        return this;
    }

    jlk b(int i, int j)
    {
        return new jlp(this, i, j - i);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        return h.a(this, obj);
    }

    public jqz g()
    {
        return a(0);
    }

    public jlk h()
    {
        return new jln(this);
    }

    public int hashCode()
    {
        int j = 1;
        int k = size();
        for (int i = 0; i < k; i++)
        {
            j = ~~(j * 31 + get(i).hashCode());
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        } else
        {
            return h.b(this, obj);
        }
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        } else
        {
            return h.c(this, obj);
        }
    }

    public ListIterator listIterator()
    {
        return g();
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    Object writeReplace()
    {
        return new jlo(toArray());
    }

    static 
    {
        a = new jpz(jpo.a);
    }
}
