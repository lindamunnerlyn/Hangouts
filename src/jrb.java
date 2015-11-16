// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.RoundingMode;
import java.util.Arrays;

final class jrb extends jgb
{

    final int q;
    final int r;
    final int s;
    final int t;
    private final String u;
    private final char v[];
    private final byte w[];
    private final boolean x[];

    jrb(String s1, char ac[])
    {
        boolean flag = false;
        super();
        u = (String)n.b(s1);
        v = (char[])n.b(ac);
        int i;
        try
        {
            r = jro.a(ac.length, RoundingMode.UNNECESSARY);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal alphabet length ")).append(ac.length).toString(), s1);
        }
        i = Math.min(8, Integer.lowestOneBit(r));
        s = 8 / i;
        t = r / i;
        q = ac.length - 1;
        s1 = new byte[128];
        Arrays.fill(s1, (byte)-1);
        i = 0;
        while (i < ac.length) 
        {
            char c1 = ac[i];
            n.a(jgb.b.b(c1), "Non-ASCII character: %s", new Object[] {
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
        w = s1;
        s1 = new boolean[s];
        for (int j = ((flag) ? 1 : 0); j < t; j++)
        {
            s1[jro.a(j << 3, r, RoundingMode.CEILING)] = 1;
        }

        x = s1;
    }

    boolean a(int i)
    {
        return x[i % s];
    }

    public boolean b(char c1)
    {
        return jgb.b.b(c1) && w[c1] != -1;
    }

    int c(char c1)
    {
        if (c1 > '\177' || w[c1] == -1)
        {
            throw new jrc((new StringBuilder("Unrecognized character: ")).append(c1).toString());
        } else
        {
            return w[c1];
        }
    }

    public String toString()
    {
        return u;
    }
}
