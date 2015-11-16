// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gnk
{

    public final int a;
    public final int b;

    public gnk(int i, int j)
    {
        a = i;
        b = j;
    }

    public static gnk a(gnk gnk1, float f)
    {
        return new gnk((int)((float)gnk1.a * f) + 2 & -4, (int)((float)gnk1.b * f) + 2 & -4);
    }

    public static gnk a(gnk gnk1, int i)
    {
        gnk gnk2 = gnk1;
        if (gnk1.a * gnk1.b > i)
        {
            int j = (int)(Math.sqrt(((double)i * (double)gnk1.a) / (double)gnk1.b) + 0.5D);
            gnk2 = new gnk(j, (int)((double)i / (double)j + 0.5D));
        }
        return gnk2;
    }

    public static gnk a(gnk gnk1, gnk gnk2)
    {
        float f = c(gnk1, gnk2);
        gnk2 = gnk1;
        if ((double)f > 1.0D)
        {
            gnk2 = a(gnk1, f);
        }
        return gnk2;
    }

    public static gnk b(gnk gnk1, gnk gnk2)
    {
        float f = c(gnk1, gnk2);
        gnk2 = gnk1;
        if ((double)f < 1.0D)
        {
            gnk2 = a(gnk1, f);
        }
        return gnk2;
    }

    private static float c(gnk gnk1, gnk gnk2)
    {
        float f4 = gnk1.a;
        float f5 = gnk1.b;
        float f = gnk2.a;
        float f1 = gnk2.b;
        float f6 = f4 / f5;
        float f3 = f / f1;
        float f2;
        if (f6 < 1.0F && f3 > 1.0F || f6 > 1.0F && f3 < 1.0F)
        {
            f2 = 1.0F / f3;
        } else
        {
            f2 = f;
            f = f1;
            f1 = f2;
            f2 = f3;
        }
        if (f6 > f2)
        {
            return f1 / f4;
        } else
        {
            return f / f5;
        }
    }

    public int a()
    {
        return a << 16 | b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof gnk)
        {
            if (a == ((gnk) (obj = (gnk)obj)).a && b == ((gnk) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a * 32713 + b;
    }

    public String toString()
    {
        int i = a;
        int j = b;
        return (new StringBuilder(23)).append(i).append("x").append(j).toString();
    }
}
