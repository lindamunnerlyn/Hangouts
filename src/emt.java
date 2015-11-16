// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emt
{

    private final emu a;
    private final a b = null;
    private final emx c;
    private final g d = null;
    private final String e;

    public emt(String s, emu emu, emx emx)
    {
        g.b(emu, "Cannot construct an Api with a null ClientBuilder");
        g.b(emx, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = emu;
        c = emx;
    }

    public emu a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public a b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public emx c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public boolean d()
    {
        return d != null;
    }

    public String e()
    {
        return e;
    }
}
