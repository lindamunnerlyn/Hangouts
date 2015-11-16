// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyn extends kwm
{

    public kmr a;
    public hxz apiHeader;

    public hyn()
    {
        apiHeader = null;
        a = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (apiHeader != null)
        {
            i = j + kwk.d(1, apiHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
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
                if (apiHeader == null)
                {
                    apiHeader = new hxz();
                }
                kwj1.a(apiHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new kmr();
                }
                kwj1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (apiHeader != null)
        {
            kwk1.b(1, apiHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        super.writeTo(kwk1);
    }
}
