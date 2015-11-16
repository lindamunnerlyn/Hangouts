// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgc extends kwm
{

    public Long a;
    public kgd b[];

    public kgc()
    {
        a = null;
        b = kgd.a();
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
                    kgd kgd1 = b[j];
                    int k = i;
                    if (kgd1 != null)
                    {
                        k = i + kwk.d(2, kgd1);
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
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                kgd akgd[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akgd = new kgd[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akgd, 0, j);
                    k = j;
                }
                for (; k < akgd.length - 1; k++)
                {
                    akgd[k] = new kgd();
                    kwj1.a(akgd[k]);
                    kwj1.a();
                }

                akgd[k] = new kgd();
                kwj1.a(akgd[k]);
                b = akgd;
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
                kgd kgd1 = b[i];
                if (kgd1 != null)
                {
                    kwk1.b(2, kgd1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
