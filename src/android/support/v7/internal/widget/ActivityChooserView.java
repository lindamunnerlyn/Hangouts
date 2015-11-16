// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
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
import rq;
import ug;
import um;
import un;
import uo;
import up;
import uq;
import ur;
import xu;
import yc;

public final class ActivityChooserView extends ViewGroup
{

    public final uq a;
    public final xu b;
    public final Drawable c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public hz g;
    public final DataSetObserver h;
    public android.widget.PopupWindow.OnDismissListener i;
    public boolean j;
    public int k;
    public int l;
    private final ur m;
    private final ImageView n;
    private final int o;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener p;
    private yc q;
    private boolean r;

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
        h = new um(this);
        p = new un(this);
        k = 4;
        Object obj = context.obtainStyledAttributes(null, rq.E, 0, 0);
        k = ((TypedArray) (obj)).getInt(rq.G, 4);
        attributeset = ((TypedArray) (obj)).getDrawable(rq.F);
        ((TypedArray) (obj)).recycle();
        LayoutInflater.from(getContext()).inflate(g.bs, this, true);
        m = new ur(this);
        b = (xu)findViewById(g.aU);
        c = b.getBackground();
        e = (FrameLayout)findViewById(g.bb);
        e.setOnClickListener(m);
        e.setOnLongClickListener(m);
        f = (ImageView)e.findViewById(g.be);
        obj = (FrameLayout)findViewById(g.bc);
        ((FrameLayout) (obj)).setOnClickListener(m);
        ((FrameLayout) (obj)).setOnTouchListener(new uo(this, ((View) (obj))));
        d = ((FrameLayout) (obj));
        n = (ImageView)((FrameLayout) (obj)).findViewById(g.be);
        n.setImageDrawable(attributeset);
        a = new uq(this);
        a.registerDataSetObserver(new up(this));
        context = context.getResources();
        o = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(g.Y));
    }

    public void a(int i1)
    {
        String s = getContext().getString(i1);
        n.setContentDescription(s);
    }

    public void a(Drawable drawable)
    {
        n.setImageDrawable(drawable);
    }

    public void a(hz hz1)
    {
        g = hz1;
    }

    public void a(ug ug1)
    {
        a.a(ug1);
        if (c())
        {
            b();
            a();
        }
    }

    public boolean a()
    {
        if (c() || !r)
        {
            return false;
        } else
        {
            j = false;
            b(k);
            return true;
        }
    }

    public void b(int i1)
    {
        if (a.e() == null)
        {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(p);
        yc yc1;
        int j1;
        int k1;
        boolean flag;
        if (e.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = a.c();
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0x7fffffff && k1 > j1 + i1)
        {
            a.a(true);
            a.a(i1 - 1);
        } else
        {
            a.a(false);
            a.a(i1);
        }
        yc1 = d();
        if (!yc1.n())
        {
            if (j || !flag)
            {
                a.a(true, flag);
            } else
            {
                a.a(false, false);
            }
            yc1.e(Math.min(a.a(), o));
            yc1.c();
            if (g != null)
            {
                g.a(true);
            }
            yc1.p().setContentDescription(getContext().getString(g.bG));
        }
    }

    public boolean b()
    {
        if (c())
        {
            d().k();
            ViewTreeObserver viewtreeobserver = getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.removeGlobalOnLayoutListener(p);
            }
        }
        return true;
    }

    public void c(int i1)
    {
        l = i1;
    }

    public boolean c()
    {
        return d().n();
    }

    public yc d()
    {
        if (q == null)
        {
            q = new yc(getContext());
            q.a(a);
            q.a(this);
            q.e();
            q.a(m);
            q.a(m);
        }
        return q;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ug ug1 = a.e();
        if (ug1 != null)
        {
            ug1.registerObserver(h);
        }
        r = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Object obj = a.e();
        if (obj != null)
        {
            ((ug) (obj)).unregisterObserver(h);
        }
        obj = getViewTreeObserver();
        if (((ViewTreeObserver) (obj)).isAlive())
        {
            ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(p);
        }
        if (c())
        {
            b();
        }
        r = false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        b.layout(0, 0, k1 - i1, l1 - j1);
        if (!c())
        {
            b();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        xu xu1 = b;
        int k1 = j1;
        if (e.getVisibility() != 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
        }
        measureChild(xu1, i1, k1);
        setMeasuredDimension(xu1.getMeasuredWidth(), xu1.getMeasuredHeight());
    }
}
