// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fgi
    implements Cloneable
{

    private static final fgj a = new fgj();
    private boolean b;
    private int c[];
    private fgj d[];
    private int e;

    public fgi()
    {
        this(10);
    }

    private fgi(int i)
    {
        b = false;
        i = c(i);
        c = new int[i];
        d = new fgj[i];
        e = 0;
    }

    private static int c(int i)
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

    private int d(int i)
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

    private void d()
    {
        int l = e;
        int ai[] = c;
        fgj afgj[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            fgj fgj1 = afgj[i];
            k = j;
            if (fgj1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    afgj[j] = fgj1;
                    afgj[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    public int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public fgj a(int i)
    {
        i = d(i);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    public void a(int i, fgj fgj1)
    {
        int j = d(i);
        if (j >= 0)
        {
            d[j] = fgj1;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = fgj1;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                d();
                j = ~d(i);
            }
        }
        if (e >= c.length)
        {
            int l = c(e + 1);
            int ai[] = new int[l];
            fgj afgj[] = new fgj[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(d, 0, afgj, 0, d.length);
            c = ai;
            d = afgj;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(d, j, d, j + 1, e - j);
        }
        c[j] = i;
        d[j] = fgj1;
        e = e + 1;
    }

    public fgj b(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public boolean b()
    {
        return a() == 0;
    }

    public final fgi c()
    {
        int i = 0;
        int j = a();
        fgi fgi1 = new fgi(j);
        System.arraycopy(c, 0, fgi1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                fgi1.d[i] = d[i].b();
            }
        }

        fgi1.e = j;
        return fgi1;
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
        if (!(obj instanceof fgi))
        {
            return false;
        }
        obj = (fgi)obj;
        if (a() != ((fgi) (obj)).a())
        {
            return false;
        }
        aobj = c;
        ai = ((fgi) (obj)).c;
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
        obj = ((fgi) (obj)).d;
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
