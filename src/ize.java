// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ize extends kwm
{

    public Long a;
    public byte b[];
    public String c;

    public ize()
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
        if (c != null)
        {
            i = j + kwk.b(1, c);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(3, a.longValue());
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

            case 10: // '\n'
                c = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.k();
                break;

            case 24: // '\030'
                a = Long.valueOf(kwj1.d());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (c != null)
        {
            kwk1.a(1, c);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (a != null)
        {
            kwk1.a(3, a.longValue());
        }
        super.writeTo(kwk1);
    }
}
