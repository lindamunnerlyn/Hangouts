// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lki extends kwm
{

    private static volatile lki i[];
    public lhc a;
    public lgo b;
    public String c;
    public lky d[];
    public String e;
    public lic f[];
    public lkk g[];
    public Integer h;

    public lki()
    {
        a = null;
        b = null;
        c = null;
        d = lky.a();
        e = null;
        f = lic.a();
        g = lkk.a();
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lki[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new lki[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.d(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.b(3, c);
        }
        int l = j;
        if (d != null)
        {
            l = j;
            if (d.length > 0)
            {
                for (k = 0; k < d.length;)
                {
                    lky lky1 = d[k];
                    l = j;
                    if (lky1 != null)
                    {
                        l = j + kwk.d(4, lky1);
                    }
                    k++;
                    j = l;
                }

                l = j;
            }
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.b(5, e);
        }
        j = k;
        if (f != null)
        {
            j = k;
            if (f.length > 0)
            {
                j = k;
                for (k = 0; k < f.length;)
                {
                    lic lic1 = f[k];
                    int i1 = j;
                    if (lic1 != null)
                    {
                        i1 = j + kwk.d(6, lic1);
                    }
                    k++;
                    j = i1;
                }

            }
        }
        k = j;
        if (g != null)
        {
            k = j;
            if (g.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (j1 >= g.length)
                    {
                        break;
                    }
                    lkk lkk1 = g[j1];
                    k = j;
                    if (lkk1 != null)
                    {
                        k = j + kwk.d(7, lkk1);
                    }
                    j1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (h != null)
        {
            j = k + kwk.e(8, h.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int j = kwj1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kwj1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new lhc();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new lgo();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                int j1 = kwx.a(kwj1, 34);
                lky alky[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                alky = new lky[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, alky, 0, k);
                    j1 = k;
                }
                for (; j1 < alky.length - 1; j1++)
                {
                    alky[j1] = new lky();
                    kwj1.a(alky[j1]);
                    kwj1.a();
                }

                alky[j1] = new lky();
                kwj1.a(alky[j1]);
                d = alky;
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                int k1 = kwx.a(kwj1, 50);
                lic alic[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                alic = new lic[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, alic, 0, l);
                    k1 = l;
                }
                for (; k1 < alic.length - 1; k1++)
                {
                    alic[k1] = new lic();
                    kwj1.a(alic[k1]);
                    kwj1.a();
                }

                alic[k1] = new lic();
                kwj1.a(alic[k1]);
                f = alic;
                break;

            case 58: // ':'
                int l1 = kwx.a(kwj1, 58);
                lkk alkk[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                alkk = new lkk[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(g, 0, alkk, 0, i1);
                    l1 = i1;
                }
                for (; l1 < alkk.length - 1; l1++)
                {
                    alkk[l1] = new lkk();
                    kwj1.a(alkk[l1]);
                    kwj1.a();
                }

                alkk[l1] = new lkk();
                kwj1.a(alkk[l1]);
                g = alkk;
                break;

            case 64: // '@'
                h = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                lky lky1 = d[j];
                if (lky1 != null)
                {
                    kwk1.b(4, lky1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                lic lic1 = f[k];
                if (lic1 != null)
                {
                    kwk1.b(6, lic1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < g.length; l++)
            {
                lkk lkk1 = g[l];
                if (lkk1 != null)
                {
                    kwk1.b(7, lkk1);
                }
            }

        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        super.writeTo(kwk1);
    }
}
