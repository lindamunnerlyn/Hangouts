// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzy extends kwm
{

    public idr a;
    public ige b;
    public Boolean c;

    public hzy()
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
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
                if (a == null)
                {
                    a = new idr();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ige();
                }
                kwj1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != null)
        {
            kwk1.a(2, c.booleanValue());
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        super.writeTo(kwk1);
    }
}
