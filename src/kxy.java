// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxy extends kwm
{

    private static final kxy C[] = new kxy[0];
    public static final kwn a = kwn.a(kxy, 0x11153f42L);
    public static final kwn b = kwn.a(kxy, 0x11153f42L);
    public Boolean A;
    public String B;
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
    public kxc n;
    public kxc o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public kxc u;
    public String v;
    public kxc w;
    public String x;
    public String y;
    public String z;

    public kxy()
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
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
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
            j1 = i1 + kwk.d(24, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(25, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.b(26, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(27, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.b(28, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.b(29, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.b(75, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.d(82, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(106, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.d(185, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.b(227, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(228, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + kwk.b(254, z);
        }
        i1 = j1;
        if (A != null)
        {
            A.booleanValue();
            i1 = j1 + (kwk.f(267) + 1);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + kwk.b(280, B);
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

            case 194: 
                if (n == null)
                {
                    n = new kxc();
                }
                kwj1.a(n);
                break;

            case 202: 
                if (o == null)
                {
                    o = new kxc();
                }
                kwj1.a(o);
                break;

            case 210: 
                p = kwj1.j();
                break;

            case 218: 
                q = kwj1.j();
                break;

            case 226: 
                r = kwj1.j();
                break;

            case 234: 
                s = kwj1.j();
                break;

            case 602: 
                t = kwj1.j();
                break;

            case 658: 
                if (u == null)
                {
                    u = new kxc();
                }
                kwj1.a(u);
                break;

            case 850: 
                v = kwj1.j();
                break;

            case 1482: 
                if (w == null)
                {
                    w = new kxc();
                }
                kwj1.a(w);
                break;

            case 1818: 
                x = kwj1.j();
                break;

            case 1826: 
                y = kwj1.j();
                break;

            case 2034: 
                z = kwj1.j();
                break;

            case 2136: 
                A = Boolean.valueOf(kwj1.i());
                break;

            case 2242: 
                B = kwj1.j();
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
            kwk1.b(24, n);
        }
        if (o != null)
        {
            kwk1.b(25, o);
        }
        if (p != null)
        {
            kwk1.a(26, p);
        }
        if (q != null)
        {
            kwk1.a(27, q);
        }
        if (r != null)
        {
            kwk1.a(28, r);
        }
        if (s != null)
        {
            kwk1.a(29, s);
        }
        if (t != null)
        {
            kwk1.a(75, t);
        }
        if (u != null)
        {
            kwk1.b(82, u);
        }
        if (v != null)
        {
            kwk1.a(106, v);
        }
        if (w != null)
        {
            kwk1.b(185, w);
        }
        if (x != null)
        {
            kwk1.a(227, x);
        }
        if (y != null)
        {
            kwk1.a(228, y);
        }
        if (z != null)
        {
            kwk1.a(254, z);
        }
        if (A != null)
        {
            kwk1.a(267, A.booleanValue());
        }
        if (B != null)
        {
            kwk1.a(280, B);
        }
        super.writeTo(kwk1);
    }

}
