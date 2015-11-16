// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzl extends koj
{

    private static volatile hzl e[];
    public String a;
    public hzx b[];
    public iab c[];
    public iaq d[];

    public hzl()
    {
        a = null;
        b = hzx.a();
        c = iab.a();
        d = iaq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hzl[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new hzl[0];
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
                    hzx hzx1 = b[j];
                    int i1 = i;
                    if (hzx1 != null)
                    {
                        i1 = i + koh.d(2, hzx1);
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
                    iab iab1 = c[k];
                    int j1 = i;
                    if (iab1 != null)
                    {
                        j1 = i + koh.d(3, iab1);
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
                    iaq iaq1 = d[l];
                    k1 = i;
                    if (iaq1 != null)
                    {
                        k1 = i + koh.d(4, iaq1);
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
                hzx ahzx[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahzx = new hzx[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahzx, 0, j);
                    i1 = j;
                }
                for (; i1 < ahzx.length - 1; i1++)
                {
                    ahzx[i1] = new hzx();
                    kog1.a(ahzx[i1]);
                    kog1.a();
                }

                ahzx[i1] = new hzx();
                kog1.a(ahzx[i1]);
                b = ahzx;
                break;

            case 26: // '\032'
                int j1 = kou.b(kog1, 26);
                iab aiab[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aiab = new iab[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aiab, 0, k);
                    j1 = k;
                }
                for (; j1 < aiab.length - 1; j1++)
                {
                    aiab[j1] = new iab();
                    kog1.a(aiab[j1]);
                    kog1.a();
                }

                aiab[j1] = new iab();
                kog1.a(aiab[j1]);
                c = aiab;
                break;

            case 34: // '"'
                int k1 = kou.b(kog1, 34);
                iaq aiaq[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                aiaq = new iaq[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, aiaq, 0, l);
                    k1 = l;
                }
                for (; k1 < aiaq.length - 1; k1++)
                {
                    aiaq[k1] = new iaq();
                    kog1.a(aiaq[k1]);
                    kog1.a();
                }

                aiaq[k1] = new iaq();
                kog1.a(aiaq[k1]);
                d = aiaq;
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
                hzx hzx1 = b[i];
                if (hzx1 != null)
                {
                    koh1.b(2, hzx1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                iab iab1 = c[j];
                if (iab1 != null)
                {
                    koh1.b(3, iab1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                iaq iaq1 = d[k];
                if (iaq1 != null)
                {
                    koh1.b(4, iaq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
