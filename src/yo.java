// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class yo
{

    final yp a;

    public yo(yp yp1)
    {
        a = yp1;
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
        if (((wl)list.get(i)).a != 3) goto _L4; else goto _L3
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
        wl wl3 = (wl)list.get(k);
        wl wl4 = (wl)list.get(l);
        switch (wl4.a)
        {
        default:
            break;

        case 0: // '\0'
            wl wl2;
            int i1;
            int j1;
            int k1;
            if (wl3.d < wl4.b)
            {
                i = -1;
            } else
            {
                i = 0;
            }
            j = i;
            if (wl3.b < wl4.b)
            {
                j = i + 1;
            }
            if (wl4.b <= wl3.b)
            {
                wl3.b = wl3.b + wl4.d;
            }
            if (wl4.b <= wl3.d)
            {
                wl3.d = wl3.d + wl4.d;
            }
            wl4.b = j + wl4.b;
            list.set(k, wl4);
            list.set(l, wl3);
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            wl wl1;
            boolean flag;
            if (wl3.b < wl3.d)
            {
                if (wl4.b == wl3.b && wl4.d == wl3.d - wl3.b)
                {
                    i = 0;
                    flag = true;
                } else
                {
                    i = 0;
                    flag = false;
                }
            } else
            if (wl4.b == wl3.d + 1 && wl4.d == wl3.b - wl3.d)
            {
                i = 1;
                flag = true;
            } else
            {
                i = 1;
                flag = false;
            }
            if (wl3.d < wl4.b)
            {
                wl4.b = wl4.b - 1;
            } else
            if (wl3.d < wl4.b + wl4.d)
            {
                wl4.d = wl4.d - 1;
                wl3.a = 1;
                wl3.d = 1;
                if (wl4.d == 0)
                {
                    list.remove(l);
                    a.a(wl4);
                }
                continue; /* Loop/switch isn't completed */
            }
            if (wl3.b <= wl4.b)
            {
                wl4.b = wl4.b + 1;
                wl1 = null;
            } else
            if (wl3.b < wl4.b + wl4.d)
            {
                i1 = wl4.b;
                j1 = wl4.d;
                k1 = wl3.b;
                wl1 = a.a(1, wl3.b + 1, (i1 + j1) - k1, null);
                wl4.d = wl3.b - wl4.b;
            } else
            {
                wl1 = null;
            }
            if (flag)
            {
                list.set(k, wl4);
                list.remove(l);
                a.a(wl3);
                continue; /* Loop/switch isn't completed */
            }
            if (i != 0)
            {
                if (wl1 != null)
                {
                    if (wl3.b > wl1.b)
                    {
                        wl3.b = wl3.b - wl1.d;
                    }
                    if (wl3.d > wl1.b)
                    {
                        wl3.d = wl3.d - wl1.d;
                    }
                }
                if (wl3.b > wl4.b)
                {
                    wl3.b = wl3.b - wl4.d;
                }
                if (wl3.d > wl4.b)
                {
                    wl3.d = wl3.d - wl4.d;
                }
            } else
            {
                if (wl1 != null)
                {
                    if (wl3.b >= wl1.b)
                    {
                        wl3.b = wl3.b - wl1.d;
                    }
                    if (wl3.d >= wl1.b)
                    {
                        wl3.d = wl3.d - wl1.d;
                    }
                }
                if (wl3.b >= wl4.b)
                {
                    wl3.b = wl3.b - wl4.d;
                }
                if (wl3.d >= wl4.b)
                {
                    wl3.d = wl3.d - wl4.d;
                }
            }
            list.set(k, wl4);
            if (wl3.b != wl3.d)
            {
                list.set(l, wl3);
            } else
            {
                list.remove(l);
            }
            if (wl1 != null)
            {
                list.add(k, wl1);
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            if (wl3.d < wl4.b)
            {
                wl4.b = wl4.b - 1;
                wl1 = null;
            } else
            if (wl3.d < wl4.b + wl4.d)
            {
                wl4.d = wl4.d - 1;
                wl1 = a.a(2, wl3.b, 1, wl4.c);
            } else
            {
                wl1 = null;
            }
            if (wl3.b <= wl4.b)
            {
                wl4.b = wl4.b + 1;
                wl2 = null;
            } else
            if (wl3.b < wl4.b + wl4.d)
            {
                i = (wl4.b + wl4.d) - wl3.b;
                wl2 = a.a(2, wl3.b + 1, i, wl4.c);
                wl4.d = wl4.d - i;
            } else
            {
                wl2 = null;
            }
            list.set(l, wl3);
            if (wl4.d > 0)
            {
                list.set(k, wl4);
            } else
            {
                list.remove(k);
                a.a(wl4);
            }
            if (wl1 != null)
            {
                list.add(k, wl1);
            }
            if (wl2 != null)
            {
                list.add(k, wl2);
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
