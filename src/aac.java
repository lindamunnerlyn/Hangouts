// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aac extends koj
{

    public static final kok a = kok.a(aac, 0xbb61f6aL);
    private static final aac d[] = new aac[0];
    public c b;
    public b c[];

    public aac()
    {
        b = null;
        c = b.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.d(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    b b1 = c[j];
                    int k = i;
                    if (b1 != null)
                    {
                        k = i + koh.d(2, b1);
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
                if (b == null)
                {
                    b = new c();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                b ab[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ab = new b[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ab, 0, j);
                    k = j;
                }
                for (; k < ab.length - 1; k++)
                {
                    ab[k] = new b();
                    kog1.a(ab[k]);
                    kog1.a();
                }

                ab[k] = new b();
                kog1.a(ab[k]);
                c = ab;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                b b1 = c[i];
                if (b1 != null)
                {
                    koh1.b(2, b1);
                }
            }

        }
        super.writeTo(koh1);
    }

}
