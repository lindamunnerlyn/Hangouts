// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbo extends gep
{

    final boolean a;
    final gbn b;

    gbo(gbn gbn1, boolean flag)
    {
        b = gbn1;
        a = flag;
        super();
    }

    public void a(gem gem1)
    {
        if (gem1.e() && gem1.d() != null)
        {
            b.d.b(this);
            b.a(a);
        }
    }
}
