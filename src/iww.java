// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iww extends kwm
{

    public jbr a;
    public izd b[];

    public iww()
    {
        a = null;
        b = izd.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    izd izd1 = b[k];
                    j = i;
                    if (izd1 != null)
                    {
                        j = i + kwk.d(2, izd1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(3, a);
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

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                izd aizd[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aizd = new izd[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aizd, 0, j);
                    k = j;
                }
                for (; k < aizd.length - 1; k++)
                {
                    aizd[k] = new izd();
                    kwj1.a(aizd[k]);
                    kwj1.a();
                }

                aizd[k] = new izd();
                kwj1.a(aizd[k]);
                b = aizd;
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new jbr();
                }
                kwj1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                izd izd1 = b[i];
                if (izd1 != null)
                {
                    kwk1.b(2, izd1);
                }
            }

        }
        if (a != null)
        {
            kwk1.b(3, a);
        }
        super.writeTo(kwk1);
    }
}
