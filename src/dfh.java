// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class dfh extends dgj
{

    private final String a;
    private final aid e;

    public dfh(aoa aoa, String s, aid aid)
    {
        super(aoa);
        a = s;
        e = aid;
    }

    public void a()
    {
        Object obj = super.b.b;
        Object obj1 = e;
        obj = new ArrayList();
        g.a(((aid) (obj1)), new dfz(((ArrayList) (obj))));
        obj1 = super.b.b;
        g.a(g.nU, e);
        aoq.a(new aow(g.nU, super.b.a), a, ((java.util.List) (obj)), super.c);
    }
}
