// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class las extends koj
{

    private static volatile las f[];
    public String a;
    public kyo b;
    public kyp c[];
    public kyp d;
    public lau e[];

    public las()
    {
        a = null;
        b = null;
        c = kyp.a();
        d = null;
        e = lau.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static las[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new las[0];
                }
            }
        }
        return f;
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
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kyp kyp1 = c[j];
                    int l = i;
                    if (kyp1 != null)
                    {
                        l = i + koh.d(3, kyp1);
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
            i = j + koh.d(4, d);
        }
        int i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    lau lau1 = e[k];
                    i1 = i;
                    if (lau1 != null)
                    {
                        i1 = i + koh.d(5, lau1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kyo();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                kyp akyp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akyp = new kyp[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akyp, 0, j);
                    l = j;
                }
                for (; l < akyp.length - 1; l++)
                {
                    akyp[l] = new kyp();
                    kog1.a(akyp[l]);
                    kog1.a();
                }

                akyp[l] = new kyp();
                kog1.a(akyp[l]);
                c = akyp;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kyp();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                int i1 = kou.b(kog1, 42);
                lau alau[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                alau = new lau[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, alau, 0, k);
                    i1 = k;
                }
                for (; i1 < alau.length - 1; i1++)
                {
                    alau[i1] = new lau();
                    kog1.a(alau[i1]);
                    kog1.a();
                }

                alau[i1] = new lau();
                kog1.a(alau[i1]);
                e = alau;
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
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kyp kyp1 = c[i];
                if (kyp1 != null)
                {
                    koh1.b(3, kyp1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                lau lau1 = e[j];
                if (lau1 != null)
                {
                    koh1.b(5, lau1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
