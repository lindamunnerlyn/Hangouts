// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwd extends koj
{

    public kwf a[];
    public kwe b[];

    public kwd()
    {
        a = kwf.a();
        b = kwe.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    kwf kwf1 = a[k];
                    int i1 = i;
                    if (kwf1 != null)
                    {
                        i1 = i + koh.d(1, kwf1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    kwe kwe1 = b[l];
                    j1 = i;
                    if (kwe1 != null)
                    {
                        j1 = i + koh.d(2, kwe1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l = kou.b(kog1, 10);
                kwf akwf[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akwf = new kwf[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akwf, 0, j);
                    l = j;
                }
                for (; l < akwf.length - 1; l++)
                {
                    akwf[l] = new kwf();
                    kog1.a(akwf[l]);
                    kog1.a();
                }

                akwf[l] = new kwf();
                kog1.a(akwf[l]);
                a = akwf;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                kwe akwe[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akwe = new kwe[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akwe, 0, k);
                    i1 = k;
                }
                for (; i1 < akwe.length - 1; i1++)
                {
                    akwe[i1] = new kwe();
                    kog1.a(akwe[i1]);
                    kog1.a();
                }

                akwe[i1] = new kwe();
                kog1.a(akwe[i1]);
                b = akwe;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kwf kwf1 = a[i];
                if (kwf1 != null)
                {
                    koh1.b(1, kwf1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kwe kwe1 = b[j];
                if (kwe1 != null)
                {
                    koh1.b(2, kwe1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
