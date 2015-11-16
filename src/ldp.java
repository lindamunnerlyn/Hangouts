// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class ldp extends kud
    implements kvd
{

    public static final kul d;
    private static final long serialVersionUID = 0L;
    private static volatile kve w = null;
    private static final ldp y;
    private static volatile kvf z;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private int j;
    private double k;
    private double l;
    private String m;
    private double n;
    private double o;
    private double p;
    private boolean q;
    private boolean r;
    private int s;
    private String t;
    private boolean u;
    private kut v;
    private byte x;

    private ldp(ktu ktu1, kty kty1)
    {
        boolean flag;
        flag = false;
        super();
        x = -1;
        f = 0L;
        g = 0L;
        h = 0L;
        i = 0L;
        j = 1;
        k = 0.0D;
        l = 1024D;
        m = "";
        n = 0.0D;
        o = 0.0D;
        p = 0.0D;
        q = false;
        r = false;
        s = 0;
        t = "";
        u = false;
        v = kvg.d();
_L23:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = ktu1.a();
        i1;
        JVM INSTR lookupswitch 18: default 810
    //                   0: 813
    //                   9: 288
    //                   17: 351
    //                   75: 396
    //                   113: 442
    //                   121: 463
    //                   128: 485
    //                   137: 507
    //                   146: 529
    //                   153: 554
    //                   161: 577
    //                   208: 600
    //                   249: 623
    //                   257: 646
    //                   264: 668
    //                   272: 691
    //                   282: 737
    //                   288: 762;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L3:
        if (!a(i1, ktu1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = e | 1;
        f = ktu1.g();
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException(ktu1.a(this));
        ktu1;
        if (v.a())
        {
            v.b();
        }
        f();
        throw ktu1;
_L6:
        e = e | 2;
        g = ktu1.g();
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException((new kuu(ktu1.getMessage())).a(this));
_L7:
        if (!v.a())
        {
            v = new kvg();
        }
        v.add(ktu1.a(9, ldr.k(), kty1));
        continue; /* Loop/switch isn't completed */
_L8:
        e = e | 4;
        h = ktu1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        e = e | 8;
        i = ktu1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        e = e | 0x10;
        j = ktu1.f();
        continue; /* Loop/switch isn't completed */
_L11:
        e = e | 0x40;
        l = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L12:
        String s1 = ktu1.j();
        e = e | 0x80;
        m = s1;
        continue; /* Loop/switch isn't completed */
_L13:
        e = e | 0x100;
        n = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L14:
        e = e | 0x200;
        o = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L15:
        e = e | 0x800;
        q = ktu1.i();
        continue; /* Loop/switch isn't completed */
_L16:
        e = e | 0x400;
        p = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L17:
        e = e | 0x20;
        k = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L18:
        e = e | 0x1000;
        r = ktu1.i();
        continue; /* Loop/switch isn't completed */
_L19:
        i1 = ktu1.n();
        if (ldx.a(i1) == null)
        {
            super.a(34, i1);
            continue; /* Loop/switch isn't completed */
        }
        e = e | 0x2000;
        s = i1;
        continue; /* Loop/switch isn't completed */
_L20:
        String s2 = ktu1.j();
        e = e | 0x4000;
        t = s2;
        continue; /* Loop/switch isn't completed */
_L21:
        e = e | 0x8000;
        u = ktu1.i();
        continue; /* Loop/switch isn't completed */
_L2:
        if (v.a())
        {
            v.b();
        }
        f();
        return;
_L4:
        flag = true;
        if (true) goto _L23; else goto _L22
_L22:
    }

    private void a(double d1)
    {
        e = e | 0x100;
        n = d1;
    }

    private void a(long l1)
    {
        e = e | 1;
        f = l1;
    }

    static void a(ldp ldp1, double d1)
    {
        ldp1.a(d1);
    }

    static void a(ldp ldp1, long l1)
    {
        ldp1.a(l1);
    }

    static void a(ldp ldp1, String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            ldp1.e = ldp1.e | 0x80;
            ldp1.m = s1;
            return;
        }
    }

    private void b(long l1)
    {
        e = e | 2;
        g = l1;
    }

    static void b(ldp ldp1, long l1)
    {
        ldp1.b(l1);
    }

    private void c(long l1)
    {
        e = e | 4;
        h = l1;
    }

    static void c(ldp ldp1, long l1)
    {
        ldp1.c(0L);
    }

    public static ldq newBuilder()
    {
        return (ldq)y.h();
    }

    public static ldq newBuilder(ldp ldp1)
    {
        return (ldq)((ldq)y.h()).a(ldp1);
    }

    static ldp q()
    {
        return y;
    }

    private boolean r()
    {
        return (e & 1) == 1;
    }

    private boolean s()
    {
        return (e & 2) == 2;
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        boolean flag = false;
        ldo.a[i1 - 1];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 64
    //                   2 82
    //                   3 96
    //                   4 230
    //                   5 241
    //                   6 249
    //                   7 1061
    //                   8 1065;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        obj1 = new ldp((ktu)obj, (kty)obj1);
_L11:
        return obj1;
_L3:
        return new ldp(kuq.e, kty.a());
_L4:
        i1 = x;
        if (i1 == 1)
        {
            return y;
        }
        if (i1 == 0)
        {
            return null;
        }
        boolean flag1 = ((Boolean)obj).booleanValue();
        if (!r())
        {
            if (flag1)
            {
                x = 0;
            }
            return null;
        }
        if (!s())
        {
            if (flag1)
            {
                x = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < v.size(); i1++)
        {
            if (!((ldr)v.get(i1)).E_())
            {
                if (flag1)
                {
                    x = 0;
                }
                return null;
            }
        }

        if (flag1)
        {
            x = 1;
        }
        return y;
_L5:
        v.b();
        return null;
_L6:
        return new ldq();
_L7:
        obj1 = this;
        if (obj == y) goto _L11; else goto _L10
_L10:
        ldp ldp1 = (ldp)obj;
        if (ldp1.r())
        {
            a(ldp1.k());
        }
        if (ldp1.s())
        {
            b(ldp1.g);
        }
        if ((ldp1.e & 4) == 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            c(ldp1.l());
        }
        if ((ldp1.e & 8) == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            long l1 = ldp1.i;
            e = e | 8;
            i = l1;
        }
        if ((ldp1.e & 0x10) == 16)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = ldp1.j;
            e = e | 0x10;
            j = i1;
        }
        if ((ldp1.e & 0x20) == 32)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d1 = ldp1.k;
            e = e | 0x20;
            k = d1;
        }
        if ((ldp1.e & 0x40) == 64)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d2 = ldp1.l;
            e = e | 0x40;
            l = d2;
        }
        if ((ldp1.e & 0x80) == 128)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            e = e | 0x80;
            m = ldp1.m;
        }
        if ((ldp1.e & 0x100) == 256)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            a(ldp1.o());
        }
        if ((ldp1.e & 0x200) == 512)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d3 = ldp1.p();
            e = e | 0x200;
            o = d3;
        }
        if ((ldp1.e & 0x400) == 1024)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d4 = ldp1.p;
            e = e | 0x400;
            p = d4;
        }
        if ((ldp1.e & 0x800) == 2048)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            boolean flag2 = ldp1.q;
            e = e | 0x800;
            q = flag2;
        }
        if ((ldp1.e & 0x1000) == 4096)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            boolean flag3 = ldp1.r;
            e = e | 0x1000;
            r = flag3;
        }
        if ((ldp1.e & 0x2000) == 8192)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            obj1 = ldx.a(ldp1.s);
            obj = obj1;
            if (obj1 == null)
            {
                obj = ldx.a;
            }
            if (obj == null)
            {
                throw new NullPointerException();
            }
            e = e | 0x2000;
            s = ((ldx) (obj)).e;
        }
        if ((ldp1.e & 0x4000) == 16384)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            e = e | 0x4000;
            t = ldp1.t;
        }
        i1 = ((flag) ? 1 : 0);
        if ((ldp1.e & 0x8000) == 32768)
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            boolean flag4 = ldp1.u;
            e = e | 0x8000;
            u = flag4;
        }
        if (!ldp1.v.isEmpty())
        {
            if (v.isEmpty())
            {
                v = ldp1.v;
            } else
            {
                if (!v.a())
                {
                    v = a(((java.util.List) (v)));
                }
                v.addAll(ldp1.v);
            }
        }
        a(ldp1.b);
        return this;
_L8:
        return y;
_L9:
        if (z != null) goto _L13; else goto _L12
_L12:
        ldp;
        JVM INSTR monitorenter ;
        if (z == null)
        {
            z = new kug(y);
        }
        ldp;
        JVM INSTR monitorexit ;
_L13:
        return z;
        obj;
        ldp;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(ktv ktv1)
    {
        if ((e & 1) == 1)
        {
            ktv1.c(1, f);
        }
        if ((e & 2) == 2)
        {
            ktv1.c(2, g);
        }
        for (int i1 = 0; i1 < v.size(); i1++)
        {
            ktv1.a(9, (kvb)v.get(i1));
        }

        if ((e & 4) == 4)
        {
            ktv1.c(14, h);
        }
        if ((e & 8) == 8)
        {
            ktv1.c(15, i);
        }
        if ((e & 0x10) == 16)
        {
            ktv1.a(16, j);
        }
        if ((e & 0x40) == 64)
        {
            ktv1.a(17, l);
        }
        if ((e & 0x80) == 128)
        {
            ktv1.a(18, m());
        }
        if ((e & 0x100) == 256)
        {
            ktv1.a(19, n);
        }
        if ((e & 0x200) == 512)
        {
            ktv1.a(20, o);
        }
        if ((e & 0x800) == 2048)
        {
            ktv1.a(26, q);
        }
        if ((e & 0x400) == 1024)
        {
            ktv1.a(31, p);
        }
        if ((e & 0x20) == 32)
        {
            ktv1.a(32, k);
        }
        if ((e & 0x1000) == 4096)
        {
            ktv1.a(33, r);
        }
        if ((e & 0x2000) == 8192)
        {
            ktv1.a(s);
        }
        if ((e & 0x4000) == 16384)
        {
            ktv1.a(35, t);
        }
        if ((e & 0x8000) == 32768)
        {
            ktv1.a(36, u);
        }
        b.a(ktv1);
    }

    public long k()
    {
        return f;
    }

    public long l()
    {
        return h;
    }

    public String m()
    {
        return m;
    }

    public int n()
    {
        boolean flag = false;
        int i1 = c;
        if (i1 != -1)
        {
            return i1;
        }
        int j1;
        if ((e & 1) == 1)
        {
            i1 = ktv.i(1) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((e & 2) == 2)
        {
            j1 = i1 + ktv.i(2);
        }
        i1 = j1;
        for (j1 = ((flag) ? 1 : 0); j1 < v.size();)
        {
            int k1 = ktv.d(9, (kvb)v.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        j1 = i1;
        if ((e & 4) == 4)
        {
            j1 = i1 + ktv.i(14);
        }
        i1 = j1;
        if ((e & 8) == 8)
        {
            i1 = j1 + ktv.i(15);
        }
        j1 = i1;
        if ((e & 0x10) == 16)
        {
            j1 = i1 + ktv.c(16, j);
        }
        i1 = j1;
        if ((e & 0x40) == 64)
        {
            i1 = j1 + ktv.h(17);
        }
        j1 = i1;
        if ((e & 0x80) == 128)
        {
            j1 = i1 + ktv.b(18, m());
        }
        i1 = j1;
        if ((e & 0x100) == 256)
        {
            i1 = j1 + ktv.h(19);
        }
        j1 = i1;
        if ((e & 0x200) == 512)
        {
            j1 = i1 + ktv.h(20);
        }
        i1 = j1;
        if ((e & 0x800) == 2048)
        {
            i1 = j1 + ktv.k(26);
        }
        j1 = i1;
        if ((e & 0x400) == 1024)
        {
            j1 = i1 + ktv.h(31);
        }
        i1 = j1;
        if ((e & 0x20) == 32)
        {
            i1 = j1 + ktv.h(32);
        }
        j1 = i1;
        if ((e & 0x1000) == 4096)
        {
            j1 = i1 + ktv.k(33);
        }
        i1 = j1;
        if ((e & 0x2000) == 8192)
        {
            i1 = j1 + ktv.l(s);
        }
        j1 = i1;
        if ((e & 0x4000) == 16384)
        {
            j1 = i1 + ktv.b(35, t);
        }
        i1 = j1;
        if ((e & 0x8000) == 32768)
        {
            i1 = j1 + ktv.k(36);
        }
        i1 = b.d() + i1;
        c = i1;
        return i1;
    }

    public double o()
    {
        return n;
    }

    public double p()
    {
        return o;
    }

    static 
    {
        y = new ldp(kuq.e, kty.a());
        d = new kul(lca.o(), y, y, new kuk(null, 0x5cb87e, kvz.k));
    }
}
