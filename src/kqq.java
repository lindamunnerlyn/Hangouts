// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqq extends koj
{

    public static final kok a = kok.a(kqq, 0x112aef12L);
    public static final kok b = kok.a(kqq, 0x112aef12L);
    private static final kqq w[] = new kqq[0];
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kpl h;
    public String i;
    public koz j[];
    public koz k;
    public koz l[];
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public koz u;
    public String v;

    public kqq()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = koz.a();
        k = null;
        l = koz.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    koz koz1 = j[j1];
                    int k1 = i1;
                    if (koz1 != null)
                    {
                        k1 = i1 + koh.d(8, koz1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= l.length)
                    {
                        break;
                    }
                    koz koz2 = l[l1];
                    j1 = i1;
                    if (koz2 != null)
                    {
                        j1 = i1 + koh.d(11, koz2);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(30, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(31, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.b(32, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.b(33, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.b(34, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.b(35, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.b(75, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.d(185, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.b(254, v);
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
                c = kog1.j();
                break;

            case 18: // '\022'
                d = kog1.j();
                break;

            case 26: // '\032'
                e = kog1.j();
                break;

            case 34: // '"'
                f = kog1.j();
                break;

            case 42: // '*'
                g = kog1.j();
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new kpl();
                }
                kog1.a(h);
                break;

            case 58: // ':'
                i = kog1.j();
                break;

            case 66: // 'B'
                int l1 = kou.b(kog1, 66);
                koz akoz[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                akoz = new koz[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(j, 0, akoz, 0, j1);
                    l1 = j1;
                }
                for (; l1 < akoz.length - 1; l1++)
                {
                    akoz[l1] = new koz();
                    kog1.a(akoz[l1]);
                    kog1.a();
                }

                akoz[l1] = new koz();
                kog1.a(akoz[l1]);
                j = akoz;
                break;

            case 74: // 'J'
                if (k == null)
                {
                    k = new koz();
                }
                kog1.a(k);
                break;

            case 90: // 'Z'
                int i2 = kou.b(kog1, 90);
                koz akoz1[];
                int k1;
                if (l == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = l.length;
                }
                akoz1 = new koz[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(l, 0, akoz1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < akoz1.length - 1; i2++)
                {
                    akoz1[i2] = new koz();
                    kog1.a(akoz1[i2]);
                    kog1.a();
                }

                akoz1[i2] = new koz();
                kog1.a(akoz1[i2]);
                l = akoz1;
                break;

            case 98: // 'b'
                m = kog1.j();
                break;

            case 242: 
                n = kog1.j();
                break;

            case 250: 
                o = kog1.j();
                break;

            case 258: 
                p = kog1.j();
                break;

            case 266: 
                q = kog1.j();
                break;

            case 274: 
                r = kog1.j();
                break;

            case 282: 
                s = kog1.j();
                break;

            case 602: 
                t = kog1.j();
                break;

            case 1482: 
                if (u == null)
                {
                    u = new koz();
                }
                kog1.a(u);
                break;

            case 2034: 
                v = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (c != null)
        {
            koh1.a(1, c);
        }
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (f != null)
        {
            koh1.a(4, f);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (h != null)
        {
            koh1.b(6, h);
        }
        if (i != null)
        {
            koh1.a(7, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                koz koz1 = j[i1];
                if (koz1 != null)
                {
                    koh1.b(8, koz1);
                }
            }

        }
        if (k != null)
        {
            koh1.b(9, k);
        }
        if (l != null && l.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < l.length; j1++)
            {
                koz koz2 = l[j1];
                if (koz2 != null)
                {
                    koh1.b(11, koz2);
                }
            }

        }
        if (m != null)
        {
            koh1.a(12, m);
        }
        if (n != null)
        {
            koh1.a(30, n);
        }
        if (o != null)
        {
            koh1.a(31, o);
        }
        if (p != null)
        {
            koh1.a(32, p);
        }
        if (q != null)
        {
            koh1.a(33, q);
        }
        if (r != null)
        {
            koh1.a(34, r);
        }
        if (s != null)
        {
            koh1.a(35, s);
        }
        if (t != null)
        {
            koh1.a(75, t);
        }
        if (u != null)
        {
            koh1.b(185, u);
        }
        if (v != null)
        {
            koh1.a(254, v);
        }
        super.writeTo(koh1);
    }

}
