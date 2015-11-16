// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsv extends koj
{

    public static final kok a = kok.a(jsv, 0x5d25432L);
    private static final jsv k[] = new jsv[0];
    public jsw b[];
    public jsx c[];
    public jsx d[];
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public jsw h[];
    public lis i;
    public jsz j;

    public jsv()
    {
        b = jsw.a();
        c = jsx.a();
        d = jsx.a();
        e = null;
        f = null;
        g = null;
        h = jsw.a();
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (b != null)
        {
            l = i1;
            if (b.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < b.length;)
                {
                    jsw jsw1 = b[i1];
                    int j1 = l;
                    if (jsw1 != null)
                    {
                        j1 = l + koh.d(2, jsw1);
                    }
                    i1++;
                    l = j1;
                }

            }
        }
        i1 = l;
        if (e != null)
        {
            e.booleanValue();
            i1 = l + (koh.f(3) + 1);
        }
        l = i1;
        if (f != null)
        {
            f.booleanValue();
            l = i1 + (koh.f(4) + 1);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l;
            if (h.length > 0)
            {
                for (i1 = 0; i1 < h.length;)
                {
                    jsw jsw2 = h[i1];
                    int k1 = l;
                    if (jsw2 != null)
                    {
                        k1 = l + koh.d(5, jsw2);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (c != null)
        {
            l = i1;
            if (c.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < c.length;)
                {
                    jsx jsx1 = c[i1];
                    int l1 = l;
                    if (jsx1 != null)
                    {
                        l1 = l + koh.d(6, jsx1);
                    }
                    i1++;
                    l = l1;
                }

            }
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (koh.f(7) + 1);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + koh.d(8, i);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l;
            if (d.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (i2 >= d.length)
                    {
                        break;
                    }
                    jsx jsx2 = d[i2];
                    i1 = l;
                    if (jsx2 != null)
                    {
                        i1 = l + koh.d(9, jsx2);
                    }
                    i2++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (j != null)
        {
            l = i1 + koh.d(500, j);
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

            case 18: // '\022'
                int i2 = kou.b(kog1, 18);
                jsw ajsw[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                ajsw = new jsw[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, ajsw, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ajsw.length - 1; i2++)
                {
                    ajsw[i2] = new jsw();
                    kog1.a(ajsw[i2]);
                    kog1.a();
                }

                ajsw[i2] = new jsw();
                kog1.a(ajsw[i2]);
                b = ajsw;
                break;

            case 24: // '\030'
                e = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                f = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                int j2 = kou.b(kog1, 42);
                jsw ajsw1[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                ajsw1 = new jsw[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, ajsw1, 0, j1);
                    j2 = j1;
                }
                for (; j2 < ajsw1.length - 1; j2++)
                {
                    ajsw1[j2] = new jsw();
                    kog1.a(ajsw1[j2]);
                    kog1.a();
                }

                ajsw1[j2] = new jsw();
                kog1.a(ajsw1[j2]);
                h = ajsw1;
                break;

            case 50: // '2'
                int k2 = kou.b(kog1, 50);
                jsx ajsx[];
                int k1;
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                ajsx = new jsx[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ajsx, 0, k1);
                    k2 = k1;
                }
                for (; k2 < ajsx.length - 1; k2++)
                {
                    ajsx[k2] = new jsx();
                    kog1.a(ajsx[k2]);
                    kog1.a();
                }

                ajsx[k2] = new jsx();
                kog1.a(ajsx[k2]);
                c = ajsx;
                break;

            case 56: // '8'
                g = Boolean.valueOf(kog1.i());
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new lis();
                }
                kog1.a(i);
                break;

            case 74: // 'J'
                int l2 = kou.b(kog1, 74);
                jsx ajsx1[];
                int l1;
                if (d == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = d.length;
                }
                ajsx1 = new jsx[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(d, 0, ajsx1, 0, l1);
                    l2 = l1;
                }
                for (; l2 < ajsx1.length - 1; l2++)
                {
                    ajsx1[l2] = new jsx();
                    kog1.a(ajsx1[l2]);
                    kog1.a();
                }

                ajsx1[l2] = new jsx();
                kog1.a(ajsx1[l2]);
                d = ajsx1;
                break;

            case 4002: 
                if (j == null)
                {
                    j = new jsz();
                }
                kog1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                jsw jsw1 = b[l];
                if (jsw1 != null)
                {
                    koh1.b(2, jsw1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(4, f.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                jsw jsw2 = h[i1];
                if (jsw2 != null)
                {
                    koh1.b(5, jsw2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                jsx jsx1 = c[j1];
                if (jsx1 != null)
                {
                    koh1.b(6, jsx1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (i != null)
        {
            koh1.b(8, i);
        }
        if (d != null && d.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < d.length; k1++)
            {
                jsx jsx2 = d[k1];
                if (jsx2 != null)
                {
                    koh1.b(9, jsx2);
                }
            }

        }
        if (j != null)
        {
            koh1.b(500, j);
        }
        super.writeTo(koh1);
    }

}
