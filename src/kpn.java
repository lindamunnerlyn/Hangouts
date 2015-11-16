// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kpn extends kwm
{

    public String a;
    public kon b;
    public kop c;
    public kow d;
    public kfc e;
    public kpw f;
    public knq g;
    public kot h;
    public knz i[];
    public kex j;
    public knu k;
    public koh l;
    public kpt m;
    public koy n;
    public kpi o;
    public kqe p;

    public kpn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = knz.a();
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
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
        if (c != null)
        {
            j1 = i1 + kwk.d(2, c);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(3, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(4, g);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.d(5, d);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(6, b);
        }
        int k1 = j1;
        if (h != null)
        {
            k1 = j1 + kwk.d(7, h);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + kwk.d(8, e);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    knz knz1 = i[j1];
                    int l1 = i1;
                    if (knz1 != null)
                    {
                        l1 = i1 + kwk.d(9, knz1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(13, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.d(16, p);
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
                if (c == null)
                {
                    c = new kop();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (f == null)
                {
                    f = new kpw();
                }
                kwj1.a(f);
                break;

            case 34: // '"'
                if (g == null)
                {
                    g = new knq();
                }
                kwj1.a(g);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new kow();
                }
                kwj1.a(d);
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new kon();
                }
                kwj1.a(b);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new kot();
                }
                kwj1.a(h);
                break;

            case 66: // 'B'
                if (e == null)
                {
                    e = new kfc();
                }
                kwj1.a(e);
                break;

            case 74: // 'J'
                int k1 = kwx.a(kwj1, 74);
                knz aknz[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                aknz = new knz[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, aknz, 0, j1);
                    k1 = j1;
                }
                for (; k1 < aknz.length - 1; k1++)
                {
                    aknz[k1] = new knz();
                    kwj1.a(aknz[k1]);
                    kwj1.a();
                }

                aknz[k1] = new knz();
                kwj1.a(aknz[k1]);
                i = aknz;
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kex();
                }
                kwj1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new knu();
                }
                kwj1.a(k);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new koh();
                }
                kwj1.a(l);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new kpt();
                }
                kwj1.a(m);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new koy();
                }
                kwj1.a(n);
                break;

            case 122: // 'z'
                if (o == null)
                {
                    o = new kpi();
                }
                kwj1.a(o);
                break;

            case 130: 
                if (p == null)
                {
                    p = new kqe();
                }
                kwj1.a(p);
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
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (f != null)
        {
            kwk1.b(3, f);
        }
        if (g != null)
        {
            kwk1.b(4, g);
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (b != null)
        {
            kwk1.b(6, b);
        }
        if (h != null)
        {
            kwk1.b(7, h);
        }
        if (e != null)
        {
            kwk1.b(8, e);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                knz knz1 = i[i1];
                if (knz1 != null)
                {
                    kwk1.b(9, knz1);
                }
            }

        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (m != null)
        {
            kwk1.b(13, m);
        }
        if (n != null)
        {
            kwk1.b(14, n);
        }
        if (o != null)
        {
            kwk1.b(15, o);
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        super.writeTo(kwk1);
    }
}
