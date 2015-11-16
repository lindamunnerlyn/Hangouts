// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdw extends kwm
{

    public Boolean a;
    public String b;
    public Integer c;
    public Boolean d;
    public jdk requestHeader;

    public jdw()
    {
        requestHeader = null;
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
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            a.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.f(4, c.intValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (kwk.f(5) + 1);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 16: // '\020'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                b = kwj1.j();
                break;

            case 32: // ' '
                c = Integer.valueOf(kwj1.l());
                break;

            case 40: // '('
                d = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.c(4, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(5, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
