// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idl extends kwm
{

    public String a;
    public String b;
    public Integer c;
    public Float d;
    public Float e;
    public Float f;
    public Long g;
    public Float h;
    public Boolean i;
    public Float j;
    public String k;
    public Long l;
    public Integer m;
    public Integer n;
    public Integer o;
    public String p;
    public String q;
    public String r;
    public String s;

    public idl()
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
        r = null;
        s = null;
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
            i1 = j1 + kwk.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            d.floatValue();
            j1 = i1 + (kwk.f(4) + 4);
        }
        i1 = j1;
        if (e != null)
        {
            e.floatValue();
            i1 = j1 + (kwk.f(5) + 4);
        }
        j1 = i1;
        if (f != null)
        {
            f.floatValue();
            j1 = i1 + (kwk.f(6) + 4);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(7, g.longValue());
        }
        j1 = i1;
        if (h != null)
        {
            h.floatValue();
            j1 = i1 + (kwk.f(8) + 4);
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (kwk.f(10) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(12, l.longValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(13, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.e(14, n.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.e(15, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.b(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.b(19, s);
        }
        return i1;
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

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 37: // '%'
                d = Float.valueOf(kwj1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kwj1.c());
                break;

            case 53: // '5'
                f = Float.valueOf(kwj1.c());
                break;

            case 56: // '8'
                g = Long.valueOf(kwj1.e());
                break;

            case 69: // 'E'
                h = Float.valueOf(kwj1.c());
                break;

            case 72: // 'H'
                i = Boolean.valueOf(kwj1.i());
                break;

            case 85: // 'U'
                j = Float.valueOf(kwj1.c());
                break;

            case 90: // 'Z'
                k = kwj1.j();
                break;

            case 96: // '`'
                l = Long.valueOf(kwj1.e());
                break;

            case 104: // 'h'
                m = Integer.valueOf(kwj1.f());
                break;

            case 112: // 'p'
                n = Integer.valueOf(kwj1.f());
                break;

            case 120: // 'x'
                o = Integer.valueOf(kwj1.f());
                break;

            case 130: 
                p = kwj1.j();
                break;

            case 138: 
                q = kwj1.j();
                break;

            case 146: 
                r = kwj1.j();
                break;

            case 154: 
                s = kwj1.j();
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
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.floatValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.floatValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.floatValue());
        }
        if (g != null)
        {
            kwk1.b(7, g.longValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.floatValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.floatValue());
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.b(12, l.longValue());
        }
        if (m != null)
        {
            kwk1.a(13, m.intValue());
        }
        if (n != null)
        {
            kwk1.a(14, n.intValue());
        }
        if (o != null)
        {
            kwk1.a(15, o.intValue());
        }
        if (p != null)
        {
            kwk1.a(16, p);
        }
        if (q != null)
        {
            kwk1.a(17, q);
        }
        if (r != null)
        {
            kwk1.a(18, r);
        }
        if (s != null)
        {
            kwk1.a(19, s);
        }
        super.writeTo(kwk1);
    }
}
