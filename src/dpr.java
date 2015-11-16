// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpr
    implements Runnable
{

    final dpw a;
    final dpn b;

    dpr(dpn dpn, dpw dpw1)
    {
        b = dpn;
        a = dpw1;
        super();
    }

    public void run()
    {
        a.h();
    }
}
