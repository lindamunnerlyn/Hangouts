// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyf extends koj
{

    private static volatile hyf e[];
    public String a;
    public hyr b[];
    public hyu c[];
    public iaz d[];

    public hyf()
    {
        a = null;
        b = hyr.a();
        c = hyu.a();
        d = iaz.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyf[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new hyf[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hyr hyr1 = b[j];
                    int i1 = i;
                    if (hyr1 != null)
                    {
                        i1 = i + koh.d(2, hyr1);
                    }
                    j++;
                    i = i1;
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
                    hyu hyu1 = c[k];
                    int j1 = i;
                    if (hyu1 != null)
                    {
                        j1 = i + koh.d(3, hyu1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (d != null)
        {
            k1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    iaz iaz1 = d[l];
                    k1 = i;
                    if (iaz1 != null)
                    {
                        k1 = i + koh.d(4, iaz1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                hyr ahyr[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahyr = new hyr[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahyr, 0, j);
                    i1 = j;
                }
                for (; i1 < ahyr.length - 1; i1++)
                {
                    ahyr[i1] = new hyr();
                    kog1.a(ahyr[i1]);
                    kog1.a();
                }

                ahyr[i1] = new hyr();
                kog1.a(ahyr[i1]);
                b = ahyr;
                break;

            case 26: // '\032'
                int j1 = kou.b(kog1, 26);
                hyu ahyu[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ahyu = new hyu[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ahyu, 0, k);
                    j1 = k;
                }
                for (; j1 < ahyu.length - 1; j1++)
                {
                    ahyu[j1] = new hyu();
                    kog1.a(ahyu[j1]);
                    kog1.a();
                }

                ahyu[j1] = new hyu();
                kog1.a(ahyu[j1]);
                c = ahyu;
                break;

            case 34: // '"'
                int k1 = kou.b(kog1, 34);
                iaz aiaz[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                aiaz = new iaz[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, aiaz, 0, l);
                    k1 = l;
                }
                for (; k1 < aiaz.length - 1; k1++)
                {
                    aiaz[k1] = new iaz();
                    kog1.a(aiaz[k1]);
                    kog1.a();
                }

                aiaz[k1] = new iaz();
                kog1.a(aiaz[k1]);
                d = aiaz;
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
                hyr hyr1 = b[i];
                if (hyr1 != null)
                {
                    koh1.b(2, hyr1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                hyu hyu1 = c[j];
                if (hyu1 != null)
                {
                    koh1.b(3, hyu1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                iaz iaz1 = d[k];
                if (iaz1 != null)
                {
                    koh1.b(4, iaz1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
