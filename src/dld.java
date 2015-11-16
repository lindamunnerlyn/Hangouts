// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dld
    implements Runnable
{

    final dac a;
    final dlb b;

    dld(dlb dlb1, dac dac)
    {
        b = dlb1;
        a = dac;
        super();
    }

    public void run()
    {
        dlb.a(b, a);
    }
}
