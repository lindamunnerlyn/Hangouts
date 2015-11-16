// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjx extends koj
{

    public kjt a[];
    public kjt b[];

    public kjx()
    {
        a = kjt.a();
        b = kjt.a();
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
                    kjt kjt1 = a[k];
                    int i1 = i;
                    if (kjt1 != null)
                    {
                        i1 = i + koh.d(4, kjt1);
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
                    kjt kjt2 = b[l];
                    j1 = i;
                    if (kjt2 != null)
                    {
                        j1 = i + koh.d(5, kjt2);
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

            case 34: // '"'
                int l = kou.b(kog1, 34);
                kjt akjt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akjt = new kjt[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akjt, 0, j);
                    l = j;
                }
                for (; l < akjt.length - 1; l++)
                {
                    akjt[l] = new kjt();
                    kog1.a(akjt[l]);
                    kog1.a();
                }

                akjt[l] = new kjt();
                kog1.a(akjt[l]);
                a = akjt;
                break;

            case 42: // '*'
                int i1 = kou.b(kog1, 42);
                kjt akjt1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akjt1 = new kjt[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akjt1, 0, k);
                    i1 = k;
                }
                for (; i1 < akjt1.length - 1; i1++)
                {
                    akjt1[i1] = new kjt();
                    kog1.a(akjt1[i1]);
                    kog1.a();
                }

                akjt1[i1] = new kjt();
                kog1.a(akjt1[i1]);
                b = akjt1;
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
                kjt kjt1 = a[i];
                if (kjt1 != null)
                {
                    koh1.b(4, kjt1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kjt kjt2 = b[j];
                if (kjt2 != null)
                {
                    koh1.b(5, kjt2);
                }
            }

        }
        super.writeTo(koh1);
    }
}
