// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzp extends koj
{

    public String a;
    public kzq b[];
    public kzq c[];
    public Boolean d;
    public kxt e;

    public kzp()
    {
        a = null;
        b = kzq.a();
        c = kzq.a();
        d = null;
        e = null;
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
            j = i + koh.b(1, a);
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
                    kzq kzq1 = b[j];
                    int k = i;
                    if (kzq1 != null)
                    {
                        k = i + koh.d(2, kzq1);
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
                    kzq kzq2 = c[l];
                    j = i;
                    if (kzq2 != null)
                    {
                        j = i + koh.d(3, kzq2);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(4) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                kzq akzq[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akzq = new kzq[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akzq, 0, j);
                    l = j;
                }
                for (; l < akzq.length - 1; l++)
                {
                    akzq[l] = new kzq();
                    kog1.a(akzq[l]);
                    kog1.a();
                }

                akzq[l] = new kzq();
                kog1.a(akzq[l]);
                b = akzq;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                kzq akzq1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akzq1 = new kzq[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akzq1, 0, k);
                    i1 = k;
                }
                for (; i1 < akzq1.length - 1; i1++)
                {
                    akzq1[i1] = new kzq();
                    kog1.a(akzq1[i1]);
                    kog1.a();
                }

                akzq1[i1] = new kzq();
                kog1.a(akzq1[i1]);
                c = akzq1;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kxt();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kzq kzq1 = b[i];
                if (kzq1 != null)
                {
                    koh1.b(2, kzq1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                kzq kzq2 = c[j];
                if (kzq2 != null)
                {
                    koh1.b(3, kzq2);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
