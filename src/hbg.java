// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hbg
    implements Runnable
{

    final hbd a;
    final hbo b;
    final hbf c;

    hbg(hbf hbf1, hbd hbd1, hbo hbo)
    {
        c = hbf1;
        a = hbd1;
        b = hbo;
        super();
    }

    public void run()
    {
        c.c.b.a(c.c.a.u_(), b, c.c.c);
        c.c.d = null;
    }
}
