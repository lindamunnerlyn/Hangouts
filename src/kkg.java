// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kkg extends koj
{

    private static volatile kkg d[];
    public kkd a[];
    public kki b[];
    public kkf c[];

    public kkg()
    {
        a = kkd.a();
        b = kki.a();
        c = kkf.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kkg[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new kkg[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                    kkd kkd1 = a[j];
                    int i1 = i;
                    if (kkd1 != null)
                    {
                        i1 = i + koh.d(1, kkd1);
                    }
                    j++;
                    i = i1;
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
                i = j;
                for (int k = 0; k < b.length;)
                {
                    kki kki1 = b[k];
                    int j1 = i;
                    if (kki1 != null)
                    {
                        j1 = i + koh.d(2, kki1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (c != null)
        {
            k1 = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    kkf kkf1 = c[l];
                    k1 = i;
                    if (kkf1 != null)
                    {
                        k1 = i + koh.d(3, kkf1);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                kkd akkd[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akkd = new kkd[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akkd, 0, j);
                    i1 = j;
                }
                for (; i1 < akkd.length - 1; i1++)
                {
                    akkd[i1] = new kkd();
                    kog1.a(akkd[i1]);
                    kog1.a();
                }

                akkd[i1] = new kkd();
                kog1.a(akkd[i1]);
                a = akkd;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                kki akki[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akki = new kki[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akki, 0, k);
                    j1 = k;
                }
                for (; j1 < akki.length - 1; j1++)
                {
                    akki[j1] = new kki();
                    kog1.a(akki[j1]);
                    kog1.a();
                }

                akki[j1] = new kki();
                kog1.a(akki[j1]);
                b = akki;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                kkf akkf[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                akkf = new kkf[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, akkf, 0, l);
                    k1 = l;
                }
                for (; k1 < akkf.length - 1; k1++)
                {
                    akkf[k1] = new kkf();
                    kog1.a(akkf[k1]);
                    kog1.a();
                }

                akkf[k1] = new kkf();
                kog1.a(akkf[k1]);
                c = akkf;
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
                kkd kkd1 = a[i];
                if (kkd1 != null)
                {
                    koh1.b(1, kkd1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                kki kki1 = b[j];
                if (kki1 != null)
                {
                    koh1.b(2, kki1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                kkf kkf1 = c[k];
                if (kkf1 != null)
                {
                    koh1.b(3, kkf1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
