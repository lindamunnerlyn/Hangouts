// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iot extends koj
{

    public ioq a[];
    public Long b;

    public iot()
    {
        a = ioq.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    ioq ioq1 = a[k];
                    j = i;
                    if (ioq1 != null)
                    {
                        j = i + koh.d(1, ioq1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.longValue());
        }
        return i;
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
                ioq aioq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aioq = new ioq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aioq, 0, j);
                    k = j;
                }
                for (; k < aioq.length - 1; k++)
                {
                    aioq[k] = new ioq();
                    kog1.a(aioq[k]);
                    kog1.a();
                }

                aioq[k] = new ioq();
                kog1.a(aioq[k]);
                a = aioq;
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
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
                ioq ioq1 = a[i];
                if (ioq1 != null)
                {
                    koh1.b(1, ioq1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        super.writeTo(koh1);
    }
}
