// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbg extends koj
{

    public String a;
    public lbh b[];

    public lbg()
    {
        a = null;
        b = lbh.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lbh lbh1 = b[j];
                    int k = i;
                    if (lbh1 != null)
                    {
                        k = i + koh.d(2, lbh1);
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

            case 10: // '\n'
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lbh albh[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                albh = new lbh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, albh, 0, j);
                    k = j;
                }
                for (; k < albh.length - 1; k++)
                {
                    albh[k] = new lbh();
                    kog1.a(albh[k]);
                    kog1.a();
                }

                albh[k] = new lbh();
                kog1.a(albh[k]);
                b = albh;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lbh lbh1 = b[i];
                if (lbh1 != null)
                {
                    koh1.b(2, lbh1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
