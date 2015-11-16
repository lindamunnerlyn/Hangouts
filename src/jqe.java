// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class jqe extends jmn
{

    private final transient jlk c;

    jqe(jlk jlk1, Comparator comparator)
    {
        super(comparator);
        c = jlk1;
        boolean flag;
        if (!jlk1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
    }

    private jmn a(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i < j)
        {
            return new jqe(c.a(i, j), a);
        } else
        {
            return a(a);
        }
    }

    private int e(Object obj, boolean flag)
    {
        jlk jlk1 = c;
        Object obj1 = n.b(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = jqr.d;
        } else
        {
            obj = jqr.c;
        }
        return g.a(jlk1, obj1, comparator, ((jqr) (obj)), jqn.b);
    }

    private int f(Object obj, boolean flag)
    {
        jlk jlk1 = c;
        Object obj1 = n.b(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = jqr.c;
        } else
        {
            obj = jqr.d;
        }
        return g.a(jlk1, obj1, comparator, ((jqr) (obj)), jqn.b);
    }

    int a(Object obj)
    {
        if (obj != null)
        {
            int i;
            try
            {
                i = g.a(c, obj, a, jqr.a, jqn.c);
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
        return c.a(aobj, i);
    }

    jmn a(Object obj, boolean flag)
    {
        return a(0, e(obj, flag));
    }

    jmn a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag).a(obj1, flag1);
    }

    public jqy a()
    {
        return c.a();
    }

    jmn b(Object obj, boolean flag)
    {
        return a(f(obj, flag), size());
    }

    public jqy c()
    {
        return c.h().a();
    }

    public Object ceiling(Object obj)
    {
        int i = f(obj, true);
        if (i == size())
        {
            return null;
        } else
        {
            return c.get(i);
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
                i = Collections.binarySearch(c, obj, a);
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
        if (collection instanceof jpm)
        {
            obj = ((jpm)collection).a();
        }
        if (g.a(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        jpq jpq1;
        jpq1 = jmr.d(a());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int i;
        if (!jpq1.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i = b(jpq1.a(), collection);
        if (i < 0)
        {
            try
            {
                jpq1.next();
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

    jmn d()
    {
        return new jqe(c.h(), jpp.a(a).a());
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    boolean e()
    {
        return c.e();
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
        if (!g.a(a, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((Set) (obj)).iterator();
        jqy jqy = a();
_L5:
        if (!jqy.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = jqy.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        try
        {
            i = b(obj1, obj2);
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
        if (i == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    jlk f()
    {
        return new jmm(this, c);
    }

    public Object first()
    {
        return c.get(0);
    }

    public Object floor(Object obj)
    {
        int i = e(obj, true) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return c.get(i);
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
            return c.get(i);
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return c.get(size() - 1);
    }

    public Object lower(Object obj)
    {
        int i = e(obj, false) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return c.get(i);
        }
    }

    public int size()
    {
        return c.size();
    }
}
