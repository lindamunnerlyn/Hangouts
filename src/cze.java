// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class cze extends cza
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final List v;

    cze(isv isv, int i, long l, ivl ivl1)
    {
        super(isv, i, l);
        a = g.a(ivl1.a, 0);
        b = g.a(ivl1.c, 0);
        v = g.a(ivl1.b, null);
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList(v);
        arraylist.add(d);
        return arraylist;
    }
}
