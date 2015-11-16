// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kax extends kwm
{

    public static final kwn a = kwn.a(kax, 0x65270aaL);
    private static final kax e[] = new kax[0];
    public Long b;
    public Long c;
    public ltc d;

    public kax()
    {
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        b.longValue();
        int j = kwk.f(1);
        c.longValue();
        j = i + (j + 8) + (kwk.f(2) + 8);
        i = j;
        if (d != null)
        {
            i = j + kwk.d(3, d);
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

            case 9: // '\t'
                b = Long.valueOf(kwj1.g());
                break;

            case 17: // '\021'
                c = Long.valueOf(kwj1.g());
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new ltc();
                }
                kwj1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.c(1, b.longValue());
        kwk1.c(2, c.longValue());
        if (d != null)
        {
            kwk1.b(3, d);
        }
        super.writeTo(kwk1);
    }

}
