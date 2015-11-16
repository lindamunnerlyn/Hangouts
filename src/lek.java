// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lek extends kwm
{

    public lel a[];
    public Boolean b;

    public lek()
    {
        a = lel.a();
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
                    lel lel1 = a[k];
                    j = i;
                    if (lel1 != null)
                    {
                        j = i + kwk.d(1, lel1);
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
                lel alel[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alel = new lel[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alel, 0, j);
                    k = j;
                }
                for (; k < alel.length - 1; k++)
                {
                    alel[k] = new lel();
                    kwj1.a(alel[k]);
                    kwj1.a();
                }

                alel[k] = new lel();
                kwj1.a(alel[k]);
                a = alel;
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
                lel lel1 = a[i];
                if (lel1 != null)
                {
                    kwk1.b(1, lel1);
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
