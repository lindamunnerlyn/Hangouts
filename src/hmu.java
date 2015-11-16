// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class hmu
{

    private final Map a = hmq.a();
    private final Map b = hmq.a();
    private final Object c;

    public hmu(Object obj)
    {
        c = obj;
    }

    public void a()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((Map)c).put(entry.getKey(), ((hmv)entry.getValue()).a()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = b.entrySet().iterator(); iterator1.hasNext(); hno.a((Field)entry1.getKey(), c, ((hmv)entry1.getValue()).a()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

    }

    public void a(Field field, Class class1, Object obj)
    {
        hmv hmv2 = (hmv)b.get(field);
        hmv hmv1 = hmv2;
        if (hmv2 == null)
        {
            hmv1 = new hmv(class1);
            b.put(field, hmv1);
        }
        hmv1.a(class1, obj);
    }
}
