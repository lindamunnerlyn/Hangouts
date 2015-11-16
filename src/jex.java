// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jex extends kwm
{

    private static volatile jex C[];
    public jef A;
    public byte B[];
    public jey a;
    public ixm b;
    public izf c;
    public jeg d;
    public jep e;
    public jec f;
    public jdf g;
    public jgb h;
    public ixs i;
    public iyt j;
    public iyc k;
    public ixk l;
    public iwu m;
    public jas n;
    public jbh o;
    public ixg p;
    public jdr q;
    public jcr r;
    public iwp s;
    public jat t;
    public ixe u;
    public jdn v;
    public ixf w;
    public ixw x;
    public izu y;
    public ixj z;

    public jex()
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
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jex[] a()
    {
        if (C == null)
        {
            synchronized (kwq.a)
            {
                if (C == null)
                {
                    C = new jex[0];
                }
            }
        }
        return C;
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
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(8, h);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(10, B);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.d(11, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(12, j);
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
        if (k != null)
        {
            j1 = i1 + kwk.d(15, k);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(16, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(17, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(18, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(19, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.d(20, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.d(21, w);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.d(22, x);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(23, l);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.d(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + kwk.d(26, z);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + kwk.d(27, A);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(28, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(29, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(30, o);
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
                if (a == null)
                {
                    a = new jey();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ixm();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new izf();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jeg();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jep();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jec();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new jdf();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new jgb();
                }
                kwj1.a(h);
                break;

            case 82: // 'R'
                B = kwj1.k();
                break;

            case 90: // 'Z'
                if (i == null)
                {
                    i = new ixs();
                }
                kwj1.a(i);
                break;

            case 98: // 'b'
                if (j == null)
                {
                    j = new iyt();
                }
                kwj1.a(j);
                break;

            case 106: // 'j'
                if (p == null)
                {
                    p = new ixg();
                }
                kwj1.a(p);
                break;

            case 114: // 'r'
                if (q == null)
                {
                    q = new jdr();
                }
                kwj1.a(q);
                break;

            case 122: // 'z'
                if (k == null)
                {
                    k = new iyc();
                }
                kwj1.a(k);
                break;

            case 130: 
                if (r == null)
                {
                    r = new jcr();
                }
                kwj1.a(r);
                break;

            case 138: 
                if (s == null)
                {
                    s = new iwp();
                }
                kwj1.a(s);
                break;

            case 146: 
                if (t == null)
                {
                    t = new jat();
                }
                kwj1.a(t);
                break;

            case 154: 
                if (u == null)
                {
                    u = new ixe();
                }
                kwj1.a(u);
                break;

            case 162: 
                if (v == null)
                {
                    v = new jdn();
                }
                kwj1.a(v);
                break;

            case 170: 
                if (w == null)
                {
                    w = new ixf();
                }
                kwj1.a(w);
                break;

            case 178: 
                if (x == null)
                {
                    x = new ixw();
                }
                kwj1.a(x);
                break;

            case 186: 
                if (l == null)
                {
                    l = new ixk();
                }
                kwj1.a(l);
                break;

            case 202: 
                if (y == null)
                {
                    y = new izu();
                }
                kwj1.a(y);
                break;

            case 210: 
                if (z == null)
                {
                    z = new ixj();
                }
                kwj1.a(z);
                break;

            case 218: 
                if (A == null)
                {
                    A = new jef();
                }
                kwj1.a(A);
                break;

            case 226: 
                if (m == null)
                {
                    m = new iwu();
                }
                kwj1.a(m);
                break;

            case 234: 
                if (n == null)
                {
                    n = new jas();
                }
                kwj1.a(n);
                break;

            case 242: 
                if (o == null)
                {
                    o = new jbh();
                }
                kwj1.a(o);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (B != null)
        {
            kwk1.a(10, B);
        }
        if (i != null)
        {
            kwk1.b(11, i);
        }
        if (j != null)
        {
            kwk1.b(12, j);
        }
        if (p != null)
        {
            kwk1.b(13, p);
        }
        if (q != null)
        {
            kwk1.b(14, q);
        }
        if (k != null)
        {
            kwk1.b(15, k);
        }
        if (r != null)
        {
            kwk1.b(16, r);
        }
        if (s != null)
        {
            kwk1.b(17, s);
        }
        if (t != null)
        {
            kwk1.b(18, t);
        }
        if (u != null)
        {
            kwk1.b(19, u);
        }
        if (v != null)
        {
            kwk1.b(20, v);
        }
        if (w != null)
        {
            kwk1.b(21, w);
        }
        if (x != null)
        {
            kwk1.b(22, x);
        }
        if (l != null)
        {
            kwk1.b(23, l);
        }
        if (y != null)
        {
            kwk1.b(25, y);
        }
        if (z != null)
        {
            kwk1.b(26, z);
        }
        if (A != null)
        {
            kwk1.b(27, A);
        }
        if (m != null)
        {
            kwk1.b(28, m);
        }
        if (n != null)
        {
            kwk1.b(29, n);
        }
        if (o != null)
        {
            kwk1.b(30, o);
        }
        super.writeTo(kwk1);
    }
}
