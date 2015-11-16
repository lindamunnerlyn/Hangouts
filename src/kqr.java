// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqr extends koj
{

    public Long a;
    public String b;
    public String c;
    public String d;
    public String e[];
    public kqs f[];
    public kpd g[];
    public byte h[];

    public kqr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
        f = kqs.a();
        g = kpd.a();
        h = null;
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
            i = j + koh.d(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + koh.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = 0;
                int l = 0;
                int k1;
                int l1;
                for (k1 = 0; j < e.length; k1 = l1)
                {
                    String s = e[j];
                    int i2 = l;
                    l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = l + koh.a(s);
                    }
                    j++;
                    l = i2;
                }

                j = i + l + k1 * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j;
            if (f.length > 0)
            {
                i = j;
                for (j = 0; j < f.length;)
                {
                    kqs kqs1 = f[j];
                    int i1 = i;
                    if (kqs1 != null)
                    {
                        i1 = i + koh.d(6, kqs1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (j1 >= g.length)
                    {
                        break;
                    }
                    kpd kpd1 = g[j1];
                    j = i;
                    if (kpd1 != null)
                    {
                        j = i + koh.d(7, kpd1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (h != null)
        {
            i = j + koh.b(8, h);
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

            case 8: // '\b'
                a = Long.valueOf(kog1.d());
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
                int i1 = kou.b(kog1, 42);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kog1.j();
                    kog1.a();
                }

                as[i1] = kog1.j();
                e = as;
                break;

            case 50: // '2'
                int j1 = kou.b(kog1, 50);
                kqs akqs[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                akqs = new kqs[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, akqs, 0, k);
                    j1 = k;
                }
                for (; j1 < akqs.length - 1; j1++)
                {
                    akqs[j1] = new kqs();
                    kog1.a(akqs[j1]);
                    kog1.a();
                }

                akqs[j1] = new kqs();
                kog1.a(akqs[j1]);
                f = akqs;
                break;

            case 58: // ':'
                int k1 = kou.b(kog1, 58);
                kpd akpd[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                akpd = new kpd[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(g, 0, akpd, 0, l);
                    k1 = l;
                }
                for (; k1 < akpd.length - 1; k1++)
                {
                    akpd[k1] = new kpd();
                    kog1.a(akpd[k1]);
                    kog1.a();
                }

                akpd[k1] = new kpd();
                kog1.a(akpd[k1]);
                g = akpd;
                break;

            case 66: // 'B'
                h = kog1.k();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.longValue());
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
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    koh1.a(5, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = 0; j < f.length; j++)
            {
                kqs kqs1 = f[j];
                if (kqs1 != null)
                {
                    koh1.b(6, kqs1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < g.length; k++)
            {
                kpd kpd1 = g[k];
                if (kpd1 != null)
                {
                    koh1.b(7, kpd1);
                }
            }

        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        super.writeTo(koh1);
    }
}
