// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class emc
    implements Runnable
{

    final emg a;
    final emb b;

    emc(emb emb1, emg emg)
    {
        b = emb1;
        a = emg;
        super();
    }

    public void run()
    {
        ely.a(b.b, b.a, a);
    }
}
