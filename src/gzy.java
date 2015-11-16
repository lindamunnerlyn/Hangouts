// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gzy
{

    final int a;
    final int b;
    final long c;
    private final gzz d;

    gzy(int i, int j, long l, gzz gzz1)
    {
        b = i;
        a = j;
        c = l;
        d = gzz1;
    }

    gzy(int i, int j, gzz gzz1)
    {
        this(i, j, (long)i * (long)j << 2, gzz1);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof gzy)
        {
            obj = (gzy)obj;
            return d.a(this, ((gzy) (obj)));
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return d.a(this);
    }

    public String toString()
    {
        int i = b;
        int j = a;
        return (new StringBuilder(35)).append("BitmapKey(").append(i).append(", ").append(j).append(")").toString();
    }
}
