// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lja extends kwm
{

    public ljc a[];
    public ljc b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public ljb m;
    public String n;
    public Boolean o;

    public lja()
    {
        a = ljc.a();
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                int k1 = 0;
                do
                {
                    j1 = i1;
                    if (k1 >= a.length)
                    {
                        break;
                    }
                    ljc ljc1 = a[k1];
                    j1 = i1;
                    if (ljc1 != null)
                    {
                        j1 = i1 + kwk.d(1, ljc1);
                    }
                    k1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(3, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(11, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(12, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(13, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(14, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(15, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(16, j);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(17, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(18, n);
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (kwk.f(19) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(20, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(21, l);
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
                int k1 = kwx.a(kwj1, 10);
                ljc aljc[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                aljc = new ljc[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, aljc, 0, j1);
                    k1 = j1;
                }
                for (; k1 < aljc.length - 1; k1++)
                {
                    aljc[k1] = new ljc();
                    kwj1.a(aljc[k1]);
                    kwj1.a();
                }

                aljc[k1] = new ljc();
                kwj1.a(aljc[k1]);
                a = aljc;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ljc();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 90: // 'Z'
                e = kwj1.j();
                break;

            case 98: // 'b'
                f = kwj1.j();
                break;

            case 106: // 'j'
                g = kwj1.j();
                break;

            case 114: // 'r'
                h = kwj1.j();
                break;

            case 122: // 'z'
                i = kwj1.j();
                break;

            case 130: 
                j = kwj1.j();
                break;

            case 138: 
                if (m == null)
                {
                    m = new ljb();
                }
                kwj1.a(m);
                break;

            case 146: 
                n = kwj1.j();
                break;

            case 152: 
                o = Boolean.valueOf(kwj1.i());
                break;

            case 162: 
                k = kwj1.j();
                break;

            case 170: 
                l = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                ljc ljc1 = a[i1];
                if (ljc1 != null)
                {
                    kwk1.b(1, ljc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(11, e);
        }
        if (f != null)
        {
            kwk1.a(12, f);
        }
        if (g != null)
        {
            kwk1.a(13, g);
        }
        if (h != null)
        {
            kwk1.a(14, h);
        }
        if (i != null)
        {
            kwk1.a(15, i);
        }
        if (j != null)
        {
            kwk1.a(16, j);
        }
        if (m != null)
        {
            kwk1.b(17, m);
        }
        if (n != null)
        {
            kwk1.a(18, n);
        }
        if (o != null)
        {
            kwk1.a(19, o.booleanValue());
        }
        if (k != null)
        {
            kwk1.a(20, k);
        }
        if (l != null)
        {
            kwk1.a(21, l);
        }
        super.writeTo(kwk1);
    }
}
