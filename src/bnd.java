// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bnd
{

    private static bnd s;
    private static gco v;
    public final List a = new CopyOnWriteArrayList();
    Runnable b;
    final Context c;
    final Map d = new ConcurrentHashMap();
    final ejx e;
    gjq f;
    boolean g;
    gjl h;
    PredictedNetworkQuality i;
    gir j;
    public final Map k = new HashMap();
    gjr l;
    boolean m;
    boolean n;
    gjr o;
    Handler p;
    bpd q;
    private final gjm r = new bnf(this);
    private final gia t;
    private boolean u;
    private final PhoneStateListener w = new bni(this);

    private bnd()
    {
        b = new bne(this);
        m = true;
        n = true;
        o = null;
        c = g.nS;
        g.g();
        p = new Handler();
        t = new gia(c, new bng(this));
        e = (new ejy(c)).a(fbr.b).a();
    }

    public static bnd a()
    {
        if (s == null)
        {
            s = new bnd();
        }
        return s;
    }

    static void a(List list, List list1)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList(list.size());
        int i1 = 0;
        while (i1 < list.size()) 
        {
            ceu ceu1 = (ceu)list.get(i1);
            if (ceu1.b.a != null)
            {
                arraylist.add(ceu1.b.a);
            } else
            if (ceu1.a == cfa.d)
            {
                gfd.a().a(ceu1.s, ebz.k(ceu1.f()), ebz.c(ceu1.f()), ebz.d(ebz.k(ceu1.f()), ebz.j()), ceu1.d());
            }
            i1++;
        }
        if (arraylist.size() == 0 && list1.size() == 0)
        {
            return;
        }
        list = new String[arraylist.size()];
        arraylist.toArray(list);
        String as[] = new String[list1.size()];
        for (int j1 = ((flag) ? 1 : 0); j1 < list1.size(); j1++)
        {
            as[j1] = ((aim)list1.get(j1)).b();
        }

        gfd.a().a(list, as);
    }

    public static boolean a(ani ani1, String s1)
    {
        if (s != null && s.q != null)
        {
            boy boy1 = s.q.e();
            if (TextUtils.equals(boy1.e(), s1) && TextUtils.equals(boy1.a(), ani1.a()))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(bnd bnd1)
    {
        return bnd1.q != null && bnd1.q.I() && bnd1.q.J() == 0;
    }

    public static boolean c()
    {
        if (v == null)
        {
            gco gco1 = new gco();
            v = gco1;
            gco1.a(g.nS);
        }
        return v.a();
    }

    public static boolean j()
    {
        gih gih1 = l();
        return gih1 == null || !gih1.h();
    }

    public static gih l()
    {
        gjk gjk1 = s.f();
        if (gjk1 == null)
        {
            return null;
        } else
        {
            return (gih)gjk1.c();
        }
    }

    public void a(int i1)
    {
        t.a().a(i1);
    }

    public void a(bnk bnk1)
    {
        a.add(bnk1);
        if (f != null)
        {
            bnk1.a(f);
        }
    }

    public void a(boy boy1, boolean flag, List list, List list1, boolean flag1, ceu ceu1, int i1, 
            int j1, boolean flag2, long l1, String s1, jtd jtd, String s2)
    {
        gbh.a(q);
        q = new bpd(boy1, flag, list, list1, flag1, ceu1, i1, j1, flag2, l1, s1, jtd, s2);
        bnz.a(c, q.m());
        q.A();
        e.b();
        fbr.c.a(e).a(new bnj(this));
    }

    void a(gcg gcg)
    {
        ebw.e("Babel_calls", "CallServiceHost.handleHangoutExited");
        if (q == null)
        {
            return;
        }
        z();
        if (q.k())
        {
            ((TelephonyManager)g.nS.getSystemService("phone")).listen(w, 0);
        }
        q.a(gcg);
        for (gcg = bof.a().b().iterator(); gcg.hasNext(); ((boh)gcg.next()).a(q)) { }
        q.e().s();
        if (q.k() && !q.N())
        {
            ebr.a(g.ie);
        }
        bnz.b(c, q.m());
        q = null;
        e.d();
    }

    public void a(gjl gjl)
    {
        gjl = t.a(gjl);
        gjl.a(r);
        if (q.k())
        {
            Context context = c;
            boolean flag;
            if (q.g() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = new gir(context, flag);
            j.a(new bnh(this));
            j.a(false);
            j.c_(true);
            gjl.a(j);
            gjl.a(j);
            for (gjl = a.iterator(); gjl.hasNext(); ((bnk)gjl.next()).a(j.b(), j.c())) { }
        } else
        {
            gjl.a(new giq());
            ghz ghz1 = new ghz();
            ghz1.b();
            gjl.a(ghz1);
        }
    }

    public void a(gju gju)
    {
        a("localParticipant", gju);
    }

    public void a(String s1)
    {
        gjk gjk1 = t.a();
        if (!(gjk1 instanceof gbn))
        {
            ebw.f("Babel_calls", "Attempted to pin participant without an active call.");
            return;
        } else
        {
            ((gbn)gjk1).c(s1);
            return;
        }
    }

    public void a(String s1, gju gju)
    {
        Object obj = t.a();
        if (obj == null)
        {
            ebw.f("Babel_calls", "Attempted to create a renderer without an active call.");
            return;
        } else
        {
            obj = new gjg(((gjk) (obj)));
            ((gjg) (obj)).a(gju);
            ((gjg) (obj)).a(s1);
            ((gjg) (obj)).c(true);
            d.put(gju, obj);
            return;
        }
    }

    public void a(boolean flag)
    {
        Object obj;
label0:
        {
            if (m != flag)
            {
                m = flag;
                obj = t.a();
                if (obj != null)
                {
                    break label0;
                }
                ebw.f("Babel_calls", "Attempted to change audio mute state without an active call.");
            }
            return;
        }
        obj = ((gjk) (obj)).d();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gji) (obj)).a(flag);
    }

    public void b()
    {
        if (!u)
        {
            a(new brx(c));
            u = true;
        }
    }

    public void b(bnk bnk1)
    {
        gbh.a(a.remove(bnk1));
    }

    public void b(gjl gjl)
    {
        gjk gjk1 = t.a();
        gbh.b(gjk1.a());
        h = gjl;
        gjk1.a(gjl);
    }

    public void b(gju gju)
    {
        gju = (gjg)d.remove(gju);
        if (gju != null)
        {
            gju.a();
        }
    }

    public void b(String s1)
    {
        gjk gjk1 = t.a();
        if (!(gjk1 instanceof gbn))
        {
            ebw.f("Babel_calls", "Attempted to mute remote participant without an active call.");
            return;
        } else
        {
            ((gbn)gjk1).a(s1);
            return;
        }
    }

    public void b(List list, List list1)
    {
        if (q != null && q.C())
        {
            a(list, list1);
            q.a(list, list1);
        }
    }

    public void b(boolean flag)
    {
        Object obj;
label0:
        {
            if (n != flag)
            {
                n = flag;
                obj = t.a();
                if (obj != null)
                {
                    break label0;
                }
                ebw.f("Babel_calls", "Attempted to change audio playback mute state without an active call.");
            }
            return;
        }
        obj = ((gjk) (obj)).e();
        if (!n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gjj) (obj)).c_(flag);
    }

    public void c(String s1)
    {
        gjk gjk1 = t.a();
        if (!(gjk1 instanceof gbn))
        {
            ebw.f("Babel_calls", "Attempted to mute remote participant without an active call.");
            return;
        } else
        {
            ((gbn)gjk1).b(s1);
            return;
        }
    }

    public gjr d()
    {
        return o;
    }

    public void e()
    {
        gjk gjk1 = t.a();
        if (gjk1 == null)
        {
            return;
        } else
        {
            gbh.b(gjk1.a());
            gjk1.a(30);
            return;
        }
    }

    public gjk f()
    {
        return t.a();
    }

    public gjo g()
    {
        gjk gjk1 = f();
        if (gjk1 == null)
        {
            return null;
        } else
        {
            return gjk1.b();
        }
    }

    public void h()
    {
        gjk gjk1 = t.a();
        if (!(gjk1 instanceof gbn))
        {
            ebw.f("Babel_calls", "Attempted to present to all without an active call.");
            return;
        } else
        {
            ((gbn)gjk1).a(true);
            return;
        }
    }

    public boolean i()
    {
        return m;
    }

    public gir k()
    {
        return j;
    }

    public boolean m()
    {
        return f != null;
    }

    public boolean n()
    {
        return q != null;
    }

    public boolean o()
    {
        return g;
    }

    public gbd p()
    {
        gjk gjk1 = t.a();
        if (gjk1 == null)
        {
            ebw.f("Babel_calls", "Attempted to get mesi collections without an active call.");
            return null;
        } else
        {
            return gjk1.g();
        }
    }

    public gjr q()
    {
        return l;
    }

    public List r()
    {
        return new ArrayList(k.values());
    }

    public gjr s()
    {
        Object obj;
        int i1;
        obj = r();
        i1 = ((List) (obj)).size();
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        obj = (gjr)((List) (obj)).get(0);
        if (((gjr) (obj)).g() || !((gjr) (obj)).m()) goto _L4; else goto _L3
_L3:
        return ((gjr) (obj));
_L2:
        gjr gjr1;
        if (i1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        gjr1 = (gjr)((List) (obj)).get(0);
        obj = (gjr)((List) (obj)).get(1);
        if (gjr1.g() && ((gjr) (obj)).m())
        {
            return ((gjr) (obj));
        }
        if (!((gjr) (obj)).g())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = gjr1;
        if (gjr1.m()) goto _L3; else goto _L4
_L4:
        return null;
    }

    public bpd t()
    {
        return q;
    }

    public boolean u()
    {
        return q != null && q.J() != 0;
    }

    public boolean v()
    {
        return q != null && q.N();
    }

    public boolean w()
    {
        return q != null && q.j();
    }

    public void x()
    {
        q.B();
    }

    public void y()
    {
        ((TelephonyManager)g.nS.getSystemService("phone")).listen(w, 32);
    }

    void z()
    {
        if (q == null)
        {
            return;
        } else
        {
            any.a(dbf.a(q.e().a(), null).h());
            return;
        }
    }
}
