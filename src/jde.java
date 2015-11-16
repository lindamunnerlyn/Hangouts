// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jde extends kwm
{

    public iza a;
    public ixg b;
    public Long c;
    public String d;
    public jdl responseHeader;

    public jde()
    {
        responseHeader = null;
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
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(3, d);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(4, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(5, b);
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 16: // '\020'
                c = Long.valueOf(kwj1.d());
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new iza();
                }
                kwj1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new ixg();
                }
                kwj1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (c != null)
        {
            kwk1.a(2, c.longValue());
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (a != null)
        {
            kwk1.b(4, a);
        }
        if (b != null)
        {
            kwk1.b(5, b);
        }
        super.writeTo(kwk1);
    }
}
