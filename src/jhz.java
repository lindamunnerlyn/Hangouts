// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhz extends kwm
{

    public kbm a;
    public kbm b;
    public Boolean c;

    public jhz()
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
        if (b != null)
        {
            j = i + kwk.d(2, b);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new kbm();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kbm();
                }
                kwj1.a(b);
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
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
