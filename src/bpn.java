// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bpn
    implements Runnable
{

    final bpm a;

    bpn(bpm bpm1)
    {
        a = bpm1;
        super();
    }

    public void run()
    {
        eev.g("Babel", "Hangout initiate timed out");
        a.c(3);
    }
}
