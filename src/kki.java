// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kki extends kwm
{

    public Long a;
    public Long b;
    public Boolean c;

    public kki()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        return i;
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
                a = Long.valueOf(kwj1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
