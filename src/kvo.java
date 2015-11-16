// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kvo extends kma
    implements kna
{

    private static volatile knb o = null;
    private static final kvo q;
    private static volatile knc r;
    private static final long serialVersionUID = 0L;
    private int d;
    private String e;
    private double f;
    private int g;
    private String h;
    private int i;
    private long j;
    private double k;
    private ktx l;
    private boolean m;
    private kmq n;
    private byte p;

    private kvo(klr klr1, klv klv1)
    {
        kns kns1;
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
        n = knd.d();
        kns1 = knr.newBuilder();
        flag = false;
_L21:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = klr1.a();
        i1;
        JVM INSTR lookupswitch 11: default 603
    //                   0: 606
    //                   97: 193
    //                   106: 261
    //                   168: 309
    //                   176: 331
    //                   185: 353
    //                   194: 375
    //                   203: 454
    //                   218: 500
    //                   240: 523
    //                   296: 546;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        if (!kns1.a(i1, klr1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = d | 2;
        f = klr1.b();
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException(klr1.a(this));
        klr1;
        if (n.a())
        {
            n.b();
        }
        b = kns1.a();
        throw klr1;
_L6:
        String s = klr1.j();
        d = d | 8;
        h = s;
        continue; /* Loop/switch isn't completed */
        klr1;
        throw new RuntimeException((new kmr(klr1.getMessage())).a(this));
_L7:
        d = d | 0x10;
        i = klr1.f();
        continue; /* Loop/switch isn't completed */
_L8:
        d = d | 0x20;
        j = klr1.e();
        continue; /* Loop/switch isn't completed */
_L9:
        d = d | 0x40;
        k = klr1.b();
        continue; /* Loop/switch isn't completed */
_L10:
        if ((d & 0x80) != 128) goto _L16; else goto _L15
_L15:
        Object obj = (ktz)l.g();
_L19:
        l = (ktx)klr1.a(ktx.n(), klv1);
        if (obj == null) goto _L18; else goto _L17
_L17:
        ((ktz) (obj)).a(l);
        l = (ktx)((ktz) (obj)).j();
_L18:
        d = d | 0x80;
        continue; /* Loop/switch isn't completed */
_L11:
        if (!n.a())
        {
            n = new knd();
        }
        n.add(klr1.a(25, kvq.j(), klv1));
        continue; /* Loop/switch isn't completed */
_L12:
        obj = klr1.j();
        d = d | 1;
        e = ((String) (obj));
        continue; /* Loop/switch isn't completed */
_L13:
        d = d | 0x100;
        m = klr1.i();
        continue; /* Loop/switch isn't completed */
_L14:
        d = d | 4;
        g = klr1.f();
        continue; /* Loop/switch isn't completed */
_L2:
        if (n.a())
        {
            n.b();
        }
        b = kns1.a();
        return;
_L16:
        obj = null;
          goto _L19
_L4:
        flag = true;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public static kvo j()
    {
        return q;
    }

    static kvo k()
    {
        return q;
    }

    private boolean l()
    {
        return (d & 2) == 2;
    }

    private boolean n()
    {
        return (d & 0x80) == 128;
    }

    public static kvp newBuilder()
    {
        return (kvp)q.g();
    }

    public static kvp newBuilder(kvo kvo1)
    {
        return (kvp)((kvp)q.g()).a(kvo1);
    }

    private ktx o()
    {
        if (l == null)
        {
            return ktx.n();
        } else
        {
            return l;
        }
    }

    protected final Object a(int i1, Object obj, Object obj1)
    {
        boolean flag = false;
        kvk.a[i1 - 1];
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
        obj1 = new kvo((klr)obj, (klv)obj1);
_L11:
        return obj1;
_L3:
        return new kvo(kmn.e, klv.a());
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
        if (!l())
        {
            if (flag1)
            {
                p = 0;
            }
            return null;
        }
        if (n() && !o().C_())
        {
            if (flag1)
            {
                p = 0;
            }
            return null;
        }
        for (i1 = 0; i1 < n.size(); i1++)
        {
            if (!((kvq)n.get(i1)).C_())
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
        return new kvp();
_L7:
        obj1 = this;
        if (obj == q) goto _L11; else goto _L10
_L10:
        obj = (kvo)obj;
        if ((((kvo) (obj)).d & 1) == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 1;
            e = ((kvo) (obj)).e;
        }
        if (((kvo) (obj)).l())
        {
            double d1 = ((kvo) (obj)).f;
            d = d | 2;
            f = d1;
        }
        if ((((kvo) (obj)).d & 4) == 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = ((kvo) (obj)).g;
            d = d | 4;
            g = i1;
        }
        if ((((kvo) (obj)).d & 8) == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            d = d | 8;
            h = ((kvo) (obj)).h;
        }
        if ((((kvo) (obj)).d & 0x10) == 16)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = ((kvo) (obj)).i;
            d = d | 0x10;
            i = i1;
        }
        if ((((kvo) (obj)).d & 0x20) == 32)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            long l1 = ((kvo) (obj)).j;
            d = d | 0x20;
            j = l1;
        }
        if ((((kvo) (obj)).d & 0x40) == 64)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            double d2 = ((kvo) (obj)).k;
            d = d | 0x40;
            k = d2;
        }
        if (((kvo) (obj)).n())
        {
            obj1 = ((kvo) (obj)).o();
            boolean flag2;
            if (l != null && l != ktx.n())
            {
                l = (ktx)((ktz)ktx.newBuilder(l).a(((kma) (obj1)))).j();
            } else
            {
                l = ((ktx) (obj1));
            }
            d = d | 0x80;
        }
        i1 = ((flag) ? 1 : 0);
        if ((((kvo) (obj)).d & 0x100) == 256)
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            flag2 = ((kvo) (obj)).m;
            d = d | 0x100;
            m = flag2;
        }
        if (!((kvo) (obj)).n.isEmpty())
        {
            if (n.isEmpty())
            {
                n = ((kvo) (obj)).n;
            } else
            {
                if (!n.a())
                {
                    n = a(((java.util.List) (n)));
                }
                n.addAll(((kvo) (obj)).n);
            }
        }
        a(((kvo) (obj)).b);
        return this;
_L8:
        return q;
_L9:
        if (r != null) goto _L13; else goto _L12
_L12:
        kvo;
        JVM INSTR monitorenter ;
        if (r == null)
        {
            r = new kmd(q);
        }
        kvo;
        JVM INSTR monitorexit ;
_L13:
        return r;
        obj;
        kvo;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(kls kls1)
    {
        if ((d & 2) == 2)
        {
            kls1.a(12, f);
        }
        if ((d & 8) == 8)
        {
            kls1.a(13, h);
        }
        if ((d & 0x10) == 16)
        {
            kls1.a(21, i);
        }
        if ((d & 0x20) == 32)
        {
            kls1.b(22, j);
        }
        if ((d & 0x40) == 64)
        {
            kls1.a(23, k);
        }
        if ((d & 0x80) == 128)
        {
            kls1.b(24, o());
        }
        for (int i1 = 0; i1 < n.size(); i1++)
        {
            kls1.a(25, (kmy)n.get(i1));
        }

        if ((d & 1) == 1)
        {
            kls1.a(27, e);
        }
        if ((d & 0x100) == 256)
        {
            kls1.a(30, m);
        }
        if ((d & 4) == 4)
        {
            kls1.a(37, g);
        }
        b.a(kls1);
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
        if ((d & 2) == 2)
        {
            j1 = kls.h(12) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if ((d & 8) == 8)
        {
            i1 = j1 + kls.b(13, h);
        }
        j1 = i1;
        if ((d & 0x10) == 16)
        {
            j1 = i1 + kls.c(21, i);
        }
        i1 = j1;
        if ((d & 0x20) == 32)
        {
            i1 = j1 + kls.e(22, j);
        }
        j1 = i1;
        if ((d & 0x40) == 64)
        {
            j1 = i1 + kls.h(23);
        }
        i1 = j1;
        if ((d & 0x80) == 128)
        {
            i1 = j1 + kls.e(24, o());
        }
        for (j1 = ((flag) ? 1 : 0); j1 < n.size();)
        {
            int k1 = kls.d(25, (kmy)n.get(j1));
            j1++;
            i1 = k1 + i1;
        }

        j1 = i1;
        if ((d & 1) == 1)
        {
            j1 = i1 + kls.b(27, e);
        }
        i1 = j1;
        if ((d & 0x100) == 256)
        {
            i1 = j1 + kls.k(30);
        }
        j1 = i1;
        if ((d & 4) == 4)
        {
            j1 = i1 + kls.c(37, g);
        }
        i1 = b.b() + j1;
        c = i1;
        return i1;
    }

    static 
    {
        q = new kvo(kmn.e, klv.a());
    }
}
