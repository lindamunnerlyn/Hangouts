// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gki
{

    public final int a;
    public final int b;

    public gki(int i, int j)
    {
        a = i;
        b = j;
    }

    public static gki a(gki gki1, float f)
    {
        return new gki((int)((float)gki1.a * f) + 2 & -4, (int)((float)gki1.b * f) + 2 & -4);
    }

    public static gki a(gki gki1, gki gki2)
    {
        float f = c(gki1, gki2);
        gki2 = gki1;
        if ((double)f > 1.0D)
        {
            gki2 = a(gki1, f);
        }
        return gki2;
    }

    public static gki b(gki gki1, gki gki2)
    {
        float f = c(gki1, gki2);
        gki2 = gki1;
        if ((double)f < 1.0D)
        {
            gki2 = a(gki1, f);
        }
        return gki2;
    }

    private static float c(gki gki1, gki gki2)
    {
        float f4 = gki1.a;
        float f5 = gki1.b;
        float f = gki2.a;
        float f1 = gki2.b;
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
        if (obj instanceof gki)
        {
            if (a == ((gki) (obj = (gki)obj)).a && b == ((gki) (obj)).b)
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
