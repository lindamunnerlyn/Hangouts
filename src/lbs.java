// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbs extends koj
{

    public String a;
    public lbr b[];
    public Long c;

    public lbs()
    {
        a = null;
        b = lbr.a();
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
                    lbr lbr1 = b[j];
                    int k = i;
                    if (lbr1 != null)
                    {
                        k = i + koh.d(2, lbr1);
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
            i = j + koh.e(3, c.longValue());
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lbr albr[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                albr = new lbr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, albr, 0, j);
                    k = j;
                }
                for (; k < albr.length - 1; k++)
                {
                    albr[k] = new lbr();
                    kog1.a(albr[k]);
                    kog1.a();
                }

                albr[k] = new lbr();
                kog1.a(albr[k]);
                b = albr;
                break;

            case 24: // '\030'
                c = Long.valueOf(kog1.e());
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
                lbr lbr1 = b[i];
                if (lbr1 != null)
                {
                    koh1.b(2, lbr1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c.longValue());
        }
        super.writeTo(koh1);
    }
}
