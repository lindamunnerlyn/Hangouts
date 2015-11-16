// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ktw extends koj
{

    public ksl a[];
    public ksl b[];
    public boolean c[];

    public ktw()
    {
        a = ksl.a();
        b = ksl.a();
        c = kou.e;
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
                    ksl ksl1 = a[j];
                    int k = i;
                    if (ksl1 != null)
                    {
                        k = i + koh.d(1, ksl1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    ksl ksl2 = b[l];
                    j = i;
                    if (ksl2 != null)
                    {
                        j = i + koh.d(2, ksl2);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 1 + c.length * 1;
            }
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
                int j1 = kou.b(kog1, 10);
                ksl aksl[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aksl = new ksl[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aksl, 0, j);
                    j1 = j;
                }
                for (; j1 < aksl.length - 1; j1++)
                {
                    aksl[j1] = new ksl();
                    kog1.a(aksl[j1]);
                    kog1.a();
                }

                aksl[j1] = new ksl();
                kog1.a(aksl[j1]);
                a = aksl;
                break;

            case 18: // '\022'
                int k1 = kou.b(kog1, 18);
                ksl aksl1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aksl1 = new ksl[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aksl1, 0, k);
                    k1 = k;
                }
                for (; k1 < aksl1.length - 1; k1++)
                {
                    aksl1[k1] = new ksl();
                    kog1.a(aksl1[k1]);
                    kog1.a();
                }

                aksl1[k1] = new ksl();
                kog1.a(aksl1[k1]);
                b = aksl1;
                break;

            case 24: // '\030'
                int l1 = kou.b(kog1, 24);
                boolean aflag[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aflag = new boolean[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aflag, 0, l);
                    l1 = l;
                }
                for (; l1 < aflag.length - 1; l1++)
                {
                    aflag[l1] = kog1.i();
                    kog1.a();
                }

                aflag[l1] = kog1.i();
                c = aflag;
                break;

            case 26: // '\032'
                int j2 = kog1.c(kog1.p());
                int i1 = kog1.r();
                int i2;
                for (i2 = 0; kog1.q() > 0; i2++)
                {
                    kog1.i();
                }

                kog1.e(i1);
                boolean aflag1[];
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                aflag1 = new boolean[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, aflag1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < aflag1.length; i2++)
                {
                    aflag1[i2] = kog1.i();
                }

                c = aflag1;
                kog1.d(j2);
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
                ksl ksl1 = a[i];
                if (ksl1 != null)
                {
                    koh1.b(1, ksl1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ksl ksl2 = b[j];
                if (ksl2 != null)
                {
                    koh1.b(2, ksl2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                koh1.a(3, c[k]);
            }

        }
        super.writeTo(koh1);
    }
}
