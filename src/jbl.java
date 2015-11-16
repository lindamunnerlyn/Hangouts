// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbl extends kwm
{

    public jbm a;
    public jbn b;
    public jbo c;

    public jbl()
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
        if (b != null)
        {
            i = j + kwk.d(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(2, c);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(3, a);
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
                if (b == null)
                {
                    b = new jbn();
                }
                kwj1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new jbo();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new jbm();
                }
                kwj1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (a != null)
        {
            kwk1.b(3, a);
        }
        super.writeTo(kwk1);
    }
}
