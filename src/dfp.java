// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfp
    implements dmf
{

    private static final long serialVersionUID = 1L;
    private String a;
    private String b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private int h;
    private final String i = eev.a(new Throwable());
    private String j;

    dfp(dfq dfq1)
    {
        h = 0;
        a = dfq1.a;
        b = dfq1.b;
        c = dfq1.c;
        d = dfq1.d;
        e = dfq1.e;
        f = dfq1.f;
        g = dfq1.g;
    }

    public String a()
    {
        return a;
    }

    public void a(int l)
    {
        h = l;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        j = s;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return g;
    }

    public String e()
    {
        return e;
    }

    public String f()
    {
        return d;
    }

    public String g()
    {
        return f;
    }

    public int k()
    {
        return h;
    }

    public cdl m()
    {
        return new dfn(this);
    }

    public String toString()
    {
        int l = c;
        String s = d;
        String s1 = e;
        String s2 = f;
        String s3 = g;
        String s4 = i;
        String s5 = j;
        return (new StringBuilder(String.valueOf(s).length() + 114 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append("media upload request: account id=").append(l).append(" albumId=").append(s).append(" streamId=").append(s1).append(" content type=").append(s2).append(" url=").append(s3).append("\nCreation stack:\n").append(s4).append("\nOrigin stack:\n").append(s5).toString();
    }
}
