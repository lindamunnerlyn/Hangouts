// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kov extends koj
{

    private static volatile kov i[];
    public String a;
    public Boolean b;
    public Double c;
    public String d[];
    public Long e;
    public Long f;
    public Integer g;
    public long h[];

    public kov()
    {
        a = null;
        b = null;
        c = null;
        d = kou.f;
        e = null;
        f = null;
        g = null;
        h = kou.b;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kov[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new kov[0];
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
        int j = super.computeSerializedSize() + koh.b(1, a);
        int k = j;
        if (b != null)
        {
            b.booleanValue();
            k = j + (koh.f(2) + 1);
        }
        j = k;
        if (c != null)
        {
            c.doubleValue();
            j = k + (koh.f(3) + 8);
        }
        k = j;
        if (d != null)
        {
            k = j;
            if (d.length > 0)
            {
                k = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; k < d.length; j1 = k1)
                {
                    String s = d[k];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + koh.a(s);
                    }
                    k++;
                    l = l1;
                }

                k = j + l + j1 * 1;
            }
        }
        j = k;
        if (g != null)
        {
            j = k + koh.e(5, g.intValue());
        }
        k = j;
        if (e != null)
        {
            k = j + koh.e(6, e.longValue());
        }
        j = k;
        if (f != null)
        {
            j = k + koh.e(7, f.longValue());
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                int i1 = 0;
                for (k = ((flag) ? 1 : 0); k < h.length; k++)
                {
                    i1 += koh.b(h[k]);
                }

                k = j + i1 + h.length * 1;
            }
        }
        return k;
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
                a = kog1.j();
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 25: // '\031'
                c = Double.valueOf(kog1.b());
                break;

            case 34: // '"'
                int j1 = kou.b(kog1, 34);
                String as[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                as = new String[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, as, 0, k);
                    j1 = k;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = kog1.j();
                    kog1.a();
                }

                as[j1] = kog1.j();
                d = as;
                break;

            case 40: // '('
                g = Integer.valueOf(kog1.f());
                break;

            case 48: // '0'
                e = Long.valueOf(kog1.e());
                break;

            case 56: // '8'
                f = Long.valueOf(kog1.e());
                break;

            case 64: // '@'
                int k1 = kou.b(kog1, 64);
                long al[];
                int l;
                if (h == null)
                {
                    l = 0;
                } else
                {
                    l = h.length;
                }
                al = new long[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(h, 0, al, 0, l);
                    k1 = l;
                }
                for (; k1 < al.length - 1; k1++)
                {
                    al[k1] = kog1.e();
                    kog1.a();
                }

                al[k1] = kog1.e();
                h = al;
                break;

            case 66: // 'B'
                int i2 = kog1.c(kog1.p());
                int i1 = kog1.r();
                int l1;
                for (l1 = 0; kog1.q() > 0; l1++)
                {
                    kog1.e();
                }

                kog1.e(i1);
                long al1[];
                if (h == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = h.length;
                }
                al1 = new long[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(h, 0, al1, 0, i1);
                    l1 = i1;
                }
                for (; l1 < al1.length; l1++)
                {
                    al1[l1] = kog1.e();
                }

                h = al1;
                kog1.d(i2);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.doubleValue());
        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                String s = d[j];
                if (s != null)
                {
                    koh1.a(4, s);
                }
            }

        }
        if (g != null)
        {
            koh1.a(5, g.intValue());
        }
        if (e != null)
        {
            koh1.b(6, e.longValue());
        }
        if (f != null)
        {
            koh1.b(7, f.longValue());
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                koh1.b(8, h[k]);
            }

        }
        super.writeTo(koh1);
    }
}
