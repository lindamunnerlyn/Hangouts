// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ddz extends dfa
{

    private final String a;
    private final aik d;

    public ddz(ani ani1, String s, aik aik)
    {
        super(ani1);
        a = s;
        d = aik;
    }

    public void a()
    {
        aik aik = d;
        ArrayList arraylist = new ArrayList();
        g.a(aik, new deq(arraylist));
        g.a(g.nS, d);
        any.a(new aoe(g.nS, b.h()), a, arraylist, c);
    }
}
