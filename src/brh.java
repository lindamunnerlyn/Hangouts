// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class brh
    implements Runnable
{

    final brg a;

    brh(brg brg1)
    {
        a = brg1;
        super();
    }

    public void run()
    {
        a.a(false, null);
    }
}
