// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dkp extends dkr
{

    private final String A;
    private final int B;
    private String C;
    private String D;
    private long E;
    private final boolean F;
    private int G;
    private final String H;
    private String I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private aio O;
    private final List l;
    private List m;
    private final boolean n;
    private final int o;
    private final String p;
    private final String q;
    private final long r;
    private final long s;
    private final long t;
    private long u;
    private final boolean v;
    private long w;
    private final long x;
    private final int y;
    private final long z;

    public dkp(dmo dmo1, boolean flag, long l1, long l2, long l3, long l4)
    {
        super(dmo1.c, dmo1.d, dmo1.e, dmo1.n, dmo1.m, dmo1.l, dmo1.f, dmo1.h, dmo1.i, dsu.e, dmo1.u);
        E = -1L;
        G = -1;
        M = 2;
        l = dmo1.a;
        m = dmo1.b;
        n = dmo1.p;
        o = dmo1.r;
        p = dmo1.s;
        q = null;
        x = 0L;
        y = 0;
        z = 0L;
        A = null;
        B = 6;
        F = dmo1.q;
        H = null;
        v = flag;
        r = l1;
        s = l2;
        t = l3;
        u = l4;
        L = dmo1.c();
        M = dmo1.t;
        N = dmo1.d();
        O = (aio)hlp.b(g.nU, aio);
    }

    public dkp(String s1, cgd cgd1, long l1, String s2, List list, String s3, 
            List list1, boolean flag, dsu dsu1, int i, int j, String s4, String s5, 
            long l2, int k, long l3, String s6, int i1, 
            String s7, int j1, long l4)
    {
        super(s1, cgd1, l1, -1L, s2, null, -1, 1, 0L, dsu1, null);
        E = -1L;
        G = -1;
        M = 2;
        H = s3;
        l = new ArrayList();
        if (list != null)
        {
            for (s1 = list.iterator(); s1.hasNext(); l.add(cgd1))
            {
                cgd1 = (dmt)s1.next();
            }

        }
        if (list1 != null)
        {
            m = new ArrayList();
            for (s1 = list1.iterator(); s1.hasNext(); m.add(cgd1))
            {
                cgd1 = (dmp)s1.next();
            }

        }
        n = flag;
        if (flag)
        {
            this.i = 0x7fffffffffffffffL;
        } else
        {
            this.i = 0L;
        }
        o = j;
        p = s4;
        v = false;
        r = l4;
        s = 0L;
        t = 0L;
        q = s5;
        x = l2;
        y = k;
        z = l3;
        A = s6;
        B = i1;
        F = true;
        I = s7;
        J = j1;
        K = i;
        O = (aio)hlp.b(g.nU, aio);
    }

    private boolean a(int i, aow aow1)
    {
        if (dcz.v(i))
        {
            aow1 = aow1.e(f, a);
            return aow1 != null && ((apk) (aow1)).J == 1;
        } else
        {
            return c(aow1);
        }
    }

    private boolean b()
    {
        if (O != null)
        {
            return O.a();
        } else
        {
            return false;
        }
    }

    private static boolean b(int i)
    {
        return ((drj)hlp.a(g.nU, drj)).a(i);
    }

    private void c(aow aow1, dgk dgk1)
    {
label0:
        {
label1:
            {
label2:
                {
                    {
                        aoa aoa1 = aow1.f();
                        boolean flag2 = aoa1.b().a(g);
                        Object obj2 = null;
                        int i1 = 0;
                        Object obj = Collections.emptyList();
                        double d;
                        double d1;
                        Object obj1;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        Object obj6;
                        Object obj7;
                        String s1;
                        String s2;
                        String s3;
                        String s4;
                        String s6;
                        apj apj1;
                        int i;
                        int j;
                        int k;
                        boolean flag;
                        boolean flag1;
                        boolean flag3;
                        if (m != null)
                        {
                            j = m.size();
                        } else
                        {
                            j = 0;
                        }
                        if (j != 1)
                        {
                            break label2;
                        }
                        obj6 = (dmp)m.get(0);
                        obj5 = ((dmp) (obj6)).f;
                        obj2 = ((dmp) (obj6)).h;
                        obj1 = ((dmp) (obj6)).g;
                        obj4 = ((dmp) (obj6)).d;
                        obj3 = ((dmp) (obj6)).e;
                        if (obj6 instanceof dms)
                        {
                            obj6 = (dms)obj6;
                            s4 = ((dms) (obj6)).i;
                            s3 = ((dms) (obj6)).j;
                            s2 = ((dms) (obj6)).k;
                            k = ((dms) (obj6)).l;
                            j = ((dms) (obj6)).m;
                            i = ((dms) (obj6)).n;
                            String s5 = ((dms) (obj6)).o;
                            obj7 = ((dms) (obj6)).p;
                            obj6 = obj2;
                            d1 = 0.0D;
                            d = 0.0D;
                            Object obj8 = null;
                            obj2 = obj1;
                            obj1 = obj7;
                            s1 = ((String) (obj5));
                            obj7 = obj4;
                            obj5 = obj3;
                            obj4 = obj8;
                            obj3 = obj2;
                            obj2 = s5;
                        } else
                        if (obj6 instanceof dmu)
                        {
                            obj6 = (dmu)obj6;
                            s4 = ((dmu) (obj6)).i;
                            i1 = ((dmu) (obj6)).j;
                            s6 = null;
                            i = 0;
                            s1 = ((String) (obj5));
                            Object obj9 = null;
                            j = 0;
                            s2 = null;
                            obj7 = obj4;
                            k = 0;
                            s3 = null;
                            d = 0.0D;
                            obj4 = obj1;
                            Object obj12 = null;
                            d1 = 0.0D;
                            obj5 = obj3;
                            obj6 = obj2;
                            obj1 = obj9;
                            obj2 = s6;
                            obj3 = obj4;
                            obj4 = obj12;
                        } else
                        if (obj6 instanceof dmq)
                        {
                            s4 = ((dmq)obj6).i;
                            s6 = null;
                            i = 0;
                            s1 = ((String) (obj5));
                            Object obj10 = null;
                            j = 0;
                            s2 = null;
                            obj7 = obj4;
                            k = 0;
                            s3 = null;
                            d = 0.0D;
                            obj4 = obj1;
                            Object obj13 = null;
                            d1 = 0.0D;
                            obj5 = obj3;
                            obj6 = obj2;
                            obj1 = obj10;
                            obj2 = s6;
                            obj3 = obj4;
                            obj4 = obj13;
                        } else
                        {
                            Object obj11;
                            long l1;
                            long l2;
                            if (obj6 instanceof dmr)
                            {
                                obj6 = (dmr)obj6;
                                d1 = ((dmr) (obj6)).i;
                                d = ((dmr) (obj6)).j;
                                obj6 = ((dmr) (obj6)).k;
                            } else
                            {
                                obj6 = null;
                                d = 0.0D;
                                d1 = 0.0D;
                            }
                            obj7 = obj3;
                            s1 = ((String) (obj2));
                            j = 0;
                            s6 = null;
                            s4 = null;
                            s2 = ((String) (obj4));
                            k = 0;
                            obj11 = null;
                            i = 0;
                            s3 = ((String) (obj5));
                            obj4 = obj6;
                            obj3 = obj1;
                            obj1 = null;
                            obj2 = null;
                            obj5 = obj7;
                            obj6 = s1;
                            obj7 = s2;
                            s1 = s3;
                            s2 = s6;
                            s3 = obj11;
                        }
                    }
                    if (H != null)
                    {
                        s6 = H;
                    } else
                    {
                        s6 = g.a(l, ((String) (obj3)));
                    }
                    flag1 = RealTimeChatService.d(aoa1, f);
                    if (aow1.n(f).a <= h)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag3 = c(aow1);
                    apj1 = new apj();
                    apj1.a = a;
                    apj1.b = b;
                    apj1.c = f;
                    apj1.d = o;
                    apj1.e = p;
                    apj1.f = g;
                    apj1.g = s6;
                    apj1.h = this.k.ordinal();
                    apj1.i = h;
                    apj1.j = s4;
                    apj1.k = s3;
                    apj1.l = s2;
                    apj1.n = s1;
                    apj1.o = ((String) (obj7));
                    apj1.p = ((String) (obj5));
                    apj1.q = d1;
                    apj1.r = d;
                    apj1.s = ((String) (obj4));
                    apj1.t = ((String) (obj3));
                    apj1.u = ((String) (obj2));
                    apj1.v = ((String) (obj1));
                    apj1.m = i;
                    apj1.w = flag2;
                    apj1.x = c;
                    apj1.y = this.i;
                    apj1.z = n;
                    apj1.A = k;
                    apj1.B = j;
                    apj1.C = ((String) (obj6));
                    apj1.D = q;
                    apj1.E = x;
                    apj1.F = y;
                    apj1.G = z;
                    apj1.H = A;
                    apj1.I = C;
                    apj1.J = D;
                    apj1.K = F;
                    apj1.L = -1;
                    apj1.M = G;
                    apj1.N = I;
                    apj1.O = J;
                    apj1.P = K;
                    apj1.Q = i1;
                    if (flag2)
                    {
                        i = 1;
                    } else
                    {
                        i = M;
                    }
                    apj1.R = i;
                    if (!flag2)
                    {
                        flag2 = a(aoa1.h(), aow1);
                        if (flag && !flag2 && !flag1)
                        {
                            if (c == dgk.a())
                            {
                                dgk1.b(h);
                            } else
                            if (c != 10)
                            {
                                dgk1.a(h);
                            }
                        }
                        w = SystemClock.elapsedRealtime() * 1000L;
                    }
                    E = aow1.a(apj1);
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); aow1.a((apl)((Iterator) (obj)).next())) { }
                    break label1;
                }
                if (j > 1)
                {
                    obj1 = new ArrayList(j);
                    obj3 = new StringBuilder();
                    i = 0;
                    k = 0;
                    obj = obj2;
                    while (k < j) 
                    {
                        if (k > 0)
                        {
                            ((StringBuilder) (obj3)).append('|');
                        }
                        obj2 = (dmp)m.get(k);
                        obj4 = new apl();
                        obj4.a = f;
                        obj4.b = a;
                        obj4.c = ((dmp) (obj2)).f;
                        obj4.d = ((dmp) (obj2)).h;
                        if (obj2 instanceof dms)
                        {
                            obj5 = (dms)obj2;
                            obj4.e = ((dms) (obj5)).l;
                            obj4.f = ((dms) (obj5)).m;
                        } else
                        if (obj2 instanceof dmu)
                        {
                            obj5 = (dmu)obj2;
                            obj = ((dmu) (obj5)).i;
                            i = ((dmu) (obj5)).j;
                        } else
                        if (obj2 instanceof dmq)
                        {
                            obj = ((dmq)obj2).i;
                        }
                        ((StringBuilder) (obj3)).append(g.a(new String[] {
                            ((dmp) (obj2)).f, ((dmp) (obj2)).h
                        }));
                        ((List) (obj1)).add(obj4);
                        k++;
                    }
                    s1 = ((StringBuilder) (obj3)).toString();
                    i1 = i;
                    i = 0;
                    obj2 = null;
                    d = 0.0D;
                    obj4 = null;
                    obj3 = null;
                    s6 = null;
                    j = 0;
                    s2 = null;
                    s4 = ((String) (obj));
                    obj7 = null;
                    s3 = null;
                    obj5 = null;
                    obj6 = "multipart/mixed";
                    k = 0;
                    d1 = 0.0D;
                    obj = obj1;
                    obj1 = s6;
                    continue; /* Loop/switch isn't completed */
                }
                break label0;
            }
label3:
            {
                aow1.a(f, h, this.i, B, ((String) (obj6)), g, s6, s1, E, G, i1);
                if (e != 0L)
                {
                    i = aow1.f().h();
                    l1 = SystemClock.elapsedRealtime();
                    l2 = ((drj)hlp.a(g.nU, drj)).d(i);
                    obj = new aoy();
                    obj.a = dgk1.g();
                    obj.b = flag;
                    if (!flag3)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj.c = flag;
                    if (System.currentTimeMillis() * 1000L <= l2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj.d = flag;
                    obj.e = flag1;
                    obj.f = this.d;
                    obj.g = c;
                    obj.i = h;
                    obj.j = aow1.u(f);
                    obj.k = aow1.v(f);
                    obj.h = b(i);
                    flag = b();
                    if (!v)
                    {
                        break label3;
                    }
                    aow1 = (new cab()).c(a).a(e).b(b).a(f);
                    if (b(i) && !((aoy) (obj)).d && dgk1.g() == dgm.e)
                    {
                        h.a(i, w / 1000L, 10, aow1.a(401).a(((aoy) (obj))));
                        h.a(i, l1, 10, aow1.a(402));
                    } else
                    {
                        h.a(i, w / 1000L, 10, aow1.a(411).a(((aoy) (obj))));
                    }
                    if (dgk1.g() == dgm.b)
                    {
                        h.a(i, dgk1.d() / 1000L, 10, aow1.a(451).a(((aoy) (obj))));
                        h.a(i, l1, 10, aow1.a(452));
                    }
                    l2 = r / 1000L;
                    dgk1 = aow1.a(1);
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    h.a(i, l2, 1, dgk1.a(flag).a(null));
                    h.a(i, s / 1000L, 10, aow1.a(206).a(null));
                    h.a(i, t / 1000L, 10, aow1.a(207).a(null));
                    h.a(i, u / 1000L, 10, aow1.a(107).a(null));
                    h.a(i, l1, 4, aow1.a(0).a(((aoy) (obj))));
                }
                return;
            }
            aow1 = (new cab()).c(a).b(b).a(f);
            l2 = r / 1000L;
            dgk1 = aow1.a(L).b(N);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h.a(i, l2, 1, dgk1.a(flag).a(((aoy) (obj))));
            h.a(i, t / 1000L, 10, aow1.a(204).a(null));
            h.a(i, u / 1000L, 10, aow1.a(108).a(null));
            h.a(i, l1, 4, aow1.a(0).a(((aoy) (obj))));
            h.a(i, l1, 10, aow1.a(461).a(((aoy) (obj))));
            return;
        }
        i = 0;
        s1 = null;
        obj2 = null;
        j = 0;
        s2 = null;
        s4 = null;
        obj7 = null;
        d1 = 0.0D;
        obj5 = null;
        obj6 = null;
        k = 0;
        s3 = null;
        d = 0.0D;
        obj3 = null;
        obj4 = null;
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_2228;
_L2:
        break MISSING_BLOCK_LABEL_220;
    }

    private boolean c(aow aow1)
    {
        long l1 = aow1.u(f);
        return h <= l1;
    }

    public long a()
    {
        return E;
    }

    public dkp a(int i)
    {
        G = i;
        return this;
    }

    public dkp a(String s1)
    {
        C = s1;
        return this;
    }

    public void a(aow aow1, dgk dgk1)
    {
        aow1.a();
        u = SystemClock.elapsedRealtime() * 1000L;
        if (o != 3)
        {
            aow1.c(f, 1);
        }
        c(aow1, dgk1);
        a(aow1);
        aow1.b();
        aow1.c();
        aoq.d(aow1, f);
        return;
        dgk1;
        aow1.c();
        throw dgk1;
    }

    public void a(dsu dsu1)
    {
        k = dsu1;
    }

    public dkp b(String s1)
    {
        D = s1;
        return this;
    }

    public void b(aow aow1, dgk dgk1)
    {
        c(aow1, dgk1);
        b(aow1);
    }
}
