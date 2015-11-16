// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmp extends kwm
{

    public kku a[];
    public String b;

    public kmp()
    {
        a = kku.a();
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
                    kku kku1 = a[k];
                    j = i;
                    if (kku1 != null)
                    {
                        j = i + kwk.d(1, kku1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
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
                kku akku[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akku = new kku[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akku, 0, j);
                    k = j;
                }
                for (; k < akku.length - 1; k++)
                {
                    akku[k] = new kku();
                    kwj1.a(akku[k]);
                    kwj1.a();
                }

                akku[k] = new kku();
                kwj1.a(akku[k]);
                a = akku;
                break;

            case 18: // '\022'
                b = kwj1.j();
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
                kku kku1 = a[i];
                if (kku1 != null)
                {
                    kwk1.b(1, kku1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        super.writeTo(kwk1);
    }
}
