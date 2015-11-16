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
import sy;
import sz;
import ta;
import tc;
import to;
import tp;
import vp;
import vu;
import wc;
import wd;
import we;
import wf;
import wg;
import xs;
import xt;

public class ActionMenuView extends xs
    implements ta, tp
{

    private sy a;
    private Context b;
    private int c;
    private boolean d;
    private vu e;
    private to f;
    private sz g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private wg l;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        j = (int)(56F * f1);
        k = (int)(f1 * 4F);
        b = context;
        c = 0;
    }

    public static int a(View view, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        we we1 = (we)view.getLayoutParams();
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
        if (!we1.a)
        {
            flag = flag1;
            if (l1 != 0)
            {
                flag = true;
            }
        }
        we1.d = flag;
        we1.b = k1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 * i1, 0x40000000), i2);
        return k1;
    }

    public static wg a(ActionMenuView actionmenuview)
    {
        return actionmenuview.l;
    }

    public static sz b(ActionMenuView actionmenuview)
    {
        return actionmenuview.g;
    }

    public we a(AttributeSet attributeset)
    {
        return new we(getContext(), attributeset);
    }

    public we a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof we)
            {
                layoutparams = new we((we)layoutparams);
            } else
            {
                layoutparams = new we(layoutparams);
            }
            if (((we) (layoutparams)).h <= 0)
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
            if (c != i1)
            {
                c = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                b = getContext();
            }
            return;
        }
        b = new ContextThemeWrapper(getContext(), i1);
    }

    public void a(sy sy1)
    {
        a = sy1;
    }

    public void a(to to, sz sz)
    {
        f = to;
        g = sz;
    }

    public void a(vu vu1)
    {
        e = vu1;
        e.a(this);
    }

    public void a(wg wg)
    {
        l = wg;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a()
    {
        return d;
    }

    public boolean a(tc tc)
    {
        return a.a(tc, 0);
    }

    protected we b()
    {
        we we1 = new we();
        we1.h = 16;
        return we1;
    }

    public xt b(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected xt b(android.view.ViewGroup.LayoutParams layoutparams)
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
            if (view instanceof wc)
            {
                flag = ((wc)view).e() | false;
            }
        }
        if (i1 > 0 && (view1 instanceof wc))
        {
            return ((wc)view1).d() | flag;
        } else
        {
            return flag;
        }
    }

    public we c()
    {
        we we1 = b();
        we1.a = true;
        return we1;
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof we);
    }

    public Menu d()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new sy(((Context) (obj)));
            a.a(new wf(this));
            e = new vu(((Context) (obj)));
            e.d();
            vu vu1 = e;
            if (f != null)
            {
                obj = f;
            } else
            {
                obj = new wd(this);
            }
            vu1.a(((to) (obj)));
            a.a(e, b);
            e.a(this);
        }
        return a;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    public sy e()
    {
        return a;
    }

    public boolean f()
    {
        return e != null && e.e();
    }

    public boolean g()
    {
        return e != null && e.f();
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
        return e != null && e.i();
    }

    public boolean i()
    {
        return e != null && e.j();
    }

    public void j()
    {
        if (e != null)
        {
            e.g();
        }
    }

    public void k()
    {
        e.c(true);
    }

    protected xt l()
    {
        return b();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (e != null)
        {
            e.b(false);
            if (e.i())
            {
                e.f();
                e.e();
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
        if (h) goto _L2; else goto _L1
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
        flag = vp.a(this);
        int j2 = 0;
        while (j2 < i4) 
        {
            View view = getChildAt(j2);
            we we2;
            if (view.getVisibility() != 8)
            {
                we we1 = (we)view.getLayoutParams();
                if (we1.a)
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
                        k2 = we1.leftMargin + k2;
                        j3 = k2 + l1;
                    } else
                    {
                        j3 = getWidth() - getPaddingRight() - we1.rightMargin;
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
                    int l4 = we1.leftMargin;
                    int j5 = we1.rightMargin;
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
            we2 = (we)view.getLayoutParams();
            if (view.getVisibility() != 8 && !we2.a)
            {
                i1 -= we2.rightMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1 - l1, j2, i1, i2 + j2);
                i1 -= we2.leftMargin + l1 + k1;
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
            we2 = (we)view.getLayoutParams();
            if (view.getVisibility() != 8 && !we2.a)
            {
                i1 += we2.leftMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1, j2, i1 + l1, i2 + j2);
                i1 = we2.rightMargin + l1 + k1 + i1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        boolean flag2 = h;
        int k1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (flag2 != h)
        {
            i = 0;
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        if (h && a != null && k1 != i)
        {
            i = k1;
            a.b(true);
        }
        i2 = getChildCount();
        if (!h || i2 <= 0) goto _L2; else goto _L1
_L1:
        int k4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int j4 = android.view.View.MeasureSpec.getSize(j1);
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        int l3 = getPaddingTop() + getPaddingBottom();
        int l4 = getChildMeasureSpec(j1, l3, -2);
        int i5 = i1 - (k1 + i2);
        i1 = i5 / j;
        j1 = j;
        if (i1 == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        int j5 = j + (i5 % j1) / i1;
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
                    ((View) (obj)).setPadding(k, 0, k, 0);
                }
                we we1 = (we)((View) (obj)).getLayoutParams();
                we1.f = false;
                we1.c = 0;
                we1.b = 0;
                we1.d = false;
                we1.leftMargin = 0;
                we1.rightMargin = 0;
                int k3;
                if (flag1 && ((ActionMenuItemView)obj).c())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                we1.e = flag1;
                if (we1.a)
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
                if (we1.d)
                {
                    l1 = k2 + 1;
                } else
                {
                    l1 = k2;
                }
                if (we1.a)
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
        obj = (we)getChildAt(l3).getLayoutParams();
        if (!((we) (obj)).d) goto _L9; else goto _L8
_L8:
        if (((we) (obj)).b >= l1) goto _L11; else goto _L10
_L10:
        i2 = ((we) (obj)).b;
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
        if (((we) (obj)).b != l1) goto _L9; else goto _L13
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
                we1 = (we)((View) (obj)).getLayoutParams();
                if (((long)(1 << i2) & l7) == 0L)
                {
                    if (we1.b == l1 + 1)
                    {
                        l5 |= 1 << i2;
                    }
                } else
                {
                    if (k3 && we1.e && i1 == 1)
                    {
                        ((View) (obj)).setPadding(k + j5, 0, k, 0);
                    }
                    we1.b = we1.b + 1;
                    we1.f = true;
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
            if (!((we)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << k5 - 1) & l8) == 0L) goto _L18; else goto _L19
_L19:
        f2 = f1;
        if (((we)getChildAt(k5 - 1).getLayoutParams()).e) goto _L18; else goto _L20
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
                we1 = (we)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    we1.c = l1;
                    we1.f = true;
                    if (i2 == 0 && !we1.e)
                    {
                        we1.leftMargin = -l1 / 2;
                    }
                    i1 = 1;
                } else
                if (we1.a)
                {
                    we1.c = l1;
                    we1.f = true;
                    we1.rightMargin = -l1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        we1.leftMargin = l1 / 2;
                    }
                    if (i2 != k5 - 1)
                    {
                        we1.rightMargin = l1 / 2;
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
                we1 = (we)((View) (obj)).getLayoutParams();
                if (we1.f)
                {
                    l1 = we1.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(we1.c + l1 * j5, 0x40000000), l4);
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
            obj = (we)getChildAt(l1).getLayoutParams();
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
