// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khh extends koj
{

    public String a;
    public String b;
    public String c;
    public Float d;
    public Float e;
    public Integer f;
    public Float g;

    public khh()
    {
        a = null;
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
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (koh.f(4) + 4);
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (koh.f(5) + 4);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(6, f.intValue());
        }
        i = j;
        if (g != null)
        {
            g.floatValue();
            i = j + (koh.f(7) + 4);
        }
        return i;
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

            case 10: // '\n'
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 37: // '%'
                d = Float.valueOf(kog1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kog1.c());
                break;

            case 48: // '0'
                f = Integer.valueOf(kog1.f());
                break;

            case 61: // '='
                g = Float.valueOf(kog1.c());
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
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.floatValue());
        }
        if (e != null)
        {
            koh1.a(5, e.floatValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g.floatValue());
        }
        super.writeTo(koh1);
    }
}
