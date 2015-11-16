// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfr extends kwm
{

    public izq a[];
    public byte b[];
    public jdk requestHeader;

    public jfr()
    {
        requestHeader = null;
        a = izq.a();
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
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    izq izq1 = a[j];
                    int k = i;
                    if (izq1 != null)
                    {
                        k = i + kwk.d(2, izq1);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                izq aizq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aizq = new izq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aizq, 0, j);
                    k = j;
                }
                for (; k < aizq.length - 1; k++)
                {
                    aizq[k] = new izq();
                    kwj1.a(aizq[k]);
                    kwj1.a();
                }

                aizq[k] = new izq();
                kwj1.a(aizq[k]);
                a = aizq;
                break;

            case 26: // '\032'
                b = kwj1.k();
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                izq izq1 = a[i];
                if (izq1 != null)
                {
                    kwk1.b(2, izq1);
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
