// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gik
    implements Runnable
{

    final boolean a;
    final gie b;

    gik(gie gie1, boolean flag)
    {
        b = gie1;
        a = flag;
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
