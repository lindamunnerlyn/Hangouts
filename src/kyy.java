// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyy extends kwm
{

    public static final kwn a = kwn.a(kyy, 0x12f42abaL);
    public static final kwn b = kwn.a(kyy, 0x12f42abaL);
    private static final kyy q[] = new kyy[0];
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kxo h;
    public String i;
    public kxc j[];
    public kxc k;
    public kxc l[];
    public String m;
    public String n;
    public kxc o;
    public String p;

    public kyy()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = kxc.a();
        k = null;
        l = kxc.a();
        m = null;
        n = null;
        o = null;
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    kxc kxc1 = j[j1];
                    int k1 = i1;
                    if (kxc1 != null)
                    {
                        k1 = i1 + kwk.d(8, kxc1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= l.length)
                    {
                        break;
                    }
                    kxc kxc2 = l[l1];
                    j1 = i1;
                    if (kxc2 != null)
                    {
                        j1 = i1 + kwk.d(11, kxc2);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(75, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(185, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.b(254, p);
        }
        return j1;
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
                c = kwj1.j();
                break;

            case 18: // '\022'
                d = kwj1.j();
                break;

            case 26: // '\032'
                e = kwj1.j();
                break;

            case 34: // '"'
                f = kwj1.j();
                break;

            case 42: // '*'
                g = kwj1.j();
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new kxo();
                }
                kwj1.a(h);
                break;

            case 58: // ':'
                i = kwj1.j();
                break;

            case 66: // 'B'
                int l1 = kwx.a(kwj1, 66);
                kxc akxc[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                akxc = new kxc[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(j, 0, akxc, 0, j1);
                    l1 = j1;
                }
                for (; l1 < akxc.length - 1; l1++)
                {
                    akxc[l1] = new kxc();
                    kwj1.a(akxc[l1]);
                    kwj1.a();
                }

                akxc[l1] = new kxc();
                kwj1.a(akxc[l1]);
                j = akxc;
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new kxc();
                }
                kwj1.a(k);
                break;

            case 90: // 'Z'
                int i2 = kwx.a(kwj1, 90);
                kxc akxc1[];
                int k1;
                if (l == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = l.length;
                }
                akxc1 = new kxc[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(l, 0, akxc1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < akxc1.length - 1; i2++)
                {
                    akxc1[i2] = new kxc();
                    kwj1.a(akxc1[i2]);
                    kwj1.a();
                }

                akxc1[i2] = new kxc();
                kwj1.a(akxc1[i2]);
                l = akxc1;
                break;

            case 98: // 'b'
                m = kwj1.j();
                break;

            case 602: 
                n = kwj1.j();
                break;

            case 1482: 
                if (o == null)
                {
                    o = new kxc();
                }
                kwj1.a(o);
                break;

            case 2034: 
                p = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (c != null)
        {
            kwk1.a(1, c);
        }
        if (d != null)
        {
            kwk1.a(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (h != null)
        {
            kwk1.b(6, h);
        }
        if (i != null)
        {
            kwk1.a(7, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                kxc kxc1 = j[i1];
                if (kxc1 != null)
                {
                    kwk1.b(8, kxc1);
                }
            }

        }
        if (k != null)
        {
            kwk1.b(9, k);
        }
        if (l != null && l.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < l.length; j1++)
            {
                kxc kxc2 = l[j1];
                if (kxc2 != null)
                {
                    kwk1.b(11, kxc2);
                }
            }

        }
        if (m != null)
        {
            kwk1.a(12, m);
        }
        if (n != null)
        {
            kwk1.a(75, n);
        }
        if (o != null)
        {
            kwk1.b(185, o);
        }
        if (p != null)
        {
            kwk1.a(254, p);
        }
        super.writeTo(kwk1);
    }

}
