// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kev extends kwm
{

    public Long a;
    public lbc b[];
    public ksv c;

    public kev()
    {
        a = null;
        b = lbc.a();
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
            i = j + kwk.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lbc lbc1 = b[j];
                    int k = i;
                    if (lbc1 != null)
                    {
                        k = i + kwk.d(2, lbc1);
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
            i = j + kwk.d(3, c);
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lbc albc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                albc = new lbc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, albc, 0, j);
                    k = j;
                }
                for (; k < albc.length - 1; k++)
                {
                    albc[k] = new lbc();
                    kwj1.a(albc[k]);
                    kwj1.a();
                }

                albc[k] = new lbc();
                kwj1.a(albc[k]);
                b = albc;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ksv();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lbc lbc1 = b[i];
                if (lbc1 != null)
                {
                    kwk1.b(2, lbc1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
