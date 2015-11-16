// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icw extends kwm
{

    public hww a[];

    public icw()
    {
        a = hww.a();
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
                    hww hww1 = a[j];
                    k = i;
                    if (hww1 != null)
                    {
                        k = i + kwk.d(1, hww1);
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
                hww ahww[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahww = new hww[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahww, 0, j);
                    k = j;
                }
                for (; k < ahww.length - 1; k++)
                {
                    ahww[k] = new hww();
                    kwj1.a(ahww[k]);
                    kwj1.a();
                }

                ahww[k] = new hww();
                kwj1.a(ahww[k]);
                a = ahww;
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
                hww hww1 = a[i];
                if (hww1 != null)
                {
                    kwk1.b(1, hww1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
