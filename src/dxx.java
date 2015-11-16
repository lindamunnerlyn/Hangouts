// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dxx
    implements Runnable
{

    final dwz a;
    final dxv b;

    dxx(dxv dxv, dwz dwz1)
    {
        b = dxv;
        a = dwz1;
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
