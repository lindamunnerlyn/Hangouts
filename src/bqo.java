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

public final class bqo
    implements bpb, bsc, bse
{

    private static final long a;
    private static final long b;
    private static final jso t;
    private static final jso u;
    private final boo c = boo.a();
    private final bnk d = bnk.a();
    private final bqy e = new bqy(this);
    private final bqx f = new bqx(this);
    private final HangoutActivity g;
    private final View h;
    private final Runnable i = new bqp(this);
    private final Runnable j = new bqq(this);
    private final LinearLayout k;
    private final HangoutSelfMenu l;
    private final HangoutSelfMenu m;
    private final int n;
    private boolean o;
    private bpc p;
    private boolean q;
    private boolean r;
    private bqz s;
    private final android.view.View.OnClickListener v = new bqs(this);

    public bqo(HangoutFragment hangoutfragment, ViewGroup viewgroup)
    {
        r = false;
        s = bqz.a;
        h = viewgroup;
        g = (HangoutActivity)hangoutfragment.getActivity();
        n = g.getResources().getDimensionPixelSize(g.en);
        k = (LinearLayout)viewgroup.findViewById(h.cm);
        l = (HangoutSelfMenu)viewgroup.findViewById(h.cn);
        m = (HangoutSelfMenu)viewgroup.findViewById(h.bW);
        k.setVisibility(4);
        q = false;
        ((Button)viewgroup.findViewById(h.cY)).setOnClickListener(v);
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
        eev.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 68 + String.valueOf(s2).length())).append("createAnimation for ").append(s1).append(" ").append(j1).append(" -> ").append(i1).append(" (").append(s2).append(") delta=").append(k1).toString());
        linearlayout = new bqu(this, layoutparams, i1, k1, linearlayout, flag);
        linearlayout.setDuration(g.getResources().getInteger(g.eV));
        return linearlayout;
    }

    static bqz a(bqo bqo1)
    {
        return bqo1.s;
    }

    static void a(bqo bqo1, HangoutSelfMenu hangoutselfmenu)
    {
        bqo1.a(hangoutselfmenu);
    }

    private void a(HangoutSelfMenu hangoutselfmenu)
    {
        if (!hangoutselfmenu.a())
        {
            hangoutselfmenu.a(p, (new gmt()).f(), d.s());
        }
    }

    static void b(bqo bqo1)
    {
        bqo1.l();
    }

    static void c(bqo bqo1)
    {
        bqo1.r();
    }

    static bnk d(bqo bqo1)
    {
        return bqo1.d;
    }

    static void e(bqo bqo1)
    {
        if (bqo1.q())
        {
            bqo1.g();
            return;
        } else
        {
            bqo1.l();
            bqo1.t();
            return;
        }
    }

    static void f(bqo bqo1)
    {
        bqo1.s();
    }

    static bpc g(bqo bqo1)
    {
        return bqo1.p;
    }

    static Runnable h(bqo bqo1)
    {
        return bqo1.j;
    }

    static boolean i(bqo bqo1)
    {
        return bqo1.q;
    }

    static HangoutSelfMenu j(bqo bqo1)
    {
        return bqo1.m;
    }

    static long k()
    {
        return b;
    }

    static HangoutSelfMenu k(bqo bqo1)
    {
        return bqo1.l;
    }

    private void l()
    {
        Object obj1 = null;
        boolean flag3 = true;
        boolean flag2 = false;
        Object obj = d.s();
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
            obj = ((bpm) (obj)).q();
        }
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((geu) (obj)).m();
        }
        flag4 = d.u();
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
        obj = bnk.k();
        if (obj != null && ((glj) (obj)).a())
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
            if (((glj) (obj)).b())
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
        if (i1 == 0 && flag1 && !flag4 && k1 > 1 && obj != null && ((glj) (obj)).h())
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
            ((bpc) (obj)).b(i1);
        }
    }

    private boolean m()
    {
        Object obj1 = null;
        Object obj = d.s();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((bpm) (obj)).q();
        }
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((geu) (obj)).m();
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
            return g.getResources().getDimensionPixelSize(g.em);
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
            return g.getResources().getDimensionPixelSize(g.ep);
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
        bpm bpm1;
        if (!d.u())
        {
            if (((bpm1 = d.s()) == null || (bpm1.L() & 2) != 0 || !m()) && !p.i() && d.t())
            {
                return true;
            }
        }
        return false;
    }

    private void r()
    {
        eev.a("Babel_calls", "restartAutoHideTimerIfDismissible");
        if (!o && q())
        {
            s();
            g.a(i, a);
        }
    }

    private void s()
    {
        eev.a("Babel_calls", "clearAutoHideTimer");
        Runnable runnable = i;
        g.x().removeCallbacks(runnable);
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
        if (s == bqz.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = (android.widget.FrameLayout.LayoutParams)l.getLayoutParams();
        if (flag)
        {
            i1 = n + eco.a(h, g);
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
        if (s == bqz.c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        obj = (android.widget.FrameLayout.LayoutParams)k.getLayoutParams();
        if (flag)
        {
            i1 = n + eco.a(h, g);
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
        eco.a(h);
    }

    private void v()
    {
        g.g().e();
        eco.a(h, true);
    }

    public String a(Context context)
    {
        String s1 = "";
        if (s == bqz.b)
        {
            s1 = context.getString(l.dK);
        } else
        if (s == bqz.c)
        {
            return context.getString(l.eq);
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

    public void a(bpc bpc1)
    {
        p = bpc1;
        if (bpc1.c() == 1)
        {
            bpc1.a(0);
            a(m);
        } else
        {
            a(l);
        }
        o = ecn.b();
        if (q() && !o)
        {
            s = bqz.c;
            k.setVisibility(0);
            u();
        } else
        {
            s = bqz.b;
            c();
        }
        c.a(e);
        d.a(f);
        l();
        t();
        ((bty)hlp.a(bpc1.b(), bty)).a(new bqw(this));
    }

    public void a(String s1)
    {
        if ((ahc)hlp.b(g.getApplicationContext(), ahc) != null)
        {
            new bqt(this, s1);
            return;
        } else
        {
            bpz.a(s1).a(p.e(), null);
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
            } else
            if (s != bqz.a)
            {
                v();
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
        if (s == bqz.b)
        {
            s1 = context.getString(l.cr);
        } else
        if (s == bqz.c)
        {
            return context.getString(l.cs);
        }
        return s1;
    }

    public void b()
    {
        g.g().a(new bqr(this));
    }

    void c()
    {
        l();
        t();
        if ((ahc)hlp.b(g.getApplicationContext(), ahc) != null)
        {
            p.c();
        }
        p.j();
        v();
        p();
        if (p.c() == 2)
        {
            String s1 = String.valueOf(s);
            eev.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 18)).append("animateControlsUp ").append(s1).toString());
            if (s != bqz.b)
            {
                l.startAnimation(a(-n(), n + eco.a(h, g), l, true));
            }
            if (s == bqz.c)
            {
                k.startAnimation(a(n, -o(), k, false));
            }
            k.setVisibility(4);
        }
        r();
        s = bqz.b;
    }

    public void d()
    {
        Object obj = d.s();
        Object obj1;
        aoa aoa;
        ArrayList arraylist;
        boolean flag;
        if (obj != null && ((bpm) (obj)).i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((bpm) (obj)).M())
        {
            obj = atu.c;
        } else
        {
            obj = atu.d;
        }
        aoa = p.a();
        arraylist = new ArrayList();
        obj1 = d.q().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            gmt gmt1 = (gmt)((Iterator) (obj1)).next();
            if (!gmt1.g() && gmt1.m())
            {
                arraylist.add(g.a(g.a(gmt1.h(), null, null), gmt1.b(), null, null, gmt1.c(), null));
            }
        } while (true);
        if (flag)
        {
            obj1 = cov.e;
        } else
        {
            obj1 = cov.f;
        }
        obj = g.a(aoa, null, arraylist, ((cov) (obj1)), ((atu) (obj)));
        g.startActivity(((android.content.Intent) (obj)));
    }

    public void e()
    {
        g.b(1533);
        glj glj1 = bnk.k();
        if (glj1.i() == 1)
        {
            glj1.a(2);
            eev.c("Babel_calls", "Switching to rear camera");
        } else
        {
            glj1.a(1);
            eev.c("Babel_calls", "Switching to front camera");
        }
        r();
        p.j();
        if (ecn.b())
        {
            gdv.b("Switch camera button view is null after being tapped.", h.findViewById(h.ce));
        }
    }

    public void f()
    {
        Object obj;
        glx glx1;
        glx1 = null;
        g.b(1531);
        obj = d.j();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = glx1;
_L4:
        gly gly1;
        glx aglx[];
        Set set;
        int i1;
        if (obj == null)
        {
            return;
        } else
        {
            gdv.a("Expected condition to be true", u.containsKey(obj));
            d.j().a(((glx) (obj)));
            p.k();
            g.b(g.a((Integer)u.get(obj), 0));
            return;
        }
_L2:
        gly1 = ((glt) (obj)).b();
        set = ((glt) (obj)).c();
        obj = glx1;
        if (gly1 == gly.e) goto _L4; else goto _L3
_L3:
        obj = glx1;
        if (gly1 == gly.f) goto _L4; else goto _L5
_L5:
        glx1 = (glx)t.get(gly1);
        aglx = (glx[])set.toArray(new glx[set.size()]);
        obj = aglx[0];
        i1 = 0;
_L6:
        if (i1 < aglx.length)
        {
label0:
            {
                if (!aglx[i1].equals(glx1))
                {
                    break label0;
                }
                obj = aglx[(i1 + 1) % aglx.length];
            }
        }
          goto _L4
        i1++;
          goto _L6
    }

    void g()
    {
        eev.c("Babel_calls", "MenuController.dismissAllMenus");
        if (!q())
        {
            c();
            return;
        }
        u();
        p();
        int i1 = p.c();
        eev.c("Babel_calls", (new StringBuilder(54)).append("MenuController.animateControlsDown uiState=").append(i1).toString());
        if (p.c() == 2)
        {
            String s1 = String.valueOf(s);
            eev.c("Babel_calls", (new StringBuilder(String.valueOf(s1).length() + 47)).append("MenuController.animateControlsDown visibleMenu=").append(s1).toString());
            int j1 = eco.b(g);
            if (s == bqz.b)
            {
                l.startAnimation(a(j1 + n, -n(), l, false));
            }
            if (s != bqz.c)
            {
                k.startAnimation(a(-o(), n, k, true));
            }
            k.setVisibility(0);
            if (!r)
            {
                ((ParticipantTrayView)k).c();
                r = true;
            }
        }
        s = bqz.c;
        s();
    }

    void h()
    {
        r();
    }

    void i()
    {
        if (s == bqz.c)
        {
            c();
            return;
        } else
        {
            g();
            return;
        }
    }

    public boolean j()
    {
        glt glt1 = d.j();
        return glt1 != null && glt1.b() == gly.b;
    }

    public void j_()
    {
        c.b(e);
        d.b(f);
        l.b();
        m.b();
        s();
        Runnable runnable = j;
        g.x().removeCallbacks(runnable);
        p = null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        configuration = l;
        bqv bqv1 = new bqv(this);
        android.animation.LayoutTransition layouttransition = configuration.getLayoutTransition();
        configuration.setLayoutTransition(null);
        bqv1.run();
        configuration.setLayoutTransition(layouttransition);
        t();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
        b = TimeUnit.SECONDS.toMillis(1L);
        t = jso.a(gly.a, glx.a, gly.d, glx.c, gly.b, glx.b, gly.c, glx.d);
        u = jso.a(glx.a, Integer.valueOf(2063), glx.c, Integer.valueOf(2062), glx.b, Integer.valueOf(2064), glx.d, Integer.valueOf(2065));
    }
}
