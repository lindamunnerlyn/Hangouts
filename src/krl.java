// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krl extends koj
{

    public static final kok a = kok.a(krl, 0xcc87312L);
    private static final krl r[] = new krl[0];
    public String b;
    public String c;
    public String d;
    public krn e;
    public krj f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public koz l;
    public koz m;
    public String n;
    public String o;
    public Boolean p;
    public String q;

    public krl()
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
        q = null;
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
            j1 = i1 + koh.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(7, h);
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
            j1 = i1 + koh.b(10, k);
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
            i1 = j1 + koh.b(13, n);
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
            i1 = j1 + (koh.f(15) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.b(16, q);
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
                b = kog1.j();
                break;

            case 18: // '\022'
                c = kog1.j();
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new krn();
                }
                kog1.a(e);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new krj();
                }
                kog1.a(f);
                break;

            case 50: // '2'
                g = kog1.j();
                break;

            case 58: // ':'
                h = kog1.j();
                break;

            case 66: // 'B'
                i = kog1.j();
                break;

            case 74: // 'J'
                j = kog1.j();
                break;

            case 82: // 'R'
                k = kog1.j();
                break;

            case 90: // 'Z'
                if (l == null)
                {
                    l = new koz();
                }
                kog1.a(l);
                break;

            case 98: // 'b'
                if (m == null)
                {
                    m = new koz();
                }
                kog1.a(m);
                break;

            case 106: // 'j'
                n = kog1.j();
                break;

            case 114: // 'r'
                o = kog1.j();
                break;

            case 120: // 'x'
                p = Boolean.valueOf(kog1.i());
                break;

            case 130: 
                q = kog1.j();
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
            koh1.b(4, e);
        }
        if (f != null)
        {
            koh1.b(5, f);
        }
        if (g != null)
        {
            koh1.a(6, g);
        }
        if (h != null)
        {
            koh1.a(7, h);
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
            koh1.a(10, k);
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
            koh1.a(13, n);
        }
        if (o != null)
        {
            koh1.a(14, o);
        }
        if (p != null)
        {
            koh1.a(15, p.booleanValue());
        }
        if (q != null)
        {
            koh1.a(16, q);
        }
        super.writeTo(koh1);
    }

}
