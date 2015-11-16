// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqp extends boh
{

    final bqf a;

    bqp(bqf bqf1)
    {
        a = bqf1;
        super();
    }

    public void b(int j)
    {
        bqf.b(a);
        if (j == 1)
        {
            bqf.d(a);
            gih gih1 = bnd.l();
            if (gih1 != null)
            {
                ebw.e("Babel_calls", "Disabling camera because there are only PSTN participants");
                gih1.a(false);
            }
        }
    }

    public void c()
    {
        gbh.b(bqf.a(a), bqq.a);
        bqf.b(a);
        bqf.c(a);
    }

    public void g()
    {
        bqf.e(a);
    }

    public void i()
    {
        bqf.f(a);
        a.c();
    }
}
