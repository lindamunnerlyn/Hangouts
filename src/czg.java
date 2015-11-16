// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class czg extends cza
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final int v;
    public final int w;

    public czg(isv isv, int i, long l, ivy ivy1)
    {
        super(isv, i, l);
        a = g.a(ivy1.a, 0);
        b = g.a(ivy1.b, 0);
        v = g.a(ivy1.c, 1);
        w = g.a(ivy1.d, 1);
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(d);
        return arraylist;
    }
}
