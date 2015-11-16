// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lrb extends lnn
{

    private static final long serialVersionUID = 0xcf3f4667c8adc9fcL;
    private final String c;
    private final int d;
    private final int e;

    public lrb(String s, String s1, int i, int j)
    {
        super(s);
        c = s1;
        d = i;
        e = j;
    }

    public String a(long l)
    {
        return c;
    }

    public int b(long l)
    {
        return d;
    }

    public int c(long l)
    {
        return d;
    }

    public boolean c()
    {
        return true;
    }

    public long e(long l)
    {
        return l;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lrb)
            {
                if (!super.b.equals(((lnn) (obj = (lrb)obj)).b) || e != ((lrb) (obj)).e || d != ((lrb) (obj)).d)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public long f(long l)
    {
        return l;
    }

    public int hashCode()
    {
        return super.b.hashCode() + e * 37 + d * 31;
    }
}
