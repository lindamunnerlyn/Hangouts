// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bpo
    implements Runnable
{

    final bpm a;

    bpo(bpm bpm1)
    {
        a = bpm1;
        super();
    }

    public void run()
    {
        eev.g("Babel", "Conversation id resolve timed out");
        a.c(4);
    }
}
