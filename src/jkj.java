// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class jkj
    implements jpl
{

    private transient Set a;
    private transient Map b;

    jkj()
    {
    }

    public boolean a(Object obj, Iterable iterable)
    {
        n.b(iterable);
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        iterable = (Collection)iterable;
        if (iterable.isEmpty() || !a(obj).addAll(iterable)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        iterable = iterable.iterator();
        if (!iterable.hasNext() || !jmr.a(a(obj), iterable))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean a(Object obj, Object obj1)
    {
        return a(obj).add(obj1);
    }

    Set e()
    {
        return new jpj(i());
    }

    public boolean equals(Object obj)
    {
        return g.a(this, obj);
    }

    abstract Map f();

    public boolean g()
    {
        return c() == 0;
    }

    public Set h()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = e();
            a = set;
        }
        return set;
    }

    public int hashCode()
    {
        return i().hashCode();
    }

    public Map i()
    {
        Map map1 = b;
        Map map = map1;
        if (map1 == null)
        {
            map = f();
            b = map;
        }
        return map;
    }

    public String toString()
    {
        return i().toString();
    }
}
