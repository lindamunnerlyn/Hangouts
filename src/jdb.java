// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdb extends kwm
{

    public izg a;
    public jce b;
    public byte c[];
    public Long d;
    public jdk requestHeader;

    public jdb()
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
        if (c != null)
        {
            j = i + kwk.b(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d.longValue());
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(5, a);
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

            case 18: // '\022'
                c = kwj1.k();
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jce();
                }
                kwj1.a(b);
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.d());
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new izg();
                }
                kwj1.a(a);
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
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (d != null)
        {
            kwk1.a(4, d.longValue());
        }
        if (a != null)
        {
            kwk1.b(5, a);
        }
        super.writeTo(kwk1);
    }
}
