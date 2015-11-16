// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ead extends kws
{

    public eae a[];

    public ead()
    {
        a = eae.a();
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
                    eae eae1 = a[j];
                    k = i;
                    if (eae1 != null)
                    {
                        k = i + kwk.d(1, eae1);
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
                if (kwj1.b(i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = kwx.a(kwj1, 10);
                eae aeae[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aeae = new eae[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aeae, 0, j);
                    k = j;
                }
                for (; k < aeae.length - 1; k++)
                {
                    aeae[k] = new eae();
                    kwj1.a(aeae[k]);
                    kwj1.a();
                }

                aeae[k] = new eae();
                kwj1.a(aeae[k]);
                a = aeae;
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
                eae eae1 = a[i];
                if (eae1 != null)
                {
                    kwk1.b(1, eae1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
