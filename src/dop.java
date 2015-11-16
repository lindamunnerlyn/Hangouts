// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dop
    implements Runnable
{

    final dor a;
    final don b;

    dop(don don1, dor dor)
    {
        b = don1;
        a = dor;
        super();
    }

    public void run()
    {
        b.b(a);
    }
}
