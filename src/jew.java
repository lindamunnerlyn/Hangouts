// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jew extends koj
{

    public jev a;
    public ins b;
    public ioa c;
    public ioi d;
    public ioh e;
    public iob f;
    public iod g;
    public iog h;
    public iom i;
    public jex j;
    public jeu k;
    public jfc l;
    public jfa m;
    public jfr n;

    public jew()
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
        if (f != null)
        {
            j1 = i1 + koh.d(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(8, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(9, k);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(10, e);
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
        if (d != null)
        {
            i1 = j1 + koh.d(13, d);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(14, n);
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
                    a = new jev();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ins();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ioa();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new iob();
                }
                kog1.a(f);
                break;

            case 42: // '*'
                if (g == null)
                {
                    g = new iod();
                }
                kog1.a(g);
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new iog();
                }
                kog1.a(h);
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new iom();
                }
                kog1.a(i);
                break;

            case 66: // 'B'
                if (j == null)
                {
                    j = new jex();
                }
                kog1.a(j);
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new jeu();
                }
                kog1.a(k);
                break;

            case 82: // 'R'
                if (e == null)
                {
                    e = new ioh();
                }
                kog1.a(e);
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new jfc();
                }
                kog1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new jfa();
                }
                kog1.a(m);
                break;

            case 106: // 'j'
                if (d == null)
                {
                    d = new ioi();
                }
                kog1.a(d);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new jfr();
                }
                kog1.a(n);
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
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (g != null)
        {
            koh1.b(5, g);
        }
        if (h != null)
        {
            koh1.b(6, h);
        }
        if (i != null)
        {
            koh1.b(7, i);
        }
        if (j != null)
        {
            koh1.b(8, j);
        }
        if (k != null)
        {
            koh1.b(9, k);
        }
        if (e != null)
        {
            koh1.b(10, e);
        }
        if (l != null)
        {
            koh1.b(11, l);
        }
        if (m != null)
        {
            koh1.b(12, m);
        }
        if (d != null)
        {
            koh1.b(13, d);
        }
        if (n != null)
        {
            koh1.b(14, n);
        }
        super.writeTo(koh1);
    }
}
