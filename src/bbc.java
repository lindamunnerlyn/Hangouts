// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bbc
    implements Runnable
{

    final String a;
    final int b;
    final bba c;

    bbc(bba bba1, String s, int i)
    {
        c = bba1;
        a = s;
        b = i;
        super();
    }

    public void run()
    {
        int i = g.j(a);
        ((bdp)hgx.a(bba.a(c), bdp)).a(2322, b, Integer.valueOf(i));
    }
}
