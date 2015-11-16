// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyr extends koj
{

    public Boolean a;
    public jyf b;
    public jyq c;
    public jyc d;
    public jzv e;
    public kav f;
    public kjh g;
    public kah h;
    public jyb i;
    public jyk j;
    public jyj k;
    public jym l;
    public kap m;
    public jyd n;

    public jyr()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(2, c);
        }
        i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
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
        if (l != null)
        {
            i1 = j1 + koh.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(13, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(14, n);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(15, k);
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
                if (b == null)
                {
                    b = new jyf();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new jyq();
                }
                kog1.a(c);
                break;

            case 24: // '\030'
                a = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jyc();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jzv();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kav();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kjh();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kah();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new jyb();
                }
                kog1.a(i);
                break;

            case 90: // 'Z'
                if (j == null)
                {
                    j = new jyk();
                }
                kog1.a(j);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new jym();
                }
                kog1.a(l);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new kap();
                }
                kog1.a(m);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new jyd();
                }
                kog1.a(n);
                break;

            case 122: // 'z'
                if (k == null)
                {
                    k = new jyj();
                }
                kog1.a(k);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (a != null)
        {
            koh1.a(3, a.booleanValue());
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
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        if (n != null)
        {
            koh1.b(14, n);
        }
        if (k != null)
        {
            koh1.b(15, k);
        }
        super.writeTo(koh1);
    }
}
