// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izj extends kwm
{

    public String a;
    public String b;
    public Boolean c;
    public Boolean d;

    public izj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + kwk.b(1, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.b(3, a);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
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

            case 10: // '\n'
                b = kwj1.j();
                break;

            case 16: // '\020'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                a = kwj1.j();
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c.booleanValue());
        }
        if (a != null)
        {
            kwk1.a(3, a);
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
