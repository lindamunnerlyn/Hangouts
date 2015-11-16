// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gfk
    implements Runnable
{

    final boolean a;
    final int b;
    final int c;
    final int d;
    final int e;
    final gff f;

    gfk(gff gff1, boolean flag, int i, int j, int k, int l)
    {
        f = gff1;
        a = flag;
        b = i;
        c = j;
        d = k;
        e = l;
        super();
    }

    public void run()
    {
        f.k = a;
        f.i = new gki(b, c);
        f.a(new gki(d, e));
    }
}
