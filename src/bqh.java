// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqh
    implements Runnable
{

    final bqf a;

    bqh(bqf bqf1)
    {
        a = bqf1;
        super();
    }

    public void run()
    {
        if (a.j())
        {
            bqf.d(a);
            gih gih1 = bnd.l();
            if (gih1 != null)
            {
                ebw.e("Babel_calls", "Disabling camera because the earpiece is on.");
                gih1.a(false);
            }
        }
    }
}
