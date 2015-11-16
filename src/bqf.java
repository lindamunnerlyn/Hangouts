// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class bqf
    implements bos, brt, brv
{

    private static final long a;
    private static final long b;
    private static final jlr t;
    private static final jlr u;
    private final bof c = bof.a();
    private final bnd d = bnd.a();
    private final bqp e = new bqp(this);
    private final bqo f = new bqo(this);
    private final HangoutActivity g;
    private final View h;
    private final Runnable i = new bqg(this);
    private final Runnable j = new bqh(this);
    private final LinearLayout k;
    private final HangoutSelfMenu l;
    private final HangoutSelfMenu m;
    private final int n;
    private boolean o;
    private bot p;
    private boolean q;
    private boolean r;
    private bqq s;
    private final android.view.View.OnClickListener v = new bqj(this);

    public bqf(HangoutFragment hangoutfragment, ViewGroup viewgroup)
    {
        r = false;
        s = bqq.a;
        h = viewgroup;
        g = (HangoutActivity)hangoutfragment.getActivity();
        n = g.getResources().getDimensionPixelSize(g.ep);
        k = (LinearLayout)viewgroup.findViewById(h.cw);
        l = (HangoutSelfMenu)viewgroup.findViewById(h.cx);
        m = (HangoutSelfMenu)viewgroup.findViewById(h.cg);
        k.setVisibility(4);
        q = false;
        ((Button)viewgroup.findViewById(h.dk)).setOnClickListener(v);
    }

    private Animation a(int i1, int j1, LinearLayout linearlayout, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = linearlayout.getLayoutParams();
        int k1 = j1 - i1;
        String s1;
        String s2;
        if (linearlayout == l)
        {
            s1 = "menu";
        } else
        {
            s1 = "filmstrip";
        }
        if (flag)
        {
            s2 = "up";
        } else
        {
            s2 = "down";
        }
        ebw.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 68 + String.valueOf(s2).length())).append("createAnimation for ").append(s1).append(" ").append(j1).append(" -> ").append(i1).append(" (").append(s2).append(") delta=").append(k1).toString());
        linearlayout = new bql(this, layoutparams, i1, k1, linearlayout, flag);
        linearlayout.setDuration(g.getResources().getInteger(g.eX));
        return linearlayout;
    }

    static bqq a(bqf bqf1)
    {
        return bqf1.s;
    }

    static void a(bqf bqf1, HangoutSelfMenu hangoutselfmenu)
    {
        bqf1.a(hangoutselfmenu);
    }

    private void a(HangoutSelfMenu hangoutselfmenu)
    {
        if (!hangoutselfmenu.a())
        {
            hangoutselfmenu.a(p, (new gjr()).f(), d.t());
        }
    }

    static void b(bqf bqf1)
    {
        bqf1.l();
    }

    static void c(bqf bqf1)
    {
        bqf1.r();
    }

    static bnd d(bqf bqf1)
    {
        return bqf1.d;
    }

    static void e(bqf bqf1)
    {
        if (bqf1.q())
        {
            bqf1.g();
            return;
        } else
        {
            bqf1.l();
            bqf1.t();
            return;
        }
    }

    static void f(bqf bqf1)
    {
        bqf1.s();
    }

    static bot g(bqf bqf1)
    {
        return bqf1.p;
    }

    static Runnable h(bqf bqf1)
    {
        return bqf1.j;
    }

    static boolean i(bqf bqf1)
    {
        return bqf1.q;
    }

    static HangoutSelfMenu j(bqf bqf1)
    {
        return bqf1.m;
    }

    static long k()
    {
        return b;
    }

    static HangoutSelfMenu k(bqf bqf1)
    {
        return bqf1.l;
    }

    private void l()
    {
        Object obj1 = null;
        boolean flag3 = true;
        boolean flag2 = false;
        Object obj = d.t();
        int i1;
        int j1;
        boolean flag;
        boolean flag1;
        int k1;
        boolean flag4;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((bpd) (obj)).r();
        }
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((gcg) (obj)).m();
        }
        flag4 = d.v();
        if (obj == null)
        {
            i1 = 1;
        } else
        if (((Collection) (obj)).size() == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (p == null)
        {
            j1 = 0;
        } else
        {
            j1 = p.g();
        }
        if ((j1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((j1 & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = bnd.l();
        if (obj != null && ((gih) (obj)).a())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = j1;
        if (obj != null)
        {
            k1 = j1;
            if (((gih) (obj)).b())
            {
                k1 = j1 + 1;
            }
        }
        if (flag && (m() || i1 != 0))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && flag1 && !flag4 && k1 > 1 && obj != null && ((gih) (obj)).h())
        {
            i1 = ((flag3) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        if (p != null)
        {
            obj = p;
            if (i1 != 0)
            {
                i1 = ((flag2) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            ((bot) (obj)).b(i1);
        }
    }

    private boolean m()
    {
        Object obj1 = null;
        Object obj = d.t();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((bpd) (obj)).r();
        }
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((gcg) (obj)).m();
        }
        return obj != null && ((Collection) (obj)).size() == 1;
    }

    private int n()
    {
        android.view.ViewGroup.LayoutParams layoutparams = l.getLayoutParams();
        if (layoutparams != null && layoutparams.height >= 0)
        {
            return layoutparams.height;
        } else
        {
            return g.getResources().getDimensionPixelSize(g.eo);
        }
    }

    private int o()
    {
        android.view.ViewGroup.LayoutParams layoutparams = k.getLayoutParams();
        if (layoutparams != null && layoutparams.height >= 0)
        {
            return layoutparams.height;
        } else
        {
            return g.getResources().getDimensionPixelSize(g.er);
        }
    }

    private void p()
    {
        Animation animation = l.getAnimation();
        if (animation != null)
        {
            animation.cancel();
        }
        animation = k.getAnimation();
        if (animation != null)
        {
            animation.cancel();
        }
    }

    private boolean q()
    {
        bpd bpd1;
        if (!d.v())
        {
            if (((bpd1 = d.t()) == null || (bpd1.M() & 2) != 0 || !m()) && !p.i() && d.u())
            {
                return true;
            }
        }
        return false;
    }

    private void r()
    {
        ebw.a("Babel_calls", "restartAutoHideTimerIfDismissible");
        if (!o && q())
        {
            s();
            g.a(i, a);
        }
    }

    private void s()
    {
        ebw.a("Babel_calls", "clearAutoHideTimer");
        Runnable runnable = i;
        g.y().removeCallbacks(runnable);
    }

    private void t()
    {
        boolean flag1 = true;
        float f2 = 1.0F;
        p();
        float f1;
        Object obj;
        boolean flag;
        int i1;
        if (s == bqq.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = (android.widget.FrameLayout.LayoutParams)l.getLayoutParams();
        if (flag)
        {
            i1 = n + dzk.a(h, g);
        } else
        {
            i1 = -n();
        }
        obj.bottomMargin = i1;
        l.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = l;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        ((HangoutSelfMenu) (obj)).setAlpha(f1);
        if (s == bqq.c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        obj = (android.widget.FrameLayout.LayoutParams)k.getLayoutParams();
        if (flag)
        {
            i1 = n + dzk.a(h, g);
        } else
        {
            i1 = -o();
        }
        obj.bottomMargin = i1;
        k.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = k;
        if (flag)
        {
            f1 = f2;
        } else
        {
            f1 = 0.0F;
        }
        ((LinearLayout) (obj)).setAlpha(f1);
    }

    private void u()
    {
        g.g().f();
    }

    private void v()
    {
        g.g().e();
    }

    public String a(Context context)
    {
        String s1 = "";
        if (s == bqq.b)
        {
            s1 = context.getString(l.eb);
        } else
        if (s == bqq.c)
        {
            return context.getString(l.eH);
        }
        return s1;
    }

    public void a(int i1)
    {
        if (i1 == 2)
        {
            c();
        }
    }

    public void a(bot bot1)
    {
        p = bot1;
        if (bot1.c() == 1)
        {
            bot1.a(0);
            a(m);
        } else
        {
            a(l);
        }
        o = dzj.b();
        if (q() && !o)
        {
            s = bqq.c;
            k.setVisibility(0);
            dzk.a(h);
        } else
        {
            s = bqq.b;
            c();
        }
        c.a(e);
        d.a(f);
        l();
        t();
        ((btl)hgx.a(bot1.b(), btl)).a(new bqn(this));
    }

    public void a(String s1)
    {
        if ((ahk)hgx.b(g.getApplicationContext(), ahk) != null)
        {
            new bqk(this, s1);
            return;
        } else
        {
            bpq.a(s1).a(p.e(), null);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            s();
            return;
        } else
        {
            r();
            return;
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            if (flag)
            {
                u();
                dzk.a(h);
            } else
            if (s != bqq.a)
            {
                v();
                dzk.a(h, true);
                t();
                return;
            }
        }
    }

    public boolean a()
    {
        return j();
    }

    String b(Context context)
    {
        String s1 = "";
        if (s == bqq.b)
        {
            s1 = context.getString(l.cI);
        } else
        if (s == bqq.c)
        {
            return context.getString(l.cJ);
        }
        return s1;
    }

    public void b()
    {
        g.g().a(new bqi(this));
    }

    void c()
    {
        l();
        t();
        if ((ahk)hgx.b(g.getApplicationContext(), ahk) != null)
        {
            p.c();
        }
        p.j();
        v();
        dzk.a(h, true);
        p();
        if (p.c() == 2)
        {
            String s1 = String.valueOf(s);
            ebw.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 18)).append("animateControlsUp ").append(s1).toString());
            if (s != bqq.b)
            {
                l.startAnimation(a(-n(), n + dzk.a(h, g), l, true));
            }
            if (s == bqq.c)
            {
                k.startAnimation(a(n, -o(), k, false));
            }
            k.setVisibility(4);
        }
        r();
        s = bqq.b;
    }

    public void d()
    {
        Object obj = d.t();
        Object obj1;
        ani ani;
        ArrayList arraylist;
        boolean flag;
        if (obj != null && ((bpd) (obj)).i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((bpd) (obj)).N())
        {
            obj = atd.c;
        } else
        {
            obj = atd.d;
        }
        ani = p.a();
        arraylist = new ArrayList();
        obj1 = d.r().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            gjr gjr1 = (gjr)((Iterator) (obj1)).next();
            if (!gjr1.g() && gjr1.m())
            {
                arraylist.add(g.a(g.a(gjr1.h(), null, null), gjr1.b(), null, null, gjr1.c(), null));
            }
        } while (true);
        if (flag)
        {
            obj1 = cnd.e;
        } else
        {
            obj1 = cnd.f;
        }
        obj = g.a(ani, null, arraylist, ((cnd) (obj1)), ((atd) (obj)));
        g.startActivity(((android.content.Intent) (obj)));
    }

    public void e()
    {
        g.b(1533);
        gih gih1 = bnd.l();
        if (gih1.i() == 1)
        {
            gih1.a(2);
            ebw.c("Babel_calls", "Switching to rear camera");
        } else
        {
            gih1.a(1);
            ebw.c("Babel_calls", "Switching to front camera");
        }
        r();
        p.j();
        if (dzj.b())
        {
            gbh.b("Switch camera button view is null after being tapped.", h.findViewById(h.co));
        }
    }

    public void f()
    {
        Object obj;
        giv giv1;
        giv1 = null;
        g.b(1531);
        obj = d.k();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = giv1;
_L4:
        giw giw1;
        giv agiv[];
        Set set;
        int i1;
        if (obj == null)
        {
            return;
        } else
        {
            gbh.a(u.containsKey(obj));
            d.k().a(((giv) (obj)));
            p.k();
            g.b(g.a((Integer)u.get(obj), 0));
            return;
        }
_L2:
        giw1 = ((gir) (obj)).b();
        set = ((gir) (obj)).c();
        obj = giv1;
        if (giw1 == giw.e) goto _L4; else goto _L3
_L3:
        obj = giv1;
        if (giw1 == giw.f) goto _L4; else goto _L5
_L5:
        giv1 = (giv)t.get(giw1);
        agiv = (giv[])set.toArray(new giv[set.size()]);
        obj = agiv[0];
        i1 = 0;
_L6:
        if (i1 < agiv.length)
        {
label0:
            {
                if (!agiv[i1].equals(giv1))
                {
                    break label0;
                }
                obj = agiv[(i1 + 1) % agiv.length];
            }
        }
          goto _L4
        i1++;
          goto _L6
    }

    void g()
    {
        ebw.c("Babel_calls", "MenuController.dismissAllMenus");
        if (!q())
        {
            c();
            return;
        }
        u();
        dzk.a(h);
        p();
        int i1 = p.c();
        ebw.c("Babel_calls", (new StringBuilder(54)).append("MenuController.animateControlsDown uiState=").append(i1).toString());
        if (p.c() == 2)
        {
            String s1 = String.valueOf(s);
            ebw.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 47)).append("MenuController.animateControlsDown visibleMenu=").append(s1).toString());
            int j1 = dzk.b(g);
            if (s == bqq.b)
            {
                l.startAnimation(a(j1 + n, -n(), l, false));
            }
            if (s != bqq.c)
            {
                k.startAnimation(a(-o(), n, k, true));
            }
            k.setVisibility(0);
            if (!r)
            {
                ((ParticipantTrayView)k).b();
                r = true;
            }
        }
        s = bqq.c;
        s();
    }

    void h()
    {
        r();
    }

    void i()
    {
        if (s == bqq.c)
        {
            c();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void i_()
    {
        c.b(e);
        d.b(f);
        l.b();
        m.b();
        s();
        Runnable runnable = j;
        g.y().removeCallbacks(runnable);
        p = null;
    }

    public boolean j()
    {
        gir gir1 = d.k();
        return gir1 != null && gir1.b() == giw.b;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        configuration = l;
        bqm bqm1 = new bqm(this);
        android.animation.LayoutTransition layouttransition = configuration.getLayoutTransition();
        configuration.setLayoutTransition(null);
        bqm1.run();
        configuration.setLayoutTransition(layouttransition);
        t();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
        b = TimeUnit.SECONDS.toMillis(1L);
        t = jlr.a(giw.a, giv.a, giw.d, giv.c, giw.b, giv.b, giw.c, giv.d);
        u = jlr.a(giv.a, Integer.valueOf(2063), giv.c, Integer.valueOf(2062), giv.b, Integer.valueOf(2064), giv.d, Integer.valueOf(2065));
    }
}
