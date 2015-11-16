// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class zm extends zb
{

    final yt a;

    zm(yt yt1)
    {
        a = yt1;
        super();
    }

    private void a()
    {
        if (yt.m(a) && yt.n(a) && yt.o(a))
        {
            kb.a(a, yt.p(a));
            return;
        } else
        {
            yt.q(a);
            a.requestLayout();
            return;
        }
    }

    public void a(int i, int j)
    {
        a.a(null);
        if (a.b.a(i, j))
        {
            a();
        }
    }

    public void a(int i, int j, Object obj)
    {
        a.a(null);
        if (a.b.a(i, j, null))
        {
            a();
        }
    }

    public void b(int i, int j)
    {
        a.a(null);
        if (a.b.b(i, j))
        {
            a();
        }
    }
}
