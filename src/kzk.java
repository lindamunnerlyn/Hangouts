// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzk extends kwm
{

    public static final kwn a = kwn.a(kzk, 0xcfe110aL);
    private static final kzk l[] = new kzk[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kxo g;
    public String h;
    public String i;
    public kxc j;
    public kxq k;

    public kzk()
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
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(4, i);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(6, g);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(7, e);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(11, h);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(12, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(13, k);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                i = kwj1.j();
                break;

            case 42: // '*'
                f = kwj1.j();
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new kxo();
                }
                kwj1.a(g);
                break;

            case 58: // ':'
                e = kwj1.j();
                break;

            case 90: // 'Z'
                h = kwj1.j();
                break;

            case 98: // 'b'
                if (j == null)
                {
                    j = new kxc();
                }
                kwj1.a(j);
                break;

            case 106: // 'j'
                if (k == null)
                {
                    k = new kxq();
                }
                kwj1.a(k);
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
        if (i != null)
        {
            kwk1.a(4, i);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (e != null)
        {
            kwk1.a(7, e);
        }
        if (h != null)
        {
            kwk1.a(11, h);
        }
        if (j != null)
        {
            kwk1.b(12, j);
        }
        if (k != null)
        {
            kwk1.b(13, k);
        }
        super.writeTo(kwk1);
    }

}
