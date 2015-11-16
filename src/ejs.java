// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ejs
{

    private final ejt a;
    private final a b = null;
    private final ejw c;
    private final g d = null;
    private final String e;

    public ejs(String s, ejt ejt, ejw ejw)
    {
        h.a(ejt, "Cannot construct an Api with a null ClientBuilder");
        h.a(ejw, "Cannot construct an Api with a null ClientKey");
        e = s;
        a = ejt;
        c = ejw;
    }

    public ejt a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
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
        h.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public ejw c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
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
