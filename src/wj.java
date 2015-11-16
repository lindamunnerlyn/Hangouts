// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class wj
    implements yp
{

    final ArrayList a;
    final ArrayList b;
    final wk c;
    Runnable d;
    final boolean e;
    final yo f;
    private hl g;

    wj(wk wk1)
    {
        this(wk1, (byte)0);
    }

    private wj(wk wk1, byte byte0)
    {
        g = new hl();
        a = new ArrayList();
        b = new ArrayList();
        c = wk1;
        e = false;
        f = new yo(this);
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((wl)list.get(i));
        }

        list.clear();
    }

    private void a(wl wl1, int i)
    {
        c.a(wl1);
        switch (wl1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, wl1.d);
            return;

        case 2: // '\002'
            c.a(i, wl1.d, wl1.c);
            break;
        }
    }

    private void b(wl wl1)
    {
        int j;
        int j1;
        if (wl1.a == 0 || wl1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = c(wl1.b, wl1.a);
        j = wl1.b;
        wl1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(wl1).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= wl1.d)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        k1 = c(wl1.b + k * l, wl1.a);
        wl1.a;
        JVM INSTR tableswitch 1 2: default 160
    //                   1 208
    //                   2 189;
           goto _L4 _L5 _L6
_L4:
        int i = 0;
_L9:
        if (i != 0)
        {
            i = i1 + 1;
        } else
        {
            wl wl2 = a(wl1.a, j1, i1, wl1.c);
            a(wl2, j);
            a(wl2);
            i = j;
            if (wl1.a == 2)
            {
                i = j + i1;
            }
            i1 = 1;
            j1 = k1;
            j = i;
            i = i1;
        }
        l++;
        i1 = i;
          goto _L7
_L2:
        k = 0;
          goto _L8
_L6:
        if (k1 == j1 + 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
_L5:
        if (k1 == j1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
        Object obj = wl1.c;
        a(wl1);
        if (i1 > 0)
        {
            wl1 = a(wl1.a, j1, i1, obj);
            a(wl1, j);
            a(wl1);
        }
        return;
          goto _L7
    }

    private boolean b(int i)
    {
        int l = b.size();
label0:
        for (int j = 0; j < l; j++)
        {
            wl wl1 = (wl)b.get(j);
            if (wl1.a == 3)
            {
                if (d(wl1.d, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (wl1.a != 0)
            {
                continue;
            }
            int i1 = wl1.b;
            int j1 = wl1.d;
            int k = wl1.b;
            do
            {
                if (k >= i1 + j1)
                {
                    continue label0;
                }
                if (d(k, j + 1) == i)
                {
                    return true;
                }
                k++;
            } while (true);
        }

        return false;
    }

    private int c(int i, int j)
    {
        int k = b.size() - 1;
        do
        {
            if (k >= 0)
            {
                wl wl1 = (wl)b.get(k);
                if (wl1.a == 3)
                {
                    int l;
                    int i1;
                    if (wl1.b < wl1.d)
                    {
                        i1 = wl1.b;
                        l = wl1.d;
                    } else
                    {
                        i1 = wl1.d;
                        l = wl1.b;
                    }
                    if (i >= i1 && i <= l)
                    {
                        if (i1 == wl1.b)
                        {
                            if (j == 0)
                            {
                                wl1.d = wl1.d + 1;
                            } else
                            if (j == 1)
                            {
                                wl1.d = wl1.d - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                wl1.b = wl1.b + 1;
                            } else
                            if (j == 1)
                            {
                                wl1.b = wl1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < wl1.b)
                    {
                        if (j == 0)
                        {
                            wl1.b = wl1.b + 1;
                            wl1.d = wl1.d + 1;
                        } else
                        if (j == 1)
                        {
                            wl1.b = wl1.b - 1;
                            wl1.d = wl1.d - 1;
                        }
                    }
                } else
                if (wl1.b <= i)
                {
                    if (wl1.a == 0)
                    {
                        i -= wl1.d;
                    } else
                    if (wl1.a == 1)
                    {
                        i = wl1.d + i;
                    }
                } else
                if (j == 0)
                {
                    wl1.b = wl1.b + 1;
                } else
                if (j == 1)
                {
                    wl1.b = wl1.b - 1;
                }
                k--;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                wl wl2 = (wl)b.get(j);
                if (wl2.a == 3)
                {
                    if (wl2.d == wl2.b || wl2.d < 0)
                    {
                        b.remove(j);
                        a(wl2);
                    }
                } else
                if (wl2.d <= 0)
                {
                    b.remove(j);
                    a(wl2);
                }
                j--;
            }
            return i;
        } while (true);
    }

    private void c(wl wl1)
    {
        b.add(wl1);
        switch (wl1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(wl1).toString());

        case 0: // '\0'
            c.c(wl1.b, wl1.d);
            return;

        case 3: // '\003'
            c.d(wl1.b, wl1.d);
            return;

        case 1: // '\001'
            c.b(wl1.b, wl1.d);
            return;

        case 2: // '\002'
            c.a(wl1.b, wl1.d, wl1.c);
            return;
        }
    }

    private int d(int i, int j)
    {
        int l;
        int i1;
        i1 = b.size();
        l = j;
        j = i;
_L5:
        i = j;
        if (l >= i1) goto _L2; else goto _L1
_L1:
        wl wl1 = (wl)b.get(l);
        if (wl1.a != 3) goto _L4; else goto _L3
_L3:
        if (wl1.b == j)
        {
            i = wl1.d;
        } else
        {
            int k = j;
            if (wl1.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (wl1.d <= k)
            {
                i = k + 1;
            }
        }
_L7:
        l++;
        j = i;
          goto _L5
_L4:
        i = j;
        if (wl1.b > j) goto _L7; else goto _L6
_L6:
        if (wl1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= wl1.b + wl1.d) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - wl1.d;
          goto _L7
        i = j;
        if (wl1.a == 0)
        {
            i = j + wl1.d;
        }
          goto _L7
    }

    int a(int i)
    {
        return d(i, 0);
    }

    public wl a(int i, int j, int k, Object obj)
    {
        wl wl1 = (wl)g.a();
        if (wl1 == null)
        {
            return new wl(i, j, k, obj);
        } else
        {
            wl1.a = i;
            wl1.b = j;
            wl1.d = k;
            wl1.c = obj;
            return wl1;
        }
    }

    void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public void a(wl wl1)
    {
        if (!e)
        {
            wl1.c = null;
            g.a(wl1);
        }
    }

    boolean a(int i, int j)
    {
        a.add(a(0, i, j, null));
        return a.size() == 1;
    }

    boolean a(int i, int j, Object obj)
    {
        a.add(a(2, i, j, obj));
        return a.size() == 1;
    }

    void b()
    {
        int j1;
        int l1;
        f.a(a);
        l1 = a.size();
        j1 = 0;
_L7:
        wl wl1;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        wl1 = (wl)a.get(j1);
        wl1.a;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 101
    //                   1 109
    //                   2 328
    //                   3 551;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_551;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        if (d != null)
        {
            d.run();
        }
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        c(wl1);
          goto _L8
_L3:
        int i2 = wl1.b;
        int k = wl1.b + wl1.d;
        int i = wl1.b;
        int j = -1;
        int i1 = 0;
        while (i < k) 
        {
            if (c.a(i) != null || b(i))
            {
                Object obj;
                int l;
                int k1;
                int j2;
                if (j == 0)
                {
                    b(a(1, i2, i1, null));
                    l = 1;
                } else
                {
                    l = 0;
                }
                j = 1;
            } else
            {
                if (j == 1)
                {
                    c(a(1, i2, i1, null));
                    j = 1;
                } else
                {
                    j = 0;
                }
                k1 = 0;
                l = j;
                j = k1;
            }
            if (l != 0)
            {
                l = i - i1;
                i = k - i1;
                k = 1;
            } else
            {
                i1++;
                l = i;
                i = k;
                k = i1;
            }
            i1 = k;
            k = i;
            i = l + 1;
        }
        obj = wl1;
        if (i1 != wl1.d)
        {
            a(wl1);
            obj = a(1, i2, i1, null);
        }
        if (j == 0)
        {
            b(((wl) (obj)));
        } else
        {
            c(((wl) (obj)));
        }
          goto _L8
_L4:
        k = wl1.b;
        i2 = wl1.b;
        j2 = wl1.d;
        i = wl1.b;
        k1 = -1;
        j = 0;
        while (i < i2 + j2) 
        {
            if (c.a(i) != null || b(i))
            {
                l = j;
                i1 = k;
                if (k1 == 0)
                {
                    b(a(2, k, j, wl1.c));
                    l = 0;
                    i1 = i;
                }
                k = i1;
                j = 1;
            } else
            {
                l = j;
                i1 = k;
                if (k1 == 1)
                {
                    c(a(2, k, j, wl1.c));
                    l = 0;
                    i1 = i;
                }
                k = i1;
                j = 0;
            }
            i++;
            l++;
            k1 = j;
            j = l;
        }
        obj = wl1;
        if (j != wl1.d)
        {
            obj = wl1.c;
            a(wl1);
            obj = a(2, k, j, obj);
        }
        if (k1 == 0)
        {
            b(((wl) (obj)));
        } else
        {
            c(((wl) (obj)));
        }
          goto _L8
        c(wl1);
          goto _L8
        a.clear();
        return;
    }

    boolean b(int i, int j)
    {
        a.add(a(1, i, j, null));
        return a.size() == 1;
    }

    void c()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            c.b((wl)b.get(i));
        }

        a(b);
    }

    boolean d()
    {
        return a.size() > 0;
    }

    void e()
    {
        int i;
        int j;
        c();
        j = a.size();
        i = 0;
_L7:
        wl wl1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        wl1 = (wl)a.get(i);
        wl1.a;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 87
    //                   1 117
    //                   2 147
    //                   3 181;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_181;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        if (d != null)
        {
            d.run();
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        c.b(wl1);
        c.c(wl1.b, wl1.d);
          goto _L8
_L3:
        c.b(wl1);
        c.a(wl1.b, wl1.d);
          goto _L8
_L4:
        c.b(wl1);
        c.a(wl1.b, wl1.d, wl1.c);
          goto _L8
        c.b(wl1);
        c.d(wl1.b, wl1.d);
          goto _L8
        a(a);
        return;
    }
}
