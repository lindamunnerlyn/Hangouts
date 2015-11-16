// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jwt extends koj
{

    public Long a;
    public lhu b[];
    public kkt c;

    public jwt()
    {
        a = null;
        b = lhu.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lhu lhu1 = b[j];
                    int k = i;
                    if (lhu1 != null)
                    {
                        k = i + koh.d(2, lhu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lhu alhu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alhu = new lhu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alhu, 0, j);
                    k = j;
                }
                for (; k < alhu.length - 1; k++)
                {
                    alhu[k] = new lhu();
                    kog1.a(alhu[k]);
                    kog1.a();
                }

                alhu[k] = new lhu();
                kog1.a(alhu[k]);
                b = alhu;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kkt();
                }
                kog1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lhu lhu1 = b[i];
                if (lhu1 != null)
                {
                    koh1.b(2, lhu1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        super.writeTo(koh1);
    }
}
