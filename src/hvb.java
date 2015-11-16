// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvb extends kwm
{

    public Long a;
    public String b;
    public String c;

    public hvb()
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
            i = j + kwk.e(2, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(4, c);
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

            case 16: // '\020'
                a = Long.valueOf(kwj1.e());
                break;

            case 26: // '\032'
                b = kwj1.j();
                break;

            case 34: // '"'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(2, a.longValue());
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        super.writeTo(kwk1);
    }
}
