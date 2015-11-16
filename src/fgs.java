// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class fgs extends fgh
{

    public long a;
    public long b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public fgt g[];
    public fgq h;
    public byte i[];
    public byte j[];
    public byte k[];
    public fgp l;
    public String m;
    public long n;
    public fgr q;
    public byte r[];
    public int s;
    public int t[];

    public fgs()
    {
        a = 0L;
        b = 0L;
        c = "";
        d = 0;
        e = 0;
        f = false;
        g = fgt.b();
        h = null;
        i = fgo.h;
        j = fgo.h;
        k = fgo.h;
        l = null;
        m = "";
        n = 0x2bf20L;
        q = null;
        r = fgo.h;
        s = 0;
        t = fgo.a;
        o = null;
        p = -1;
    }

    protected int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j1 = i1;
        if (a != 0L)
        {
            j1 = i1 + fgg.b(1, a);
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + fgg.b(2, c);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    fgt fgt1 = g[j1];
                    int k1 = i1;
                    if (fgt1 != null)
                    {
                        k1 = i1 + fgg.b(3, fgt1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!Arrays.equals(i, fgo.h))
        {
            i1 = j1 + fgg.b(6, i);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + fgg.b(7, l);
        }
        i1 = j1;
        if (!Arrays.equals(j, fgo.h))
        {
            i1 = j1 + fgg.b(8, j);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + fgg.b(9, h);
        }
        i1 = j1;
        if (f)
        {
            i1 = j1 + (fgg.c(10) + 1);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + fgg.b(11, d);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + fgg.b(12, e);
        }
        j1 = i1;
        if (!Arrays.equals(k, fgo.h))
        {
            j1 = i1 + fgg.b(13, k);
        }
        i1 = j1;
        if (!m.equals(""))
        {
            i1 = j1 + fgg.b(14, m);
        }
        j1 = i1;
        if (n != 0x2bf20L)
        {
            long l2 = n;
            j1 = fgg.c(15);
            j1 = i1 + (fgg.b(fgg.c(l2)) + j1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + fgg.b(16, q);
        }
        j1 = i1;
        if (b != 0L)
        {
            j1 = i1 + fgg.b(17, b);
        }
        int l1 = j1;
        if (!Arrays.equals(r, fgo.h))
        {
            l1 = j1 + fgg.b(18, r);
        }
        i1 = l1;
        if (s != 0)
        {
            i1 = l1 + fgg.b(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
                {
                    i2 += fgg.b(t[j1]);
                }

                j1 = i1 + i2 + t.length * 2;
            }
        }
        return j1;
    }

    public fgm a(fgf fgf1)
    {
_L22:
        int i1 = fgf1.a();
        i1;
        JVM INSTR lookupswitch 20: default 176
    //                   0: 185
    //                   8: 187
    //                   18: 198
    //                   26: 209
    //                   50: 333
    //                   58: 344
    //                   66: 373
    //                   74: 384
    //                   80: 413
    //                   88: 424
    //                   96: 435
    //                   106: 446
    //                   114: 457
    //                   120: 468
    //                   130: 479
    //                   136: 508
    //                   146: 519
    //                   152: 530
    //                   160: 575
    //                   162: 677;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        if (a(fgf1, i1)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        a = fgf1.d();
          goto _L22
_L4:
        c = fgf1.g();
          goto _L22
_L5:
        int j2 = fgo.a(fgf1, 26);
        fgt afgt[];
        int j1;
        if (g == null)
        {
            j1 = 0;
        } else
        {
            j1 = g.length;
        }
        afgt = new fgt[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(g, 0, afgt, 0, j1);
            j2 = j1;
        }
        for (; j2 < afgt.length - 1; j2++)
        {
            afgt[j2] = new fgt();
            fgf1.a(afgt[j2]);
            fgf1.a();
        }

        afgt[j2] = new fgt();
        fgf1.a(afgt[j2]);
        g = afgt;
          goto _L22
_L6:
        i = fgf1.h();
          goto _L22
_L7:
        if (l == null)
        {
            l = new fgp();
        }
        fgf1.a(l);
          goto _L22
_L8:
        j = fgf1.h();
          goto _L22
_L9:
        if (h == null)
        {
            h = new fgq();
        }
        fgf1.a(h);
          goto _L22
_L10:
        f = fgf1.f();
          goto _L22
_L11:
        d = fgf1.e();
          goto _L22
_L12:
        e = fgf1.e();
          goto _L22
_L13:
        k = fgf1.h();
          goto _L22
_L14:
        m = fgf1.g();
          goto _L22
_L15:
        n = fgf1.j();
          goto _L22
_L16:
        if (q == null)
        {
            q = new fgr();
        }
        fgf1.a(q);
          goto _L22
_L17:
        b = fgf1.d();
          goto _L22
_L18:
        r = fgf1.h();
          goto _L22
_L19:
        int k1 = fgf1.e();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            s = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = fgo.a(fgf1, 160);
        int ai[];
        int l1;
        if (t == null)
        {
            l1 = 0;
        } else
        {
            l1 = t.length;
        }
        ai = new int[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(t, 0, ai, 0, l1);
            k2 = l1;
        }
        for (; k2 < ai.length - 1; k2++)
        {
            ai[k2] = fgf1.e();
            fgf1.a();
        }

        ai[k2] = fgf1.e();
        t = ai;
        continue; /* Loop/switch isn't completed */
_L21:
        int i3 = fgf1.c(fgf1.k());
        int i2 = fgf1.m();
        int l2;
        for (l2 = 0; fgf1.l() > 0; l2++)
        {
            fgf1.e();
        }

        fgf1.e(i2);
        int ai1[];
        if (t == null)
        {
            i2 = 0;
        } else
        {
            i2 = t.length;
        }
        ai1 = new int[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(t, 0, ai1, 0, i2);
            l2 = i2;
        }
        for (; l2 < ai1.length; l2++)
        {
            ai1[l2] = fgf1.e();
        }

        t = ai1;
        fgf1.d(i3);
        if (true) goto _L22; else goto _L23
_L23:
    }

    public void a(fgg fgg1)
    {
        boolean flag = false;
        if (a != 0L)
        {
            fgg1.a(1, a);
        }
        if (!c.equals(""))
        {
            fgg1.a(2, c);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                fgt fgt1 = g[i1];
                if (fgt1 != null)
                {
                    fgg1.a(3, fgt1);
                }
            }

        }
        if (!Arrays.equals(i, fgo.h))
        {
            fgg1.a(6, i);
        }
        if (l != null)
        {
            fgg1.a(7, l);
        }
        if (!Arrays.equals(j, fgo.h))
        {
            fgg1.a(8, j);
        }
        if (h != null)
        {
            fgg1.a(9, h);
        }
        if (f)
        {
            fgg1.a(10, f);
        }
        if (d != 0)
        {
            fgg1.a(11, d);
        }
        if (e != 0)
        {
            fgg1.a(12, e);
        }
        if (!Arrays.equals(k, fgo.h))
        {
            fgg1.a(13, k);
        }
        if (!m.equals(""))
        {
            fgg1.a(14, m);
        }
        if (n != 0x2bf20L)
        {
            fgg1.a(n);
        }
        if (q != null)
        {
            fgg1.a(16, q);
        }
        if (b != 0L)
        {
            fgg1.a(17, b);
        }
        if (!Arrays.equals(r, fgo.h))
        {
            fgg1.a(18, r);
        }
        if (s != 0)
        {
            fgg1.a(19, s);
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                fgg1.a(20, t[j1]);
            }

        }
        super.a(fgg1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof fgs)) goto _L4; else goto _L3
_L3:
        obj = (fgs)obj;
        flag = flag1;
        if (a != ((fgs) (obj)).a) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (b != ((fgs) (obj)).b) goto _L4; else goto _L6
_L6:
        if (c != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((fgs) (obj)).c != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (d != ((fgs) (obj)).d) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (e != ((fgs) (obj)).e) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (f != ((fgs) (obj)).f) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!fgk.a(g, ((fgs) (obj)).g)) goto _L4; else goto _L13
_L13:
        if (h != null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (((fgs) (obj)).h != null) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(i, ((fgs) (obj)).i)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(j, ((fgs) (obj)).j)) goto _L4; else goto _L18
_L18:
        flag = flag1;
        if (!Arrays.equals(k, ((fgs) (obj)).k)) goto _L4; else goto _L19
_L19:
        if (l != null) goto _L21; else goto _L20
_L20:
        flag = flag1;
        if (((fgs) (obj)).l != null) goto _L4; else goto _L22
_L22:
        if (m != null) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (((fgs) (obj)).m != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (n != ((fgs) (obj)).n) goto _L4; else goto _L26
_L26:
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        flag = flag1;
        if (((fgs) (obj)).q != null) goto _L4; else goto _L27
_L27:
        flag = flag1;
        if (Arrays.equals(r, ((fgs) (obj)).r))
        {
            flag = flag1;
            if (s == ((fgs) (obj)).s)
            {
                flag = flag1;
                if (fgk.a(t, ((fgs) (obj)).t))
                {
                    return a(((fgh) (obj)));
                }
            }
        }
          goto _L4
_L8:
        if (!c.equals(((fgs) (obj)).c))
        {
            return false;
        }
          goto _L9
_L15:
        if (!h.equals(((fgs) (obj)).h))
        {
            return false;
        }
          goto _L16
_L21:
        if (!l.equals(((fgs) (obj)).l))
        {
            return false;
        }
          goto _L22
_L24:
        if (!m.equals(((fgs) (obj)).m))
        {
            return false;
        }
          goto _L25
        if (!q.equals(((fgs) (obj)).q))
        {
            return false;
        }
          goto _L27
    }

    public int hashCode()
    {
        int i2 = 0;
        int j2 = (int)(a ^ a >>> 32);
        int k2 = (int)(b ^ b >>> 32);
        int i1;
        char c1;
        int j1;
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.hashCode();
        }
        l2 = d;
        i3 = e;
        if (f)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        j3 = fgk.a(g);
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.hashCode();
        }
        k3 = Arrays.hashCode(i);
        l3 = Arrays.hashCode(j);
        i4 = Arrays.hashCode(k);
        if (l == null)
        {
            k1 = 0;
        } else
        {
            k1 = l.hashCode();
        }
        if (m == null)
        {
            l1 = 0;
        } else
        {
            l1 = m.hashCode();
        }
        j4 = (int)(n ^ n >>> 32);
        if (q != null)
        {
            i2 = q.hashCode();
        }
        return ((((((l1 + (k1 + ((((j1 + ((c1 + (((i1 + ((j2 + 527) * 31 + k2) * 31) * 31 + l2) * 31 + i3) * 31) * 31 + j3) * 31) * 31 + k3) * 31 + l3) * 31 + i4) * 31) * 31) * 31 + j4) * 31 + i2) * 31 + Arrays.hashCode(r)) * 31 + s) * 31 + fgk.a(t)) * 31 + c();
    }
}
