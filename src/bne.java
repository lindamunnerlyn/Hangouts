// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bne
    implements Runnable
{

    final bnd a;

    bne(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void run()
    {
        if (bnd.a(a))
        {
            ebw.f("Babel_calls", "Leaving empty hangout on timeout.");
            a.q.c(1012);
        }
    }
}
