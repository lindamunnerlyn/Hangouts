// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwb extends koj
{

    public hwc a;
    public String b;
    public String c[];
    public String d;
    public hvs e;
    public hvs f[];

    public hwb()
    {
        a = null;
        b = null;
        c = kou.f;
        d = null;
        e = null;
        f = hvs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < c.length; j1 = k1)
                {
                    String s = c[j];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + koh.a(s);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        int i1 = j;
        if (d != null)
        {
            i1 = j + koh.b(4, d);
        }
        i = i1;
        if (e != null)
        {
            i = i1 + koh.d(5, e);
        }
        i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    hvs hvs1 = f[k];
                    i1 = i;
                    if (hvs1 != null)
                    {
                        i1 = i + koh.d(6, hvs1);
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
                if (a == null)
                {
                    a = new hwc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                String as[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                c = as;
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new hvs();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                int i1 = kou.b(kog1, 50);
                hvs ahvs[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                ahvs = new hvs[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, ahvs, 0, k);
                    i1 = k;
                }
                for (; i1 < ahvs.length - 1; i1++)
                {
                    ahvs[i1] = new hvs();
                    kog1.a(ahvs[i1]);
                    kog1.a();
                }

                ahvs[i1] = new hvs();
                kog1.a(ahvs[i1]);
                f = ahvs;
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                hvs hvs1 = f[j];
                if (hvs1 != null)
                {
                    koh1.b(6, hvs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
