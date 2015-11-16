// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import g;
import jn;
import jo;
import kb;
import lr;
import me;
import pe;
import to;
import tz;
import ua;
import ub;
import uc;
import ud;
import us;
import ut;
import vp;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer, ContentFrameLayout

public class ActionBarOverlayLayout extends ViewGroup
    implements jn, us
{

    static final int a[];
    private final Runnable A;
    private final jo B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private ut f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private uc u;
    private final int v;
    private pe w;
    private lr x;
    private final me y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        o = new Rect();
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        v = 600;
        y = new tz(this);
        z = new ua(this);
        A = new ub(this);
        a(context);
        B = new jo(this);
    }

    public static lr a(ActionBarOverlayLayout actionbaroverlaylayout, lr lr1)
    {
        actionbaroverlaylayout.x = lr1;
        return lr1;
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(a);
        b = typedarray.getDimensionPixelSize(0, 0);
        g = typedarray.getDrawable(1);
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        typedarray.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        w = pe.a(context, null);
    }

    public static boolean a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.l = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag)
    {
        boolean flag1 = false;
        view = (ud)view.getLayoutParams();
        if (((ud) (view)).leftMargin != rect.left)
        {
            view.leftMargin = rect.left;
            flag1 = true;
        }
        if (((ud) (view)).topMargin != rect.top)
        {
            view.topMargin = rect.top;
            flag1 = true;
        }
        if (((ud) (view)).rightMargin != rect.right)
        {
            view.rightMargin = rect.right;
            flag1 = true;
        }
        if (flag && ((ud) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag1;
        }
    }

    public static void b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.n();
    }

    public static me c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.y;
    }

    public static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.e;
    }

    private void n()
    {
        removeCallbacks(z);
        removeCallbacks(A);
        if (x != null)
        {
            x.b();
        }
    }

    public ud a(AttributeSet attributeset)
    {
        return new ud(getContext(), attributeset);
    }

    public void a()
    {
        boolean flag = true;
        i = true;
        if (getContext().getApplicationInfo().targetSdkVersion >= 19)
        {
            flag = false;
        }
        h = flag;
    }

    public void a(int i1)
    {
        n();
        i1 = Math.max(0, Math.min(i1, e.getHeight()));
        kb.b(e, -i1);
    }

    public void a(Menu menu, to to)
    {
        e();
        f.a(menu, to);
    }

    public void a(android.view.Window.Callback callback)
    {
        e();
        f.a(callback);
    }

    public void a(CharSequence charsequence)
    {
        e();
        f.a(charsequence);
    }

    public void a(uc uc1)
    {
        u = uc1;
        if (getWindowToken() != null)
        {
            u.d(c);
            if (n != 0)
            {
                onWindowSystemUiVisibilityChanged(n);
                kb.r(this);
            }
        }
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public void b(int i1)
    {
        e();
        switch (i1)
        {
        case 2: // '\002'
        case 5: // '\005'
        default:
            return;

        case 109: // 'm'
            a();
            break;
        }
    }

    public void b(boolean flag)
    {
        if (flag != k)
        {
            k = flag;
            if (!flag)
            {
                n();
                a(0);
            }
        }
    }

    public boolean b()
    {
        return i;
    }

    public void c()
    {
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof ud;
    }

    protected ud d()
    {
        return new ud();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (g != null && !h)
        {
            int i1;
            if (e.getVisibility() == 0)
            {
                i1 = (int)((float)e.getBottom() + kb.l(e) + 0.5F);
            } else
            {
                i1 = 0;
            }
            g.setBounds(0, i1, getWidth(), g.getIntrinsicHeight() + i1);
            g.draw(canvas);
        }
    }

    void e()
    {
        if (d == null)
        {
            d = (ContentFrameLayout)findViewById(g.aM);
            e = (ActionBarContainer)findViewById(g.aN);
            Object obj = findViewById(g.aL);
            if (obj instanceof ut)
            {
                obj = (ut)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).s();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            f = ((ut) (obj));
        }
    }

    public int f()
    {
        if (e != null)
        {
            return -(int)kb.l(e);
        } else
        {
            return 0;
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        e();
        kb.q(this);
        boolean flag = a(e, rect, false);
        r.set(rect);
        vp.a(this, r, o);
        if (!p.equals(o))
        {
            p.set(o);
            flag = true;
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    public boolean g()
    {
        e();
        return f.e();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return d();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new ud(layoutparams);
    }

    public int getNestedScrollAxes()
    {
        return B.a();
    }

    public boolean h()
    {
        e();
        return f.f();
    }

    public boolean i()
    {
        e();
        return f.g();
    }

    public boolean j()
    {
        e();
        return f.h();
    }

    public boolean k()
    {
        e();
        return f.i();
    }

    public void l()
    {
        e();
        f.j();
    }

    public void m()
    {
        e();
        f.k();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        kb.r(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        n();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getChildCount();
        k1 = getPaddingLeft();
        getPaddingRight();
        l1 = getPaddingTop();
        getPaddingBottom();
        for (i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                ud ud1 = (ud)view.getLayoutParams();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int k2 = ud1.leftMargin + k1;
                int l2 = ud1.topMargin + l1;
                view.layout(k2, l2, i2 + k2, j2 + l2);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        e();
        measureChildWithMargins(e, i1, 0, j1, 0);
        Object obj = (ud)e.getLayoutParams();
        int i3 = Math.max(0, e.getMeasuredWidth() + ((ud) (obj)).leftMargin + ((ud) (obj)).rightMargin);
        int k1 = e.getMeasuredHeight();
        int l1 = ((ud) (obj)).topMargin;
        int l2 = Math.max(0, ((ud) (obj)).bottomMargin + (k1 + l1));
        int k2 = vp.a(0, kb.j(e));
        int j2;
        if ((kb.q(this) & 0x100) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            int i2 = b;
            k1 = i2;
            if (j)
            {
                k1 = i2;
                if (e.a() != null)
                {
                    k1 = i2 + b;
                }
            }
        } else
        if (e.getVisibility() != 8)
        {
            k1 = e.getMeasuredHeight();
        } else
        {
            k1 = 0;
        }
        q.set(o);
        s.set(r);
        if (!i && l1 == 0)
        {
            obj = q;
            obj.top = k1 + ((Rect) (obj)).top;
            obj = q;
            obj.bottom = ((Rect) (obj)).bottom;
        } else
        {
            Rect rect = s;
            rect.top = k1 + rect.top;
            rect = s;
            rect.bottom = rect.bottom;
        }
        a(d, q, true);
        if (!t.equals(s))
        {
            t.set(s);
            d.a(s);
        }
        measureChildWithMargins(d, i1, 0, j1, 0);
        obj = (ud)d.getLayoutParams();
        k1 = Math.max(i3, d.getMeasuredWidth() + ((ud) (obj)).leftMargin + ((ud) (obj)).rightMargin);
        l1 = d.getMeasuredHeight();
        j2 = ((ud) (obj)).topMargin;
        l1 = Math.max(l2, ((ud) (obj)).bottomMargin + (l1 + j2));
        j2 = vp.a(k2, kb.j(d));
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(kb.a(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), kb.a(l1, j1, j2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!k || !flag)
        {
            return false;
        }
        w.a(0, (int)f2, 0, 0);
        if (w.e() > e.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            n();
            A.run();
        } else
        {
            n();
            z.run();
        }
        l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        m = m + j1;
        a(m);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        B.a(i1);
        m = f();
        n();
        if (u != null)
        {
            u.n();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || e.getVisibility() != 0)
        {
            return false;
        } else
        {
            return k;
        }
    }

    public void onStopNestedScroll(View view)
    {
label0:
        {
            if (k && !l)
            {
                if (m > e.getHeight())
                {
                    break label0;
                }
                n();
                postDelayed(z, 600L);
            }
            return;
        }
        n();
        postDelayed(A, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        e();
        int j1 = n;
        n = i1;
        boolean flag;
        boolean flag1;
        if ((i1 & 4) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 0x100) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (u != null)
        {
            uc uc1 = u;
            if (flag1)
            {
                flag2 = false;
            }
            uc1.e(flag2);
            if (flag || !flag1)
            {
                u.l();
            } else
            {
                u.m();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && u != null)
        {
            kb.r(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        c = i1;
        if (u != null)
        {
            u.d(i1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = (new int[] {
            g.f, 0x1010059
        });
    }
}
