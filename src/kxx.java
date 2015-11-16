// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxx extends kwm
{

    public static final kwn a = kwn.a(kxx, 0xcfab3f2L);
    private static final kxx i[] = new kxx[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kxc h;

    public kxx()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kxx[] a()
    {
        return i;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (b != null)
        {
            j = k + kwk.b(1, b);
        }
        k = j;
        if (c != null)
        {
            k = j + kwk.b(2, c);
        }
        j = k;
        if (d != null)
        {
            j = k + kwk.b(3, d);
        }
        k = j;
        if (e != null)
        {
            k = j + kwk.b(4, e);
        }
        j = k;
        if (f != null)
        {
            j = k + kwk.b(5, f);
        }
        k = j;
        if (g != null)
        {
            k = j + kwk.b(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + kwk.d(7, h);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
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
                g = kwj1.j();
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new kxc();
                }
                kwj1.a(h);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
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
            kwk1.a(6, g);
        }
        if (h != null)
        {
            kwk1.b(7, h);
        }
        super.writeTo(kwk1);
    }

}
