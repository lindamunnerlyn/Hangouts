// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import il;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jg;
import jq;
import jx;
import kb;
import ko;
import kz;
import la;
import lb;
import lc;
import ld;
import le;
import lf;
import lg;
import lh;
import li;
import lj;
import ll;
import or;

public class ViewPager extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private static final ll ag = new ll();
    private static final Comparator c = new kz();
    private static final Interpolator d = new la();
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private or Q;
    private or R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private List W;
    private lg aa;
    private lg ab;
    private lh ac;
    private Method ad;
    private int ae;
    private ArrayList af;
    private final Runnable ah;
    private int ai;
    private int b;
    private final ArrayList e;
    private final ld f;
    private final Rect g;
    private jq h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private li n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        e = new ArrayList();
        f = new ld();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ah = new lb(this);
        ai = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new ld();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ah = new lb(this);
        ai = 0;
        a();
    }

    private Rect a(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !e.isEmpty())
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            int k2 = getPaddingLeft();
            int l2 = getPaddingRight();
            float f1 = (float)getScrollX() / (float)((j1 - k2 - l2) + l1);
            j1 = (int)((float)((i1 - i2 - j2) + k1) * f1);
            scrollTo(j1, getScrollY());
            if (!m.isFinished())
            {
                k1 = m.getDuration();
                l1 = m.timePassed();
                ld ld1 = e(i);
                m.startScroll(j1, 0, (int)(ld1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            ld ld2 = e(i);
            float f2;
            if (ld2 != null)
            {
                f2 = Math.min(ld2.e, t);
            } else
            {
                f2 = 0.0F;
            }
            i1 = (int)(f2 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
            if (i1 != getScrollX())
            {
                b(false);
                scrollTo(i1, getScrollY());
                return;
            }
        }
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        ld ld1 = e(i1);
        int k1;
        if (ld1 != null)
        {
            float f1 = i();
            k1 = (int)(Math.max(s, Math.min(ld1.e, t)) * f1);
        } else
        {
            k1 = 0;
        }
        if (flag)
        {
            a(k1, j1);
            if (flag1)
            {
                i(i1);
            }
            return;
        }
        if (flag1)
        {
            i(i1);
        }
        b(false);
        scrollTo(k1, 0);
        h(k1);
    }

    public static void a(ViewPager viewpager)
    {
        viewpager.g(0);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = jg.b(motionevent);
        if (jg.b(motionevent, i1) == J)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = jg.c(motionevent, i1);
            J = jg.b(motionevent, i1);
            if (K != null)
            {
                K.clear();
            }
        }
    }

    private void a(ld ld1, int i1, ld ld2)
    {
        int j2 = h.b();
        int j1 = i();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)o / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (ld2 != null)
        {
            j1 = ld2.b;
            if (j1 < ld1.b)
            {
                float f1 = ld2.e + ld2.d + f4;
                int k1 = 0;
                for (j1++; j1 <= ld1.b && k1 < e.size(); j1++)
                {
                    for (ld2 = (ld)e.get(k1); j1 > ld2.b && k1 < e.size() - 1; ld2 = (ld)e.get(k1))
                    {
                        k1++;
                    }

                    while (j1 < ld2.b) 
                    {
                        j1++;
                        f1 = f4 + 1.0F + f1;
                    }
                    ld2.e = f1;
                    f1 += ld2.d + f4;
                }

            } else
            if (j1 > ld1.b)
            {
                int l1 = e.size();
                float f2 = ld2.e;
                l1--;
                for (j1--; j1 >= ld1.b && l1 >= 0; j1--)
                {
                    for (ld2 = (ld)e.get(l1); j1 < ld2.b && l1 > 0; ld2 = (ld)e.get(l1))
                    {
                        l1--;
                    }

                    while (j1 > ld2.b) 
                    {
                        j1--;
                        f2 -= f4 + 1.0F;
                    }
                    f2 -= ld2.d + f4;
                    ld2.e = f2;
                }

            }
        }
        int k2 = e.size();
        float f5 = ld1.e;
        j1 = ld1.b - 1;
        float f3;
        int i2;
        if (ld1.b == 0)
        {
            f3 = ld1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        s = f3;
        if (ld1.b == j2 - 1)
        {
            f3 = (ld1.e + ld1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        t = f3;
        i2 = i1 - 1;
        f3 = f5;
        for (; i2 >= 0; i2--)
        {
            for (ld2 = (ld)e.get(i2); j1 > ld2.b;)
            {
                j1--;
                f3 -= f4 + 1.0F;
            }

            f3 -= ld2.d + f4;
            ld2.e = f3;
            if (ld2.b == 0)
            {
                s = f3;
            }
            j1--;
        }

        f3 = ld1.e + ld1.d + f4;
        i2 = ld1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < k2; j1++)
        {
            for (ld1 = (ld)e.get(j1); i1 < ld1.b;)
            {
                i1++;
                f3 += f4 + 1.0F;
            }

            if (ld1.b == j2 - 1)
            {
                t = (ld1.d + f3) - 1.0F;
            }
            ld1.e = f3;
            f3 += ld1.d + f4;
            i1++;
        }

        T = false;
    }

    public static jq b(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private void b(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (ai == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                c(false);
                m.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = m.getCurrX();
                int i2 = m.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                    if (l1 != j1)
                    {
                        h(l1);
                    }
                }
            }
            y = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                ld ld1 = (ld)e.get(i1);
                if (ld1.c)
                {
                    ld1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                kb.a(this, ah);
            }
            return;
        }
        ah.run();
    }

    private boolean b(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = F;
        F = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = i();
        f1 = (float)i1 * s;
        f2 = i1;
        float f4 = t;
        ld ld1 = (ld)e.get(0);
        ld ld2 = (ld)e.get(e.size() - 1);
        boolean flag;
        if (ld1.b != 0)
        {
            f1 = ld1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (ld2.b != h.b() - 1)
        {
            f2 = ld2.e * (float)i1;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = Q.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        F = F + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        h((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = R.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int c(ViewPager viewpager)
    {
        return viewpager.i;
    }

    private void c(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
        }
    }

    private void g(int i1)
    {
        boolean flag1 = false;
        if (ai != i1)
        {
            ai = i1;
            if (ac != null)
            {
                boolean flag;
                int k1;
                int i2;
                if (i1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i2 = getChildCount();
                k1 = 0;
                while (k1 < i2) 
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    kb.d(getChildAt(k1), byte0);
                    k1++;
                }
            }
            if (aa != null)
            {
                aa.b(i1);
            }
            if (W != null)
            {
                int l1 = W.size();
                for (int j1 = ((flag1) ? 1 : 0); j1 < l1; j1++)
                {
                    lg lg1 = (lg)W.get(j1);
                    if (lg1 != null)
                    {
                        lg1.b(i1);
                    }
                }

            }
            if (ab != null)
            {
                ab.b(i1);
                return;
            }
        }
    }

    private boolean h(int i1)
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            U = false;
            a(0, 0.0F, 0);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            ld ld1 = l();
            int k1 = i();
            int l1 = o;
            float f1 = (float)o / (float)k1;
            int j1 = ld1.b;
            f1 = ((float)i1 / (float)k1 - ld1.e) / (ld1.d + f1);
            i1 = (int)((float)(l1 + k1) * f1);
            U = false;
            a(j1, f1, i1);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    public static int[] h()
    {
        return a;
    }

    private int i()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void i(int i1)
    {
        if (aa != null)
        {
            aa.a(i1);
        }
        if (W != null)
        {
            int k1 = W.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                lg lg1 = (lg)W.get(j1);
                if (lg1 != null)
                {
                    lg1.a(i1);
                }
            }

        }
        if (ab != null)
        {
            ab.a(i1);
        }
    }

    private void j()
    {
        if (ae != 0)
        {
            int j1;
            if (af == null)
            {
                af = new ArrayList();
            } else
            {
                af.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                af.add(view);
            }

            Collections.sort(af, ag);
        }
    }

    private void k()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private ld l()
    {
        int i1 = i();
        float f1;
        float f2;
        float f3;
        float f4;
        ld ld2;
        boolean flag;
        int j1;
        if (i1 > 0)
        {
            f1 = (float)getScrollX() / (float)i1;
        } else
        {
            f1 = 0.0F;
        }
        if (i1 > 0)
        {
            f2 = (float)o / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        ld2 = null;
        do
        {
            ld ld1;
label0:
            {
                ld ld3;
label1:
                {
                    ld3 = ld2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    ld1 = (ld)e.get(i1);
                    if (!flag && ld1.b != j1 + 1)
                    {
                        ld1 = f;
                        ld1.e = f4 + f3 + f2;
                        ld1.b = j1 + 1;
                        ld1.d = 1.0F;
                        i1--;
                    }
                    f3 = ld1.e;
                    f4 = ld1.d;
                    if (!flag)
                    {
                        ld3 = ld2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != e.size() - 1)
                    {
                        break label0;
                    }
                    ld3 = ld1;
                }
                return ld3;
            }
            j1 = ld1.b;
            f4 = ld1.d;
            flag = false;
            i1++;
            ld2 = ld1;
        } while (true);
    }

    private void m()
    {
        A = false;
        B = false;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
    }

    float a(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    ld a(View view)
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            ld ld1 = (ld)e.get(i1);
            if (h.a(view, ld1.a))
            {
                return ld1;
            }
        }

        return null;
    }

    void a()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, d);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        E = ko.a(viewconfiguration);
        L = (int)(400F * f1);
        M = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = new or(context);
        R = new or(context);
        N = (int)(25F * f1);
        O = (int)(2.0F * f1);
        C = (int)(16F * f1);
        kb.a(this, new lf(this));
        if (kb.e(this) == 0)
        {
            kb.c(this, 1);
        }
    }

    public void a(int i1)
    {
        y = false;
        boolean flag;
        if (!S)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    protected void a(int i1, float f1, int j1)
    {
        if (V <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        i3 = getScrollX();
        k1 = getPaddingLeft();
        l1 = getPaddingRight();
        j3 = getWidth();
        k3 = getChildCount();
        l2 = 0;
_L8:
        if (l2 >= k3) goto _L2; else goto _L3
_L3:
        View view;
        le le1;
        view = getChildAt(l2);
        le1 = (le)view.getLayoutParams();
        if (!le1.a)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        le1.b & 7;
        JVM INSTR tableswitch 1 5: default 116
    //                   1 219
    //                   2 116
    //                   3 190
    //                   4 116
    //                   5 251;
           goto _L4 _L5 _L4 _L6 _L4 _L7
_L4:
        int i2;
        i2 = k1;
        int j2 = l1;
        l1 = k1;
        k1 = j2;
_L9:
        int k2;
        int l3 = (i2 + i3) - view.getLeft();
        i2 = k1;
        k2 = l1;
        if (l3 != 0)
        {
            view.offsetLeftAndRight(l3);
            k2 = l1;
            i2 = k1;
        }
_L10:
        l2++;
        k1 = k2;
        l1 = i2;
          goto _L8
_L6:
        i2 = view.getWidth();
        k2 = i2 + k1;
        i2 = k1;
        k1 = l1;
        l1 = k2;
          goto _L9
_L5:
        i2 = Math.max((j3 - view.getMeasuredWidth()) / 2, k1);
        k2 = k1;
        k1 = l1;
        l1 = k2;
          goto _L9
_L7:
        i2 = j3 - l1 - view.getMeasuredWidth();
        int i4 = view.getMeasuredWidth();
        k2 = k1;
        k1 = l1 + i4;
        l1 = k2;
          goto _L9
_L2:
        if (aa != null)
        {
            aa.a(i1, f1, j1);
        }
        if (W != null)
        {
            l1 = W.size();
            for (k1 = 0; k1 < l1; k1++)
            {
                lg lg1 = (lg)W.get(k1);
                if (lg1 != null)
                {
                    lg1.a(i1, f1, j1);
                }
            }

        }
        if (ab != null)
        {
            ab.a(i1, f1, j1);
        }
        if (ac != null)
        {
            j1 = getScrollX();
            k1 = getChildCount();
            for (i1 = 0; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                if (!((le)view1.getLayoutParams()).a)
                {
                    f1 = (float)(view1.getLeft() - j1) / (float)i();
                    ac.a(view1, f1);
                }
            }

        }
        U = true;
        return;
        i2 = l1;
        k2 = k1;
          goto _L10
    }

    void a(int i1, int j1)
    {
        if (getChildCount() == 0)
        {
            c(false);
            return;
        }
        int k1 = getScrollX();
        int l1 = getScrollY();
        int i2 = i1 - k1;
        int j2 = 0 - l1;
        if (i2 == 0 && j2 == 0)
        {
            b(false);
            e();
            g(0);
            return;
        }
        c(true);
        g(2);
        i1 = i();
        int k2 = i1 / 2;
        float f4 = Math.min(1.0F, ((float)Math.abs(i2) * 1.0F) / (float)i1);
        float f1 = k2;
        float f3 = k2;
        f4 = a(f4);
        j1 = Math.abs(j1);
        if (j1 > 0)
        {
            i1 = Math.round(1000F * Math.abs((f3 * f4 + f1) / (float)j1)) * 4;
        } else
        {
            float f2 = i1;
            i1 = (int)(((float)Math.abs(i2) / (f2 + (float)o) + 1.0F) * 100F);
        }
        i1 = Math.min(i1, 600);
        m.startScroll(k1, l1, i2, j2, i1);
        kb.d(this);
    }

    public void a(int i1, boolean flag)
    {
        y = false;
        a(i1, flag, false);
    }

    void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = false;
        if (h == null || h.b() <= 0)
        {
            c(false);
            return;
        }
        if (!flag1 && i == i1 && e.size() != 0)
        {
            c(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = z;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((ld)e.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= h.b())
        {
            k1 = h.b() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (i != k1)
        {
            flag1 = true;
        }
        if (S)
        {
            i = k1;
            if (flag1)
            {
                i(k1);
            }
            requestLayout();
            return;
        } else
        {
            d(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    public void a(jq jq1)
    {
        boolean flag;
label0:
        {
            if (h != null)
            {
                h.b(n);
                for (int i1 = 0; i1 < e.size(); i1++)
                {
                    ld ld1 = (ld)e.get(i1);
                    h.a(this, ld1.b, ld1.a);
                }

                h.a();
                e.clear();
                int k1;
                for (int j1 = 0; j1 < getChildCount(); j1 = k1 + 1)
                {
                    k1 = j1;
                    if (!((le)getChildAt(j1).getLayoutParams()).a)
                    {
                        removeViewAt(j1);
                        k1 = j1 - 1;
                    }
                }

                i = 0;
                scrollTo(0, 0);
            }
            h = jq1;
            b = 0;
            if (h != null)
            {
                if (n == null)
                {
                    n = new li(this);
                }
                h.a(n);
                y = false;
                flag = S;
                S = true;
                b = h.b();
                if (j < 0)
                {
                    break label0;
                }
                a(j, false, true);
                j = -1;
                k = null;
                l = null;
            }
            return;
        }
        if (!flag)
        {
            e();
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    public void a(lg lg1)
    {
        aa = lg1;
    }

    public void a(lh lh1)
    {
        boolean flag1 = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            boolean flag;
            if (ac != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag1 = true;
            }
            ac = lh1;
            a(true);
            ae = 2;
            if (flag1)
            {
                e();
            }
        }
    }

    void a(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 7)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (ad == null)
        {
            try
            {
                ad = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", nosuchmethodexception);
            }
        }
        ad.invoke(this, new Object[] {
            Boolean.valueOf(true)
        });
        return;
        Exception exception;
        exception;
        Log.e("ViewPager", "Error changing children drawing order", exception);
        return;
    }

    public boolean a(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60;
           goto _L2 _L3 _L4 _L5
_L2:
        return false;
_L3:
        return f(17);
_L4:
        return f(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (il.b(keyevent))
            {
                return f(2);
            }
            if (il.a(keyevent))
            {
                return f(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l1;
        int i2;
        int j2;
        viewgroup = (ViewGroup)view;
        i2 = view.getScrollX();
        j2 = view.getScrollY();
        l1 = viewgroup.getChildCount() - 1;
_L8:
        if (l1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l1);
        if (j1 + i2 < view1.getLeft() || j1 + i2 >= view1.getRight() || k1 + j2 < view1.getTop() || k1 + j2 >= view1.getBottom() || !a(view1, true, i1, (j1 + i2) - view1.getLeft(), (k1 + j2) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && kb.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        int l1 = arraylist.size();
        int i2 = getDescendantFocusability();
        if (i2 != 0x60000)
        {
            for (int k1 = 0; k1 < getChildCount(); k1++)
            {
                View view = getChildAt(k1);
                if (view.getVisibility() == 0)
                {
                    ld ld1 = a(view);
                    if (ld1 != null && ld1.b == i)
                    {
                        view.addFocusables(arraylist, i1, j1);
                    }
                }
            }

        }
        while (i2 == 0x40000 && l1 != arraylist.size() || !isFocusable() || (j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            ld ld1 = a(view);
            if (ld1 != null && ld1.b == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        le le1 = (le)layoutparams;
        le1.a = le1.a | (view instanceof lc);
        if (w)
        {
            if (le1 != null && le1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                le1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public jq b()
    {
        return h;
    }

    ld b(int i1, int j1)
    {
        ld ld1 = new ld();
        ld1.b = i1;
        ld1.a = h.a(this, i1);
        ld1.d = 1.0F;
        if (j1 < 0 || j1 >= e.size())
        {
            e.add(ld1);
            return ld1;
        } else
        {
            e.add(j1, ld1);
            return ld1;
        }
    }

    ld b(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return a(view);
            }
        } while (true);
    }

    public void b(int i1)
    {
        int j1 = i1;
        if (i1 <= 0)
        {
            (new StringBuilder("Requested offscreen page limit ")).append(i1).append(" too small; defaulting to 1");
            j1 = 1;
        }
        if (j1 != z)
        {
            z = j1;
            e();
        }
    }

    public void b(lg lg1)
    {
        if (W == null)
        {
            W = new ArrayList();
        }
        W.add(lg1);
    }

    public int c()
    {
        return i;
    }

    public void c(int i1)
    {
        int j1 = o;
        o = i1;
        int k1 = getWidth();
        a(k1, k1, i1, j1);
        requestLayout();
    }

    public boolean canScrollHorizontally(int i1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1;
        int k1;
        j1 = i();
        k1 = getScrollX();
        if (i1 >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 <= (int)((float)j1 * s)) goto _L1; else goto _L3
_L3:
        return true;
        if (i1 <= 0 || k1 >= (int)((float)j1 * t)) goto _L1; else goto _L4
_L4:
        return true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof le) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!m.isFinished() && m.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = m.getCurrX();
            int l1 = m.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!h(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            kb.d(this);
            return;
        } else
        {
            b(true);
            return;
        }
    }

    public void d()
    {
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2 = h.b();
        b = l2;
        int j2;
        if (e.size() < (z << 1) + 1 && e.size() < l2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i;
        k1 = 0;
        i2 = 0;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = i2;
        if (k1 >= e.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ld)e.get(k1);
        i2 = h.c(((ld) (obj)).a);
        if (i2 == -1)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        if (i2 == -2)
        {
            e.remove(k1);
            l1 = k1 - 1;
            k1 = j1;
            if (j1 == 0)
            {
                k1 = 1;
            }
            h.a(this, ((ld) (obj)).b, ((ld) (obj)).a);
            int k2;
            if (i == ((ld) (obj)).b)
            {
                j1 = Math.max(0, Math.min(i, l2 - 1));
                i1 = k1;
                k1 = 1;
            } else
            {
                j1 = i1;
                boolean flag = true;
                i1 = k1;
                k1 = ((flag) ? 1 : 0);
            }
        } else
        {
            if (((ld) (obj)).b == i2)
            {
                break MISSING_BLOCK_LABEL_360;
            }
            if (((ld) (obj)).b == i)
            {
                i1 = i2;
            }
            obj.b = i2;
            i2 = i1;
            k2 = 1;
            l1 = k1;
            i1 = j1;
            j1 = i2;
            k1 = k2;
        }
        i2 = k1;
        j2 = j1;
        k1 = l1 + 1;
        j1 = i1;
        i1 = j2;
        l1 = i2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_70;
_L1:
        if (j1 != 0)
        {
            h.a();
        }
        Collections.sort(e, c);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (le)getChildAt(j1).getLayoutParams();
                if (!((le) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(i1, false, true);
            requestLayout();
        }
        return;
        i2 = i1;
        k2 = l1;
        l1 = k1;
        i1 = j1;
        j1 = i2;
        k1 = k2;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_196;
        }
    }

    void d(int i1)
    {
        float f1;
        float f5;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        if (i != i1)
        {
            byte byte0;
            if (i < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = e(i);
            i = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        j();
_L4:
        return;
_L2:
        if (y)
        {
            j();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        i1 = z;
        j3 = Math.max(0, i - i1);
        l2 = h.b();
        i3 = Math.min(l2 - 1, i1 + i);
        if (l2 != b)
        {
            String s1;
            try
            {
                s1 = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ")).append(b).append(", found: ").append(l2).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        i1 = 0;
_L14:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_1254;
        }
        obj = (ld)e.get(i1);
        if (((ld) (obj)).b < i) goto _L6; else goto _L5
_L5:
        if (((ld) (obj)).b != i)
        {
            break MISSING_BLOCK_LABEL_1254;
        }
_L21:
        if (obj == null && l2 > 0)
        {
            obj2 = b(i, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        k2 = i1 - 1;
        float f3;
        if (k2 >= 0)
        {
            obj = (ld)e.get(k2);
        } else
        {
            obj = null;
        }
        k3 = i();
        if (k3 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (2.0F - ((ld) (obj2)).d) + (float)getPaddingLeft() / (float)k3;
        }
        j1 = i;
        f5 = 0.0F;
        j2 = j1 - 1;
        i2 = i1;
        obj3 = obj;
        if (j2 < 0) goto _L10; else goto _L9
_L9:
        if (f5 < f3 || j2 >= j3) goto _L12; else goto _L11
_L11:
        if (obj3 == null) goto _L10; else goto _L13
_L13:
        obj = obj3;
        i1 = k2;
        f1 = f5;
        j1 = i2;
        if (j2 == ((ld) (obj3)).b)
        {
            obj = obj3;
            i1 = k2;
            f1 = f5;
            j1 = i2;
            if (!((ld) (obj3)).c)
            {
                e.remove(k2);
                h.a(this, j2, ((ld) (obj3)).a);
                i1 = k2 - 1;
                j1 = i2 - 1;
                if (i1 >= 0)
                {
                    obj = (ld)e.get(i1);
                    f1 = f5;
                } else
                {
                    obj = null;
                    f1 = f5;
                }
            }
        }
_L15:
        j2--;
        obj3 = obj;
        k2 = i1;
        f5 = f1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_368;
_L6:
        i1++;
          goto _L14
_L12:
        if (obj3 != null && j2 == ((ld) (obj3)).b)
        {
            f1 = f5 + ((ld) (obj3)).d;
            i1 = k2 - 1;
            if (i1 >= 0)
            {
                obj = (ld)e.get(i1);
                j1 = i2;
            } else
            {
                obj = null;
                j1 = i2;
            }
        } else
        {
            f1 = f5 + b(j2, k2 + 1).d;
            j1 = i2 + 1;
            if (k2 >= 0)
            {
                obj = (ld)e.get(k2);
                i1 = k2;
            } else
            {
                obj = null;
                i1 = k2;
            }
        }
          goto _L15
_L10:
label0:
        {
            float f2 = ((ld) (obj2)).d;
            i1 = i2 + 1;
            if (f2 >= 2.0F)
            {
                break label0;
            }
            float f4;
            int k1;
            if (i1 < e.size())
            {
                obj = (ld)e.get(i1);
            } else
            {
                obj = null;
            }
            if (k3 <= 0)
            {
                f4 = 0.0F;
            } else
            {
                f4 = (float)getPaddingRight() / (float)k3 + 2.0F;
            }
            k1 = i;
            k1++;
            do
            {
                if (k1 >= l2)
                {
                    break label0;
                }
                if (f2 >= f4 && k1 > i3)
                {
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (k1 == ((ld) (obj)).b && !((ld) (obj)).c)
                    {
                        e.remove(i1);
                        h.a(this, k1, ((ld) (obj)).a);
                        if (i1 < e.size())
                        {
                            obj = (ld)e.get(i1);
                        } else
                        {
                            obj = null;
                        }
                    }
                } else
                if (obj != null && k1 == ((ld) (obj)).b)
                {
                    float f6 = ((ld) (obj)).d;
                    i1++;
                    if (i1 < e.size())
                    {
                        obj = (ld)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f6;
                } else
                {
                    obj = b(k1, i1);
                    i1++;
                    float f7 = ((ld) (obj)).d;
                    if (i1 < e.size())
                    {
                        obj = (ld)e.get(i1);
                    } else
                    {
                        obj = null;
                    }
                    f2 += f7;
                }
                k1++;
            } while (true);
        }
        a(((ld) (obj2)), i2, ((ld) (obj1)));
_L8:
        obj1 = h;
        int l1;
        if (obj2 != null)
        {
            obj = ((ld) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((jq) (obj1)).a(obj);
        h.a();
        l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (le)((View) (obj1)).getLayoutParams();
            obj.f = i1;
            if (((le) (obj)).a || ((le) (obj)).c != 0.0F)
            {
                continue;
            }
            obj1 = a(((View) (obj1)));
            if (obj1 != null)
            {
                obj.c = ((ld) (obj1)).d;
                obj.e = ((ld) (obj1)).b;
            }
        }

        j();
        if (!hasFocus()) goto _L4; else goto _L16
_L16:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((ld) (obj)).b == i) goto _L4; else goto _L17
_L17:
        i1 = 0;
_L20:
        if (i1 >= getChildCount()) goto _L4; else goto _L18
_L18:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((ld) (obj1)).b == i && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L19
_L19:
        i1++;
          goto _L20
        obj = null;
          goto _L21
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
            flag = flag1;
            if (i1 >= j1)
            {
                continue;
            }
            View view = getChildAt(i1);
            if (view.getVisibility() == 0)
            {
                ld ld1 = a(view);
                if (ld1 != null && ld1.b == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = kb.a(this);
        if (k1 == 0 || k1 == 1 && h != null && h.b() > 1)
        {
            if (!Q.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), s * (float)l1);
                Q.a(i1, l1);
                i1 = Q.a(canvas) | false;
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!R.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(t + 1.0F) * (float)j1);
                R.a(j2 - k2 - l2, j1);
                j1 = i1 | R.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            Q.b();
            R.b();
        }
        if (j1 != 0)
        {
            kb.d(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = p;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    ld e(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            ld ld1 = (ld)e.get(j1);
            if (ld1.b == i1)
            {
                return ld1;
            }
        }

        return null;
    }

    public void e()
    {
        d(i);
    }

    boolean f()
    {
        if (i > 0)
        {
            a(i - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean f(int i1)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1;
        boolean flag;
        j1 = a(g, view).left;
        int k1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = f();
        } else
        {
            flag = view.requestFocus();
        }
_L18:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_347;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L19:
        if (j1 != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ")).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i1 != 66) goto _L15; else goto _L14
_L14:
        int l1;
        j1 = a(g, view).left;
        l1 = a(g, ((View) (obj))).left;
        if (obj != null && j1 <= l1) goto _L17; else goto _L16
_L16:
        flag = view.requestFocus();
          goto _L18
_L4:
label0:
        {
            if (i1 != 17 && i1 != 1)
            {
                break label0;
            }
            flag = f();
        }
          goto _L18
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        flag = g();
          goto _L18
_L15:
        flag = false;
          goto _L18
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L19
    }

    boolean g()
    {
        if (h != null && i < h.b() - 1)
        {
            a(i + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new le();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new le(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (ae == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((le)((View)af.get(k1)).getLayoutParams()).f;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        S = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ah);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o > 0 && p != null && e.size() > 0 && h != null)
        {
            int k1 = getScrollX();
            int l1 = getWidth();
            float f3 = (float)o / (float)l1;
            Object obj = (ld)e.get(0);
            float f1 = ((ld) (obj)).e;
            int i2 = e.size();
            int i1 = ((ld) (obj)).b;
            int j2 = ((ld)e.get(i2 - 1)).b;
            int j1 = 0;
            do
            {
                if (i1 >= j2)
                {
                    break;
                }
                for (; i1 > ((ld) (obj)).b && j1 < i2; obj = (ld)((ArrayList) (obj)).get(j1))
                {
                    obj = e;
                    j1++;
                }

                float f2;
                if (i1 == ((ld) (obj)).b)
                {
                    f2 = (((ld) (obj)).e + ((ld) (obj)).d) * (float)l1;
                    f1 = ((ld) (obj)).e + ((ld) (obj)).d + f3;
                } else
                {
                    f2 = (1.0F + f1) * (float)l1;
                    f1 += 1.0F + f3;
                }
                if ((float)o + f2 > (float)k1)
                {
                    p.setBounds((int)f2, q, (int)((float)o + f2 + 0.5F), r);
                    p.draw(canvas);
                }
                if (f2 > (float)(k1 + l1))
                {
                    break;
                }
                i1++;
            } while (true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        A = false;
        B = false;
        J = -1;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (A)
        {
            return true;
        }
        if (B) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 427
    //                   2: 143
    //                   6: 558;
           goto _L5 _L6 _L7 _L8
_L5:
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        return A;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = J;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = jg.a(motionevent, j1);
        f3 = jg.c(motionevent, j1);
        f1 = f3 - F;
        f5 = Math.abs(f1);
        f4 = jg.d(motionevent, j1);
        f6 = Math.abs(f4 - I);
        if (f1 != 0.0F)
        {
            float f7 = F;
            boolean flag;
            if (f7 < (float)D && f1 > 0.0F || f7 > (float)(getWidth() - D) && f1 < 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && a(this, false, (int)f1, (int)f3, (int)f4))
            {
                F = f3;
                G = f4;
                B = true;
                return false;
            }
        }
        if (f5 <= (float)E || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        A = true;
        k();
        g(1);
        if (f1 > 0.0F)
        {
            f1 = H + (float)E;
        } else
        {
            f1 = H - (float)E;
        }
        F = f1;
        G = f4;
        c(true);
_L11:
        if (A && b(f3))
        {
            kb.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)E)
        {
            B = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        H = f2;
        F = f2;
        f2 = motionevent.getY();
        I = f2;
        G = f2;
        J = jg.b(motionevent, 0);
        B = false;
        m.computeScrollOffset();
        if (ai == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > O)
        {
            m.abortAnimation();
            y = false;
            e();
            A = true;
            k();
            g(1);
        } else
        {
            b(false);
            A = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        l4 = getChildCount();
        j5 = k1 - i1;
        i5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        k1 = getPaddingBottom();
        k5 = getScrollX();
        j2 = 0;
        j3 = 0;
_L14:
        if (j3 >= l4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j3);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        le le1 = (le)view.getLayoutParams();
        if (!le1.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = le1.b;
        l5 = le1.b;
        l1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        l1 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        l1 += k5;
        view.layout(l1, k1, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + k1);
        j2++;
        l1 = i2;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        i2 = l1;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        l1 = j1;
        k2 += j1;
          goto _L15
_L7:
        l1 = Math.max((j5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        l1 = i2 + view.getMeasuredWidth();
        int l3 = j5 - i2 - k2;
        i2 = l1;
        k2 = j1;
        l1 = l3;
          goto _L15
_L12:
        int i4 = view.getMeasuredHeight();
        j1 = k1;
        i4 += i1;
        k1 = i1;
        i1 = j1;
        j1 = i4;
          goto _L16
_L11:
        int j4 = Math.max((i5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = i5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        i2 = j5 - j1 - i2;
        for (l1 = 0; l1 < l4; l1++)
        {
            View view1 = getChildAt(l1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            le le2 = (le)view1.getLayoutParams();
            if (le2.a)
            {
                continue;
            }
            ld ld1 = a(view1);
            if (ld1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(ld1.e * f1) + j1;
            if (le2.d)
            {
                le2.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(le2.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        q = i1;
        r = i5 - k1;
        V = j2;
        if (S)
        {
            a(i, false, 0, false);
        }
        S = false;
        return;
_L4:
        l1 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = l1;
        l1 = i2;
        i2 = k1;
        j1 = j2;
        k1 = i3;
          goto _L17
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
            i1 = getMeasuredWidth();
            D = Math.min(i1 / 10, C);
            i1 = i1 - getPaddingLeft() - getPaddingRight();
            j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j3 = getChildCount();
            int i2 = 0;
            while (i2 < j3) 
            {
label1:
                {
                    {
                        View view = getChildAt(i2);
                        int k1 = i1;
                        int l1 = j1;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        le le1 = (le)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (le1 == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!le1.a)
                        {
                            break label1;
                        }
                        k1 = le1.b & 7;
                        int j2 = le1.b & 0x70;
                        int k2 = 0x80000000;
                        l1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j2 == 48 || j2 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k1 == 3 || k1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k1 = 0x40000000;
                        } else
                        {
                            k1 = k2;
                            if (flag1)
                            {
                                l1 = 0x40000000;
                                k1 = k2;
                            }
                        }
                        if (le1.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (le1.width != -1)
                            {
                                k1 = le1.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (le1.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (le1.height == -1)
                        {
                            break label0;
                        }
                        i3 = le1.height;
                        l1 = l2;
                        l2 = i3;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, l1));
                    if (flag)
                    {
                        l1 = j1 - view.getMeasuredHeight();
                        k1 = i1;
                    } else
                    {
                        k1 = i1;
                        l1 = j1;
                        if (flag1)
                        {
                            k1 = i1 - view.getMeasuredWidth();
                            l1 = j1;
                        }
                    }
                }
                i2++;
                i1 = k1;
                j1 = l1;
            }
            u = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            w = true;
            e();
            w = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                le1 = (le)view.getLayoutParams();
                if (le1 == null || !le1.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(le1.c * f1), 0x40000000), v);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        byte byte0 = -1;
        int k1 = getChildCount();
        int j1;
        if ((i1 & 2) != 0)
        {
            byte0 = 1;
            j1 = 0;
        } else
        {
            j1 = k1 - 1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            ld ld1 = a(view);
            if (ld1 != null && ld1.b == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof lj))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (lj)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (h != null)
        {
            Object obj = ((lj) (parcelable)).b;
            obj = ((lj) (parcelable)).c;
            a(((lj) (parcelable)).a, false, true);
            return;
        } else
        {
            j = ((lj) (parcelable)).a;
            k = ((lj) (parcelable)).b;
            l = ((lj) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        lj lj1 = new lj(super.onSaveInstanceState());
        lj1.a = i;
        if (h != null)
        {
            lj1.b = null;
        }
        return lj1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, o, o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (P)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null || h.b() == 0)
        {
            return false;
        }
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 391
    //                   2 201
    //                   3 675
    //                   4 128
    //                   5 726
    //                   6 759;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            kb.d(this);
        }
        return true;
_L2:
        m.abortAnimation();
        y = false;
        e();
        float f1 = motionevent.getX();
        H = f1;
        F = f1;
        f1 = motionevent.getY();
        I = f1;
        G = f1;
        J = jg.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!A)
        {
            i1 = jg.a(motionevent, J);
            float f2 = jg.c(motionevent, i1);
            float f6 = Math.abs(f2 - F);
            float f4 = jg.d(motionevent, i1);
            float f7 = Math.abs(f4 - G);
            if (f6 > (float)E && f6 > f7)
            {
                A = true;
                k();
                ViewParent viewparent;
                if (f2 - H > 0.0F)
                {
                    f2 = H + (float)E;
                } else
                {
                    f2 = H - (float)E;
                }
                F = f2;
                G = f4;
                g(1);
                c(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (A)
        {
            i1 = b(jg.c(motionevent, jg.a(motionevent, J))) | false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (A)
        {
            Object obj = K;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, M);
            int k1 = (int)jx.a(((VelocityTracker) (obj)), J);
            y = true;
            j1 = i();
            int l1 = getScrollX();
            obj = l();
            i1 = ((ld) (obj)).b;
            float f5 = ((float)l1 / (float)j1 - ((ld) (obj)).e) / ((ld) (obj)).d;
            if (Math.abs((int)(jg.c(motionevent, jg.a(motionevent, J)) - H)) > N && Math.abs(k1) > L)
            {
                if (k1 <= 0)
                {
                    i1++;
                }
            } else
            {
                float f3;
                if (i1 >= i)
                {
                    f3 = 0.4F;
                } else
                {
                    f3 = 0.6F;
                }
                i1 = (int)((float)i1 + f5 + f3);
            }
            j1 = i1;
            if (e.size() > 0)
            {
                motionevent = (ld)e.get(0);
                ld ld1 = (ld)e.get(e.size() - 1);
                j1 = Math.max(((ld) (motionevent)).b, Math.min(i1, ld1.b));
            }
            a(j1, true, true, k1);
            J = -1;
            m();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (A)
        {
            a(i, true, 0, false);
            J = -1;
            m();
            i1 = Q.c() | R.c();
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = jg.b(motionevent);
        F = jg.c(motionevent, i1);
        J = jg.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        F = jg.c(motionevent, jg.a(motionevent, J));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (w)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == p;
    }

}
