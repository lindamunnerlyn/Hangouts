// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bsu
    implements bow
{

    final boolean a;
    final bov b;
    final bss c;

    bsu(bss bss, boolean flag, bov bov1)
    {
        c = bss;
        a = flag;
        b = bov1;
        super();
    }

    public void a(bpd bpd)
    {
    }

    public void a(gjr gjr1)
    {
        boolean flag;
        if (!gjr1.n() && a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b.a() != flag)
        {
            b.a(flag);
        }
    }
}
