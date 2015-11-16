// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvi extends koj
{

    public hxb a[];
    public hwz b[];
    public hwy c[];
    public hxa d[];

    public hvi()
    {
        a = hxb.a();
        b = hwz.a();
        c = hwy.a();
        d = hxa.a();
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    hxb hxb1 = a[j];
                    int i1 = i;
                    if (hxb1 != null)
                    {
                        i1 = i + koh.d(1, hxb1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hwz hwz1 = b[j];
                    int j1 = i;
                    if (hwz1 != null)
                    {
                        j1 = i + koh.d(2, hwz1);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    hwy hwy1 = c[k];
                    int k1 = i;
                    if (hwy1 != null)
                    {
                        k1 = i + koh.d(3, hwy1);
                    }
                    k++;
                    i = k1;
                }

            }
        }
        int l1 = i;
        if (d != null)
        {
            l1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    l1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    hxa hxa1 = d[l];
                    l1 = i;
                    if (hxa1 != null)
                    {
                        l1 = i + koh.d(4, hxa1);
                    }
                    l++;
                    i = l1;
                } while (true);
            }
        }
        return l1;
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
                int j1 = kou.b(kog1, 10);
                hxb ahxb[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahxb = new hxb[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahxb, 0, j);
                    j1 = j;
                }
                for (; j1 < ahxb.length - 1; j1++)
                {
                    ahxb[j1] = new hxb();
                    kog1.a(ahxb[j1]);
                    kog1.a();
                }

                ahxb[j1] = new hxb();
                kog1.a(ahxb[j1]);
                a = ahxb;
                break;

            case 18: // '\022'
                int k1 = kou.b(kog1, 18);
                hwz ahwz[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ahwz = new hwz[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ahwz, 0, k);
                    k1 = k;
                }
                for (; k1 < ahwz.length - 1; k1++)
                {
                    ahwz[k1] = new hwz();
                    kog1.a(ahwz[k1]);
                    kog1.a();
                }

                ahwz[k1] = new hwz();
                kog1.a(ahwz[k1]);
                b = ahwz;
                break;

            case 26: // '\032'
                int l1 = kou.b(kog1, 26);
                hwy ahwy[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                ahwy = new hwy[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, ahwy, 0, l);
                    l1 = l;
                }
                for (; l1 < ahwy.length - 1; l1++)
                {
                    ahwy[l1] = new hwy();
                    kog1.a(ahwy[l1]);
                    kog1.a();
                }

                ahwy[l1] = new hwy();
                kog1.a(ahwy[l1]);
                c = ahwy;
                break;

            case 34: // '"'
                int i2 = kou.b(kog1, 34);
                hxa ahxa[];
                int i1;
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                ahxa = new hxa[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(d, 0, ahxa, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ahxa.length - 1; i2++)
                {
                    ahxa[i2] = new hxa();
                    kog1.a(ahxa[i2]);
                    kog1.a();
                }

                ahxa[i2] = new hxa();
                kog1.a(ahxa[i2]);
                d = ahxa;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                hxb hxb1 = a[i];
                if (hxb1 != null)
                {
                    koh1.b(1, hxb1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                hwz hwz1 = b[j];
                if (hwz1 != null)
                {
                    koh1.b(2, hwz1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                hwy hwy1 = c[k];
                if (hwy1 != null)
                {
                    koh1.b(3, hwy1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < d.length; l++)
            {
                hxa hxa1 = d[l];
                if (hxa1 != null)
                {
                    koh1.b(4, hxa1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
