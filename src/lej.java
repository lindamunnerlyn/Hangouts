// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lej extends kwm
{

    private static volatile lej s[];
    public Long a;
    public ldz b;
    public Boolean c;
    public ldy d;
    public byte e[];
    public ldi f;
    public String g;
    public String h[];
    public String i;
    public String j;
    public lem k[];
    public kwt l;
    public Long m;
    public lek n;
    public leh o;
    public ldn p;
    public ldj q;
    public leg r;

    public lej()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = kwx.f;
        i = null;
        j = null;
        k = lem.a();
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lej[] a()
    {
        if (s == null)
        {
            synchronized (kwq.a)
            {
                if (s == null)
                {
                    s = new lej[0];
                }
            }
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(1, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(2, f);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1;
            if (h.length > 0)
            {
                i1 = 0;
                int k1 = 0;
                int i2;
                int j2;
                for (i2 = 0; i1 < h.length; i2 = j2)
                {
                    String s1 = h[i1];
                    int k2 = k1;
                    j2 = i2;
                    if (s1 != null)
                    {
                        j2 = i2 + 1;
                        k2 = k1 + kwk.a(s1);
                    }
                    i1++;
                    k1 = k2;
                }

                i1 = j1 + k1 + i2 * 1;
            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= k.length)
                    {
                        break;
                    }
                    lem lem1 = k[l1];
                    j1 = i1;
                    if (lem1 != null)
                    {
                        j1 = i1 + kwk.d(4, lem1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(6, i);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(7, g);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(8, m.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(9, j);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(10, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(11, o);
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.e(12, a.longValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(13, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.d(14, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.d(15, r);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (kwk.f(16) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(17, l);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(18, b);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(19, d);
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
                e = kwj1.k();
                break;

            case 18: // '\022'
                if (f == null)
                {
                    f = new ldi();
                }
                kwj1.a(f);
                break;

            case 26: // '\032'
                int l1 = kwx.a(kwj1, 26);
                String as[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                as = new String[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, as, 0, j1);
                    l1 = j1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = kwj1.j();
                    kwj1.a();
                }

                as[l1] = kwj1.j();
                h = as;
                break;

            case 34: // '"'
                int i2 = kwx.a(kwj1, 34);
                lem alem[];
                int k1;
                if (k == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = k.length;
                }
                alem = new lem[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(k, 0, alem, 0, k1);
                    i2 = k1;
                }
                for (; i2 < alem.length - 1; i2++)
                {
                    alem[i2] = new lem();
                    kwj1.a(alem[i2]);
                    kwj1.a();
                }

                alem[i2] = new lem();
                kwj1.a(alem[i2]);
                k = alem;
                break;

            case 50: // '2'
                i = kwj1.j();
                break;

            case 58: // ':'
                g = kwj1.j();
                break;

            case 64: // '@'
                m = Long.valueOf(kwj1.e());
                break;

            case 74: // 'J'
                j = kwj1.j();
                break;

            case 82: // 'R'
                if (n == null)
                {
                    n = new lek();
                }
                kwj1.a(n);
                break;

            case 90: // 'Z'
                if (o == null)
                {
                    o = new leh();
                }
                kwj1.a(o);
                break;

            case 96: // '`'
                a = Long.valueOf(kwj1.e());
                break;

            case 106: // 'j'
                if (p == null)
                {
                    p = new ldn();
                }
                kwj1.a(p);
                break;

            case 114: // 'r'
                if (q == null)
                {
                    q = new ldj();
                }
                kwj1.a(q);
                break;

            case 122: // 'z'
                if (r == null)
                {
                    r = new leg();
                }
                kwj1.a(r);
                break;

            case 128: 
                c = Boolean.valueOf(kwj1.i());
                break;

            case 138: 
                if (l == null)
                {
                    l = new kwt();
                }
                kwj1.a(l);
                break;

            case 146: 
                if (b == null)
                {
                    b = new ldz();
                }
                kwj1.a(b);
                break;

            case 154: 
                if (d == null)
                {
                    d = new ldy();
                }
                kwj1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (e != null)
        {
            kwk1.a(1, e);
        }
        if (f != null)
        {
            kwk1.b(2, f);
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                String s1 = h[i1];
                if (s1 != null)
                {
                    kwk1.a(3, s1);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < k.length; j1++)
            {
                lem lem1 = k[j1];
                if (lem1 != null)
                {
                    kwk1.b(4, lem1);
                }
            }

        }
        if (i != null)
        {
            kwk1.a(6, i);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (m != null)
        {
            kwk1.b(8, m.longValue());
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (n != null)
        {
            kwk1.b(10, n);
        }
        if (o != null)
        {
            kwk1.b(11, o);
        }
        if (a != null)
        {
            kwk1.b(12, a.longValue());
        }
        if (p != null)
        {
            kwk1.b(13, p);
        }
        if (q != null)
        {
            kwk1.b(14, q);
        }
        if (r != null)
        {
            kwk1.b(15, r);
        }
        if (c != null)
        {
            kwk1.a(16, c.booleanValue());
        }
        if (l != null)
        {
            kwk1.b(17, l);
        }
        if (b != null)
        {
            kwk1.b(18, b);
        }
        if (d != null)
        {
            kwk1.b(19, d);
        }
        super.writeTo(kwk1);
    }
}
