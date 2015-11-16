// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iml extends kwm
{

    public Integer a;
    public Integer b;
    public Float c;
    public Float d;
    public String e;
    public String f;
    public String g;
    public String h;
    public imm i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Boolean n;
    public Double o;
    public Boolean p;
    public String q;
    public imr r[];

    public iml()
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
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = imr.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            c.floatValue();
            i1 = j1 + (kwk.f(1) + 4);
        }
        j1 = i1;
        if (d != null)
        {
            d.floatValue();
            j1 = i1 + (kwk.f(2) + 4);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(8, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(10, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(11, m);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (kwk.f(12) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            o.doubleValue();
            i1 = j1 + (kwk.f(13) + 8);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + kwk.e(14, a.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.e(15, b.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (kwk.f(16) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                for (j1 = 0; j1 < r.length;)
                {
                    imr imr1 = r[j1];
                    int k1 = i1;
                    if (imr1 != null)
                    {
                        k1 = i1 + kwk.d(18, imr1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
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

            case 13: // '\r'
                c = Float.valueOf(kwj1.c());
                break;

            case 21: // '\025'
                d = Float.valueOf(kwj1.c());
                break;

            case 26: // '\032'
                e = kwj1.j();
                break;

            case 34: // '"'
                f = kwj1.j();
                break;

            case 42: // '*'
                g = kwj1.j();
                break;

            case 50: // '2'
                h = kwj1.j();
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new imm();
                }
                kwj1.a(i);
                break;

            case 66: // 'B'
                j = kwj1.j();
                break;

            case 74: // 'J'
                k = kwj1.j();
                break;

            case 82: // 'R'
                l = kwj1.j();
                break;

            case 90: // 'Z'
                m = kwj1.j();
                break;

            case 96: // '`'
                n = Boolean.valueOf(kwj1.i());
                break;

            case 105: // 'i'
                o = Double.valueOf(kwj1.b());
                break;

            case 112: // 'p'
                a = Integer.valueOf(kwj1.f());
                break;

            case 120: // 'x'
                b = Integer.valueOf(kwj1.f());
                break;

            case 128: 
                p = Boolean.valueOf(kwj1.i());
                break;

            case 138: 
                q = kwj1.j();
                break;

            case 146: 
                int k1 = kwx.a(kwj1, 146);
                imr aimr[];
                int j1;
                if (r == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = r.length;
                }
                aimr = new imr[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(r, 0, aimr, 0, j1);
                    k1 = j1;
                }
                for (; k1 < aimr.length - 1; k1++)
                {
                    aimr[k1] = new imr();
                    kwj1.a(aimr[k1]);
                    kwj1.a();
                }

                aimr[k1] = new imr();
                kwj1.a(aimr[k1]);
                r = aimr;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (c != null)
        {
            kwk1.a(1, c.floatValue());
        }
        if (d != null)
        {
            kwk1.a(2, d.floatValue());
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (h != null)
        {
            kwk1.a(6, h);
        }
        if (i != null)
        {
            kwk1.b(7, i);
        }
        if (j != null)
        {
            kwk1.a(8, j);
        }
        if (k != null)
        {
            kwk1.a(9, k);
        }
        if (l != null)
        {
            kwk1.a(10, l);
        }
        if (m != null)
        {
            kwk1.a(11, m);
        }
        if (n != null)
        {
            kwk1.a(12, n.booleanValue());
        }
        if (o != null)
        {
            kwk1.a(13, o.doubleValue());
        }
        if (a != null)
        {
            kwk1.a(14, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(15, b.intValue());
        }
        if (p != null)
        {
            kwk1.a(16, p.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(17, q);
        }
        if (r != null && r.length > 0)
        {
            for (int i1 = 0; i1 < r.length; i1++)
            {
                imr imr1 = r[i1];
                if (imr1 != null)
                {
                    kwk1.b(18, imr1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
