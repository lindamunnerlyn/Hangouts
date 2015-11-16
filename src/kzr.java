// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzr extends koj
{

    public String a;
    public kyo b;
    public kzs c[];

    public kzr()
    {
        a = null;
        b = null;
        c = kzs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kzs kzs1 = c[j];
                    int k = i;
                    if (kzs1 != null)
                    {
                        k = i + koh.d(3, kzs1);
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
                if (b == null)
                {
                    b = new kyo();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                kzs akzs[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akzs = new kzs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akzs, 0, j);
                    k = j;
                }
                for (; k < akzs.length - 1; k++)
                {
                    akzs[k] = new kzs();
                    kog1.a(akzs[k]);
                    kog1.a();
                }

                akzs[k] = new kzs();
                kog1.a(akzs[k]);
                c = akzs;
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
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kzs kzs1 = c[i];
                if (kzs1 != null)
                {
                    koh1.b(3, kzs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
