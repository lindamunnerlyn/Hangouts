// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gvo
{

    final int a;
    final int b;
    final long c;
    private final gvp d;

    gvo(int i, int j, long l, gvp gvp1)
    {
        b = i;
        a = j;
        c = l;
        d = gvp1;
    }

    gvo(int i, int j, gvp gvp1)
    {
        this(i, j, (long)i * (long)j << 2, gvp1);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof gvo)
        {
            obj = (gvo)obj;
            return d.a(this, ((gvo) (obj)));
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
