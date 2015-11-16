// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class gkr
{

    private final int a;
    private final String b;
    private final glq c;

    gkr(int i, String s, glq glq1)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (s == null || glq1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = i;
            b = s;
            c = glq1;
            return;
        }
    }

    public int a()
    {
        return a + b.length();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof gkr))
            {
                return false;
            }
            obj = (gkr)obj;
            if (!b.equals(((gkr) (obj)).b) || a != ((gkr) (obj)).a || !c.equals(((gkr) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c
        });
    }

    public String toString()
    {
        int i = a;
        int j = a();
        String s = b;
        return (new StringBuilder(String.valueOf(s).length() + 43)).append("PhoneNumberMatch [").append(i).append(",").append(j).append(") ").append(s).toString();
    }
}
