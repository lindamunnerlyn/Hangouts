// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipv extends koj
{

    public ipw a[];
    public Integer b;
    public String c;
    public String d[];
    public String e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public String n;

    public ipv()
    {
        a = ipw.a();
        b = null;
        c = null;
        d = kou.f;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                for (j1 = 0; j1 < a.length;)
                {
                    ipw ipw1 = a[j1];
                    int k1 = i1;
                    if (ipw1 != null)
                    {
                        k1 = i1 + koh.d(1, ipw1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                int l1 = 0;
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < d.length;)
                {
                    String s = d[j1];
                    int k2 = l1;
                    int j2 = i2;
                    if (s != null)
                    {
                        j2 = i2 + 1;
                        k2 = l1 + koh.a(s);
                    }
                    j1++;
                    l1 = k2;
                    i2 = j2;
                }

                j1 = i1 + l1 + i2 * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.e(5, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.e(6, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(7, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(8, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(9, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(10, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(11, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.e(12, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(13, n);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.e(14, b.intValue());
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l1 = kou.b(kog1, 10);
                ipw aipw[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                aipw = new ipw[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, aipw, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aipw.length - 1; l1++)
                {
                    aipw[l1] = new ipw();
                    kog1.a(aipw[l1]);
                    kog1.a();
                }

                aipw[l1] = new ipw();
                kog1.a(aipw[l1]);
                a = aipw;
                break;

            case 18: // '\022'
                c = kog1.j();
                break;

            case 26: // '\032'
                int i2 = kou.b(kog1, 26);
                String as[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                as = new String[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, as, 0, k1);
                    i2 = k1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kog1.j();
                    kog1.a();
                }

                as[i2] = kog1.j();
                d = as;
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 40: // '('
                f = Integer.valueOf(kog1.f());
                break;

            case 48: // '0'
                g = Integer.valueOf(kog1.f());
                break;

            case 56: // '8'
                h = Integer.valueOf(kog1.f());
                break;

            case 64: // '@'
                i = Integer.valueOf(kog1.f());
                break;

            case 72: // 'H'
                j = Integer.valueOf(kog1.f());
                break;

            case 80: // 'P'
                k = Integer.valueOf(kog1.f());
                break;

            case 88: // 'X'
                l = Integer.valueOf(kog1.f());
                break;

            case 96: // '`'
                m = Integer.valueOf(kog1.f());
                break;

            case 106: // 'j'
                n = kog1.j();
                break;

            case 112: // 'p'
                b = Integer.valueOf(kog1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                ipw ipw1 = a[i1];
                if (ipw1 != null)
                {
                    koh1.b(1, ipw1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < d.length; j1++)
            {
                String s = d[j1];
                if (s != null)
                {
                    koh1.a(3, s);
                }
            }

        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f.intValue());
        }
        if (g != null)
        {
            koh1.a(6, g.intValue());
        }
        if (h != null)
        {
            koh1.a(7, h.intValue());
        }
        if (i != null)
        {
            koh1.a(8, i.intValue());
        }
        if (j != null)
        {
            koh1.a(9, j.intValue());
        }
        if (k != null)
        {
            koh1.a(10, k.intValue());
        }
        if (l != null)
        {
            koh1.a(11, l.intValue());
        }
        if (m != null)
        {
            koh1.a(12, m.intValue());
        }
        if (n != null)
        {
            koh1.a(13, n);
        }
        if (b != null)
        {
            koh1.a(14, b.intValue());
        }
        super.writeTo(koh1);
    }
}
