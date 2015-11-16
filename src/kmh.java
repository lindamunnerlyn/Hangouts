// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmh extends kwm
{

    public Long a;
    public Long b;

    public kmh()
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
            a.longValue();
            i = j + (kwk.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
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
                a = Long.valueOf(kwj1.g());
                break;

            case 17: // '\021'
                b = Long.valueOf(kwj1.g());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.c(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.c(2, b.longValue());
        }
        super.writeTo(kwk1);
    }
}
