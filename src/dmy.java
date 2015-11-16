// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmy
    implements Runnable
{

    final dnc a;
    final dnb b;
    final dmt c;

    dmy(dmt dmt, dnc dnc1, dnb dnb1)
    {
        c = dmt;
        a = dnc1;
        b = dnb1;
        super();
    }

    public void run()
    {
        a.a(b);
        b.b();
    }
}
