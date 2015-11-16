// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iai extends kwm
{

    public ibh a;
    public ibj b;
    public iam c;
    public ica d;
    public ica e;
    public String f;
    public Boolean g;
    public iba h;
    public ibt i;
    public ibr j;

    public iai()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (b != null)
        {
            k = l + kwk.d(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + kwk.d(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + kwk.d(3, d);
        }
        l = k;
        if (e != null)
        {
            l = k + kwk.d(4, e);
        }
        k = l;
        if (f != null)
        {
            k = l + kwk.b(5, f);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.d(6, h);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.d(7, i);
        }
        l = k;
        if (j != null)
        {
            l = k + kwk.d(8, j);
        }
        k = l;
        if (a != null)
        {
            k = l + kwk.d(9, a);
        }
        l = k;
        if (g != null)
        {
            g.booleanValue();
            l = k + (kwk.f(10) + 1);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int k = kwj1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kwj1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (b == null)
                {
                    b = new ibj();
                }
                kwj1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new iam();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new ica();
                }
                kwj1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ica();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                f = kwj1.j();
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new iba();
                }
                kwj1.a(h);
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new ibt();
                }
                kwj1.a(i);
                break;

            case 66: // 'B'
                if (j == null)
                {
                    j = new ibr();
                }
                kwj1.a(j);
                break;

            case 74: // 'J'
                if (a == null)
                {
                    a = new ibh();
                }
                kwj1.a(a);
                break;

            case 80: // 'P'
                g = Boolean.valueOf(kwj1.i());
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
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f);
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
        if (a != null)
        {
            kwk1.b(9, a);
        }
        if (g != null)
        {
            kwk1.a(10, g.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
