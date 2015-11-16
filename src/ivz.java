// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivz extends kwm
{

    public iwf a[];
    public Integer b;
    public String c;
    public String d[];
    public String e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public String n;

    public ivz()
    {
        a = iwf.a();
        b = null;
        c = null;
        d = kwx.f;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                for (j1 = 0; j1 < a.length;)
                {
                    iwf iwf1 = a[j1];
                    int k1 = i1;
                    if (iwf1 != null)
                    {
                        k1 = i1 + kwk.d(1, iwf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                int l1 = 0;
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < d.length;)
                {
                    String s = d[j1];
                    int k2 = l1;
                    int j2 = i2;
                    if (s != null)
                    {
                        j2 = i2 + 1;
                        k2 = l1 + kwk.a(s);
                    }
                    j1++;
                    l1 = k2;
                    i2 = j2;
                }

                j1 = i1 + l1 + i2 * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.e(5, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(6, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(7, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(8, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(9, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(10, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(11, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(12, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(13, n);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.e(14, b.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i1 = kwj1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kwj1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l1 = kwx.a(kwj1, 10);
                iwf aiwf[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                aiwf = new iwf[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, aiwf, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aiwf.length - 1; l1++)
                {
                    aiwf[l1] = new iwf();
                    kwj1.a(aiwf[l1]);
                    kwj1.a();
                }

                aiwf[l1] = new iwf();
                kwj1.a(aiwf[l1]);
                a = aiwf;
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 26: // '\032'
                int i2 = kwx.a(kwj1, 26);
                String as[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                as = new String[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, as, 0, k1);
                    i2 = k1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kwj1.j();
                    kwj1.a();
                }

                as[i2] = kwj1.j();
                d = as;
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 40: // '('
                f = Integer.valueOf(kwj1.f());
                break;

            case 48: // '0'
                g = Integer.valueOf(kwj1.f());
                break;

            case 56: // '8'
                h = Integer.valueOf(kwj1.f());
                break;

            case 64: // '@'
                i = Integer.valueOf(kwj1.f());
                break;

            case 72: // 'H'
                j = Integer.valueOf(kwj1.f());
                break;

            case 80: // 'P'
                k = Integer.valueOf(kwj1.f());
                break;

            case 88: // 'X'
                l = Integer.valueOf(kwj1.f());
                break;

            case 96: // '`'
                m = Integer.valueOf(kwj1.f());
                break;

            case 106: // 'j'
                n = kwj1.j();
                break;

            case 112: // 'p'
                b = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                iwf iwf1 = a[i1];
                if (iwf1 != null)
                {
                    kwk1.b(1, iwf1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < d.length; j1++)
            {
                String s = d[j1];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(6, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(7, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(8, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(9, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(10, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(12, m.intValue());
        }
        if (n != null)
        {
            kwk1.a(13, n);
        }
        if (b != null)
        {
            kwk1.a(14, b.intValue());
        }
        super.writeTo(kwk1);
    }
}
