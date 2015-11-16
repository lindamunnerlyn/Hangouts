// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ejx;
import fmv;
import fmy;
import fnk;
import fnl;
import fnm;
import fnn;
import fno;
import fnp;
import fnq;
import fnr;
import fns;
import fnt;
import fnu;
import fnv;
import fnw;
import fqu;
import g;
import h;
import java.util.ArrayList;
import kb;
import n;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            AccountSwitcherView, ExpanderView

public class SelectedAccountNavigationView extends FrameLayout
{

    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private fqu F;
    private Interpolator G;
    private int H;
    private int I;
    private AnimatorSet J;
    private fqu K;
    private fqu L;
    private fqu M;
    private fnt a;
    private int b;
    private fnw c;
    private ejx d;
    private fmy e;
    private fmv f;
    private ArrayList g;
    private fqu h;
    private fnr i;
    private a j;
    private fnv k;
    private int l;
    private fnu m;
    private float n;
    private float o;
    private int p;
    private VelocityTracker q;
    private int r;
    private boolean s;
    private int t;
    private float u;
    private float v;
    private boolean w;
    private float x;
    private int y;
    private int z;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        b = 0;
        w = AccountSwitcherView.b();
        g = new ArrayList(2);
        l = -1;
        p = ViewConfiguration.get(context).getScaledTouchSlop();
        q = VelocityTracker.obtain();
        r = ViewConfiguration.getMinimumFlingVelocity();
        attributeset = context.getResources();
        u = attributeset.getDimensionPixelSize(g.rw);
        int i1;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            if (getResources().getConfiguration().getLayoutDirection() != 1)
            {
                flag = false;
            }
            D = flag;
        }
        if (AccountSwitcherView.b())
        {
            i1 = 0x10c000d;
        } else
        {
            i1 = -1;
        }
        if (i1 != -1)
        {
            context = AnimationUtils.loadInterpolator(context, 0x10c000d);
        } else
        {
            context = new DecelerateInterpolator();
        }
        G = context;
        I = attributeset.getDimensionPixelSize(g.rx);
        H = attributeset.getDimensionPixelSize(g.rv);
    }

    public static fnv a(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        return selectedaccountnavigationview.k;
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = motionevent.getActionIndex();
        if (motionevent.getPointerId(i1) == t)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            t = motionevent.getPointerId(i1);
        }
    }

    private static void a(View view)
    {
        if (view != null)
        {
            kb.a(view, 0.0F);
            kb.b(view, 0.0F);
            kb.d(view, 1.0F);
            kb.e(view, 1.0F);
            kb.c(view, 1.0F);
        }
    }

    private void a(View view, int i1)
    {
        if (view != null)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            marginlayoutparams.topMargin = H + i1;
            view.setLayoutParams(marginlayoutparams);
        }
    }

    private void a(ImageView imageview, fqu fqu1)
    {
        if (imageview != null && f != null)
        {
            imageview.setImageBitmap(fmv.a(imageview.getContext()));
            if (!TextUtils.isEmpty(fqu1.f()))
            {
                f.a(imageview);
                f.a(imageview, fqu1, 2);
            } else
            {
                f.a(imageview);
            }
            imageview.setVisibility(0);
            imageview.setContentDescription(getContext().getString(n.s, new Object[] {
                fqu1.a()
            }));
        }
    }

    private static void a(TextView textview, TextView textview1, fqu fqu1)
    {
label0:
        {
            boolean flag;
            if (textview != null)
            {
                if (TextUtils.isEmpty(fqu1.c()))
                {
                    textview.setText(fqu1.a());
                    flag = false;
                } else
                {
                    flag = true;
                    textview.setText(fqu1.c());
                }
            } else
            {
                flag = false;
            }
            if (textview1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                textview1.setVisibility(0);
                textview1.setText(fqu1.a());
            }
            return;
        }
        textview1.setVisibility(8);
    }

    public static void a(SelectedAccountNavigationView selectedaccountnavigationview, int i1)
    {
        if (selectedaccountnavigationview.g == null || selectedaccountnavigationview.g.size() == 0)
        {
            return;
        }
        AnimatorSet animatorset = new AnimatorSet();
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Object obj;
        Object obj1;
        fqu fqu1;
        Object obj2;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator2;
        int j1;
        if (i1 == 0)
        {
            obj = selectedaccountnavigationview.k.s;
        } else
        {
            obj = selectedaccountnavigationview.k.t;
        }
        if (i1 == 0)
        {
            obj1 = selectedaccountnavigationview.k.w;
        } else
        {
            obj1 = selectedaccountnavigationview.k.x;
        }
        ((View) (obj)).bringToFront();
        fqu1 = (fqu)selectedaccountnavigationview.g.get(i1);
        if (selectedaccountnavigationview.v == 0.0F)
        {
            selectedaccountnavigationview.v = selectedaccountnavigationview.k.w.getWidth();
        }
        obj1 = (android.view.ViewGroup.MarginLayoutParams)((View) (obj1)).getLayoutParams();
        obj2 = ObjectAnimator.ofFloat(selectedaccountnavigationview.k.p, "alpha", new float[] {
            1.0F, 0.0F
        });
        if (selectedaccountnavigationview.D)
        {
            j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).getMarginStart();
        } else
        {
            j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).leftMargin;
        }
        f1 = selectedaccountnavigationview.u / selectedaccountnavigationview.v;
        f2 = selectedaccountnavigationview.u;
        f3 = selectedaccountnavigationview.v;
        f4 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).bottomMargin;
        f5 = selectedaccountnavigationview.k.p.getLeft() - (j1 + ((View) (obj)).getLeft());
        f6 = selectedaccountnavigationview.v;
        f7 = selectedaccountnavigationview.u;
        obj2 = animatorset.play(((android.animation.Animator) (obj2)));
        obj1 = ObjectAnimator.ofFloat(obj, "translationX", new float[] {
            f5 - (f6 - f7) * 0.5F
        });
        ((ObjectAnimator) (obj1)).setDuration(450L);
        objectanimator = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
            (f2 - (f3 - f4)) * 0.5F
        });
        objectanimator.setDuration(450L);
        objectanimator2 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
            f1
        });
        objectanimator2.setDuration(300L);
        obj = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
            f1
        });
        ((ObjectAnimator) (obj)).setDuration(300L);
        ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj1))).with(objectanimator).with(objectanimator2).with(((android.animation.Animator) (obj)));
        if (i1 == 0)
        {
            obj = selectedaccountnavigationview.k.D;
        } else
        {
            obj = selectedaccountnavigationview.k.E;
        }
        if (i1 == 0)
        {
            obj1 = selectedaccountnavigationview.k.G;
        } else
        {
            obj1 = selectedaccountnavigationview.k.H;
        }
        if (obj1 != null)
        {
            ((ImageView) (obj1)).setImageDrawable(selectedaccountnavigationview.k.v.getDrawable());
        }
        if (obj != null)
        {
            ((View) (obj)).setVisibility(0);
            obj1 = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj1)).setDuration(450L);
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
                1.0F
            });
            objectanimator1.setDuration(450L);
            obj = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(450L);
            ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj1))).with(((android.animation.Animator) (obj))).with(objectanimator1);
        }
        if (selectedaccountnavigationview.k.y != null && selectedaccountnavigationview.k.m != null)
        {
            selectedaccountnavigationview.k.y.setAlpha(0.0F);
            selectedaccountnavigationview.k.y.setTranslationX(0.0F);
            selectedaccountnavigationview.a(fqu1, ((android.animation.AnimatorSet.Builder) (obj2)), 150);
        }
        if (selectedaccountnavigationview.k.u != null)
        {
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.k.u, "alpha", new float[] {
                0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj)));
        }
        if (selectedaccountnavigationview.k.C != null)
        {
            selectedaccountnavigationview.a(selectedaccountnavigationview.k, selectedaccountnavigationview.k.C, fqu1);
            selectedaccountnavigationview.k.C.setVisibility(0);
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.k.C, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj)));
        }
        animatorset.addListener(new fnl(selectedaccountnavigationview));
        obj = selectedaccountnavigationview.h;
        selectedaccountnavigationview.h = (fqu)selectedaccountnavigationview.g.get(i1);
        selectedaccountnavigationview.g.add(i1, obj);
        selectedaccountnavigationview.g.remove(i1 + 1);
        selectedaccountnavigationview.c(300);
        animatorset.setInterpolator(selectedaccountnavigationview.G);
        selectedaccountnavigationview.J = animatorset;
        selectedaccountnavigationview.J.start();
    }

    private void a(fnv fnv1, ImageView imageview, fqu fqu1)
    {
        if (imageview == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(fqu1.g()))
        {
            e.a(imageview);
            e.a(imageview, fqu1, fnv1.u.getMeasuredWidth());
            return;
        } else
        {
            e.a(imageview);
            imageview.setImageBitmap(e.a(getContext()));
            return;
        }
    }

    private void a(fqu fqu1, android.animation.AnimatorSet.Builder builder, int i1)
    {
        a(k.z, k.A, fqu1);
        k.y.setVisibility(0);
        fqu1 = ObjectAnimator.ofFloat(k.y, "alpha", new float[] {
            1.0F
        });
        fqu1.setStartDelay(i1);
        fqu1.setDuration(150L);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(k.m, "alpha", new float[] {
            0.0F
        });
        objectanimator.setStartDelay(0L);
        objectanimator.setDuration(150L);
        builder.with(fqu1).with(objectanimator);
    }

    private void b()
    {
        Context context = getContext();
        if (l == -1)
        {
            int i1;
            if (C)
            {
                i1 = h.jj;
            } else
            if (AccountSwitcherView.b())
            {
                i1 = h.jj;
            } else
            {
                i1 = h.jk;
            }
            l = i1;
        }
        if (c == null)
        {
            c = new fns(this);
        }
        LayoutInflater.from(context).inflate(l, this);
        k = c.a(this);
        if (w)
        {
            k.s.setOnClickListener(new fno(this));
            k.t.setOnClickListener(new fnp(this));
        }
        if (k.n != null)
        {
            k.n.setOnClickListener(new fnq(this));
        }
    }

    public static void b(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.K != null)
        {
            selectedaccountnavigationview.h = selectedaccountnavigationview.K;
            selectedaccountnavigationview.K = null;
        }
        if (selectedaccountnavigationview.L != null || selectedaccountnavigationview.M != null)
        {
            selectedaccountnavigationview.g.clear();
            if (selectedaccountnavigationview.L != null)
            {
                selectedaccountnavigationview.g.add(selectedaccountnavigationview.L);
            }
            if (selectedaccountnavigationview.M != null)
            {
                selectedaccountnavigationview.g.add(selectedaccountnavigationview.M);
            }
            selectedaccountnavigationview.L = null;
            selectedaccountnavigationview.M = null;
        }
    }

    private void c()
    {
        if (k == null)
        {
            b();
        }
        if (w)
        {
            a(k.p);
            a(k.s);
            a(k.t);
            a(k.m);
            a(k.u);
            a(k.C);
            a(k.B);
        }
        fnv fnv1 = k;
        fqu fqu1 = h;
        if (fnv1.l != null)
        {
            fnv1.l.setContentDescription(getContext().getResources().getString(n.u, new Object[] {
                h.a()
            }));
        }
        if (fnv1.v != null)
        {
            fnv1.v.setImageBitmap(fmv.a(getContext()));
            if (!TextUtils.isEmpty(fqu1.f()))
            {
                f.a(fnv1.v);
                f.a(fnv1.v, fqu1, 2);
            } else
            {
                f.a(fnv1.v);
            }
        }
        a(fnv1.q, fnv1.r, fqu1);
        a(fnv1, fnv1.u, fqu1);
        d();
        if (m != null)
        {
            m.a(k, h, g);
        }
        if (w)
        {
            v = k.w.getWidth();
            if (k.B != null)
            {
                k.B.setVisibility(8);
            }
            if (k.C != null)
            {
                k.C.setVisibility(8);
            }
            if (k.y != null)
            {
                k.y.setVisibility(8);
            }
            if (k.D != null)
            {
                kb.c(k.D, 0.0F);
                kb.d(k.D, 0.8F);
                kb.e(k.D, 0.8F);
                k.D.setVisibility(8);
            }
            if (k.E != null)
            {
                kb.c(k.E, 0.0F);
                kb.d(k.E, 0.8F);
                kb.e(k.E, 0.8F);
                k.E.setVisibility(8);
            }
        }
    }

    private void c(int i1)
    {
        if (j != null)
        {
            getHandler().postDelayed(new fnm(this), i1);
        }
    }

    public static void c(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        selectedaccountnavigationview.c();
    }

    public static AnimatorSet d(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        selectedaccountnavigationview.J = null;
        return null;
    }

    private void d()
    {
        if (!w)
        {
            return;
        }
        if (k == null)
        {
            b();
        }
        if (k.u != null && k.u.getMeasuredWidth() == 0)
        {
            forceLayout();
            return;
        }
        if (g.size() > 0)
        {
            fqu fqu1 = (fqu)g.get(0);
            fnv fnv1 = k;
            k.s.setVisibility(0);
            a(k.w, fqu1);
            a(fnv1, fnv1.C, fqu1);
        } else
        {
            k.s.setVisibility(8);
        }
        if (g.size() > 1)
        {
            k.t.setVisibility(0);
            a(k.x, (fqu)g.get(1));
        } else
        {
            k.t.setVisibility(8);
        }
        x = -1F;
    }

    private void e()
    {
        boolean flag = true;
        ExpanderView expanderview;
        int i1;
        if (b == 1)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        b(i1);
        if (a != null)
        {
            a.a(this);
        }
        expanderview = k.n;
        if (b != 1)
        {
            flag = false;
        }
        expanderview.a(flag);
    }

    public static void e(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.i != null)
        {
            selectedaccountnavigationview.i.a(selectedaccountnavigationview.h);
        }
    }

    public static void f(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        selectedaccountnavigationview.e();
    }

    public static boolean g(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        return selectedaccountnavigationview.w;
    }

    public int a()
    {
        return b;
    }

    public void a(int i1)
    {
        if (k == null)
        {
            b();
        }
        int j1 = I + i1;
        setMinimumHeight(j1);
        android.view.ViewGroup.LayoutParams layoutparams = k.I.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, j1);
        } else
        {
            layoutparams.height = j1;
        }
        k.I.setLayoutParams(layoutparams);
        a(k.p, i1);
        a(k.B, i1);
        a(k.s, i1);
        a(k.t, i1);
        a(k.D, i1);
        a(k.E, i1);
    }

    public void a(int i1, fnw fnw1, fnu fnu1)
    {
        l = i1;
        c = fnw1;
        m = fnu1;
    }

    public void a(ejx ejx)
    {
        d = ejx;
        if (d != null)
        {
            a(new fmy(getContext(), d));
        }
    }

    public void a(fmv fmv1)
    {
        f = fmv1;
    }

    public void a(fmy fmy1)
    {
        e = fmy1;
    }

    public void a(fnr fnr1)
    {
        i = fnr1;
    }

    public void a(fnt fnt1)
    {
        a = fnt1;
    }

    public void a(fqu fqu1)
    {
        if (k == null)
        {
            b();
        }
        if (fqu1 == null)
        {
            h = null;
            return;
        }
        if (J != null && J.isRunning())
        {
            K = fqu1;
            return;
        }
        if (k.u != null && k.u.getMeasuredWidth() == 0)
        {
            F = fqu1;
            forceLayout();
            return;
        }
        if (h != null && h.a().equals(fqu1.a())) goto _L2; else goto _L1
_L1:
        fqu fqu2;
        int i1;
        fqu2 = h;
        h = fqu1;
        fqu1 = h.a();
        i1 = 0;
_L6:
label0:
        {
            if (i1 >= g.size())
            {
                break MISSING_BLOCK_LABEL_259;
            }
            if (((fqu)g.get(i1)).a() != null && ((fqu)g.get(i1)).a().equals(fqu1))
            {
                break label0;
            } else
            {
                i1++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L4:
        if (i1 >= 0)
        {
            g.remove(i1);
        }
        if (fqu2 != null)
        {
            g.add(0, fqu2);
            for (; g.size() > 2; g.remove(g.size() - 1)) { }
        }
        c();
        return;
_L2:
        h = fqu1;
        c();
        return;
        i1 = -1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(fqu fqu1, fqu fqu2)
    {
        if (J != null && J.isRunning())
        {
            L = fqu1;
            M = fqu2;
            return;
        }
        if (g == null)
        {
            g = new ArrayList();
        } else
        {
            g.clear();
        }
        if (fqu1 != null)
        {
            g.add(fqu1);
        }
        if (fqu2 != null)
        {
            g.add(fqu2);
        }
        d();
    }

    public void a(boolean flag)
    {
        if (flag && AccountSwitcherView.a(11))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = flag;
        w = C;
    }

    public void b(int i1)
    {
        boolean flag = true;
        if (b != i1)
        {
            b = i1;
            if (k == null)
            {
                b();
            }
            if (b != 1)
            {
                flag = false;
            }
            k.n.a(flag);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR lookupswitch 2: default 32
    //                   0: 37
    //                   6: 59;
           goto _L1 _L2 _L3
_L1:
        return s;
_L2:
        s = false;
        t = motionevent.getPointerId(0);
        s = false;
        continue; /* Loop/switch isn't completed */
_L3:
        a(motionevent);
        t = -1;
        s = false;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onMeasure(int i1, int j1)
    {
        if (k == null)
        {
            b();
        }
        if (k.u != null)
        {
            k.u.measure(i1, j1);
        }
        if (k.k != null)
        {
            k.k.measure(i1, j1);
        }
        if (F != null)
        {
            a(F);
            F = null;
        }
        super.onMeasure(i1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        int i1;
        boolean flag;
        flag = false;
        i1 = motionevent.getAction();
        obj = getParent();
        i1;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 66
    //                   1 1179
    //                   2 85
    //                   3 2551
    //                   4 60
    //                   5 2566
    //                   6 2581;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        flag = true;
_L9:
        return flag;
_L2:
        n = motionevent.getX();
        o = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = motionevent.findPointerIndex(t);
        if (j1 < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f1 = motionevent.getX(j1);
        float f8 = motionevent.getY(j1);
        float f4 = f1 - n;
        f8 -= o;
        if (w && g.size() > 0 && !s && f4 * f4 + f8 * f8 > (float)(p * p) && Math.abs(f4) > Math.abs(f8))
        {
            s = true;
            if (obj != null)
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
            }
        }
        if (s)
        {
            f1 -= n;
            float f5;
            int k1;
            if (x == -1F)
            {
                obj = (android.view.ViewGroup.MarginLayoutParams)k.w.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)k.x.getLayoutParams();
                float f9;
                float f12;
                float f14;
                float f15;
                int i2;
                if (D)
                {
                    k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).getMarginStart();
                } else
                {
                    k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                if (D)
                {
                    i2 = marginlayoutparams.getMarginStart();
                } else
                {
                    i2 = marginlayoutparams.leftMargin;
                }
                x = k1 + k.s.getLeft();
                y = k.t.getLeft() + i2;
                A = k.p.getLeft() + k.p.getPaddingLeft();
                B = k.p.getWidth();
            }
            if (D)
            {
                f1 = Math.min(f1, 0.0F);
            } else
            {
                f1 = Math.max(f1, 0.0F);
            }
            if (v == 0.0F)
            {
                v = k.w.getWidth();
            }
            f12 = v / u;
            f9 = v;
            f14 = u;
            if (g.size() > 1)
            {
                f5 = y;
            } else
            {
                f5 = x;
            }
            f15 = (f5 - (float)A) + (v - u) * 0.5F;
            f5 = Math.min(1.0F, f1 / f15);
            f1 = Math.abs((f9 - f14) * 0.5F);
            f9 = Math.max(0.0F, 1.0F - f5);
            k.p.setTranslationX(f15 * f5);
            k.p.setTranslationY(Math.abs(f1 * f5) * -1F);
            f1 = Math.min(1.0F, Math.max(f12, 1.0F - f5 * f12));
            k.p.setScaleX(f1);
            k.p.setScaleY(f1);
            if (k.B != null)
            {
                if (k.B.getVisibility() != 0)
                {
                    if (D)
                    {
                        k1 = getWidth() - A;
                    } else
                    {
                        k1 = -B - A;
                    }
                    E = k1;
                    k.B.setTranslationX(E);
                    k.F.setImageDrawable(k.w.getDrawable());
                    k.B.setVisibility(0);
                } else
                {
                    f1 = -E;
                    k.B.setTranslationX(f1 * f5 + (float)E);
                }
            }
            if (g.size() > 1)
            {
                f1 = x;
                f12 = y;
                k.t.setTranslationX((f1 - f12) * f5);
            }
            if (g.size() > 0)
            {
                if (k.C != null)
                {
                    if (k.C.getVisibility() != 0)
                    {
                        k.C.setAlpha(0.0F);
                        k.C.setVisibility(0);
                    } else
                    {
                        k.C.setAlpha(f5);
                    }
                }
                if (k.u != null)
                {
                    k.u.setAlpha(1.0F - f5);
                }
                if (D)
                {
                    f1 = (float)getLeft() - ((float)k.s.getWidth() + x);
                } else
                {
                    f1 = (float)getWidth() - x;
                }
                k.s.setTranslationX(f1 * f5);
                k.s.setAlpha(f9);
                if (k.y != null)
                {
                    if (k.y.getVisibility() != 0)
                    {
                        obj = (fqu)g.get(0);
                        z = E;
                        k.y.setTranslationX(z);
                        a(k.z, k.A, ((fqu) (obj)));
                        k.y.setAlpha(0.0F);
                        k.y.setVisibility(0);
                    } else
                    {
                        if (f5 > 0.3333333F)
                        {
                            float f2 = Math.min(1.0F, (f5 - 0.3333333F) * 3F);
                            k.y.setAlpha(f2);
                        }
                        k.y.setTranslationX((float)z + (float)(-z) * f5);
                    }
                }
                if (k.m != null)
                {
                    k.m.setTranslationX(k.p.getTranslationX());
                    f1 = Math.max(0.0F, 1.0F - 3F * f5);
                    k.m.setAlpha(f1);
                }
            }
            q.addMovement(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        int k2 = motionevent.findPointerIndex(t);
        if (k2 < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
            return false;
        }
        if (s)
        {
            float f3;
            float f6;
            float f10;
            int l1;
            int j2;
            if (g.size() > 1)
            {
                f3 = y;
            } else
            {
                f3 = x;
            }
            f10 = k.p.getTranslationX();
            f6 = f10;
            if (D)
            {
                f6 = Math.abs(f10);
            }
            if (f6 >= f3 * 0.5F)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            j2 = l1;
            if (l1 == 0)
            {
                j2 = l1;
                if (motionevent.getX(k2) - n > (float)p)
                {
                    q.computeCurrentVelocity(1000);
                    float f7;
                    float f11;
                    float f13;
                    ObjectAnimator objectanimator1;
                    ObjectAnimator objectanimator3;
                    if (Math.abs(q.getXVelocity()) > (float)r)
                    {
                        j2 = 1;
                    } else
                    {
                        j2 = 0;
                    }
                }
            }
            if (j2 != 0)
            {
                motionevent = new AnimatorSet();
                Object obj1 = (android.view.ViewGroup.MarginLayoutParams)k.w.getLayoutParams();
                Object obj2 = (android.view.ViewGroup.MarginLayoutParams)k.x.getLayoutParams();
                if (D)
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).getMarginStart();
                } else
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).leftMargin;
                }
                if (D)
                {
                    j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj2)).getMarginStart();
                } else
                {
                    j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj2)).leftMargin;
                }
                if (v == 0.0F)
                {
                    v = k.w.getWidth();
                }
                f3 = v / u;
                f11 = v;
                f13 = u;
                if (g.size() > 1)
                {
                    l1 = k.t.getLeft() + j2;
                } else
                {
                    l1 += k.s.getLeft();
                }
                f7 = l1 - k.p.getLeft();
                f7 = (v - u) * 0.5F + f7;
                obj1 = ObjectAnimator.ofFloat(k.p, "translationX", new float[] {
                    f7
                });
                obj2 = ObjectAnimator.ofFloat(k.p, "translationY", new float[] {
                    (f11 - f13) * 0.5F
                });
                objectanimator1 = ObjectAnimator.ofFloat(k.p, "scaleY", new float[] {
                    f3
                });
                objectanimator3 = ObjectAnimator.ofFloat(k.p, "scaleX", new float[] {
                    f3
                });
                obj1 = motionevent.play(((android.animation.Animator) (obj1))).with(((android.animation.Animator) (obj2))).with(objectanimator3).with(objectanimator1);
                if (w && g.size() > 0)
                {
                    if (g.size() > 1)
                    {
                        f3 = k.s.getLeft() - k.t.getLeft();
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(k.t, "translationX", new float[] {
                            f3
                        }));
                    }
                    if (D)
                    {
                        f3 = (float)getLeft() - ((float)k.s.getWidth() + x);
                    } else
                    {
                        f3 = getWidth() - k.s.getLeft();
                    }
                    obj2 = ObjectAnimator.ofFloat(k.s, "translationX", new float[] {
                        f3
                    });
                    objectanimator1 = ObjectAnimator.ofFloat(k.s, "alpha", new float[] {
                        0.0F
                    });
                    ((android.animation.AnimatorSet.Builder) (obj1)).with(((android.animation.Animator) (obj2))).with(objectanimator1);
                    if (k.B != null)
                    {
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(k.B, "translationX", new float[] {
                            0.0F
                        }));
                    }
                    if (k.y != null)
                    {
                        a((fqu)g.get(0), ((android.animation.AnimatorSet.Builder) (obj1)), 0);
                    }
                }
                motionevent.addListener(new fnn(this));
                obj1 = h;
                h = (fqu)g.remove(0);
                g.add(obj1);
                c(100);
                motionevent.setDuration((long)((1.0F - k.p.getTranslationX() / f7) * 450F));
                motionevent.setInterpolator(G);
                J = motionevent;
                J.start();
            } else
            {
                motionevent = new AnimatorSet();
                android.animation.AnimatorSet.Builder builder = motionevent.play(ObjectAnimator.ofFloat(k.p, "alpha", new float[] {
                    1.0F
                }));
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(k.p, "translationX", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(k.p, "translationY", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(k.p, "scaleX", new float[] {
                    1.0F
                });
                ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(k.p, "scaleY", new float[] {
                    1.0F
                });
                builder.with(objectanimator).with(objectanimator2).with(objectanimator4).with(objectanimator5);
                builder.with(ObjectAnimator.ofFloat(k.B, "translationX", new float[] {
                    (float)E
                }));
                if (k.C != null)
                {
                    builder.with(ObjectAnimator.ofFloat(k.C, "alpha", new float[] {
                        0.0F
                    }));
                }
                if (k.u != null)
                {
                    builder.with(ObjectAnimator.ofFloat(k.u, "alpha", new float[] {
                        1.0F
                    }));
                }
                builder.with(ObjectAnimator.ofFloat(k.t, "translationX", new float[] {
                    0.0F
                }));
                objectanimator4 = ObjectAnimator.ofFloat(k.s, "translationX", new float[] {
                    0.0F
                });
                objectanimator = ObjectAnimator.ofFloat(k.y, "translationX", new float[] {
                    (float)(-getWidth())
                });
                objectanimator5 = ObjectAnimator.ofFloat(k.s, "alpha", new float[] {
                    1.0F
                });
                objectanimator2 = ObjectAnimator.ofFloat(k.m, "translationX", new float[] {
                    0.0F
                });
                builder.with(objectanimator4).with(objectanimator5);
                objectanimator4 = ObjectAnimator.ofFloat(k.y, "alpha", new float[] {
                    0.0F
                });
                objectanimator5 = ObjectAnimator.ofFloat(k.m, "alpha", new float[] {
                    1.0F
                });
                builder.with(objectanimator).with(objectanimator4).with(objectanimator2).with(objectanimator5);
                motionevent.setDuration(100L);
                motionevent.addListener(new fnk(this));
                motionevent.setInterpolator(G);
                J = motionevent;
                J.start();
            }
        } else
        {
            e();
        }
        s = false;
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        }
        q.clear();
        return false;
_L5:
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        return false;
_L6:
        t = motionevent.getPointerId(motionevent.getActionIndex());
        continue; /* Loop/switch isn't completed */
_L7:
        a(motionevent);
        if (true) goto _L1; else goto _L10
_L10:
    }
}
