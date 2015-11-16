// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class htz extends koj
{

    public htw a[];
    public htw b[];
    public String c;
    public String d;
    public hua e[];
    public hty f;
    public htx g;
    public Boolean h;

    public htz()
    {
        a = htw.a();
        b = htw.a();
        c = null;
        d = null;
        e = hua.a();
        f = null;
        g = null;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    htw htw1 = a[j];
                    int k = i;
                    if (htw1 != null)
                    {
                        k = i + koh.d(1, htw1);
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
                    htw htw2 = b[j];
                    int l = i;
                    if (htw2 != null)
                    {
                        l = i + koh.d(2, htw2);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        int i1 = j;
        if (c != null)
        {
            i1 = j + koh.b(3, c);
        }
        i = i1;
        if (d != null)
        {
            i = i1 + koh.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (j1 >= e.length)
                    {
                        break;
                    }
                    hua hua1 = e[j1];
                    j = i;
                    if (hua1 != null)
                    {
                        j = i + koh.d(5, hua1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(7, g);
        }
        i = j;
        if (h != null)
        {
            h.booleanValue();
            i = j + (koh.f(8) + 1);
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
                int i1 = kou.b(kog1, 10);
                htw ahtw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahtw = new htw[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahtw, 0, j);
                    i1 = j;
                }
                for (; i1 < ahtw.length - 1; i1++)
                {
                    ahtw[i1] = new htw();
                    kog1.a(ahtw[i1]);
                    kog1.a();
                }

                ahtw[i1] = new htw();
                kog1.a(ahtw[i1]);
                a = ahtw;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                htw ahtw1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ahtw1 = new htw[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ahtw1, 0, k);
                    j1 = k;
                }
                for (; j1 < ahtw1.length - 1; j1++)
                {
                    ahtw1[j1] = new htw();
                    kog1.a(ahtw1[j1]);
                    kog1.a();
                }

                ahtw1[j1] = new htw();
                kog1.a(ahtw1[j1]);
                b = ahtw1;
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                int k1 = kou.b(kog1, 42);
                hua ahua[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                ahua = new hua[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, ahua, 0, l);
                    k1 = l;
                }
                for (; k1 < ahua.length - 1; k1++)
                {
                    ahua[k1] = new hua();
                    kog1.a(ahua[k1]);
                    kog1.a();
                }

                ahua[k1] = new hua();
                kog1.a(ahua[k1]);
                e = ahua;
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new hty();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new htx();
                }
                kog1.a(g);
                break;

            case 64: // '@'
                h = Boolean.valueOf(kog1.i());
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
                htw htw1 = a[i];
                if (htw1 != null)
                {
                    koh1.b(1, htw1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                htw htw2 = b[j];
                if (htw2 != null)
                {
                    koh1.b(2, htw2);
                }
            }

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
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                hua hua1 = e[k];
                if (hua1 != null)
                {
                    koh1.b(5, hua1);
                }
            }

        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h.booleanValue());
        }
        super.writeTo(koh1);
    }
}
