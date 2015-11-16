// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dnm extends dng
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final int v;
    public final int w;

    public dnm(iza iza, int i, long l, jcd jcd1)
    {
        super(iza, i, l);
        a = g.a(jcd1.a, 0);
        b = g.a(jcd1.b, 0);
        v = g.a(jcd1.c, 1);
        w = g.a(jcd1.d, 1);
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(d);
        return arraylist;
    }
}
