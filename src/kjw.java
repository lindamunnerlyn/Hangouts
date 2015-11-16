// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjw extends koj
{

    public kjt a[];

    public kjw()
    {
        a = kjt.a();
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
                    kjt kjt1 = a[j];
                    k = i;
                    if (kjt1 != null)
                    {
                        k = i + koh.d(2, kjt1);
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
                kjt akjt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akjt = new kjt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akjt, 0, j);
                    k = j;
                }
                for (; k < akjt.length - 1; k++)
                {
                    akjt[k] = new kjt();
                    kog1.a(akjt[k]);
                    kog1.a();
                }

                akjt[k] = new kjt();
                kog1.a(akjt[k]);
                a = akjt;
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
                kjt kjt1 = a[i];
                if (kjt1 != null)
                {
                    koh1.b(2, kjt1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
