// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdh extends koj
{

    public Boolean a;
    public kdc b;
    public kdf c;
    public kcv d;
    public kam e;
    public jzy f;
    public kcy g;
    public kcx h;
    public kcz i;
    public kdj j;
    public kah k;
    public kdg l;
    public kap m;

    public kdh()
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
        if (a != null)
        {
            a.booleanValue();
            j1 = i1 + (koh.f(2) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(4, f);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(5, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(6, d);
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
            j1 = i1 + koh.d(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m);
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
                if (b == null)
                {
                    b = new kdc();
                }
                kog1.a(b);
                break;

            case 16: // '\020'
                a = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new kam();
                }
                kog1.a(e);
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new jzy();
                }
                kog1.a(f);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new kdf();
                }
                kog1.a(c);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new kcv();
                }
                kog1.a(d);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kcy();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kcx();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new kcz();
                }
                kog1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kdj();
                }
                kog1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new kah();
                }
                kog1.a(k);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new kdg();
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
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (a != null)
        {
            koh1.a(2, a.booleanValue());
        }
        if (e != null)
        {
            koh1.b(3, e);
        }
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (c != null)
        {
            koh1.b(5, c);
        }
        if (d != null)
        {
            koh1.b(6, d);
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
            koh1.b(10, j);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        super.writeTo(koh1);
    }
}
