// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irm extends koj
{

    private static volatile irm i[];
    public irg a;
    public Long b;
    public irb c;
    public isv d[];
    public isz e;
    public isz f;
    public Boolean g;
    public irw h[];

    public irm()
    {
        a = null;
        b = null;
        c = null;
        d = isv.a();
        e = null;
        f = null;
        g = null;
        h = irw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static irm[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new irm[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int k = j;
        if (a != null)
        {
            k = j + koh.d(1, a);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.d(2, c);
        }
        k = j;
        if (d != null)
        {
            k = j;
            if (d.length > 0)
            {
                for (k = 0; k < d.length;)
                {
                    isv isv1 = d[k];
                    int l = j;
                    if (isv1 != null)
                    {
                        l = j + koh.d(3, isv1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        j = k;
        if (g != null)
        {
            g.booleanValue();
            j = k + (koh.f(4) + 1);
        }
        k = j;
        if (e != null)
        {
            k = j + koh.d(5, e);
        }
        j = k;
        if (b != null)
        {
            j = k + koh.d(6, b.longValue());
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (i1 >= h.length)
                    {
                        break;
                    }
                    irw irw1 = h[i1];
                    k = j;
                    if (irw1 != null)
                    {
                        k = j + koh.d(7, irw1);
                    }
                    i1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (f != null)
        {
            j = k + koh.d(8, f);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new irg();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new irb();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                isv aisv[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aisv = new isv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aisv, 0, k);
                    i1 = k;
                }
                for (; i1 < aisv.length - 1; i1++)
                {
                    aisv[i1] = new isv();
                    kog1.a(aisv[i1]);
                    kog1.a();
                }

                aisv[i1] = new isv();
                kog1.a(aisv[i1]);
                d = aisv;
                break;

            case 32: // ' '
                g = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new isz();
                }
                kog1.a(e);
                break;

            case 48: // '0'
                b = Long.valueOf(kog1.d());
                break;

            case 58: // ':'
                int j1 = kou.b(kog1, 58);
                irw airw[];
                int l;
                if (h == null)
                {
                    l = 0;
                } else
                {
                    l = h.length;
                }
                airw = new irw[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(h, 0, airw, 0, l);
                    j1 = l;
                }
                for (; j1 < airw.length - 1; j1++)
                {
                    airw[j1] = new irw();
                    kog1.a(airw[j1]);
                    kog1.a();
                }

                airw[j1] = new irw();
                kog1.a(airw[j1]);
                h = airw;
                break;

            case 66: // 'B'
                if (f == null)
                {
                    f = new isz();
                }
                kog1.a(f);
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
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                isv isv1 = d[j];
                if (isv1 != null)
                {
                    koh1.b(3, isv1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(4, g.booleanValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (b != null)
        {
            koh1.a(6, b.longValue());
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                irw irw1 = h[k];
                if (irw1 != null)
                {
                    koh1.b(7, irw1);
                }
            }

        }
        if (f != null)
        {
            koh1.b(8, f);
        }
        super.writeTo(koh1);
    }
}
