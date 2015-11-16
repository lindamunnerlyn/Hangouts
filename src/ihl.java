// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihl extends koj
{

    public Integer a;
    public igw b[];

    public ihl()
    {
        a = null;
        b = igw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    igw igw1 = b[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + koh.d(2, igw1);
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

            case 8: // '\b'
                a = Integer.valueOf(kog1.f());
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                igw aigw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aigw = new igw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aigw, 0, j);
                    k = j;
                }
                for (; k < aigw.length - 1; k++)
                {
                    aigw[k] = new igw();
                    kog1.a(aigw[k]);
                    kog1.a();
                }

                aigw[k] = new igw();
                kog1.a(aigw[k]);
                b = aigw;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                igw igw1 = b[i];
                if (igw1 != null)
                {
                    koh1.b(2, igw1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
