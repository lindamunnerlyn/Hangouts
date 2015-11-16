// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kow extends koj
{

    public kox a;
    public String b;
    public String c;
    public Long d;
    public String e;
    public ipr f;
    public ipq g;
    public String h;
    public String i;
    public String j;
    public Long k;
    public String l;
    public String m;
    public Long n;

    public kow()
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
            j1 = i1 + koh.e(4, d.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(6, f);
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
            j1 = i1 + koh.e(10, k.longValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.b(11, l);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(12, g);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(14, n.longValue());
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
                    a = new kox();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.e());
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new ipr();
                }
                kog1.a(f);
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

            case 80: // 'P'
                k = Long.valueOf(kog1.e());
                break;

            case 90: // 'Z'
                l = kog1.j();
                break;

            case 98: // 'b'
                if (g == null)
                {
                    g = new ipq();
                }
                kog1.a(g);
                break;

            case 106: // 'j'
                m = kog1.j();
                break;

            case 112: // 'p'
                n = Long.valueOf(kog1.d());
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
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
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
            koh1.b(10, k.longValue());
        }
        if (l != null)
        {
            koh1.a(11, l);
        }
        if (g != null)
        {
            koh1.b(12, g);
        }
        if (m != null)
        {
            koh1.a(13, m);
        }
        if (n != null)
        {
            koh1.a(14, n.longValue());
        }
        super.writeTo(koh1);
    }
}
