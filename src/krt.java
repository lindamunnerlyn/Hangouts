// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krt extends kwm
{

    public krp a;
    public krp b;

    public krt()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(4, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(5, b);
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

            case 34: // '"'
                if (a == null)
                {
                    a = new krp();
                }
                kwj1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new krp();
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
            kwk1.b(4, a);
        }
        if (b != null)
        {
            kwk1.b(5, b);
        }
        super.writeTo(kwk1);
    }
}
