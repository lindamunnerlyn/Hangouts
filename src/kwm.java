// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwm extends koj
{

    public kwn a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String e[];
    public String f[];
    public Boolean g;
    public kws h[];
    public Boolean i;
    public kwr j[];
    public Boolean k;

    public kwm()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
        f = kou.f;
        g = null;
        h = kws.a();
        i = null;
        j = kwr.a();
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + koh.d(21, a);
        }
        i1 = l;
        if (b != null)
        {
            b.booleanValue();
            i1 = l + (koh.f(25) + 1);
        }
        int j1 = i1;
        if (c != null)
        {
            c.booleanValue();
            j1 = i1 + (koh.f(26) + 1);
        }
        l = j1;
        if (d != null)
        {
            l = j1 + koh.b(27, d);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l;
            if (e.length > 0)
            {
                i1 = 0;
                j1 = 0;
                int i2;
                int k2;
                for (i2 = 0; i1 < e.length; i2 = k2)
                {
                    String s = e[i1];
                    int i3 = j1;
                    k2 = i2;
                    if (s != null)
                    {
                        k2 = i2 + 1;
                        i3 = j1 + koh.a(s);
                    }
                    i1++;
                    j1 = i3;
                }

                i1 = l + j1 + i2 * 2;
            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                l = 0;
                j1 = 0;
                int j2;
                int l2;
                for (j2 = 0; l < f.length; j2 = l2)
                {
                    String s1 = f[l];
                    int j3 = j1;
                    l2 = j2;
                    if (s1 != null)
                    {
                        l2 = j2 + 1;
                        j3 = j1 + koh.a(s1);
                    }
                    l++;
                    j1 = j3;
                }

                j1 = i1 + j1 + j2 * 2;
            }
        }
        l = j1;
        if (g != null)
        {
            g.booleanValue();
            l = j1 + (koh.f(30) + 1);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l;
            if (h.length > 0)
            {
                for (i1 = 0; i1 < h.length;)
                {
                    kws kws1 = h[i1];
                    int k1 = l;
                    if (kws1 != null)
                    {
                        k1 = l + koh.d(31, kws1);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (i != null)
        {
            i.booleanValue();
            l = i1 + (koh.f(32) + 1);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (l1 >= j.length)
                    {
                        break;
                    }
                    kwr kwr1 = j[l1];
                    i1 = l;
                    if (kwr1 != null)
                    {
                        i1 = l + koh.d(33, kwr1);
                    }
                    l1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (k != null)
        {
            k.booleanValue();
            l = i1 + (koh.f(34) + 1);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int l = kog1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kog1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 170: 
                if (a == null)
                {
                    a = new kwn();
                }
                kog1.a(a);
                break;

            case 200: 
                b = Boolean.valueOf(kog1.i());
                break;

            case 208: 
                c = Boolean.valueOf(kog1.i());
                break;

            case 218: 
                d = kog1.j();
                break;

            case 226: 
                int i2 = kou.b(kog1, 226);
                String as[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                as = new String[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, as, 0, i1);
                    i2 = i1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kog1.j();
                    kog1.a();
                }

                as[i2] = kog1.j();
                e = as;
                break;

            case 234: 
                int j2 = kou.b(kog1, 234);
                String as1[];
                int j1;
                if (f == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = f.length;
                }
                as1 = new String[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(f, 0, as1, 0, j1);
                    j2 = j1;
                }
                for (; j2 < as1.length - 1; j2++)
                {
                    as1[j2] = kog1.j();
                    kog1.a();
                }

                as1[j2] = kog1.j();
                f = as1;
                break;

            case 240: 
                g = Boolean.valueOf(kog1.i());
                break;

            case 250: 
                int k2 = kou.b(kog1, 250);
                kws akws[];
                int k1;
                if (h == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = h.length;
                }
                akws = new kws[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(h, 0, akws, 0, k1);
                    k2 = k1;
                }
                for (; k2 < akws.length - 1; k2++)
                {
                    akws[k2] = new kws();
                    kog1.a(akws[k2]);
                    kog1.a();
                }

                akws[k2] = new kws();
                kog1.a(akws[k2]);
                h = akws;
                break;

            case 256: 
                i = Boolean.valueOf(kog1.i());
                break;

            case 266: 
                int l2 = kou.b(kog1, 266);
                kwr akwr[];
                int l1;
                if (j == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = j.length;
                }
                akwr = new kwr[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(j, 0, akwr, 0, l1);
                    l2 = l1;
                }
                for (; l2 < akwr.length - 1; l2++)
                {
                    akwr[l2] = new kwr();
                    kog1.a(akwr[l2]);
                    kog1.a();
                }

                akwr[l2] = new kwr();
                kog1.a(akwr[l2]);
                j = akwr;
                break;

            case 272: 
                k = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(21, a);
        }
        if (b != null)
        {
            koh1.a(25, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(26, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(27, d);
        }
        if (e != null && e.length > 0)
        {
            for (int l = 0; l < e.length; l++)
            {
                String s = e[l];
                if (s != null)
                {
                    koh1.a(28, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                String s1 = f[i1];
                if (s1 != null)
                {
                    koh1.a(29, s1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(30, g.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                kws kws1 = h[j1];
                if (kws1 != null)
                {
                    koh1.b(31, kws1);
                }
            }

        }
        if (i != null)
        {
            koh1.a(32, i.booleanValue());
        }
        if (j != null && j.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < j.length; k1++)
            {
                kwr kwr1 = j[k1];
                if (kwr1 != null)
                {
                    koh1.b(33, kwr1);
                }
            }

        }
        if (k != null)
        {
            koh1.a(34, k.booleanValue());
        }
        super.writeTo(koh1);
    }
}
