// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzn extends kwm
{

    public static final kwn a = kwn.a(kzn, 0xcc87312L);
    private static final kzn r[] = new kzn[0];
    public String b;
    public String c;
    public String d;
    public kzp e;
    public kzl f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public kxd l;
    public kxd m;
    public String n;
    public String o;
    public Boolean p;
    public String q;

    public kzn()
    {
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            p.booleanValue();
            i1 = j1 + (kwk.f(15) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.b(16, q);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new kzp();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new kzl();
                }
                kwj1.a(f);
                break;

            case 50: // '2'
                g = kwj1.j();
                break;

            case 58: // ':'
                h = kwj1.j();
                break;

            case 66: // 'B'
                i = kwj1.j();
                break;

            case 74: // 'J'
                j = kwj1.j();
                break;

            case 82: // 'R'
                k = kwj1.j();
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new kxd();
                }
                kwj1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new kxd();
                }
                kwj1.a(m);
                break;

            case 106: // 'j'
                n = kwj1.j();
                break;

            case 114: // 'r'
                o = kwj1.j();
                break;

            case 120: // 'x'
                p = Boolean.valueOf(kwj1.i());
                break;

            case 130: 
                q = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (f != null)
        {
            kwk1.b(5, f);
        }
        if (g != null)
        {
            kwk1.a(6, g);
        }
        if (h != null)
        {
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k);
        }
        if (l != null)
        {
            kwk1.b(11, l);
        }
        if (m != null)
        {
            kwk1.b(12, m);
        }
        if (n != null)
        {
            kwk1.a(13, n);
        }
        if (o != null)
        {
            kwk1.a(14, o);
        }
        if (p != null)
        {
            kwk1.a(15, p.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(16, q);
        }
        super.writeTo(kwk1);
    }

}
