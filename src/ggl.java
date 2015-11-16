// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggl
{

    final gfr a;
    final iqw b;
    final iqt c;

    public ggl(gfr gfr, iqw iqw, iqt iqt)
    {
        a = gfr;
        b = iqw;
        c = iqt;
    }

    public void a(String s, kop kop, Class class1, gbe gbe)
    {
        a(s, kop, class1, gbe, 20000, 3);
    }

    public void a(String s, kop kop, Class class1, gbe gbe, int i, int j)
    {
        g.a(new ggm(this, s, kop, class1, gbe, i, 1000L, j));
    }

    public void a(jbh jbh, gbe gbe)
    {
        a("hangout_participants/remove", ((kop) (jbh)), jbi, gbe);
    }

    public void a(jbn jbn, gbe gbe)
    {
        a("hangouts/resolve", ((kop) (jbn)), jbo, gbe);
    }
}
