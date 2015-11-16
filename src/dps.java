// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dps
    implements Runnable
{

    final dpw a;
    final dpv b;
    final dpn c;

    dps(dpn dpn, dpw dpw1, dpv dpv1)
    {
        c = dpn;
        a = dpw1;
        b = dpv1;
        super();
    }

    public void run()
    {
        a.a(b);
        b.b();
    }
}
