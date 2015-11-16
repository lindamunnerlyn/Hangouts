// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class hrr
{

    final Class a;
    final ArrayList b = new ArrayList();

    hrr(Class class1)
    {
        a = class1;
    }

    Object a()
    {
        return g.a(b, a);
    }

    void a(Class class1, Object obj)
    {
        boolean flag;
        if (class1 == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        b.add(obj);
    }
}
