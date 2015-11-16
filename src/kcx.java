// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kcx extends kwm
{

    public kcz a[];
    public kcw b;

    public kcx()
    {
        a = kcz.a();
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
                    kcz kcz1 = a[k];
                    j = i;
                    if (kcz1 != null)
                    {
                        j = i + kwk.d(1, kcz1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
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
                kcz akcz[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akcz = new kcz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akcz, 0, j);
                    k = j;
                }
                for (; k < akcz.length - 1; k++)
                {
                    akcz[k] = new kcz();
                    kwj1.a(akcz[k]);
                    kwj1.a();
                }

                akcz[k] = new kcz();
                kwj1.a(akcz[k]);
                a = akcz;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kcw();
                }
                kwj1.a(b);
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
                kcz kcz1 = a[i];
                if (kcz1 != null)
                {
                    kwk1.b(1, kcz1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        super.writeTo(kwk1);
    }
}
