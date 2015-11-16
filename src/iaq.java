// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iaq extends kwm
{

    public ibg a;
    public ibg b;
    public iap c[];
    public Boolean d;

    public iaq()
    {
        a = null;
        b = null;
        c = iap.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    iap iap1 = c[j];
                    int k = i;
                    if (iap1 != null)
                    {
                        k = i + kwk.d(2, iap1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        return j;
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
                if (a == null)
                {
                    a = new ibg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                iap aiap[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiap = new iap[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiap, 0, j);
                    k = j;
                }
                for (; k < aiap.length - 1; k++)
                {
                    aiap[k] = new iap();
                    kwj1.a(aiap[k]);
                    kwj1.a();
                }

                aiap[k] = new iap();
                kwj1.a(aiap[k]);
                c = aiap;
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ibg();
                }
                kwj1.a(b);
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iap iap1 = c[i];
                if (iap1 != null)
                {
                    kwk1.b(2, iap1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
