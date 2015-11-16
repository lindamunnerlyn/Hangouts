// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class tu extends ViewGroup
{

    public final tv a;
    public final Context b;
    public ActionMenuView c;
    public vu d;
    public int e;
    public lr f;
    private boolean g;
    private boolean h;

    tu(Context context)
    {
        this(context, null);
    }

    tu(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public tu(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new tv(this);
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(g.e, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
        {
            b = new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId);
            return;
        } else
        {
            b = context;
            return;
        }
    }

    public static int a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return i - j;
        } else
        {
            return i + j;
        }
    }

    static void a(tu tu1)
    {
        tu1.View.setVisibility(0);
    }

    static void a(tu tu1, int i)
    {
        tu1.View.setVisibility(i);
    }

    public int a(View view, int i, int j)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public int a(View view, int i, int j, int k, boolean flag)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j = (k - i1) / 2 + j;
        if (flag)
        {
            view.layout(i - l, j, i, i1 + j);
        } else
        {
            view.layout(i, j, i + l, i1 + j);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
    }

    public lr a(int i, long l)
    {
        if (f != null)
        {
            f.b();
        }
        if (i == 0)
        {
            if (getVisibility() != 0)
            {
                kb.c(this, 0.0F);
            }
            lr lr1 = kb.o(this).a(1.0F);
            lr1.a(l);
            lr1.a(a.a(lr1, i));
            return lr1;
        } else
        {
            lr lr2 = kb.o(this).a(0.0F);
            lr2.a(l);
            lr2.a(a.a(lr2, i));
            return lr2;
        }
    }

    public void a(int i)
    {
        e = i;
        requestLayout();
    }

    public boolean a()
    {
        if (d != null)
        {
            return d.e();
        } else
        {
            return false;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = getContext().obtainStyledAttributes(null, ro.a, g.g, 0);
        a(configuration.getLayoutDimension(ro.j, 0));
        configuration.recycle();
        if (d != null)
        {
            d.c();
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = jg.a(motionevent);
        if (i == 9)
        {
            h = false;
        }
        if (!h)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i == 9 && !flag)
            {
                h = true;
            }
        }
        if (i == 10 || i == 3)
        {
            h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = jg.a(motionevent);
        if (i == 0)
        {
            g = false;
        }
        if (!g)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i == 0 && !flag)
            {
                g = true;
            }
        }
        if (i == 1 || i == 3)
        {
            g = false;
        }
        return true;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            if (f != null)
            {
                f.b();
            }
            super.setVisibility(i);
        }
    }
}
