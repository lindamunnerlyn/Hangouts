// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihf extends kwm
{

    public ior a;
    public inw b;
    public ihr c;
    public iom d;
    public iox e;
    public inz f;
    public iou g;
    public ilc h;
    public ios i;
    public inx j;
    public igz k;
    public iob l;
    public ioc m;
    public iod n;
    public igt o;
    public iop p;
    public ihd q;

    public ihf()
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
        if (i != null)
        {
            i1 = j1 + kwk.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(11, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(13, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(14, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(15, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(16, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(17, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.d(18, q);
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
                if (a == null)
                {
                    a = new ior();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new inw();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ihr();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iom();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iox();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new inz();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new iou();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new ilc();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new ios();
                }
                kwj1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new inx();
                }
                kwj1.a(j);
                break;

            case 98: // 'b'
                if (k == null)
                {
                    k = new igz();
                }
                kwj1.a(k);
                break;

            case 106: // 'j'
                if (l == null)
                {
                    l = new iob();
                }
                kwj1.a(l);
                break;

            case 114: // 'r'
                if (m == null)
                {
                    m = new ioc();
                }
                kwj1.a(m);
                break;

            case 122: // 'z'
                if (n == null)
                {
                    n = new iod();
                }
                kwj1.a(n);
                break;

            case 130: 
                if (o == null)
                {
                    o = new igt();
                }
                kwj1.a(o);
                break;

            case 138: 
                if (p == null)
                {
                    p = new iop();
                }
                kwj1.a(p);
                break;

            case 146: 
                if (q == null)
                {
                    q = new ihd();
                }
                kwj1.a(q);
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
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.b(11, j);
        }
        if (k != null)
        {
            kwk1.b(12, k);
        }
        if (l != null)
        {
            kwk1.b(13, l);
        }
        if (m != null)
        {
            kwk1.b(14, m);
        }
        if (n != null)
        {
            kwk1.b(15, n);
        }
        if (o != null)
        {
            kwk1.b(16, o);
        }
        if (p != null)
        {
            kwk1.b(17, p);
        }
        if (q != null)
        {
            kwk1.b(18, q);
        }
        super.writeTo(kwk1);
    }
}
