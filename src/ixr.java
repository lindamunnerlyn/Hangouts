// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixr extends kwm
{

    private static volatile ixr i[];
    public ixl a;
    public Long b;
    public ixg c;
    public iza d[];
    public ize e;
    public ize f;
    public Boolean g;
    public iyb h[];

    public ixr()
    {
        a = null;
        b = null;
        c = null;
        d = iza.a();
        e = null;
        f = null;
        g = null;
        h = iyb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ixr[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new ixr[0];
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
        int j = super.computeSerializedSize();
        int k = j;
        if (a != null)
        {
            k = j + kwk.d(1, a);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.d(2, c);
        }
        k = j;
        if (d != null)
        {
            k = j;
            if (d.length > 0)
            {
                for (k = 0; k < d.length;)
                {
                    iza iza1 = d[k];
                    int l = j;
                    if (iza1 != null)
                    {
                        l = j + kwk.d(3, iza1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        j = k;
        if (g != null)
        {
            g.booleanValue();
            j = k + (kwk.f(4) + 1);
        }
        k = j;
        if (e != null)
        {
            k = j + kwk.d(5, e);
        }
        j = k;
        if (b != null)
        {
            j = k + kwk.d(6, b.longValue());
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (i1 >= h.length)
                    {
                        break;
                    }
                    iyb iyb1 = h[i1];
                    k = j;
                    if (iyb1 != null)
                    {
                        k = j + kwk.d(7, iyb1);
                    }
                    i1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (f != null)
        {
            j = k + kwk.d(8, f);
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
                    a = new ixl();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new ixg();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                iza aiza[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aiza = new iza[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aiza, 0, k);
                    i1 = k;
                }
                for (; i1 < aiza.length - 1; i1++)
                {
                    aiza[i1] = new iza();
                    kwj1.a(aiza[i1]);
                    kwj1.a();
                }

                aiza[i1] = new iza();
                kwj1.a(aiza[i1]);
                d = aiza;
                break;

            case 32: // ' '
                g = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ize();
                }
                kwj1.a(e);
                break;

            case 48: // '0'
                b = Long.valueOf(kwj1.d());
                break;

            case 58: // ':'
                int j1 = kwx.a(kwj1, 58);
                iyb aiyb[];
                int l;
                if (h == null)
                {
                    l = 0;
                } else
                {
                    l = h.length;
                }
                aiyb = new iyb[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(h, 0, aiyb, 0, l);
                    j1 = l;
                }
                for (; j1 < aiyb.length - 1; j1++)
                {
                    aiyb[j1] = new iyb();
                    kwj1.a(aiyb[j1]);
                    kwj1.a();
                }

                aiyb[j1] = new iyb();
                kwj1.a(aiyb[j1]);
                h = aiyb;
                break;

            case 66: // 'B'
                if (f == null)
                {
                    f = new ize();
                }
                kwj1.a(f);
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
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                iza iza1 = d[j];
                if (iza1 != null)
                {
                    kwk1.b(3, iza1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(4, g.booleanValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (b != null)
        {
            kwk1.a(6, b.longValue());
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                iyb iyb1 = h[k];
                if (iyb1 != null)
                {
                    kwk1.b(7, iyb1);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(8, f);
        }
        super.writeTo(kwk1);
    }
}
