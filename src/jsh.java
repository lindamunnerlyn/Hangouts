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

public abstract class jsh extends jsd
    implements List, RandomAccess
{

    jsh()
    {
    }

    public static jsh a(Object obj)
    {
        return new jxs(obj);
    }

    public static jsh a(Collection collection)
    {
        if (collection instanceof jsd)
        {
            jsh jsh1 = ((jsd)collection).f();
            collection = jsh1;
            if (jsh1.e())
            {
                collection = ((Collection) (jsh1.toArray()));
                collection = b(collection, collection.length);
            }
            return collection;
        } else
        {
            collection = ((Collection) (collection.toArray()));
            collection = ((Collection) (jxa.b(collection, collection.length)));
            return b(collection, collection.length);
        }
    }

    public static jsh a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            aobj = (Object[])((Object []) (aobj)).clone();
            return new jxj(jxa.b(aobj, aobj.length));

        case 0: // '\0'
            return jxj.a;

        case 1: // '\001'
            return new jxs(aobj[0]);
        }
    }

    public static jsh b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = jxa.a(aobj, i);
            }
            return new jxj(aobj1);

        case 0: // '\0'
            return jxj.a;

        case 1: // '\001'
            return new jxs(aobj[0]);
        }
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

    public jsh a(int i, int j)
    {
        n.a(i, j, size());
        int k = j - i;
        if (k == size())
        {
            return this;
        }
        switch (k)
        {
        default:
            return b(i, j);

        case 0: // '\0'
            return jxj.a;

        case 1: // '\001'
            return a(get(i));
        }
    }

    public jyh a()
    {
        return c();
    }

    public jyi a(int i)
    {
        return new jsi(this, size(), i);
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    jsh b(int i, int j)
    {
        return new jsm(this, i, j - i);
    }

    public jyi c()
    {
        return a(0);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public jsh d()
    {
        if (size() <= 1)
        {
            return this;
        } else
        {
            return new jsk(this);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != n.b(this))
        {
            if (!(obj instanceof List))
            {
                return false;
            }
            obj = (List)obj;
            int j = size();
            if (j != ((List) (obj)).size())
            {
                return false;
            }
            if ((this instanceof RandomAccess) && (obj instanceof RandomAccess))
            {
                int i = 0;
                while (i < j) 
                {
                    if (!n.a(get(i), ((List) (obj)).get(i)))
                    {
                        return false;
                    }
                    i++;
                }
            } else
            {
                return jts.a(iterator(), ((List) (obj)).iterator());
            }
        }
        return true;
    }

    public final jsh f()
    {
        return this;
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
        int i;
        boolean flag;
        int j;
        i = 0;
        flag = false;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (!(this instanceof RandomAccess))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        j = size();
        if (obj != null) goto _L2; else goto _L1
_L1:
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            if (get(i) == null)
            {
                return i;
            }
        }

          goto _L3
_L4:
        i++;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.equals(get(i)))
        {
            return i;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
        ListIterator listiterator = listIterator();
        do
        {
            if (!listiterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_120;
            }
        } while (!n.a(obj, listiterator.next()));
        return listiterator.previousIndex();
        return -1;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(this instanceof RandomAccess)) goto _L4; else goto _L3
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        int i = size() - 1;
_L16:
        if (i < 0) goto _L8; else goto _L7
_L7:
        if (get(i) != null) goto _L10; else goto _L9
_L9:
        int k = i;
_L11:
        return k;
_L10:
        i--;
        continue; /* Loop/switch isn't completed */
_L6:
        int j = size() - 1;
        do
        {
            if (j < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = j;
            if (obj.equals(get(j)))
            {
                continue; /* Loop/switch isn't completed */
            }
            j--;
        } while (true);
        if (true) goto _L11; else goto _L8
_L8:
        return -1;
_L4:
        ListIterator listiterator = listIterator(size());
_L14:
        if (!listiterator.hasPrevious()) goto _L2; else goto _L12
_L12:
        if (!n.a(obj, listiterator.previous())) goto _L14; else goto _L13
_L13:
        return listiterator.nextIndex();
_L2:
        return -1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public ListIterator listIterator()
    {
        return c();
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
        return new jsl(toArray());
    }
}
