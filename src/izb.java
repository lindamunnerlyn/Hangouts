// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izb extends koj
{

    public iyz a[];

    public izb()
    {
        a = iyz.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    iyz iyz1 = a[j];
                    k = i;
                    if (iyz1 != null)
                    {
                        k = i + koh.d(2, iyz1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                iyz aiyz[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiyz = new iyz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiyz, 0, j);
                    k = j;
                }
                for (; k < aiyz.length - 1; k++)
                {
                    aiyz[k] = new iyz();
                    kog1.a(aiyz[k]);
                    kog1.a();
                }

                aiyz[k] = new iyz();
                kog1.a(aiyz[k]);
                a = aiyz;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iyz iyz1 = a[i];
                if (iyz1 != null)
                {
                    koh1.b(2, iyz1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
