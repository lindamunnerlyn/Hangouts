// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbx
    implements Runnable
{

    final boolean a;
    final gbs b;

    gbx(gbs gbs1, boolean flag)
    {
        b = gbs1;
        a = flag;
        super();
    }

    public void run()
    {
        if (gbs.f(b) != null)
        {
            gbs.a(b, gbs.f(b).e, new ghm(a, null));
        }
    }
}
