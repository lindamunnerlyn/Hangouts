// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractMap;
import java.util.Set;

final class hsd extends AbstractMap
{

    final Object a;
    final hry b;

    hsd(Object obj, boolean flag)
    {
        a = obj;
        b = hry.a(obj.getClass(), flag);
        if (!b.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
    }

    public hsg a()
    {
        return new hsg(this);
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public Set entrySet()
    {
        return a();
    }

    public Object get(Object obj)
    {
        if (obj instanceof String)
        {
            if ((obj = b.a((String)obj)) != null)
            {
                return ((hsk) (obj)).a(a);
            }
        }
        return null;
    }

    public Object put(Object obj, Object obj1)
    {
        obj = (String)obj;
        hsk hsk1 = b.a(((String) (obj)));
        obj = String.valueOf(obj);
        if (((String) (obj)).length() != 0)
        {
            obj = "no field of key ".concat(((String) (obj)));
        } else
        {
            obj = new String("no field of key ");
        }
        l.b(hsk1, obj);
        obj = hsk1.a(a);
        hsk1.a(a, h.a(obj1));
        return obj;
    }
}
