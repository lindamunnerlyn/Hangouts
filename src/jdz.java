// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdz extends kwm
{

    public iwv a[];
    public jdl responseHeader;

    public jdz()
    {
        responseHeader = null;
        a = iwv.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    iwv iwv1 = a[k];
                    j = i;
                    if (iwv1 != null)
                    {
                        j = i + kwk.d(1, iwv1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(2, responseHeader);
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
                int k = kwx.a(kwj1, 10);
                iwv aiwv[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiwv = new iwv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiwv, 0, j);
                    k = j;
                }
                for (; k < aiwv.length - 1; k++)
                {
                    aiwv[k] = new iwv();
                    kwj1.a(aiwv[k]);
                    kwj1.a();
                }

                aiwv[k] = new iwv();
                kwj1.a(aiwv[k]);
                a = aiwv;
                break;

            case 18: // '\022'
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iwv iwv1 = a[i];
                if (iwv1 != null)
                {
                    kwk1.b(1, iwv1);
                }
            }

        }
        if (responseHeader != null)
        {
            kwk1.b(2, responseHeader);
        }
        super.writeTo(kwk1);
    }
}
