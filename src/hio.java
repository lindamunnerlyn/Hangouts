// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hio
{

    private final String a;
    private final String b;
    private final boolean c;
    private final hhz d;
    private final boolean e;
    private final hih f;

    hio(hip hip1)
    {
        a = hip1.a;
        b = hip1.b;
        d = hip1.d;
        e = hip1.e;
        f = hip1.f;
        boolean flag;
        if (hip1.c && hip1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private hio(String s, String s1, hhz hhz, boolean flag, hih hih)
    {
        a = (String)g.d(s, "accountName");
        b = s1;
        d = null;
        e = flag;
        f = null;
        c = false;
    }

    public hio(String s, String s1, boolean flag)
    {
        this(s, s1, null, flag, null);
    }

    public static hip newBuilder()
    {
        return new hip();
    }

    public static hip newBuilder(hio hio1)
    {
        hip hip1 = new hip();
        hip1.a(hio1.b()).b(hio1.c()).a(hio1.a()).b(hio1.e()).a(hio1.f()).a(hio1.d());
        return hip1;
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

    public hhz d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public hih f()
    {
        return f;
    }
}
