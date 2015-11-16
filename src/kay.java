// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kay extends kwm
{

    public static final kwn a = kwn.a(kay, 0x5d25432L);
    private static final kay k[] = new kay[0];
    public kaz b[];
    public kba c[];
    public kba d[];
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public kaz h[];
    public ltc i;
    public kbc j;

    public kay()
    {
        b = kaz.a();
        c = kba.a();
        d = kba.a();
        e = null;
        f = null;
        g = null;
        h = kaz.a();
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (b != null)
        {
            l = i1;
            if (b.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < b.length;)
                {
                    kaz kaz1 = b[i1];
                    int j1 = l;
                    if (kaz1 != null)
                    {
                        j1 = l + kwk.d(2, kaz1);
                    }
                    i1++;
                    l = j1;
                }

            }
        }
        i1 = l;
        if (e != null)
        {
            e.booleanValue();
            i1 = l + (kwk.f(3) + 1);
        }
        l = i1;
        if (f != null)
        {
            f.booleanValue();
            l = i1 + (kwk.f(4) + 1);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l;
            if (h.length > 0)
            {
                for (i1 = 0; i1 < h.length;)
                {
                    kaz kaz2 = h[i1];
                    int k1 = l;
                    if (kaz2 != null)
                    {
                        k1 = l + kwk.d(5, kaz2);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (c != null)
        {
            l = i1;
            if (c.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < c.length;)
                {
                    kba kba1 = c[i1];
                    int l1 = l;
                    if (kba1 != null)
                    {
                        l1 = l + kwk.d(6, kba1);
                    }
                    i1++;
                    l = l1;
                }

            }
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (kwk.f(7) + 1);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.d(8, i);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l;
            if (d.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (i2 >= d.length)
                    {
                        break;
                    }
                    kba kba2 = d[i2];
                    i1 = l;
                    if (kba2 != null)
                    {
                        i1 = l + kwk.d(9, kba2);
                    }
                    i2++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (j != null)
        {
            l = i1 + kwk.d(500, j);
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

            case 18: // '\022'
                int i2 = kwx.a(kwj1, 18);
                kaz akaz[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                akaz = new kaz[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, akaz, 0, i1);
                    i2 = i1;
                }
                for (; i2 < akaz.length - 1; i2++)
                {
                    akaz[i2] = new kaz();
                    kwj1.a(akaz[i2]);
                    kwj1.a();
                }

                akaz[i2] = new kaz();
                kwj1.a(akaz[i2]);
                b = akaz;
                break;

            case 24: // '\030'
                e = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                f = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                int j2 = kwx.a(kwj1, 42);
                kaz akaz1[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                akaz1 = new kaz[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, akaz1, 0, j1);
                    j2 = j1;
                }
                for (; j2 < akaz1.length - 1; j2++)
                {
                    akaz1[j2] = new kaz();
                    kwj1.a(akaz1[j2]);
                    kwj1.a();
                }

                akaz1[j2] = new kaz();
                kwj1.a(akaz1[j2]);
                h = akaz1;
                break;

            case 50: // '2'
                int k2 = kwx.a(kwj1, 50);
                kba akba[];
                int k1;
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                akba = new kba[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, akba, 0, k1);
                    k2 = k1;
                }
                for (; k2 < akba.length - 1; k2++)
                {
                    akba[k2] = new kba();
                    kwj1.a(akba[k2]);
                    kwj1.a();
                }

                akba[k2] = new kba();
                kwj1.a(akba[k2]);
                c = akba;
                break;

            case 56: // '8'
                g = Boolean.valueOf(kwj1.i());
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new ltc();
                }
                kwj1.a(i);
                break;

            case 74: // 'J'
                int l2 = kwx.a(kwj1, 74);
                kba akba1[];
                int l1;
                if (d == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = d.length;
                }
                akba1 = new kba[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(d, 0, akba1, 0, l1);
                    l2 = l1;
                }
                for (; l2 < akba1.length - 1; l2++)
                {
                    akba1[l2] = new kba();
                    kwj1.a(akba1[l2]);
                    kwj1.a();
                }

                akba1[l2] = new kba();
                kwj1.a(akba1[l2]);
                d = akba1;
                break;

            case 4002: 
                if (j == null)
                {
                    j = new kbc();
                }
                kwj1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                kaz kaz1 = b[l];
                if (kaz1 != null)
                {
                    kwk1.b(2, kaz1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(4, f.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                kaz kaz2 = h[i1];
                if (kaz2 != null)
                {
                    kwk1.b(5, kaz2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                kba kba1 = c[j1];
                if (kba1 != null)
                {
                    kwk1.b(6, kba1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (i != null)
        {
            kwk1.b(8, i);
        }
        if (d != null && d.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < d.length; k1++)
            {
                kba kba2 = d[k1];
                if (kba2 != null)
                {
                    kwk1.b(9, kba2);
                }
            }

        }
        if (j != null)
        {
            kwk1.b(500, j);
        }
        super.writeTo(kwk1);
    }

}
