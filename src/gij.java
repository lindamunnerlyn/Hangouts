// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gij
    implements Runnable
{

    final boolean a;
    final int b;
    final int c;
    final int d;
    final int e;
    final gie f;

    gij(gie gie1, boolean flag, int i, int j, int k, int l)
    {
        f = gie1;
        a = flag;
        b = i;
        c = j;
        d = k;
        e = l;
        super();
    }

    public void run()
    {
        f.m = a;
        f.i = new gnk(b, c);
        f.a(new gnk(d, e));
    }
}
