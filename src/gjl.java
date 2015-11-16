// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gjl
{

    final gir a;
    ixb b;
    iwy c;

    public gjl(gir gir, ixb ixb, iwy iwy)
    {
        a = gir;
        b = ixb;
        c = iwy;
    }

    public void a(iwy iwy)
    {
        c = iwy;
    }

    public void a(ixb ixb)
    {
        b = ixb;
    }

    public void a(String s, kws kws, Class class1, gds gds)
    {
        a(s, kws, class1, gds, 20000, 3);
    }

    public void a(String s, kws kws, Class class1, gds gds, int i, int j)
    {
        g.a(new gjm(this, s, kws, class1, gds, i, 1000L, j));
    }

    public void a(jhw jhw, gds gds)
    {
        a("hangouts/resolve", ((kws) (jhw)), jhx, gds);
    }
}
