// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkg extends kwm
{

    public String a;
    public lkf b[];
    public Long c;

    public lkg()
    {
        a = null;
        b = lkf.a();
        c = null;
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
                    lkf lkf1 = b[j];
                    int k = i;
                    if (lkf1 != null)
                    {
                        k = i + kwk.d(2, lkf1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.longValue());
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lkf alkf[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alkf = new lkf[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alkf, 0, j);
                    k = j;
                }
                for (; k < alkf.length - 1; k++)
                {
                    alkf[k] = new lkf();
                    kwj1.a(alkf[k]);
                    kwj1.a();
                }

                alkf[k] = new lkf();
                kwj1.a(alkf[k]);
                b = alkf;
                break;

            case 24: // '\030'
                c = Long.valueOf(kwj1.e());
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
                lkf lkf1 = b[i];
                if (lkf1 != null)
                {
                    kwk1.b(2, lkf1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c.longValue());
        }
        super.writeTo(kwk1);
    }
}
