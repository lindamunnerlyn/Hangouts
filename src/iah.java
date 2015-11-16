// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iah extends kwm
{

    public icn a;
    public iay b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public iaj f;
    public icb g;
    public ick h;
    public String i;
    public ibz j;
    public Boolean k;

    public iah()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.d(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.d(2, b);
        }
        l = i1;
        if (c != null)
        {
            c.booleanValue();
            l = i1 + (kwk.f(3) + 1);
        }
        i1 = l;
        if (d != null)
        {
            d.booleanValue();
            i1 = l + (kwk.f(4) + 1);
        }
        l = i1;
        if (e != null)
        {
            e.booleanValue();
            l = i1 + (kwk.f(5) + 1);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.d(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.d(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + kwk.d(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.b(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + kwk.d(10, j);
        }
        l = i1;
        if (k != null)
        {
            k.booleanValue();
            l = i1 + (kwk.f(11) + 1);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int l = kwj1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kwj1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new icn();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iay();
                }
                kwj1.a(b);
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kwj1.i());
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new iaj();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new icb();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new ick();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                i = kwj1.j();
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new ibz();
                }
                kwj1.a(j);
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kwj1.i());
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
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
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
            kwk1.a(9, i);
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
