// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqq
    implements Runnable
{

    final eef a;
    final edf b;
    final boolean c;
    final boolean d;
    final aqn e;

    aqq(aqn aqn1, eef eef, edf edf, boolean flag, boolean flag1)
    {
        e = aqn1;
        a = eef;
        b = edf;
        c = flag;
        d = flag1;
        super();
    }

    public void run()
    {
        aqn.j().b("deliverImageOnCorrectThread");
        aqn.a(e).a(a, b, c, e, d);
        aqn.j().c("deliverImageOnCorrectThread");
        return;
        Exception exception;
        exception;
        aqn.j().c("deliverImageOnCorrectThread");
        throw exception;
    }
}
