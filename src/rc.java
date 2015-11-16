// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class rc extends qu
    implements iv, tb
{

    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private rn G[];
    private rn H;
    private final Runnable I = new rd(this);
    private boolean J;
    private Rect K;
    private Rect L;
    private rt M;
    vt o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    lr s;
    boolean t;
    int u;
    private uu v;
    private rj w;
    private ro x;
    private boolean y;
    private ViewGroup z;

    rc(Context context, Window window, qs qs1)
    {
        super(context, window, qs1);
        s = null;
    }

    static void a(rc rc1, int k)
    {
        rn rn1 = rc1.e(k);
        if (rn1.j != null)
        {
            Bundle bundle = new Bundle();
            rn1.j.a(bundle);
            if (bundle.size() > 0)
            {
                rn1.s = bundle;
            }
            rn1.j.g();
            rn1.j.clear();
        }
        rn1.r = true;
        rn1.q = true;
        if ((k == 108 || k == 0) && rc1.v != null)
        {
            rn rn2 = rc1.e(0);
            if (rn2 != null)
            {
                rn2.m = false;
                rc1.b(rn2, ((KeyEvent) (null)));
            }
        }
    }

    private void a(rn rn1, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!rn1.o && !super.n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (rn1.a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        WindowManager windowmanager;
        obj = super.b.getCallback();
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(rn1.a, rn1.j))
        {
            a(rn1, true);
            return;
        }
        windowmanager = (WindowManager)a.getSystemService("window");
        if (windowmanager == null || !b(rn1, keyevent)) goto _L1; else goto _L4
_L4:
        if (rn1.g != null && !rn1.q) goto _L6; else goto _L5
_L5:
        if (rn1.g != null) goto _L8; else goto _L7
_L7:
        rn1.a(k());
        rn1.g = new rm(this, rn1.l);
        rn1.c = 81;
        if (rn1.g == null) goto _L1; else goto _L9
_L9:
        int k;
        if (rn1.i != null)
        {
            rn1.h = rn1.i;
            k = 1;
        } else
        {
label0:
            {
                if (rn1.j == null)
                {
                    break label0;
                }
                if (x == null)
                {
                    x = new ro(this);
                }
                rn1.h = (View)rn1.a(x);
                if (rn1.h == null)
                {
                    break label0;
                }
                k = 1;
            }
        }
_L11:
        if (k == 0 || !rn1.a()) goto _L1; else goto _L10
_L10:
        keyevent = rn1.h.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        k = rn1.b;
        rn1.g.setBackgroundResource(k);
        ViewParent viewparent = rn1.h.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(rn1.h);
        }
        rn1.g.addView(rn1.h, keyevent);
        if (!rn1.h.hasFocus())
        {
            rn1.h.requestFocus();
        }
        k = -2;
_L15:
        rn1.n = false;
        keyevent = new android.view.WindowManager.LayoutParams(k, -2, rn1.d, rn1.e, 1002, 0x820000, -3);
        keyevent.gravity = rn1.c;
        keyevent.windowAnimations = rn1.f;
        windowmanager.addView(rn1.g, keyevent);
        rn1.o = true;
        return;
_L8:
        if (rn1.q && rn1.g.getChildCount() > 0)
        {
            rn1.g.removeAllViews();
        }
          goto _L9
        k = 0;
          goto _L11
_L6:
        if (rn1.i == null) goto _L13; else goto _L12
_L12:
        keyevent = rn1.i.getLayoutParams();
        if (keyevent == null) goto _L13; else goto _L14
_L14:
        k = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L15; else goto _L13
_L13:
        k = -2;
          goto _L15
    }

    private boolean a(rn rn1, int k, KeyEvent keyevent)
    {
        while (keyevent.isSystem() || !rn1.m && !b(rn1, keyevent) || rn1.j == null) 
        {
            return false;
        }
        return rn1.j.performShortcut(k, keyevent, 1);
    }

    static int b(rc rc1, int k)
    {
        int i1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int l;
        if (rc1.p != null && (rc1.p.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)rc1.p.getLayoutParams();
            if (rc1.p.isShown())
            {
                if (rc1.K == null)
                {
                    rc1.K = new Rect();
                    rc1.L = new Rect();
                }
                Rect rect = rc1.K;
                Rect rect1 = rc1.L;
                rect.set(0, k, 0, 0);
                vr.a(rc1.A, rect, rect1);
                if (rect1.top == 0)
                {
                    l = k;
                } else
                {
                    l = 0;
                }
                if (marginlayoutparams.topMargin != l)
                {
                    marginlayoutparams.topMargin = k;
                    if (rc1.C == null)
                    {
                        rc1.C = new View(rc1.a);
                        rc1.C.setBackgroundColor(rc1.a.getResources().getColor(g.V));
                        rc1.A.addView(rc1.C, -1, new android.view.ViewGroup.LayoutParams(-1, k));
                        l = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = rc1.C.getLayoutParams();
                        if (layoutparams.height != k)
                        {
                            layoutparams.height = k;
                            rc1.C.setLayoutParams(layoutparams);
                        }
                        l = 1;
                    }
                } else
                {
                    l = 0;
                }
                if (rc1.C == null)
                {
                    flag = false;
                }
                i1 = k;
                if (!rc1.j)
                {
                    i1 = k;
                    if (flag)
                    {
                        i1 = 0;
                    }
                }
                k = i1;
                i1 = l;
                l = ((flag) ? 1 : 0);
            } else
            if (marginlayoutparams.topMargin != 0)
            {
                marginlayoutparams.topMargin = 0;
                l = 0;
            } else
            {
                i1 = 0;
                l = 0;
            }
            if (i1 != 0)
            {
                rc1.p.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            l = 0;
        }
        if (rc1.C != null)
        {
            rc1 = rc1.C;
            if (l != 0)
            {
                l = ((flag1) ? 1 : 0);
            } else
            {
                l = 8;
            }
            rc1.setVisibility(l);
        }
        return k;
    }

    private boolean b(rn rn1, KeyEvent keyevent)
    {
        if (!super.n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Context context;
        android.view.Window.Callback callback;
        int k;
        if (rn1.m)
        {
            return true;
        }
        if (H != null && H != rn1)
        {
            a(H, false);
        }
        callback = super.b.getCallback();
        if (callback != null)
        {
            rn1.i = callback.onCreatePanelView(rn1.a);
        }
        android.content.res.Resources.Theme theme;
        if (rn1.a == 0 || rn1.a == 108)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k && v != null)
        {
            v.l();
        }
        if (rn1.i != null || k && (super.f instanceof ru)) goto _L4; else goto _L3
_L3:
        if (rn1.j != null && !rn1.r) goto _L6; else goto _L5
_L5:
        if (rn1.j != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (rn1.a != 0 && rn1.a != 108 || v == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(g.j, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(g.k, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(g.k, typedvalue, true);
            obj = null;
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = context.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        obj = new si(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new ta(((Context) (obj)));
        ((ta) (obj)).a(this);
        rn1.a(((ta) (obj)));
        if (rn1.j == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (k && v != null)
            {
                if (w == null)
                {
                    w = new rj(this);
                }
                v.a(rn1.j, w);
            }
            rn1.j.g();
            if (callback.onCreatePanelMenu(rn1.a, rn1.j))
            {
                break label0;
            }
            rn1.a(null);
            if (k && v != null)
            {
                v.a(null, w);
                return false;
            }
        }
          goto _L1
        rn1.r = false;
_L6:
        rn1.j.g();
        if (rn1.s != null)
        {
            rn1.j.b(rn1.s);
            rn1.s = null;
        }
        if (!callback.onPreparePanel(0, rn1.i, rn1.j))
        {
            if (k && v != null)
            {
                v.a(null, w);
            }
            rn1.j.h();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            k = keyevent.getDeviceId();
        } else
        {
            k = -1;
        }
        if (KeyCharacterMap.load(k).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        rn1.p = flag;
        rn1.j.setQwertyMode(rn1.p);
        rn1.j.h();
_L4:
        rn1.m = true;
        rn1.n = false;
        H = rn1;
        return true;
        obj = context;
          goto _L8
    }

    private void f(int k)
    {
        u = u | 1 << k;
        if (!t && z != null)
        {
            kb.a(z, I);
            t = true;
        }
    }

    private void o()
    {
        Object obj;
        if (y)
        {
            break MISSING_BLOCK_LABEL_758;
        }
        obj = LayoutInflater.from(a);
        if (l) goto _L2; else goto _L1
_L1:
        if (!k) goto _L4; else goto _L3
_L3:
        A = (ViewGroup)((LayoutInflater) (obj)).inflate(g.bu, null);
        i = false;
        h = false;
_L6:
        if (A == null)
        {
            throw new IllegalArgumentException((new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ")).append(h).append(", windowActionBarOverlay: ").append(i).append(", android:windowIsFloating: ").append(k).append(", windowActionModeOverlay: ").append(j).append(", windowNoTitle: ").append(l).append(" }").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (h)
        {
            obj = new TypedValue();
            a.getTheme().resolveAttribute(g.j, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new si(a, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = a;
            }
            A = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(g.bD, null);
            v = (uu)A.findViewById(g.ba);
            v.a(super.b.getCallback());
            if (i)
            {
                v.b(109);
            }
            if (D)
            {
                v.b(2);
            }
            if (E)
            {
                v.b(5);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j)
        {
            A = (ViewGroup)((LayoutInflater) (obj)).inflate(g.bC, null);
        } else
        {
            A = (ViewGroup)((LayoutInflater) (obj)).inflate(g.bB, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            kb.a(A, new re(this));
        } else
        {
            ((uw)A).a(new rf(this));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (v == null)
        {
            B = (TextView)A.findViewById(g.bk);
        }
        vr.b(A);
        Object obj1 = (ViewGroup)b.findViewById(0x1020002);
        ContentFrameLayout contentframelayout = (ContentFrameLayout)A.findViewById(g.aM);
        View view;
        for (; ((ViewGroup) (obj1)).getChildCount() > 0; contentframelayout.addView(view))
        {
            view = ((ViewGroup) (obj1)).getChildAt(0);
            ((ViewGroup) (obj1)).removeViewAt(0);
        }

        b.setContentView(A);
        ((ViewGroup) (obj1)).setId(-1);
        contentframelayout.setId(0x1020002);
        if (obj1 instanceof FrameLayout)
        {
            ((FrameLayout)obj1).setForeground(null);
        }
        if (super.c instanceof Activity)
        {
            obj1 = ((Activity)super.c).getTitle();
        } else
        {
            obj1 = super.m;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            b(((CharSequence) (obj1)));
        }
        contentframelayout.a(z.getPaddingLeft(), z.getPaddingTop(), z.getPaddingRight(), z.getPaddingBottom());
        obj1 = a.obtainStyledAttributes(rq.bK);
        ((TypedArray) (obj1)).getValue(rq.bV, contentframelayout.a());
        ((TypedArray) (obj1)).getValue(rq.bW, contentframelayout.b());
        if (((TypedArray) (obj1)).hasValue(rq.bT))
        {
            ((TypedArray) (obj1)).getValue(rq.bT, contentframelayout.c());
        }
        if (((TypedArray) (obj1)).hasValue(rq.bU))
        {
            ((TypedArray) (obj1)).getValue(rq.bU, contentframelayout.d());
        }
        if (((TypedArray) (obj1)).hasValue(rq.bR))
        {
            ((TypedArray) (obj1)).getValue(rq.bR, contentframelayout.e());
        }
        if (((TypedArray) (obj1)).hasValue(rq.bS))
        {
            ((TypedArray) (obj1)).getValue(rq.bS, contentframelayout.f());
        }
        ((TypedArray) (obj1)).recycle();
        contentframelayout.requestLayout();
        y = true;
        obj1 = e(0);
        if (!super.n && (obj1 == null || ((rn) (obj1)).j == null))
        {
            f(108);
        }
    }

    private void p()
    {
        if (y)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        View view1 = a(s1, context, attributeset);
        if (view1 != null)
        {
            return view1;
        } else
        {
            return b(view, s1, context, attributeset);
        }
    }

    View a(String s1, Context context, AttributeSet attributeset)
    {
        if (c instanceof android.view.LayoutInflater.Factory)
        {
            s1 = ((android.view.LayoutInflater.Factory)c).onCreateView(s1, context, attributeset);
            if (s1 != null)
            {
                return s1;
            }
        }
        return null;
    }

    rn a(Menu menu)
    {
        rn arn[] = G;
        int k;
        int l;
        if (arn != null)
        {
            k = arn.length;
        } else
        {
            k = 0;
        }
        for (l = 0; l < k; l++)
        {
            rn rn1 = arn[l];
            if (rn1 != null && rn1.j == menu)
            {
                return rn1;
            }
        }

        return null;
    }

    vt a(vu vu1)
    {
        m();
        if (o != null)
        {
            o.c();
        }
        rk rk1 = new rk(this, vu1);
        if (p == null)
        {
            if (this.k)
            {
                Object obj1 = new TypedValue();
                Object obj = a.getTheme();
                ((android.content.res.Resources.Theme) (obj)).resolveAttribute(g.j, ((TypedValue) (obj1)), true);
                int k;
                if (((TypedValue) (obj1)).resourceId != 0)
                {
                    android.content.res.Resources.Theme theme = a.getResources().newTheme();
                    theme.setTo(((android.content.res.Resources.Theme) (obj)));
                    theme.applyStyle(((TypedValue) (obj1)).resourceId, true);
                    obj = new si(a, 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                } else
                {
                    obj = a;
                }
                p = new ActionBarContextView(((Context) (obj)));
                q = new PopupWindow(((Context) (obj)), null, g.m);
                oz.a(q);
                q.setContentView(p);
                q.setWidth(-1);
                ((Context) (obj)).getTheme().resolveAttribute(g.f, ((TypedValue) (obj1)), true);
                k = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (obj)).getResources().getDisplayMetrics());
                p.a(k);
                q.setHeight(-2);
                r = new rg(this);
            } else
            {
                ViewStubCompat viewstubcompat = (ViewStubCompat)A.findViewById(g.aS);
                if (viewstubcompat != null)
                {
                    viewstubcompat.a(LayoutInflater.from(k()));
                    p = (ActionBarContextView)viewstubcompat.a();
                }
            }
        }
        if (p != null)
        {
            m();
            p.e();
            obj = p.getContext();
            obj1 = p;
            boolean flag;
            if (q == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new sj(((Context) (obj)), ((ActionBarContextView) (obj1)), rk1, flag);
            if (vu1.a(((vt) (obj)), ((vt) (obj)).b()))
            {
                ((vt) (obj)).d();
                p.a(((vt) (obj)));
                o = ((vt) (obj));
                kb.c(p, 0.0F);
                s = kb.p(p).a(1.0F);
                s.a(new ri(this));
                if (q != null)
                {
                    b.getDecorView().post(r);
                }
            } else
            {
                o = null;
            }
        }
        if (o != null && e != null)
        {
            e.a(o);
        }
        return o;
    }

    public void a(int k)
    {
        o();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(k, viewgroup);
        c.onContentChanged();
    }

    void a(int k, rn rn1, Menu menu)
    {
        rn rn3 = rn1;
        Object obj = menu;
        if (menu == null)
        {
            rn rn2 = rn1;
            if (rn1 == null)
            {
                rn2 = rn1;
                if (k >= 0)
                {
                    rn2 = rn1;
                    if (k < G.length)
                    {
                        rn2 = G[k];
                    }
                }
            }
            rn3 = rn2;
            obj = menu;
            if (rn2 != null)
            {
                obj = rn2.j;
                rn3 = rn2;
            }
        }
        while (rn3 != null && !rn3.o || super.n) 
        {
            return;
        }
        c.onPanelClosed(k, ((Menu) (obj)));
    }

    public void a(Configuration configuration)
    {
        if (h && y)
        {
            pq pq1 = a();
            if (pq1 != null)
            {
                pq1.a(configuration);
            }
        }
    }

    public void a(Bundle bundle)
    {
label0:
        {
            super.a(bundle);
            z = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && bu.c((Activity)c) != null)
            {
                bundle = super.f;
                if (bundle != null)
                {
                    break label0;
                }
                J = true;
            }
            return;
        }
        bundle.b(true);
    }

    public void a(Toolbar toolbar)
    {
        if (!(c instanceof Activity))
        {
            return;
        }
        if (a() instanceof sb)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            g = null;
            toolbar = new ru(toolbar, ((Activity)a).getTitle(), d);
            f = toolbar;
            b.setCallback(toolbar.k());
            toolbar.i();
            return;
        }
    }

    public void a(View view)
    {
        o();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        o();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    void a(rn rn1, boolean flag)
    {
        if (flag && rn1.a == 0 && v != null && v.h())
        {
            b(rn1.j);
        } else
        {
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && rn1.o && rn1.g != null)
            {
                windowmanager.removeView(rn1.g);
                if (flag)
                {
                    a(rn1.a, rn1, ((Menu) (null)));
                }
            }
            rn1.m = false;
            rn1.n = false;
            rn1.o = false;
            rn1.h = null;
            rn1.q = true;
            if (H == rn1)
            {
                H = null;
                return;
            }
        }
    }

    public void a(ta ta1)
    {
        if (v == null || !v.g() || ko.b(ViewConfiguration.get(a)) && !v.i())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        ta1 = super.b.getCallback();
        if (v.h()) goto _L2; else goto _L1
_L1:
        if (ta1 != null && !super.n)
        {
            if (t && (u & 1) != 0)
            {
                z.removeCallbacks(I);
                I.run();
            }
            rn rn1 = e(0);
            if (rn1.j != null && !rn1.r && ta1.onPreparePanel(0, rn1.i, rn1.j))
            {
                ta1.onMenuOpened(108, rn1.j);
                v.j();
            }
        }
_L4:
        return;
_L2:
        v.k();
        if (super.n) goto _L4; else goto _L3
_L3:
        ta1.onPanelClosed(108, e(0).j);
        return;
        ta1 = e(0);
        ta1.q = true;
        a(((rn) (ta1)), false);
        a(((rn) (ta1)), ((KeyEvent) (null)));
        return;
    }

    boolean a(int k, KeyEvent keyevent)
    {
        pq pq1 = a();
        if (pq1 == null || !pq1.a(k, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (H == null || !a(H, keyevent.getKeyCode(), keyevent))
        {
            break; /* Loop/switch isn't completed */
        }
        if (H != null)
        {
            H.n = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (H != null)
        {
            break; /* Loop/switch isn't completed */
        }
        rn rn1 = e(0);
        b(rn1, keyevent);
        flag = a(rn1, keyevent.getKeyCode(), keyevent);
        rn1.m = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    boolean a(KeyEvent keyevent)
    {
        boolean flag = true;
        if (keyevent.getKeyCode() == 82 && c.dispatchKeyEvent(keyevent))
        {
            return true;
        }
        int k = keyevent.getKeyCode();
        if (keyevent.getAction() != 0)
        {
            flag = false;
        }
        if (flag)
        {
            return c(k, keyevent);
        } else
        {
            return b(k, keyevent);
        }
    }

    public boolean a(ta ta1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            ta1 = a(((Menu) (ta1.r())));
            if (ta1 != null)
            {
                return callback.onMenuItemSelected(((rn) (ta1)).a, menuitem);
            }
        }
        return false;
    }

    public View b(View view, String s1, Context context, AttributeSet attributeset)
    {
        Object obj;
        byte byte0;
        boolean flag;
        flag = false;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (M == null)
        {
            M = new rt();
        }
        if (!flag1 || !y) goto _L2; else goto _L1
_L1:
        obj = (ViewParent)view;
        if (obj != null) goto _L4; else goto _L3
_L3:
        byte0 = 0;
_L17:
        if (byte0 == 0) goto _L2; else goto _L5
_L5:
        byte0 = 1;
_L20:
        obj = M;
        if (byte0 != 0 && view != null)
        {
            view = view.getContext();
        } else
        {
            view = context;
        }
        view = rt.a(view, attributeset, flag1, true);
        s1.hashCode();
        JVM INSTR lookupswitch 10: default 192
    //                   -1946472170: 447
    //                   -1455429095: 398
    //                   -1346021293: 430
    //                   -938935918: 481
    //                   -339785223: 350
    //                   776382189: 382
    //                   1413872058: 414
    //                   1601505219: 366
    //                   1666676343: 333
    //                   2001146706: 464;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L6:
        byte0 = -1;
_L22:
        switch (byte0)
        {
        default:
            if (context != view)
            {
                return ((rt) (obj)).a(view, s1, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new ws(view, attributeset);

        case 1: // '\001'
            return new ww(view, attributeset);

        case 2: // '\002'
            return new wp(view, attributeset);

        case 3: // '\003'
            return new wu(view, attributeset);

        case 4: // '\004'
            return new wq(view, attributeset);

        case 5: // '\005'
            return new wm(view, attributeset);

        case 6: // '\006'
            return new wt(view, attributeset);

        case 7: // '\007'
            return new wv(view, attributeset);

        case 8: // '\b'
            return new wo(view, attributeset);

        case 9: // '\t'
            return new xe(view, attributeset);
        }
_L19:
        obj = ((ViewParent) (obj)).getParent();
_L4:
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte0 = 1;
          goto _L17
        if (obj != z && (obj instanceof View) && !kb.z((View)obj)) goto _L19; else goto _L18
_L18:
        byte0 = 0;
          goto _L17
_L2:
        byte0 = 0;
          goto _L20
_L15:
        if (!s1.equals("EditText")) goto _L6; else goto _L21
_L21:
        byte0 = flag;
          goto _L22
_L11:
        if (!s1.equals("Spinner")) goto _L6; else goto _L23
_L23:
        byte0 = 1;
          goto _L22
_L14:
        if (!s1.equals("CheckBox")) goto _L6; else goto _L24
_L24:
        byte0 = 2;
          goto _L22
_L12:
        if (!s1.equals("RadioButton")) goto _L6; else goto _L25
_L25:
        byte0 = 3;
          goto _L22
_L8:
        if (!s1.equals("CheckedTextView")) goto _L6; else goto _L26
_L26:
        byte0 = 4;
          goto _L22
_L13:
        if (!s1.equals("AutoCompleteTextView")) goto _L6; else goto _L27
_L27:
        byte0 = 5;
          goto _L22
_L9:
        if (!s1.equals("MultiAutoCompleteTextView")) goto _L6; else goto _L28
_L28:
        byte0 = 6;
          goto _L22
_L7:
        if (!s1.equals("RatingBar")) goto _L6; else goto _L29
_L29:
        byte0 = 7;
          goto _L22
_L16:
        if (!s1.equals("Button")) goto _L6; else goto _L30
_L30:
        byte0 = 8;
          goto _L22
_L10:
        if (!s1.equals("TextView")) goto _L6; else goto _L31
_L31:
        byte0 = 9;
          goto _L22
    }

    public vt b(vu vu1)
    {
        if (o != null)
        {
            o.c();
        }
        vu1 = new rk(this, vu1);
        pq pq1 = a();
        if (pq1 != null)
        {
            o = pq1.a(vu1);
            if (o != null && e != null)
            {
                e.a(o);
            }
        }
        if (o == null)
        {
            o = a(vu1);
        }
        return o;
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        o();
        ((ViewGroup)A.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    void b(CharSequence charsequence)
    {
        if (v != null)
        {
            v.a(charsequence);
        } else
        {
            if (super.f != null)
            {
                super.f.c(charsequence);
                return;
            }
            if (B != null)
            {
                B.setText(charsequence);
                return;
            }
        }
    }

    void b(ta ta1)
    {
        if (F)
        {
            return;
        }
        F = true;
        v.m();
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            callback.onPanelClosed(108, ta1);
        }
        F = false;
    }

    public boolean b(int k)
    {
        if (k != 8) goto _L2; else goto _L1
_L1:
        int l = 108;
_L4:
        if (this.l && l == 108)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        l = k;
        if (k == 9)
        {
            l = 109;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (h && l == 1)
        {
            h = false;
        }
        switch (l)
        {
        default:
            return b.requestFeature(l);

        case 108: // 'l'
            p();
            h = true;
            return true;

        case 109: // 'm'
            p();
            i = true;
            return true;

        case 10: // '\n'
            p();
            j = true;
            return true;

        case 2: // '\002'
            p();
            D = true;
            return true;

        case 5: // '\005'
            p();
            E = true;
            return true;

        case 1: // '\001'
            p();
            this.l = true;
            return true;
        }
    }

    boolean b(int k, KeyEvent keyevent)
    {
        k;
        JVM INSTR lookupswitch 2: default 28
    //                   4: 231
    //                   82: 30;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        if (o != null) goto _L5; else goto _L4
_L4:
        rn rn1 = e(0);
        boolean flag;
        if (v != null && v.g() && !ko.b(ViewConfiguration.get(a)))
        {
            if (!v.h())
            {
                if (super.n || !b(rn1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_265;
                }
                flag = v.j();
            } else
            {
                flag = v.k();
            }
        } else
        if (rn1.o || rn1.n)
        {
            flag = rn1.o;
            a(rn1, true);
        } else
        {
            if (!rn1.m)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            if (rn1.r)
            {
                rn1.m = false;
                flag = b(rn1, keyevent);
            } else
            {
                flag = true;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            a(rn1, keyevent);
            flag = true;
        }
_L6:
        if (flag)
        {
            keyevent = (AudioManager)a.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            }
        }
_L5:
        return true;
_L2:
        keyevent = e(0);
        if (keyevent != null && ((rn) (keyevent)).o)
        {
            a(keyevent, true);
            return true;
        }
        if (n())
        {
            return true;
        }
          goto _L1
        flag = false;
          goto _L6
    }

    public void c()
    {
        o();
    }

    void c(int k)
    {
        if (k == 108)
        {
            pq pq1 = a();
            if (pq1 != null)
            {
                pq1.d(false);
            }
        } else
        if (k == 0)
        {
            rn rn1 = e(k);
            if (rn1.o)
            {
                a(rn1, false);
                return;
            }
        }
    }

    boolean c(int k, KeyEvent keyevent)
    {
        k;
        JVM INSTR tableswitch 82 82: default 20
    //                   82 37;
           goto _L1 _L2
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            a(k, keyevent);
        }
        return false;
_L2:
        if (keyevent.getRepeatCount() == 0)
        {
            rn rn1 = e(0);
            if (!rn1.o)
            {
                b(rn1, keyevent);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void d()
    {
        pq pq1 = a();
        if (pq1 != null)
        {
            pq1.c(false);
        }
    }

    boolean d(int k)
    {
        if (k == 108)
        {
            pq pq1 = a();
            if (pq1 != null)
            {
                pq1.d(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    rn e(int k)
    {
        rn arn[];
label0:
        {
            rn arn1[] = G;
            if (arn1 != null)
            {
                arn = arn1;
                if (arn1.length > k)
                {
                    break label0;
                }
            }
            arn = new rn[k + 1];
            if (arn1 != null)
            {
                System.arraycopy(arn1, 0, arn, 0, arn1.length);
            }
            G = arn;
        }
        rn rn1 = arn[k];
        if (rn1 == null)
        {
            rn1 = new rn(k);
            arn[k] = rn1;
            return rn1;
        } else
        {
            return rn1;
        }
    }

    public void e()
    {
        pq pq1 = a();
        if (pq1 != null)
        {
            pq1.c(true);
        }
    }

    public void f()
    {
        pq pq1 = a();
        if (pq1 != null && pq1.i())
        {
            return;
        } else
        {
            f(0);
            return;
        }
    }

    public void i()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        if (layoutinflater.getFactory() == null)
        {
            ip.a(layoutinflater, this);
        }
    }

    public void j()
    {
        o();
        if (h && f == null)
        {
            if (c instanceof Activity)
            {
                f = new sb((Activity)c, i);
            } else
            if (c instanceof Dialog)
            {
                f = new sb((Dialog)c);
            }
            if (f != null)
            {
                f.b(J);
                return;
            }
        }
    }

    void m()
    {
        if (s != null)
        {
            s.b();
        }
    }

    boolean n()
    {
        if (o != null)
        {
            o.c();
        } else
        {
            pq pq1 = a();
            if (pq1 == null || !pq1.j())
            {
                return false;
            }
        }
        return true;
    }
}
