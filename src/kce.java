// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kce extends kwm
{

    public kcg a[];
    public kcd b;

    public kce()
    {
        a = kcg.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    kcg kcg1 = a[k];
                    j = i;
                    if (kcg1 != null)
                    {
                        j = i + kwk.d(1, kcg1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
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
                int k = kwx.a(kwj1, 10);
                kcg akcg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akcg = new kcg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akcg, 0, j);
                    k = j;
                }
                for (; k < akcg.length - 1; k++)
                {
                    akcg[k] = new kcg();
                    kwj1.a(akcg[k]);
                    kwj1.a();
                }

                akcg[k] = new kcg();
                kwj1.a(akcg[k]);
                a = akcg;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kcd();
                }
                kwj1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kcg kcg1 = a[i];
                if (kcg1 != null)
                {
                    kwk1.b(1, kcg1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        super.writeTo(kwk1);
    }
}
