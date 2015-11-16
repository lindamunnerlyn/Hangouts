// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icp extends koj
{

    public ibs a;
    public icq b;
    public ibs c[];

    public icp()
    {
        a = null;
        b = null;
        c = ibs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.d(1, a);
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
                    ibs ibs1 = c[j];
                    int k = i;
                    if (ibs1 != null)
                    {
                        k = i + koh.d(3, ibs1);
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
                    a = new ibs();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new icq();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                ibs aibs[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aibs = new ibs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aibs, 0, j);
                    k = j;
                }
                for (; k < aibs.length - 1; k++)
                {
                    aibs[k] = new ibs();
                    kog1.a(aibs[k]);
                    kog1.a();
                }

                aibs[k] = new ibs();
                kog1.a(aibs[k]);
                c = aibs;
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
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ibs ibs1 = c[i];
                if (ibs1 != null)
                {
                    koh1.b(3, ibs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
