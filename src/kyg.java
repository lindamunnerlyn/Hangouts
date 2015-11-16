// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyg extends koj
{

    public kye a[];
    public kye b[];
    public Integer c;
    public Integer d;
    public Integer e;
    public kye f[];
    public kyh g[];
    public kyk h[];

    public kyg()
    {
        a = kye.a();
        b = kye.a();
        c = null;
        d = null;
        e = null;
        f = kye.a();
        g = kyh.a();
        h = kyk.a();
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
                    kye kye1 = a[j];
                    int k = i;
                    if (kye1 != null)
                    {
                        k = i + koh.d(1, kye1);
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
                for (j = 0; j < b.length;)
                {
                    kye kye2 = b[j];
                    int l = i;
                    if (kye2 != null)
                    {
                        l = i + koh.d(2, kye2);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    kye kye3 = f[j];
                    int i1 = i;
                    if (kye3 != null)
                    {
                        i1 = i + koh.d(4, kye3);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        int j1 = j;
        if (g != null)
        {
            j1 = j;
            if (g.length > 0)
            {
                i = j;
                for (j = 0; j < g.length;)
                {
                    kyh kyh1 = g[j];
                    j1 = i;
                    if (kyh1 != null)
                    {
                        j1 = i + koh.d(5, kyh1);
                    }
                    j++;
                    i = j1;
                }

                j1 = i;
            }
        }
        i = j1;
        if (d != null)
        {
            i = j1 + koh.e(6, d.intValue());
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= h.length)
                    {
                        break;
                    }
                    kyk kyk1 = h[k1];
                    j = i;
                    if (kyk1 != null)
                    {
                        j = i + koh.d(7, kyk1);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(8, e.intValue());
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
                int k1 = kou.b(kog1, 10);
                kye akye[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akye = new kye[k1 + j];
                k1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akye, 0, j);
                    k1 = j;
                }
                for (; k1 < akye.length - 1; k1++)
                {
                    akye[k1] = new kye();
                    kog1.a(akye[k1]);
                    kog1.a();
                }

                akye[k1] = new kye();
                kog1.a(akye[k1]);
                a = akye;
                break;

            case 18: // '\022'
                int l1 = kou.b(kog1, 18);
                kye akye1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akye1 = new kye[l1 + k];
                l1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akye1, 0, k);
                    l1 = k;
                }
                for (; l1 < akye1.length - 1; l1++)
                {
                    akye1[l1] = new kye();
                    kog1.a(akye1[l1]);
                    kog1.a();
                }

                akye1[l1] = new kye();
                kog1.a(akye1[l1]);
                b = akye1;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 34: // '"'
                int i2 = kou.b(kog1, 34);
                kye akye2[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                akye2 = new kye[i2 + l];
                i2 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, akye2, 0, l);
                    i2 = l;
                }
                for (; i2 < akye2.length - 1; i2++)
                {
                    akye2[i2] = new kye();
                    kog1.a(akye2[i2]);
                    kog1.a();
                }

                akye2[i2] = new kye();
                kog1.a(akye2[i2]);
                f = akye2;
                break;

            case 42: // '*'
                int j2 = kou.b(kog1, 42);
                kyh akyh[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                akyh = new kyh[j2 + i1];
                j2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(g, 0, akyh, 0, i1);
                    j2 = i1;
                }
                for (; j2 < akyh.length - 1; j2++)
                {
                    akyh[j2] = new kyh();
                    kog1.a(akyh[j2]);
                    kog1.a();
                }

                akyh[j2] = new kyh();
                kog1.a(akyh[j2]);
                g = akyh;
                break;

            case 48: // '0'
                d = Integer.valueOf(kog1.f());
                break;

            case 58: // ':'
                int k2 = kou.b(kog1, 58);
                kyk akyk[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                akyk = new kyk[k2 + j1];
                k2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, akyk, 0, j1);
                    k2 = j1;
                }
                for (; k2 < akyk.length - 1; k2++)
                {
                    akyk[k2] = new kyk();
                    kog1.a(akyk[k2]);
                    kog1.a();
                }

                akyk[k2] = new kyk();
                kog1.a(akyk[k2]);
                h = akyk;
                break;

            case 64: // '@'
                e = Integer.valueOf(kog1.f());
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
                kye kye1 = a[i];
                if (kye1 != null)
                {
                    koh1.b(1, kye1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                kye kye2 = b[j];
                if (kye2 != null)
                {
                    koh1.b(2, kye2);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                kye kye3 = f[k];
                if (kye3 != null)
                {
                    koh1.b(4, kye3);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l = 0; l < g.length; l++)
            {
                kyh kyh1 = g[l];
                if (kyh1 != null)
                {
                    koh1.b(5, kyh1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(6, d.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < h.length; i1++)
            {
                kyk kyk1 = h[i1];
                if (kyk1 != null)
                {
                    koh1.b(7, kyk1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(8, e.intValue());
        }
        super.writeTo(koh1);
    }
}
