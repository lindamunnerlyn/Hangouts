// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlk extends kwm
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public jmb f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public jlk()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
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
            j1 = i1 + kwk.b(4, d);
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
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(11, l);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(12, j);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jmb();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                g = kwj1.j();
                break;

            case 66: // 'B'
                h = kwj1.j();
                break;

            case 74: // 'J'
                i = kwj1.j();
                break;

            case 82: // 'R'
                k = kwj1.j();
                break;

            case 90: // 'Z'
                l = kwj1.j();
                break;

            case 98: // 'b'
                j = kwj1.j();
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
            kwk1.a(2, b);
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
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (k != null)
        {
            kwk1.a(10, k);
        }
        if (l != null)
        {
            kwk1.a(11, l);
        }
        if (j != null)
        {
            kwk1.a(12, j);
        }
        super.writeTo(kwk1);
    }
}
