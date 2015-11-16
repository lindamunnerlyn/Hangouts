// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ena
    implements Runnable
{

    final emy a;
    final emz b;

    ena(emz emz1, emy emy)
    {
        b = emz1;
        a = emy;
        super();
    }

    public void run()
    {
        if (b.a.isFinishing() || b.a.u_().e())
        {
            return;
        } else
        {
            b.a(eow.b(b.a), a);
            return;
        }
    }
}
