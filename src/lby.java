// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lby extends koj
{

    public String a;
    public Integer b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public Integer l;
    public lbz m;
    public String n;

    public lby()
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.intValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
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
            j1 = i1 + koh.b(10, j);
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
            j1 = i1 + koh.e(12, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(14, n);
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
                a = kog1.j();
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                e = kog1.j();
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

            case 82: // 'R'
                j = kog1.j();
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kog1.i());
                break;

            case 96: // '`'
                l = Integer.valueOf(kog1.f());
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new lbz();
                }
                kog1.a(m);
                break;

            case 114: // 'r'
                n = kog1.j();
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
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
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
            koh1.a(10, j);
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        if (l != null)
        {
            koh1.a(12, l.intValue());
        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        if (n != null)
        {
            koh1.a(14, n);
        }
        super.writeTo(koh1);
    }
}
