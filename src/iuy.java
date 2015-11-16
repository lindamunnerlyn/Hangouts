// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuy extends koj
{

    public iux a[];

    public iuy()
    {
        a = iux.a();
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
                    iux iux1 = a[j];
                    k = i;
                    if (iux1 != null)
                    {
                        k = i + koh.d(1, iux1);
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
                iux aiux[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiux = new iux[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiux, 0, j);
                    k = j;
                }
                for (; k < aiux.length - 1; k++)
                {
                    aiux[k] = new iux();
                    kog1.a(aiux[k]);
                    kog1.a();
                }

                aiux[k] = new iux();
                kog1.a(aiux[k]);
                a = aiux;
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
                iux iux1 = a[i];
                if (iux1 != null)
                {
                    koh1.b(1, iux1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
