// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class jxm extends jto
{

    static final jxm c;
    private final transient jsh d;

    jxm(jsh jsh1, Comparator comparator)
    {
        super(comparator);
        d = jsh1;
    }

    private jxm a(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i < j)
        {
            return new jxm(d.a(i, j), a);
        } else
        {
            return a(a);
        }
    }

    private int e(Object obj, boolean flag)
    {
        jsh jsh1 = d;
        Object obj1 = n.b(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = jxz.d;
        } else
        {
            obj = jxz.c;
        }
        return g.a(jsh1, obj1, comparator, ((jxz) (obj)), jxv.b);
    }

    private int f(Object obj, boolean flag)
    {
        jsh jsh1 = d;
        Object obj1 = n.b(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = jxz.c;
        } else
        {
            obj = jxz.d;
        }
        return g.a(jsh1, obj1, comparator, ((jxz) (obj)), jxv.b);
    }

    int a(Object obj)
    {
        if (obj != null)
        {
            int i;
            try
            {
                i = g.a(d, obj, a, jxz.a, jxv.c);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1;
            }
            if (i >= 0)
            {
                return i;
            }
        }
        return -1;
    }

    int a(Object aobj[], int i)
    {
        return d.a(aobj, i);
    }

    jto a(Object obj, boolean flag)
    {
        return a(0, e(obj, flag));
    }

    jto a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag).a(obj1, flag1);
    }

    public jyh a()
    {
        return d.a();
    }

    jto b(Object obj, boolean flag)
    {
        return a(f(obj, flag), size());
    }

    public jyh c()
    {
        return d.d().a();
    }

    public Object ceiling(Object obj)
    {
        int i = f(obj, true);
        if (i == size())
        {
            return null;
        } else
        {
            return d.get(i);
        }
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            int i;
            try
            {
                i = Collections.binarySearch(d, obj, a);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (i >= 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean containsAll(Collection collection)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = collection;
        if (collection instanceof jww)
        {
            obj = ((jww)collection).a();
        }
        if (g.a(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        jxc jxc1;
        jxc1 = jts.c(a());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int i;
        if (!jxc1.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i = a(jxc1.a(), collection);
        if (i < 0)
        {
            try
            {
                jxc1.next();
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (((Iterator) (obj)).next()));
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        if (i <= 0) goto _L4; else goto _L5
_L5:
        return false;
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    jto d()
    {
        jxb jxb1 = jxb.a(a).c();
        if (isEmpty())
        {
            return a(jxb1);
        } else
        {
            return new jxm(d.d(), jxb1);
        }
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    boolean e()
    {
        return d.e();
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            return false;
        }
        obj = (Set)obj;
        if (size() != ((Set) (obj)).size())
        {
            return false;
        }
        if (isEmpty()) goto _L1; else goto _L3
_L3:
        if (!g.a(a, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj = ((Set) (obj)).iterator();
        jyh jyh = a();
_L6:
        if (!jyh.hasNext()) goto _L1; else goto _L4
_L4:
        Object obj1;
        Object obj2;
        obj1 = jyh.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        try
        {
            i = a(obj1, obj2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        return false;
        return containsAll(((Collection) (obj)));
    }

    public Object first()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return d.get(0);
        }
    }

    public Object floor(Object obj)
    {
        int i = e(obj, true) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return d.get(i);
        }
    }

    jsh g()
    {
        if (size() <= 1)
        {
            return d;
        } else
        {
            return new jtn(this, d);
        }
    }

    public Object higher(Object obj)
    {
        int i = f(obj, false);
        if (i == size())
        {
            return null;
        } else
        {
            return d.get(i);
        }
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return d.get(size() - 1);
        }
    }

    public Object lower(Object obj)
    {
        int i = e(obj, false) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return d.get(i);
        }
    }

    public int size()
    {
        return d.size();
    }

    static 
    {
        c = new jxm(jxj.a, jwx.a);
    }
}
