// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmc extends kwm
{

    private static volatile kmc q[];
    public String a;
    public kku b;
    public klw c;
    public kma d;
    public klp e;
    public kkb f;
    public kjp g;
    public kly h;
    public kls i[];
    public kja j;
    public klr k;
    public klt l;
    public kme m;
    public kjv n;
    public kmb o;
    public kkd p;

    public kmc()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kls.a();
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

    public static kmc[] a()
    {
        if (q == null)
        {
            synchronized (kwq.a)
            {
                if (q == null)
                {
                    q = new kmc[0];
                }
            }
        }
        return q;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                    kls kls1 = i[j1];
                    int l1 = i1;
                    if (kls1 != null)
                    {
                        l1 = i1 + kwk.d(9, kls1);
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
                    c = new klw();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (f == null)
                {
                    f = new kkb();
                }
                kwj1.a(f);
                break;

            case 34: // '"'
                if (g == null)
                {
                    g = new kjp();
                }
                kwj1.a(g);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new kma();
                }
                kwj1.a(d);
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new kku();
                }
                kwj1.a(b);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new kly();
                }
                kwj1.a(h);
                break;

            case 66: // 'B'
                if (e == null)
                {
                    e = new klp();
                }
                kwj1.a(e);
                break;

            case 74: // 'J'
                int k1 = kwx.a(kwj1, 74);
                kls akls[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                akls = new kls[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, akls, 0, j1);
                    k1 = j1;
                }
                for (; k1 < akls.length - 1; k1++)
                {
                    akls[k1] = new kls();
                    kwj1.a(akls[k1]);
                    kwj1.a();
                }

                akls[k1] = new kls();
                kwj1.a(akls[k1]);
                i = akls;
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kja();
                }
                kwj1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new klr();
                }
                kwj1.a(k);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new klt();
                }
                kwj1.a(l);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new kme();
                }
                kwj1.a(m);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new kjv();
                }
                kwj1.a(n);
                break;

            case 122: // 'z'
                if (o == null)
                {
                    o = new kmb();
                }
                kwj1.a(o);
                break;

            case 130: 
                if (p == null)
                {
                    p = new kkd();
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
                kls kls1 = i[i1];
                if (kls1 != null)
                {
                    kwk1.b(9, kls1);
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
