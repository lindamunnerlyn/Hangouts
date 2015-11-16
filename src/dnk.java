// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dnk extends dng
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final List v;

    dnk(iza iza, int i, long l, jbq jbq1)
    {
        super(iza, i, l);
        a = g.a(jbq1.a, 0);
        b = g.a(jbq1.c, 0);
        v = g.a(jbq1.b, null);
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList(v);
        arraylist.add(d);
        return arraylist;
    }
}
