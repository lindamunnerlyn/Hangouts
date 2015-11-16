// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class gz extends hm
    implements Map
{

    hf a;

    public gz()
    {
    }

    public gz(int i)
    {
        super(i);
    }

    public gz(hm hm1)
    {
        super(hm1);
    }

    private hf b()
    {
        if (a == null)
        {
            a = new ha(this);
        }
        return a;
    }

    public boolean a(Collection collection)
    {
        return hf.a(this, collection);
    }

    public Set entrySet()
    {
        return b().d();
    }

    public Set keySet()
    {
        return b().e();
    }

    public void putAll(Map map)
    {
        a(h + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        return b().f();
    }
}
