// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dup
    implements Runnable
{

    final dtr a;
    final dun b;

    dup(dun dun, dtr dtr1)
    {
        b = dun;
        a = dtr1;
        super();
    }

    public void run()
    {
        a.a(false);
        if (a.a() != null)
        {
            a.b();
        }
    }
}
