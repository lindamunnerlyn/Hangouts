// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ktc extends kwm
{

    private static volatile ktc H[];
    public Float A;
    public Float B;
    public Float C;
    public byte D[];
    public kti E[];
    public byte F[];
    public ktg G;
    public ktd a;
    public ktd b;
    public kth c;
    public ktf d[];
    public kte e[];
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;
    public Float k;
    public Float l;
    public Float m;
    public Float n;
    public Float o;
    public Float p;
    public Float q;
    public Float r;
    public Float s;
    public Float t;
    public Float u;
    public Float v;
    public Float w;
    public Float x;
    public Float y;
    public Float z;

    public ktc()
    {
        a = null;
        b = null;
        c = null;
        d = ktf.a();
        e = kte.a();
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
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
        C = null;
        D = null;
        E = kti.a();
        F = null;
        G = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ktc[] a()
    {
        if (H == null)
        {
            synchronized (kwq.a)
            {
                if (H == null)
                {
                    H = new ktc[0];
                }
            }
        }
        return H;
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
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    ktf ktf1 = d[j1];
                    int k1 = i1;
                    if (ktf1 != null)
                    {
                        k1 = i1 + kwk.d(2, ktf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            f.floatValue();
            i1 = j1 + (kwk.f(3) + 4);
        }
        j1 = i1;
        if (g != null)
        {
            g.floatValue();
            j1 = i1 + (kwk.f(4) + 4);
        }
        i1 = j1;
        if (h != null)
        {
            h.floatValue();
            i1 = j1 + (kwk.f(5) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (kwk.f(6) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            k.floatValue();
            i1 = j1 + (kwk.f(7) + 4);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + kwk.b(8, D);
        }
        i1 = j1;
        if (i != null)
        {
            i.floatValue();
            i1 = j1 + (kwk.f(9) + 4);
        }
        j1 = i1;
        if (l != null)
        {
            l.floatValue();
            j1 = i1 + (kwk.f(10) + 4);
        }
        i1 = j1;
        if (m != null)
        {
            m.floatValue();
            i1 = j1 + (kwk.f(11) + 4);
        }
        j1 = i1;
        if (n != null)
        {
            n.floatValue();
            j1 = i1 + (kwk.f(12) + 4);
        }
        i1 = j1;
        if (o != null)
        {
            o.floatValue();
            i1 = j1 + (kwk.f(13) + 4);
        }
        j1 = i1;
        if (p != null)
        {
            p.floatValue();
            j1 = i1 + (kwk.f(14) + 4);
        }
        i1 = j1;
        if (q != null)
        {
            q.floatValue();
            i1 = j1 + (kwk.f(15) + 4);
        }
        j1 = i1;
        if (r != null)
        {
            r.floatValue();
            j1 = i1 + (kwk.f(16) + 4);
        }
        i1 = j1;
        if (s != null)
        {
            s.floatValue();
            i1 = j1 + (kwk.f(17) + 4);
        }
        j1 = i1;
        if (t != null)
        {
            t.floatValue();
            j1 = i1 + (kwk.f(18) + 4);
        }
        int l1 = j1;
        if (u != null)
        {
            u.floatValue();
            l1 = j1 + (kwk.f(19) + 4);
        }
        i1 = l1;
        if (F != null)
        {
            i1 = l1 + kwk.b(20, F);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    kte kte1 = e[j1];
                    int i2 = i1;
                    if (kte1 != null)
                    {
                        i2 = i1 + kwk.d(21, kte1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(22, b);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1;
            if (E.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= E.length)
                    {
                        break;
                    }
                    kti kti1 = E[j2];
                    j1 = i1;
                    if (kti1 != null)
                    {
                        j1 = i1 + kwk.d(23, kti1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (C != null)
        {
            C.floatValue();
            i1 = j1 + (kwk.f(24) + 4);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.d(25, c);
        }
        i1 = j1;
        if (G != null)
        {
            i1 = j1 + kwk.d(26, G);
        }
        j1 = i1;
        if (v != null)
        {
            v.floatValue();
            j1 = i1 + (kwk.f(27) + 4);
        }
        i1 = j1;
        if (w != null)
        {
            w.floatValue();
            i1 = j1 + (kwk.f(28) + 4);
        }
        j1 = i1;
        if (x != null)
        {
            x.floatValue();
            j1 = i1 + (kwk.f(29) + 4);
        }
        i1 = j1;
        if (y != null)
        {
            y.floatValue();
            i1 = j1 + (kwk.f(30) + 4);
        }
        j1 = i1;
        if (z != null)
        {
            z.floatValue();
            j1 = i1 + (kwk.f(31) + 4);
        }
        i1 = j1;
        if (A != null)
        {
            A.floatValue();
            i1 = j1 + (kwk.f(33) + 4);
        }
        j1 = i1;
        if (B != null)
        {
            B.floatValue();
            j1 = i1 + (kwk.f(34) + 4);
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
                if (a == null)
                {
                    a = new ktd();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int i2 = kwx.a(kwj1, 18);
                ktf aktf[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                aktf = new ktf[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, aktf, 0, j1);
                    i2 = j1;
                }
                for (; i2 < aktf.length - 1; i2++)
                {
                    aktf[i2] = new ktf();
                    kwj1.a(aktf[i2]);
                    kwj1.a();
                }

                aktf[i2] = new ktf();
                kwj1.a(aktf[i2]);
                d = aktf;
                break;

            case 29: // '\035'
                f = Float.valueOf(kwj1.c());
                break;

            case 37: // '%'
                g = Float.valueOf(kwj1.c());
                break;

            case 45: // '-'
                h = Float.valueOf(kwj1.c());
                break;

            case 53: // '5'
                j = Float.valueOf(kwj1.c());
                break;

            case 61: // '='
                k = Float.valueOf(kwj1.c());
                break;

            case 66: // 'B'
                D = kwj1.k();
                break;

            case 77: // 'M'
                i = Float.valueOf(kwj1.c());
                break;

            case 85: // 'U'
                l = Float.valueOf(kwj1.c());
                break;

            case 93: // ']'
                m = Float.valueOf(kwj1.c());
                break;

            case 101: // 'e'
                n = Float.valueOf(kwj1.c());
                break;

            case 109: // 'm'
                o = Float.valueOf(kwj1.c());
                break;

            case 117: // 'u'
                p = Float.valueOf(kwj1.c());
                break;

            case 125: // '}'
                q = Float.valueOf(kwj1.c());
                break;

            case 133: 
                r = Float.valueOf(kwj1.c());
                break;

            case 141: 
                s = Float.valueOf(kwj1.c());
                break;

            case 149: 
                t = Float.valueOf(kwj1.c());
                break;

            case 157: 
                u = Float.valueOf(kwj1.c());
                break;

            case 162: 
                F = kwj1.k();
                break;

            case 170: 
                int j2 = kwx.a(kwj1, 170);
                kte akte[];
                int k1;
                if (e == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = e.length;
                }
                akte = new kte[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(e, 0, akte, 0, k1);
                    j2 = k1;
                }
                for (; j2 < akte.length - 1; j2++)
                {
                    akte[j2] = new kte();
                    kwj1.a(akte[j2]);
                    kwj1.a();
                }

                akte[j2] = new kte();
                kwj1.a(akte[j2]);
                e = akte;
                break;

            case 178: 
                if (b == null)
                {
                    b = new ktd();
                }
                kwj1.a(b);
                break;

            case 186: 
                int k2 = kwx.a(kwj1, 186);
                kti akti[];
                int l1;
                if (E == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = E.length;
                }
                akti = new kti[k2 + l1];
                k2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(E, 0, akti, 0, l1);
                    k2 = l1;
                }
                for (; k2 < akti.length - 1; k2++)
                {
                    akti[k2] = new kti();
                    kwj1.a(akti[k2]);
                    kwj1.a();
                }

                akti[k2] = new kti();
                kwj1.a(akti[k2]);
                E = akti;
                break;

            case 197: 
                C = Float.valueOf(kwj1.c());
                break;

            case 202: 
                if (c == null)
                {
                    c = new kth();
                }
                kwj1.a(c);
                break;

            case 210: 
                if (G == null)
                {
                    G = new ktg();
                }
                kwj1.a(G);
                break;

            case 221: 
                v = Float.valueOf(kwj1.c());
                break;

            case 229: 
                w = Float.valueOf(kwj1.c());
                break;

            case 237: 
                x = Float.valueOf(kwj1.c());
                break;

            case 245: 
                y = Float.valueOf(kwj1.c());
                break;

            case 253: 
                z = Float.valueOf(kwj1.c());
                break;

            case 269: 
                A = Float.valueOf(kwj1.c());
                break;

            case 277: 
                B = Float.valueOf(kwj1.c());
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
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                ktf ktf1 = d[i1];
                if (ktf1 != null)
                {
                    kwk1.b(2, ktf1);
                }
            }

        }
        if (f != null)
        {
            kwk1.a(3, f.floatValue());
        }
        if (g != null)
        {
            kwk1.a(4, g.floatValue());
        }
        if (h != null)
        {
            kwk1.a(5, h.floatValue());
        }
        if (j != null)
        {
            kwk1.a(6, j.floatValue());
        }
        if (k != null)
        {
            kwk1.a(7, k.floatValue());
        }
        if (D != null)
        {
            kwk1.a(8, D);
        }
        if (i != null)
        {
            kwk1.a(9, i.floatValue());
        }
        if (l != null)
        {
            kwk1.a(10, l.floatValue());
        }
        if (m != null)
        {
            kwk1.a(11, m.floatValue());
        }
        if (n != null)
        {
            kwk1.a(12, n.floatValue());
        }
        if (o != null)
        {
            kwk1.a(13, o.floatValue());
        }
        if (p != null)
        {
            kwk1.a(14, p.floatValue());
        }
        if (q != null)
        {
            kwk1.a(15, q.floatValue());
        }
        if (r != null)
        {
            kwk1.a(16, r.floatValue());
        }
        if (s != null)
        {
            kwk1.a(17, s.floatValue());
        }
        if (t != null)
        {
            kwk1.a(18, t.floatValue());
        }
        if (u != null)
        {
            kwk1.a(19, u.floatValue());
        }
        if (F != null)
        {
            kwk1.a(20, F);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                kte kte1 = e[j1];
                if (kte1 != null)
                {
                    kwk1.b(21, kte1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(22, b);
        }
        if (E != null && E.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < E.length; k1++)
            {
                kti kti1 = E[k1];
                if (kti1 != null)
                {
                    kwk1.b(23, kti1);
                }
            }

        }
        if (C != null)
        {
            kwk1.a(24, C.floatValue());
        }
        if (c != null)
        {
            kwk1.b(25, c);
        }
        if (G != null)
        {
            kwk1.b(26, G);
        }
        if (v != null)
        {
            kwk1.a(27, v.floatValue());
        }
        if (w != null)
        {
            kwk1.a(28, w.floatValue());
        }
        if (x != null)
        {
            kwk1.a(29, x.floatValue());
        }
        if (y != null)
        {
            kwk1.a(30, y.floatValue());
        }
        if (z != null)
        {
            kwk1.a(31, z.floatValue());
        }
        if (A != null)
        {
            kwk1.a(33, A.floatValue());
        }
        if (B != null)
        {
            kwk1.a(34, B.floatValue());
        }
        super.writeTo(kwk1);
    }
}
