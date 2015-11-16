// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzl extends kwm
{

    public static final kwn a = kwn.a(kzl, 0xd0c6942L);
    private static final kzl h[] = new kzl[0];
    public Double b;
    public Double c;
    public String d;
    public String e;
    public String f;
    public kxd g;

    public kzl()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            b.doubleValue();
            i = j + (kwk.f(1) + 8);
        }
        j = i;
        if (c != null)
        {
            c.doubleValue();
            j = i + (kwk.f(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.d(6, g);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 9: // '\t'
                b = Double.valueOf(kwj1.b());
                break;

            case 17: // '\021'
                c = Double.valueOf(kwj1.b());
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                f = kwj1.j();
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new kxd();
                }
                kwj1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b.doubleValue());
        }
        if (c != null)
        {
            kwk1.a(2, c.doubleValue());
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        super.writeTo(kwk1);
    }

}
