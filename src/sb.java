// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class sb extends pq
    implements ue
{

    private static final Interpolator h = new AccelerateInterpolator();
    private static final Interpolator i = new DecelerateInterpolator();
    private static final boolean j;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private sp G;
    private boolean H;
    sf a;
    vt b;
    vu c;
    boolean d;
    final me e;
    final me f;
    final mg g;
    private Context k;
    private Context l;
    private Activity m;
    private Dialog n;
    private ActionBarOverlayLayout o;
    private ActionBarContainer p;
    private uv q;
    private ActionBarContextView r;
    private View s;
    private vc t;
    private ArrayList u;
    private int v;
    private boolean w;
    private boolean x;
    private ArrayList y;
    private boolean z;

    public sb(Activity activity, boolean flag)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        A = 0;
        B = true;
        F = true;
        e = new sc(this);
        f = new sd(this);
        g = new se(this);
        m = activity;
        activity = activity.getWindow().getDecorView();
        b(activity);
        if (!flag)
        {
            s = activity.findViewById(0x1020002);
        }
    }

    public sb(Dialog dialog)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        A = 0;
        B = true;
        F = true;
        e = new sc(this);
        f = new sd(this);
        g = new se(this);
        n = dialog;
        b(dialog.getWindow().getDecorView());
    }

    private void a(int i1, int j1)
    {
        int k1 = q.l();
        if ((j1 & 4) != 0)
        {
            w = true;
        }
        q.a(k1 & ~j1 | i1 & j1);
    }

    static boolean a(sb sb1)
    {
        return sb1.B;
    }

    static boolean a(boolean flag, boolean flag1)
    {
        return a(flag, flag1, false);
    }

    private static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    static View b(sb sb1)
    {
        return sb1.s;
    }

    private void b(View view)
    {
        Object obj;
        o = (ActionBarOverlayLayout)view.findViewById(g.ba);
        if (o != null)
        {
            o.a(this);
        }
        obj = view.findViewById(g.aL);
        if (!(obj instanceof uv)) goto _L2; else goto _L1
_L1:
        obj = (uv)obj;
_L4:
        q = ((uv) (obj));
        r = (ActionBarContextView)view.findViewById(g.aQ);
        p = (ActionBarContainer)view.findViewById(g.aN);
        if (q == null || r == null || p == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_196;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).s();
        if (true) goto _L4; else goto _L3
_L3:
        if ((new StringBuilder("Can't make a decor toolbar out of ")).append(obj).toString() != null)
        {
            view = obj.getClass().getSimpleName();
        } else
        {
            view = "null";
        }
        throw new IllegalStateException(view);
        k = q.b();
        int i1;
        if ((q.l() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            w = true;
        }
        view = sh.a(k);
        view.f();
        g(view.d());
        view = k.obtainStyledAttributes(null, rq.a, g.g, 0);
        if (view.getBoolean(rq.k, false))
        {
            h();
        }
        i1 = view.getDimensionPixelSize(rq.i, 0);
        if (i1 != 0)
        {
            a(i1);
        }
        view.recycle();
        return;
    }

    static ActionBarContainer c(sb sb1)
    {
        return sb1.p;
    }

    static sp d(sb sb1)
    {
        sb1.G = null;
        return null;
    }

    static ActionBarOverlayLayout e(sb sb1)
    {
        return sb1.o;
    }

    static boolean f(sb sb1)
    {
        return sb1.C;
    }

    private void g(boolean flag)
    {
        boolean flag2 = true;
        z = flag;
        Object obj;
        boolean flag1;
        if (!z)
        {
            q.a(null);
            p.a(t);
        } else
        {
            p.a(null);
            q.a(t);
        }
        if (o() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (t != null)
        {
            if (flag1)
            {
                t.setVisibility(0);
                if (o != null)
                {
                    kb.s(o);
                }
            } else
            {
                t.setVisibility(8);
            }
        }
        obj = q;
        if (!z && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((uv) (obj)).a(flag);
        obj = o;
        if (!z && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).a(flag);
    }

    static boolean g(sb sb1)
    {
        return sb1.D;
    }

    static ActionBarContextView h(sb sb1)
    {
        return sb1.r;
    }

    private void h(boolean flag)
    {
        if (a(C, D, E))
        {
            if (!F)
            {
                F = true;
                i(flag);
            }
        } else
        if (F)
        {
            F = false;
            j(flag);
            return;
        }
    }

    static uv i(sb sb1)
    {
        return sb1.q;
    }

    private void i(boolean flag)
    {
        if (G != null)
        {
            G.b();
        }
        p.setVisibility(0);
        if (A == 0 && j && (H || flag))
        {
            kb.b(p, 0.0F);
            float f2 = -p.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                p.getLocationInWindow(ai);
                f1 = f2 - (float)ai[1];
            }
            kb.b(p, f1);
            sp sp1 = new sp();
            lr lr1 = kb.p(p).c(0.0F);
            lr1.a(g);
            sp1.a(lr1);
            if (B && s != null)
            {
                kb.b(s, f1);
                sp1.a(kb.p(s).c(0.0F));
            }
            sp1.a(i);
            sp1.c();
            sp1.a(f);
            G = sp1;
            sp1.a();
        } else
        {
            kb.c(p, 1.0F);
            kb.b(p, 0.0F);
            if (B && s != null)
            {
                kb.b(s, 0.0F);
            }
            f.b(null);
        }
        if (o != null)
        {
            kb.s(o);
        }
    }

    static Context j(sb sb1)
    {
        return sb1.k;
    }

    private void j(boolean flag)
    {
        if (G != null)
        {
            G.b();
        }
        if (A == 0 && j && (H || flag))
        {
            kb.c(p, 1.0F);
            p.a(true);
            sp sp1 = new sp();
            float f2 = -p.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                p.getLocationInWindow(ai);
                f1 = f2 - (float)ai[1];
            }
            lr lr1 = kb.p(p).c(f1);
            lr1.a(g);
            sp1.a(lr1);
            if (B && s != null)
            {
                sp1.a(kb.p(s).c(f1));
            }
            sp1.a(h);
            sp1.c();
            sp1.a(e);
            G = sp1;
            sp1.a();
            return;
        } else
        {
            e.b(null);
            return;
        }
    }

    private int o()
    {
        return q.m();
    }

    public vt a(vu vu1)
    {
        if (a != null)
        {
            a.c();
        }
        o.b(false);
        r.e();
        vu1 = new sf(this, r.getContext(), vu1);
        if (vu1.e())
        {
            vu1.d();
            r.a(vu1);
            f(true);
            r.sendAccessibilityEvent(32);
            a = vu1;
            return vu1;
        } else
        {
            return null;
        }
    }

    public void a()
    {
        a(0, 8);
    }

    public void a(float f1)
    {
        kb.f(p, f1);
    }

    public void a(int i1)
    {
        a(((CharSequence) (k.getString(i1))));
    }

    public void a(Configuration configuration)
    {
        g(sh.a(k).d());
    }

    public void a(Drawable drawable)
    {
        q.a(drawable);
    }

    public void a(View view)
    {
        q.a(view);
    }

    public void a(CharSequence charsequence)
    {
        q.b(charsequence);
    }

    public void a(ps ps1)
    {
        y.add(ps1);
    }

    public void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public void b()
    {
        a(16, 16);
    }

    public void b(int i1)
    {
        q.b(i1);
    }

    public void b(CharSequence charsequence)
    {
        q.c(charsequence);
    }

    public void b(boolean flag)
    {
        if (!w)
        {
            a(flag);
        }
    }

    public View c()
    {
        return q.n();
    }

    public void c(int i1)
    {
        q.c(i1);
    }

    public void c(CharSequence charsequence)
    {
        q.a(charsequence);
    }

    public void c(boolean flag)
    {
        H = flag;
        if (!flag && G != null)
        {
            G.b();
        }
    }

    public int d()
    {
        return q.l();
    }

    public void d(int i1)
    {
        A = i1;
    }

    public void d(boolean flag)
    {
        if (flag != x)
        {
            x = flag;
            int j1 = y.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((ps)y.get(i1)).a(flag);
                i1++;
            }
        }
    }

    public void e()
    {
        if (C)
        {
            C = false;
            h(false);
        }
    }

    public void e(boolean flag)
    {
        B = flag;
    }

    public void f()
    {
        if (!C)
        {
            C = true;
            h(false);
        }
    }

    public void f(boolean flag)
    {
        lr lr1;
        lr lr2;
        sp sp1;
        if (flag)
        {
            if (!E)
            {
                E = true;
                if (o != null)
                {
                    o.c();
                }
                h(false);
            }
        } else
        if (E)
        {
            E = false;
            if (o != null)
            {
                o.c();
            }
            h(false);
        }
        if (flag)
        {
            lr1 = q.a(8, 100L);
            lr2 = r.a(0, 200L);
        } else
        {
            lr2 = q.a(0, 200L);
            lr1 = r.a(8, 100L);
        }
        sp1 = new sp();
        sp1.a(lr1, lr2);
        sp1.a();
    }

    public Context g()
    {
        if (l == null)
        {
            TypedValue typedvalue = new TypedValue();
            k.getTheme().resolveAttribute(g.k, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                l = new ContextThemeWrapper(k, i1);
            } else
            {
                l = k;
            }
        }
        return l;
    }

    public void h()
    {
        if (!o.b())
        {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else
        {
            d = true;
            o.b(true);
            return;
        }
    }

    public boolean j()
    {
        if (q != null && q.c())
        {
            q.d();
            return true;
        } else
        {
            return false;
        }
    }

    void k()
    {
        if (c != null)
        {
            c.a(b);
            b = null;
            c = null;
        }
    }

    public void l()
    {
        if (D)
        {
            D = false;
            h(true);
        }
    }

    public void m()
    {
        if (!D)
        {
            D = true;
            h(true);
        }
    }

    public void n()
    {
        if (G != null)
        {
            G.b();
            G = null;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
    }
}
