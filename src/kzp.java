// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzp extends kwm
{

    public static final kwn a = kwn.a(kzp, 0xd0c68b2L);
    private static final kzp k[] = new kzp[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public kxd j;

    public kzp()
    {
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
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (b != null)
        {
            l = i1 + kwk.b(1, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l + kwk.b(2, c);
        }
        l = i1;
        if (d != null)
        {
            l = i1 + kwk.b(3, d);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + kwk.b(4, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + kwk.b(5, f);
        }
        i1 = l;
        if (g != null)
        {
            i1 = l + kwk.b(6, g);
        }
        l = i1;
        if (h != null)
        {
            l = i1 + kwk.b(7, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + kwk.b(8, i);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + kwk.d(9, j);
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
                h = kwj1.j();
                break;

            case 66: // 'B'
                i = kwj1.j();
                break;

            case 74: // 'J'
                if (j == null)
                {
                    j = new kxd();
                }
                kwj1.a(j);
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
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.b(9, j);
        }
        super.writeTo(kwk1);
    }

}
