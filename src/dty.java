// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dty
    implements Runnable
{

    final dtx a;

    dty(dtx dtx1)
    {
        a = dtx1;
        super();
    }

    public void run()
    {
        dtx.a(a);
    }
}
