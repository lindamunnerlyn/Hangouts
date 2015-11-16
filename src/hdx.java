// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdx
{

    private final String a;
    private final String b;
    private final boolean c;
    private final hdi d;
    private final boolean e;
    private final hdq f;

    hdx(hdy hdy1)
    {
        a = hdy1.a;
        b = hdy1.b;
        d = hdy1.d;
        e = hdy1.e;
        f = hdy1.f;
        boolean flag;
        if (hdy1.c && hdy1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private hdx(String s, String s1, hdi hdi, boolean flag, hdq hdq)
    {
        a = (String)g.c(s, "accountName");
        b = s1;
        d = null;
        e = flag;
        f = null;
        c = false;
    }

    public hdx(String s, String s1, boolean flag)
    {
        this(s, s1, null, flag, null);
    }

    public static hdy newBuilder()
    {
        return new hdy();
    }

    public boolean a()
    {
        return c;
    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public hdi d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public hdq f()
    {
        return f;
    }
}
