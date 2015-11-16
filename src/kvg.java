// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class kvg extends ktp
{

    private static final kvg b;
    private final List c;

    public kvg()
    {
        c = new ArrayList();
    }

    kvg(List list)
    {
        c = new ArrayList(list);
    }

    public static kvg d()
    {
        return b;
    }

    public void add(int i, Object obj)
    {
        c();
        c.add(i, obj);
        modCount = modCount + 1;
    }

    public Object get(int i)
    {
        return c.get(i);
    }

    public Object remove(int i)
    {
        c();
        Object obj = c.remove(i);
        modCount = modCount + 1;
        return obj;
    }

    public Object set(int i, Object obj)
    {
        c();
        obj = c.set(i, obj);
        modCount = modCount + 1;
        return obj;
    }

    public int size()
    {
        return c.size();
    }

    static 
    {
        kvg kvg1 = new kvg();
        b = kvg1;
        kvg1.a = false;
    }
}
