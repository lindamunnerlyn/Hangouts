// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class doa
    implements Runnable
{

    final dbi a;
    final dny b;

    doa(dny dny1, dbi dbi)
    {
        b = dny1;
        a = dbi;
        super();
    }

    public void run()
    {
        dny.a(b, a);
    }
}
