// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bnl
    implements Runnable
{

    final bnk a;

    bnl(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void run()
    {
        if (bnk.a(a))
        {
            eev.f("Babel_calls", "Leaving empty hangout on timeout.");
            a.r.c(1012);
        }
    }
}
