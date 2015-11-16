// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kol
    implements Cloneable
{

    private static final kom a = new kom();
    private boolean b;
    private int c[];
    private kom d[];
    private int e;

    kol()
    {
        this(10);
    }

    private kol(int i)
    {
        b = false;
        i = d(i);
        c = new int[i];
        d = new kom[i];
        e = 0;
    }

    private static int d(int i)
    {
        int k = i << 2;
        i = 4;
        do
        {
label0:
            {
                int j = k;
                if (i < 32)
                {
                    if (k > (1 << i) - 12)
                    {
                        break label0;
                    }
                    j = (1 << i) - 12;
                }
                return j / 4;
            }
            i++;
        } while (true);
    }

    private void d()
    {
        int l = e;
        int ai[] = c;
        kom akom[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            kom kom1 = akom[i];
            k = j;
            if (kom1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    akom[j] = kom1;
                    akom[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    private int e(int i)
    {
        int k;
label0:
        {
            k = e;
            int j = 0;
            for (k--; j <= k;)
            {
                int l = j + k >>> 1;
                int i1 = c[l];
                if (i1 < i)
                {
                    j = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= i)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~j;
        }
        return k;
    }

    int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    kom a(int i)
    {
        i = e(i);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    void a(int i, kom kom1)
    {
        int j = e(i);
        if (j >= 0)
        {
            d[j] = kom1;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = kom1;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                d();
                j = ~e(i);
            }
        }
        if (e >= c.length)
        {
            int l = d(e + 1);
            int ai[] = new int[l];
            kom akom[] = new kom[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(d, 0, akom, 0, d.length);
            c = ai;
            d = akom;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(d, j, d, j + 1, e - j);
        }
        c[j] = i;
        d[j] = kom1;
        e = e + 1;
    }

    void b(int i)
    {
        i = e(i);
        if (i >= 0 && d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public boolean b()
    {
        return a() == 0;
    }

    public final kol c()
    {
        int i = 0;
        int j = a();
        kol kol1 = new kol(j);
        System.arraycopy(c, 0, kol1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                kol1.d[i] = d[i].b();
            }
        }

        kol1.e = j;
        return kol1;
    }

    kom c(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public Object clone()
    {
        return c();
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object aobj[];
        int ai[];
        int i;
        int j;
        if (!(obj instanceof kol))
        {
            return false;
        }
        obj = (kol)obj;
        if (a() != ((kol) (obj)).a())
        {
            return false;
        }
        aobj = c;
        ai = ((kol) (obj)).c;
        j = e;
        i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (aobj[i] == ai[i]) goto _L6; else goto _L5
_L5:
        i = 0;
_L11:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = d;
        obj = ((kol) (obj)).d;
        j = e;
        i = 0;
_L12:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (aobj[i].equals(obj[i])) goto _L8; else goto _L7
_L7:
        i = 0;
_L13:
        if (i != 0) goto _L1; else goto _L9
_L9:
        return false;
_L6:
        i++;
          goto _L10
_L4:
        i = 1;
          goto _L11
_L8:
        i++;
          goto _L12
        i = 1;
          goto _L13
    }

    public int hashCode()
    {
        if (b)
        {
            d();
        }
        int j = 17;
        for (int i = 0; i < e; i++)
        {
            j = (j * 31 + c[i]) * 31 + d[i].hashCode();
        }

        return j;
    }

}
