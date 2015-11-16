// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lad extends koj
{

    public lcb a;
    public laa b[];
    public lae c[];

    public lad()
    {
        a = null;
        b = laa.a();
        c = lae.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (int k = 0; k < b.length;)
                {
                    laa laa1 = b[k];
                    int i1 = i;
                    if (laa1 != null)
                    {
                        i1 = i + koh.d(2, laa1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (c != null)
        {
            j1 = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    lae lae1 = c[l];
                    j1 = i;
                    if (lae1 != null)
                    {
                        j1 = i + koh.d(3, lae1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                    a = new lcb();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                laa alaa[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alaa = new laa[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alaa, 0, j);
                    l = j;
                }
                for (; l < alaa.length - 1; l++)
                {
                    alaa[l] = new laa();
                    kog1.a(alaa[l]);
                    kog1.a();
                }

                alaa[l] = new laa();
                kog1.a(alaa[l]);
                b = alaa;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                lae alae[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alae = new lae[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alae, 0, k);
                    i1 = k;
                }
                for (; i1 < alae.length - 1; i1++)
                {
                    alae[i1] = new lae();
                    kog1.a(alae[i1]);
                    kog1.a();
                }

                alae[i1] = new lae();
                kog1.a(alae[i1]);
                c = alae;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                laa laa1 = b[i];
                if (laa1 != null)
                {
                    koh1.b(2, laa1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lae lae1 = c[j];
                if (lae1 != null)
                {
                    koh1.b(3, lae1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
