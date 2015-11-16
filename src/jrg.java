// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class jrg
    implements jwl
{

    private transient Set a;
    private transient Map b;

    jrg()
    {
    }

    public boolean a(Object obj, Iterable iterable)
    {
        n.b(iterable);
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        iterable = (Collection)iterable;
        if (iterable.isEmpty() || !b(obj).addAll(iterable)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        iterable = iterable.iterator();
        if (!iterable.hasNext() || !jts.a(b(obj), iterable))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean a(Object obj, Object obj1)
    {
        return b(obj).add(obj1);
    }

    public Map b()
    {
        Map map1 = b;
        Map map = map1;
        if (map1 == null)
        {
            map = i();
            b = map;
        }
        return map;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof jwl)
        {
            obj = (jwl)obj;
            return b().equals(((jwl) (obj)).b());
        } else
        {
            return false;
        }
    }

    Set h()
    {
        return new jwi(b());
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    abstract Map i();

    public boolean j()
    {
        return f() == 0;
    }

    public Set k()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = h();
            a = set;
        }
        return set;
    }

    public String toString()
    {
        return b().toString();
    }
}
