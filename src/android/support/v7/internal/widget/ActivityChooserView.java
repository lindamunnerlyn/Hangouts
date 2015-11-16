// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import g;
import hz;
import ro;
import ue;
import uk;
import ul;
import um;
import un;
import uo;
import up;
import xs;
import ya;

public final class ActivityChooserView extends ViewGroup
{

    public hz a;
    private final uo b;
    private final up c;
    private final xs d;
    private final Drawable e;
    private final FrameLayout f;
    private final ImageView g;
    private final FrameLayout h;
    private final ImageView i;
    private final int j;
    private final DataSetObserver k;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener l;
    private ya m;
    private android.widget.PopupWindow.OnDismissListener n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;

    public ActivityChooserView(Context context)
    {
        this(context, (byte)0);
    }

    private ActivityChooserView(Context context, byte byte0)
    {
        this(context, ((AttributeSet) (null)));
    }

    private ActivityChooserView(Context context, AttributeSet attributeset)
    {
        super(context, null, 0);
        k = new uk(this);
        l = new ul(this);
        p = 4;
        Object obj = context.obtainStyledAttributes(null, ro.E, 0, 0);
        p = ((TypedArray) (obj)).getInt(ro.G, 4);
        attributeset = ((TypedArray) (obj)).getDrawable(ro.F);
        ((TypedArray) (obj)).recycle();
        LayoutInflater.from(getContext()).inflate(g.bs, this, true);
        c = new up(this);
        d = (xs)findViewById(g.aU);
        e = d.getBackground();
        h = (FrameLayout)findViewById(g.bb);
        h.setOnClickListener(c);
        h.setOnLongClickListener(c);
        i = (ImageView)h.findViewById(g.be);
        obj = (FrameLayout)findViewById(g.bc);
        ((FrameLayout) (obj)).setOnClickListener(c);
        ((FrameLayout) (obj)).setOnTouchListener(new um(this, ((View) (obj))));
        f = ((FrameLayout) (obj));
        g = (ImageView)((FrameLayout) (obj)).findViewById(g.be);
        g.setImageDrawable(attributeset);
        b = new uo(this);
        b.registerDataSetObserver(new un(this));
        context = context.getResources();
        j = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(g.Y));
    }

    public static uo a(ActivityChooserView activitychooserview)
    {
        return activitychooserview.b;
    }

    public static void a(ActivityChooserView activitychooserview, int i1)
    {
        activitychooserview.c(i1);
    }

    public static boolean a(ActivityChooserView activitychooserview, boolean flag)
    {
        activitychooserview.o = flag;
        return flag;
    }

    public static ya b(ActivityChooserView activitychooserview)
    {
        return activitychooserview.d();
    }

    private void c(int i1)
    {
        if (b.e() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(l);
        ya ya1;
        int j1;
        int k1;
        boolean flag;
        if (h.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = b.c();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            b.a(true);
            b.a(i1 - 1);
        } else
        {
            b.a(false);
            b.a(i1);
        }
        ya1 = d();
        if (!ya1.n())
        {
            if (o || !flag)
            {
                b.a(true, flag);
            } else
            {
                b.a(false, false);
            }
            ya1.e(Math.min(b.a(), j));
            ya1.c();
            if (a != null)
            {
                a.a(true);
            }
            ya1.p().setContentDescription(getContext().getString(g.bG));
        }
    }

    public static void c(ActivityChooserView activitychooserview)
    {
        int i1;
        int j1;
        if (activitychooserview.b.getCount() > 0)
        {
            activitychooserview.f.setEnabled(true);
        } else
        {
            activitychooserview.f.setEnabled(false);
        }
        i1 = activitychooserview.b.c();
        j1 = activitychooserview.b.d();
        if (i1 == 1 || i1 > 1 && j1 > 0)
        {
            activitychooserview.h.setVisibility(0);
            Object obj = activitychooserview.b.b();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.i.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (activitychooserview.r != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = activitychooserview.getContext().getString(activitychooserview.r, new Object[] {
                    obj
                });
                activitychooserview.h.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            activitychooserview.h.setVisibility(8);
        }
        if (activitychooserview.h.getVisibility() == 0)
        {
            activitychooserview.d.setBackgroundDrawable(activitychooserview.e);
            return;
        } else
        {
            activitychooserview.d.setBackgroundDrawable(null);
            return;
        }
    }

    private ya d()
    {
        if (m == null)
        {
            m = new ya(getContext());
            m.a(b);
            m.a(this);
            m.e();
            m.a(c);
            m.a(c);
        }
        return m;
    }

    public static boolean d(ActivityChooserView activitychooserview)
    {
        return activitychooserview.o;
    }

    public static FrameLayout e(ActivityChooserView activitychooserview)
    {
        return activitychooserview.h;
    }

    public static FrameLayout f(ActivityChooserView activitychooserview)
    {
        return activitychooserview.f;
    }

    public static int g(ActivityChooserView activitychooserview)
    {
        return activitychooserview.p;
    }

    public static android.widget.PopupWindow.OnDismissListener h(ActivityChooserView activitychooserview)
    {
        return activitychooserview.n;
    }

    public static DataSetObserver i(ActivityChooserView activitychooserview)
    {
        return activitychooserview.k;
    }

    public void a(int i1)
    {
        String s = getContext().getString(i1);
        g.setContentDescription(s);
    }

    public void a(Drawable drawable)
    {
        g.setImageDrawable(drawable);
    }

    public void a(hz hz1)
    {
        a = hz1;
    }

    public void a(ue ue1)
    {
        b.a(ue1);
        if (c())
        {
            b();
            a();
        }
    }

    public boolean a()
    {
        if (c() || !q)
        {
            return false;
        } else
        {
            o = false;
            c(p);
            return true;
        }
    }

    public void b(int i1)
    {
        r = i1;
    }

    public boolean b()
    {
        if (c())
        {
            d().k();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(l);
            }
        }
        return true;
    }

    public boolean c()
    {
        return d().n();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ue ue1 = b.e();
        if (ue1 != null)
        {
            ue1.registerObserver(k);
        }
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = b.e();
        if (obj != null)
        {
            ((ue) (obj)).unregisterObserver(k);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(l);
        }
        if (c())
        {
            b();
        }
        q = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        d.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        xs xs1 = d;
        int k1 = j1;
        if (h.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(xs1, i1, k1);
        setMeasuredDimension(xs1.getMeasuredWidth(), xs1.getMeasuredHeight());
    }
}
