// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwf extends koj
{

    private static volatile kwf t[];
    public kwg a[];
    public Long b;
    public kvv c;
    public Boolean d;
    public kvu e;
    public byte f[];
    public kve g;
    public String h;
    public String i[];
    public String j;
    public String k;
    public kwj l[];
    public koq m;
    public Long n;
    public kwh o;
    public kwd p;
    public kvj q;
    public kvf r;
    public kwc s;

    public kwf()
    {
        a = kwg.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kou.f;
        j = null;
        k = null;
        l = kwj.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kwf[] a()
    {
        if (t == null)
        {
            synchronized (kon.a)
            {
                if (t == null)
                {
                    t = new kwf[0];
                }
            }
        }
        return t;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(1, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(2, g);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < i.length; j2 = k2)
                {
                    String s1 = i[j1];
                    int l2 = k1;
                    k2 = j2;
                    if (s1 != null)
                    {
                        k2 = j2 + 1;
                        l2 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = l2;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < l.length;)
                {
                    kwj kwj1 = l[j1];
                    int l1 = i1;
                    if (kwj1 != null)
                    {
                        l1 = i1 + koh.d(4, kwj1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= a.length)
                    {
                        break;
                    }
                    kwg kwg1 = a[i2];
                    j1 = i1;
                    if (kwg1 != null)
                    {
                        j1 = i1 + koh.d(5, kwg1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(6, j);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(7, h);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.e(8, n.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(9, k);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.d(10, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(11, p);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.e(12, b.longValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(13, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(14, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(15, s);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (koh.f(16) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(17, m);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(18, c);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(19, e);
        }
        return j1;
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
                f = kog1.k();
                break;

            case 18: // '\022'
                if (g == null)
                {
                    g = new kve();
                }
                kog1.a(g);
                break;

            case 26: // '\032'
                int i2 = kou.b(kog1, 26);
                String as[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                as = new String[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, as, 0, j1);
                    i2 = j1;
                }
                for (; i2 < as.length - 1; i2++)
                {
                    as[i2] = kog1.j();
                    kog1.a();
                }

                as[i2] = kog1.j();
                i = as;
                break;

            case 34: // '"'
                int j2 = kou.b(kog1, 34);
                kwj akwj[];
                int k1;
                if (l == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = l.length;
                }
                akwj = new kwj[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(l, 0, akwj, 0, k1);
                    j2 = k1;
                }
                for (; j2 < akwj.length - 1; j2++)
                {
                    akwj[j2] = new kwj();
                    kog1.a(akwj[j2]);
                    kog1.a();
                }

                akwj[j2] = new kwj();
                kog1.a(akwj[j2]);
                l = akwj;
                break;

            case 42: // '*'
                int k2 = kou.b(kog1, 42);
                kwg akwg[];
                int l1;
                if (a == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = a.length;
                }
                akwg = new kwg[k2 + l1];
                k2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(a, 0, akwg, 0, l1);
                    k2 = l1;
                }
                for (; k2 < akwg.length - 1; k2++)
                {
                    akwg[k2] = new kwg();
                    kog1.a(akwg[k2]);
                    kog1.a();
                }

                akwg[k2] = new kwg();
                kog1.a(akwg[k2]);
                a = akwg;
                break;

            case 50: // '2'
                j = kog1.j();
                break;

            case 58: // ':'
                h = kog1.j();
                break;

            case 64: // '@'
                n = Long.valueOf(kog1.e());
                break;

            case 74: // 'J'
                k = kog1.j();
                break;

            case 82: // 'R'
                if (o == null)
                {
                    o = new kwh();
                }
                kog1.a(o);
                break;

            case 90: // 'Z'
                if (p == null)
                {
                    p = new kwd();
                }
                kog1.a(p);
                break;

            case 96: // '`'
                b = Long.valueOf(kog1.e());
                break;

            case 106: // 'j'
                if (q == null)
                {
                    q = new kvj();
                }
                kog1.a(q);
                break;

            case 114: // 'r'
                if (r == null)
                {
                    r = new kvf();
                }
                kog1.a(r);
                break;

            case 122: // 'z'
                if (s == null)
                {
                    s = new kwc();
                }
                kog1.a(s);
                break;

            case 128: 
                d = Boolean.valueOf(kog1.i());
                break;

            case 138: 
                if (m == null)
                {
                    m = new koq();
                }
                kog1.a(m);
                break;

            case 146: 
                if (c == null)
                {
                    c = new kvv();
                }
                kog1.a(c);
                break;

            case 154: 
                if (e == null)
                {
                    e = new kvu();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (f != null)
        {
            koh1.a(1, f);
        }
        if (g != null)
        {
            koh1.b(2, g);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s1 = i[i1];
                if (s1 != null)
                {
                    koh1.a(3, s1);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int j1 = 0; j1 < l.length; j1++)
            {
                kwj kwj1 = l[j1];
                if (kwj1 != null)
                {
                    koh1.b(4, kwj1);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < a.length; k1++)
            {
                kwg kwg1 = a[k1];
                if (kwg1 != null)
                {
                    koh1.b(5, kwg1);
                }
            }

        }
        if (j != null)
        {
            koh1.a(6, j);
        }
        if (h != null)
        {
            koh1.a(7, h);
        }
        if (n != null)
        {
            koh1.b(8, n.longValue());
        }
        if (k != null)
        {
            koh1.a(9, k);
        }
        if (o != null)
        {
            koh1.b(10, o);
        }
        if (p != null)
        {
            koh1.b(11, p);
        }
        if (b != null)
        {
            koh1.b(12, b.longValue());
        }
        if (q != null)
        {
            koh1.b(13, q);
        }
        if (r != null)
        {
            koh1.b(14, r);
        }
        if (s != null)
        {
            koh1.b(15, s);
        }
        if (d != null)
        {
            koh1.a(16, d.booleanValue());
        }
        if (m != null)
        {
            koh1.b(17, m);
        }
        if (c != null)
        {
            koh1.b(18, c);
        }
        if (e != null)
        {
            koh1.b(19, e);
        }
        super.writeTo(koh1);
    }
}
