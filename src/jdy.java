// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdy extends kwm
{

    public iwt a[];
    public jdk requestHeader;

    public jdy()
    {
        requestHeader = null;
        a = iwt.a();
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
                    iwt iwt1 = a[j];
                    int k = i;
                    if (iwt1 != null)
                    {
                        k = i + kwk.d(2, iwt1);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                iwt aiwt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiwt = new iwt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiwt, 0, j);
                    k = j;
                }
                for (; k < aiwt.length - 1; k++)
                {
                    aiwt[k] = new iwt();
                    kwj1.a(aiwt[k]);
                    kwj1.a();
                }

                aiwt[k] = new iwt();
                kwj1.a(aiwt[k]);
                a = aiwt;
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
                iwt iwt1 = a[i];
                if (iwt1 != null)
                {
                    kwk1.b(2, iwt1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
