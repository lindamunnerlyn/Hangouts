// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwk extends kwm
{

    public Double a;
    public Double b;

    public hwk()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.doubleValue();
            i = j + (kwk.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (kwk.f(2) + 8);
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
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.doubleValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.doubleValue());
        }
        super.writeTo(kwk1);
    }
}
