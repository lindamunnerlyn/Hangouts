// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krh extends koj
{

    public static final kok a = kok.a(krh, 0xcfe110aL);
    private static final krh l[] = new krh[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kpl g;
    public String h;
    public String i;
    public koz j;
    public kpn k;

    public krh()
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
        if (i != null)
        {
            j1 = i1 + koh.b(4, i);
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
        if (e != null)
        {
            i1 = j1 + koh.b(7, e);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(11, h);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(12, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(13, k);
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
                i = kog1.j();
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
                e = kog1.j();
                break;

            case 90: // 'Z'
                h = kog1.j();
                break;

            case 98: // 'b'
                if (j == null)
                {
                    j = new koz();
                }
                kog1.a(j);
                break;

            case 106: // 'j'
                if (k == null)
                {
                    k = new kpn();
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
        if (i != null)
        {
            koh1.a(4, i);
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (g != null)
        {
            koh1.b(6, g);
        }
        if (e != null)
        {
            koh1.a(7, e);
        }
        if (h != null)
        {
            koh1.a(11, h);
        }
        if (j != null)
        {
            koh1.b(12, j);
        }
        if (k != null)
        {
            koh1.b(13, k);
        }
        super.writeTo(koh1);
    }

}
