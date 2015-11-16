// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kks extends koj
{

    public Float a;
    public Float b;
    public Float c;
    public Float d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;

    public kks()
    {
        a = null;
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

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.floatValue();
            i = j + (koh.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (koh.f(2) + 4);
        }
        i = j;
        if (c != null)
        {
            c.floatValue();
            i = j + (koh.f(3) + 4);
        }
        j = i;
        if (g != null)
        {
            g.floatValue();
            j = i + (koh.f(7) + 4);
        }
        i = j;
        if (h != null)
        {
            h.floatValue();
            i = j + (koh.f(8) + 4);
        }
        j = i;
        if (e != null)
        {
            e.floatValue();
            j = i + (koh.f(9) + 4);
        }
        i = j;
        if (d != null)
        {
            d.floatValue();
            i = j + (koh.f(10) + 4);
        }
        j = i;
        if (f != null)
        {
            f.floatValue();
            j = i + (koh.f(11) + 4);
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

            case 13: // '\r'
                a = Float.valueOf(kog1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kog1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kog1.c());
                break;

            case 61: // '='
                g = Float.valueOf(kog1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kog1.c());
                break;

            case 77: // 'M'
                e = Float.valueOf(kog1.c());
                break;

            case 85: // 'U'
                d = Float.valueOf(kog1.c());
                break;

            case 93: // ']'
                f = Float.valueOf(kog1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.floatValue());
        }
        if (b != null)
        {
            koh1.a(2, b.floatValue());
        }
        if (c != null)
        {
            koh1.a(3, c.floatValue());
        }
        if (g != null)
        {
            koh1.a(7, g.floatValue());
        }
        if (h != null)
        {
            koh1.a(8, h.floatValue());
        }
        if (e != null)
        {
            koh1.a(9, e.floatValue());
        }
        if (d != null)
        {
            koh1.a(10, d.floatValue());
        }
        if (f != null)
        {
            koh1.a(11, f.floatValue());
        }
        super.writeTo(koh1);
    }
}
