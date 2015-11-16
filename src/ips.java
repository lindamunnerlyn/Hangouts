// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ips extends koj
{

    public ipm a[];
    public long b[];
    public String c[];

    public ips()
    {
        a = ipm.a();
        b = kou.b;
        c = kou.f;
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
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ipm ipm1 = a[j];
                    int k = i;
                    if (ipm1 != null)
                    {
                        k = i + koh.d(1, ipm1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = 0;
                int l = 0;
                for (; i < b.length; i++)
                {
                    l += koh.b(b[i]);
                }

                i = j + l + b.length * 1;
            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = 0;
                int j1 = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s = c[j];
                    int l1 = i1;
                    int k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = i1 + koh.a(s);
                    }
                    j++;
                    i1 = l1;
                    j1 = k1;
                }

                j = i + i1 + j1 * 1;
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
                int j1 = kou.b(kog1, 10);
                ipm aipm[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aipm = new ipm[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aipm, 0, j);
                    j1 = j;
                }
                for (; j1 < aipm.length - 1; j1++)
                {
                    aipm[j1] = new ipm();
                    kog1.a(aipm[j1]);
                    kog1.a();
                }

                aipm[j1] = new ipm();
                kog1.a(aipm[j1]);
                a = aipm;
                break;

            case 16: // '\020'
                int k1 = kou.b(kog1, 16);
                long al[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                al = new long[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, al, 0, k);
                    k1 = k;
                }
                for (; k1 < al.length - 1; k1++)
                {
                    al[k1] = kog1.e();
                    kog1.a();
                }

                al[k1] = kog1.e();
                b = al;
                break;

            case 18: // '\022'
                int j2 = kog1.c(kog1.p());
                int l = kog1.r();
                int l1;
                for (l1 = 0; kog1.q() > 0; l1++)
                {
                    kog1.e();
                }

                kog1.e(l);
                long al1[];
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                al1 = new long[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, al1, 0, l);
                    l1 = l;
                }
                for (; l1 < al1.length; l1++)
                {
                    al1[l1] = kog1.e();
                }

                b = al1;
                kog1.d(j2);
                break;

            case 26: // '\032'
                int i2 = kou.b(kog1, 26);
                String as[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                as = new String[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, as, 0, i1);
                    i2 = i1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kog1.j();
                    kog1.a();
                }

                as[i2] = kog1.j();
                c = as;
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
                ipm ipm1 = a[i];
                if (ipm1 != null)
                {
                    koh1.b(1, ipm1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                koh1.b(2, b[j]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                String s = c[k];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        super.writeTo(koh1);
    }
}
