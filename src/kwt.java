// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwt extends koj
{

    public Boolean a;
    public kwu b[];

    public kwt()
    {
        a = null;
        b = kwu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kwu kwu1 = b[j];
                    int k = i;
                    if (kwu1 != null)
                    {
                        k = i + koh.d(2, kwu1);
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
                a = Boolean.valueOf(kog1.i());
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kwu akwu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akwu = new kwu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akwu, 0, j);
                    k = j;
                }
                for (; k < akwu.length - 1; k++)
                {
                    akwu[k] = new kwu();
                    kog1.a(akwu[k]);
                    kog1.a();
                }

                akwu[k] = new kwu();
                kog1.a(akwu[k]);
                b = akwu;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwu kwu1 = b[i];
                if (kwu1 != null)
                {
                    koh1.b(2, kwu1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
