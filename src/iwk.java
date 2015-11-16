// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwk extends koj
{

    public Boolean a;
    public Boolean b;
    public isf c[];
    public ivr d;
    public iuj e;
    public isg f;
    public ise g;
    public iqn h;
    public iyv i;
    public iuz j;

    public iwk()
    {
        a = null;
        b = null;
        c = isf.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int l = k;
        if (a != null)
        {
            a.booleanValue();
            l = k + (koh.f(1) + 1);
        }
        k = l;
        if (b != null)
        {
            b.booleanValue();
            k = l + (koh.f(2) + 1);
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                for (l = 0; l < c.length;)
                {
                    isf isf1 = c[l];
                    int i1 = k;
                    if (isf1 != null)
                    {
                        i1 = k + koh.d(3, isf1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (d != null)
        {
            k = l + koh.d(4, d);
        }
        l = k;
        if (e != null)
        {
            l = k + koh.d(5, e);
        }
        k = l;
        if (f != null)
        {
            k = l + koh.d(6, f);
        }
        l = k;
        if (g != null)
        {
            l = k + koh.d(7, g);
        }
        k = l;
        if (h != null)
        {
            k = l + koh.d(8, h);
        }
        l = k;
        if (i != null)
        {
            l = k + koh.d(9, i);
        }
        k = l;
        if (j != null)
        {
            k = l + koh.d(10, j);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int k = kog1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kog1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Boolean.valueOf(kog1.i());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                isf aisf[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aisf = new isf[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aisf, 0, l);
                    i1 = l;
                }
                for (; i1 < aisf.length - 1; i1++)
                {
                    aisf[i1] = new isf();
                    kog1.a(aisf[i1]);
                    kog1.a();
                }

                aisf[i1] = new isf();
                kog1.a(aisf[i1]);
                c = aisf;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ivr();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iuj();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new isg();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new ise();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new iqn();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new iyv();
                }
                kog1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new iuz();
                }
                kog1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                isf isf1 = c[k];
                if (isf1 != null)
                {
                    koh1.b(3, isf1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
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
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        super.writeTo(koh1);
    }
}
