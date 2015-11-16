// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dst
    implements Runnable
{

    final dsn a;
    final dsp b;

    dst(dsp dsp1, dsn dsn)
    {
        b = dsp1;
        a = dsn;
        super();
    }

    public void run()
    {
        b.b(a);
    }
}
