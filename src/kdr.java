// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdr extends kwm
{

    public kdq a;
    public kdn b[];

    public kdr()
    {
        a = null;
        b = kdn.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kdn kdn1 = b[j];
                    int k = i;
                    if (kdn1 != null)
                    {
                        k = i + kwk.d(3, kdn1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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

            case 18: // '\022'
                if (a == null)
                {
                    a = new kdq();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                kdn akdn[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akdn = new kdn[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akdn, 0, j);
                    k = j;
                }
                for (; k < akdn.length - 1; k++)
                {
                    akdn[k] = new kdn();
                    kwj1.a(akdn[k]);
                    kwj1.a();
                }

                akdn[k] = new kdn();
                kwj1.a(akdn[k]);
                b = akdn;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kdn kdn1 = b[i];
                if (kdn1 != null)
                {
                    kwk1.b(3, kdn1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
