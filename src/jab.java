// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jab extends kwm
{

    public izp a[];
    public byte b[];
    public jdl responseHeader;

    public jab()
    {
        responseHeader = null;
        a = izp.a();
        b = null;
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
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    izp izp1 = a[j];
                    int k = i;
                    if (izp1 != null)
                    {
                        k = i + kwk.d(2, izp1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
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

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                izp aizp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aizp = new izp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aizp, 0, j);
                    k = j;
                }
                for (; k < aizp.length - 1; k++)
                {
                    aizp[k] = new izp();
                    kwj1.a(aizp[k]);
                    kwj1.a();
                }

                aizp[k] = new izp();
                kwj1.a(aizp[k]);
                a = aizp;
                break;

            case 26: // '\032'
                b = kwj1.k();
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                izp izp1 = a[i];
                if (izp1 != null)
                {
                    kwk1.b(2, izp1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        super.writeTo(kwk1);
    }
}
