// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class crt
{

    private final int a;
    private final iqu b;
    private final boolean c;
    private final String d;
    private final int e;
    private final boolean f;

    crt(cru cru1)
    {
        b = cru1.b;
        a = cru1.a;
        e = cru1.e;
        c = cru1.c;
        f = cru1.f;
        if (cru1.d == null && cru1.a != -1)
        {
            d = dbf.g(a);
            return;
        } else
        {
            d = cru1.d;
            return;
        }
    }

    public iqu a()
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
