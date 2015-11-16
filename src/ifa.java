// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifa extends kwm
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public ifa()
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
        int i = super.computeSerializedSize();
        a.doubleValue();
        int j = kwk.f(1);
        b.doubleValue();
        int k = kwk.f(2);
        c.doubleValue();
        int l = kwk.f(3);
        d.doubleValue();
        return i + (j + 8) + (k + 8) + (l + 8) + (kwk.f(4) + 8);
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
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.doubleValue());
        kwk1.a(2, b.doubleValue());
        kwk1.a(3, c.doubleValue());
        kwk1.a(4, d.doubleValue());
        super.writeTo(kwk1);
    }
}
