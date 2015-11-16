// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huz extends koj
{

    public hwc a;
    public hxh b[];

    public huz()
    {
        a = null;
        b = hxh.a();
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
                    hxh hxh1 = b[j];
                    int k = i;
                    if (hxh1 != null)
                    {
                        k = i + koh.d(2, hxh1);
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
                hxh ahxh[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahxh = new hxh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahxh, 0, j);
                    k = j;
                }
                for (; k < ahxh.length - 1; k++)
                {
                    ahxh[k] = new hxh();
                    kog1.a(ahxh[k]);
                    kog1.a();
                }

                ahxh[k] = new hxh();
                kog1.a(ahxh[k]);
                b = ahxh;
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
                hxh hxh1 = b[i];
                if (hxh1 != null)
                {
                    koh1.b(2, hxh1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
