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

class ra extends qs
    implements iv, sz
{

    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private rl G[];
    private rl H;
    private final Runnable I = new rb(this);
    private boolean J;
    private Rect K;
    private Rect L;
    private rr M;
    vr o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    lr s;
    boolean t;
    int u;
    private us v;
    private rh w;
    private rm x;
    private boolean y;
    private ViewGroup z;

    ra(Context context, Window window, qq qq1)
    {
        super(context, window, qq1);
        s = null;
    }

    static void a(ra ra1, int k)
    {
        rl rl1 = ra1.e(k);
        if (rl1.j != null)
        {
            Bundle bundle = new Bundle();
            rl1.j.a(bundle);
            if (bundle.size() > 0)
            {
                rl1.s = bundle;
            }
            rl1.j.g();
            rl1.j.clear();
        }
        rl1.r = true;
        rl1.q = true;
        if ((k == 108 || k == 0) && ra1.v != null)
        {
            rl rl2 = ra1.e(0);
            if (rl2 != null)
            {
                rl2.m = false;
                ra1.b(rl2, ((KeyEvent) (null)));
            }
        }
    }

    private void a(rl rl1, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!rl1.o && !super.n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (rl1.a != 0)
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
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(rl1.a, rl1.j))
        {
            a(rl1, true);
            return;
        }
        windowmanager = (WindowManager)a.getSystemService("window");
        if (windowmanager == null || !b(rl1, keyevent)) goto _L1; else goto _L4
_L4:
        if (rl1.g != null && !rl1.q) goto _L6; else goto _L5
_L5:
        if (rl1.g != null) goto _L8; else goto _L7
_L7:
        rl1.a(k());
        rl1.g = new rk(this, rl1.l);
        rl1.c = 81;
        if (rl1.g == null) goto _L1; else goto _L9
_L9:
        int k;
        if (rl1.i != null)
        {
            rl1.h = rl1.i;
            k = 1;
        } else
        {
label0:
            {
                if (rl1.j == null)
                {
                    break label0;
                }
                if (x == null)
                {
                    x = new rm(this);
                }
                rl1.h = (View)rl1.a(x);
                if (rl1.h == null)
                {
                    break label0;
                }
                k = 1;
            }
        }
_L11:
        if (k == 0 || !rl1.a()) goto _L1; else goto _L10
_L10:
        keyevent = rl1.h.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        k = rl1.b;
        rl1.g.setBackgroundResource(k);
        ViewParent viewparent = rl1.h.getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(rl1.h);
        }
        rl1.g.addView(rl1.h, keyevent);
        if (!rl1.h.hasFocus())
        {
            rl1.h.requestFocus();
        }
        k = -2;
_L15:
        rl1.n = false;
        keyevent = new android.view.WindowManager.LayoutParams(k, -2, rl1.d, rl1.e, 1002, 0x820000, -3);
        keyevent.gravity = rl1.c;
        keyevent.windowAnimations = rl1.f;
        windowmanager.addView(rl1.g, keyevent);
        rl1.o = true;
        return;
_L8:
        if (rl1.q && rl1.g.getChildCount() > 0)
        {
            rl1.g.removeAllViews();
        }
          goto _L9
        k = 0;
          goto _L11
_L6:
        if (rl1.i == null) goto _L13; else goto _L12
_L12:
        keyevent = rl1.i.getLayoutParams();
        if (keyevent == null) goto _L13; else goto _L14
_L14:
        k = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L15; else goto _L13
_L13:
        k = -2;
          goto _L15
    }

    private boolean a(rl rl1, int k, KeyEvent keyevent)
    {
        while (keyevent.isSystem() || !rl1.m && !b(rl1, keyevent) || rl1.j == null) 
        {
            return false;
        }
        return rl1.j.performShortcut(k, keyevent, 1);
    }

    static int b(ra ra1, int k)
    {
        int i1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int l;
        if (ra1.p != null && (ra1.p.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)ra1.p.getLayoutParams();
            if (ra1.p.isShown())
            {
                if (ra1.K == null)
                {
                    ra1.K = new Rect();
                    ra1.L = new Rect();
                }
                Rect rect = ra1.K;
                Rect rect1 = ra1.L;
                rect.set(0, k, 0, 0);
                vp.a(ra1.A, rect, rect1);
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
                    if (ra1.C == null)
                    {
                        ra1.C = new View(ra1.a);
                        ra1.C.setBackgroundColor(ra1.a.getResources().getColor(g.V));
                        ra1.A.addView(ra1.C, -1, new android.view.ViewGroup.LayoutParams(-1, k));
                        l = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = ra1.C.getLayoutParams();
                        if (layoutparams.height != k)
                        {
                            layoutparams.height = k;
                            ra1.C.setLayoutParams(layoutparams);
                        }
                        l = 1;
                    }
                } else
                {
                    l = 0;
                }
                if (ra1.C == null)
                {
                    flag = false;
                }
                i1 = k;
                if (!ra1.j)
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
                ra1.p.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            l = 0;
        }
        if (ra1.C != null)
        {
            ra1 = ra1.C;
            if (l != 0)
            {
                l = ((flag1) ? 1 : 0);
            } else
            {
                l = 8;
            }
            ra1.setVisibility(l);
        }
        return k;
    }

    private boolean b(rl rl1, KeyEvent keyevent)
    {
        if (!super.n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Context context;
        android.view.Window.Callback callback;
        int k;
        if (rl1.m)
        {
            return true;
        }
        if (H != null && H != rl1)
        {
            a(H, false);
        }
        callback = super.b.getCallback();
        if (callback != null)
        {
            rl1.i = callback.onCreatePanelView(rl1.a);
        }
        android.content.res.Resources.Theme theme;
        if (rl1.a == 0 || rl1.a == 108)
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
        if (rl1.i != null || k && (super.f instanceof rs)) goto _L4; else goto _L3
_L3:
        if (rl1.j != null && !rl1.r) goto _L6; else goto _L5
_L5:
        if (rl1.j != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (rl1.a != 0 && rl1.a != 108 || v == null)
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
        obj = new sg(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new sy(((Context) (obj)));
        ((sy) (obj)).a(this);
        rl1.a(((sy) (obj)));
        if (rl1.j == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (k && v != null)
            {
                if (w == null)
                {
                    w = new rh(this);
                }
                v.a(rl1.j, w);
            }
            rl1.j.g();
            if (callback.onCreatePanelMenu(rl1.a, rl1.j))
            {
                break label0;
            }
            rl1.a(null);
            if (k && v != null)
            {
                v.a(null, w);
                return false;
            }
        }
          goto _L1
        rl1.r = false;
_L6:
        rl1.j.g();
        if (rl1.s != null)
        {
            rl1.j.b(rl1.s);
            rl1.s = null;
        }
        if (!callback.onPreparePanel(0, rl1.i, rl1.j))
        {
            if (k && v != null)
            {
                v.a(null, w);
            }
            rl1.j.h();
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
        rl1.p = flag;
        rl1.j.setQwertyMode(rl1.p);
        rl1.j.h();
_L4:
        rl1.m = true;
        rl1.n = false;
        H = rl1;
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
                obj = new sg(a, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = a;
            }
            A = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(g.bD, null);
            v = (us)A.findViewById(g.ba);
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
            kb.a(A, new rc(this));
        } else
        {
            ((uu)A).a(new rd(this));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (v == null)
        {
            B = (TextView)A.findViewById(g.bk);
        }
        vp.b(A);
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
        obj1 = a.obtainStyledAttributes(ro.bK);
        ((TypedArray) (obj1)).getValue(ro.bV, contentframelayout.a());
        ((TypedArray) (obj1)).getValue(ro.bW, contentframelayout.b());
        if (((TypedArray) (obj1)).hasValue(ro.bT))
        {
            ((TypedArray) (obj1)).getValue(ro.bT, contentframelayout.c());
        }
        if (((TypedArray) (obj1)).hasValue(ro.bU))
        {
            ((TypedArray) (obj1)).getValue(ro.bU, contentframelayout.d());
        }
        if (((TypedArray) (obj1)).hasValue(ro.bR))
        {
            ((TypedArray) (obj1)).getValue(ro.bR, contentframelayout.e());
        }
        if (((TypedArray) (obj1)).hasValue(ro.bS))
        {
            ((TypedArray) (obj1)).getValue(ro.bS, contentframelayout.f());
        }
        ((TypedArray) (obj1)).recycle();
        contentframelayout.requestLayout();
        y = true;
        obj1 = e(0);
        if (!super.n && (obj1 == null || ((rl) (obj1)).j == null))
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

    rl a(Menu menu)
    {
        rl arl[] = G;
        int k;
        int l;
        if (arl != null)
        {
            k = arl.length;
        } else
        {
            k = 0;
        }
        for (l = 0; l < k; l++)
        {
            rl rl1 = arl[l];
            if (rl1 != null && rl1.j == menu)
            {
                return rl1;
            }
        }

        return null;
    }

    vr a(vs vs1)
    {
        m();
        if (o != null)
        {
            o.c();
        }
        ri ri1 = new ri(this, vs1);
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
                    obj = new sg(a, 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                } else
                {
                    obj = a;
                }
                p = new ActionBarContextView(((Context) (obj)));
                q = new PopupWindow(((Context) (obj)), null, g.m);
                ox.a(q);
                q.setContentView(p);
                q.setWidth(-1);
                ((Context) (obj)).getTheme().resolveAttribute(g.f, ((TypedValue) (obj1)), true);
                k = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (obj)).getResources().getDisplayMetrics());
                p.a(k);
                q.setHeight(-2);
                r = new re(this);
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
            obj = new sh(((Context) (obj)), ((ActionBarContextView) (obj1)), ri1, flag);
            if (vs1.a(((vr) (obj)), ((vr) (obj)).b()))
            {
                ((vr) (obj)).d();
                p.a(((vr) (obj)));
                o = ((vr) (obj));
                kb.c(p, 0.0F);
                s = kb.o(p).a(1.0F);
                s.a(new rg(this));
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

    void a(int k, rl rl1, Menu menu)
    {
        rl rl3 = rl1;
        Object obj = menu;
        if (menu == null)
        {
            rl rl2 = rl1;
            if (rl1 == null)
            {
                rl2 = rl1;
                if (k >= 0)
                {
                    rl2 = rl1;
                    if (k < G.length)
                    {
                        rl2 = G[k];
                    }
                }
            }
            rl3 = rl2;
            obj = menu;
            if (rl2 != null)
            {
                obj = rl2.j;
                rl3 = rl2;
            }
        }
        while (rl3 != null && !rl3.o || super.n) 
        {
            return;
        }
        c.onPanelClosed(k, ((Menu) (obj)));
    }

    public void a(Configuration configuration)
    {
        if (h && y)
        {
            po po1 = a();
            if (po1 != null)
            {
                po1.a(configuration);
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
        if (a() instanceof rz)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            g = null;
            toolbar = new rs(toolbar, ((Activity)a).getTitle(), d);
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

    void a(rl rl1, boolean flag)
    {
        if (flag && rl1.a == 0 && v != null && v.h())
        {
            b(rl1.j);
        } else
        {
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && rl1.o && rl1.g != null)
            {
                windowmanager.removeView(rl1.g);
                if (flag)
                {
                    a(rl1.a, rl1, ((Menu) (null)));
                }
            }
            rl1.m = false;
            rl1.n = false;
            rl1.o = false;
            rl1.h = null;
            rl1.q = true;
            if (H == rl1)
            {
                H = null;
                return;
            }
        }
    }

    public void a(sy sy1)
    {
        if (v == null || !v.g() || ko.b(ViewConfiguration.get(a)) && !v.i())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        sy1 = super.b.getCallback();
        if (v.h()) goto _L2; else goto _L1
_L1:
        if (sy1 != null && !super.n)
        {
            if (t && (u & 1) != 0)
            {
                z.removeCallbacks(I);
                I.run();
            }
            rl rl1 = e(0);
            if (rl1.j != null && !rl1.r && sy1.onPreparePanel(0, rl1.i, rl1.j))
            {
                sy1.onMenuOpened(108, rl1.j);
                v.j();
            }
        }
_L4:
        return;
_L2:
        v.k();
        if (super.n) goto _L4; else goto _L3
_L3:
        sy1.onPanelClosed(108, e(0).j);
        return;
        sy1 = e(0);
        sy1.q = true;
        a(((rl) (sy1)), false);
        a(((rl) (sy1)), ((KeyEvent) (null)));
        return;
    }

    boolean a(int k, KeyEvent keyevent)
    {
        po po1 = a();
        if (po1 == null || !po1.a(k, keyevent)) goto _L2; else goto _L1
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
        rl rl1 = e(0);
        b(rl1, keyevent);
        flag = a(rl1, keyevent.getKeyCode(), keyevent);
        rl1.m = false;
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

    public boolean a(sy sy1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            sy1 = a(((Menu) (sy1.r())));
            if (sy1 != null)
            {
                return callback.onMenuItemSelected(((rl) (sy1)).a, menuitem);
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
            M = new rr();
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
        view = rr.a(view, attributeset, flag1, true);
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
                return ((rr) (obj)).a(view, s1, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new wq(view, attributeset);

        case 1: // '\001'
            return new wu(view, attributeset);

        case 2: // '\002'
            return new wn(view, attributeset);

        case 3: // '\003'
            return new ws(view, attributeset);

        case 4: // '\004'
            return new wo(view, attributeset);

        case 5: // '\005'
            return new wk(view, attributeset);

        case 6: // '\006'
            return new wr(view, attributeset);

        case 7: // '\007'
            return new wt(view, attributeset);

        case 8: // '\b'
            return new wm(view, attributeset);

        case 9: // '\t'
            return new xc(view, attributeset);
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
        if (obj != z && (obj instanceof View) && !kb.y((View)obj)) goto _L19; else goto _L18
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

    public vr b(vs vs1)
    {
        if (o != null)
        {
            o.c();
        }
        vs1 = new ri(this, vs1);
        po po1 = a();
        if (po1 != null)
        {
            o = po1.a(vs1);
            if (o != null && e != null)
            {
                e.a(o);
            }
        }
        if (o == null)
        {
            o = a(vs1);
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

    void b(sy sy1)
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
            callback.onPanelClosed(108, sy1);
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
        rl rl1 = e(0);
        boolean flag;
        if (v != null && v.g() && !ko.b(ViewConfiguration.get(a)))
        {
            if (!v.h())
            {
                if (super.n || !b(rl1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_265;
                }
                flag = v.j();
            } else
            {
                flag = v.k();
            }
        } else
        if (rl1.o || rl1.n)
        {
            flag = rl1.o;
            a(rl1, true);
        } else
        {
            if (!rl1.m)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            if (rl1.r)
            {
                rl1.m = false;
                flag = b(rl1, keyevent);
            } else
            {
                flag = true;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            a(rl1, keyevent);
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
        if (keyevent != null && ((rl) (keyevent)).o)
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
            po po1 = a();
            if (po1 != null)
            {
                po1.d(false);
            }
        } else
        if (k == 0)
        {
            rl rl1 = e(k);
            if (rl1.o)
            {
                a(rl1, false);
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
            rl rl1 = e(0);
            if (!rl1.o)
            {
                b(rl1, keyevent);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void d()
    {
        po po1 = a();
        if (po1 != null)
        {
            po1.c(false);
        }
    }

    boolean d(int k)
    {
        if (k == 108)
        {
            po po1 = a();
            if (po1 != null)
            {
                po1.d(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    rl e(int k)
    {
        rl arl[];
label0:
        {
            rl arl1[] = G;
            if (arl1 != null)
            {
                arl = arl1;
                if (arl1.length > k)
                {
                    break label0;
                }
            }
            arl = new rl[k + 1];
            if (arl1 != null)
            {
                System.arraycopy(arl1, 0, arl, 0, arl1.length);
            }
            G = arl;
        }
        rl rl1 = arl[k];
        if (rl1 == null)
        {
            rl1 = new rl(k);
            arl[k] = rl1;
            return rl1;
        } else
        {
            return rl1;
        }
    }

    public void e()
    {
        po po1 = a();
        if (po1 != null)
        {
            po1.c(true);
        }
    }

    public void f()
    {
        po po1 = a();
        if (po1 != null && po1.i())
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
                f = new rz((Activity)c, i);
            } else
            if (c instanceof Dialog)
            {
                f = new rz((Dialog)c);
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
            po po1 = a();
            if (po1 == null || !po1.j())
            {
                return false;
            }
        }
        return true;
    }
}
