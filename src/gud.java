// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gud
{

    private final long a;
    private final long b;

    public gud(long l, long l1)
    {
        a = l;
        b = l1;
    }

    public long a()
    {
        return a;
    }

    public long b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof gud)
            {
                obj = (gud)obj;
                if (a == ((gud) (obj)).a && b == ((gud) (obj)).b)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
        return ((int)(a ^ a >>> 32) + 527) * 31 + (int)(b ^ b >>> 32);
    }

    public String toString()
    {
        long l = a;
        long l1 = b;
        return (new StringBuilder(41)).append(l).append("/").append(l1).toString();
    }
}
