// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hrf extends koj
{

    public String a[];
    public String b[];
    public hsf c[];

    public hrf()
    {
        a = kou.f;
        b = kou.f;
        c = hsf.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int k2 = super.computeSerializedSize();
        int j;
        int k;
        int j1;
        if (a != null && a.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int k1;
            for (l = 0; i < a.length; l = k1)
            {
                String s = a[i];
                int i2 = k;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = k + koh.a(s);
                }
                i++;
                k = i2;
            }

            k = k2 + k + l * 1;
        } else
        {
            k = k2;
        }
        j = k;
        if (b != null)
        {
            j = k;
            if (b.length > 0)
            {
                j = 0;
                int i1 = 0;
                int l1;
                int j2;
                for (l1 = 0; j < b.length; l1 = j2)
                {
                    String s1 = b[j];
                    k2 = i1;
                    j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        k2 = i1 + koh.a(s1);
                    }
                    j++;
                    i1 = k2;
                }

                j = k + i1 + l1 * 1;
            }
        }
        j1 = j;
        if (c != null)
        {
            j1 = j;
            if (c.length > 0)
            {
                k = ((flag) ? 1 : 0);
                do
                {
                    j1 = j;
                    if (k >= c.length)
                    {
                        break;
                    }
                    hsf hsf1 = c[k];
                    j1 = j;
                    if (hsf1 != null)
                    {
                        j1 = j + koh.d(3, hsf1);
                    }
                    k++;
                    j = j1;
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
                int i1 = kou.b(kog1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kog1.j();
                    kog1.a();
                }

                as[i1] = kog1.j();
                a = as;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                String as1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as1 = new String[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as1, 0, k);
                    j1 = k;
                }
                for (; j1 < as1.length - 1; j1++)
                {
                    as1[j1] = kog1.j();
                    kog1.a();
                }

                as1[j1] = kog1.j();
                b = as1;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                hsf ahsf[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                ahsf = new hsf[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, ahsf, 0, l);
                    k1 = l;
                }
                for (; k1 < ahsf.length - 1; k1++)
                {
                    ahsf[k1] = new hsf();
                    kog1.a(ahsf[k1]);
                    kog1.a();
                }

                ahsf[k1] = new hsf();
                kog1.a(ahsf[k1]);
                c = ahsf;
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
                String s = a[i];
                if (s != null)
                {
                    koh1.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                String s1 = b[j];
                if (s1 != null)
                {
                    koh1.a(2, s1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                hsf hsf1 = c[k];
                if (hsf1 != null)
                {
                    koh1.b(3, hsf1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
