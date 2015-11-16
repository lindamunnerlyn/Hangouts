// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kvl extends kma
    implements kna
{

    public static final kmi d;
    private static final long serialVersionUID = 0L;
    private static volatile knb w = null;
    private static final kvl y;
    private static volatile knc z;
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
    private kmq v;
    private byte x;

    private kvl(klr klr1, klv klv1)
    {
        kns kns1;
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
        v = knd.d();
        kns1 = knr.newBuilder();
_L23:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = klr1.a();
        i1;
        JVM INSTR lookupswitch 18: default 827
    //                   0: 830
    //                   9: 292
    //                   17: 359
    //                   75: 404
    //                   113: 450
    //                   121: 471
    //                   128: 493
    //                   137: 515
    //                   146: 537
    //                   153: 564
    //                   161: 587
    //                   208: 610
    //                   249: 633
    //                   257: 656
    //                   264: 678
    //                   272: 701
    //                   282: 748
    //                   288: 775;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L3:
        if (!kns1.a(i1, klr1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = e | 1;
        f = klr1.g();
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException(klr1.a(this));
        klr1;
        if (v.a())
        {
            v.b();
        }
        b = kns1.a();
        throw klr1;
_L6:
        e = e | 2;
        g = klr1.g();
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException((new kmr(klr1.getMessage())).a(this));
_L7:
        if (!v.a())
        {
            v = new knd();
        }
        v.add(klr1.a(9, kvn.j(), klv1));
        continue; /* Loop/switch isn't completed */
_L8:
        e = e | 4;
        h = klr1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        e = e | 8;
        i = klr1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        e = e | 0x10;
        j = klr1.f();
        continue; /* Loop/switch isn't completed */
_L11:
        e = e | 0x40;
        l = klr1.b();
        continue; /* Loop/switch isn't completed */
_L12:
        String s1 = klr1.j();
        e = e | 0x80;
        m = s1;
        continue; /* Loop/switch isn't completed */
_L13:
        e = e | 0x100;
        n = klr1.b();
        continue; /* Loop/switch isn't completed */
_L14:
        e = e | 0x200;
        o = klr1.b();
        continue; /* Loop/switch isn't completed */
_L15:
        e = e | 0x800;
        q = klr1.i();
        continue; /* Loop/switch isn't completed */
_L16:
        e = e | 0x400;
        p = klr1.b();
        continue; /* Loop/switch isn't completed */
_L17:
        e = e | 0x20;
        k = klr1.b();
        continue; /* Loop/switch isn't completed */
_L18:
        e = e | 0x1000;
        r = klr1.i();
        continue; /* Loop/switch isn't completed */
_L19:
        i1 = klr1.n();
        if (kvt.a(i1) == null)
        {
            kns1.a(34, i1);
            continue; /* Loop/switch isn't completed */
        }
        e = e | 0x2000;
        s = i1;
        continue; /* Loop/switch isn't completed */
_L20:
        String s2 = klr1.j();
        e = e | 0x4000;
        t = s2;
        continue; /* Loop/switch isn't completed */
_L21:
        e = e | 0x8000;
        u = klr1.i();
        continue; /* Loop/switch isn't completed */
_L2:
        if (v.a())
        {
            v.b();
        }
        b = kns1.a();
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

    static void a(kvl kvl1, double d1)
    {
        kvl1.a(d1);
    }

    static void a(kvl kvl1, long l1)
    {
        kvl1.a(l1);
    }

    static void a(kvl kvl1, String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException();
        } else
        {
            kvl1.e = kvl1.e | 0x80;
            kvl1.m = s1;
            return;
        }
    }

    private void b(long l1)
    {
        e = e | 2;
        g = l1;
    }

    static void b(kvl kvl1, long l1)
    {
        kvl1.b(l1);
    }

    private void c(long l1)
    {
        e = e | 4;
        h = l1;
    }

    static void c(kvl kvl1, long l1)
    {
        kvl1.c(0L);
    }

    public static kvm newBuilder()
    {
        return (kvm)y.g();
    }

    public static kvm newBuilder(kvl kvl1)
    {
        return (kvm)((kvm)y.g()).a(kvl1);
    }

    static kvl p()
    {
        return y;
    }

    private boolean q()
    {
        return (e & 1) == 1;
    }

    private boolean r()
    {
        return (e & 2) == 2;
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        boolean flag = false;
        kvk.a[i1 - 1];
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
        obj1 = new kvl((klr)obj, (klv)obj1);
_L11:
        return obj1;
_L3:
        return new kvl(kmn.e, klv.a());
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
        if (!q())
        {
            if (flag1)
            {
                x = 0;
            }
            return null;
        }
        if (!r())
        {
            if (flag1)
            {
                x = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < v.size(); i1++)
        {
            if (!((kvn)v.get(i1)).C_())
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
        return new kvm();
_L7:
        obj1 = this;
        if (obj == y) goto _L11; else goto _L10
_L10:
        kvl kvl1 = (kvl)obj;
        if (kvl1.q())
        {
            a(kvl1.j());
        }
        if (kvl1.r())
        {
            b(kvl1.g);
        }
        if ((kvl1.e & 4) == 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            c(kvl1.k());
        }
        if ((kvl1.e & 8) == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            long l1 = kvl1.i;
            e = e | 8;
            i = l1;
        }
        if ((kvl1.e & 0x10) == 16)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = kvl1.j;
            e = e | 0x10;
            j = i1;
        }
        if ((kvl1.e & 0x20) == 32)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d1 = kvl1.k;
            e = e | 0x20;
            k = d1;
        }
        if ((kvl1.e & 0x40) == 64)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d2 = kvl1.l;
            e = e | 0x40;
            l = d2;
        }
        if ((kvl1.e & 0x80) == 128)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            e = e | 0x80;
            m = kvl1.m;
        }
        if ((kvl1.e & 0x100) == 256)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            a(kvl1.n());
        }
        if ((kvl1.e & 0x200) == 512)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d3 = kvl1.o();
            e = e | 0x200;
            o = d3;
        }
        if ((kvl1.e & 0x400) == 1024)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d4 = kvl1.p;
            e = e | 0x400;
            p = d4;
        }
        if ((kvl1.e & 0x800) == 2048)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            boolean flag2 = kvl1.q;
            e = e | 0x800;
            q = flag2;
        }
        if ((kvl1.e & 0x1000) == 4096)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            boolean flag3 = kvl1.r;
            e = e | 0x1000;
            r = flag3;
        }
        if ((kvl1.e & 0x2000) == 8192)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            obj1 = kvt.a(kvl1.s);
            obj = obj1;
            if (obj1 == null)
            {
                obj = kvt.a;
            }
            if (obj == null)
            {
                throw new NullPointerException();
            }
            e = e | 0x2000;
            s = ((kvt) (obj)).e;
        }
        if ((kvl1.e & 0x4000) == 16384)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            e = e | 0x4000;
            t = kvl1.t;
        }
        i1 = ((flag) ? 1 : 0);
        if ((kvl1.e & 0x8000) == 32768)
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            boolean flag4 = kvl1.u;
            e = e | 0x8000;
            u = flag4;
        }
        if (!kvl1.v.isEmpty())
        {
            if (v.isEmpty())
            {
                v = kvl1.v;
            } else
            {
                if (!v.a())
                {
                    v = a(((java.util.List) (v)));
                }
                v.addAll(kvl1.v);
            }
        }
        a(kvl1.b);
        return this;
_L8:
        return y;
_L9:
        if (z != null) goto _L13; else goto _L12
_L12:
        kvl;
        JVM INSTR monitorenter ;
        if (z == null)
        {
            z = new kmd(y);
        }
        kvl;
        JVM INSTR monitorexit ;
_L13:
        return z;
        obj;
        kvl;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(kls kls1)
    {
        if ((e & 1) == 1)
        {
            kls1.c(1, f);
        }
        if ((e & 2) == 2)
        {
            kls1.c(2, g);
        }
        for (int i1 = 0; i1 < v.size(); i1++)
        {
            kls1.a(9, (kmy)v.get(i1));
        }

        if ((e & 4) == 4)
        {
            kls1.c(14, h);
        }
        if ((e & 8) == 8)
        {
            kls1.c(15, i);
        }
        if ((e & 0x10) == 16)
        {
            kls1.a(16, j);
        }
        if ((e & 0x40) == 64)
        {
            kls1.a(17, l);
        }
        if ((e & 0x80) == 128)
        {
            kls1.a(18, l());
        }
        if ((e & 0x100) == 256)
        {
            kls1.a(19, n);
        }
        if ((e & 0x200) == 512)
        {
            kls1.a(20, o);
        }
        if ((e & 0x800) == 2048)
        {
            kls1.a(26, q);
        }
        if ((e & 0x400) == 1024)
        {
            kls1.a(31, p);
        }
        if ((e & 0x20) == 32)
        {
            kls1.a(32, k);
        }
        if ((e & 0x1000) == 4096)
        {
            kls1.a(33, r);
        }
        if ((e & 0x2000) == 8192)
        {
            kls1.a(s);
        }
        if ((e & 0x4000) == 16384)
        {
            kls1.a(35, t);
        }
        if ((e & 0x8000) == 32768)
        {
            kls1.a(36, u);
        }
        b.a(kls1);
    }

    public long j()
    {
        return f;
    }

    public long k()
    {
        return h;
    }

    public String l()
    {
        return m;
    }

    public int m()
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
            i1 = kls.i(1) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if ((e & 2) == 2)
        {
            j1 = i1 + kls.i(2);
        }
        i1 = j1;
        for (j1 = ((flag) ? 1 : 0); j1 < v.size();)
        {
            int k1 = kls.d(9, (kmy)v.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        j1 = i1;
        if ((e & 4) == 4)
        {
            j1 = i1 + kls.i(14);
        }
        i1 = j1;
        if ((e & 8) == 8)
        {
            i1 = j1 + kls.i(15);
        }
        j1 = i1;
        if ((e & 0x10) == 16)
        {
            j1 = i1 + kls.c(16, j);
        }
        i1 = j1;
        if ((e & 0x40) == 64)
        {
            i1 = j1 + kls.h(17);
        }
        j1 = i1;
        if ((e & 0x80) == 128)
        {
            j1 = i1 + kls.b(18, l());
        }
        i1 = j1;
        if ((e & 0x100) == 256)
        {
            i1 = j1 + kls.h(19);
        }
        j1 = i1;
        if ((e & 0x200) == 512)
        {
            j1 = i1 + kls.h(20);
        }
        i1 = j1;
        if ((e & 0x800) == 2048)
        {
            i1 = j1 + kls.k(26);
        }
        j1 = i1;
        if ((e & 0x400) == 1024)
        {
            j1 = i1 + kls.h(31);
        }
        i1 = j1;
        if ((e & 0x20) == 32)
        {
            i1 = j1 + kls.h(32);
        }
        j1 = i1;
        if ((e & 0x1000) == 4096)
        {
            j1 = i1 + kls.k(33);
        }
        i1 = j1;
        if ((e & 0x2000) == 8192)
        {
            i1 = j1 + kls.l(s);
        }
        j1 = i1;
        if ((e & 0x4000) == 16384)
        {
            j1 = i1 + kls.b(35, t);
        }
        i1 = j1;
        if ((e & 0x8000) == 32768)
        {
            i1 = j1 + kls.k(36);
        }
        i1 = b.b() + i1;
        c = i1;
        return i1;
    }

    public double n()
    {
        return n;
    }

    public double o()
    {
        return o;
    }

    static 
    {
        y = new kvl(kmn.e, klv.a());
        d = new kmi(ktx.n(), y, y, new kmh(null, 0x5cb87e, knw.k));
    }
}
