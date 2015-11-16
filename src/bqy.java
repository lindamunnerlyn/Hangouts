// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqy extends boq
{

    final bqo a;

    bqy(bqo bqo1)
    {
        a = bqo1;
        super();
    }

    public void b(int j)
    {
        bqo.b(a);
        if (j == 1)
        {
            bqo.d(a);
            glj glj1 = bnk.k();
            if (glj1 != null)
            {
                eev.e("Babel_calls", "Disabling camera because there are only PSTN participants");
                glj1.a(false);
            }
        }
    }

    public void c()
    {
        gdv.b(bqo.a(a), bqz.a);
        bqo.b(a);
        bqo.c(a);
    }

    public void g()
    {
        bqo.e(a);
    }

    public void i()
    {
        bqo.f(a);
        a.c();
    }
}
