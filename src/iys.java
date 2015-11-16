// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iys extends koj
{

    private static volatile iys C[];
    public iya A;
    public byte B[];
    public iyt a;
    public irh b;
    public ita c;
    public iyb d;
    public iyk e;
    public ixx f;
    public ixa g;
    public izw h;
    public irn i;
    public iso j;
    public irx k;
    public irf l;
    public iqp m;
    public iun n;
    public ivc o;
    public irb p;
    public ixm q;
    public iwm r;
    public iqk s;
    public iuo t;
    public iqz u;
    public ixi v;
    public ira w;
    public irr x;
    public itp y;
    public ire z;

    public iys()
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

    public static iys[] a()
    {
        if (C == null)
        {
            synchronized (kon.a)
            {
                if (C == null)
                {
                    C = new iys[0];
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
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(8, h);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + koh.b(10, B);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(11, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(12, j);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(13, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.d(14, q);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(15, k);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(16, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(17, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(18, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + koh.d(19, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.d(20, v);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.d(21, w);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + koh.d(22, x);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(23, l);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.d(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + koh.d(26, z);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + koh.d(27, A);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(28, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(29, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(30, o);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new iyt();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new irh();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ita();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iyb();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iyk();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new ixx();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new ixa();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new izw();
                }
                kog1.a(h);
                break;

            case 82: // 'R'
                B = kog1.k();
                break;

            case 90: // 'Z'
                if (i == null)
                {
                    i = new irn();
                }
                kog1.a(i);
                break;

            case 98: // 'b'
                if (j == null)
                {
                    j = new iso();
                }
                kog1.a(j);
                break;

            case 106: // 'j'
                if (p == null)
                {
                    p = new irb();
                }
                kog1.a(p);
                break;

            case 114: // 'r'
                if (q == null)
                {
                    q = new ixm();
                }
                kog1.a(q);
                break;

            case 122: // 'z'
                if (k == null)
                {
                    k = new irx();
                }
                kog1.a(k);
                break;

            case 130: 
                if (r == null)
                {
                    r = new iwm();
                }
                kog1.a(r);
                break;

            case 138: 
                if (s == null)
                {
                    s = new iqk();
                }
                kog1.a(s);
                break;

            case 146: 
                if (t == null)
                {
                    t = new iuo();
                }
                kog1.a(t);
                break;

            case 154: 
                if (u == null)
                {
                    u = new iqz();
                }
                kog1.a(u);
                break;

            case 162: 
                if (v == null)
                {
                    v = new ixi();
                }
                kog1.a(v);
                break;

            case 170: 
                if (w == null)
                {
                    w = new ira();
                }
                kog1.a(w);
                break;

            case 178: 
                if (x == null)
                {
                    x = new irr();
                }
                kog1.a(x);
                break;

            case 186: 
                if (l == null)
                {
                    l = new irf();
                }
                kog1.a(l);
                break;

            case 202: 
                if (y == null)
                {
                    y = new itp();
                }
                kog1.a(y);
                break;

            case 210: 
                if (z == null)
                {
                    z = new ire();
                }
                kog1.a(z);
                break;

            case 218: 
                if (A == null)
                {
                    A = new iya();
                }
                kog1.a(A);
                break;

            case 226: 
                if (m == null)
                {
                    m = new iqp();
                }
                kog1.a(m);
                break;

            case 234: 
                if (n == null)
                {
                    n = new iun();
                }
                kog1.a(n);
                break;

            case 242: 
                if (o == null)
                {
                    o = new ivc();
                }
                kog1.a(o);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (B != null)
        {
            koh1.a(10, B);
        }
        if (i != null)
        {
            koh1.b(11, i);
        }
        if (j != null)
        {
            koh1.b(12, j);
        }
        if (p != null)
        {
            koh1.b(13, p);
        }
        if (q != null)
        {
            koh1.b(14, q);
        }
        if (k != null)
        {
            koh1.b(15, k);
        }
        if (r != null)
        {
            koh1.b(16, r);
        }
        if (s != null)
        {
            koh1.b(17, s);
        }
        if (t != null)
        {
            koh1.b(18, t);
        }
        if (u != null)
        {
            koh1.b(19, u);
        }
        if (v != null)
        {
            koh1.b(20, v);
        }
        if (w != null)
        {
            koh1.b(21, w);
        }
        if (x != null)
        {
            koh1.b(22, x);
        }
        if (l != null)
        {
            koh1.b(23, l);
        }
        if (y != null)
        {
            koh1.b(25, y);
        }
        if (z != null)
        {
            koh1.b(26, z);
        }
        if (A != null)
        {
            koh1.b(27, A);
        }
        if (m != null)
        {
            koh1.b(28, m);
        }
        if (n != null)
        {
            koh1.b(29, n);
        }
        if (o != null)
        {
            koh1.b(30, o);
        }
        super.writeTo(koh1);
    }
}
