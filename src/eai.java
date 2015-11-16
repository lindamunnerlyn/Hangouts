// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eai extends kws
{

    public eah a[];

    public eai()
    {
        a = eah.a();
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
                    eah eah1 = a[j];
                    k = i;
                    if (eah1 != null)
                    {
                        k = i + kwk.d(1, eah1);
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
                eah aeah[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aeah = new eah[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aeah, 0, j);
                    k = j;
                }
                for (; k < aeah.length - 1; k++)
                {
                    aeah[k] = new eah();
                    kwj1.a(aeah[k]);
                    kwj1.a();
                }

                aeah[k] = new eah();
                kwj1.a(aeah[k]);
                a = aeah;
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
                eah eah1 = a[i];
                if (eah1 != null)
                {
                    kwk1.b(1, eah1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
