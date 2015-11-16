// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.RoundingMode;
import java.util.Arrays;

final class jyk extends jmr
{

    final int o;
    final int p;
    final int q;
    final int r;
    private final String s;
    private final char t[];
    private final byte u[];
    private final boolean v[];

    jyk(String s1, char ac[])
    {
        boolean flag = false;
        super();
        s = (String)n.b(s1);
        t = (char[])n.b(ac);
        int i;
        try
        {
            p = jzk.a(ac.length, RoundingMode.UNNECESSARY);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            int j = ac.length;
            throw new IllegalArgumentException((new StringBuilder(35)).append("Illegal alphabet length ").append(j).toString(), s1);
        }
        i = Math.min(8, Integer.lowestOneBit(p));
        q = 8 / i;
        r = p / i;
        o = ac.length - 1;
        s1 = new byte[128];
        Arrays.fill(s1, (byte)-1);
        i = 0;
        while (i < ac.length) 
        {
            char c1 = ac[i];
            n.a(jmr.c.b(c1), "Non-ASCII character: %s", new Object[] {
                Character.valueOf(c1)
            });
            boolean flag1;
            if (s1[c1] == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            n.a(flag1, "Duplicate character: %s", new Object[] {
                Character.valueOf(c1)
            });
            s1[c1] = (byte)i;
            i++;
        }
        u = s1;
        s1 = new boolean[q];
        for (int k = ((flag) ? 1 : 0); k < r; k++)
        {
            s1[jzk.a(k << 3, p, RoundingMode.CEILING)] = 1;
        }

        v = s1;
    }

    static char[] a(jyk jyk1)
    {
        return jyk1.t;
    }

    char a(int i)
    {
        return t[i];
    }

    public boolean b(char c1)
    {
        return jmr.c.b(c1) && u[c1] != -1;
    }

    boolean b(int i)
    {
        return v[i % q];
    }

    int c(char c1)
    {
        if (c1 > '\177' || u[c1] == -1)
        {
            Object obj;
            if (jmr.k.b(c1))
            {
                obj = String.valueOf(Integer.toHexString(c1));
                if (((String) (obj)).length() != 0)
                {
                    obj = "0x".concat(((String) (obj)));
                } else
                {
                    obj = new String("0x");
                }
            } else
            {
                obj = Character.valueOf(c1);
            }
            obj = String.valueOf(obj);
            throw new jyn((new StringBuilder(String.valueOf(obj).length() + 24)).append("Unrecognized character: ").append(((String) (obj))).toString());
        } else
        {
            return u[c1];
        }
    }

    public String toString()
    {
        return s;
    }
}
