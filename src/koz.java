// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class koz extends kwm
{

    public kpf a;
    public kpc b[];

    public koz()
    {
        a = null;
        b = kpc.a();
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
                    kpc kpc1 = b[j];
                    int k = i;
                    if (kpc1 != null)
                    {
                        k = i + kwk.d(2, kpc1);
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
                    a = new kpf();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                kpc akpc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akpc = new kpc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akpc, 0, j);
                    k = j;
                }
                for (; k < akpc.length - 1; k++)
                {
                    akpc[k] = new kpc();
                    kwj1.a(akpc[k]);
                    kwj1.a();
                }

                akpc[k] = new kpc();
                kwj1.a(akpc[k]);
                b = akpc;
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
                kpc kpc1 = b[i];
                if (kpc1 != null)
                {
                    kwk1.b(2, kpc1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
