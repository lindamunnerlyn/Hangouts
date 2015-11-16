// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwh extends koj
{

    public hwc a;
    public hwg b[];

    public hwh()
    {
        a = null;
        b = hwg.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hwg hwg1 = b[j];
                    int k = i;
                    if (hwg1 != null)
                    {
                        k = i + koh.d(2, hwg1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
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
                if (a == null)
                {
                    a = new hwc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                hwg ahwg[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahwg = new hwg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahwg, 0, j);
                    k = j;
                }
                for (; k < ahwg.length - 1; k++)
                {
                    ahwg[k] = new hwg();
                    kog1.a(ahwg[k]);
                    kog1.a();
                }

                ahwg[k] = new hwg();
                kog1.a(ahwg[k]);
                b = ahwg;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hwg hwg1 = b[i];
                if (hwg1 != null)
                {
                    koh1.b(2, hwg1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
