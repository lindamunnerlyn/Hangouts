// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class wh
    implements yn
{

    final ArrayList a;
    final ArrayList b;
    final wi c;
    Runnable d;
    final boolean e;
    final ym f;
    private hl g;

    wh(wi wi1)
    {
        this(wi1, (byte)0);
    }

    private wh(wi wi1, byte byte0)
    {
        g = new hl();
        a = new ArrayList();
        b = new ArrayList();
        c = wi1;
        e = false;
        f = new ym(this);
    }

    private void a(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            a((wj)list.get(i));
        }

        list.clear();
    }

    private void a(wj wj1, int i)
    {
        c.a(wj1);
        switch (wj1.a)
        {
        default:
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");

        case 1: // '\001'
            c.a(i, wj1.d);
            return;

        case 2: // '\002'
            c.a(i, wj1.d, wj1.c);
            break;
        }
    }

    private void b(wj wj1)
    {
        int j;
        int j1;
        if (wj1.a == 0 || wj1.a == 3)
        {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        j1 = c(wj1.b, wj1.a);
        j = wj1.b;
        wj1.a;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 183
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("op should be remove or update.")).append(wj1).toString());
_L3:
        int k = 1;
_L8:
        int l;
        int i1;
        i1 = 1;
        l = 1;
_L7:
        int k1;
        if (l >= wj1.d)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        k1 = c(wj1.b + k * l, wj1.a);
        wj1.a;
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
            wj wj2 = a(wj1.a, j1, i1, wj1.c);
            a(wj2, j);
            a(wj2);
            i = j;
            if (wj1.a == 2)
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
        Object obj = wj1.c;
        a(wj1);
        if (i1 > 0)
        {
            wj1 = a(wj1.a, j1, i1, obj);
            a(wj1, j);
            a(wj1);
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
            wj wj1 = (wj)b.get(j);
            if (wj1.a == 3)
            {
                if (d(wj1.d, j + 1) == i)
                {
                    return true;
                }
                continue;
            }
            if (wj1.a != 0)
            {
                continue;
            }
            int i1 = wj1.b;
            int j1 = wj1.d;
            int k = wj1.b;
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
                wj wj1 = (wj)b.get(k);
                if (wj1.a == 3)
                {
                    int l;
                    int i1;
                    if (wj1.b < wj1.d)
                    {
                        i1 = wj1.b;
                        l = wj1.d;
                    } else
                    {
                        i1 = wj1.d;
                        l = wj1.b;
                    }
                    if (i >= i1 && i <= l)
                    {
                        if (i1 == wj1.b)
                        {
                            if (j == 0)
                            {
                                wj1.d = wj1.d + 1;
                            } else
                            if (j == 1)
                            {
                                wj1.d = wj1.d - 1;
                            }
                            i++;
                        } else
                        {
                            if (j == 0)
                            {
                                wj1.b = wj1.b + 1;
                            } else
                            if (j == 1)
                            {
                                wj1.b = wj1.b - 1;
                            }
                            i--;
                        }
                    } else
                    if (i < wj1.b)
                    {
                        if (j == 0)
                        {
                            wj1.b = wj1.b + 1;
                            wj1.d = wj1.d + 1;
                        } else
                        if (j == 1)
                        {
                            wj1.b = wj1.b - 1;
                            wj1.d = wj1.d - 1;
                        }
                    }
                } else
                if (wj1.b <= i)
                {
                    if (wj1.a == 0)
                    {
                        i -= wj1.d;
                    } else
                    if (wj1.a == 1)
                    {
                        i = wj1.d + i;
                    }
                } else
                if (j == 0)
                {
                    wj1.b = wj1.b + 1;
                } else
                if (j == 1)
                {
                    wj1.b = wj1.b - 1;
                }
                k--;
                continue;
            }
            j = b.size() - 1;
            while (j >= 0) 
            {
                wj wj2 = (wj)b.get(j);
                if (wj2.a == 3)
                {
                    if (wj2.d == wj2.b || wj2.d < 0)
                    {
                        b.remove(j);
                        a(wj2);
                    }
                } else
                if (wj2.d <= 0)
                {
                    b.remove(j);
                    a(wj2);
                }
                j--;
            }
            return i;
        } while (true);
    }

    private void c(wj wj1)
    {
        b.add(wj1);
        switch (wj1.a)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown update op type for ")).append(wj1).toString());

        case 0: // '\0'
            c.c(wj1.b, wj1.d);
            return;

        case 3: // '\003'
            c.d(wj1.b, wj1.d);
            return;

        case 1: // '\001'
            c.b(wj1.b, wj1.d);
            return;

        case 2: // '\002'
            c.a(wj1.b, wj1.d, wj1.c);
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
        wj wj1 = (wj)b.get(l);
        if (wj1.a != 3) goto _L4; else goto _L3
_L3:
        if (wj1.b == j)
        {
            i = wj1.d;
        } else
        {
            int k = j;
            if (wj1.b < j)
            {
                k = j - 1;
            }
            i = k;
            if (wj1.d <= k)
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
        if (wj1.b > j) goto _L7; else goto _L6
_L6:
        if (wj1.a != 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (j >= wj1.b + wj1.d) goto _L9; else goto _L8
_L8:
        i = -1;
_L2:
        return i;
_L9:
        i = j - wj1.d;
          goto _L7
        i = j;
        if (wj1.a == 0)
        {
            i = j + wj1.d;
        }
          goto _L7
    }

    int a(int i)
    {
        return d(i, 0);
    }

    public wj a(int i, int j, int k, Object obj)
    {
        wj wj1 = (wj)g.a();
        if (wj1 == null)
        {
            return new wj(i, j, k, obj);
        } else
        {
            wj1.a = i;
            wj1.b = j;
            wj1.d = k;
            wj1.c = obj;
            return wj1;
        }
    }

    void a()
    {
        a(((List) (a)));
        a(((List) (b)));
    }

    public void a(wj wj1)
    {
        if (!e)
        {
            wj1.c = null;
            g.a(wj1);
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
        wj wj1;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        wj1 = (wj)a.get(j1);
        wj1.a;
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
        c(wj1);
          goto _L8
_L3:
        int i2 = wj1.b;
        int k = wj1.b + wj1.d;
        int i = wj1.b;
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
        obj = wj1;
        if (i1 != wj1.d)
        {
            a(wj1);
            obj = a(1, i2, i1, null);
        }
        if (j == 0)
        {
            b(((wj) (obj)));
        } else
        {
            c(((wj) (obj)));
        }
          goto _L8
_L4:
        k = wj1.b;
        i2 = wj1.b;
        j2 = wj1.d;
        i = wj1.b;
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
                    b(a(2, k, j, wj1.c));
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
                    c(a(2, k, j, wj1.c));
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
        obj = wj1;
        if (j != wj1.d)
        {
            obj = wj1.c;
            a(wj1);
            obj = a(2, k, j, obj);
        }
        if (k1 == 0)
        {
            b(((wj) (obj)));
        } else
        {
            c(((wj) (obj)));
        }
          goto _L8
        c(wj1);
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
            c.b((wj)b.get(i));
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
        wj wj1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        wj1 = (wj)a.get(i);
        wj1.a;
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
        c.b(wj1);
        c.c(wj1.b, wj1.d);
          goto _L8
_L3:
        c.b(wj1);
        c.a(wj1.b, wj1.d);
          goto _L8
_L4:
        c.b(wj1);
        c.a(wj1.b, wj1.d, wj1.c);
          goto _L8
        c.b(wj1);
        c.d(wj1.b, wj1.d);
          goto _L8
        a(a);
        return;
    }
}
