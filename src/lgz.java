// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgz extends koj
{

    public String a;
    public String b;
    public String c;
    public Long d;
    public aac e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public Boolean k;
    public String l;
    public String m;
    public kuf n;
    public String o;
    public lhd p;
    public lha q;
    public lhb r;
    public kuh s;

    public lgz()
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (koh.f(11) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.d(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.d(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.d(20, s);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.d());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new aac();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 58: // ':'
                g = kog1.j();
                break;

            case 66: // 'B'
                h = kog1.j();
                break;

            case 74: // 'J'
                i = kog1.j();
                break;

            case 80: // 'P'
                j = Integer.valueOf(kog1.f());
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kog1.i());
                break;

            case 98: // 'b'
                l = kog1.j();
                break;

            case 106: // 'j'
                m = kog1.j();
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new kuf();
                }
                kog1.a(n);
                break;

            case 122: // 'z'
                o = kog1.j();
                break;

            case 130: 
                if (p == null)
                {
                    p = new lhd();
                }
                kog1.a(p);
                break;

            case 138: 
                if (q == null)
                {
                    q = new lha();
                }
                kog1.a(q);
                break;

            case 146: 
                if (r == null)
                {
                    r = new lhb();
                }
                kog1.a(r);
                break;

            case 162: 
                if (s == null)
                {
                    s = new kuh();
                }
                kog1.a(s);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.longValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (m != null)
        {
            koh1.a(13, m);
        }
        if (n != null)
        {
            koh1.b(14, n);
        }
        if (o != null)
        {
            koh1.a(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
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
            koh1.b(20, s);
        }
        super.writeTo(koh1);
    }
}
