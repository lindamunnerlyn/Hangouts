// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixn extends koj
{

    public itb a;
    public isy b[];
    public iqs c[];
    public ius d;
    public ivm e;
    public itc f;
    public ivb g;
    public iti h;
    public iyy i;
    public byte j[];
    public Long k;
    public ixf requestHeader;

    public ixn()
    {
        requestHeader = null;
        a = null;
        b = isy.a();
        c = iqs.a();
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
            l = i1 + koh.d(1, requestHeader);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + koh.b(2, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + koh.d(3, k.longValue());
        }
        i1 = l;
        if (b != null)
        {
            i1 = l;
            if (b.length > 0)
            {
                for (i1 = 0; i1 < b.length;)
                {
                    isy isy1 = b[i1];
                    int j1 = l;
                    if (isy1 != null)
                    {
                        j1 = l + koh.d(5, isy1);
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
            l = i1 + koh.d(6, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.d(7, f);
        }
        l = i1;
        if (a != null)
        {
            l = i1 + koh.d(8, a);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + koh.d(9, d);
        }
        int k1 = i1;
        if (g != null)
        {
            k1 = i1 + koh.d(10, g);
        }
        l = k1;
        if (h != null)
        {
            l = k1 + koh.d(11, h);
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
                    iqs iqs1 = c[l1];
                    i1 = l;
                    if (iqs1 != null)
                    {
                        i1 = l + koh.d(12, iqs1);
                    }
                    l1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (i != null)
        {
            l = i1 + koh.d(13, i);
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

            case 10: // '\n'
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                j = kog1.k();
                break;

            case 24: // '\030'
                k = Long.valueOf(kog1.d());
                break;

            case 42: // '*'
                int k1 = kou.b(kog1, 42);
                isy aisy[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                aisy = new isy[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, aisy, 0, i1);
                    k1 = i1;
                }
                for (; k1 < aisy.length - 1; k1++)
                {
                    aisy[k1] = new isy();
                    kog1.a(aisy[k1]);
                    kog1.a();
                }

                aisy[k1] = new isy();
                kog1.a(aisy[k1]);
                b = aisy;
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new ivm();
                }
                kog1.a(e);
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new itc();
                }
                kog1.a(f);
                break;

            case 66: // 'B'
                if (a == null)
                {
                    a = new itb();
                }
                kog1.a(a);
                break;

            case 74: // 'J'
                if (d == null)
                {
                    d = new ius();
                }
                kog1.a(d);
                break;

            case 82: // 'R'
                if (g == null)
                {
                    g = new ivb();
                }
                kog1.a(g);
                break;

            case 90: // 'Z'
                if (h == null)
                {
                    h = new iti();
                }
                kog1.a(h);
                break;

            case 98: // 'b'
                int l1 = kou.b(kog1, 98);
                iqs aiqs[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                aiqs = new iqs[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, aiqs, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aiqs.length - 1; l1++)
                {
                    aiqs[l1] = new iqs();
                    kog1.a(aiqs[l1]);
                    kog1.a();
                }

                aiqs[l1] = new iqs();
                kog1.a(aiqs[l1]);
                c = aiqs;
                break;

            case 106: // 'j'
                if (i == null)
                {
                    i = new iyy();
                }
                kog1.a(i);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (j != null)
        {
            koh1.a(2, j);
        }
        if (k != null)
        {
            koh1.a(3, k.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                isy isy1 = b[l];
                if (isy1 != null)
                {
                    koh1.b(5, isy1);
                }
            }

        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        if (f != null)
        {
            koh1.b(7, f);
        }
        if (a != null)
        {
            koh1.b(8, a);
        }
        if (d != null)
        {
            koh1.b(9, d);
        }
        if (g != null)
        {
            koh1.b(10, g);
        }
        if (h != null)
        {
            koh1.b(11, h);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < c.length; i1++)
            {
                iqs iqs1 = c[i1];
                if (iqs1 != null)
                {
                    koh1.b(12, iqs1);
                }
            }

        }
        if (i != null)
        {
            koh1.b(13, i);
        }
        super.writeTo(koh1);
    }
}
