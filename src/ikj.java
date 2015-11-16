// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikj extends kwm
{

    private static volatile ikj A[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public String h;
    public String i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public String n;
    public String o;
    public Boolean p;
    public Double q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public kyw z;

    public ikj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ikj[] a()
    {
        if (A == null)
        {
            synchronized (kwq.a)
            {
                if (A == null)
                {
                    A = new ikj[0];
                }
            }
        }
        return A;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.e(4, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.e(6, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(7, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(11, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(12, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(13, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (kwk.f(16) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            q.doubleValue();
            i1 = j1 + (kwk.f(17) + 8);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.b(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.b(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.b(20, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.b(23, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.b(24, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + kwk.d(27, z);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.f());
                break;

            case 48: // '0'
                f = Integer.valueOf(kwj1.f());
                break;

            case 56: // '8'
                g = Integer.valueOf(kwj1.f());
                break;

            case 66: // 'B'
                h = kwj1.j();
                break;

            case 74: // 'J'
                i = kwj1.j();
                break;

            case 80: // 'P'
                j = Integer.valueOf(kwj1.f());
                break;

            case 88: // 'X'
                k = Integer.valueOf(kwj1.f());
                break;

            case 96: // '`'
                l = Integer.valueOf(kwj1.f());
                break;

            case 104: // 'h'
                m = Integer.valueOf(kwj1.f());
                break;

            case 114: // 'r'
                n = kwj1.j();
                break;

            case 122: // 'z'
                o = kwj1.j();
                break;

            case 128: 
                p = Boolean.valueOf(kwj1.i());
                break;

            case 137: 
                q = Double.valueOf(kwj1.b());
                break;

            case 146: 
                r = kwj1.j();
                break;

            case 154: 
                s = kwj1.j();
                break;

            case 162: 
                t = kwj1.j();
                break;

            case 170: 
                u = kwj1.j();
                break;

            case 178: 
                v = kwj1.j();
                break;

            case 186: 
                w = kwj1.j();
                break;

            case 194: 
                x = kwj1.j();
                break;

            case 202: 
                y = kwj1.j();
                break;

            case 218: 
                if (z == null)
                {
                    z = new kyw();
                }
                kwj1.a(z);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (j != null)
        {
            kwk1.a(10, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(11, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(12, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(13, m.intValue());
        }
        if (n != null)
        {
            kwk1.a(14, n);
        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null)
        {
            kwk1.a(16, p.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(17, q.doubleValue());
        }
        if (r != null)
        {
            kwk1.a(18, r);
        }
        if (s != null)
        {
            kwk1.a(19, s);
        }
        if (t != null)
        {
            kwk1.a(20, t);
        }
        if (u != null)
        {
            kwk1.a(21, u);
        }
        if (v != null)
        {
            kwk1.a(22, v);
        }
        if (w != null)
        {
            kwk1.a(23, w);
        }
        if (x != null)
        {
            kwk1.a(24, x);
        }
        if (y != null)
        {
            kwk1.a(25, y);
        }
        if (z != null)
        {
            kwk1.b(27, z);
        }
        super.writeTo(kwk1);
    }
}
