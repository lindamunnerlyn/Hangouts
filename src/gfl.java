// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gfl
    implements Runnable
{

    final boolean a;
    final gff b;

    gfl(gff gff1, boolean flag)
    {
        b = gff1;
        a = flag;
        super();
    }

    public void run()
    {
        b.j = a;
        if (b.c != null)
        {
            b.c.a(a);
        }
    }
}
