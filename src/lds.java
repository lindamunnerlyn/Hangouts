// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class lds extends kud
    implements kvd
{

    private static volatile kve o = null;
    private static final lds q;
    private static volatile kvf r;
    private static final long serialVersionUID = 0L;
    private int d;
    private String e;
    private double f;
    private int g;
    private String h;
    private int i;
    private long j;
    private double k;
    private lca l;
    private boolean m;
    private kut n;
    private byte p;

    private lds(ktu ktu1, kty kty1)
    {
        boolean flag;
        p = -1;
        e = "";
        f = 0.0D;
        g = 0;
        h = "";
        i = 0;
        j = 0L;
        k = 0.0D;
        m = false;
        n = kvg.d();
        flag = false;
_L21:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = ktu1.a();
        i1;
        JVM INSTR lookupswitch 11: default 588
    //                   0: 591
    //                   97: 188
    //                   106: 251
    //                   168: 299
    //                   176: 321
    //                   185: 343
    //                   194: 365
    //                   203: 444
    //                   218: 490
    //                   240: 513
    //                   296: 536;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        if (!a(i1, ktu1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 2;
        f = ktu1.b();
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException(ktu1.a(this));
        ktu1;
        if (n.a())
        {
            n.b();
        }
        f();
        throw ktu1;
_L6:
        String s = ktu1.j();
        d = d | 8;
        h = s;
        continue; /* Loop/switch isn't completed */
        ktu1;
        throw new RuntimeException((new kuu(ktu1.getMessage())).a(this));
_L7:
        d = d | 0x10;
        i = ktu1.f();
        continue; /* Loop/switch isn't completed */
_L8:
        d = d | 0x20;
        j = ktu1.e();
        continue; /* Loop/switch isn't completed */
_L9:
        d = d | 0x40;
        k = ktu1.b();
        continue; /* Loop/switch isn't completed */
_L10:
        if ((d & 0x80) != 128) goto _L16; else goto _L15
_L15:
        Object obj = (lcc)l.h();
_L19:
        l = (lca)ktu1.a(lca.o(), kty1);
        if (obj == null) goto _L18; else goto _L17
_L17:
        ((lcc) (obj)).a(l);
        l = (lca)((lcc) (obj)).j();
_L18:
        d = d | 0x80;
        continue; /* Loop/switch isn't completed */
_L11:
        if (!n.a())
        {
            n = new kvg();
        }
        n.add(ktu1.a(25, ldu.k(), kty1));
        continue; /* Loop/switch isn't completed */
_L12:
        obj = ktu1.j();
        d = d | 1;
        e = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L13:
        d = d | 0x100;
        m = ktu1.i();
        continue; /* Loop/switch isn't completed */
_L14:
        d = d | 4;
        g = ktu1.f();
        continue; /* Loop/switch isn't completed */
_L2:
        if (n.a())
        {
            n.b();
        }
        f();
        return;
_L16:
        obj = null;
          goto _L19
_L4:
        flag = true;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public static lds k()
    {
        return q;
    }

    static lds l()
    {
        return q;
    }

    private boolean m()
    {
        return (d & 2) == 2;
    }

    public static ldt newBuilder()
    {
        return (ldt)q.h();
    }

    public static ldt newBuilder(lds lds1)
    {
        return (ldt)((ldt)q.h()).a(lds1);
    }

    private boolean o()
    {
        return (d & 0x80) == 128;
    }

    private lca p()
    {
        if (l == null)
        {
            return lca.o();
        } else
        {
            return l;
        }
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        boolean flag = false;
        ldo.a[i1 - 1];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 64
    //                   2 82
    //                   3 96
    //                   4 240
    //                   5 251
    //                   6 259
    //                   7 762
    //                   8 766;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        obj1 = new lds((ktu)obj, (kty)obj1);
_L11:
        return obj1;
_L3:
        return new lds(kuq.e, kty.a());
_L4:
        i1 = p;
        if (i1 == 1)
        {
            return q;
        }
        if (i1 == 0)
        {
            return null;
        }
        boolean flag1 = ((Boolean)obj).booleanValue();
        if (!m())
        {
            if (flag1)
            {
                p = 0;
            }
            return null;
        }
        if (o() && !p().E_())
        {
            if (flag1)
            {
                p = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < n.size(); i1++)
        {
            if (!((ldu)n.get(i1)).E_())
            {
                if (flag1)
                {
                    p = 0;
                }
                return null;
            }
        }

        if (flag1)
        {
            p = 1;
        }
        return q;
_L5:
        n.b();
        return null;
_L6:
        return new ldt();
_L7:
        obj1 = this;
        if (obj == q) goto _L11; else goto _L10
_L10:
        obj = (lds)obj;
        if ((((lds) (obj)).d & 1) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 1;
            e = ((lds) (obj)).e;
        }
        if (((lds) (obj)).m())
        {
            double d1 = ((lds) (obj)).f;
            d = d | 2;
            f = d1;
        }
        if ((((lds) (obj)).d & 4) == 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = ((lds) (obj)).g;
            d = d | 4;
            g = i1;
        }
        if ((((lds) (obj)).d & 8) == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 8;
            h = ((lds) (obj)).h;
        }
        if ((((lds) (obj)).d & 0x10) == 16)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = ((lds) (obj)).i;
            d = d | 0x10;
            i = i1;
        }
        if ((((lds) (obj)).d & 0x20) == 32)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            long l1 = ((lds) (obj)).j;
            d = d | 0x20;
            j = l1;
        }
        if ((((lds) (obj)).d & 0x40) == 64)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d2 = ((lds) (obj)).k;
            d = d | 0x40;
            k = d2;
        }
        if (((lds) (obj)).o())
        {
            obj1 = ((lds) (obj)).p();
            boolean flag2;
            if (l != null && l != lca.o())
            {
                l = (lca)((lcc)lca.newBuilder(l).a(((kud) (obj1)))).j();
            } else
            {
                l = ((lca) (obj1));
            }
            d = d | 0x80;
        }
        i1 = ((flag) ? 1 : 0);
        if ((((lds) (obj)).d & 0x100) == 256)
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            flag2 = ((lds) (obj)).m;
            d = d | 0x100;
            m = flag2;
        }
        if (!((lds) (obj)).n.isEmpty())
        {
            if (n.isEmpty())
            {
                n = ((lds) (obj)).n;
            } else
            {
                if (!n.a())
                {
                    n = a(((java.util.List) (n)));
                }
                n.addAll(((lds) (obj)).n);
            }
        }
        a(((lds) (obj)).b);
        return this;
_L8:
        return q;
_L9:
        if (r != null) goto _L13; else goto _L12
_L12:
        lds;
        JVM INSTR monitorenter ;
        if (r == null)
        {
            r = new kug(q);
        }
        lds;
        JVM INSTR monitorexit ;
_L13:
        return r;
        obj;
        lds;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(ktv ktv1)
    {
        if ((d & 2) == 2)
        {
            ktv1.a(12, f);
        }
        if ((d & 8) == 8)
        {
            ktv1.a(13, h);
        }
        if ((d & 0x10) == 16)
        {
            ktv1.a(21, i);
        }
        if ((d & 0x20) == 32)
        {
            ktv1.b(22, j);
        }
        if ((d & 0x40) == 64)
        {
            ktv1.a(23, k);
        }
        if ((d & 0x80) == 128)
        {
            ktv1.b(24, p());
        }
        for (int i1 = 0; i1 < n.size(); i1++)
        {
            ktv1.a(25, (kvb)n.get(i1));
        }

        if ((d & 1) == 1)
        {
            ktv1.a(27, e);
        }
        if ((d & 0x100) == 256)
        {
            ktv1.a(30, m);
        }
        if ((d & 4) == 4)
        {
            ktv1.a(37, g);
        }
        b.a(ktv1);
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
        if ((d & 2) == 2)
        {
            j1 = ktv.h(12) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((d & 8) == 8)
        {
            i1 = j1 + ktv.b(13, h);
        }
        j1 = i1;
        if ((d & 0x10) == 16)
        {
            j1 = i1 + ktv.c(21, i);
        }
        i1 = j1;
        if ((d & 0x20) == 32)
        {
            i1 = j1 + ktv.e(22, j);
        }
        j1 = i1;
        if ((d & 0x40) == 64)
        {
            j1 = i1 + ktv.h(23);
        }
        i1 = j1;
        if ((d & 0x80) == 128)
        {
            i1 = j1 + ktv.e(24, p());
        }
        for (j1 = ((flag) ? 1 : 0); j1 < n.size();)
        {
            int k1 = ktv.d(25, (kvb)n.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        j1 = i1;
        if ((d & 1) == 1)
        {
            j1 = i1 + ktv.b(27, e);
        }
        i1 = j1;
        if ((d & 0x100) == 256)
        {
            i1 = j1 + ktv.k(30);
        }
        j1 = i1;
        if ((d & 4) == 4)
        {
            j1 = i1 + ktv.c(37, g);
        }
        i1 = b.d() + j1;
        c = i1;
        return i1;
    }

    static 
    {
        q = new lds(kuq.e, kty.a());
    }
}
