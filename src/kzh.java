// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzh extends kwm
{

    public static final kwn a = kwn.a(kzh, 0xd215282L);
    private static final kzh q[] = new kzh[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kyz g;
    public kzn h;
    public String i;
    public String j;
    public Integer k;
    public Integer l;
    public String m;
    public String n;
    public kxd o;
    public kxd p;

    public kzh()
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
            j1 = i1 + kwk.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(7, h);
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
            j1 = i1 + kwk.e(10, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.e(11, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.d(15, p);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                f = kwj1.j();
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new kyz();
                }
                kwj1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new kzn();
                }
                kwj1.a(h);
                break;

            case 66: // 'B'
                i = kwj1.j();
                break;

            case 74: // 'J'
                j = kwj1.j();
                break;

            case 80: // 'P'
                k = Integer.valueOf(kwj1.f());
                break;

            case 88: // 'X'
                l = Integer.valueOf(kwj1.f());
                break;

            case 98: // 'b'
                m = kwj1.j();
                break;

            case 106: // 'j'
                n = kwj1.j();
                break;

            case 114: // 'r'
                if (o == null)
                {
                    o = new kxd();
                }
                kwj1.a(o);
                break;

            case 122: // 'z'
                if (p == null)
                {
                    p = new kxd();
                }
                kwj1.a(p);
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
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (h != null)
        {
            kwk1.b(7, h);
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
            kwk1.a(10, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(12, m);
        }
        if (n != null)
        {
            kwk1.a(13, n);
        }
        if (o != null)
        {
            kwk1.b(14, o);
        }
        if (p != null)
        {
            kwk1.b(15, p);
        }
        super.writeTo(kwk1);
    }

}
