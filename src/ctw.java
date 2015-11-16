// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ctw
{

    private final int a;
    private final iwz b;
    private final boolean c;
    private final String d;
    private final int e;
    private final boolean f;

    ctw(ctx ctx1)
    {
        b = ctx1.b;
        a = ctx1.a;
        e = ctx1.e;
        c = ctx1.c;
        f = ctx1.f;
        if (ctx1.d == null && ctx1.a != -1)
        {
            d = dcn.g(a);
            return;
        } else
        {
            d = ctx1.d;
            return;
        }
    }

    public iwz a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public int e()
    {
        return a;
    }

    public boolean f()
    {
        return f;
    }
}
