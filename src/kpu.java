// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kpu extends koj
{

    public static final kok a = kok.a(kpu, 0xcfab3f2L);
    private static final kpu i[] = new kpu[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public koz h;

    public kpu()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kpu[] a()
    {
        return i;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (b != null)
        {
            j = k + koh.b(1, b);
        }
        k = j;
        if (c != null)
        {
            k = j + koh.b(2, c);
        }
        j = k;
        if (d != null)
        {
            j = k + koh.b(3, d);
        }
        k = j;
        if (e != null)
        {
            k = j + koh.b(4, e);
        }
        j = k;
        if (f != null)
        {
            j = k + koh.b(5, f);
        }
        k = j;
        if (g != null)
        {
            k = j + koh.b(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + koh.d(7, h);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
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
                if (h == null)
                {
                    h = new koz();
                }
                kog1.a(h);
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
            koh1.b(7, h);
        }
        super.writeTo(koh1);
    }

}
