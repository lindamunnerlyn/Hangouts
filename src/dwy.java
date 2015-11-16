// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwy extends kop
{

    public dwx a[];

    public dwy()
    {
        a = dwx.a();
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
                    dwx dwx1 = a[j];
                    k = i;
                    if (dwx1 != null)
                    {
                        k = i + koh.d(1, dwx1);
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
                if (kou.a(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = kou.b(kog1, 10);
                dwx adwx[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                adwx = new dwx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, adwx, 0, j);
                    k = j;
                }
                for (; k < adwx.length - 1; k++)
                {
                    adwx[k] = new dwx();
                    kog1.a(adwx[k]);
                    kog1.a();
                }

                adwx[k] = new dwx();
                kog1.a(adwx[k]);
                a = adwx;
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
                dwx dwx1 = a[i];
                if (dwx1 != null)
                {
                    koh1.b(1, dwx1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
