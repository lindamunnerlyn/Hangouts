// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izy extends kwm
{

    public iyx a[];
    public izz b[];
    public jdl responseHeader;

    public izy()
    {
        responseHeader = null;
        a = iyx.a();
        b = izz.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + kwk.d(1, responseHeader);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    iyx iyx1 = a[k];
                    int i1 = i;
                    if (iyx1 != null)
                    {
                        i1 = i + kwk.d(2, iyx1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    izz izz1 = b[l];
                    j1 = i;
                    if (izz1 != null)
                    {
                        j1 = i + kwk.d(3, izz1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                int l = kwx.a(kwj1, 18);
                iyx aiyx[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiyx = new iyx[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiyx, 0, j);
                    l = j;
                }
                for (; l < aiyx.length - 1; l++)
                {
                    aiyx[l] = new iyx();
                    kwj1.a(aiyx[l]);
                    kwj1.a();
                }

                aiyx[l] = new iyx();
                kwj1.a(aiyx[l]);
                a = aiyx;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                izz aizz[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aizz = new izz[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aizz, 0, k);
                    i1 = k;
                }
                for (; i1 < aizz.length - 1; i1++)
                {
                    aizz[i1] = new izz();
                    kwj1.a(aizz[i1]);
                    kwj1.a();
                }

                aizz[i1] = new izz();
                kwj1.a(aizz[i1]);
                b = aizz;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iyx iyx1 = a[i];
                if (iyx1 != null)
                {
                    kwk1.b(2, iyx1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                izz izz1 = b[j];
                if (izz1 != null)
                {
                    kwk1.b(3, izz1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
