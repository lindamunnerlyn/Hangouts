// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bbs
    implements Runnable
{

    final String a;
    final int b;
    final bbq c;

    bbs(bbq bbq1, String s, int i)
    {
        c = bbq1;
        a = s;
        b = i;
        super();
    }

    public void run()
    {
        int i = g.j(a);
        ((beb)hlp.a(c.a, beb)).a(2322, b, Integer.valueOf(i));
    }
}
