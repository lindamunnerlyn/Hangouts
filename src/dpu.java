// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpu
    implements Runnable
{

    final dpw a;
    final dpn b;

    dpu(dpn dpn1, dpw dpw)
    {
        b = dpn1;
        a = dpw;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}
