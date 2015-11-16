// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivf extends kwm
{

    public ivg a[];

    public ivf()
    {
        a = ivg.a();
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
                    ivg ivg1 = a[j];
                    k = i;
                    if (ivg1 != null)
                    {
                        k = i + kwk.d(1, ivg1);
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
                ivg aivg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aivg = new ivg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aivg, 0, j);
                    k = j;
                }
                for (; k < aivg.length - 1; k++)
                {
                    aivg[k] = new ivg();
                    kwj1.a(aivg[k]);
                    kwj1.a();
                }

                aivg[k] = new ivg();
                kwj1.a(aivg[k]);
                a = aivg;
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
                ivg ivg1 = a[i];
                if (ivg1 != null)
                {
                    kwk1.b(1, ivg1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
