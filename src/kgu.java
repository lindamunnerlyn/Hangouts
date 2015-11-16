// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgu extends kwm
{

    public Boolean a;
    public kgi b;
    public kgt c;
    public kgf d;
    public khy e;
    public kiy f;
    public krk g;
    public kik h;
    public kge i;
    public kgn j;
    public kgm k;
    public kgp l;
    public kis m;
    public kgg n;

    public kgu()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.d(2, c);
        }
        i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(11, j);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(13, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(14, n);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(15, k);
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
                if (b == null)
                {
                    b = new kgi();
                }
                kwj1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new kgt();
                }
                kwj1.a(c);
                break;

            case 24: // '\030'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kgf();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new khy();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kiy();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new krk();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kik();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new kge();
                }
                kwj1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new kgn();
                }
                kwj1.a(j);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new kgp();
                }
                kwj1.a(l);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new kis();
                }
                kwj1.a(m);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new kgg();
                }
                kwj1.a(n);
                break;

            case 122: // 'z'
                if (k == null)
                {
                    k = new kgm();
                }
                kwj1.a(k);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (a != null)
        {
            kwk1.a(3, a.booleanValue());
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.b(11, j);
        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (m != null)
        {
            kwk1.b(13, m);
        }
        if (n != null)
        {
            kwk1.b(14, n);
        }
        if (k != null)
        {
            kwk1.b(15, k);
        }
        super.writeTo(kwk1);
    }
}
