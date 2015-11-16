// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class leh extends kwm
{

    public lej a[];
    public lei b[];

    public leh()
    {
        a = lej.a();
        b = lei.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    lej lej1 = a[k];
                    int i1 = i;
                    if (lej1 != null)
                    {
                        i1 = i + kwk.d(1, lej1);
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
                    lei lei1 = b[l];
                    j1 = i;
                    if (lei1 != null)
                    {
                        j1 = i + kwk.d(2, lei1);
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
                int l = kwx.a(kwj1, 10);
                lej alej[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alej = new lej[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alej, 0, j);
                    l = j;
                }
                for (; l < alej.length - 1; l++)
                {
                    alej[l] = new lej();
                    kwj1.a(alej[l]);
                    kwj1.a();
                }

                alej[l] = new lej();
                kwj1.a(alej[l]);
                a = alej;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                lei alei[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                alei = new lei[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, alei, 0, k);
                    i1 = k;
                }
                for (; i1 < alei.length - 1; i1++)
                {
                    alei[i1] = new lei();
                    kwj1.a(alei[i1]);
                    kwj1.a();
                }

                alei[i1] = new lei();
                kwj1.a(alei[i1]);
                b = alei;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lej lej1 = a[i];
                if (lej1 != null)
                {
                    kwk1.b(1, lej1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                lei lei1 = b[j];
                if (lei1 != null)
                {
                    kwk1.b(2, lei1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
