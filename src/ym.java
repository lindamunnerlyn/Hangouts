// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ym
{

    final yn a;

    public ym(yn yn1)
    {
        a = yn1;
    }

    void a(List list)
    {
_L8:
        int i;
        int j;
        i = list.size() - 1;
        j = 0;
_L5:
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (((wj)list.get(i)).a != 3) goto _L4; else goto _L3
_L3:
        int k;
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i;
_L6:
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = k + 1;
        wj wj3 = (wj)list.get(k);
        wj wj4 = (wj)list.get(l);
        switch (wj4.a)
        {
        default:
            break;

        case 0: // '\0'
            wj wj2;
            int i1;
            int j1;
            int k1;
            if (wj3.d < wj4.b)
            {
                i = -1;
            } else
            {
                i = 0;
            }
            j = i;
            if (wj3.b < wj4.b)
            {
                j = i + 1;
            }
            if (wj4.b <= wj3.b)
            {
                wj3.b = wj3.b + wj4.d;
            }
            if (wj4.b <= wj3.d)
            {
                wj3.d = wj3.d + wj4.d;
            }
            wj4.b = j + wj4.b;
            list.set(k, wj4);
            list.set(l, wj3);
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            wj wj1;
            boolean flag;
            if (wj3.b < wj3.d)
            {
                if (wj4.b == wj3.b && wj4.d == wj3.d - wj3.b)
                {
                    i = 0;
                    flag = true;
                } else
                {
                    i = 0;
                    flag = false;
                }
            } else
            if (wj4.b == wj3.d + 1 && wj4.d == wj3.b - wj3.d)
            {
                i = 1;
                flag = true;
            } else
            {
                i = 1;
                flag = false;
            }
            if (wj3.d < wj4.b)
            {
                wj4.b = wj4.b - 1;
            } else
            if (wj3.d < wj4.b + wj4.d)
            {
                wj4.d = wj4.d - 1;
                wj3.a = 1;
                wj3.d = 1;
                if (wj4.d == 0)
                {
                    list.remove(l);
                    a.a(wj4);
                }
                continue; /* Loop/switch isn't completed */
            }
            if (wj3.b <= wj4.b)
            {
                wj4.b = wj4.b + 1;
                wj1 = null;
            } else
            if (wj3.b < wj4.b + wj4.d)
            {
                i1 = wj4.b;
                j1 = wj4.d;
                k1 = wj3.b;
                wj1 = a.a(1, wj3.b + 1, (i1 + j1) - k1, null);
                wj4.d = wj3.b - wj4.b;
            } else
            {
                wj1 = null;
            }
            if (flag)
            {
                list.set(k, wj4);
                list.remove(l);
                a.a(wj3);
                continue; /* Loop/switch isn't completed */
            }
            if (i != 0)
            {
                if (wj1 != null)
                {
                    if (wj3.b > wj1.b)
                    {
                        wj3.b = wj3.b - wj1.d;
                    }
                    if (wj3.d > wj1.b)
                    {
                        wj3.d = wj3.d - wj1.d;
                    }
                }
                if (wj3.b > wj4.b)
                {
                    wj3.b = wj3.b - wj4.d;
                }
                if (wj3.d > wj4.b)
                {
                    wj3.d = wj3.d - wj4.d;
                }
            } else
            {
                if (wj1 != null)
                {
                    if (wj3.b >= wj1.b)
                    {
                        wj3.b = wj3.b - wj1.d;
                    }
                    if (wj3.d >= wj1.b)
                    {
                        wj3.d = wj3.d - wj1.d;
                    }
                }
                if (wj3.b >= wj4.b)
                {
                    wj3.b = wj3.b - wj4.d;
                }
                if (wj3.d >= wj4.b)
                {
                    wj3.d = wj3.d - wj4.d;
                }
            }
            list.set(k, wj4);
            if (wj3.b != wj3.d)
            {
                list.set(l, wj3);
            } else
            {
                list.remove(l);
            }
            if (wj1 != null)
            {
                list.add(k, wj1);
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            if (wj3.d < wj4.b)
            {
                wj4.b = wj4.b - 1;
                wj1 = null;
            } else
            if (wj3.d < wj4.b + wj4.d)
            {
                wj4.d = wj4.d - 1;
                wj1 = a.a(2, wj3.b, 1, wj4.c);
            } else
            {
                wj1 = null;
            }
            if (wj3.b <= wj4.b)
            {
                wj4.b = wj4.b + 1;
                wj2 = null;
            } else
            if (wj3.b < wj4.b + wj4.d)
            {
                i = (wj4.b + wj4.d) - wj3.b;
                wj2 = a.a(2, wj3.b + 1, i, wj4.c);
                wj4.d = wj4.d - i;
            } else
            {
                wj2 = null;
            }
            list.set(l, wj3);
            if (wj4.d > 0)
            {
                list.set(k, wj4);
            } else
            {
                list.remove(k);
                a.a(wj4);
            }
            if (wj1 != null)
            {
                list.add(k, wj1);
            }
            if (wj2 != null)
            {
                list.add(k, wj2);
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j = 1;
        i--;
          goto _L5
_L2:
        k = -1;
          goto _L6
        if (true) goto _L8; else goto _L7
_L7:
    }
}
