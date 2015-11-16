// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dnz
    implements Runnable
{

    final dbi a;
    final cfz b;
    final dny c;

    dnz(dny dny1, dbi dbi, cfz cfz)
    {
        c = dny1;
        a = dbi;
        b = cfz;
        super();
    }

    public void run()
    {
        dny.a(c, a, b);
    }
}
