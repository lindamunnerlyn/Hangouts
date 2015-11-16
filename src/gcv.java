// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gcv
    implements Runnable
{

    final int a;
    final gcu b;

    gcv(gcu gcu1, int i)
    {
        b = gcu1;
        a = i;
        super();
    }

    public void run()
    {
        b.a.a();
    }
}
