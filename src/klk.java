// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class klk extends kwm
{

    public Boolean a;
    public klf b;
    public kli c;
    public kky d;
    public kip e;
    public kib f;
    public klb g;
    public kla h;
    public klc i;
    public klm j;
    public kik k;
    public klj l;
    public kis m;

    public klk()
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
        if (a != null)
        {
            a.booleanValue();
            j1 = i1 + (kwk.f(2) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(4, f);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(5, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(6, d);
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
            j1 = i1 + kwk.d(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(13, m);
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
                if (b == null)
                {
                    b = new klf();
                }
                kwj1.a(b);
                break;

            case 16: // '\020'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new kip();
                }
                kwj1.a(e);
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new kib();
                }
                kwj1.a(f);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new kli();
                }
                kwj1.a(c);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new kky();
                }
                kwj1.a(d);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new klb();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kla();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new klc();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new klm();
                }
                kwj1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new kik();
                }
                kwj1.a(k);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new klj();
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
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (a != null)
        {
            kwk1.a(2, a.booleanValue());
        }
        if (e != null)
        {
            kwk1.b(3, e);
        }
        if (f != null)
        {
            kwk1.b(4, f);
        }
        if (c != null)
        {
            kwk1.b(5, c);
        }
        if (d != null)
        {
            kwk1.b(6, d);
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
            kwk1.b(10, j);
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (m != null)
        {
            kwk1.b(13, m);
        }
        super.writeTo(kwk1);
    }
}
