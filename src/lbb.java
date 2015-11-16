// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbb extends koj
{

    public lcb a;
    public lba b[];
    public kyo c[];
    public kyo d;

    public lbb()
    {
        a = null;
        b = lba.a();
        c = kyo.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
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
                    lba lba1 = b[j];
                    int l = i;
                    if (lba1 != null)
                    {
                        l = i + koh.d(2, lba1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(3, d);
        }
        int i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    kyo kyo1 = c[k];
                    i1 = i;
                    if (kyo1 != null)
                    {
                        i1 = i + koh.d(4, kyo1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                lba alba[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alba = new lba[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alba, 0, j);
                    l = j;
                }
                for (; l < alba.length - 1; l++)
                {
                    alba[l] = new lba();
                    kog1.a(alba[l]);
                    kog1.a();
                }

                alba[l] = new lba();
                kog1.a(alba[l]);
                b = alba;
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new kyo();
                }
                kog1.a(d);
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
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
                lba lba1 = b[i];
                if (lba1 != null)
                {
                    koh1.b(2, lba1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(3, d);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                kyo kyo1 = c[j];
                if (kyo1 != null)
                {
                    koh1.b(4, kyo1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
