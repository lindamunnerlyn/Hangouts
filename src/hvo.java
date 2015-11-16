// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvo extends koj
{

    public hwc a;
    public hvn b[];

    public hvo()
    {
        a = null;
        b = hvn.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hvn hvn1 = b[j];
                    int k = i;
                    if (hvn1 != null)
                    {
                        k = i + koh.d(2, hvn1);
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
                if (a == null)
                {
                    a = new hwc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                hvn ahvn[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahvn = new hvn[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahvn, 0, j);
                    k = j;
                }
                for (; k < ahvn.length - 1; k++)
                {
                    ahvn[k] = new hvn();
                    kog1.a(ahvn[k]);
                    kog1.a();
                }

                ahvn[k] = new hvn();
                kog1.a(ahvn[k]);
                b = ahvn;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hvn hvn1 = b[i];
                if (hvn1 != null)
                {
                    koh1.b(2, hvn1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
