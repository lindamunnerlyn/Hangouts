// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class lqf
    implements lqo, lqs
{

    public final lnj a;
    public final int b;
    public final boolean c;

    lqf(lnj lnj, int i, boolean flag)
    {
        a = lnj;
        b = i;
        c = flag;
    }

    public int a(lqp lqp1, String s, int i)
    {
        int j;
        int k;
        int l;
        int i1 = Math.min(b, s.length() - i);
        k = 0;
        j = i;
        l = 0;
        i = k;
        k = l;
        do
        {
            l = i;
            if (k >= i1)
            {
                break;
            }
            char c1 = s.charAt(j + k);
            if (k == 0 && (c1 == '-' || c1 == '+') && c)
            {
                if (c1 == '-')
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                l = i;
                if (k + 1 >= i1)
                {
                    break;
                }
                c1 = s.charAt(j + k + 1);
                l = i;
                if (c1 < '0')
                {
                    break;
                }
                l = i;
                if (c1 > '9')
                {
                    break;
                }
                if (i != 0)
                {
                    k++;
                } else
                {
                    j++;
                }
                i1 = Math.min(i1 + 1, s.length() - j);
                continue;
            }
            l = i;
            if (c1 < '0')
            {
                break;
            }
            l = i;
            if (c1 > '9')
            {
                break;
            }
            k++;
        } while (true);
        if (k == 0)
        {
            return ~j;
        }
        if (k < 9) goto _L2; else goto _L1
_L1:
        k = j + k;
        j = Integer.parseInt(s.substring(j, k));
_L4:
        lqp1.a(a, j);
        return k;
_L2:
        int j1;
        int k1;
        if (l != 0)
        {
            i = j + 1;
        } else
        {
            i = j;
        }
        k1 = i + 1;
        try
        {
            i = s.charAt(i);
        }
        // Misplaced declaration of an exception variable
        catch (lqp lqp1)
        {
            return ~j;
        }
        j1 = j + k;
        i -= 48;
        for (j = k1; j < j1; j++)
        {
            i = (s.charAt(j) + ((i << 3) + (i << 1))) - 48;
        }

        j = i;
        k = j1;
        if (l != 0)
        {
            j = -i;
            k = j1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int b()
    {
        return b;
    }
}
