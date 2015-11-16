// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyu extends kwm
{

    public ixl a;
    public iys b;
    public jdk requestHeader;

    public iyu()
    {
        requestHeader = null;
        a = null;
        b = null;
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
            j = i + kwk.d(2, a);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new ixl();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new iys();
                }
                kwj1.a(b);
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
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        super.writeTo(kwk1);
    }
}
