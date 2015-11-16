// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwv extends kop
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public String l;

    public dwv()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = 0;
        k = 0;
        l = "";
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (!a.equals(""))
        {
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + koh.b(4, d);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + koh.b(5, e);
        }
        j1 = i1;
        if (!f.equals(""))
        {
            j1 = i1 + koh.b(6, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + koh.b(7, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + koh.b(8, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + koh.b(9, i);
        }
        j1 = i1;
        if (j != 0)
        {
            j1 = i1 + koh.e(10, j);
        }
        i1 = j1;
        if (k != 0)
        {
            i1 = j1 + koh.e(11, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + koh.b(12, l);
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
                if (kou.a(kog1, i1))
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

            case 80: // 'P'
                j = kog1.f();
                break;

            case 88: // 'X'
                k = kog1.f();
                break;

            case 98: // 'b'
                l = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (!a.equals(""))
        {
            koh1.a(1, a);
        }
        if (!b.equals(""))
        {
            koh1.a(2, b);
        }
        if (!c.equals(""))
        {
            koh1.a(3, c);
        }
        if (!d.equals(""))
        {
            koh1.a(4, d);
        }
        if (!e.equals(""))
        {
            koh1.a(5, e);
        }
        if (!f.equals(""))
        {
            koh1.a(6, f);
        }
        if (!g.equals(""))
        {
            koh1.a(7, g);
        }
        if (!h.equals(""))
        {
            koh1.a(8, h);
        }
        if (!i.equals(""))
        {
            koh1.a(9, i);
        }
        if (j != 0)
        {
            koh1.a(10, j);
        }
        if (k != 0)
        {
            koh1.a(11, k);
        }
        if (!l.equals(""))
        {
            koh1.a(12, l);
        }
        super.writeTo(koh1);
    }
}
