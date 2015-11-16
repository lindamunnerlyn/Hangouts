// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agy extends kwm
{

    public iwb a[];
    public Integer b;

    public agy()
    {
        a = iwb.a();
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
                    iwb iwb1 = a[k];
                    j = i;
                    if (iwb1 != null)
                    {
                        j = i + kwk.d(1, iwb1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
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
                iwb aiwb[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiwb = new iwb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiwb, 0, j);
                    k = j;
                }
                for (; k < aiwb.length - 1; k++)
                {
                    aiwb[k] = new iwb();
                    kwj1.a(aiwb[k]);
                    kwj1.a();
                }

                aiwb[k] = new iwb();
                kwj1.a(aiwb[k]);
                a = aiwb;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
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
                iwb iwb1 = a[i];
                if (iwb1 != null)
                {
                    kwk1.b(1, iwb1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        super.writeTo(kwk1);
    }
}
