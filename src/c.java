// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class c extends kwm
{

    public d a;
    public String b;
    public String c;
    public Long d;
    public String e;
    public ivi f;
    public ivh g;
    public String h;
    public String i;
    public String j;
    public Long k;
    public String l;
    public String m;
    public Long n;

    public c()
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
            j1 = i1 + kwk.e(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
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
            j1 = i1 + kwk.e(10, k.longValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(11, l);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(12, g);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(14, n.longValue());
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
                    a = new d();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.e());
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new ivi();
                }
                kwj1.a(f);
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

            case 80: // 'P'
                k = Long.valueOf(kwj1.e());
                break;

            case 90: // 'Z'
                l = kwj1.j();
                break;

            case 98: // 'b'
                if (g == null)
                {
                    g = new ivh();
                }
                kwj1.a(g);
                break;

            case 106: // 'j'
                m = kwj1.j();
                break;

            case 112: // 'p'
                n = Long.valueOf(kwj1.d());
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
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
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
            kwk1.b(10, k.longValue());
        }
        if (l != null)
        {
            kwk1.a(11, l);
        }
        if (g != null)
        {
            kwk1.b(12, g);
        }
        if (m != null)
        {
            kwk1.a(13, m);
        }
        if (n != null)
        {
            kwk1.a(14, n.longValue());
        }
        super.writeTo(kwk1);
    }
}
