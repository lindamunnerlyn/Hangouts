// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class laf extends koj
{

    public lcb a;
    public laa b[];
    public kyo c[];
    public kyo d;

    public laf()
    {
        a = null;
        b = laa.a();
        c = kyo.a();
        d = null;
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
                for (j = 0; j < b.length;)
                {
                    laa laa1 = b[j];
                    int k = i;
                    if (laa1 != null)
                    {
                        k = i + koh.d(2, laa1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    kyo kyo1 = c[l];
                    j = i;
                    if (kyo1 != null)
                    {
                        j = i + koh.d(3, kyo1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
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
                kyo akyo[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akyo = new kyo[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akyo, 0, k);
                    i1 = k;
                }
                for (; i1 < akyo.length - 1; i1++)
                {
                    akyo[i1] = new kyo();
                    kog1.a(akyo[i1]);
                    kog1.a();
                }

                akyo[i1] = new kyo();
                kog1.a(akyo[i1]);
                c = akyo;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kyo();
                }
                kog1.a(d);
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
                kyo kyo1 = c[j];
                if (kyo1 != null)
                {
                    koh1.b(3, kyo1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        super.writeTo(koh1);
    }
}
