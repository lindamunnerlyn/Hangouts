// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lal extends kwm
{

    public lam a[];

    public lal()
    {
        a = lam.a();
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
                    lam lam1 = a[j];
                    k = i;
                    if (lam1 != null)
                    {
                        k = i + kwk.d(1, lam1);
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
                lam alam[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alam = new lam[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alam, 0, j);
                    k = j;
                }
                for (; k < alam.length - 1; k++)
                {
                    alam[k] = new lam();
                    kwj1.a(alam[k]);
                    kwj1.a();
                }

                alam[k] = new lam();
                kwj1.a(alam[k]);
                a = alam;
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
                lam lam1 = a[i];
                if (lam1 != null)
                {
                    kwk1.b(1, lam1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
