// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class hrq
{

    private final Map a = new hrm();
    private final Map b = new hrm();
    private final Object c;

    public hrq(Object obj)
    {
        c = obj;
    }

    public void a()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((Map)c).put(entry.getKey(), ((hrr)entry.getValue()).a()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = b.entrySet().iterator(); iterator1.hasNext(); hsk.a((Field)entry1.getKey(), c, ((hrr)entry1.getValue()).a()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

    }

    public void a(Field field, Class class1, Object obj)
    {
        hrr hrr2 = (hrr)b.get(field);
        hrr hrr1 = hrr2;
        if (hrr2 == null)
        {
            hrr1 = new hrr(class1);
            b.put(field, hrr1);
        }
        hrr1.a(class1, obj);
    }
}
