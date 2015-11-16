// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icb extends koj
{

    public ijn a;
    public iis b;
    public icn c;
    public iji d;
    public ijt e;
    public iiv f;
    public ijq g;
    public ify h;
    public ijo i;
    public iit j;
    public ibv k;
    public iix l;
    public iiy m;
    public iiz n;
    public ibp o;
    public ijl p;
    public ibz q;

    public icb()
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
        unknownFieldData = null;
        cachedSize = -1;
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
        if (i != null)
        {
            i1 = j1 + koh.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(11, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(13, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(14, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(15, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.d(16, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(17, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.d(18, q);
        }
        return i1;
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
                    a = new ijn();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iis();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new icn();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iji();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ijt();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new iiv();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new ijq();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new ify();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new ijo();
                }
                kog1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new iit();
                }
                kog1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new ibv();
                }
                kog1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new iix();
                }
                kog1.a(l);
                break;

            case 114: // 'r'
                if (m == null)
                {
                    m = new iiy();
                }
                kog1.a(m);
                break;

            case 122: // 'z'
                if (n == null)
                {
                    n = new iiz();
                }
                kog1.a(n);
                break;

            case 130: 
                if (o == null)
                {
                    o = new ibp();
                }
                kog1.a(o);
                break;

            case 138: 
                if (p == null)
                {
                    p = new ijl();
                }
                kog1.a(p);
                break;

            case 146: 
                if (q == null)
                {
                    q = new ibz();
                }
                kog1.a(q);
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
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (j != null)
        {
            koh1.b(11, j);
        }
        if (k != null)
        {
            koh1.b(12, k);
        }
        if (l != null)
        {
            koh1.b(13, l);
        }
        if (m != null)
        {
            koh1.b(14, m);
        }
        if (n != null)
        {
            koh1.b(15, n);
        }
        if (o != null)
        {
            koh1.b(16, o);
        }
        if (p != null)
        {
            koh1.b(17, p);
        }
        if (q != null)
        {
            koh1.b(18, q);
        }
        super.writeTo(koh1);
    }
}
