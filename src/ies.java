// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ies extends kwm
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Boolean f;

    public ies()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        a.doubleValue();
        int j = kwk.f(1);
        b.doubleValue();
        j = i + (j + 8) + (kwk.f(2) + 8);
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (kwk.f(3) + 8);
        }
        j = i;
        if (d != null)
        {
            d.doubleValue();
            j = i + (kwk.f(4) + 8);
        }
        i = j;
        if (e != null)
        {
            e.doubleValue();
            i = j + (kwk.f(5) + 8);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (kwk.f(6) + 1);
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

            case 9: // '\t'
                a = Double.valueOf(kwj1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kwj1.b());
                break;

            case 25: // '\031'
                c = Double.valueOf(kwj1.b());
                break;

            case 33: // '!'
                d = Double.valueOf(kwj1.b());
                break;

            case 41: // ')'
                e = Double.valueOf(kwj1.b());
                break;

            case 48: // '0'
                f = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.doubleValue());
        kwk1.a(2, b.doubleValue());
        if (c != null)
        {
            kwk1.a(3, c.doubleValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.doubleValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.doubleValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
