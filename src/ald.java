// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ald
    implements Runnable
{

    final dcd a;
    final int b;
    final iqq c[];
    final alc d;

    ald(alc alc, dcd dcd1, int i, iqq aiqq[])
    {
        d = alc;
        a = dcd1;
        b = i;
        c = aiqq;
        super();
    }

    public void run()
    {
        a.a(b, c);
    }
}
