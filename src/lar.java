// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lar extends kwm
{

    private static volatile lar F[];
    public Float A;
    public Float B;
    public Float C;
    public Float D;
    public byte E[];
    public las a;
    public las b;
    public Integer c;
    public Integer d;
    public lau e[];
    public lat f[];
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

    public lar()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = lau.a();
        f = lat.a();
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
        E = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lar[] a()
    {
        if (F == null)
        {
            synchronized (kwq.a)
            {
                if (F == null)
                {
                    F = new lar[0];
                }
            }
        }
        return F;
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
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.e(4, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1;
            if (e.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < e.length;)
                {
                    lau lau1 = e[j1];
                    int k1 = i1;
                    if (lau1 != null)
                    {
                        k1 = i1 + kwk.d(5, lau1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= f.length)
                    {
                        break;
                    }
                    lat lat1 = f[l1];
                    j1 = i1;
                    if (lat1 != null)
                    {
                        j1 = i1 + kwk.d(6, lat1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (g != null)
        {
            g.floatValue();
            i1 = j1 + (kwk.f(7) + 4);
        }
        j1 = i1;
        if (h != null)
        {
            h.floatValue();
            j1 = i1 + (kwk.f(8) + 4);
        }
        i1 = j1;
        if (i != null)
        {
            i.floatValue();
            i1 = j1 + (kwk.f(9) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (kwk.f(10) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            k.floatValue();
            i1 = j1 + (kwk.f(11) + 4);
        }
        j1 = i1;
        if (l != null)
        {
            l.floatValue();
            j1 = i1 + (kwk.f(12) + 4);
        }
        i1 = j1;
        if (m != null)
        {
            m.floatValue();
            i1 = j1 + (kwk.f(13) + 4);
        }
        j1 = i1;
        if (n != null)
        {
            n.floatValue();
            j1 = i1 + (kwk.f(14) + 4);
        }
        i1 = j1;
        if (o != null)
        {
            o.floatValue();
            i1 = j1 + (kwk.f(15) + 4);
        }
        j1 = i1;
        if (p != null)
        {
            p.floatValue();
            j1 = i1 + (kwk.f(16) + 4);
        }
        i1 = j1;
        if (q != null)
        {
            q.floatValue();
            i1 = j1 + (kwk.f(17) + 4);
        }
        j1 = i1;
        if (r != null)
        {
            r.floatValue();
            j1 = i1 + (kwk.f(18) + 4);
        }
        i1 = j1;
        if (s != null)
        {
            s.floatValue();
            i1 = j1 + (kwk.f(19) + 4);
        }
        j1 = i1;
        if (t != null)
        {
            t.floatValue();
            j1 = i1 + (kwk.f(20) + 4);
        }
        i1 = j1;
        if (u != null)
        {
            u.floatValue();
            i1 = j1 + (kwk.f(21) + 4);
        }
        j1 = i1;
        if (v != null)
        {
            v.floatValue();
            j1 = i1 + (kwk.f(22) + 4);
        }
        i1 = j1;
        if (D != null)
        {
            D.floatValue();
            i1 = j1 + (kwk.f(23) + 4);
        }
        j1 = i1;
        if (w != null)
        {
            w.floatValue();
            j1 = i1 + (kwk.f(24) + 4);
        }
        i1 = j1;
        if (x != null)
        {
            x.floatValue();
            i1 = j1 + (kwk.f(25) + 4);
        }
        j1 = i1;
        if (y != null)
        {
            y.floatValue();
            j1 = i1 + (kwk.f(26) + 4);
        }
        i1 = j1;
        if (z != null)
        {
            z.floatValue();
            i1 = j1 + (kwk.f(27) + 4);
        }
        j1 = i1;
        if (A != null)
        {
            A.floatValue();
            j1 = i1 + (kwk.f(28) + 4);
        }
        i1 = j1;
        if (B != null)
        {
            B.floatValue();
            i1 = j1 + (kwk.f(29) + 4);
        }
        j1 = i1;
        if (C != null)
        {
            C.floatValue();
            j1 = i1 + (kwk.f(30) + 4);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + kwk.b(31, E);
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
                if (a == null)
                {
                    a = new las();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new las();
                }
                kwj1.a(b);
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 42: // '*'
                int l1 = kwx.a(kwj1, 42);
                lau alau[];
                int j1;
                if (e == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = e.length;
                }
                alau = new lau[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(e, 0, alau, 0, j1);
                    l1 = j1;
                }
                for (; l1 < alau.length - 1; l1++)
                {
                    alau[l1] = new lau();
                    kwj1.a(alau[l1]);
                    kwj1.a();
                }

                alau[l1] = new lau();
                kwj1.a(alau[l1]);
                e = alau;
                break;

            case 50: // '2'
                int i2 = kwx.a(kwj1, 50);
                lat alat[];
                int k1;
                if (f == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = f.length;
                }
                alat = new lat[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(f, 0, alat, 0, k1);
                    i2 = k1;
                }
                for (; i2 < alat.length - 1; i2++)
                {
                    alat[i2] = new lat();
                    kwj1.a(alat[i2]);
                    kwj1.a();
                }

                alat[i2] = new lat();
                kwj1.a(alat[i2]);
                f = alat;
                break;

            case 61: // '='
                g = Float.valueOf(kwj1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kwj1.c());
                break;

            case 77: // 'M'
                i = Float.valueOf(kwj1.c());
                break;

            case 85: // 'U'
                j = Float.valueOf(kwj1.c());
                break;

            case 93: // ']'
                k = Float.valueOf(kwj1.c());
                break;

            case 101: // 'e'
                l = Float.valueOf(kwj1.c());
                break;

            case 109: // 'm'
                m = Float.valueOf(kwj1.c());
                break;

            case 117: // 'u'
                n = Float.valueOf(kwj1.c());
                break;

            case 125: // '}'
                o = Float.valueOf(kwj1.c());
                break;

            case 133: 
                p = Float.valueOf(kwj1.c());
                break;

            case 141: 
                q = Float.valueOf(kwj1.c());
                break;

            case 149: 
                r = Float.valueOf(kwj1.c());
                break;

            case 157: 
                s = Float.valueOf(kwj1.c());
                break;

            case 165: 
                t = Float.valueOf(kwj1.c());
                break;

            case 173: 
                u = Float.valueOf(kwj1.c());
                break;

            case 181: 
                v = Float.valueOf(kwj1.c());
                break;

            case 189: 
                D = Float.valueOf(kwj1.c());
                break;

            case 197: 
                w = Float.valueOf(kwj1.c());
                break;

            case 205: 
                x = Float.valueOf(kwj1.c());
                break;

            case 213: 
                y = Float.valueOf(kwj1.c());
                break;

            case 221: 
                z = Float.valueOf(kwj1.c());
                break;

            case 229: 
                A = Float.valueOf(kwj1.c());
                break;

            case 237: 
                B = Float.valueOf(kwj1.c());
                break;

            case 245: 
                C = Float.valueOf(kwj1.c());
                break;

            case 250: 
                E = kwj1.k();
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
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i1 = 0; i1 < e.length; i1++)
            {
                lau lau1 = e[i1];
                if (lau1 != null)
                {
                    kwk1.b(5, lau1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < f.length; j1++)
            {
                lat lat1 = f[j1];
                if (lat1 != null)
                {
                    kwk1.b(6, lat1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(7, g.floatValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.floatValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.floatValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.floatValue());
        }
        if (k != null)
        {
            kwk1.a(11, k.floatValue());
        }
        if (l != null)
        {
            kwk1.a(12, l.floatValue());
        }
        if (m != null)
        {
            kwk1.a(13, m.floatValue());
        }
        if (n != null)
        {
            kwk1.a(14, n.floatValue());
        }
        if (o != null)
        {
            kwk1.a(15, o.floatValue());
        }
        if (p != null)
        {
            kwk1.a(16, p.floatValue());
        }
        if (q != null)
        {
            kwk1.a(17, q.floatValue());
        }
        if (r != null)
        {
            kwk1.a(18, r.floatValue());
        }
        if (s != null)
        {
            kwk1.a(19, s.floatValue());
        }
        if (t != null)
        {
            kwk1.a(20, t.floatValue());
        }
        if (u != null)
        {
            kwk1.a(21, u.floatValue());
        }
        if (v != null)
        {
            kwk1.a(22, v.floatValue());
        }
        if (D != null)
        {
            kwk1.a(23, D.floatValue());
        }
        if (w != null)
        {
            kwk1.a(24, w.floatValue());
        }
        if (x != null)
        {
            kwk1.a(25, x.floatValue());
        }
        if (y != null)
        {
            kwk1.a(26, y.floatValue());
        }
        if (z != null)
        {
            kwk1.a(27, z.floatValue());
        }
        if (A != null)
        {
            kwk1.a(28, A.floatValue());
        }
        if (B != null)
        {
            kwk1.a(29, B.floatValue());
        }
        if (C != null)
        {
            kwk1.a(30, C.floatValue());
        }
        if (E != null)
        {
            kwk1.a(31, E);
        }
        super.writeTo(kwk1);
    }
}
