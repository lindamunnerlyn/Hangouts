// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public final class va extends HorizontalScrollView
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private static final Interpolator i = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private xs d;
    private Spinner e;
    private boolean f;
    private int g;
    private int h;

    static vd a(va va1, pr pr)
    {
        pr = new vd(va1, va1.getContext(), pr, true);
        pr.setBackgroundDrawable(null);
        pr.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, va1.g));
        return pr;
    }

    static xs a(va va1)
    {
        return va1.d;
    }

    private void a(int j)
    {
        h = j;
        int l = d.getChildCount();
        int k = 0;
        while (k < l) 
        {
            View view = d.getChildAt(k);
            boolean flag;
            if (k == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (!flag)
            {
                continue;
            }
            view = d.getChildAt(j);
            if (a != null)
            {
                removeCallbacks(a);
            }
            a = new vb(this, view);
            post(a);
            k++;
        }
        if (e != null && j >= 0)
        {
            e.setSelection(j);
        }
    }

    private boolean a()
    {
        return e != null && e.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(e);
            addView(d, new android.view.ViewGroup.LayoutParams(-2, -1));
            a(e.getSelectedItemPosition());
            return false;
        }
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = sf.a(getContext());
        g = configuration.e();
        requestLayout();
        c = configuration.g();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int j, long l)
    {
    }

    public void onMeasure(int j, int k)
    {
        k = 1;
        int l = android.view.View.MeasureSpec.getMode(j);
        int j1;
        boolean flag;
        if (l == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        j1 = d.getChildCount();
        if (j1 > 1 && (l == 0x40000000 || l == 0x80000000))
        {
            wu wu1;
            int i1;
            if (j1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(j) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(j) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
        if (flag || !f)
        {
            k = 0;
        }
        if (k != 0)
        {
            d.measure(0, i1);
            if (d.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(j))
            {
                if (!a())
                {
                    if (e == null)
                    {
                        wu1 = new wu(getContext(), null, g.l);
                        wu1.setLayoutParams(new xt(-2, -1));
                        wu1.setOnItemSelectedListener(this);
                        e = wu1;
                    }
                    removeView(d);
                    addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (e.getAdapter() == null)
                    {
                        e.setAdapter(new vc(this));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    e.setSelection(h);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        k = getMeasuredWidth();
        super.onMeasure(j, i1);
        j = getMeasuredWidth();
        if (flag && k != j)
        {
            a(h);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

}
