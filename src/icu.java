// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icu extends koj
{

    public ibs a;
    public ibs b[];
    public icq c;

    public icu()
    {
        a = null;
        b = ibs.a();
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
            i = j + koh.d(4, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ibs ibs1 = b[j];
                    int k = i;
                    if (ibs1 != null)
                    {
                        k = i + koh.d(5, ibs1);
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
            i = j + koh.d(6, c);
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

            case 34: // '"'
                if (a == null)
                {
                    a = new ibs();
                }
                kog1.a(a);
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                ibs aibs[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aibs = new ibs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aibs, 0, j);
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
                b = aibs;
                break;

            case 50: // '2'
                if (c == null)
                {
                    c = new icq();
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
            koh1.b(4, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ibs ibs1 = b[i];
                if (ibs1 != null)
                {
                    koh1.b(5, ibs1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(6, c);
        }
        super.writeTo(koh1);
    }
}
