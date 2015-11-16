// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbu extends koj
{

    private static volatile lbu i[];
    public kyo a;
    public kya b;
    public String c;
    public lck d[];
    public String e;
    public kzo f[];
    public lbw g[];
    public Integer h;

    public lbu()
    {
        a = null;
        b = null;
        c = null;
        d = lck.a();
        e = null;
        f = kzo.a();
        g = lbw.a();
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lbu[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new lbu[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + koh.d(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.b(3, c);
        }
        int l = j;
        if (d != null)
        {
            l = j;
            if (d.length > 0)
            {
                for (k = 0; k < d.length;)
                {
                    lck lck1 = d[k];
                    l = j;
                    if (lck1 != null)
                    {
                        l = j + koh.d(4, lck1);
                    }
                    k++;
                    j = l;
                }

                l = j;
            }
        }
        k = l;
        if (e != null)
        {
            k = l + koh.b(5, e);
        }
        j = k;
        if (f != null)
        {
            j = k;
            if (f.length > 0)
            {
                j = k;
                for (k = 0; k < f.length;)
                {
                    kzo kzo1 = f[k];
                    int i1 = j;
                    if (kzo1 != null)
                    {
                        i1 = j + koh.d(6, kzo1);
                    }
                    k++;
                    j = i1;
                }

            }
        }
        k = j;
        if (g != null)
        {
            k = j;
            if (g.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (j1 >= g.length)
                    {
                        break;
                    }
                    lbw lbw1 = g[j1];
                    k = j;
                    if (lbw1 != null)
                    {
                        k = j + koh.d(7, lbw1);
                    }
                    j1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (h != null)
        {
            j = k + koh.e(8, h.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new kyo();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kya();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                int j1 = kou.b(kog1, 34);
                lck alck[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                alck = new lck[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, alck, 0, k);
                    j1 = k;
                }
                for (; j1 < alck.length - 1; j1++)
                {
                    alck[j1] = new lck();
                    kog1.a(alck[j1]);
                    kog1.a();
                }

                alck[j1] = new lck();
                kog1.a(alck[j1]);
                d = alck;
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                int k1 = kou.b(kog1, 50);
                kzo akzo[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                akzo = new kzo[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, akzo, 0, l);
                    k1 = l;
                }
                for (; k1 < akzo.length - 1; k1++)
                {
                    akzo[k1] = new kzo();
                    kog1.a(akzo[k1]);
                    kog1.a();
                }

                akzo[k1] = new kzo();
                kog1.a(akzo[k1]);
                f = akzo;
                break;

            case 58: // ':'
                int l1 = kou.b(kog1, 58);
                lbw albw[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                albw = new lbw[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(g, 0, albw, 0, i1);
                    l1 = i1;
                }
                for (; l1 < albw.length - 1; l1++)
                {
                    albw[l1] = new lbw();
                    kog1.a(albw[l1]);
                    kog1.a();
                }

                albw[l1] = new lbw();
                kog1.a(albw[l1]);
                g = albw;
                break;

            case 64: // '@'
                h = Integer.valueOf(kog1.f());
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
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                lck lck1 = d[j];
                if (lck1 != null)
                {
                    koh1.b(4, lck1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                kzo kzo1 = f[k];
                if (kzo1 != null)
                {
                    koh1.b(6, kzo1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < g.length; l++)
            {
                lbw lbw1 = g[l];
                if (lbw1 != null)
                {
                    koh1.b(7, lbw1);
                }
            }

        }
        if (h != null)
        {
            koh1.a(8, h.intValue());
        }
        super.writeTo(koh1);
    }
}
