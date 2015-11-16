// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hhu
    implements Runnable
{

    final hhm a;
    final Object b;
    final hhr c;

    hhu(hhr hhr, hhm hhm1, Object obj)
    {
        c = hhr;
        a = hhm1;
        b = obj;
        super();
    }

    public void run()
    {
        a.a(b);
    }
}
