// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eaf extends kws
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public String l;

    public eaf()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = 0;
        k = 0;
        l = "";
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (!a.equals(""))
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (!f.equals(""))
        {
            j1 = i1 + kwk.b(6, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (j != 0)
        {
            j1 = i1 + kwk.e(10, j);
        }
        i1 = j1;
        if (k != 0)
        {
            i1 = j1 + kwk.e(11, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + kwk.b(12, l);
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
                if (kwj1.b(i1))
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
                f = kwj1.j();
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

            case 80: // 'P'
                j = kwj1.f();
                break;

            case 88: // 'X'
                k = kwj1.f();
                break;

            case 98: // 'b'
                l = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (!a.equals(""))
        {
            kwk1.a(1, a);
        }
        if (!b.equals(""))
        {
            kwk1.a(2, b);
        }
        if (!c.equals(""))
        {
            kwk1.a(3, c);
        }
        if (!d.equals(""))
        {
            kwk1.a(4, d);
        }
        if (!e.equals(""))
        {
            kwk1.a(5, e);
        }
        if (!f.equals(""))
        {
            kwk1.a(6, f);
        }
        if (!g.equals(""))
        {
            kwk1.a(7, g);
        }
        if (!h.equals(""))
        {
            kwk1.a(8, h);
        }
        if (!i.equals(""))
        {
            kwk1.a(9, i);
        }
        if (j != 0)
        {
            kwk1.a(10, j);
        }
        if (k != 0)
        {
            kwk1.a(11, k);
        }
        if (!l.equals(""))
        {
            kwk1.a(12, l);
        }
        super.writeTo(kwk1);
    }
}
