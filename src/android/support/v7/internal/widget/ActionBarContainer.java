// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import g;
import ro;
import tw;
import tx;
import va;

public class ActionBarContainer extends FrameLayout
{

    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    public boolean e;
    private boolean f;
    private View g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context)
    {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Object obj;
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new tx(this);
        } else
        {
            obj = new tw(this);
        }
        setBackgroundDrawable(((Drawable) (obj)));
        context = context.obtainStyledAttributes(attributeset, ro.a);
        a = context.getDrawable(ro.b);
        b = context.getDrawable(ro.d);
        j = context.getDimensionPixelSize(ro.j, -1);
        if (getId() == g.bi)
        {
            d = true;
            c = context.getDrawable(ro.c);
        }
        context.recycle();
        if (d)
        {
            if (c == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        if (a == null && b == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setWillNotDraw(flag1);
    }

    private static boolean a(View view)
    {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int b(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
        int k = view.getMeasuredHeight();
        int l = layoutparams.topMargin;
        return layoutparams.bottomMargin + (k + l);
    }

    public View a()
    {
        return g;
    }

    public void a(va va1)
    {
        if (g != null)
        {
            removeView(g);
        }
        g = va1;
        if (va1 != null)
        {
            addView(va1);
            android.view.ViewGroup.LayoutParams layoutparams = va1.getLayoutParams();
            layoutparams.width = -1;
            layoutparams.height = -2;
            va1.a(false);
        }
    }

    public void a(boolean flag)
    {
        f = flag;
        int k;
        if (flag)
        {
            k = 0x60000;
        } else
        {
            k = 0x40000;
        }
        setDescendantFocusability(k);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (a != null && a.isStateful())
        {
            a.setState(getDrawableState());
        }
        if (b != null && b.isStateful())
        {
            b.setState(getDrawableState());
        }
        if (c != null && c.isStateful())
        {
            c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (a != null)
            {
                a.jumpToCurrentState();
            }
            if (b != null)
            {
                b.jumpToCurrentState();
            }
            if (c != null)
            {
                c.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        h = findViewById(g.aL);
        i = findViewById(g.aQ);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return f || super.onInterceptTouchEvent(motionevent);
    }

    public void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
label0:
        {
            {
                boolean flag1 = true;
                super.onLayout(flag, k, l, i1, j1);
                View view = g;
                if (view != null && view.getVisibility() != 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (view != null && view.getVisibility() != 8)
                {
                    l = getMeasuredHeight();
                    android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                    view.layout(k, l - view.getMeasuredHeight() - layoutparams.bottomMargin, i1, l - layoutparams.bottomMargin);
                }
                if (!d)
                {
                    break label0;
                }
                if (c != null)
                {
                    c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    k = ((flag1) ? 1 : 0);
                } else
                {
                    k = 0;
                }
            }
            if (k != 0)
            {
                invalidate();
            }
            return;
        }
        if (a != null)
        {
            if (h.getVisibility() == 0)
            {
                a.setBounds(h.getLeft(), h.getTop(), h.getRight(), h.getBottom());
            } else
            if (i != null && i.getVisibility() == 0)
            {
                a.setBounds(i.getLeft(), i.getTop(), i.getRight(), i.getBottom());
            } else
            {
                a.setBounds(0, 0, 0, 0);
            }
            k = 1;
        } else
        {
            k = 0;
        }
        e = flag;
        if (flag && b != null)
        {
            b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            k = ((flag1) ? 1 : 0);
        }
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_129;
        }
    }

    public void onMeasure(int k, int l)
    {
        int i1 = l;
        if (h == null)
        {
            i1 = l;
            if (android.view.View.MeasureSpec.getMode(l) == 0x80000000)
            {
                i1 = l;
                if (j >= 0)
                {
                    i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(j, android.view.View.MeasureSpec.getSize(l)), 0x80000000);
                }
            }
        }
        super.onMeasure(k, i1);
        if (h != null)
        {
            l = android.view.View.MeasureSpec.getMode(i1);
            if (g != null && g.getVisibility() != 8 && l != 0x40000000)
            {
                if (!a(h))
                {
                    k = b(h);
                } else
                if (!a(i))
                {
                    k = b(i);
                } else
                {
                    k = 0;
                }
                if (l == 0x80000000)
                {
                    l = android.view.View.MeasureSpec.getSize(i1);
                } else
                {
                    l = 0x7fffffff;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(k + b(g), l));
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setVisibility(int k)
    {
        super.setVisibility(k);
        boolean flag;
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a != null)
        {
            a.setVisible(flag, false);
        }
        if (b != null)
        {
            b.setVisible(flag, false);
        }
        if (c != null)
        {
            c.setVisible(flag, false);
        }
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == a && !d || drawable == b && e || drawable == c && d || super.verifyDrawable(drawable);
    }
}
