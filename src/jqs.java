// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class jqs extends jwh
{

    final jqr a;

    jqs(jqr jqr1)
    {
        a = jqr1;
        super();
    }

    Map a()
    {
        return a;
    }

    public boolean contains(Object obj)
    {
        return jrk.a(a.a.entrySet(), obj);
    }

    public Iterator iterator()
    {
        return new jqt(a);
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        }
        Object obj1 = (java.util.Map.Entry)obj;
        obj = a.b;
        obj1 = ((java.util.Map.Entry) (obj1)).getKey();
        obj1 = (Collection)jwd.c(((jqq) (obj)).a, obj1);
        if (obj1 != null)
        {
            int i = ((Collection) (obj1)).size();
            ((Collection) (obj1)).clear();
            obj.b = ((jqq) (obj)).b - i;
        }
        return true;
    }
}
