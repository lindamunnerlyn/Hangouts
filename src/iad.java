// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iad extends kwm
{

    public ibg a;
    public icl b[];

    public iad()
    {
        a = null;
        b = icl.a();
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
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    icl icl1 = b[j];
                    int k = i;
                    if (icl1 != null)
                    {
                        k = i + kwk.d(2, icl1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ibg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                icl aicl[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aicl = new icl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aicl, 0, j);
                    k = j;
                }
                for (; k < aicl.length - 1; k++)
                {
                    aicl[k] = new icl();
                    kwj1.a(aicl[k]);
                    kwj1.a();
                }

                aicl[k] = new icl();
                kwj1.a(aicl[k]);
                b = aicl;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                icl icl1 = b[i];
                if (icl1 != null)
                {
                    kwk1.b(2, icl1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
