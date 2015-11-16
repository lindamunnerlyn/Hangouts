// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ids extends kwm
{

    public Integer a;
    public Integer b;

    public ids()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        a.intValue();
        int j = kwk.f(1);
        b.intValue();
        return i + (j + 4) + (kwk.f(2) + 4);
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
        kwk1.b(1, a.intValue());
        kwk1.b(2, b.intValue());
        super.writeTo(kwk1);
    }
}
