// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gil
    implements Runnable
{

    final int a;
    final gie b;

    gil(gie gie1, int i)
    {
        b = gie1;
        a = i;
        super();
    }

    public void run()
    {
        b.n = a;
        if (b.c != null)
        {
            b.c.a(a);
        }
    }
}
