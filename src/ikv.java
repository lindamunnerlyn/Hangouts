// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikv extends kwm
{

    public Integer a;
    public Integer b;

    public ikv()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        return super.computeSerializedSize() + kwk.e(1, a.intValue()) + kwk.e(2, b.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.intValue());
        kwk1.a(2, b.intValue());
        super.writeTo(kwk1);
    }
}
