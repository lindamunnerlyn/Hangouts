// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

class jqz extends AbstractCollection
{

    final Object b;
    Collection c;
    final jqz d;
    final Collection e;
    final jqq f;

    jqz(jqq jqq1, Object obj, Collection collection, jqz jqz1)
    {
        f = jqq1;
        super();
        b = obj;
        c = collection;
        d = jqz1;
        if (jqz1 == null)
        {
            jqq1 = null;
        } else
        {
            jqq1 = jqz1.e();
        }
        e = jqq1;
    }

    void a()
    {
        if (d != null)
        {
            d.a();
            if (d.e() != e)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (c.isEmpty())
        {
            Collection collection = (Collection)f.a.get(b);
            if (collection != null)
            {
                c = collection;
            }
        }
    }

    public boolean add(Object obj)
    {
        a();
        boolean flag = c.isEmpty();
        boolean flag1 = c.add(obj);
        if (flag1)
        {
            jqq.b(f);
            if (flag)
            {
                d();
            }
        }
        return flag1;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = c.addAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                f.b = (j - i) + f.b;
                flag = flag1;
                if (i == 0)
                {
                    d();
                    return flag1;
                }
            }
        }
        return flag;
    }

    void b()
    {
        if (d != null)
        {
            d.b();
        } else
        if (c.isEmpty())
        {
            f.a.remove(b);
            return;
        }
    }

    Object c()
    {
        return b;
    }

    public void clear()
    {
        int i = size();
        if (i == 0)
        {
            return;
        } else
        {
            c.clear();
            f.b = f.b - i;
            b();
            return;
        }
    }

    public boolean contains(Object obj)
    {
        a();
        return c.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        a();
        return c.containsAll(collection);
    }

    void d()
    {
        if (d != null)
        {
            d.d();
            return;
        } else
        {
            f.a.put(b, c);
            return;
        }
    }

    Collection e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        } else
        {
            a();
            return c.equals(obj);
        }
    }

    jqz f()
    {
        return d;
    }

    public int hashCode()
    {
        a();
        return c.hashCode();
    }

    public Iterator iterator()
    {
        a();
        return new jra(this);
    }

    public boolean remove(Object obj)
    {
        a();
        boolean flag = c.remove(obj);
        if (flag)
        {
            jqq.a(f);
            b();
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = c.removeAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                f.b = (j - i) + f.b;
                b();
                return flag1;
            }
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        n.b(collection);
        int i = size();
        boolean flag = c.retainAll(collection);
        if (flag)
        {
            int j = c.size();
            f.b = (j - i) + f.b;
            b();
        }
        return flag;
    }

    public int size()
    {
        a();
        return c.size();
    }

    public String toString()
    {
        a();
        return c.toString();
    }
}
