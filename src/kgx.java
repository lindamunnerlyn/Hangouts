// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgx extends kwm
{

    public Integer a;
    public kjc b[];

    public kgx()
    {
        a = null;
        b = kjc.a();
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
                    kjc kjc1 = b[j];
                    int k = i;
                    if (kjc1 != null)
                    {
                        k = i + kwk.d(2, kjc1);
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
                kjc akjc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akjc = new kjc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akjc, 0, j);
                    k = j;
                }
                for (; k < akjc.length - 1; k++)
                {
                    akjc[k] = new kjc();
                    kwj1.a(akjc[k]);
                    kwj1.a();
                }

                akjc[k] = new kjc();
                kwj1.a(akjc[k]);
                b = akjc;
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
                kjc kjc1 = b[i];
                if (kjc1 != null)
                {
                    kwk1.b(2, kjc1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
