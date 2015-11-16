// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class gox
{

    private final int a;
    private final String b;
    private final gpw c;

    gox(int i, String s, gpw gpw1)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (s == null || gpw1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = i;
            b = s;
            c = gpw1;
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
            if (!(obj instanceof gox))
            {
                return false;
            }
            obj = (gox)obj;
            if (!b.equals(((gox) (obj)).b) || a != ((gox) (obj)).a || !c.equals(((gox) (obj)).c))
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
        String s = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 43)).append("PhoneNumberMatch [").append(i).append(",").append(j).append(") ").append(s).toString();
    }
}
