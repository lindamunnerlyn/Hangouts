// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqr extends koj
{

    private static volatile hqr h[];
    public hru a;
    public String b;
    public String c;
    public String d;
    public String e;
    public hqu f[];
    public hqs g[];

    public hqr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = hqu.a();
        g = hqs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hqr[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new hqr[0];
                }
            }
        }
        return h;
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        int l = j;
        if (c != null)
        {
            l = j + koh.b(3, c);
        }
        i = l;
        if (d != null)
        {
            i = l + koh.b(4, d);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    hqu hqu1 = f[j];
                    l = i;
                    if (hqu1 != null)
                    {
                        l = i + koh.d(5, hqu1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(6, e);
        }
        l = i;
        if (g != null)
        {
            l = i;
            if (g.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= g.length)
                    {
                        break;
                    }
                    hqs hqs1 = g[k];
                    l = i;
                    if (hqs1 != null)
                    {
                        l = i + koh.d(7, hqs1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                if (a == null)
                {
                    a = new hru();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                int l = kou.b(kog1, 42);
                hqu ahqu[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                ahqu = new hqu[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, ahqu, 0, j);
                    l = j;
                }
                for (; l < ahqu.length - 1; l++)
                {
                    ahqu[l] = new hqu();
                    kog1.a(ahqu[l]);
                    kog1.a();
                }

                ahqu[l] = new hqu();
                kog1.a(ahqu[l]);
                f = ahqu;
                break;

            case 50: // '2'
                e = kog1.j();
                break;

            case 58: // ':'
                int i1 = kou.b(kog1, 58);
                hqs ahqs[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                ahqs = new hqs[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(g, 0, ahqs, 0, k);
                    i1 = k;
                }
                for (; i1 < ahqs.length - 1; i1++)
                {
                    ahqs[i1] = new hqs();
                    kog1.a(ahqs[i1]);
                    kog1.a();
                }

                ahqs[i1] = new hqs();
                kog1.a(ahqs[i1]);
                g = ahqs;
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
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                hqu hqu1 = f[i];
                if (hqu1 != null)
                {
                    koh1.b(5, hqu1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(6, e);
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                hqs hqs1 = g[j];
                if (hqs1 != null)
                {
                    koh1.b(7, hqs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
