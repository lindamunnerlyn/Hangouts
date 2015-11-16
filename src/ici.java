// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ici extends kwm
{

    public ibh a;
    public ibl b;
    public ibi c;
    public Boolean d;
    public iav e;
    public ica f;
    public iau g;
    public ias h;
    public ibf i;
    public iab j;
    public ica k;
    public ibq l;
    public ibp m;
    public Boolean n;
    public String o;
    public Boolean p;
    public iaa q;
    public iaq r;
    public ica s;

    public ici()
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
            i1 = j1 + kwk.d(3, c);
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
            j1 = i1 + kwk.d(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(10, k);
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
            n.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
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
            i1 = j1 + (kwk.f(16) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(18, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(19, s);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (kwk.f(20) + 1);
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
                    a = new ibh();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ibl();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ibi();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new iav();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new ica();
                }
                kwj1.a(f);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new iau();
                }
                kwj1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new ias();
                }
                kwj1.a(h);
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new ibf();
                }
                kwj1.a(i);
                break;

            case 74: // 'J'
                if (j == null)
                {
                    j = new iab();
                }
                kwj1.a(j);
                break;

            case 82: // 'R'
                if (k == null)
                {
                    k = new ica();
                }
                kwj1.a(k);
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new ibq();
                }
                kwj1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new ibp();
                }
                kwj1.a(m);
                break;

            case 104: // 'h'
                n = Boolean.valueOf(kwj1.i());
                break;

            case 114: // 'r'
                o = kwj1.j();
                break;

            case 128: 
                p = Boolean.valueOf(kwj1.i());
                break;

            case 138: 
                if (q == null)
                {
                    q = new iaa();
                }
                kwj1.a(q);
                break;

            case 146: 
                if (r == null)
                {
                    r = new iaq();
                }
                kwj1.a(r);
                break;

            case 154: 
                if (s == null)
                {
                    s = new ica();
                }
                kwj1.a(s);
                break;

            case 160: 
                d = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
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
            kwk1.b(3, c);
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
            kwk1.b(6, g);
        }
        if (h != null)
        {
            kwk1.b(7, h);
        }
        if (i != null)
        {
            kwk1.b(8, i);
        }
        if (j != null)
        {
            kwk1.b(9, j);
        }
        if (k != null)
        {
            kwk1.b(10, k);
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
            kwk1.a(13, n.booleanValue());
        }
        if (o != null)
        {
            kwk1.a(14, o);
        }
        if (p != null)
        {
            kwk1.a(16, p.booleanValue());
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
            kwk1.b(19, s);
        }
        if (d != null)
        {
            kwk1.a(20, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
