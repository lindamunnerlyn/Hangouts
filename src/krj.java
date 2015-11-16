// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krj extends koj
{

    public static final kok a = kok.a(krj, 0xd0c6942L);
    private static final krj h[] = new krj[0];
    public Double b;
    public Double c;
    public String d;
    public String e;
    public String f;
    public koz g;

    public krj()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            b.doubleValue();
            i = j + (koh.f(1) + 8);
        }
        j = i;
        if (c != null)
        {
            c.doubleValue();
            j = i + (koh.f(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + koh.b(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(6, g);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 9: // '\t'
                b = Double.valueOf(kog1.b());
                break;

            case 17: // '\021'
                c = Double.valueOf(kog1.b());
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
                    g = new koz();
                }
                kog1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b.doubleValue());
        }
        if (c != null)
        {
            koh1.a(2, c.doubleValue());
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
        super.writeTo(koh1);
    }

}
