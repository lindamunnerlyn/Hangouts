// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import ta;
import tb;
import tc;
import te;
import tq;
import tr;
import vr;
import vw;
import we;
import wf;
import wg;
import wh;
import wi;
import xu;
import xv;

public class ActionMenuView extends xu
    implements tc, tr
{

    public tb a;
    public wi b;
    private ta c;
    private Context d;
    private int e;
    private boolean f;
    private vw g;
    private tq h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        k = (int)(56F * f1);
        l = (int)(f1 * 4F);
        d = context;
        e = 0;
    }

    public static int a(View view, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        wg wg1 = (wg)view.getLayoutParams();
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k1) - l1, android.view.View.MeasureSpec.getMode(k1));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.c())
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j1 > 0 && (l1 == 0 || j1 >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j1, 0x80000000), i2);
            int j2 = view.getMeasuredWidth();
            k1 = j2 / i1;
            j1 = k1;
            if (j2 % i1 != 0)
            {
                j1 = k1 + 1;
            }
            k1 = j1;
            if (l1 != 0)
            {
                k1 = j1;
                if (j1 < 2)
                {
                    k1 = 2;
                }
            }
        } else
        {
            k1 = 0;
        }
        flag = flag1;
        if (!wg1.a)
        {
            flag = flag1;
            if (l1 != 0)
            {
                flag = true;
            }
        }
        wg1.d = flag;
        wg1.b = k1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 * i1, 0x40000000), i2);
        return k1;
    }

    public wg a(AttributeSet attributeset)
    {
        return new wg(getContext(), attributeset);
    }

    public wg a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof wg)
            {
                layoutparams = new wg((wg)layoutparams);
            } else
            {
                layoutparams = new wg(layoutparams);
            }
            if (((wg) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return b();
        }
    }

    public void a(int i1)
    {
label0:
        {
            if (e != i1)
            {
                e = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                d = getContext();
            }
            return;
        }
        d = new ContextThemeWrapper(getContext(), i1);
    }

    public void a(ta ta1)
    {
        c = ta1;
    }

    public void a(tq tq, tb tb)
    {
        h = tq;
        a = tb;
    }

    public void a(vw vw1)
    {
        g = vw1;
        g.a(this);
    }

    public void a(wi wi)
    {
        b = wi;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public boolean a()
    {
        return f;
    }

    public boolean a(te te)
    {
        return c.a(te, 0);
    }

    protected wg b()
    {
        wg wg1 = new wg();
        wg1.h = 16;
        return wg1;
    }

    public xv b(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected xv b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    protected boolean b(int i1)
    {
        boolean flag1 = false;
        if (i1 == 0)
        {
            return false;
        }
        View view = getChildAt(i1 - 1);
        View view1 = getChildAt(i1);
        boolean flag = flag1;
        if (i1 < getChildCount())
        {
            flag = flag1;
            if (view instanceof we)
            {
                flag = ((we)view).e() | false;
            }
        }
        if (i1 > 0 && (view1 instanceof we))
        {
            return ((we)view1).d() | flag;
        } else
        {
            return flag;
        }
    }

    public wg c()
    {
        wg wg1 = b();
        wg1.a = true;
        return wg1;
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof wg);
    }

    public Menu d()
    {
        if (c == null)
        {
            Object obj = getContext();
            c = new ta(((Context) (obj)));
            c.a(new wh(this));
            g = new vw(((Context) (obj)));
            g.d();
            vw vw1 = g;
            if (h != null)
            {
                obj = h;
            } else
            {
                obj = new wf(this);
            }
            vw1.a(((tq) (obj)));
            c.a(g, d);
            g.a(this);
        }
        return c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    public ta e()
    {
        return c;
    }

    public boolean f()
    {
        return g != null && g.e();
    }

    public boolean g()
    {
        return g != null && g.f();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return b();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public boolean h()
    {
        return g != null && g.i();
    }

    public boolean i()
    {
        return g != null && g.j();
    }

    public void j()
    {
        if (g != null)
        {
            g.g();
        }
    }

    public void k()
    {
        g.c(true);
    }

    protected xv l()
    {
        return b();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (g != null)
        {
            g.b(false);
            if (g.i())
            {
                g.f();
                g.e();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        j();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (i) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L4:
        return;
_L2:
        int i4 = getChildCount();
        int l3 = (l1 - j1) / 2;
        int j4 = m();
        j1 = 0;
        int i2 = k1 - i1 - getPaddingRight() - getPaddingLeft();
        l1 = 0;
        flag = vr.a(this);
        int j2 = 0;
        while (j2 < i4) 
        {
            View view = getChildAt(j2);
            wg wg2;
            if (view.getVisibility() != 8)
            {
                wg wg1 = (wg)view.getLayoutParams();
                if (wg1.a)
                {
                    int k2 = view.getMeasuredWidth();
                    l1 = k2;
                    if (b(j2))
                    {
                        l1 = k2 + j4;
                    }
                    int k4 = view.getMeasuredHeight();
                    int j3;
                    int i5;
                    if (flag)
                    {
                        k2 = getPaddingLeft();
                        k2 = wg1.leftMargin + k2;
                        j3 = k2 + l1;
                    } else
                    {
                        j3 = getWidth() - getPaddingRight() - wg1.rightMargin;
                        k2 = j3 - l1;
                    }
                    i5 = l3 - k4 / 2;
                    view.layout(k2, i5, j3, k4 + i5);
                    l1 = i2 - l1;
                    k2 = 1;
                    i2 = j1;
                    j1 = k2;
                } else
                {
                    int k3 = view.getMeasuredWidth();
                    int l4 = wg1.leftMargin;
                    int j5 = wg1.rightMargin;
                    b(j2);
                    int l2 = j1 + 1;
                    i2 -= j5 + (k3 + l4);
                    j1 = l1;
                    l1 = i2;
                    i2 = l2;
                }
            } else
            {
                int i3 = j1;
                j1 = l1;
                l1 = i2;
                i2 = i3;
            }
            k2 = j2 + 1;
            j2 = i2;
            i2 = l1;
            l1 = j1;
            j1 = j2;
            j2 = k2;
        }
        if (i4 == 1 && l1 == 0)
        {
            view = getChildAt(0);
            j1 = view.getMeasuredWidth();
            l1 = view.getMeasuredHeight();
            i1 = (k1 - i1) / 2 - j1 / 2;
            k1 = l3 - l1 / 2;
            view.layout(i1, k1, j1 + i1, l1 + k1);
            return;
        }
        if (l1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        i1 = j1 - i1;
        if (i1 > 0)
        {
            i1 = i2 / i1;
        } else
        {
            i1 = 0;
        }
        k1 = Math.max(0, i1);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = getWidth() - getPaddingRight();
        j1 = 0;
        while (j1 < i4) 
        {
            view = getChildAt(j1);
            wg2 = (wg)view.getLayoutParams();
            if (view.getVisibility() != 8 && !wg2.a)
            {
                i1 -= wg2.rightMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1 - l1, j2, i1, i2 + j2);
                i1 -= wg2.leftMargin + l1 + k1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = getPaddingLeft();
        j1 = 0;
        while (j1 < i4) 
        {
            view = getChildAt(j1);
            wg2 = (wg)view.getLayoutParams();
            if (view.getVisibility() != 8 && !wg2.a)
            {
                i1 += wg2.leftMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1, j2, i1 + l1, i2 + j2);
                i1 = wg2.rightMargin + l1 + k1 + i1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        boolean flag2 = i;
        int k1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (flag2 != i)
        {
            j = 0;
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        if (i && c != null && k1 != j)
        {
            j = k1;
            c.b(true);
        }
        i2 = getChildCount();
        if (!i || i2 <= 0) goto _L2; else goto _L1
_L1:
        int k4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int j4 = android.view.View.MeasureSpec.getSize(j1);
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        int l3 = getPaddingTop() + getPaddingBottom();
        int l4 = getChildMeasureSpec(j1, l3, -2);
        int i5 = i1 - (k1 + i2);
        i1 = i5 / k;
        j1 = k;
        if (i1 == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        int j5 = k + (i5 % j1) / i1;
        j1 = 0;
        int l2 = 0;
        int k2 = 0;
        int i3 = 0;
        int j2 = 0;
        long l5 = 0L;
        int k5 = getChildCount();
        int j3 = 0;
        while (j3 < k5) 
        {
            Object obj = getChildAt(j3);
            int l1;
            if (((View) (obj)).getVisibility() != 8)
            {
                boolean flag1 = obj instanceof ActionMenuItemView;
                i3++;
                if (flag1)
                {
                    ((View) (obj)).setPadding(l, 0, l, 0);
                }
                wg wg1 = (wg)((View) (obj)).getLayoutParams();
                wg1.f = false;
                wg1.c = 0;
                wg1.b = 0;
                wg1.d = false;
                wg1.leftMargin = 0;
                wg1.rightMargin = 0;
                int k3;
                if (flag1 && ((ActionMenuItemView)obj).c())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                wg1.e = flag1;
                if (wg1.a)
                {
                    l1 = 1;
                } else
                {
                    l1 = i1;
                }
                k3 = a(((View) (obj)), j5, l1, l4, l3);
                l2 = Math.max(l2, k3);
                float f1;
                float f2;
                float f3;
                int i4;
                long l7;
                long l8;
                if (wg1.d)
                {
                    l1 = k2 + 1;
                } else
                {
                    l1 = k2;
                }
                if (wg1.a)
                {
                    i2 = 1;
                } else
                {
                    i2 = j2;
                }
                i1 -= k3;
                k2 = Math.max(j1, ((View) (obj)).getMeasuredHeight());
                if (k3 == 1)
                {
                    long l6 = 1 << j3;
                    j1 = k2;
                    j2 = i1;
                    k2 = l1;
                    k3 = i2;
                    l5 = l6 | l5;
                    i1 = i3;
                    i2 = j2;
                    l1 = j1;
                    j2 = k3;
                    j1 = l2;
                } else
                {
                    j1 = i3;
                    j2 = l2;
                    l2 = k2;
                    i3 = i1;
                    i1 = j1;
                    j1 = j2;
                    k2 = l1;
                    j2 = i2;
                    l1 = l2;
                    i2 = i3;
                }
            } else
            {
                l1 = j1;
                i2 = i1;
                j1 = l2;
                i1 = i3;
            }
            j3++;
            i3 = i1;
            i1 = i2;
            l2 = j1;
            j1 = l1;
        }
        if (j2 != 0 && i3 == 2)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        l1 = 0;
        j3 = i1;
        i1 = l1;
        l8 = l5;
        if (k2 <= 0) goto _L4; else goto _L3
_L3:
        l8 = l5;
        if (j3 <= 0) goto _L4; else goto _L5
_L5:
        l1 = 0x7fffffff;
        l7 = 0L;
        i2 = 0;
        l3 = 0;
_L12:
        if (l3 >= k5) goto _L7; else goto _L6
_L6:
        obj = (wg)getChildAt(l3).getLayoutParams();
        if (!((wg) (obj)).d) goto _L9; else goto _L8
_L8:
        if (((wg) (obj)).b >= l1) goto _L11; else goto _L10
_L10:
        i2 = ((wg) (obj)).b;
        l7 = 1 << l3;
        l1 = 1;
_L14:
        i4 = l3 + 1;
        l3 = i2;
        i2 = l1;
        l1 = l3;
        l3 = i4;
          goto _L12
_L11:
        if (((wg) (obj)).b != l1) goto _L9; else goto _L13
_L13:
        l7 |= 1 << l3;
        i4 = i2 + 1;
        i2 = l1;
        l1 = i4;
          goto _L14
_L7:
        l5 |= l7;
        l8 = l5;
        if (i2 <= j3)
        {
            i2 = 0;
            i1 = j3;
            while (i2 < k5) 
            {
                obj = getChildAt(i2);
                wg1 = (wg)((View) (obj)).getLayoutParams();
                if (((long)(1 << i2) & l7) == 0L)
                {
                    if (wg1.b == l1 + 1)
                    {
                        l5 |= 1 << i2;
                    }
                } else
                {
                    if (k3 && wg1.e && i1 == 1)
                    {
                        ((View) (obj)).setPadding(l + j5, 0, l, 0);
                    }
                    wg1.b = wg1.b + 1;
                    wg1.f = true;
                    i1--;
                }
                i2++;
            }
            l1 = 1;
            j3 = i1;
            i1 = l1;
            break MISSING_BLOCK_LABEL_541;
        }
_L4:
        if (j2 == 0 && i3 == 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j3 <= 0 || l8 == 0L || j3 >= i3 - 1 && l1 == 0 && l2 <= 1) goto _L16; else goto _L15
_L15:
        f3 = Long.bitCount(l8);
        f2 = f3;
        if (l1 != 0) goto _L18; else goto _L17
_L17:
        f1 = f3;
        if ((1L & l8) != 0L)
        {
            f1 = f3;
            if (!((wg)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << k5 - 1) & l8) == 0L) goto _L18; else goto _L19
_L19:
        f2 = f1;
        if (((wg)getChildAt(k5 - 1).getLayoutParams()).e) goto _L18; else goto _L20
_L20:
        f1 -= 0.5F;
_L22:
        if (f1 > 0.0F)
        {
            l1 = (int)((float)(j3 * j5) / f1);
        } else
        {
            l1 = 0;
        }
        i2 = 0;
        do
        {
            j2 = i1;
            if (i2 >= k5)
            {
                break;
            }
            if (((long)(1 << i2) & l8) != 0L)
            {
                obj = getChildAt(i2);
                wg1 = (wg)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    wg1.c = l1;
                    wg1.f = true;
                    if (i2 == 0 && !wg1.e)
                    {
                        wg1.leftMargin = -l1 / 2;
                    }
                    i1 = 1;
                } else
                if (wg1.a)
                {
                    wg1.c = l1;
                    wg1.f = true;
                    wg1.rightMargin = -l1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        wg1.leftMargin = l1 / 2;
                    }
                    if (i2 != k5 - 1)
                    {
                        wg1.rightMargin = l1 / 2;
                    }
                }
            }
            i2++;
        } while (true);
          goto _L21
_L16:
        j2 = i1;
_L21:
        if (j2 != 0)
        {
            for (i1 = 0; i1 < k5; i1++)
            {
                obj = getChildAt(i1);
                wg1 = (wg)((View) (obj)).getLayoutParams();
                if (wg1.f)
                {
                    l1 = wg1.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(wg1.c + l1 * j5, 0x40000000), l4);
                }
            }

        }
        if (k4 == 0x40000000)
        {
            j1 = j4;
        }
        setMeasuredDimension(i5, j1);
        return;
_L2:
        for (l1 = 0; l1 < i2; l1++)
        {
            obj = (wg)getChildAt(l1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i1, j1);
        return;
_L18:
        f1 = f2;
        if (true) goto _L22; else goto _L9
_L9:
        i4 = l1;
        l1 = i2;
        i2 = i4;
          goto _L14
    }
}
