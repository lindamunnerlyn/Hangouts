// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class edt
{

    private String a;
    public String b;
    public String c;
    public boolean d;
    private final String e;
    private String f;
    private String g;

    public edt(String s1, String s2)
    {
        this(s1, s2, (byte)0);
    }

    private edt(String s1, String s2, byte byte0)
    {
        e = s1;
        if (e == null || e.contains("focus"))
        {
            a = s2;
        }
        d = false;
    }

    public abstract void a();

    public void a(String s1)
    {
        f = s1;
    }

    public void b(String s1)
    {
        g = s1;
    }

    public String n()
    {
        return e;
    }

    public String o()
    {
        return a;
    }

    public boolean p()
    {
        return d;
    }

    public String q()
    {
        return f;
    }

    public String r()
    {
        return g;
    }

    public String s()
    {
        if (c == null)
        {
            a();
        }
        return c;
    }

    public String t()
    {
        if (b == null)
        {
            a();
        }
        return b;
    }

    public String toString()
    {
        String s1 = e;
        String s2 = a;
        String s3 = b;
        String s4 = c;
        boolean flag = d;
        return (new StringBuilder(String.valueOf(s1).length() + 41 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append("Base:").append(s1).append(" Account name=").append(s2).append(" Load:").append(s3).append(" key=").append(s4).append(" save:").append(flag).toString();
    }
}
