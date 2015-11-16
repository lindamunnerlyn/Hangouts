// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jds extends kwm
{

    public izg a;
    public izd b[];
    public iwx c[];
    public jax d;
    public jbr e;
    public izh f;
    public jbg g;
    public izn h;
    public jfd i;
    public byte j[];
    public Long k;
    public jdk requestHeader;

    public jds()
    {
        requestHeader = null;
        a = null;
        b = izd.a();
        c = iwx.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (requestHeader != null)
        {
            l = i1 + kwk.d(1, requestHeader);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + kwk.b(2, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + kwk.d(3, k.longValue());
        }
        i1 = l;
        if (b != null)
        {
            i1 = l;
            if (b.length > 0)
            {
                for (i1 = 0; i1 < b.length;)
                {
                    izd izd1 = b[i1];
                    int j1 = l;
                    if (izd1 != null)
                    {
                        j1 = l + kwk.d(5, izd1);
                    }
                    i1++;
                    l = j1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.d(6, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.d(7, f);
        }
        l = i1;
        if (a != null)
        {
            l = i1 + kwk.d(8, a);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.d(9, d);
        }
        int k1 = i1;
        if (g != null)
        {
            k1 = i1 + kwk.d(10, g);
        }
        l = k1;
        if (h != null)
        {
            l = k1 + kwk.d(11, h);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (l1 >= c.length)
                    {
                        break;
                    }
                    iwx iwx1 = c[l1];
                    i1 = l;
                    if (iwx1 != null)
                    {
                        i1 = l + kwk.d(12, iwx1);
                    }
                    l1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.d(13, i);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int l = kwj1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kwj1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                j = kwj1.k();
                break;

            case 24: // '\030'
                k = Long.valueOf(kwj1.d());
                break;

            case 42: // '*'
                int k1 = kwx.a(kwj1, 42);
                izd aizd[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                aizd = new izd[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, aizd, 0, i1);
                    k1 = i1;
                }
                for (; k1 < aizd.length - 1; k1++)
                {
                    aizd[k1] = new izd();
                    kwj1.a(aizd[k1]);
                    kwj1.a();
                }

                aizd[k1] = new izd();
                kwj1.a(aizd[k1]);
                b = aizd;
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new jbr();
                }
                kwj1.a(e);
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new izh();
                }
                kwj1.a(f);
                break;

            case 66: // 'B'
                if (a == null)
                {
                    a = new izg();
                }
                kwj1.a(a);
                break;

            case 74: // 'J'
                if (d == null)
                {
                    d = new jax();
                }
                kwj1.a(d);
                break;

            case 82: // 'R'
                if (g == null)
                {
                    g = new jbg();
                }
                kwj1.a(g);
                break;

            case 90: // 'Z'
                if (h == null)
                {
                    h = new izn();
                }
                kwj1.a(h);
                break;

            case 98: // 'b'
                int l1 = kwx.a(kwj1, 98);
                iwx aiwx[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                aiwx = new iwx[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, aiwx, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aiwx.length - 1; l1++)
                {
                    aiwx[l1] = new iwx();
                    kwj1.a(aiwx[l1]);
                    kwj1.a();
                }

                aiwx[l1] = new iwx();
                kwj1.a(aiwx[l1]);
                c = aiwx;
                break;

            case 106: // 'j'
                if (i == null)
                {
                    i = new jfd();
                }
                kwj1.a(i);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (j != null)
        {
            kwk1.a(2, j);
        }
        if (k != null)
        {
            kwk1.a(3, k.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                izd izd1 = b[l];
                if (izd1 != null)
                {
                    kwk1.b(5, izd1);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(6, e);
        }
        if (f != null)
        {
            kwk1.b(7, f);
        }
        if (a != null)
        {
            kwk1.b(8, a);
        }
        if (d != null)
        {
            kwk1.b(9, d);
        }
        if (g != null)
        {
            kwk1.b(10, g);
        }
        if (h != null)
        {
            kwk1.b(11, h);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < c.length; i1++)
            {
                iwx iwx1 = c[i1];
                if (iwx1 != null)
                {
                    kwk1.b(12, iwx1);
                }
            }

        }
        if (i != null)
        {
            kwk1.b(13, i);
        }
        super.writeTo(kwk1);
    }
}
