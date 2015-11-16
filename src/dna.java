// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dna
    implements Runnable
{

    final dnc a;
    final dmt b;

    dna(dmt dmt1, dnc dnc)
    {
        b = dmt1;
        a = dnc;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}
