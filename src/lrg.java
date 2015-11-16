// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lrg extends kwm
{

    public String a;
    public String b;
    public String c;
    public Long d;
    public kxb e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public Boolean k;
    public String l;
    public String m;
    public lci n;
    public String o;
    public lrp p;
    public lrh q;
    public lri r;
    public lck s;

    public lrg()
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
            j1 = i1 + kwk.d(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
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
            k.booleanValue();
            i1 = j1 + (kwk.f(11) + 1);
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
            j1 = i1 + kwk.d(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.d(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.d(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.d(20, s);
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
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.d());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kxb();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                f = kwj1.j();
                break;

            case 58: // ':'
                g = kwj1.j();
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
                k = Boolean.valueOf(kwj1.i());
                break;

            case 98: // 'b'
                l = kwj1.j();
                break;

            case 106: // 'j'
                m = kwj1.j();
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new lci();
                }
                kwj1.a(n);
                break;

            case 122: // 'z'
                o = kwj1.j();
                break;

            case 130: 
                if (p == null)
                {
                    p = new lrp();
                }
                kwj1.a(p);
                break;

            case 138: 
                if (q == null)
                {
                    q = new lrh();
                }
                kwj1.a(q);
                break;

            case 146: 
                if (r == null)
                {
                    r = new lri();
                }
                kwj1.a(r);
                break;

            case 162: 
                if (s == null)
                {
                    s = new lck();
                }
                kwj1.a(s);
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
            kwk1.a(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
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
            kwk1.a(11, k.booleanValue());
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
            kwk1.b(14, n);
        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        if (q != null)
        {
            kwk1.b(17, q);
        }
        if (r != null)
        {
            kwk1.b(18, r);
        }
        if (s != null)
        {
            kwk1.b(20, s);
        }
        super.writeTo(kwk1);
    }
}
