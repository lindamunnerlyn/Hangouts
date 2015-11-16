// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmj
    implements Runnable
{

    final fqp a;
    final fqy b;
    final dme c;

    dmj(dme dme1, fqp fqp, fqy fqy)
    {
        c = dme1;
        a = fqp;
        b = fqy;
        super();
    }

    public void run()
    {
        dme.a(c, a, b);
    }
}
