// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzk extends koj
{

    private static volatile jzk q[];
    public String a;
    public kcl b;
    public jyx c;
    public jyu d;
    public kbi e;
    public kax f[];
    public kcd g[];
    public kbn h;
    public kkg i[];
    public kbs j;
    public jyt k;
    public kca l;
    public jzc m[];
    public jzb n;
    public jze o;
    public jyw p;

    public jzk()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kax.a();
        g = kcd.a();
        h = null;
        i = kkg.a();
        j = null;
        k = null;
        l = null;
        m = jzc.a();
        n = null;
        o = null;
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jzk[] a()
    {
        if (q == null)
        {
            synchronized (kon.a)
            {
                if (q == null)
                {
                    q = new jzk[0];
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(2, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(3, h);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(4, b);
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + koh.d(5, d);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + koh.d(7, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    kax kax1 = f[j1];
                    int l1 = i1;
                    if (kax1 != null)
                    {
                        l1 = i1 + koh.d(8, kax1);
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
                    kcd kcd1 = g[j1];
                    int i2 = i1;
                    if (kcd1 != null)
                    {
                        i2 = i1 + koh.d(9, kcd1);
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
                    kkg kkg1 = i[j1];
                    int j2 = i1;
                    if (kkg1 != null)
                    {
                        j2 = i1 + koh.d(10, kkg1);
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
            i1 = j1 + koh.d(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(12, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.d(13, l);
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
                    jzc jzc1 = m[k2];
                    j1 = i1;
                    if (jzc1 != null)
                    {
                        j1 = i1 + koh.d(14, jzc1);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.d(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(16, p);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(17, n);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kog1.j();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new jyx();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                if (h == null)
                {
                    h = new kbn();
                }
                kog1.a(h);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new kcl();
                }
                kog1.a(b);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new jyu();
                }
                kog1.a(d);
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new kbi();
                }
                kog1.a(e);
                break;

            case 66: // 'B'
                int j2 = kou.b(kog1, 66);
                kax akax[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                akax = new kax[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(f, 0, akax, 0, j1);
                    j2 = j1;
                }
                for (; j2 < akax.length - 1; j2++)
                {
                    akax[j2] = new kax();
                    kog1.a(akax[j2]);
                    kog1.a();
                }

                akax[j2] = new kax();
                kog1.a(akax[j2]);
                f = akax;
                break;

            case 74: // 'J'
                int k2 = kou.b(kog1, 74);
                kcd akcd[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                akcd = new kcd[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(g, 0, akcd, 0, k1);
                    k2 = k1;
                }
                for (; k2 < akcd.length - 1; k2++)
                {
                    akcd[k2] = new kcd();
                    kog1.a(akcd[k2]);
                    kog1.a();
                }

                akcd[k2] = new kcd();
                kog1.a(akcd[k2]);
                g = akcd;
                break;

            case 82: // 'R'
                int l2 = kou.b(kog1, 82);
                kkg akkg[];
                int l1;
                if (i == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = i.length;
                }
                akkg = new kkg[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(i, 0, akkg, 0, l1);
                    l2 = l1;
                }
                for (; l2 < akkg.length - 1; l2++)
                {
                    akkg[l2] = new kkg();
                    kog1.a(akkg[l2]);
                    kog1.a();
                }

                akkg[l2] = new kkg();
                kog1.a(akkg[l2]);
                i = akkg;
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new kbs();
                }
                kog1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new jyt();
                }
                kog1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new kca();
                }
                kog1.a(l);
                break;

            case 114: // 'r'
                int i3 = kou.b(kog1, 114);
                jzc ajzc[];
                int i2;
                if (m == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = m.length;
                }
                ajzc = new jzc[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(m, 0, ajzc, 0, i2);
                    i3 = i2;
                }
                for (; i3 < ajzc.length - 1; i3++)
                {
                    ajzc[i3] = new jzc();
                    kog1.a(ajzc[i3]);
                    kog1.a();
                }

                ajzc[i3] = new jzc();
                kog1.a(ajzc[i3]);
                m = ajzc;
                break;

            case 122: // 'z'
                if (o == null)
                {
                    o = new jze();
                }
                kog1.a(o);
                break;

            case 130: 
                if (p == null)
                {
                    p = new jyw();
                }
                kog1.a(p);
                break;

            case 138: 
                if (n == null)
                {
                    n = new jzb();
                }
                kog1.a(n);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (h != null)
        {
            koh1.b(3, h);
        }
        if (b != null)
        {
            koh1.b(4, b);
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (e != null)
        {
            koh1.b(7, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                kax kax1 = f[i1];
                if (kax1 != null)
                {
                    koh1.b(8, kax1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j1 = 0; j1 < g.length; j1++)
            {
                kcd kcd1 = g[j1];
                if (kcd1 != null)
                {
                    koh1.b(9, kcd1);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int k1 = 0; k1 < i.length; k1++)
            {
                kkg kkg1 = i[k1];
                if (kkg1 != null)
                {
                    koh1.b(10, kkg1);
                }
            }

        }
        if (j != null)
        {
            koh1.b(11, j);
        }
        if (k != null)
        {
            koh1.b(12, k);
        }
        if (l != null)
        {
            koh1.b(13, l);
        }
        if (m != null && m.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < m.length; l1++)
            {
                jzc jzc1 = m[l1];
                if (jzc1 != null)
                {
                    koh1.b(14, jzc1);
                }
            }

        }
        if (o != null)
        {
            koh1.b(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
        }
        if (n != null)
        {
            koh1.b(17, n);
        }
        super.writeTo(koh1);
    }
}
