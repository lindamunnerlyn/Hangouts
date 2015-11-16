// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iur extends kwm
{

    public String a;
    public Integer b;
    public Integer c;
    public Integer d;
    public String e;
    public Integer f;
    public Integer g;
    public String h;
    public Integer i;
    public Integer j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public Integer q;
    public Integer r;
    public String s;
    public String t;
    public ius u;
    public String v;
    public iut w;

    public iur()
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
        unknownFieldData = null;
        cachedSize = -1;
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
            j1 = i1 + kwk.e(2, b.intValue());
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
            i1 = j1 + kwk.b(5, e);
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
            i1 = j1 + kwk.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(13, m);
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
            j1 = i1 + kwk.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.e(17, q.intValue());
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.e(18, r.intValue());
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
            i1 = j1 + kwk.d(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.d(23, w);
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

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 42: // '*'
                e = kwj1.j();
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

            case 72: // 'H'
                i = Integer.valueOf(kwj1.f());
                break;

            case 80: // 'P'
                j = Integer.valueOf(kwj1.f());
                break;

            case 90: // 'Z'
                k = kwj1.j();
                break;

            case 98: // 'b'
                l = kwj1.j();
                break;

            case 106: // 'j'
                m = kwj1.j();
                break;

            case 114: // 'r'
                n = kwj1.j();
                break;

            case 122: // 'z'
                o = kwj1.j();
                break;

            case 130: 
                p = kwj1.j();
                break;

            case 136: 
                q = Integer.valueOf(kwj1.f());
                break;

            case 144: 
                r = Integer.valueOf(kwj1.f());
                break;

            case 154: 
                s = kwj1.j();
                break;

            case 162: 
                t = kwj1.j();
                break;

            case 170: 
                if (u == null)
                {
                    u = new ius();
                }
                kwj1.a(u);
                break;

            case 178: 
                v = kwj1.j();
                break;

            case 186: 
                if (w == null)
                {
                    w = new iut();
                }
                kwj1.a(w);
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
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
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
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.a(12, l);
        }
        if (m != null)
        {
            kwk1.a(13, m);
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
            kwk1.a(16, p);
        }
        if (q != null)
        {
            kwk1.a(17, q.intValue());
        }
        if (r != null)
        {
            kwk1.a(18, r.intValue());
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
            kwk1.b(21, u);
        }
        if (v != null)
        {
            kwk1.a(22, v);
        }
        if (w != null)
        {
            kwk1.b(23, w);
        }
        super.writeTo(kwk1);
    }
}
