// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gcw
    implements Runnable
{

    final int a;
    final int b;
    final gcu c;

    gcw(gcu gcu1, int i, int j)
    {
        c = gcu1;
        a = i;
        b = j;
        super();
    }

    public void run()
    {
        c.a.a(a, b);
    }
}
