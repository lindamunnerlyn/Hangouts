// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ilo extends kwm
{

    public String a;
    public ilp b[];

    public ilo()
    {
        a = null;
        b = ilp.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ilp ilp1 = b[j];
                    int k = i;
                    if (ilp1 != null)
                    {
                        k = i + kwk.d(2, ilp1);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                ilp ailp[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ailp = new ilp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ailp, 0, j);
                    k = j;
                }
                for (; k < ailp.length - 1; k++)
                {
                    ailp[k] = new ilp();
                    kwj1.a(ailp[k]);
                    kwj1.a();
                }

                ailp[k] = new ilp();
                kwj1.a(ailp[k]);
                b = ailp;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ilp ilp1 = b[i];
                if (ilp1 != null)
                {
                    kwk1.b(2, ilp1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
