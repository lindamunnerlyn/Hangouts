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
import emy;
import fpr;
import fpu;
import fqg;
import fqh;
import fqi;
import fqj;
import fqk;
import fql;
import fqm;
import fqn;
import fqo;
import fqp;
import fqq;
import fqr;
import fqs;
import ftl;
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
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private ftl G;
    private Interpolator H;
    private int I;
    private int J;
    private ftl K;
    private ftl L;
    private ftl M;
    public fqr a;
    public boolean b;
    public AnimatorSet c;
    private fqp d;
    private int e;
    private fqs f;
    private emy g;
    private fpu h;
    private fpr i;
    private ArrayList j;
    private ftl k;
    private fqn l;
    private a m;
    private int n;
    private fqq o;
    private float p;
    private float q;
    private int r;
    private VelocityTracker s;
    private int t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private float y;
    private int z;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        e = 0;
        b = AccountSwitcherView.a(21);
        j = new ArrayList(2);
        n = -1;
        r = ViewConfiguration.get(context).getScaledTouchSlop();
        s = VelocityTracker.obtain();
        t = ViewConfiguration.getMinimumFlingVelocity();
        attributeset = context.getResources();
        w = attributeset.getDimensionPixelSize(g.ry);
        int i1;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            if (getResources().getConfiguration().getLayoutDirection() != 1)
            {
                flag = false;
            }
            E = flag;
        }
        if (AccountSwitcherView.a(21))
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
        H = context;
        J = attributeset.getDimensionPixelSize(g.rz);
        I = attributeset.getDimensionPixelSize(g.rx);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = motionevent.getActionIndex();
        if (motionevent.getPointerId(i1) == v)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            v = motionevent.getPointerId(i1);
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
            marginlayoutparams.topMargin = I + i1;
            view.setLayoutParams(marginlayoutparams);
        }
    }

    private void a(ImageView imageview, ftl ftl1)
    {
        if (imageview != null && i != null && g.a(ftl1))
        {
            imageview.setImageBitmap(fpr.a(imageview.getContext()));
            if (!TextUtils.isEmpty(ftl1.f()))
            {
                i.a(imageview);
                i.a(imageview, ftl1, 2);
            } else
            {
                i.a(imageview);
            }
            imageview.setVisibility(0);
            imageview.setContentDescription(getContext().getString(n.s, new Object[] {
                ftl1.a()
            }));
        }
    }

    private static void a(TextView textview, TextView textview1, ftl ftl1)
    {
label0:
        {
            boolean flag;
            if (textview != null && g.a(ftl1))
            {
                if (TextUtils.isEmpty(ftl1.c()))
                {
                    textview.setText(ftl1.a());
                    flag = false;
                } else
                {
                    flag = true;
                    textview.setText(ftl1.c());
                }
            } else
            {
                flag = false;
            }
            if (textview1 != null)
            {
                if (!flag || !g.a(ftl1))
                {
                    break label0;
                }
                textview1.setVisibility(0);
                textview1.setText(ftl1.a());
            }
            return;
        }
        textview1.setVisibility(8);
    }

    public static void a(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.K != null)
        {
            selectedaccountnavigationview.k = selectedaccountnavigationview.K;
            selectedaccountnavigationview.K = null;
        }
        if (selectedaccountnavigationview.L != null || selectedaccountnavigationview.M != null)
        {
            selectedaccountnavigationview.j.clear();
            if (selectedaccountnavigationview.L != null)
            {
                selectedaccountnavigationview.j.add(selectedaccountnavigationview.L);
            }
            if (selectedaccountnavigationview.M != null)
            {
                selectedaccountnavigationview.j.add(selectedaccountnavigationview.M);
            }
            selectedaccountnavigationview.L = null;
            selectedaccountnavigationview.M = null;
        }
    }

    public static void a(SelectedAccountNavigationView selectedaccountnavigationview, int i1)
    {
        if (selectedaccountnavigationview.j == null || selectedaccountnavigationview.j.size() == 0)
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
        ftl ftl1;
        Object obj2;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator2;
        int j1;
        if (i1 == 0)
        {
            obj = selectedaccountnavigationview.a.s;
        } else
        {
            obj = selectedaccountnavigationview.a.t;
        }
        if (i1 == 0)
        {
            obj1 = selectedaccountnavigationview.a.w;
        } else
        {
            obj1 = selectedaccountnavigationview.a.x;
        }
        ((View) (obj)).bringToFront();
        ftl1 = (ftl)selectedaccountnavigationview.j.get(i1);
        if (selectedaccountnavigationview.x == 0.0F)
        {
            selectedaccountnavigationview.x = selectedaccountnavigationview.a.w.getWidth();
        }
        obj1 = (android.view.ViewGroup.MarginLayoutParams)((View) (obj1)).getLayoutParams();
        obj2 = ObjectAnimator.ofFloat(selectedaccountnavigationview.a.p, "alpha", new float[] {
            1.0F, 0.0F
        });
        if (selectedaccountnavigationview.E)
        {
            j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).getMarginStart();
        } else
        {
            j1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).leftMargin;
        }
        f1 = selectedaccountnavigationview.w / selectedaccountnavigationview.x;
        f2 = selectedaccountnavigationview.w;
        f3 = selectedaccountnavigationview.x;
        f4 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).bottomMargin;
        f5 = selectedaccountnavigationview.a.p.getLeft() - (j1 + ((View) (obj)).getLeft());
        f6 = selectedaccountnavigationview.x;
        f7 = selectedaccountnavigationview.w;
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
            obj = selectedaccountnavigationview.a.D;
        } else
        {
            obj = selectedaccountnavigationview.a.E;
        }
        if (i1 == 0)
        {
            obj1 = selectedaccountnavigationview.a.G;
        } else
        {
            obj1 = selectedaccountnavigationview.a.H;
        }
        if (obj1 != null)
        {
            ((ImageView) (obj1)).setImageDrawable(selectedaccountnavigationview.a.v.getDrawable());
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
        if (selectedaccountnavigationview.a.y != null && selectedaccountnavigationview.a.m != null)
        {
            selectedaccountnavigationview.a.y.setAlpha(0.0F);
            selectedaccountnavigationview.a.y.setTranslationX(0.0F);
            selectedaccountnavigationview.a(ftl1, ((android.animation.AnimatorSet.Builder) (obj2)), 150);
        }
        if (selectedaccountnavigationview.a.u != null)
        {
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.a.u, "alpha", new float[] {
                0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj)));
        }
        if (selectedaccountnavigationview.a.C != null)
        {
            selectedaccountnavigationview.a(selectedaccountnavigationview.a, selectedaccountnavigationview.a.C, ftl1);
            selectedaccountnavigationview.a.C.setVisibility(0);
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.a.C, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((android.animation.AnimatorSet.Builder) (obj2)).with(((android.animation.Animator) (obj)));
        }
        animatorset.addListener(new fqh(selectedaccountnavigationview));
        obj = selectedaccountnavigationview.k;
        selectedaccountnavigationview.k = (ftl)selectedaccountnavigationview.j.get(i1);
        selectedaccountnavigationview.j.add(i1, obj);
        selectedaccountnavigationview.j.remove(i1 + 1);
        selectedaccountnavigationview.c(300);
        animatorset.setInterpolator(selectedaccountnavigationview.H);
        selectedaccountnavigationview.c = animatorset;
        selectedaccountnavigationview.c.start();
    }

    private void a(fqr fqr1, ImageView imageview, ftl ftl1)
    {
        if (imageview == null || !g.a(ftl1))
        {
            return;
        }
        if (!TextUtils.isEmpty(ftl1.g()))
        {
            h.a(imageview);
            h.a(imageview, ftl1, fqr1.u.getMeasuredWidth());
            return;
        } else
        {
            h.a(imageview);
            imageview.setImageBitmap(h.a(getContext()));
            return;
        }
    }

    private void a(ftl ftl1, android.animation.AnimatorSet.Builder builder, int i1)
    {
        a(a.z, a.A, ftl1);
        a.y.setVisibility(0);
        ftl1 = ObjectAnimator.ofFloat(a.y, "alpha", new float[] {
            1.0F
        });
        ftl1.setStartDelay(i1);
        ftl1.setDuration(150L);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(a.m, "alpha", new float[] {
            0.0F
        });
        objectanimator.setStartDelay(0L);
        objectanimator.setDuration(150L);
        builder.with(ftl1).with(objectanimator);
    }

    public static void b(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.l != null)
        {
            selectedaccountnavigationview.l.a(selectedaccountnavigationview.k);
        }
    }

    private void c(int i1)
    {
        if (m != null)
        {
            getHandler().postDelayed(new fqi(this), i1);
        }
    }

    private void d()
    {
        Context context = getContext();
        if (n == -1)
        {
            int i1;
            if (D)
            {
                i1 = h.ji;
            } else
            if (AccountSwitcherView.a(21))
            {
                i1 = h.ji;
            } else
            {
                i1 = h.jj;
            }
            n = i1;
        }
        if (f == null)
        {
            f = new fqo(this);
        }
        LayoutInflater.from(context).inflate(n, this);
        a = f.a(this);
        if (b)
        {
            a.s.setOnClickListener(new fqk(this));
            a.t.setOnClickListener(new fql(this));
        }
        if (a.n != null)
        {
            a.n.setOnClickListener(new fqm(this));
        }
    }

    private void e()
    {
        if (!b)
        {
            return;
        }
        if (a == null)
        {
            d();
        }
        if (a.u != null && a.u.getMeasuredWidth() == 0)
        {
            forceLayout();
            return;
        }
        if (j.size() > 0)
        {
            ftl ftl1 = (ftl)j.get(0);
            fqr fqr1 = a;
            a.s.setVisibility(0);
            a(a.w, ftl1);
            a(fqr1, fqr1.C, ftl1);
        } else
        {
            a.s.setVisibility(8);
        }
        if (j.size() > 1)
        {
            a.t.setVisibility(0);
            a(a.x, (ftl)j.get(1));
        } else
        {
            a.t.setVisibility(8);
        }
        y = -1F;
    }

    public int a()
    {
        return e;
    }

    public void a(int i1)
    {
        if (a == null)
        {
            d();
        }
        int j1 = J + i1;
        setMinimumHeight(j1);
        android.view.ViewGroup.LayoutParams layoutparams = a.I.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, j1);
        } else
        {
            layoutparams.height = j1;
        }
        a.I.setLayoutParams(layoutparams);
        a(a.p, i1);
        a(a.B, i1);
        a(a.s, i1);
        a(a.t, i1);
        a(a.D, i1);
        a(a.E, i1);
    }

    public void a(int i1, fqs fqs1, fqq fqq1)
    {
        n = i1;
        f = fqs1;
        o = fqq1;
    }

    public void a(emy emy)
    {
        g = emy;
        if (g != null)
        {
            a(new fpu(getContext(), g));
        }
    }

    public void a(fpr fpr1)
    {
        i = fpr1;
    }

    public void a(fpu fpu1)
    {
        h = fpu1;
    }

    public void a(fqn fqn1)
    {
        l = fqn1;
    }

    public void a(fqp fqp1)
    {
        d = fqp1;
    }

    public void a(ftl ftl1)
    {
        if (a == null)
        {
            d();
        }
        if (!g.a(ftl1))
        {
            k = null;
            return;
        }
        if (c != null && c.isRunning())
        {
            K = ftl1;
            return;
        }
        if (a.u != null && a.u.getMeasuredWidth() == 0)
        {
            G = ftl1;
            forceLayout();
            return;
        }
        if (g.a(k) && k.a().equals(ftl1.a())) goto _L2; else goto _L1
_L1:
        ftl ftl2;
        int i1;
        ftl2 = k;
        k = ftl1;
        ftl1 = k.a();
        i1 = 0;
_L6:
label0:
        {
            if (i1 >= j.size())
            {
                break MISSING_BLOCK_LABEL_271;
            }
            ftl ftl3 = (ftl)j.get(i1);
            if (g.a(ftl3) && ftl3.a() != null && ftl3.a().equals(ftl1))
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
            j.remove(i1);
        }
        if (ftl2 != null)
        {
            j.add(0, ftl2);
            for (; j.size() > 2; j.remove(j.size() - 1)) { }
        }
        b();
        return;
_L2:
        k = ftl1;
        b();
        return;
        i1 = -1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(ftl ftl1, ftl ftl2)
    {
        if (c != null && c.isRunning())
        {
            L = ftl1;
            M = ftl2;
            return;
        }
        if (j == null)
        {
            j = new ArrayList();
        } else
        {
            j.clear();
        }
        if (ftl1 != null)
        {
            j.add(ftl1);
        }
        if (ftl2 != null)
        {
            j.add(ftl2);
        }
        e();
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
        D = flag;
        b = D;
    }

    public void b()
    {
        if (a == null)
        {
            d();
        }
        if (b)
        {
            a(a.p);
            a(a.s);
            a(a.t);
            a(a.m);
            a(a.u);
            a(a.C);
            a(a.B);
        }
        fqr fqr1 = a;
        ftl ftl1 = k;
        if (fqr1.l != null && g.a(k))
        {
            fqr1.l.setContentDescription(getContext().getResources().getString(n.u, new Object[] {
                k.a()
            }));
        }
        if (fqr1.v != null && g.a(ftl1))
        {
            fqr1.v.setImageBitmap(fpr.a(getContext()));
            if (!TextUtils.isEmpty(ftl1.f()))
            {
                i.a(fqr1.v);
                i.a(fqr1.v, ftl1, 2);
            } else
            {
                i.a(fqr1.v);
            }
        }
        a(fqr1.q, fqr1.r, ftl1);
        a(fqr1, fqr1.u, ftl1);
        e();
        if (o != null)
        {
            o.a(a, k, j);
        }
        if (b)
        {
            x = a.w.getWidth();
            if (a.B != null)
            {
                a.B.setVisibility(8);
            }
            if (a.C != null)
            {
                a.C.setVisibility(8);
            }
            if (a.y != null)
            {
                a.y.setVisibility(8);
            }
            if (a.D != null)
            {
                kb.c(a.D, 0.0F);
                kb.d(a.D, 0.8F);
                kb.e(a.D, 0.8F);
                a.D.setVisibility(8);
            }
            if (a.E != null)
            {
                kb.c(a.E, 0.0F);
                kb.d(a.E, 0.8F);
                kb.e(a.E, 0.8F);
                a.E.setVisibility(8);
            }
        }
    }

    public void b(int i1)
    {
        boolean flag = true;
        if (e != i1)
        {
            e = i1;
            if (a == null)
            {
                d();
            }
            if (e != 1)
            {
                flag = false;
            }
            a.n.a(flag);
        }
    }

    public void c()
    {
        boolean flag = true;
        ExpanderView expanderview;
        int i1;
        if (e == 1)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        b(i1);
        if (d != null)
        {
            d.a(this);
        }
        expanderview = a.n;
        if (e != 1)
        {
            flag = false;
        }
        expanderview.a(flag);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR lookupswitch 2: default 32
    //                   0: 37
    //                   6: 59;
           goto _L1 _L2 _L3
_L1:
        return u;
_L2:
        u = false;
        v = motionevent.getPointerId(0);
        u = false;
        continue; /* Loop/switch isn't completed */
_L3:
        a(motionevent);
        v = -1;
        u = false;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onMeasure(int i1, int j1)
    {
        if (a == null)
        {
            d();
        }
        if (a.u != null)
        {
            a.u.measure(i1, j1);
        }
        if (a.k != null)
        {
            a.k.measure(i1, j1);
        }
        if (G != null)
        {
            a(G);
            G = null;
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
        p = motionevent.getX();
        q = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = motionevent.findPointerIndex(v);
        if (j1 < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f1 = motionevent.getX(j1);
        float f8 = motionevent.getY(j1);
        float f4 = f1 - p;
        f8 -= q;
        if (b && j.size() > 0 && !u && f4 * f4 + f8 * f8 > (float)(r * r) && Math.abs(f4) > Math.abs(f8))
        {
            u = true;
            if (obj != null)
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
            }
        }
        if (u)
        {
            f1 -= p;
            float f5;
            int k1;
            if (y == -1F)
            {
                obj = (android.view.ViewGroup.MarginLayoutParams)a.w.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.x.getLayoutParams();
                float f9;
                float f12;
                float f14;
                float f15;
                int i2;
                if (E)
                {
                    k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).getMarginStart();
                } else
                {
                    k1 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                if (E)
                {
                    i2 = marginlayoutparams.getMarginStart();
                } else
                {
                    i2 = marginlayoutparams.leftMargin;
                }
                y = k1 + a.s.getLeft();
                z = a.t.getLeft() + i2;
                B = a.p.getLeft() + a.p.getPaddingLeft();
                C = a.p.getWidth();
            }
            if (E)
            {
                f1 = Math.min(f1, 0.0F);
            } else
            {
                f1 = Math.max(f1, 0.0F);
            }
            if (x == 0.0F)
            {
                x = a.w.getWidth();
            }
            f12 = x / w;
            f9 = x;
            f14 = w;
            if (j.size() > 1)
            {
                f5 = z;
            } else
            {
                f5 = y;
            }
            f15 = (f5 - (float)B) + (x - w) * 0.5F;
            f5 = Math.min(1.0F, f1 / f15);
            f1 = Math.abs((f9 - f14) * 0.5F);
            f9 = Math.max(0.0F, 1.0F - f5);
            a.p.setTranslationX(f15 * f5);
            a.p.setTranslationY(Math.abs(f1 * f5) * -1F);
            f1 = Math.min(1.0F, Math.max(f12, 1.0F - f5 * f12));
            a.p.setScaleX(f1);
            a.p.setScaleY(f1);
            if (a.B != null)
            {
                if (a.B.getVisibility() != 0)
                {
                    if (E)
                    {
                        k1 = getWidth() - B;
                    } else
                    {
                        k1 = -C - B;
                    }
                    F = k1;
                    a.B.setTranslationX(F);
                    a.F.setImageDrawable(a.w.getDrawable());
                    a.B.setVisibility(0);
                } else
                {
                    f1 = -F;
                    a.B.setTranslationX(f1 * f5 + (float)F);
                }
            }
            if (j.size() > 1)
            {
                f1 = y;
                f12 = z;
                a.t.setTranslationX((f1 - f12) * f5);
            }
            if (j.size() > 0)
            {
                if (a.C != null)
                {
                    if (a.C.getVisibility() != 0)
                    {
                        a.C.setAlpha(0.0F);
                        a.C.setVisibility(0);
                    } else
                    {
                        a.C.setAlpha(f5);
                    }
                }
                if (a.u != null)
                {
                    a.u.setAlpha(1.0F - f5);
                }
                if (E)
                {
                    f1 = (float)getLeft() - ((float)a.s.getWidth() + y);
                } else
                {
                    f1 = (float)getWidth() - y;
                }
                a.s.setTranslationX(f1 * f5);
                a.s.setAlpha(f9);
                if (a.y != null)
                {
                    if (a.y.getVisibility() != 0)
                    {
                        obj = (ftl)j.get(0);
                        A = F;
                        a.y.setTranslationX(A);
                        a(a.z, a.A, ((ftl) (obj)));
                        a.y.setAlpha(0.0F);
                        a.y.setVisibility(0);
                    } else
                    {
                        if (f5 > 0.3333333F)
                        {
                            float f2 = Math.min(1.0F, (f5 - 0.3333333F) * 3F);
                            a.y.setAlpha(f2);
                        }
                        a.y.setTranslationX((float)A + (float)(-A) * f5);
                    }
                }
                if (a.m != null)
                {
                    a.m.setTranslationX(a.p.getTranslationX());
                    f1 = Math.max(0.0F, 1.0F - 3F * f5);
                    a.m.setAlpha(f1);
                }
            }
            s.addMovement(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        int k2 = motionevent.findPointerIndex(v);
        if (k2 < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
            return false;
        }
        if (u)
        {
            float f3;
            float f6;
            float f10;
            int l1;
            int j2;
            if (j.size() > 1)
            {
                f3 = z;
            } else
            {
                f3 = y;
            }
            f10 = a.p.getTranslationX();
            f6 = f10;
            if (E)
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
                if (motionevent.getX(k2) - p > (float)r)
                {
                    s.computeCurrentVelocity(1000);
                    float f7;
                    float f11;
                    float f13;
                    ObjectAnimator objectanimator1;
                    ObjectAnimator objectanimator3;
                    if (Math.abs(s.getXVelocity()) > (float)t)
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
                Object obj1 = (android.view.ViewGroup.MarginLayoutParams)a.w.getLayoutParams();
                Object obj2 = (android.view.ViewGroup.MarginLayoutParams)a.x.getLayoutParams();
                if (E)
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).getMarginStart();
                } else
                {
                    l1 = ((android.view.ViewGroup.MarginLayoutParams) (obj1)).leftMargin;
                }
                if (E)
                {
                    j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj2)).getMarginStart();
                } else
                {
                    j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj2)).leftMargin;
                }
                if (x == 0.0F)
                {
                    x = a.w.getWidth();
                }
                f3 = x / w;
                f11 = x;
                f13 = w;
                if (j.size() > 1)
                {
                    l1 = a.t.getLeft() + j2;
                } else
                {
                    l1 += a.s.getLeft();
                }
                f7 = l1 - a.p.getLeft();
                f7 = (x - w) * 0.5F + f7;
                obj1 = ObjectAnimator.ofFloat(a.p, "translationX", new float[] {
                    f7
                });
                obj2 = ObjectAnimator.ofFloat(a.p, "translationY", new float[] {
                    (f11 - f13) * 0.5F
                });
                objectanimator1 = ObjectAnimator.ofFloat(a.p, "scaleY", new float[] {
                    f3
                });
                objectanimator3 = ObjectAnimator.ofFloat(a.p, "scaleX", new float[] {
                    f3
                });
                obj1 = motionevent.play(((android.animation.Animator) (obj1))).with(((android.animation.Animator) (obj2))).with(objectanimator3).with(objectanimator1);
                if (b && j.size() > 0)
                {
                    if (j.size() > 1)
                    {
                        f3 = a.s.getLeft() - a.t.getLeft();
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(a.t, "translationX", new float[] {
                            f3
                        }));
                    }
                    if (E)
                    {
                        f3 = (float)getLeft() - ((float)a.s.getWidth() + y);
                    } else
                    {
                        f3 = getWidth() - a.s.getLeft();
                    }
                    obj2 = ObjectAnimator.ofFloat(a.s, "translationX", new float[] {
                        f3
                    });
                    objectanimator1 = ObjectAnimator.ofFloat(a.s, "alpha", new float[] {
                        0.0F
                    });
                    ((android.animation.AnimatorSet.Builder) (obj1)).with(((android.animation.Animator) (obj2))).with(objectanimator1);
                    if (a.B != null)
                    {
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(a.B, "translationX", new float[] {
                            0.0F
                        }));
                    }
                    if (a.y != null)
                    {
                        a((ftl)j.get(0), ((android.animation.AnimatorSet.Builder) (obj1)), 0);
                    }
                }
                motionevent.addListener(new fqj(this));
                obj1 = k;
                k = (ftl)j.remove(0);
                j.add(obj1);
                c(100);
                motionevent.setDuration((long)((1.0F - a.p.getTranslationX() / f7) * 450F));
                motionevent.setInterpolator(H);
                c = motionevent;
                c.start();
            } else
            {
                motionevent = new AnimatorSet();
                android.animation.AnimatorSet.Builder builder = motionevent.play(ObjectAnimator.ofFloat(a.p, "alpha", new float[] {
                    1.0F
                }));
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(a.p, "translationX", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(a.p, "translationY", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(a.p, "scaleX", new float[] {
                    1.0F
                });
                ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(a.p, "scaleY", new float[] {
                    1.0F
                });
                builder.with(objectanimator).with(objectanimator2).with(objectanimator4).with(objectanimator5);
                builder.with(ObjectAnimator.ofFloat(a.B, "translationX", new float[] {
                    (float)F
                }));
                if (a.C != null)
                {
                    builder.with(ObjectAnimator.ofFloat(a.C, "alpha", new float[] {
                        0.0F
                    }));
                }
                if (a.u != null)
                {
                    builder.with(ObjectAnimator.ofFloat(a.u, "alpha", new float[] {
                        1.0F
                    }));
                }
                builder.with(ObjectAnimator.ofFloat(a.t, "translationX", new float[] {
                    0.0F
                }));
                objectanimator4 = ObjectAnimator.ofFloat(a.s, "translationX", new float[] {
                    0.0F
                });
                objectanimator = ObjectAnimator.ofFloat(a.y, "translationX", new float[] {
                    (float)(-getWidth())
                });
                objectanimator5 = ObjectAnimator.ofFloat(a.s, "alpha", new float[] {
                    1.0F
                });
                objectanimator2 = ObjectAnimator.ofFloat(a.m, "translationX", new float[] {
                    0.0F
                });
                builder.with(objectanimator4).with(objectanimator5);
                objectanimator4 = ObjectAnimator.ofFloat(a.y, "alpha", new float[] {
                    0.0F
                });
                objectanimator5 = ObjectAnimator.ofFloat(a.m, "alpha", new float[] {
                    1.0F
                });
                builder.with(objectanimator).with(objectanimator4).with(objectanimator2).with(objectanimator5);
                motionevent.setDuration(100L);
                motionevent.addListener(new fqg(this));
                motionevent.setInterpolator(H);
                c = motionevent;
                c.start();
            }
        } else
        {
            c();
        }
        u = false;
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        }
        s.clear();
        return false;
_L5:
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        return false;
_L6:
        v = motionevent.getPointerId(motionevent.getActionIndex());
        continue; /* Loop/switch isn't completed */
_L7:
        a(motionevent);
        if (true) goto _L1; else goto _L10
_L10:
    }
}
