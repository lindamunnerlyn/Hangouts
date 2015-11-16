// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class foq
    implements fqt
{

    private final String b;
    private final String c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public foq(String s, String s1)
    {
        this(s, s1, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, null, null, null, null, null);
    }

    public foq(String s, String s1, double d1, double d2, double d3, double d4, double d5, String s2, String s3, 
            String s4, String s5, String s6)
    {
        b = s;
        c = s1;
        d = d1;
        e = d2;
        f = d3;
        g = d4;
        h = d5;
        i = s2;
        j = s3;
        k = s4;
        l = s5;
        m = s6;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof foq)
        {
            obj = (foq)obj;
            return g.a(c, ((foq) (obj)).c);
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("EmailAddress:[Value=");
        String s;
        if (c != null)
        {
            s = c;
        } else
        {
            s = "null";
        }
        stringbuilder = stringbuilder.append(s).append(" Type=");
        if (b != null)
        {
            s = b;
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).append(" a1=").append(d).append(",").append(i).append(" a2=").append(e).append(",").append(j).append(" a3=").append(f).append(",").append(k).append(" a4=").append(g).append(",").append(l).append(" a5=").append(h).append(",").append(m).append("]").toString();
    }
}
