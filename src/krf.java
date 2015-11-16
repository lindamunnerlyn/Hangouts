// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krf extends koj
{

    public static final kok a = kok.a(krf, 0xd215282L);
    private static final krf q[] = new krf[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kpl g;
    public krl h;
    public String i;
    public String j;
    public Integer k;
    public Integer l;
    public String m;
    public String n;
    public koz o;
    public koz p;

    public krf()
    {
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(5, f);
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
            j1 = i1 + koh.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.e(10, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.e(11, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.d(15, p);
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
                b = kog1.j();
                break;

            case 18: // '\022'
                c = kog1.j();
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 42: // '*'
                f = kog1.j();
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new kpl();
                }
                kog1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new krl();
                }
                kog1.a(h);
                break;

            case 66: // 'B'
                i = kog1.j();
                break;

            case 74: // 'J'
                j = kog1.j();
                break;

            case 80: // 'P'
                k = Integer.valueOf(kog1.f());
                break;

            case 88: // 'X'
                l = Integer.valueOf(kog1.f());
                break;

            case 98: // 'b'
                m = kog1.j();
                break;

            case 106: // 'j'
                n = kog1.j();
                break;

            case 114: // 'r'
                if (o == null)
                {
                    o = new koz();
                }
                kog1.a(o);
                break;

            case 122: // 'z'
                if (p == null)
                {
                    p = new koz();
                }
                kog1.a(p);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f);
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
            koh1.a(8, i);
        }
        if (j != null)
        {
            koh1.a(9, j);
        }
        if (k != null)
        {
            koh1.a(10, k.intValue());
        }
        if (l != null)
        {
            koh1.a(11, l.intValue());
        }
        if (m != null)
        {
            koh1.a(12, m);
        }
        if (n != null)
        {
            koh1.a(13, n);
        }
        if (o != null)
        {
            koh1.b(14, o);
        }
        if (p != null)
        {
            koh1.b(15, p);
        }
        super.writeTo(koh1);
    }

}
