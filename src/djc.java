// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class djc extends dje
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
    private long M;
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

    public djc(crm crm1, boolean flag, long l1, long l2, long l3, long l4)
    {
        super(crm1.c, crm1.d, crm1.e, crm1.n, crm1.m, crm1.l, crm1.f, crm1.h, crm1.i, dqb.e, crm1.u);
        E = -1L;
        G = -1;
        M = 0L;
        l = crm1.a;
        m = crm1.b;
        n = crm1.p;
        o = crm1.r;
        p = crm1.s;
        q = null;
        x = 0L;
        y = 0;
        z = 0L;
        A = null;
        B = 6;
        F = crm1.q;
        H = null;
        v = flag;
        r = l1;
        s = l2;
        t = l3;
        u = l4;
        L = crm1.c();
        M = crm1.t;
    }

    public djc(String s1, cey cey1, long l1, String s2, List list, String s3, 
            List list1, boolean flag, dqb dqb1, int i, int j, String s4, String s5, 
            long l2, int k, long l3, String s6, int i1, 
            String s7, int j1, long l4)
    {
        super(s1, cey1, l1, -1L, s2, null, -1, 1, 0L, dqb1, null);
        E = -1L;
        G = -1;
        M = 0L;
        H = s3;
        l = new ArrayList();
        if (list != null)
        {
            for (s1 = list.iterator(); s1.hasNext(); l.add(cey1))
            {
                cey1 = (crr)s1.next();
            }

        }
        if (list1 != null)
        {
            m = new ArrayList();
            for (s1 = list1.iterator(); s1.hasNext(); m.add(cey1))
            {
                cey1 = (crn)s1.next();
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
    }

    private boolean a(int i, aoe aoe1)
    {
        if (dbq.t(i))
        {
            aoe1 = aoe1.e(f, a);
            return aoe1 != null && ((aos) (aoe1)).I > 0L;
        } else
        {
            return c(aoe1);
        }
    }

    private static boolean b(int i)
    {
        return ((doq)hgx.a(g.nS, doq)).a(i);
    }

    private void c(aoe aoe1, dfb dfb1)
    {
label0:
        {
label1:
            {
label2:
                {
                    {
                        ani ani1 = aoe1.f();
                        boolean flag2 = ani1.b().a(g);
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
                        aor aor1;
                        int i;
                        int j;
                        int k;
                        long l1;
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
                        obj6 = (crn)m.get(0);
                        obj5 = ((crn) (obj6)).f;
                        obj2 = ((crn) (obj6)).h;
                        obj1 = ((crn) (obj6)).g;
                        obj4 = ((crn) (obj6)).d;
                        obj3 = ((crn) (obj6)).e;
                        if (obj6 instanceof crq)
                        {
                            obj6 = (crq)obj6;
                            s4 = ((crq) (obj6)).i;
                            s3 = ((crq) (obj6)).j;
                            s2 = ((crq) (obj6)).k;
                            k = ((crq) (obj6)).l;
                            j = ((crq) (obj6)).m;
                            i = ((crq) (obj6)).n;
                            String s5 = ((crq) (obj6)).o;
                            obj7 = ((crq) (obj6)).p;
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
                        if (obj6 instanceof crs)
                        {
                            obj6 = (crs)obj6;
                            s4 = ((crs) (obj6)).i;
                            i1 = ((crs) (obj6)).j;
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
                        if (obj6 instanceof cro)
                        {
                            s4 = ((cro)obj6).i;
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
                            long l2;
                            if (obj6 instanceof crp)
                            {
                                obj6 = (crp)obj6;
                                d1 = ((crp) (obj6)).i;
                                d = ((crp) (obj6)).j;
                                obj6 = ((crp) (obj6)).k;
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
                    flag1 = RealTimeChatService.d(ani1, f);
                    if (aoe1.n(f).a <= h)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag3 = c(aoe1);
                    aor1 = new aor();
                    aor1.a = a;
                    aor1.b = b;
                    aor1.c = f;
                    aor1.d = o;
                    aor1.e = p;
                    aor1.f = g;
                    aor1.g = s6;
                    aor1.h = this.k.ordinal();
                    aor1.i = h;
                    aor1.j = s4;
                    aor1.k = s3;
                    aor1.l = s2;
                    aor1.n = s1;
                    aor1.o = ((String) (obj7));
                    aor1.p = ((String) (obj5));
                    aor1.q = d1;
                    aor1.r = d;
                    aor1.s = ((String) (obj4));
                    aor1.t = ((String) (obj3));
                    aor1.u = ((String) (obj2));
                    aor1.v = ((String) (obj1));
                    aor1.m = i;
                    aor1.w = flag2;
                    aor1.x = c;
                    aor1.y = this.i;
                    aor1.z = n;
                    aor1.A = k;
                    aor1.B = j;
                    aor1.C = ((String) (obj6));
                    aor1.D = q;
                    aor1.E = x;
                    aor1.F = y;
                    aor1.G = z;
                    aor1.H = A;
                    aor1.I = C;
                    aor1.J = D;
                    aor1.K = F;
                    aor1.L = -1;
                    aor1.M = G;
                    aor1.N = I;
                    aor1.O = J;
                    aor1.P = K;
                    aor1.Q = i1;
                    if (flag2)
                    {
                        l1 = 1L;
                    } else
                    {
                        l1 = M;
                    }
                    aor1.R = l1;
                    if (!flag2)
                    {
                        flag2 = a(ani1.h(), aoe1);
                        if (flag && !flag2 && !flag1)
                        {
                            if (c == dfb.a())
                            {
                                dfb1.b(h);
                            } else
                            if (c != 10)
                            {
                                dfb1.a(h);
                            }
                        }
                        w = SystemClock.elapsedRealtime() * 1000L;
                    }
                    E = aoe1.a(aor1);
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); aoe1.a((aot)((Iterator) (obj)).next())) { }
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
                        obj2 = (crn)m.get(k);
                        obj4 = new aot();
                        obj4.a = f;
                        obj4.b = a;
                        obj4.c = ((crn) (obj2)).f;
                        obj4.d = ((crn) (obj2)).h;
                        if (obj2 instanceof crq)
                        {
                            obj5 = (crq)obj2;
                            obj4.e = ((crq) (obj5)).l;
                            obj4.f = ((crq) (obj5)).m;
                        } else
                        if (obj2 instanceof crs)
                        {
                            obj5 = (crs)obj2;
                            obj = ((crs) (obj5)).i;
                            i = ((crs) (obj5)).j;
                        } else
                        if (obj2 instanceof cro)
                        {
                            obj = ((cro)obj2).i;
                        }
                        ((StringBuilder) (obj3)).append(g.a(new String[] {
                            ((crn) (obj2)).f, ((crn) (obj2)).h
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
                aoe1.a(f, h, this.i, B, ((String) (obj6)), g, s6, s1, E, G, i1);
                if (e != 0L)
                {
                    i = aoe1.f().h();
                    l1 = SystemClock.elapsedRealtime();
                    l2 = ((doq)hgx.a(g.nS, doq)).d(i);
                    obj = new aog();
                    obj.a = dfb1.g();
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
                    obj.j = aoe1.u(f);
                    obj.k = aoe1.v(f);
                    obj.h = b(i);
                    if (!v)
                    {
                        break label3;
                    }
                    aoe1 = (new byy()).c(a).a(e).b(b).a(f);
                    if (b(i) && !((aog) (obj)).d && dfb1.g() == dfd.e)
                    {
                        h.a(i, w / 1000L, 10, aoe1.a(401).a(((aog) (obj))));
                        h.a(i, l1, 10, aoe1.a(402));
                    } else
                    {
                        h.a(i, w / 1000L, 10, aoe1.a(411).a(((aog) (obj))));
                    }
                    if (dfb1.g() == dfd.b)
                    {
                        h.a(i, dfb1.d() / 1000L, 10, aoe1.a(451).a(((aog) (obj))));
                        h.a(i, l1, 10, aoe1.a(452));
                    }
                    h.a(i, r / 1000L, 1, aoe1.a(1).a(null));
                    h.a(i, s / 1000L, 10, aoe1.a(206).a(null));
                    h.a(i, t / 1000L, 10, aoe1.a(207).a(null));
                    h.a(i, u / 1000L, 10, aoe1.a(107).a(null));
                    h.a(i, l1, 4, aoe1.a(0).a(((aog) (obj))));
                }
                return;
            }
            aoe1 = (new byy()).c(a).b(b).a(f);
            h.a(i, r / 1000L, 1, aoe1.a(L).a(((aog) (obj))));
            h.a(i, t / 1000L, 10, aoe1.a(204).a(null));
            h.a(i, u / 1000L, 10, aoe1.a(108).a(null));
            h.a(i, l1, 4, aoe1.a(0).a(((aog) (obj))));
            h.a(i, l1, 10, aoe1.a(461).a(((aog) (obj))));
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
        break MISSING_BLOCK_LABEL_2165;
_L2:
        break MISSING_BLOCK_LABEL_220;
    }

    private boolean c(aoe aoe1)
    {
        long l1 = aoe1.u(f);
        return h <= l1;
    }

    public long a()
    {
        return E;
    }

    public djc a(int i)
    {
        G = i;
        return this;
    }

    public djc a(String s1)
    {
        C = s1;
        return this;
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        aoe1.a();
        u = SystemClock.elapsedRealtime() * 1000L;
        if (o != 3)
        {
            aoe1.c(f, 1);
        }
        c(aoe1, dfb1);
        a(aoe1);
        aoe1.b();
        aoe1.c();
        any.d(aoe1, f);
        return;
        dfb1;
        aoe1.c();
        throw dfb1;
    }

    public void a(dqb dqb1)
    {
        k = dqb1;
    }

    public djc b(String s1)
    {
        D = s1;
        return this;
    }

    public void b(aoe aoe1, dfb dfb1)
    {
        c(aoe1, dfb1);
        b(aoe1);
    }
}
