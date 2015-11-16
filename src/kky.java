// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kky extends koj
{

    public Float a;
    public Float b;
    public Float c;
    public Float d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;

    public kky()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        a.floatValue();
        int k = koh.f(1);
        b.floatValue();
        int l = koh.f(2);
        c.floatValue();
        int i1 = koh.f(3);
        d.floatValue();
        int j1 = koh.f(4);
        e.floatValue();
        int k1 = koh.f(5);
        f.floatValue();
        int l1 = koh.f(6);
        g.floatValue();
        int i2 = koh.f(7);
        h.floatValue();
        int j2 = koh.f(8);
        i.floatValue();
        return j + (k + 4) + (l + 4) + (i1 + 4) + (j1 + 4) + (k1 + 4) + (l1 + 4) + (i2 + 4) + (j2 + 4) + (koh.f(9) + 4);
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

            case 13: // '\r'
                a = Float.valueOf(kog1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kog1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kog1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kog1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kog1.c());
                break;

            case 53: // '5'
                f = Float.valueOf(kog1.c());
                break;

            case 61: // '='
                g = Float.valueOf(kog1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kog1.c());
                break;

            case 77: // 'M'
                i = Float.valueOf(kog1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.floatValue());
        koh1.a(2, b.floatValue());
        koh1.a(3, c.floatValue());
        koh1.a(4, d.floatValue());
        koh1.a(5, e.floatValue());
        koh1.a(6, f.floatValue());
        koh1.a(7, g.floatValue());
        koh1.a(8, h.floatValue());
        koh1.a(9, i.floatValue());
        super.writeTo(koh1);
    }
}
