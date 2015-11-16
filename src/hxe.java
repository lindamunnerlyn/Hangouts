// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxe extends koj
{

    public hwd a;
    public hwh b;
    public hwe c;
    public Boolean d;
    public hvr e;
    public hww f;
    public hvq g;
    public hvo h;
    public hwb i;
    public hux j;
    public hww k;
    public hwm l;
    public hwl m;
    public Boolean n;
    public String o;
    public Boolean p;
    public huw q;
    public hvm r;
    public hww s;

    public hxe()
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
        if (e != null)
        {
            j1 = i1 + koh.d(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.d(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            p.booleanValue();
            i1 = j1 + (koh.f(16) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(18, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(19, s);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (koh.f(20) + 1);
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
                    a = new hwd();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new hwh();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new hwe();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new hvr();
                }
                kog1.a(e);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new hww();
                }
                kog1.a(f);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new hvq();
                }
                kog1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new hvo();
                }
                kog1.a(h);
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new hwb();
                }
                kog1.a(i);
                break;

            case 74: // 'J'
                if (j == null)
                {
                    j = new hux();
                }
                kog1.a(j);
                break;

            case 82: // 'R'
                if (k == null)
                {
                    k = new hww();
                }
                kog1.a(k);
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new hwm();
                }
                kog1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new hwl();
                }
                kog1.a(m);
                break;

            case 104: // 'h'
                n = Boolean.valueOf(kog1.i());
                break;

            case 114: // 'r'
                o = kog1.j();
                break;

            case 128: 
                p = Boolean.valueOf(kog1.i());
                break;

            case 138: 
                if (q == null)
                {
                    q = new huw();
                }
                kog1.a(q);
                break;

            case 146: 
                if (r == null)
                {
                    r = new hvm();
                }
                kog1.a(r);
                break;

            case 154: 
                if (s == null)
                {
                    s = new hww();
                }
                kog1.a(s);
                break;

            case 160: 
                d = Boolean.valueOf(kog1.i());
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
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (f != null)
        {
            koh1.b(5, f);
        }
        if (g != null)
        {
            koh1.b(6, g);
        }
        if (h != null)
        {
            koh1.b(7, h);
        }
        if (i != null)
        {
            koh1.b(8, i);
        }
        if (j != null)
        {
            koh1.b(9, j);
        }
        if (k != null)
        {
            koh1.b(10, k);
        }
        if (l != null)
        {
            koh1.b(11, l);
        }
        if (m != null)
        {
            koh1.b(12, m);
        }
        if (n != null)
        {
            koh1.a(13, n.booleanValue());
        }
        if (o != null)
        {
            koh1.a(14, o);
        }
        if (p != null)
        {
            koh1.a(16, p.booleanValue());
        }
        if (q != null)
        {
            koh1.b(17, q);
        }
        if (r != null)
        {
            koh1.b(18, r);
        }
        if (s != null)
        {
            koh1.b(19, s);
        }
        if (d != null)
        {
            koh1.a(20, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
