// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ktb extends kwm
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

    public ktb()
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
        int k = kwk.f(1);
        b.floatValue();
        int l = kwk.f(2);
        c.floatValue();
        int i1 = kwk.f(3);
        d.floatValue();
        int j1 = kwk.f(4);
        e.floatValue();
        int k1 = kwk.f(5);
        f.floatValue();
        int l1 = kwk.f(6);
        g.floatValue();
        int i2 = kwk.f(7);
        h.floatValue();
        int j2 = kwk.f(8);
        i.floatValue();
        return j + (k + 4) + (l + 4) + (i1 + 4) + (j1 + 4) + (k1 + 4) + (l1 + 4) + (i2 + 4) + (j2 + 4) + (kwk.f(9) + 4);
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int j = kwj1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kwj1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Float.valueOf(kwj1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kwj1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kwj1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kwj1.c());
                break;

            case 53: // '5'
                f = Float.valueOf(kwj1.c());
                break;

            case 61: // '='
                g = Float.valueOf(kwj1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kwj1.c());
                break;

            case 77: // 'M'
                i = Float.valueOf(kwj1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.floatValue());
        kwk1.a(2, b.floatValue());
        kwk1.a(3, c.floatValue());
        kwk1.a(4, d.floatValue());
        kwk1.a(5, e.floatValue());
        kwk1.a(6, f.floatValue());
        kwk1.a(7, g.floatValue());
        kwk1.a(8, h.floatValue());
        kwk1.a(9, i.floatValue());
        super.writeTo(kwk1);
    }
}
