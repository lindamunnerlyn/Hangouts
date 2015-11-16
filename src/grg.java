// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grg
    implements Runnable
{

    final gqn a;
    final grk b;
    final grf c;

    grg(grf grf1, gqn gqn, grk grk)
    {
        c = grf1;
        a = gqn;
        b = grk;
        super();
    }

    public void run()
    {
        grf.a(c, a, b);
    }
}
