// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdk extends kwm
{

    public ixb a;
    public iwy b;
    public iwz c;
    public String d;
    public Boolean e;
    public Integer f;
    public lcj g;
    public String h;
    public iwr i;

    public jdk()
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
            j = k + kwk.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.d(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.d(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.b(4, d);
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
            k = j + kwk.f(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.b(8, h);
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
                if (a == null)
                {
                    a = new ixb();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iwy();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new iwz();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 40: // '('
                e = Boolean.valueOf(kwj1.i());
                break;

            case 48: // '0'
                f = Integer.valueOf(kwj1.l());
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new lcj();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                h = kwj1.j();
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new iwr();
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
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.c(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        super.writeTo(kwk1);
    }
}
