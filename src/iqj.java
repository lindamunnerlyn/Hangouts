// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqj extends koj
{

    public iys a[];

    public iqj()
    {
        a = iys.a();
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
                    iys iys1 = a[j];
                    k = i;
                    if (iys1 != null)
                    {
                        k = i + koh.d(1, iys1);
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
                iys aiys[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiys = new iys[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiys, 0, j);
                    k = j;
                }
                for (; k < aiys.length - 1; k++)
                {
                    aiys[k] = new iys();
                    kog1.a(aiys[k]);
                    kog1.a();
                }

                aiys[k] = new iys();
                kog1.a(aiys[k]);
                a = aiys;
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
                iys iys1 = a[i];
                if (iys1 != null)
                {
                    koh1.b(1, iys1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
