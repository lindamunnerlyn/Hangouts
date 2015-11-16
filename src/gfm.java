// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gfm
    implements Runnable
{

    final int a;
    final gff b;

    gfm(gff gff1, int i)
    {
        b = gff1;
        a = i;
        super();
    }

    public void run()
    {
        b.l = a;
        if (b.c != null)
        {
            b.c.a(a);
        }
    }
}
