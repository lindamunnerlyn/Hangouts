// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class xs extends ViewGroup
{

    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int i[];
    private int j[];
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public xs(Context context)
    {
        this(context, null);
    }

    public xs(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public xs(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = true;
        b = -1;
        c = 0;
        e = 0x800033;
        context = vk.a(context, attributeset, ro.ak, i1);
        i1 = context.a(ro.ao, -1);
        if (i1 >= 0)
        {
            e(i1);
        }
        i1 = context.a(ro.an, -1);
        if (i1 >= 0)
        {
            f(i1);
        }
        boolean flag = context.a(ro.al, true);
        if (!flag)
        {
            b(flag);
        }
        g = context.e(ro.ap);
        b = context.a(ro.am, -1);
        h = context.a(ro.as, false);
        a(context.a(ro.aq));
        n = context.a(ro.at, 0);
        o = context.d(ro.ar, 0);
        context.b();
    }

    private static void a(View view, int i1, int j1, int k1, int l1)
    {
        view.layout(i1, j1, i1 + k1, j1 + l1);
    }

    private void c(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        for (int k1 = 0; k1 < i1; k1++)
        {
            View view = c(k1);
            if (view.getVisibility() == 8)
            {
                continue;
            }
            xt xt1 = (xt)view.getLayoutParams();
            if (xt1.width == -1)
            {
                int i2 = xt1.height;
                xt1.height = view.getMeasuredHeight();
                measureChildWithMargins(view, l1, 0, j1, 0);
                xt1.height = i2;
            }
        }

    }

    void a(int i1, int j1)
    {
        float f1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag;
        int j3;
        int l9;
        int i10;
        int j10;
        int k10;
        boolean flag1;
        f = 0;
        i2 = 0;
        l1 = 0;
        k1 = 0;
        i3 = 0;
        j2 = 1;
        f1 = 0.0F;
        l9 = n();
        i10 = android.view.View.MeasureSpec.getMode(i1);
        j10 = android.view.View.MeasureSpec.getMode(j1);
        flag = false;
        l2 = 0;
        k10 = b;
        flag1 = h;
        k2 = 0x80000000;
        j3 = 0;
_L5:
        if (j3 >= l9) goto _L2; else goto _L1
_L1:
        View view = c(j3);
        if (view != null) goto _L4; else goto _L3
_L3:
        f = f;
        int j4 = k2;
        int j6 = l2;
        int i8 = j2;
        j2 = i3;
        i3 = i2;
        l2 = l1;
        k2 = k1;
        i2 = i8;
        l1 = j6;
        k1 = j4;
_L10:
        int j9 = j3 + 1;
        j3 = j2;
        int k4 = k2;
        int k6 = l2;
        int j8 = i3;
        k2 = k1;
        l2 = l1;
        j2 = i2;
        i3 = j3;
        k1 = k4;
        l1 = k6;
        i2 = j8;
        j3 = j9;
          goto _L5
_L4:
        xt xt1;
        if (view.getVisibility() == 8)
        {
            break MISSING_BLOCK_LABEL_1626;
        }
        if (d(j3))
        {
            f = f + m;
        }
        xt1 = (xt)view.getLayoutParams();
        f1 += xt1.g;
        if (j10 != 0x40000000 || xt1.height != 0 || xt1.g <= 0.0F) goto _L7; else goto _L6
_L6:
        l2 = f;
        f = Math.max(l2, xt1.topMargin + l2 + xt1.bottomMargin);
        l2 = 1;
_L9:
        if (k10 >= 0 && k10 == j3 + 1)
        {
            c = f;
        }
        if (j3 < k10 && xt1.g > 0.0F)
        {
            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        break; /* Loop/switch isn't completed */
_L7:
        int l6 = 0x80000000;
        int l4 = l6;
        if (xt1.height == 0)
        {
            l4 = l6;
            if (xt1.g > 0.0F)
            {
                l4 = 0;
                xt1.height = -2;
            }
        }
        if (f1 == 0.0F)
        {
            l6 = f;
        } else
        {
            l6 = 0;
        }
        b(view, i1, 0, j1, l6);
        if (l4 != 0x80000000)
        {
            xt1.height = l4;
        }
        l4 = view.getMeasuredHeight();
        l6 = f;
        f = Math.max(l6, l6 + l4 + xt1.topMargin + xt1.bottomMargin);
        if (flag1)
        {
            k2 = Math.max(l4, k2);
        }
        if (true) goto _L9; else goto _L8
_L8:
        int i7 = 0;
        if (i10 != 0x40000000 && xt1.width == -1)
        {
            flag = true;
            i7 = 1;
        }
        int k8 = xt1.leftMargin + xt1.rightMargin;
        int k9 = view.getMeasuredWidth() + k8;
        i2 = Math.max(i2, k9);
        int i5 = vp.a(l1, kb.j(view));
        if (j2 != 0 && xt1.width == -1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (xt1.g > 0.0F)
        {
            if (i7 == 0)
            {
                k8 = k9;
            }
            i3 = Math.max(i3, k8);
            j2 = l1;
            l1 = k2;
            k2 = k1;
            i7 = i2;
            k1 = l1;
            l1 = l2;
            i2 = j2;
            j2 = i3;
            l2 = i5;
            i3 = i7;
        } else
        {
            if (i7 == 0)
            {
                k8 = k9;
            }
            k1 = Math.max(k1, k8);
            j2 = l1;
            l1 = l2;
            i7 = i2;
            l2 = k1;
            k1 = k2;
            i2 = j2;
            j2 = i3;
            k2 = l2;
            l2 = i5;
            i3 = i7;
        }
          goto _L10
_L2:
        if (f > 0 && d(l9))
        {
            f = f + m;
        }
        if (flag1 && (j10 == 0x80000000 || j10 == 0))
        {
            f = 0;
            int k3 = 0;
            while (k3 < l9) 
            {
                Object obj = c(k3);
                if (obj == null)
                {
                    f = f;
                } else
                if (((View) (obj)).getVisibility() != 8)
                {
                    obj = (xt)((View) (obj)).getLayoutParams();
                    int j5 = f;
                    int j7 = ((xt) (obj)).topMargin;
                    f = Math.max(j5, ((xt) (obj)).bottomMargin + (j5 + k2 + j7));
                }
                k3++;
            }
        }
        f = f + (getPaddingTop() + getPaddingBottom());
        int k7 = kb.a(Math.max(f, getSuggestedMinimumHeight()), j1, 0);
        int l3 = (0xffffff & k7) - f;
        if (l2 != 0 || l3 != 0 && f1 > 0.0F)
        {
            if (g > 0.0F)
            {
                f1 = g;
            }
            f = 0;
            i3 = 0;
            k2 = j2;
            l2 = k1;
            k1 = l1;
            j2 = i2;
            i2 = l2;
            l1 = k2;
            k2 = l3;
            while (i3 < l9) 
            {
                View view1 = c(i3);
                if (view1.getVisibility() != 8)
                {
                    xt xt2 = (xt)view1.getLayoutParams();
                    float f2 = xt2.g;
                    int l5;
                    if (f2 > 0.0F)
                    {
                        int i4 = (int)(((float)k2 * f2) / f1);
                        int l8 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + xt2.leftMargin + xt2.rightMargin, xt2.width);
                        if (xt2.height != 0 || j10 != 0x40000000)
                        {
                            int k5 = i4 + view1.getMeasuredHeight();
                            l2 = k5;
                            if (k5 < 0)
                            {
                                l2 = 0;
                            }
                        } else
                        if (i4 > 0)
                        {
                            l2 = i4;
                        } else
                        {
                            l2 = 0;
                        }
                        view1.measure(l8, android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000));
                        k1 = vp.a(k1, kb.j(view1) & 0xffffff00);
                        l2 = k2 - i4;
                        k2 = k1;
                        f1 -= f2;
                        k1 = l2;
                    } else
                    {
                        l2 = k1;
                        k1 = k2;
                        k2 = l2;
                    }
                    i4 = xt2.leftMargin + xt2.rightMargin;
                    l5 = view1.getMeasuredWidth() + i4;
                    l2 = Math.max(j2, l5);
                    if (i10 != 0x40000000 && xt2.width == -1)
                    {
                        j2 = 1;
                    } else
                    {
                        j2 = 0;
                    }
                    if (j2 != 0)
                    {
                        j2 = i4;
                    } else
                    {
                        j2 = l5;
                    }
                    i2 = Math.max(i2, j2);
                    if (l1 != 0 && xt2.width == -1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    j2 = f;
                    i4 = view1.getMeasuredHeight();
                    l5 = xt2.topMargin;
                    f = Math.max(j2, xt2.bottomMargin + (i4 + j2 + l5));
                    j2 = l1;
                    l1 = l2;
                } else
                {
                    l2 = l1;
                    l1 = j2;
                    j2 = k1;
                    k1 = k2;
                    k2 = j2;
                    j2 = l2;
                }
                i4 = i3 + 1;
                i3 = k2;
                l2 = l1;
                k2 = k1;
                k1 = i3;
                l1 = j2;
                j2 = l2;
                i3 = i4;
            }
            f = f + (getPaddingTop() + getPaddingBottom());
            k2 = i2;
            i2 = j2;
            j2 = l1;
            l1 = k1;
            k1 = k2;
        } else
        {
            l2 = Math.max(k1, i3);
            if (flag1 && j10 != 0x40000000)
            {
                for (k1 = 0; k1 < l9; k1++)
                {
                    view1 = c(k1);
                    if (view1 != null && view1.getVisibility() != 8 && ((xt)view1.getLayoutParams()).g > 0.0F)
                    {
                        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000));
                    }
                }

            }
            k1 = l2;
        }
        if (j2 != 0 || i10 == 0x40000000)
        {
            k1 = i2;
        }
        setMeasuredDimension(kb.a(Math.max(k1 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i1, l1), k7);
        if (flag)
        {
            c(l9, j1);
        }
        return;
        int i6 = i3;
        int l7 = k1;
        int i9 = l1;
        i3 = i2;
        k1 = k2;
        l1 = l2;
        i2 = j2;
        j2 = i6;
        k2 = l7;
        l2 = i9;
          goto _L10
    }

    void a(int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        i2 = getPaddingLeft();
        j2 = k1 - i1;
        k2 = getPaddingRight();
        l2 = getPaddingRight();
        i3 = n();
        i1 = e;
        j3 = e;
        i1 & 0x70;
        JVM INSTR lookupswitch 2: default 72
    //                   16: 126
    //                   80: 108;
           goto _L1 _L2 _L3
_L1:
        i1 = getPaddingTop();
_L16:
        k1 = 0;
_L8:
        if (k1 >= i3) goto _L5; else goto _L4
_L4:
        View view = c(k1);
        if (view != null) goto _L7; else goto _L6
_L6:
        j1 = i1;
_L10:
        k1++;
        i1 = j1;
          goto _L8
_L3:
        i1 = (getPaddingTop() + l1) - j1 - f;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = getPaddingTop() + (l1 - j1 - f) / 2;
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = i1;
        if (view.getVisibility() == 8) goto _L10; else goto _L9
_L9:
        xt xt1;
        int k3;
        int l3;
        k3 = view.getMeasuredWidth();
        l3 = view.getMeasuredHeight();
        xt1 = (xt)view.getLayoutParams();
        l1 = xt1.h;
        j1 = l1;
        if (l1 < 0)
        {
            j1 = 0x800007 & j3;
        }
        ih.a(j1, kb.h(this)) & 7;
        JVM INSTR lookupswitch 2: default 240
    //                   1: 302
    //                   5: 334;
           goto _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_334;
_L11:
        j1 = xt1.leftMargin + i2;
_L14:
        l1 = i1;
        if (d(k1))
        {
            l1 = i1 + m;
        }
        i1 = l1 + xt1.topMargin;
        a(view, j1, i1, k3, l3);
        j1 = i1 + (xt1.bottomMargin + l3);
          goto _L10
_L12:
        j1 = ((j2 - i2 - l2 - k3) / 2 + i2 + xt1.leftMargin) - xt1.rightMargin;
          goto _L14
        j1 = j2 - k2 - k3 - xt1.rightMargin;
          goto _L14
_L5:
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    void a(Canvas canvas)
    {
        int k1 = n();
        for (int i1 = 0; i1 < k1; i1++)
        {
            View view = c(i1);
            if (view != null && view.getVisibility() != 8 && d(i1))
            {
                xt xt1 = (xt)view.getLayoutParams();
                a(canvas, view.getTop() - xt1.topMargin - m);
            }
        }

        if (d(k1))
        {
            View view1 = c(k1 - 1);
            int j1;
            if (view1 == null)
            {
                j1 = getHeight() - getPaddingBottom() - m;
            } else
            {
                xt xt2 = (xt)view1.getLayoutParams();
                j1 = view1.getBottom();
                j1 = xt2.bottomMargin + j1;
            }
            a(canvas, j1);
        }
    }

    void a(Canvas canvas, int i1)
    {
        k.setBounds(getPaddingLeft() + o, i1, getWidth() - getPaddingRight() - o, m + i1);
        k.draw(canvas);
    }

    public void a(Drawable drawable)
    {
        boolean flag = false;
        if (drawable == k)
        {
            return;
        }
        k = drawable;
        if (drawable != null)
        {
            l = drawable.getIntrinsicWidth();
            m = drawable.getIntrinsicHeight();
        } else
        {
            l = 0;
            m = 0;
        }
        if (drawable == null)
        {
            flag = true;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public xt b(AttributeSet attributeset)
    {
        return new xt(getContext(), attributeset);
    }

    public xt b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new xt(layoutparams);
    }

    void b(int i1, int j1)
    {
        f = 0;
        int i3 = 0;
        int j2 = 0;
        int i2 = 0;
        int l2 = 0;
        int k2 = 1;
        float f1 = 0.0F;
        int i7 = n();
        int k7 = android.view.View.MeasureSpec.getMode(i1);
        int j7 = android.view.View.MeasureSpec.getMode(j1);
        boolean flag = false;
        int k1 = 0;
        if (i == null || j == null)
        {
            i = new int[4];
            j = new int[4];
        }
        int ai[] = i;
        int ai1[] = j;
        ai[3] = -1;
        ai[2] = -1;
        ai[1] = -1;
        ai[0] = -1;
        ai1[3] = -1;
        ai1[2] = -1;
        ai1[1] = -1;
        ai1[0] = -1;
        boolean flag2 = a;
        boolean flag3 = h;
        int l1;
        boolean flag1;
        int j3;
        if (k7 == 0x40000000)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = 0x80000000;
        j3 = 0;
        while (j3 < i7) 
        {
            Object obj = c(j3);
            int i4;
            int k5;
            if (obj == null)
            {
                f = f;
                int l3 = l1;
                l1 = k2;
                int j5 = l2;
                l2 = j2;
                k2 = i2;
                j2 = j5;
                i2 = l1;
                l1 = k1;
                k1 = l3;
            } else
            if (((View) (obj)).getVisibility() != 8)
            {
                if (d(j3))
                {
                    f = f + l;
                }
                xt xt2 = (xt)((View) (obj)).getLayoutParams();
                f1 += xt2.g;
                int k4;
                int l5;
                int j6;
                int l6;
                if (k7 == 0x40000000 && xt2.width == 0 && xt2.g > 0.0F)
                {
                    int l7;
                    if (flag1)
                    {
                        f = f + (xt2.leftMargin + xt2.rightMargin);
                    } else
                    {
                        k4 = f;
                        f = Math.max(k4, xt2.leftMargin + k4 + xt2.rightMargin);
                    }
                    if (flag2)
                    {
                        int j4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        ((View) (obj)).measure(j4, j4);
                        j4 = l1;
                        l1 = k1;
                        k1 = j4;
                    } else
                    {
                        k1 = l1;
                        l1 = 1;
                    }
                } else
                {
                    l5 = 0x80000000;
                    k4 = l5;
                    if (xt2.width == 0)
                    {
                        k4 = l5;
                        if (xt2.g > 0.0F)
                        {
                            k4 = 0;
                            xt2.width = -2;
                        }
                    }
                    if (f1 == 0.0F)
                    {
                        l5 = f;
                    } else
                    {
                        l5 = 0;
                    }
                    b(((View) (obj)), i1, l5, j1, 0);
                    if (k4 != 0x80000000)
                    {
                        xt2.width = k4;
                    }
                    k4 = ((View) (obj)).getMeasuredWidth();
                    if (flag1)
                    {
                        f = f + (xt2.leftMargin + k4 + xt2.rightMargin);
                    } else
                    {
                        l5 = f;
                        f = Math.max(l5, l5 + k4 + xt2.leftMargin + xt2.rightMargin);
                    }
                    float f2;
                    View view;
                    xt xt1;
                    int k3;
                    if (flag3)
                    {
                        k4 = Math.max(k4, l1);
                        l1 = k1;
                        k1 = k4;
                    } else
                    {
                        int l4 = k1;
                        k1 = l1;
                        l1 = l4;
                    }
                }
                l5 = 0;
                if (j7 != 0x40000000 && xt2.height == -1)
                {
                    flag = true;
                    l5 = 1;
                }
                j6 = xt2.topMargin + xt2.bottomMargin;
                l6 = ((View) (obj)).getMeasuredHeight() + j6;
                k4 = vp.a(j2, kb.j(((View) (obj))));
                if (flag2)
                {
                    l7 = ((View) (obj)).getBaseline();
                    if (l7 != -1)
                    {
                        if (xt2.h < 0)
                        {
                            j2 = e;
                        } else
                        {
                            j2 = xt2.h;
                        }
                        j2 = ((j2 & 0x70) >> 4 & -2) >> 1;
                        ai[j2] = Math.max(ai[j2], l7);
                        ai1[j2] = Math.max(ai1[j2], l6 - l7);
                    }
                }
                i3 = Math.max(i3, l6);
                if (k2 != 0 && xt2.height == -1)
                {
                    j2 = 1;
                } else
                {
                    j2 = 0;
                }
                if (xt2.g > 0.0F)
                {
                    if (l5 == 0)
                    {
                        j6 = l6;
                    }
                    k2 = Math.max(l2, j6);
                    l2 = k4;
                    k4 = i2;
                    i2 = j2;
                    j2 = k2;
                    k2 = k4;
                } else
                {
                    if (l5 == 0)
                    {
                        j6 = l6;
                    }
                    k2 = Math.max(i2, j6);
                    i2 = j2;
                    j2 = l2;
                    l2 = k4;
                }
            } else
            {
                int i5 = k1;
                int i6 = i2;
                int k6 = j2;
                k1 = l1;
                l1 = i5;
                i2 = k2;
                j2 = l2;
                k2 = i6;
                l2 = k6;
            }
            k5 = j3 + 1;
            j3 = k2;
            i4 = l2;
            k2 = l1;
            l1 = k1;
            k1 = k2;
            k2 = i2;
            l2 = j2;
            i2 = j3;
            j2 = i4;
            j3 = k5;
        }
        if (f > 0 && d(i7))
        {
            f = f + l;
        }
        if (ai[1] != -1 || ai[0] != -1 || ai[2] != -1 || ai[3] != -1)
        {
            i3 = Math.max(i3, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
        }
        if (flag3 && (k7 == 0x80000000 || k7 == 0))
        {
            f = 0;
            k3 = 0;
            while (k3 < i7) 
            {
                obj = c(k3);
                if (obj == null)
                {
                    f = f;
                } else
                if (((View) (obj)).getVisibility() != 8)
                {
                    obj = (xt)((View) (obj)).getLayoutParams();
                    if (flag1)
                    {
                        k4 = f;
                        l5 = ((xt) (obj)).leftMargin;
                        f = ((xt) (obj)).rightMargin + (l5 + l1) + k4;
                    } else
                    {
                        k4 = f;
                        l5 = ((xt) (obj)).leftMargin;
                        f = Math.max(k4, ((xt) (obj)).rightMargin + (k4 + l1 + l5));
                    }
                }
                k3++;
            }
        }
        f = f + (getPaddingLeft() + getPaddingRight());
        j6 = kb.a(Math.max(f, getSuggestedMinimumWidth()), i1, 0);
        k3 = (0xffffff & j6) - f;
        if (k1 != 0 || k3 != 0 && f1 > 0.0F)
        {
label0:
            {
                if (g > 0.0F)
                {
                    f1 = g;
                }
                ai[3] = -1;
                ai[2] = -1;
                ai[1] = -1;
                ai[0] = -1;
                ai1[3] = -1;
                ai1[2] = -1;
                ai1[1] = -1;
                ai1[0] = -1;
                f = 0;
                i3 = 0;
                l1 = k2;
                k2 = -1;
                k1 = j2;
                j2 = k2;
                k2 = k3;
                while (i3 < i7) 
                {
                    obj = c(i3);
                    if (obj != null && ((View) (obj)).getVisibility() != 8)
                    {
                        xt2 = (xt)((View) (obj)).getLayoutParams();
                        f2 = xt2.g;
                        if (f2 > 0.0F)
                        {
                            k3 = (int)(((float)k2 * f2) / f1);
                            l5 = getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom() + xt2.topMargin + xt2.bottomMargin, xt2.height);
                            if (xt2.width != 0 || k7 != 0x40000000)
                            {
                                k4 = k3 + ((View) (obj)).getMeasuredWidth();
                                l2 = k4;
                                if (k4 < 0)
                                {
                                    l2 = 0;
                                }
                            } else
                            if (k3 > 0)
                            {
                                l2 = k3;
                            } else
                            {
                                l2 = 0;
                            }
                            ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), l5);
                            k1 = vp.a(k1, kb.j(((View) (obj))) & 0xff000000);
                            f1 -= f2;
                            l2 = k2 - k3;
                            k2 = k1;
                            k1 = l2;
                        } else
                        {
                            l2 = k1;
                            k1 = k2;
                            k2 = l2;
                        }
                        if (flag1)
                        {
                            f = f + (((View) (obj)).getMeasuredWidth() + xt2.leftMargin + xt2.rightMargin);
                        } else
                        {
                            l2 = f;
                            f = Math.max(l2, ((View) (obj)).getMeasuredWidth() + l2 + xt2.leftMargin + xt2.rightMargin);
                        }
                        if (j7 != 0x40000000 && xt2.height == -1)
                        {
                            l2 = 1;
                        } else
                        {
                            l2 = 0;
                        }
                        l5 = xt2.topMargin + xt2.bottomMargin;
                        k4 = ((View) (obj)).getMeasuredHeight() + l5;
                        k3 = Math.max(j2, k4);
                        if (l2 != 0)
                        {
                            j2 = l5;
                        } else
                        {
                            j2 = k4;
                        }
                        j2 = Math.max(i2, j2);
                        if (l1 != 0 && xt2.height == -1)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        if (flag2)
                        {
                            l2 = ((View) (obj)).getBaseline();
                            if (l2 != -1)
                            {
                                if (xt2.h < 0)
                                {
                                    i2 = e;
                                } else
                                {
                                    i2 = xt2.h;
                                }
                                i2 = ((i2 & 0x70) >> 4 & -2) >> 1;
                                ai[i2] = Math.max(ai[i2], l2);
                                ai1[i2] = Math.max(ai1[i2], k4 - l2);
                            }
                        }
                        l2 = k2;
                        k2 = l1;
                        i2 = k3;
                        l1 = l2;
                    } else
                    {
                        k3 = l1;
                        l1 = k1;
                        l2 = j2;
                        k1 = k2;
                        k2 = k3;
                        j2 = i2;
                        i2 = l2;
                    }
                    k3 = i3 + 1;
                    l2 = k2;
                    i3 = i2;
                    k2 = k1;
                    k1 = l1;
                    l1 = l2;
                    i2 = j2;
                    j2 = i3;
                    i3 = k3;
                }
                f = f + (getPaddingLeft() + getPaddingRight());
                if (ai[1] == -1 && ai[0] == -1 && ai[2] == -1)
                {
                    k2 = j2;
                    if (ai[3] == -1)
                    {
                        break label0;
                    }
                }
                k2 = Math.max(j2, Math.max(ai[3], Math.max(ai[0], Math.max(ai[1], ai[2]))) + Math.max(ai1[3], Math.max(ai1[0], Math.max(ai1[1], ai1[2]))));
            }
            j2 = k1;
            i3 = k2;
            k1 = i2;
            do
            {
                if (l1 != 0 || j7 == 0x40000000)
                {
                    k1 = i3;
                }
                setMeasuredDimension(0xff000000 & j2 | j6, kb.a(Math.max(k1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), j1, j2 << 16));
                if (flag)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
                    for (j1 = 0; j1 < i7; j1++)
                    {
                        view = c(j1);
                        if (view.getVisibility() != 8)
                        {
                            xt1 = (xt)view.getLayoutParams();
                            if (xt1.height == -1)
                            {
                                l1 = xt1.width;
                                xt1.width = view.getMeasuredWidth();
                                measureChildWithMargins(view, i1, 0, k1, 0);
                                xt1.width = l1;
                            }
                        }
                    }

                }
                return;
            } while (true);
        } else
        {
            i2 = Math.max(i2, l2);
            if (flag3 && k7 != 0x40000000)
            {
                for (k1 = 0; k1 < i7; k1++)
                {
                    view = c(k1);
                    if (view != null && view.getVisibility() != 8 && ((xt)view.getLayoutParams()).g > 0.0F)
                    {
                        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
                    }
                }

            }
            k1 = i2;
            l1 = k2;
            continue;
        }
    }

    void b(int i1, int j1, int k1, int l1)
    {
        int ai[];
        int ai1[];
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        boolean flag;
        boolean flag1;
        flag = vp.a(this);
        k2 = getPaddingTop();
        i3 = l1 - j1;
        j3 = getPaddingBottom();
        k3 = getPaddingBottom();
        l3 = n();
        j1 = e;
        i4 = e;
        flag1 = a;
        ai = i;
        ai1 = j;
        ih.a(j1 & 0x800007, kb.h(this));
        JVM INSTR lookupswitch 2: default 104
    //                   1: 186
    //                   5: 169;
           goto _L1 _L2 _L3
_L1:
        i1 = getPaddingLeft();
_L6:
        View view;
        xt xt1;
        int i2;
        int j2;
        int l2;
        int j4;
        int k4;
        int l4;
        if (flag)
        {
            l1 = l3 - 1;
            k1 = -1;
        } else
        {
            l1 = 0;
            k1 = 1;
        }
        i2 = 0;
        j1 = i1;
_L5:
        if (i2 >= l3)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        l4 = l1 + k1 * i2;
        view = c(l4);
        if (view != null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
_L8:
        i2++;
        j1 = i1;
        if (true) goto _L5; else goto _L4
_L3:
        i1 = (getPaddingLeft() + k1) - i1 - f;
          goto _L6
_L2:
        i1 = getPaddingLeft() + (k1 - i1 - f) / 2;
          goto _L6
_L4:
        i1 = j1;
        if (view.getVisibility() == 8) goto _L8; else goto _L7
_L7:
        j4 = view.getMeasuredWidth();
        k4 = view.getMeasuredHeight();
        i1 = -1;
        xt1 = (xt)view.getLayoutParams();
        j2 = i1;
        if (flag1)
        {
            j2 = i1;
            if (xt1.height != -1)
            {
                j2 = view.getBaseline();
            }
        }
        l2 = xt1.h;
        i1 = l2;
        if (l2 < 0)
        {
            i1 = i4 & 0x70;
        }
        i1 & 0x70;
        JVM INSTR lookupswitch 3: default 328
    //                   16: 413
    //                   48: 380
    //                   80: 445;
           goto _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_445;
_L9:
        i1 = k2;
_L13:
        if (d(l4))
        {
            j1 = l + j1;
        }
        j1 += xt1.leftMargin;
        a(view, j1, i1, j4, k4);
        i1 = j1 + (xt1.rightMargin + j4);
          goto _L8
_L11:
        l2 = xt1.topMargin + k2;
        i1 = l2;
        if (j2 != -1)
        {
            i1 = (ai[1] - j2) + l2;
        }
          goto _L13
_L10:
        i1 = ((i3 - k2 - k3 - k4) / 2 + k2 + xt1.topMargin) - xt1.bottomMargin;
          goto _L13
        l2 = i3 - j3 - k4 - xt1.bottomMargin;
        i1 = l2;
        if (j2 != -1)
        {
            i1 = view.getMeasuredHeight();
            i1 = l2 - (ai1[2] - (i1 - j2));
        }
          goto _L13
    }

    void b(Canvas canvas)
    {
        int l1 = n();
        boolean flag = vp.a(this);
        int i1 = 0;
        while (i1 < l1) 
        {
            View view = c(i1);
            if (view != null && view.getVisibility() != 8 && d(i1))
            {
                xt xt1 = (xt)view.getLayoutParams();
                int k1;
                if (flag)
                {
                    k1 = view.getRight();
                    k1 = xt1.rightMargin + k1;
                } else
                {
                    k1 = view.getLeft() - xt1.leftMargin - l;
                }
                b(canvas, k1);
            }
            i1++;
        }
        if (d(l1))
        {
            View view1 = c(l1 - 1);
            int j1;
            if (view1 == null)
            {
                if (flag)
                {
                    j1 = getPaddingLeft();
                } else
                {
                    j1 = getWidth() - getPaddingRight() - l;
                }
            } else
            {
                xt xt2 = (xt)view1.getLayoutParams();
                if (flag)
                {
                    j1 = view1.getLeft() - xt2.leftMargin - l;
                } else
                {
                    j1 = view1.getRight();
                    j1 = xt2.rightMargin + j1;
                }
            }
            b(canvas, j1);
        }
    }

    void b(Canvas canvas, int i1)
    {
        k.setBounds(i1, getPaddingTop() + o, l + i1, getHeight() - getPaddingBottom() - o);
        k.draw(canvas);
    }

    void b(View view, int i1, int j1, int k1, int l1)
    {
        measureChildWithMargins(view, i1, j1, k1, l1);
    }

    public void b(boolean flag)
    {
        a = flag;
    }

    View c(int i1)
    {
        return getChildAt(i1);
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof xt;
    }

    protected boolean d(int i1)
    {
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if ((n & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i1 != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((n & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ((n & 2) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1--;
        do
        {
            if (i1 < 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (getChildAt(i1).getVisibility() != 8)
            {
                break;
            }
            i1--;
        } while (true);
        if (true) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    public void e(int i1)
    {
        if (d != i1)
        {
            d = i1;
            requestLayout();
        }
    }

    public void f(int i1)
    {
        if (e != i1)
        {
            if ((0x800007 & i1) == 0)
            {
                i1 = 0x800003 | i1;
            }
            int j1 = i1;
            if ((i1 & 0x70) == 0)
            {
                j1 = i1 | 0x30;
            }
            e = j1;
            requestLayout();
        }
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return l();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return b(layoutparams);
    }

    public int getBaseline()
    {
        int i1 = -1;
        if (b >= 0) goto _L2; else goto _L1
_L1:
        i1 = super.getBaseline();
_L4:
        return i1;
_L2:
        View view;
        int j1;
        if (getChildCount() <= b)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        view = getChildAt(b);
        j1 = view.getBaseline();
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b != 0)
        {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = c;
        if (d != 1) goto _L6; else goto _L5
_L5:
        int k1 = e & 0x70;
        if (k1 == 48) goto _L6; else goto _L7
_L7:
        k1;
        JVM INSTR lookupswitch 2: default 132
    //                   16: 170
    //                   80: 147;
           goto _L6 _L8 _L9
_L6:
        return ((xt)view.getLayoutParams()).topMargin + i1 + j1;
_L9:
        i1 = getBottom() - getTop() - getPaddingBottom() - f;
        continue; /* Loop/switch isn't completed */
_L8:
        i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
        if (true) goto _L6; else goto _L10
_L10:
    }

    public xt l()
    {
        if (d == 0)
        {
            return new xt(-2, -2);
        }
        if (d == 1)
        {
            return new xt(-1, -2);
        } else
        {
            return null;
        }
    }

    public int m()
    {
        return l;
    }

    int n()
    {
        return getChildCount();
    }

    protected void onDraw(Canvas canvas)
    {
        if (k == null)
        {
            return;
        }
        if (d == 1)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(xs.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(xs.getName());
        }
    }

    public void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (d == 1)
        {
            a(i1, j1, k1, l1);
            return;
        } else
        {
            b(i1, j1, k1, l1);
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        if (d == 1)
        {
            a(i1, j1);
            return;
        } else
        {
            b(i1, j1);
            return;
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
