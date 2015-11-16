// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kfu extends kwm
{

    public Long a;
    public kfv b[];

    public kfu()
    {
        a = null;
        b = kfv.a();
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
                    kfv kfv1 = b[j];
                    int k = i;
                    if (kfv1 != null)
                    {
                        k = i + kwk.d(2, kfv1);
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
                kfv akfv[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akfv = new kfv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akfv, 0, j);
                    k = j;
                }
                for (; k < akfv.length - 1; k++)
                {
                    akfv[k] = new kfv();
                    kwj1.a(akfv[k]);
                    kwj1.a();
                }

                akfv[k] = new kfv();
                kwj1.a(akfv[k]);
                b = akfv;
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
                kfv kfv1 = b[i];
                if (kfv1 != null)
                {
                    kwk1.b(2, kfv1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
