// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import fe;
import ih;
import il;
import java.util.ArrayList;
import jg;
import kb;
import kt;
import of;
import og;
import oh;
import oi;
import oj;
import ok;
import ol;
import om;
import oo;
import os;
import pm;

public class DrawerLayout extends ViewGroup
    implements os
{

    static final oh a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private static final boolean d;
    private Drawable A;
    private CharSequence B;
    private CharSequence C;
    private Object D;
    private boolean E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private final ArrayList J;
    private final og e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final pm k;
    private final pm l;
    private final oo m;
    private final oo n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private ok v;
    private float w;
    private float x;
    private Drawable y;
    private Drawable z;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new og(this);
        h = 0x99000000;
        j = new Paint();
        q = true;
        F = null;
        G = null;
        H = null;
        I = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        g = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        m = new oo(this, 3);
        n = new oo(this, 5);
        k = pm.a(this, m);
        k.a(1);
        k.a(f2);
        m.a(k);
        l = pm.a(this, n);
        l.a(2);
        l.a(f2);
        n.a(l);
        setFocusableInTouchMode(true);
        kb.c(this, 1);
        kb.a(this, new of(this));
        kt.a(this);
        if (kb.t(this))
        {
            a.a(this);
            y = a.a(context);
        }
        f = f1 * 10F;
        J = new ArrayList();
    }

    public static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.j();
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !g(view1) || flag && view1 == view)
            {
                kb.c(view1, 1);
            } else
            {
                kb.c(view1, 4);
            }
            i1++;
        }
    }

    private static boolean a(Drawable drawable, int i1)
    {
        if (drawable == null || !fe.b(drawable))
        {
            return false;
        } else
        {
            fe.b(drawable, i1);
            return true;
        }
    }

    private static String d(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    public static int[] h()
    {
        return b;
    }

    public static boolean i()
    {
        return c;
    }

    private View j()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && k(view))
            {
                return view;
            }
        }

        return null;
    }

    public static boolean l(View view)
    {
        return kb.f(view) != 4 && kb.f(view) != 2;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return r;
        }
        if (i1 == 5)
        {
            return s;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((ol)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public CharSequence a(int i1)
    {
        i1 = ih.a(i1, kb.i(this));
        if (i1 == 3)
        {
            return B;
        }
        if (i1 == 5)
        {
            return C;
        } else
        {
            return null;
        }
    }

    public void a(int i1, int j1)
    {
        j1 = ih.a(j1, kb.i(this));
        if (j1 == 3)
        {
            r = i1;
        } else
        if (j1 == 5)
        {
            s = i1;
        }
        if (i1 != 0)
        {
            pm pm1;
            if (j1 == 3)
            {
                pm1 = k;
            } else
            {
                pm1 = l;
            }
            pm1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = b(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(int i1, View view)
    {
        ol ol1;
        boolean flag = true;
        int k1 = k.a();
        int l1 = l.a();
        int j1 = ((flag) ? 1 : 0);
        if (k1 != 1)
        {
            if (l1 == 1)
            {
                j1 = ((flag) ? 1 : 0);
            } else
            if (k1 == 2 || l1 == 2)
            {
                j1 = 2;
            } else
            {
                j1 = 0;
            }
        }
        if (view == null || i1 != 0) goto _L2; else goto _L1
_L1:
        ol1 = (ol)view.getLayoutParams();
        if (ol1.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (j1 != o)
        {
            o = j1;
            if (v != null)
            {
                v.a(j1);
            }
        }
        return;
_L4:
        if (ol1.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (v != null)
        {
            v.a(view, f1);
        }
    }

    public void a(Object obj, boolean flag)
    {
        D = obj;
        E = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public void a(ok ok1)
    {
        v = ok1;
    }

    void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                ol ol1 = (ol)view.getLayoutParams();
                int k1 = i1;
                if (!g(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!ol1.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= k.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= l.a(view, getWidth(), view.getTop());
                }
                ol1.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        m.a();
        n.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    public boolean a(View view, int i1)
    {
        return (e(view) & i1) == i1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        boolean flag1 = false;
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j2 = getChildCount();
        int k1 = 0;
        boolean flag = false;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (g(view))
            {
                if (j(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i1, j1);
                }
            } else
            {
                J.add(view);
            }
            k1++;
        }
        if (!flag)
        {
            int i2 = J.size();
            for (int l1 = ((flag1) ? 1 : 0); l1 < i2; l1++)
            {
                View view1 = (View)J.get(l1);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i1, j1);
                }
            }

        }
        J.clear();
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (a() != null || g(view))
        {
            kb.c(view, 4);
        } else
        {
            kb.c(view, 1);
        }
        if (!c)
        {
            kb.a(view, e);
        }
    }

    public View b(int i1)
    {
        int j1 = ih.a(i1, kb.i(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((e(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public void b()
    {
        a(false);
    }

    void b(View view)
    {
        ol ol1 = (ol)view.getLayoutParams();
        if (ol1.d)
        {
            ol1.d = false;
            if (v != null)
            {
                v.b(view);
            }
            a(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    public void b(View view, float f1)
    {
        ol ol1 = (ol)view.getLayoutParams();
        if (f1 == ol1.b)
        {
            return;
        } else
        {
            ol1.b = f1;
            a(view, f1);
            return;
        }
    }

    public void c()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(d(0x800003)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    public void c(int i1)
    {
        y = new ColorDrawable(i1);
        invalidate();
    }

    void c(View view)
    {
        ol ol1 = (ol)view.getLayoutParams();
        if (!ol1.d)
        {
            ol1.d = true;
            if (v != null)
            {
                v.a(view);
            }
            a(view, true);
            if (hasWindowFocus())
            {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof ol) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((ol)getChildAt(i1).getLayoutParams()).b);
        }

        i = f1;
        if (k.f() | l.f())
        {
            kb.e(this);
        }
    }

    public float d(View view)
    {
        return ((ol)view.getLayoutParams()).b;
    }

    public void d()
    {
        View view = b(0x800003);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(d(0x800003)).toString());
        } else
        {
            i(view);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = f(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
        Drawable drawable = view1.getBackground();
        if (drawable != null)
        {
            if (drawable.getOpacity() == -1)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
        } else
        {
            i3 = 0;
        }
        if (i3 == 0 || !g(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (i > 0.0F && flag1)
        {
            int j1 = (int)((float)((h & 0xff000000) >>> 24) * i);
            int i4 = h;
            j.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), j);
        } else
        {
            if (z != null && a(view, 3))
            {
                int k1 = z.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = k.b();
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                z.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                z.setAlpha((int)(255F * f1));
                z.draw(canvas);
                return flag2;
            }
            if (A != null && a(view, 5))
            {
                int i2 = A.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = l.b();
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                A.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                A.setAlpha((int)(255F * f2));
                A.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    public int e(View view)
    {
        return ih.a(((ol)view.getLayoutParams()).a, kb.i(this));
    }

    public boolean e()
    {
        View view = b(0x800003);
        if (view != null)
        {
            return j(view);
        } else
        {
            return false;
        }
    }

    public boolean f()
    {
        View view = b(0x800003);
        if (view != null)
        {
            return k(view);
        } else
        {
            return false;
        }
    }

    boolean f(View view)
    {
        return ((ol)view.getLayoutParams()).a == 0;
    }

    public void g()
    {
        int i1 = 0;
        if (!u)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            u = true;
        }
    }

    public boolean g(View view)
    {
        return (ih.a(((ol)view.getLayoutParams()).a, kb.i(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new ol();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new ol(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof ol)
        {
            return new ol((ol)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new ol((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new ol(layoutparams);
        }
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            ol ol1 = (ol)view.getLayoutParams();
            ol1.b = 1.0F;
            ol1.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            k.a(view, 0, view.getTop());
        } else
        {
            l.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            view = (ol)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            k.a(view, -view.getWidth(), view.getTop());
        } else
        {
            l.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((ol)view.getLayoutParams()).d;
        }
    }

    public boolean k(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((ol)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        q = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (E && y != null)
        {
            int i1 = a.a(D);
            if (i1 > 0)
            {
                y.setBounds(0, 0, getWidth(), i1);
                y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = jg.a(motionevent);
        flag1 = k.a(motionevent);
        flag2 = l.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 230
    //                   2 200
    //                   3 230;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L15:
        if (flag1 | flag2 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L17:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((ol)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L18:
        if (i1 == 0 && !u) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        w = f1;
        x = f2;
        if (i <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = k.b((int)f1, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L19:
        t = false;
        u = false;
          goto _L15
_L4:
        if (!k.g()) goto _L1; else goto _L16
_L16:
        m.a();
        n.a();
        i1 = 0;
          goto _L15
_L3:
        a(true);
        t = false;
        u = false;
          goto _L1
_L10:
        i1++;
          goto _L17
_L8:
        i1 = 0;
          goto _L18
_L13:
        i1 = 0;
          goto _L19
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (j() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                il.c(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            keyevent = j();
            if (keyevent != null && a(keyevent) == 0)
            {
                b();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        p = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        ol ol1;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            ol1 = (ol)view.getLayoutParams();
            if (!f(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(ol1.leftMargin, ol1.topMargin, ol1.leftMargin + view.getMeasuredWidth(), ol1.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * ol1.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * ol1.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != ol1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ol1.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i2, ol1.topMargin, i3 + i2, j3 + ol1.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int j2;
        int k3;
        if (ol1.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - ol1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - ol1.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < ol1.topMargin)
        {
            i1 = ol1.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - ol1.bottomMargin)
            {
                i1 = k3 - ol1.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        p = false;
        q = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l3;
        k2 = 300;
        j2 = 0;
        l3 = android.view.View.MeasureSpec.getMode(i1);
        i3 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getSize(j1);
        if (l3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (i3 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        boolean flag;
        if (isInEditMode())
        {
            k1 = i2;
            if (l3 != 0x80000000)
            {
                k1 = i2;
                if (l3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (i3 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (i3 == 0)
                    {
                        l1 = k1;
                        k1 = k2;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l1, k1);
        if (D != null && kb.t(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = kb.i(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                ol ol1 = (ol)view.getLayoutParams();
                if (flag)
                {
                    int j3 = ih.a(ol1.a, k2);
                    if (kb.t(view))
                    {
                        a.a(view, D, j3);
                    } else
                    {
                        a.a(ol1, D, j3);
                    }
                }
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - ol1.leftMargin - ol1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - ol1.topMargin - ol1.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    if (d && kb.q(view) != f)
                    {
                        kb.f(view, f);
                    }
                    int k3 = e(view) & 7;
                    if ((k3 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(d(k3)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, g + ol1.leftMargin + ol1.rightMargin, ol1.width), getChildMeasureSpec(j1, ol1.topMargin + ol1.bottomMargin, ol1.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
_L3:
        k1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (om)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((om) (parcelable)).a != 0)
        {
            View view = b(((om) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        a(((om) (parcelable)).b, 3);
        a(((om) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i1)
    {
        if (d) goto _L2; else goto _L1
_L1:
        i1 = kb.i(this);
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        if (F == null) goto _L6; else goto _L5
_L5:
        Drawable drawable;
        a(F, i1);
        drawable = F;
_L8:
        z = drawable;
        i1 = kb.i(this);
        if (i1 == 0)
        {
            if (G == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            a(G, i1);
            drawable = G;
        } else
        {
            if (F == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            a(F, i1);
            drawable = F;
        }
_L9:
        A = drawable;
_L2:
        return;
_L4:
        if (G == null) goto _L6; else goto _L7
_L7:
        a(G, i1);
        drawable = G;
          goto _L8
_L6:
        drawable = H;
          goto _L8
        drawable = I;
          goto _L9
    }

    protected Parcelable onSaveInstanceState()
    {
        om om1 = new om(super.onSaveInstanceState());
        View view = a();
        if (view != null)
        {
            om1.a = ((ol)view.getLayoutParams()).a;
        }
        om1.b = r;
        om1.c = s;
        return om1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        k.b(motionevent);
        l.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 204;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        w = f1;
        x = f3;
        t = false;
        u = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = k.b((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= w;
        f2 -= x;
        i1 = k.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = a();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        t = false;
        return true;
_L4:
        a(true);
        t = false;
        u = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        t = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!p)
        {
            super.requestLayout();
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new oi();
        } else
        {
            a = new oj();
        }
    }
}
