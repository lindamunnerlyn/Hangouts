// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lep extends kwm
{

    public leq a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String e[];
    public String f[];
    public Boolean g;
    public lev h[];
    public Boolean i;
    public leu j[];
    public Boolean k;

    public lep()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        f = kwx.f;
        g = null;
        h = lev.a();
        i = null;
        j = leu.a();
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.d(21, a);
        }
        i1 = l;
        if (b != null)
        {
            b.booleanValue();
            i1 = l + (kwk.f(25) + 1);
        }
        int j1 = i1;
        if (c != null)
        {
            c.booleanValue();
            j1 = i1 + (kwk.f(26) + 1);
        }
        l = j1;
        if (d != null)
        {
            l = j1 + kwk.b(27, d);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l;
            if (e.length > 0)
            {
                i1 = 0;
                j1 = 0;
                int i2;
                int k2;
                for (i2 = 0; i1 < e.length; i2 = k2)
                {
                    String s = e[i1];
                    int i3 = j1;
                    k2 = i2;
                    if (s != null)
                    {
                        k2 = i2 + 1;
                        i3 = j1 + kwk.a(s);
                    }
                    i1++;
                    j1 = i3;
                }

                i1 = l + j1 + i2 * 2;
            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                l = 0;
                j1 = 0;
                int j2;
                int l2;
                for (j2 = 0; l < f.length; j2 = l2)
                {
                    String s1 = f[l];
                    int j3 = j1;
                    l2 = j2;
                    if (s1 != null)
                    {
                        l2 = j2 + 1;
                        j3 = j1 + kwk.a(s1);
                    }
                    l++;
                    j1 = j3;
                }

                j1 = i1 + j1 + j2 * 2;
            }
        }
        l = j1;
        if (g != null)
        {
            g.booleanValue();
            l = j1 + (kwk.f(30) + 1);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l;
            if (h.length > 0)
            {
                for (i1 = 0; i1 < h.length;)
                {
                    lev lev1 = h[i1];
                    int k1 = l;
                    if (lev1 != null)
                    {
                        k1 = l + kwk.d(31, lev1);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (i != null)
        {
            i.booleanValue();
            l = i1 + (kwk.f(32) + 1);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (l1 >= j.length)
                    {
                        break;
                    }
                    leu leu1 = j[l1];
                    i1 = l;
                    if (leu1 != null)
                    {
                        i1 = l + kwk.d(33, leu1);
                    }
                    l1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (k != null)
        {
            k.booleanValue();
            l = i1 + (kwk.f(34) + 1);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int l = kwj1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kwj1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 170: 
                if (a == null)
                {
                    a = new leq();
                }
                kwj1.a(a);
                break;

            case 200: 
                b = Boolean.valueOf(kwj1.i());
                break;

            case 208: 
                c = Boolean.valueOf(kwj1.i());
                break;

            case 218: 
                d = kwj1.j();
                break;

            case 226: 
                int i2 = kwx.a(kwj1, 226);
                String as[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                as = new String[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, as, 0, i1);
                    i2 = i1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kwj1.j();
                    kwj1.a();
                }

                as[i2] = kwj1.j();
                e = as;
                break;

            case 234: 
                int j2 = kwx.a(kwj1, 234);
                String as1[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                as1 = new String[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(f, 0, as1, 0, j1);
                    j2 = j1;
                }
                for (; j2 < as1.length - 1; j2++)
                {
                    as1[j2] = kwj1.j();
                    kwj1.a();
                }

                as1[j2] = kwj1.j();
                f = as1;
                break;

            case 240: 
                g = Boolean.valueOf(kwj1.i());
                break;

            case 250: 
                int k2 = kwx.a(kwj1, 250);
                lev alev[];
                int k1;
                if (h == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = h.length;
                }
                alev = new lev[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(h, 0, alev, 0, k1);
                    k2 = k1;
                }
                for (; k2 < alev.length - 1; k2++)
                {
                    alev[k2] = new lev();
                    kwj1.a(alev[k2]);
                    kwj1.a();
                }

                alev[k2] = new lev();
                kwj1.a(alev[k2]);
                h = alev;
                break;

            case 256: 
                i = Boolean.valueOf(kwj1.i());
                break;

            case 266: 
                int l2 = kwx.a(kwj1, 266);
                leu aleu[];
                int l1;
                if (j == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = j.length;
                }
                aleu = new leu[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(j, 0, aleu, 0, l1);
                    l2 = l1;
                }
                for (; l2 < aleu.length - 1; l2++)
                {
                    aleu[l2] = new leu();
                    kwj1.a(aleu[l2]);
                    kwj1.a();
                }

                aleu[l2] = new leu();
                kwj1.a(aleu[l2]);
                j = aleu;
                break;

            case 272: 
                k = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(21, a);
        }
        if (b != null)
        {
            kwk1.a(25, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(26, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(27, d);
        }
        if (e != null && e.length > 0)
        {
            for (int l = 0; l < e.length; l++)
            {
                String s = e[l];
                if (s != null)
                {
                    kwk1.a(28, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                String s1 = f[i1];
                if (s1 != null)
                {
                    kwk1.a(29, s1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(30, g.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                lev lev1 = h[j1];
                if (lev1 != null)
                {
                    kwk1.b(31, lev1);
                }
            }

        }
        if (i != null)
        {
            kwk1.a(32, i.booleanValue());
        }
        if (j != null && j.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < j.length; k1++)
            {
                leu leu1 = j[k1];
                if (leu1 != null)
                {
                    kwk1.b(33, leu1);
                }
            }

        }
        if (k != null)
        {
            kwk1.a(34, k.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
