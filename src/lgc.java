// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lgc
    implements lge, lgi
{

    private final lcz a;
    private final int b;
    private final boolean c;

    lgc(lcz lcz1, int i, boolean flag)
    {
        a = lcz1;
        b = i;
        c = flag;
    }

    private int a(long l, lcw lcw)
    {
        int i;
        int j;
        try
        {
            j = a.a(lcw).a(l);
        }
        // Misplaced declaration of an exception variable
        catch (lcw lcw)
        {
            return -1;
        }
        i = j;
        if (j < 0)
        {
            i = -j;
        }
        return i % 100;
    }

    public int a()
    {
        return 2;
    }

    public int a(lgf lgf1, String s, int i)
    {
        int l;
        char c2;
        c2 = '\0';
        l = s.length() - i;
        if (c) goto _L2; else goto _L1
_L1:
        int k;
        k = i;
        if (Math.min(2, l) < 2)
        {
            return ~i;
        }
          goto _L3
_L2:
        boolean flag;
        int j;
        j = 0;
        flag = false;
        k = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            char c3 = s.charAt(i + j);
            if (j == 0 && (c3 == '-' || c3 == '+'))
            {
                if (c3 == '-')
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    j++;
                    k = 1;
                } else
                {
                    i++;
                    k = 1;
                    l--;
                }
                continue;
            }
            if (c3 < '0' || c3 > '9')
            {
                break;
            }
            j++;
        } while (true);
        if (j == 0)
        {
            return ~i;
        }
        if (k != 0) goto _L5; else goto _L4
_L4:
        k = i;
        if (j == 2) goto _L3; else goto _L5
_L5:
        if (j < 9) goto _L7; else goto _L6
_L6:
        k = i + j;
        j = Integer.parseInt(s.substring(i, k));
_L8:
        lgf1.a(a, j);
        return k;
_L7:
        char c1;
        int i1;
        if (flag)
        {
            k = i + 1;
        } else
        {
            k = i;
        }
        try
        {
            c2 = s.charAt(k);
        }
        // Misplaced declaration of an exception variable
        catch (lgf lgf1)
        {
            return ~i;
        }
        i1 = i + j;
        i = c2 - 48;
        for (j = k + 1; j < i1; j++)
        {
            i = (s.charAt(j) + ((i << 3) + (i << 1))) - 48;
        }

        j = i;
        k = i1;
        if (flag)
        {
            j = -i;
            k = i1;
        }
        if (true) goto _L8; else goto _L3
_L3:
        i = s.charAt(k);
        if (i < 48 || i > 57)
        {
            return ~k;
        }
        i -= 48;
        c1 = s.charAt(k + 1);
        if (c1 < '0' || c1 > '9')
        {
            return ~k;
        }
        j = ((i << 1) + (i << 3) + c1) - 48;
        i = b;
        if (lgf1.c() != null)
        {
            i = lgf1.c().intValue();
        }
        i1 = i - 50;
        if (i1 >= 0)
        {
            i = i1 % 100;
        } else
        {
            i = (i1 + 1) % 100 + 99;
        }
        c1 = c2;
        if (j < i)
        {
            c1 = 'd';
        }
        lgf1.a(a, ((c1 + i1) - i) + j);
        return k + 2;
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        i = a(l, lcw);
        if (i < 0)
        {
            stringbuffer.append('\uFFFD');
            stringbuffer.append('\uFFFD');
            return;
        } else
        {
            lgj.a(stringbuffer, i, 2);
            return;
        }
    }

    public int b()
    {
        return !c ? 2 : 4;
    }
}
