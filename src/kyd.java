// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyd extends kwm
{

    public String a;
    public String b;
    public String c;
    public String d;
    public inp e;
    public lcy f;
    public String g;
    public kyq h;
    public kyc i;
    public Boolean j;
    public kyp k;
    public String l;
    public String m;
    public String n;

    public kyd()
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
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
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
        if (g != null)
        {
            i1 = j1 + kwk.b(5, g);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(6, c);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j.booleanValue();
            j1 = i1 + (kwk.f(8) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(10, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(11, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(12, n);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(13, h);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(14, f);
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
                d = kwj1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new inp();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                g = kwj1.j();
                break;

            case 50: // '2'
                c = kwj1.j();
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new kyc();
                }
                kwj1.a(i);
                break;

            case 64: // '@'
                j = Boolean.valueOf(kwj1.i());
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new kyp();
                }
                kwj1.a(k);
                break;

            case 82: // 'R'
                l = kwj1.j();
                break;

            case 90: // 'Z'
                m = kwj1.j();
                break;

            case 98: // 'b'
                n = kwj1.j();
                break;

            case 106: // 'j'
                if (h == null)
                {
                    h = new kyq();
                }
                kwj1.a(h);
                break;

            case 114: // 'r'
                if (f == null)
                {
                    f = new lcy();
                }
                kwj1.a(f);
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
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (c != null)
        {
            kwk1.a(6, c);
        }
        if (i != null)
        {
            kwk1.b(7, i);
        }
        if (j != null)
        {
            kwk1.a(8, j.booleanValue());
        }
        if (k != null)
        {
            kwk1.b(9, k);
        }
        if (l != null)
        {
            kwk1.a(10, l);
        }
        if (m != null)
        {
            kwk1.a(11, m);
        }
        if (n != null)
        {
            kwk1.a(12, n);
        }
        if (h != null)
        {
            kwk1.b(13, h);
        }
        if (f != null)
        {
            kwk1.b(14, f);
        }
        super.writeTo(kwk1);
    }
}
