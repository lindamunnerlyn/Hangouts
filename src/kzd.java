// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzd extends koj
{

    public kzc a[];
    public kzc b[];

    public kzd()
    {
        a = kzc.a();
        b = kzc.a();
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
                    kzc kzc1 = a[k];
                    int i1 = i;
                    if (kzc1 != null)
                    {
                        i1 = i + koh.d(1, kzc1);
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
                    kzc kzc2 = b[l];
                    j1 = i;
                    if (kzc2 != null)
                    {
                        j1 = i + koh.d(2, kzc2);
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
                kzc akzc[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akzc = new kzc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akzc, 0, j);
                    l = j;
                }
                for (; l < akzc.length - 1; l++)
                {
                    akzc[l] = new kzc();
                    kog1.a(akzc[l]);
                    kog1.a();
                }

                akzc[l] = new kzc();
                kog1.a(akzc[l]);
                a = akzc;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                kzc akzc1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akzc1 = new kzc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akzc1, 0, k);
                    i1 = k;
                }
                for (; i1 < akzc1.length - 1; i1++)
                {
                    akzc1[i1] = new kzc();
                    kog1.a(akzc1[i1]);
                    kog1.a();
                }

                akzc1[i1] = new kzc();
                kog1.a(akzc1[i1]);
                b = akzc1;
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
                kzc kzc1 = a[i];
                if (kzc1 != null)
                {
                    koh1.b(1, kzc1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kzc kzc2 = b[j];
                if (kzc2 != null)
                {
                    koh1.b(2, kzc2);
                }
            }

        }
        super.writeTo(koh1);
    }
}
