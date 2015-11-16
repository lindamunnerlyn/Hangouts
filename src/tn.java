// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

public class tn
    implements android.view.View.OnKeyListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener, tp
{

    static final int a;
    final LayoutInflater b;
    final ta c;
    final boolean d;
    boolean e;
    private final Context f;
    private final to g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private yc l;
    private ViewTreeObserver m;
    private tq n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    private tn(Context context, ta ta1, View view)
    {
        this(context, ta1, view, false, g.K);
    }

    public tn(Context context, ta ta1, View view, boolean flag, int i1)
    {
        this(context, ta1, view, flag, i1, (byte)0);
    }

    private tn(Context context, ta ta1, View view, boolean flag, int i1, byte byte0)
    {
        r = 0;
        f = context;
        b = LayoutInflater.from(context);
        c = ta1;
        g = new to(this, c);
        d = flag;
        i = i1;
        j = 0;
        Resources resources = context.getResources();
        h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.Y));
        k = view;
        ta1.a(this, context);
    }

    public void a()
    {
        r = 0x800005;
    }

    public void a(Context context, ta ta1)
    {
    }

    public void a(View view)
    {
        k = view;
    }

    public void a(ta ta1, boolean flag)
    {
        if (ta1 == c)
        {
            f();
            if (n != null)
            {
                n.a(ta1, flag);
                return;
            }
        }
    }

    public void a(tq tq1)
    {
        n = tq1;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public boolean a(tu tu1)
    {
        if (!tu1.hasVisibleItems()) goto _L2; else goto _L1
_L1:
        tn tn1;
        int i1;
        int j1;
        tn1 = new tn(f, tu1, k);
        tn1.a(n);
        j1 = tu1.size();
        i1 = 0;
_L5:
        MenuItem menuitem;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        menuitem = tu1.getItem(i1);
        if (!menuitem.isVisible() || menuitem.getIcon() == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        tn1.a(flag);
        if (tn1.e())
        {
            if (n != null)
            {
                n.a(tu1);
            }
            return true;
        }
          goto _L2
_L4:
        i1++;
          goto _L5
_L2:
        return false;
        flag = false;
          goto _L6
    }

    public void b(boolean flag)
    {
        p = false;
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(te te)
    {
        return false;
    }

    public void c()
    {
        if (!e())
        {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        } else
        {
            return;
        }
    }

    public boolean c(te te)
    {
        return false;
    }

    public yc d()
    {
        return l;
    }

    public boolean e()
    {
        View view;
        int l1;
        l1 = 0;
        l = new yc(f, null, i, j);
        l.a(this);
        l.a(this);
        l.a(g);
        l.e();
        view = k;
        if (view == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        to to1;
        int k1;
        int i2;
        int j2;
        int k2;
        if (m == null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        m = view.getViewTreeObserver();
        if (i1 != 0)
        {
            m.addOnGlobalLayoutListener(this);
        }
        l.a(view);
        l.c(r);
        if (p) goto _L4; else goto _L3
_L3:
        to1 = g;
        i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        k2 = to1.getCount();
        j1 = 0;
        k1 = 0;
        view = null;
        i1 = l1;
_L10:
        l1 = i1;
        if (j1 >= k2) goto _L6; else goto _L5
_L5:
        l1 = to1.getItemViewType(j1);
        if (l1 != k1)
        {
            k1 = l1;
            view = null;
        }
        if (o == null)
        {
            o = new FrameLayout(f);
        }
        view = to1.getView(j1, view, o);
        view.measure(i2, j2);
        l1 = view.getMeasuredWidth();
        if (l1 < h) goto _L8; else goto _L7
_L7:
        l1 = h;
_L6:
        q = l1;
        p = true;
_L4:
        l.e(q);
        l.l();
        l.c();
        l.p().setOnKeyListener(this);
        return true;
_L2:
        return false;
_L8:
        if (l1 > i1)
        {
            i1 = l1;
        }
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void f()
    {
        if (g())
        {
            l.k();
        }
    }

    public boolean g()
    {
        return l != null && l.n();
    }

    public void onDismiss()
    {
        l = null;
        c.close();
        if (m != null)
        {
            if (!m.isAlive())
            {
                m = k.getViewTreeObserver();
            }
            m.removeGlobalOnLayoutListener(this);
            m = null;
        }
    }

    public void onGlobalLayout()
    {
        if (g())
        {
            View view = k;
            if (view == null || !view.isShown())
            {
                f();
            } else
            if (g())
            {
                l.c();
                return;
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = g;
        ((to) (adapterview)).a.a(adapterview.a(i1), 0);
    }

    public boolean onKey(View view, int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1 && i1 == 82)
        {
            f();
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = g.bA;
    }
}
