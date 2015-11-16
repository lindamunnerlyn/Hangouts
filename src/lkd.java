// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkd extends kwm
{

    public lkc a[];
    public Boolean b;

    public lkd()
    {
        a = lkc.a();
        b = null;
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
                    lkc lkc1 = a[k];
                    j = i;
                    if (lkc1 != null)
                    {
                        j = i + kwk.d(1, lkc1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (kwk.f(2) + 1);
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
                lkc alkc[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alkc = new lkc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alkc, 0, j);
                    k = j;
                }
                for (; k < alkc.length - 1; k++)
                {
                    alkc[k] = new lkc();
                    kwj1.a(alkc[k]);
                    kwj1.a();
                }

                alkc[k] = new lkc();
                kwj1.a(alkc[k]);
                a = alkc;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
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
                lkc lkc1 = a[i];
                if (lkc1 != null)
                {
                    kwk1.b(1, lkc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
