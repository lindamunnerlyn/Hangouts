// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dlc
    implements Runnable
{

    final dac a;
    final ceu b;
    final dlb c;

    dlc(dlb dlb1, dac dac, ceu ceu)
    {
        c = dlb1;
        a = dac;
        b = ceu;
        super();
    }

    public void run()
    {
        dlb.a(c, a, b);
    }
}
