// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ha extends hf
{

    final gz a;

    ha(gz gz1)
    {
        a = gz1;
        super();
    }

    protected int a()
    {
        return a.h;
    }

    protected int a(Object obj)
    {
        return a.a(obj);
    }

    protected Object a(int i, int j)
    {
        return a.g[(i << 1) + j];
    }

    protected Object a(int i, Object obj)
    {
        return a.a(i, obj);
    }

    protected void a(int i)
    {
        a.d(i);
    }

    protected void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected int b(Object obj)
    {
        return a.b(obj);
    }

    protected Map b()
    {
        return a;
    }

    protected void c()
    {
        a.clear();
    }
}
