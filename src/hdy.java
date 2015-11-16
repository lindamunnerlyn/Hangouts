// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdy
{

    String a;
    String b;
    boolean c;
    hdi d;
    boolean e;
    hdq f;
    private boolean g;

    public hdy()
    {
    }

    public hdy a()
    {
        c = true;
        return this;
    }

    public hdy a(hdq hdq)
    {
        f = hdq;
        return this;
    }

    public hdy a(String s)
    {
        a = s;
        return this;
    }

    public hdx b()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (g || a != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g.b(flag, "Authenticated request requires account name");
            if (g)
            {
                flag = flag1;
                if (a != null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        g.b(flag, "Unauthenticated request should not specify account name");
        return new hdx(this);
    }

    public hdy b(String s)
    {
        b = s;
        return this;
    }
}
