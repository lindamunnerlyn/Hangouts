// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class dji
{

    final String a;
    final String b;
    String c;
    List d;
    List e;
    List f;
    long g;
    boolean h;
    boolean i;
    int j;
    String k;
    int l;

    public dji(String s, String s1)
    {
        a = s;
        b = s1;
        d = jxj.a;
        e = jxj.a;
        f = jxj.a;
    }

    public djh a()
    {
        return new djh(this);
    }

    public dji a(int i1)
    {
        j = i1;
        return this;
    }

    public dji a(long l1)
    {
        g = l1;
        return this;
    }

    public dji a(String s)
    {
        c = s;
        return this;
    }

    public dji a(List list)
    {
        d = list;
        return this;
    }

    public dji a(boolean flag)
    {
        h = flag;
        return this;
    }

    public dji b()
    {
        i = false;
        return this;
    }

    public dji b(String s)
    {
        k = s;
        return this;
    }

    public dji b(List list)
    {
        e = list;
        return this;
    }

    public dji c()
    {
        l = 1;
        return this;
    }

    public dji c(List list)
    {
        f = list;
        return this;
    }
}
