// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvw extends koj
{

    public String a;
    public String b;
    public String c;
    public kwj d[];
    public kwj e[];
    public String f;
    public kvx g[];
    public Boolean h;

    public kvw()
    {
        a = null;
        b = null;
        c = null;
        d = kwj.a();
        e = kwj.a();
        f = null;
        g = kvx.a();
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize() + koh.b(1, a) + koh.b(2, b);
        int i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (j = 0; j < d.length;)
                {
                    kwj kwj1 = d[j];
                    int k = i;
                    if (kwj1 != null)
                    {
                        k = i + koh.d(3, kwj1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                for (j = 0; j < g.length;)
                {
                    kvx kvx1 = g[j];
                    int l = i;
                    if (kvx1 != null)
                    {
                        l = i + koh.d(4, kvx1);
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
            i1 = j + koh.b(5, c);
        }
        i = i1;
        if (h != null)
        {
            h.booleanValue();
            i = i1 + (koh.f(6) + 1);
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
                    kwj kwj2 = e[j1];
                    j = i;
                    if (kwj2 != null)
                    {
                        j = i + koh.d(7, kwj2);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.b(8, f);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                kwj akwj[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akwj = new kwj[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, akwj, 0, j);
                    i1 = j;
                }
                for (; i1 < akwj.length - 1; i1++)
                {
                    akwj[i1] = new kwj();
                    kog1.a(akwj[i1]);
                    kog1.a();
                }

                akwj[i1] = new kwj();
                kog1.a(akwj[i1]);
                d = akwj;
                break;

            case 34: // '"'
                int j1 = kou.b(kog1, 34);
                kvx akvx[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                akvx = new kvx[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(g, 0, akvx, 0, k);
                    j1 = k;
                }
                for (; j1 < akvx.length - 1; j1++)
                {
                    akvx[j1] = new kvx();
                    kog1.a(akvx[j1]);
                    kog1.a();
                }

                akvx[j1] = new kvx();
                kog1.a(akvx[j1]);
                g = akvx;
                break;

            case 42: // '*'
                c = kog1.j();
                break;

            case 48: // '0'
                h = Boolean.valueOf(kog1.i());
                break;

            case 58: // ':'
                int k1 = kou.b(kog1, 58);
                kwj akwj1[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                akwj1 = new kwj[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, akwj1, 0, l);
                    k1 = l;
                }
                for (; k1 < akwj1.length - 1; k1++)
                {
                    akwj1[k1] = new kwj();
                    kog1.a(akwj1[k1]);
                    kog1.a();
                }

                akwj1[k1] = new kwj();
                kog1.a(akwj1[k1]);
                e = akwj1;
                break;

            case 66: // 'B'
                f = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        koh1.a(2, b);
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kwj kwj1 = d[i];
                if (kwj1 != null)
                {
                    koh1.b(3, kwj1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j = 0; j < g.length; j++)
            {
                kvx kvx1 = g[j];
                if (kvx1 != null)
                {
                    koh1.b(4, kvx1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(5, c);
        }
        if (h != null)
        {
            koh1.a(6, h.booleanValue());
        }
        if (e != null && e.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                kwj kwj2 = e[k];
                if (kwj2 != null)
                {
                    koh1.b(7, kwj2);
                }
            }

        }
        if (f != null)
        {
            koh1.a(8, f);
        }
        super.writeTo(koh1);
    }
}
