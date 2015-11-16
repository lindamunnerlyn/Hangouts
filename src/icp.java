// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icp extends kwm
{

    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public icp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
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
            i = j + (kwk.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (kwk.f(2) + 4);
        }
        i = j;
        if (c != null)
        {
            c.floatValue();
            i = j + (kwk.f(3) + 4);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (kwk.f(4) + 4);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
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
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.floatValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.floatValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.floatValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.floatValue());
        }
        super.writeTo(kwk1);
    }
}
