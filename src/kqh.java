// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqh extends koj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public igi e;
    public kus f;
    public String g;
    public kqk h;
    public kqg i;
    public Boolean j;
    public kqj k;
    public String l;
    public String m;
    public String n;

    public kqh()
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
            j1 = i1 + koh.b(2, b);
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
        if (g != null)
        {
            i1 = j1 + koh.b(5, g);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(6, c);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j.booleanValue();
            j1 = i1 + (koh.f(8) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(10, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(11, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(12, n);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(13, h);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(14, f);
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

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new igi();
                }
                kog1.a(e);
                break;

            case 42: // '*'
                g = kog1.j();
                break;

            case 50: // '2'
                c = kog1.j();
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new kqg();
                }
                kog1.a(i);
                break;

            case 64: // '@'
                j = Boolean.valueOf(kog1.i());
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new kqj();
                }
                kog1.a(k);
                break;

            case 82: // 'R'
                l = kog1.j();
                break;

            case 90: // 'Z'
                m = kog1.j();
                break;

            case 98: // 'b'
                n = kog1.j();
                break;

            case 106: // 'j'
                if (h == null)
                {
                    h = new kqk();
                }
                kog1.a(h);
                break;

            case 114: // 'r'
                if (f == null)
                {
                    f = new kus();
                }
                kog1.a(f);
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
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (c != null)
        {
            koh1.a(6, c);
        }
        if (i != null)
        {
            koh1.b(7, i);
        }
        if (j != null)
        {
            koh1.a(8, j.booleanValue());
        }
        if (k != null)
        {
            koh1.b(9, k);
        }
        if (l != null)
        {
            koh1.a(10, l);
        }
        if (m != null)
        {
            koh1.a(11, m);
        }
        if (n != null)
        {
            koh1.a(12, n);
        }
        if (h != null)
        {
            koh1.b(13, h);
        }
        if (f != null)
        {
            koh1.b(14, f);
        }
        super.writeTo(koh1);
    }
}
