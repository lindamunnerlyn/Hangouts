// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class deh
    implements dko
{

    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private int f;
    private final String g = ebw.a(new Throwable());
    private String h;

    public deh(int i, String s, String s1, String s2, String s3)
    {
        f = 0;
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        f = i;
    }

    public String b()
    {
        return e;
    }

    public void b(String s)
    {
        h = s;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return b;
    }

    public String e()
    {
        return d;
    }

    public int l()
    {
        return f;
    }

    public ccg n()
    {
        return new def(this);
    }

    public String toString()
    {
        int i = a;
        String s = b;
        String s1 = c;
        String s2 = d;
        String s3 = e;
        String s4 = g;
        String s5 = h;
        return (new StringBuilder(String.valueOf(s).length() + 114 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append("media upload request: account id=").append(i).append(" albumId=").append(s).append(" streamId=").append(s1).append(" content type=").append(s2).append(" url=").append(s3).append("\nCreation stack:\n").append(s4).append("\nOrigin stack:\n").append(s5).toString();
    }
}
