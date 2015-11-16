// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxo extends kwm
{

    public String a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public String g;
    public Integer h;
    public kxn i;

    public kxo()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.b(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.e(2, b.intValue());
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            d.booleanValue();
            k = j + (kwk.f(4) + 1);
        }
        j = k;
        if (e != null)
        {
            e.booleanValue();
            j = k + (kwk.f(5) + 1);
        }
        k = j;
        if (f != null)
        {
            f.booleanValue();
            k = j + (kwk.f(6) + 1);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.e(8, h.intValue());
        }
        j = k;
        if (i != null)
        {
            j = k + kwk.d(9, i);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int j = kwj1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kwj1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kwj1.i());
                break;

            case 48: // '0'
                f = Boolean.valueOf(kwj1.i());
                break;

            case 58: // ':'
                g = kwj1.j();
                break;

            case 64: // '@'
                h = Integer.valueOf(kwj1.f());
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new kxn();
                }
                kwj1.a(i);
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
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
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
            kwk1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        super.writeTo(kwk1);
    }
}
