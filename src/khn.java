// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khn extends kwm
{

    private static volatile khn q[];
    public String a;
    public kko b;
    public kha c;
    public kgx d;
    public kjl e;
    public kja f[];
    public kkg g[];
    public kjq h;
    public ksj i[];
    public kjv j;
    public kgw k;
    public kkd l;
    public khf m[];
    public khe n;
    public khh o;
    public kgz p;

    public khn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kja.a();
        g = kkg.a();
        h = null;
        i = ksj.a();
        j = null;
        k = null;
        l = null;
        m = khf.a();
        n = null;
        o = null;
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static khn[] a()
    {
        if (q == null)
        {
            synchronized (kwq.a)
            {
                if (q == null)
                {
                    q = new khn[0];
                }
            }
        }
        return q;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.d(2, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(3, h);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(4, b);
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + kwk.d(5, d);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + kwk.d(7, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    kja kja1 = f[j1];
                    int l1 = i1;
                    if (kja1 != null)
                    {
                        l1 = i1 + kwk.d(8, kja1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1;
            if (g.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < g.length;)
                {
                    kkg kkg1 = g[j1];
                    int i2 = i1;
                    if (kkg1 != null)
                    {
                        i2 = i1 + kwk.d(9, kkg1);
                    }
                    j1++;
                    i1 = i2;
                }

            }
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    ksj ksj1 = i[j1];
                    int j2 = i1;
                    if (ksj1 != null)
                    {
                        j2 = i1 + kwk.d(10, ksj1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(12, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(13, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= m.length)
                    {
                        break;
                    }
                    khf khf1 = m[k2];
                    j1 = i1;
                    if (khf1 != null)
                    {
                        j1 = i1 + kwk.d(14, khf1);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(16, p);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(17, n);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new kha();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (h == null)
                {
                    h = new kjq();
                }
                kwj1.a(h);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new kko();
                }
                kwj1.a(b);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new kgx();
                }
                kwj1.a(d);
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new kjl();
                }
                kwj1.a(e);
                break;

            case 66: // 'B'
                int j2 = kwx.a(kwj1, 66);
                kja akja[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                akja = new kja[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(f, 0, akja, 0, j1);
                    j2 = j1;
                }
                for (; j2 < akja.length - 1; j2++)
                {
                    akja[j2] = new kja();
                    kwj1.a(akja[j2]);
                    kwj1.a();
                }

                akja[j2] = new kja();
                kwj1.a(akja[j2]);
                f = akja;
                break;

            case 74: // 'J'
                int k2 = kwx.a(kwj1, 74);
                kkg akkg[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                akkg = new kkg[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(g, 0, akkg, 0, k1);
                    k2 = k1;
                }
                for (; k2 < akkg.length - 1; k2++)
                {
                    akkg[k2] = new kkg();
                    kwj1.a(akkg[k2]);
                    kwj1.a();
                }

                akkg[k2] = new kkg();
                kwj1.a(akkg[k2]);
                g = akkg;
                break;

            case 82: // 'R'
                int l2 = kwx.a(kwj1, 82);
                ksj aksj[];
                int l1;
                if (i == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = i.length;
                }
                aksj = new ksj[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(i, 0, aksj, 0, l1);
                    l2 = l1;
                }
                for (; l2 < aksj.length - 1; l2++)
                {
                    aksj[l2] = new ksj();
                    kwj1.a(aksj[l2]);
                    kwj1.a();
                }

                aksj[l2] = new ksj();
                kwj1.a(aksj[l2]);
                i = aksj;
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new kjv();
                }
                kwj1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new kgw();
                }
                kwj1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new kkd();
                }
                kwj1.a(l);
                break;

            case 114: // 'r'
                int i3 = kwx.a(kwj1, 114);
                khf akhf[];
                int i2;
                if (m == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = m.length;
                }
                akhf = new khf[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(m, 0, akhf, 0, i2);
                    i3 = i2;
                }
                for (; i3 < akhf.length - 1; i3++)
                {
                    akhf[i3] = new khf();
                    kwj1.a(akhf[i3]);
                    kwj1.a();
                }

                akhf[i3] = new khf();
                kwj1.a(akhf[i3]);
                m = akhf;
                break;

            case 122: // 'z'
                if (o == null)
                {
                    o = new khh();
                }
                kwj1.a(o);
                break;

            case 130: 
                if (p == null)
                {
                    p = new kgz();
                }
                kwj1.a(p);
                break;

            case 138: 
                if (n == null)
                {
                    n = new khe();
                }
                kwj1.a(n);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (h != null)
        {
            kwk1.b(3, h);
        }
        if (b != null)
        {
            kwk1.b(4, b);
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null)
        {
            kwk1.b(7, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                kja kja1 = f[i1];
                if (kja1 != null)
                {
                    kwk1.b(8, kja1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j1 = 0; j1 < g.length; j1++)
            {
                kkg kkg1 = g[j1];
                if (kkg1 != null)
                {
                    kwk1.b(9, kkg1);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int k1 = 0; k1 < i.length; k1++)
            {
                ksj ksj1 = i[k1];
                if (ksj1 != null)
                {
                    kwk1.b(10, ksj1);
                }
            }

        }
        if (j != null)
        {
            kwk1.b(11, j);
        }
        if (k != null)
        {
            kwk1.b(12, k);
        }
        if (l != null)
        {
            kwk1.b(13, l);
        }
        if (m != null && m.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < m.length; l1++)
            {
                khf khf1 = m[l1];
                if (khf1 != null)
                {
                    kwk1.b(14, khf1);
                }
            }

        }
        if (o != null)
        {
            kwk1.b(15, o);
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        if (n != null)
        {
            kwk1.b(17, n);
        }
        super.writeTo(kwk1);
    }
}
