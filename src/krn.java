// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krn extends koj
{

    public static final kok a = kok.a(krn, 0xd0c68b2L);
    private static final krn k[] = new krn[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public koz j;

    public krn()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (b != null)
        {
            l = i1 + koh.b(1, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l + koh.b(2, c);
        }
        l = i1;
        if (d != null)
        {
            l = i1 + koh.b(3, d);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + koh.b(4, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + koh.b(5, f);
        }
        i1 = l;
        if (g != null)
        {
            i1 = l + koh.b(6, g);
        }
        l = i1;
        if (h != null)
        {
            l = i1 + koh.b(7, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + koh.b(8, i);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + koh.d(9, j);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int l = kog1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kog1, l))
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
                g = kog1.j();
                break;

            case 58: // ':'
                h = kog1.j();
                break;

            case 66: // 'B'
                i = kog1.j();
                break;

            case 74: // 'J'
                if (j == null)
                {
                    j = new koz();
                }
                kog1.a(j);
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
            koh1.b(9, j);
        }
        super.writeTo(koh1);
    }

}
