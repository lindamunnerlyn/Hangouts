// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxr extends koj
{

    public kxs a[];

    public kxr()
    {
        a = kxs.a();
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
                    kxs kxs1 = a[j];
                    k = i;
                    if (kxs1 != null)
                    {
                        k = i + koh.d(1, kxs1);
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

            case 10: // '\n'
                int k = kou.b(kog1, 10);
                kxs akxs[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akxs = new kxs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akxs, 0, j);
                    k = j;
                }
                for (; k < akxs.length - 1; k++)
                {
                    akxs[k] = new kxs();
                    kog1.a(akxs[k]);
                    kog1.a();
                }

                akxs[k] = new kxs();
                kog1.a(akxs[k]);
                a = akxs;
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
                kxs kxs1 = a[i];
                if (kxs1 != null)
                {
                    koh1.b(1, kxs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
