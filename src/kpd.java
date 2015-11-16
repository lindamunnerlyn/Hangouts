// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kpd extends kwm
{

    public Integer a;
    public Integer b;

    public kpd()
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
            a.intValue();
            i = j + (kwk.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.intValue();
            j = i + (kwk.f(2) + 4);
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
                a = Integer.valueOf(kwj1.h());
                break;

            case 21: // '\025'
                b = Integer.valueOf(kwj1.h());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.intValue());
        }
        super.writeTo(kwk1);
    }
}
