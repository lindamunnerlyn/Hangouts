// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import fne;
import fnj;
import fnr;
import fnt;
import fqu;
import g;
import h;
import java.util.List;
import o;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            ExpanderView, SelectedAccountNavigationView, ShrinkingItem

public class AccountSwitcherView extends FrameLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, fnr, fnt
{

    public fnj a;
    private a b;
    private a c;
    private fqu d;
    private List e;
    private ListView f;
    private FrameLayout g;
    private SelectedAccountNavigationView h;
    private fne i;
    private int j;
    private ShrinkingItem k;
    private boolean l;
    private ViewGroup m;
    private ExpanderView n;
    private a o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private View w;

    public AccountSwitcherView(Context context)
    {
        this(context, null);
    }

    public AccountSwitcherView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        q = true;
        r = true;
        v = false;
        new TypedValue();
        attributeset = context.obtainStyledAttributes(attributeset, new int[] {
            g.rt
        });
        u = attributeset.getBoolean(0, a(21));
        attributeset.recycle();
        LayoutInflater.from(context).inflate(h.jg, this);
        m = (ViewGroup)findViewById(o.C);
        m.setOnClickListener(this);
        n = (ExpanderView)findViewById(o.g);
        n.setOnClickListener(this);
        h = (SelectedAccountNavigationView)findViewById(o.B);
        h.a(u);
        h.a(this);
        h.a(this);
        f = (ListView)findViewById(o.k);
        f.setOnItemClickListener(this);
        k = (ShrinkingItem)findViewById(o.l);
        j = -1;
        g = (FrameLayout)findViewById(o.u);
        a();
    }

    private void a(View view, int i1)
    {
        view.offsetTopAndBottom(i1);
        s = view.getTop();
    }

    private void a(fqu fqu, boolean flag)
    {
        fqu fqu1 = d;
        d = fqu;
        if (e != null)
        {
            e = fne.a(e, fqu1, d);
            if (!flag)
            {
                h.a(d);
            }
            i.a(e);
            return;
        } else
        {
            h.a(null);
            return;
        }
    }

    private void a(boolean flag)
    {
        switch (h.a())
        {
        default:
            return;

        case 0: // '\0'
            if (flag)
            {
                AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                alphaanimation.setDuration(200L);
                g.setAnimation(alphaanimation);
                a(false, ((Interpolator) (new AccelerateInterpolator(0.8F))));
            } else
            {
                g.setAnimation(null);
            }
            g.setVisibility(0);
            k.setVisibility(8);
            return;

        case 1: // '\001'
            break;
        }
        if (flag)
        {
            AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation1.setDuration(200L);
            alphaanimation1.setStartOffset(133L);
            a(true, ((Interpolator) (new DecelerateInterpolator(0.8F))));
        } else
        {
            g.setAnimation(null);
        }
        g.setVisibility(8);
        k.setVisibility(0);
    }

    private void a(boolean flag, Interpolator interpolator)
    {
        int i1;
        int j1;
        if (flag)
        {
            i1 = 1;
            j1 = 0;
        } else
        {
            i1 = 0;
            j1 = 1;
        }
        if (a(11))
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(k, "animatedHeightFraction", new float[] {
                (float)j1, (float)i1
            });
            objectanimator.setDuration(200L);
            objectanimator.setInterpolator(interpolator);
            objectanimator.start();
            return;
        } else
        {
            k.a(i1);
            return;
        }
    }

    public static boolean a(int i1)
    {
        return android.os.Build.VERSION.SDK_INT >= i1;
    }

    private void b(int i1)
    {
        g.offsetTopAndBottom(i1);
        t = g.getTop();
    }

    public static boolean b()
    {
        return a(21);
    }

    private void c(int i1)
    {
        h.b(i1);
    }

    private void d(int i1)
    {
        m.setPadding(m.getPaddingLeft(), i1, m.getPaddingRight(), m.getPaddingBottom());
        a.a(i1);
        h.a(i1);
    }

    public void a()
    {
        boolean flag = true;
        c(0);
        a(false);
        ExpanderView expanderview = n;
        if (h.a() != 1)
        {
            flag = false;
        }
        expanderview.a(flag);
    }

    public void a(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a(true);
    }

    public void a(fqu fqu)
    {
        a(fqu, true);
    }

    public int getNestedScrollAxes()
    {
        return 2;
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (view == m)
        {
            if (o == null);
        } else
        if (view == n)
        {
            int i1;
            if (h.a() == 1)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            c(i1);
            view = n;
            if (h.a() != 1)
            {
                flag = false;
            }
            view.a(flag);
            a(h);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (w != null)
        {
            w.setOnApplyWindowInsetsListener(null);
            w = null;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i.getItemViewType(i1) == 0)
        {
            a(i.a(i1), false);
            if (b == null);
        } else
        if (i.getItemViewType(i1) == 1)
        {
            if (c != null)
            {
                return;
            }
        } else
        {
            i.getItemViewType(i1);
            return;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        Object obj;
        if (l)
        {
            obj = m;
        } else
        {
            obj = h;
        }
        if (s != ((View) (obj)).getTop())
        {
            ((View) (obj)).offsetTopAndBottom(s - ((View) (obj)).getTop());
        }
        if (t != g.getTop())
        {
            g.offsetTopAndBottom(t - g.getTop());
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        j1 = 0;
        do
        {
label0:
            {
                if (j1 < getChildCount())
                {
                    if (!getChildAt(j1).equals(g))
                    {
                        break label0;
                    }
                    if (l)
                    {
                        j1 = m.getMeasuredHeight();
                    } else
                    {
                        j1 = h.getMeasuredHeight();
                    }
                    g.setPadding(g.getPaddingLeft(), j1, g.getPaddingRight(), g.getPaddingBottom());
                    if (!p)
                    {
                        j1 = 0;
                    }
                    g.measure(i1, j1 + android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x40000000));
                }
                return;
            }
            j1++;
        } while (true);
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        if (l)
        {
            view = m;
        } else
        {
            view = h;
        }
        if (!flag && f2 < 0.0F && view.getBottom() < 0)
        {
            a(view, -view.getTop());
            b(-view.getTop());
            return true;
        }
        if (flag && f2 > 0.0F)
        {
            if (view.getTop() > -view.getMeasuredHeight())
            {
                a(view, -view.getMeasuredHeight() - view.getTop());
            }
            if (g.getTop() > -view.getMeasuredHeight())
            {
                b(-view.getMeasuredHeight() - g.getTop());
            }
        }
        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
        if (l)
        {
            view = m;
        } else
        {
            view = h;
        }
        if (h.a() != 1)
        {
            if (j1 > 0 && view.getBottom() > 0)
            {
                if (view.getBottom() > j1)
                {
                    i1 = -j1;
                } else
                {
                    i1 = -view.getBottom();
                }
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (view.getTop() + i1 < -view.getMeasuredHeight())
                {
                    a(view, -view.getMeasuredHeight() - view.getTop());
                } else
                {
                    a(view, i1);
                }
                if (g.getTop() + i1 < -view.getMeasuredHeight())
                {
                    b(-view.getMeasuredHeight() - g.getTop());
                } else
                {
                    b(i1);
                }
                ai[0] = 0;
                ai[1] = i1;
                return;
            }
        }
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
label0:
        {
            if (l)
            {
                view = m;
            } else
            {
                view = h;
            }
            if (l1 < 0 && view.getTop() < 0)
            {
                i1 = l1;
                if (l1 <= view.getTop())
                {
                    i1 = view.getTop();
                }
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (view.getTop() - i1 > 0)
                {
                    a(view, -view.getTop());
                } else
                {
                    a(view, -i1);
                }
                if (g.getTop() - i1 <= view.getMeasuredHeight())
                {
                    break label0;
                }
                b(view.getMeasuredHeight() - g.getTop());
            }
            return;
        }
        b(-i1);
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        return p;
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        int i2 = j1;
        if (v)
        {
            d(j1);
            i2 = 0;
        }
        super.setPadding(i1, i2, k1, l1);
    }

    public void setPaddingRelative(int i1, int j1, int k1, int l1)
    {
        int i2 = j1;
        if (v)
        {
            d(j1);
            i2 = 0;
        }
        super.setPaddingRelative(i1, i2, k1, l1);
    }
}
