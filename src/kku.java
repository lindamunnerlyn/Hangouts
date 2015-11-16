// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kku extends koj
{

    private static volatile kku H[];
    public Float A;
    public Float B;
    public Float C;
    public byte D[];
    public klh E[];
    public byte F[];
    public kky G;
    public kkv a;
    public kkv b;
    public klg c;
    public kkx d[];
    public kkw e[];
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

    public kku()
    {
        a = null;
        b = null;
        c = null;
        d = kkx.a();
        e = kkw.a();
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
        E = klh.a();
        F = null;
        G = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kku[] a()
    {
        if (H == null)
        {
            synchronized (kon.a)
            {
                if (H == null)
                {
                    H = new kku[0];
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
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    kkx kkx1 = d[j1];
                    int k1 = i1;
                    if (kkx1 != null)
                    {
                        k1 = i1 + koh.d(2, kkx1);
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
            i1 = j1 + (koh.f(3) + 4);
        }
        j1 = i1;
        if (g != null)
        {
            g.floatValue();
            j1 = i1 + (koh.f(4) + 4);
        }
        i1 = j1;
        if (h != null)
        {
            h.floatValue();
            i1 = j1 + (koh.f(5) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (koh.f(6) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            k.floatValue();
            i1 = j1 + (koh.f(7) + 4);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + koh.b(8, D);
        }
        i1 = j1;
        if (i != null)
        {
            i.floatValue();
            i1 = j1 + (koh.f(9) + 4);
        }
        j1 = i1;
        if (l != null)
        {
            l.floatValue();
            j1 = i1 + (koh.f(10) + 4);
        }
        i1 = j1;
        if (m != null)
        {
            m.floatValue();
            i1 = j1 + (koh.f(11) + 4);
        }
        j1 = i1;
        if (n != null)
        {
            n.floatValue();
            j1 = i1 + (koh.f(12) + 4);
        }
        i1 = j1;
        if (o != null)
        {
            o.floatValue();
            i1 = j1 + (koh.f(13) + 4);
        }
        j1 = i1;
        if (p != null)
        {
            p.floatValue();
            j1 = i1 + (koh.f(14) + 4);
        }
        i1 = j1;
        if (q != null)
        {
            q.floatValue();
            i1 = j1 + (koh.f(15) + 4);
        }
        j1 = i1;
        if (r != null)
        {
            r.floatValue();
            j1 = i1 + (koh.f(16) + 4);
        }
        i1 = j1;
        if (s != null)
        {
            s.floatValue();
            i1 = j1 + (koh.f(17) + 4);
        }
        j1 = i1;
        if (t != null)
        {
            t.floatValue();
            j1 = i1 + (koh.f(18) + 4);
        }
        int l1 = j1;
        if (u != null)
        {
            u.floatValue();
            l1 = j1 + (koh.f(19) + 4);
        }
        i1 = l1;
        if (F != null)
        {
            i1 = l1 + koh.b(20, F);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    kkw kkw1 = e[j1];
                    int i2 = i1;
                    if (kkw1 != null)
                    {
                        i2 = i1 + koh.d(21, kkw1);
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
            i1 = j1 + koh.d(22, b);
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
                    klh klh1 = E[j2];
                    j1 = i1;
                    if (klh1 != null)
                    {
                        j1 = i1 + koh.d(23, klh1);
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
            i1 = j1 + (koh.f(24) + 4);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(25, c);
        }
        i1 = j1;
        if (G != null)
        {
            i1 = j1 + koh.d(26, G);
        }
        j1 = i1;
        if (v != null)
        {
            v.floatValue();
            j1 = i1 + (koh.f(27) + 4);
        }
        i1 = j1;
        if (w != null)
        {
            w.floatValue();
            i1 = j1 + (koh.f(28) + 4);
        }
        j1 = i1;
        if (x != null)
        {
            x.floatValue();
            j1 = i1 + (koh.f(29) + 4);
        }
        i1 = j1;
        if (y != null)
        {
            y.floatValue();
            i1 = j1 + (koh.f(30) + 4);
        }
        j1 = i1;
        if (z != null)
        {
            z.floatValue();
            j1 = i1 + (koh.f(31) + 4);
        }
        i1 = j1;
        if (A != null)
        {
            A.floatValue();
            i1 = j1 + (koh.f(33) + 4);
        }
        j1 = i1;
        if (B != null)
        {
            B.floatValue();
            j1 = i1 + (koh.f(34) + 4);
        }
        return j1;
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
                if (a == null)
                {
                    a = new kkv();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int i2 = kou.b(kog1, 18);
                kkx akkx[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                akkx = new kkx[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, akkx, 0, j1);
                    i2 = j1;
                }
                for (; i2 < akkx.length - 1; i2++)
                {
                    akkx[i2] = new kkx();
                    kog1.a(akkx[i2]);
                    kog1.a();
                }

                akkx[i2] = new kkx();
                kog1.a(akkx[i2]);
                d = akkx;
                break;

            case 29: // '\035'
                f = Float.valueOf(kog1.c());
                break;

            case 37: // '%'
                g = Float.valueOf(kog1.c());
                break;

            case 45: // '-'
                h = Float.valueOf(kog1.c());
                break;

            case 53: // '5'
                j = Float.valueOf(kog1.c());
                break;

            case 61: // '='
                k = Float.valueOf(kog1.c());
                break;

            case 66: // 'B'
                D = kog1.k();
                break;

            case 77: // 'M'
                i = Float.valueOf(kog1.c());
                break;

            case 85: // 'U'
                l = Float.valueOf(kog1.c());
                break;

            case 93: // ']'
                m = Float.valueOf(kog1.c());
                break;

            case 101: // 'e'
                n = Float.valueOf(kog1.c());
                break;

            case 109: // 'm'
                o = Float.valueOf(kog1.c());
                break;

            case 117: // 'u'
                p = Float.valueOf(kog1.c());
                break;

            case 125: // '}'
                q = Float.valueOf(kog1.c());
                break;

            case 133: 
                r = Float.valueOf(kog1.c());
                break;

            case 141: 
                s = Float.valueOf(kog1.c());
                break;

            case 149: 
                t = Float.valueOf(kog1.c());
                break;

            case 157: 
                u = Float.valueOf(kog1.c());
                break;

            case 162: 
                F = kog1.k();
                break;

            case 170: 
                int j2 = kou.b(kog1, 170);
                kkw akkw[];
                int k1;
                if (e == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = e.length;
                }
                akkw = new kkw[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(e, 0, akkw, 0, k1);
                    j2 = k1;
                }
                for (; j2 < akkw.length - 1; j2++)
                {
                    akkw[j2] = new kkw();
                    kog1.a(akkw[j2]);
                    kog1.a();
                }

                akkw[j2] = new kkw();
                kog1.a(akkw[j2]);
                e = akkw;
                break;

            case 178: 
                if (b == null)
                {
                    b = new kkv();
                }
                kog1.a(b);
                break;

            case 186: 
                int k2 = kou.b(kog1, 186);
                klh aklh[];
                int l1;
                if (E == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = E.length;
                }
                aklh = new klh[k2 + l1];
                k2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(E, 0, aklh, 0, l1);
                    k2 = l1;
                }
                for (; k2 < aklh.length - 1; k2++)
                {
                    aklh[k2] = new klh();
                    kog1.a(aklh[k2]);
                    kog1.a();
                }

                aklh[k2] = new klh();
                kog1.a(aklh[k2]);
                E = aklh;
                break;

            case 197: 
                C = Float.valueOf(kog1.c());
                break;

            case 202: 
                if (c == null)
                {
                    c = new klg();
                }
                kog1.a(c);
                break;

            case 210: 
                if (G == null)
                {
                    G = new kky();
                }
                kog1.a(G);
                break;

            case 221: 
                v = Float.valueOf(kog1.c());
                break;

            case 229: 
                w = Float.valueOf(kog1.c());
                break;

            case 237: 
                x = Float.valueOf(kog1.c());
                break;

            case 245: 
                y = Float.valueOf(kog1.c());
                break;

            case 253: 
                z = Float.valueOf(kog1.c());
                break;

            case 269: 
                A = Float.valueOf(kog1.c());
                break;

            case 277: 
                B = Float.valueOf(kog1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                kkx kkx1 = d[i1];
                if (kkx1 != null)
                {
                    koh1.b(2, kkx1);
                }
            }

        }
        if (f != null)
        {
            koh1.a(3, f.floatValue());
        }
        if (g != null)
        {
            koh1.a(4, g.floatValue());
        }
        if (h != null)
        {
            koh1.a(5, h.floatValue());
        }
        if (j != null)
        {
            koh1.a(6, j.floatValue());
        }
        if (k != null)
        {
            koh1.a(7, k.floatValue());
        }
        if (D != null)
        {
            koh1.a(8, D);
        }
        if (i != null)
        {
            koh1.a(9, i.floatValue());
        }
        if (l != null)
        {
            koh1.a(10, l.floatValue());
        }
        if (m != null)
        {
            koh1.a(11, m.floatValue());
        }
        if (n != null)
        {
            koh1.a(12, n.floatValue());
        }
        if (o != null)
        {
            koh1.a(13, o.floatValue());
        }
        if (p != null)
        {
            koh1.a(14, p.floatValue());
        }
        if (q != null)
        {
            koh1.a(15, q.floatValue());
        }
        if (r != null)
        {
            koh1.a(16, r.floatValue());
        }
        if (s != null)
        {
            koh1.a(17, s.floatValue());
        }
        if (t != null)
        {
            koh1.a(18, t.floatValue());
        }
        if (u != null)
        {
            koh1.a(19, u.floatValue());
        }
        if (F != null)
        {
            koh1.a(20, F);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                kkw kkw1 = e[j1];
                if (kkw1 != null)
                {
                    koh1.b(21, kkw1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(22, b);
        }
        if (E != null && E.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < E.length; k1++)
            {
                klh klh1 = E[k1];
                if (klh1 != null)
                {
                    koh1.b(23, klh1);
                }
            }

        }
        if (C != null)
        {
            koh1.a(24, C.floatValue());
        }
        if (c != null)
        {
            koh1.b(25, c);
        }
        if (G != null)
        {
            koh1.b(26, G);
        }
        if (v != null)
        {
            koh1.a(27, v.floatValue());
        }
        if (w != null)
        {
            koh1.a(28, w.floatValue());
        }
        if (x != null)
        {
            koh1.a(29, x.floatValue());
        }
        if (y != null)
        {
            koh1.a(30, y.floatValue());
        }
        if (z != null)
        {
            koh1.a(31, z.floatValue());
        }
        if (A != null)
        {
            koh1.a(33, A.floatValue());
        }
        if (B != null)
        {
            koh1.a(34, B.floatValue());
        }
        super.writeTo(koh1);
    }
}
