// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imp extends kwm
{

    public Integer a;
    public ima b[];

    public imp()
    {
        a = null;
        b = ima.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ima ima1 = b[j];
                    int k = i;
                    if (ima1 != null)
                    {
                        k = i + kwk.d(2, ima1);
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                ima aima[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aima = new ima[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aima, 0, j);
                    k = j;
                }
                for (; k < aima.length - 1; k++)
                {
                    aima[k] = new ima();
                    kwj1.a(aima[k]);
                    kwj1.a();
                }

                aima[k] = new ima();
                kwj1.a(aima[k]);
                b = aima;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ima ima1 = b[i];
                if (ima1 != null)
                {
                    kwk1.b(2, ima1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
