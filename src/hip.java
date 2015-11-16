// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hip
{

    String a;
    String b;
    boolean c;
    hhz d;
    boolean e;
    hih f;
    private boolean g;

    public hip()
    {
    }

    public hio a()
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
            g.d(flag, "Authenticated request requires account name");
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
        g.d(flag, "Unauthenticated request should not specify account name");
        return new hio(this);
    }

    public hip a(hhz hhz)
    {
        d = hhz;
        return this;
    }

    public hip a(hih hih)
    {
        f = hih;
        return this;
    }

    public hip a(String s)
    {
        a = s;
        return this;
    }

    public hip a(boolean flag)
    {
        c = flag;
        return this;
    }

    public hip b(String s)
    {
        b = s;
        return this;
    }

    public hip b(boolean flag)
    {
        e = flag;
        return this;
    }
}
