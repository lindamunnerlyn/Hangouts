// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jll extends kwm
{

    public jlk a;
    public itx b;
    public iuf c;
    public iun d;
    public ium e;
    public iug f;
    public iui g;
    public iul h;
    public iur i;
    public jlm j;
    public jlj k;
    public jlr l;
    public jlp m;
    public jmh n;

    public jll()
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
        if (f != null)
        {
            j1 = i1 + kwk.d(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(8, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(9, k);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(10, e);
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
        if (d != null)
        {
            i1 = j1 + kwk.d(13, d);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(14, n);
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
                    a = new jlk();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new itx();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new iuf();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new iug();
                }
                kwj1.a(f);
                break;

            case 42: // '*'
                if (g == null)
                {
                    g = new iui();
                }
                kwj1.a(g);
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new iul();
                }
                kwj1.a(h);
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new iur();
                }
                kwj1.a(i);
                break;

            case 66: // 'B'
                if (j == null)
                {
                    j = new jlm();
                }
                kwj1.a(j);
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new jlj();
                }
                kwj1.a(k);
                break;

            case 82: // 'R'
                if (e == null)
                {
                    e = new ium();
                }
                kwj1.a(e);
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new jlr();
                }
                kwj1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new jlp();
                }
                kwj1.a(m);
                break;

            case 106: // 'j'
                if (d == null)
                {
                    d = new iun();
                }
                kwj1.a(d);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new jmh();
                }
                kwj1.a(n);
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
        if (f != null)
        {
            kwk1.b(4, f);
        }
        if (g != null)
        {
            kwk1.b(5, g);
        }
        if (h != null)
        {
            kwk1.b(6, h);
        }
        if (i != null)
        {
            kwk1.b(7, i);
        }
        if (j != null)
        {
            kwk1.b(8, j);
        }
        if (k != null)
        {
            kwk1.b(9, k);
        }
        if (e != null)
        {
            kwk1.b(10, e);
        }
        if (l != null)
        {
            kwk1.b(11, l);
        }
        if (m != null)
        {
            kwk1.b(12, m);
        }
        if (d != null)
        {
            kwk1.b(13, d);
        }
        if (n != null)
        {
            kwk1.b(14, n);
        }
        super.writeTo(kwk1);
    }
}
