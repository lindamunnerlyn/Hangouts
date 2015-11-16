// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lcy extends kwm
{

    public lcr a[];

    public lcy()
    {
        a = lcr.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    lcr lcr1 = a[j];
                    k = i;
                    if (lcr1 != null)
                    {
                        k = i + kwk.d(1, lcr1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                lcr alcr[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alcr = new lcr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alcr, 0, j);
                    k = j;
                }
                for (; k < alcr.length - 1; k++)
                {
                    alcr[k] = new lcr();
                    kwj1.a(alcr[k]);
                    kwj1.a();
                }

                alcr[k] = new lcr();
                kwj1.a(alcr[k]);
                a = alcr;
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
                lcr lcr1 = a[i];
                if (lcr1 != null)
                {
                    kwk1.b(1, lcr1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
