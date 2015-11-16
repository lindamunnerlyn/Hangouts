// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dvm
    implements Runnable
{

    final dvg a;
    final dvi b;

    dvm(dvi dvi1, dvg dvg)
    {
        b = dvi1;
        a = dvg;
        super();
    }

    public void run()
    {
        b.b(a);
    }
}
