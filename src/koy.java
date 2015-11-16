// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class koy extends koj
{

    public static final kok a = kok.a(koy, 0xbb61f6aL);
    private static final koy d[] = new koy[0];
    public kow b;
    public kov c[];

    public koy()
    {
        b = null;
        c = kov.a();
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
                    kov kov1 = c[j];
                    int k = i;
                    if (kov1 != null)
                    {
                        k = i + koh.d(2, kov1);
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
                    b = new kow();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kov akov[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akov = new kov[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akov, 0, j);
                    k = j;
                }
                for (; k < akov.length - 1; k++)
                {
                    akov[k] = new kov();
                    kog1.a(akov[k]);
                    kog1.a();
                }

                akov[k] = new kov();
                kog1.a(akov[k]);
                c = akov;
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
                kov kov1 = c[i];
                if (kov1 != null)
                {
                    koh1.b(2, kov1);
                }
            }

        }
        super.writeTo(koh1);
    }

}
