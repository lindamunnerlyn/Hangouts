// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibx extends kwm
{

    public iim a;
    public iix b[];

    public ibx()
    {
        a = null;
        b = iix.a();
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    iix iix1 = b[j];
                    int k = i;
                    if (iix1 != null)
                    {
                        k = i + kwk.d(2, iix1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
                if (a == null)
                {
                    a = new iim();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                iix aiix[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aiix = new iix[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aiix, 0, j);
                    k = j;
                }
                for (; k < aiix.length - 1; k++)
                {
                    aiix[k] = new iix();
                    kwj1.a(aiix[k]);
                    kwj1.a();
                }

                aiix[k] = new iix();
                kwj1.a(aiix[k]);
                b = aiix;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                iix iix1 = b[i];
                if (iix1 != null)
                {
                    kwk1.b(2, iix1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
