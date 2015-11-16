// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
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

public final class bnk
{

    private static bnk t;
    private static gfg w;
    public final List a = new CopyOnWriteArrayList();
    Runnable b;
    final Context c;
    final Map d = new ConcurrentHashMap();
    final emy e;
    gms f;
    boolean g;
    gmn h;
    PredictedNetworkQuality i;
    glt j;
    public final Map k = new HashMap();
    gmt l;
    boolean m;
    boolean n;
    gmt o;
    bne p;
    Handler q;
    bpm r;
    private final gmo s = new bnm(this);
    private final glc u;
    private boolean v;
    private final PhoneStateListener x = new bnq(this);

    private bnk()
    {
        b = new bnl(this);
        m = true;
        n = true;
        o = null;
        c = g.nU;
        g.f();
        q = new Handler();
        u = new glc(c, new bnn(this));
        e = (new emz(c)).a(fep.b).a();
    }

    public static bnk a()
    {
        if (t == null)
        {
            t = new bnk();
        }
        return t;
    }

    static void a(List list, List list1)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList(list.size());
        int i1 = 0;
        while (i1 < list.size()) 
        {
            cfz cfz1 = (cfz)list.get(i1);
            if (cfz1.b.a != null)
            {
                arraylist.add(cfz1.b.a);
            } else
            if (cfz1.a == cgf.d)
            {
                gic.a().a(cfz1.s, eey.k(cfz1.f()), eey.c(cfz1.f()), eey.d(eey.k(cfz1.f()), eey.j()), cfz1.d());
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
            as[j1] = ((aif)list1.get(j1)).b();
        }

        gic.a().a(list, as);
    }

    public static boolean a(aoa aoa1, String s1)
    {
        if (t != null && t.r != null)
        {
            bph bph1 = t.r.e();
            if (TextUtils.equals(bph1.e(), s1) && TextUtils.equals(bph1.a(), aoa1.a()))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(bnk bnk1)
    {
        return bnk1.r != null && bnk1.r.H() && bnk1.r.I() == 0;
    }

    public static boolean c()
    {
        if (w == null)
        {
            gfg gfg1 = new gfg();
            w = gfg1;
            gfg1.a(g.nU);
        }
        return w.a();
    }

    public static boolean i()
    {
        glj glj1 = k();
        return glj1 == null || !glj1.h();
    }

    public static glj k()
    {
        gmm gmm1 = t.f();
        if (gmm1 == null)
        {
            return null;
        } else
        {
            return (glj)gmm1.e();
        }
    }

    public gmt a(String s1)
    {
        return (gmt)k.get(s1);
    }

    public void a(int i1)
    {
        u.a().a(i1);
    }

    public void a(bns bns1)
    {
        a.add(bns1);
        if (f != null)
        {
            bns1.a(f);
        }
    }

    public void a(bph bph1, boolean flag, List list, List list1, boolean flag1, cfz cfz1, int i1, 
            int j1, boolean flag2, long l1, String s1, kbg kbg, String s2)
    {
        gdv.a("Expected null", r);
        r = new bpm(bph1, flag, list, list1, flag1, cfz1, i1, j1, flag2, l1, s1, kbg, s2);
        list = c;
        bph1 = r.l();
        list = list.getSharedPreferences(boi.getName(), 0);
        if (!TextUtils.isEmpty(list.getString("ONGOING_CALL_SESSION", "")))
        {
            g.b(2723);
        }
        list.edit().putString("ONGOING_CALL_SESSION", bph1).apply();
        r.z();
        e.b();
        fep.c.a(e).a(new bnr(this));
    }

    void a(geu geu)
    {
        eev.e("Babel_calls", "CallServiceHost.handleHangoutExited");
        if (r == null)
        {
            return;
        }
        x();
        if (r.j())
        {
            ((TelephonyManager)g.nU.getSystemService("phone")).listen(x, 0);
        }
        r.a(geu);
        for (geu = boo.a().b().iterator(); geu.hasNext(); ((boq)geu.next()).a(r)) { }
        r.e().s();
        if (r.j() && !r.M())
        {
            eep.a(g.hW);
        }
        Object obj = c;
        geu = r.l();
        obj = ((Context) (obj)).getSharedPreferences(boi.getName(), 0);
        if (!((SharedPreferences) (obj)).getString("ONGOING_CALL_SESSION", "").equals(geu))
        {
            g.b(2715);
        }
        ((SharedPreferences) (obj)).edit().remove("ONGOING_CALL_SESSION").apply();
        r = null;
        e.d();
    }

    public void a(gmn gmn)
    {
        gmn = u.a(gmn);
        gmn.a(s);
        if (r.j())
        {
            Context context = c;
            boolean flag;
            if (r.g() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = new glt(context, flag);
            j.a(new bno(this));
            j.a(false);
            j.c_(true);
            gmn.a(j);
            gmn.a(j);
            for (gmn = a.iterator(); gmn.hasNext(); ((bns)gmn.next()).a(j.b(), j.c())) { }
            p = new bne(c);
            p.a(new bnp(this));
            p.a();
            return;
        } else
        {
            gmn.a(new gls());
            glb glb1 = new glb();
            glb1.b();
            gmn.a(glb1);
            return;
        }
    }

    public void a(gmw gmw)
    {
        a("localParticipant", gmw);
    }

    public void a(String s1, gmw gmw)
    {
        Object obj = u.a();
        if (obj == null)
        {
            eev.f("Babel_calls", "Attempted to create a renderer without an active call.");
            return;
        } else
        {
            obj = new gmi(((gmm) (obj)));
            ((gmi) (obj)).a(gmw);
            ((gmi) (obj)).a(s1);
            ((gmi) (obj)).c(true);
            d.put(gmw, obj);
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
                obj = u.a();
                if (obj != null)
                {
                    break label0;
                }
                eev.f("Babel_calls", "Attempted to change audio mute state without an active call.");
            }
            return;
        }
        obj = ((gmm) (obj)).f();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gmk) (obj)).a(flag);
    }

    public void b()
    {
        if (!v)
        {
            a(new bsg(c));
            v = true;
        }
    }

    public void b(bns bns1)
    {
        gdv.a("Expected condition to be true", a.remove(bns1));
    }

    public void b(gmn gmn)
    {
        gmm gmm1 = u.a();
        gdv.b("Expected condition to be false", gmm1.c());
        h = gmn;
        gmm1.a(gmn);
    }

    public void b(gmw gmw)
    {
        gmw = (gmi)d.remove(gmw);
        if (gmw != null)
        {
            gmw.a();
        }
    }

    public void b(String s1)
    {
        gmm gmm1 = u.a();
        if (!(gmm1 instanceof geb))
        {
            eev.f("Babel_calls", "Attempted to pin participant without an active call.");
            return;
        } else
        {
            ((geb)gmm1).c(s1);
            return;
        }
    }

    public void b(List list, List list1)
    {
        if (r != null && r.B())
        {
            a(list, list1);
            r.a(list, list1);
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
                obj = u.a();
                if (obj != null)
                {
                    break label0;
                }
                eev.f("Babel_calls", "Attempted to change audio playback mute state without an active call.");
            }
            return;
        }
        obj = ((gmm) (obj)).g();
        if (!n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gml) (obj)).c_(flag);
    }

    public void c(String s1)
    {
        gmm gmm1 = u.a();
        if (!(gmm1 instanceof geb))
        {
            eev.f("Babel_calls", "Attempted to mute remote participant without an active call.");
            return;
        } else
        {
            ((geb)gmm1).a(s1);
            return;
        }
    }

    public gmt d()
    {
        return o;
    }

    public void d(String s1)
    {
        gmm gmm1 = u.a();
        if (!(gmm1 instanceof geb))
        {
            eev.f("Babel_calls", "Attempted to mute remote participant without an active call.");
            return;
        } else
        {
            ((geb)gmm1).b(s1);
            return;
        }
    }

    public void e()
    {
        gmm gmm1 = u.a();
        if (gmm1 == null)
        {
            return;
        } else
        {
            gdv.b("Expected condition to be false", gmm1.c());
            gmm1.a(30);
            return;
        }
    }

    public gmm f()
    {
        return u.a();
    }

    public gmq g()
    {
        gmm gmm1 = f();
        if (gmm1 == null)
        {
            return null;
        } else
        {
            return gmm1.d();
        }
    }

    public boolean h()
    {
        return m;
    }

    public glt j()
    {
        return j;
    }

    public boolean l()
    {
        return f != null;
    }

    public boolean m()
    {
        return r != null;
    }

    public boolean n()
    {
        return g;
    }

    public gdr o()
    {
        gmm gmm1 = u.a();
        if (gmm1 == null)
        {
            eev.f("Babel_calls", "Attempted to get mesi collections without an active call.");
            return null;
        } else
        {
            return gmm1.h();
        }
    }

    public gmt p()
    {
        return l;
    }

    public List q()
    {
        return new ArrayList(k.values());
    }

    public gmt r()
    {
        Object obj;
        int i1;
        obj = q();
        i1 = ((List) (obj)).size();
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        obj = (gmt)((List) (obj)).get(0);
        if (((gmt) (obj)).g() || !((gmt) (obj)).m()) goto _L4; else goto _L3
_L3:
        return ((gmt) (obj));
_L2:
        gmt gmt1;
        if (i1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        gmt1 = (gmt)((List) (obj)).get(0);
        obj = (gmt)((List) (obj)).get(1);
        if (gmt1.g() && ((gmt) (obj)).m())
        {
            return ((gmt) (obj));
        }
        if (!((gmt) (obj)).g())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = gmt1;
        if (gmt1.m()) goto _L3; else goto _L4
_L4:
        return null;
    }

    public bpm s()
    {
        return r;
    }

    public boolean t()
    {
        return r != null && r.I() != 0;
    }

    public boolean u()
    {
        return r != null && r.M();
    }

    public void v()
    {
        r.A();
    }

    public void w()
    {
        ((TelephonyManager)g.nU.getSystemService("phone")).listen(x, 32);
    }

    void x()
    {
        if (r == null)
        {
            return;
        } else
        {
            aoq.a(dcn.a(r.e().a(), null).h());
            return;
        }
    }
}
