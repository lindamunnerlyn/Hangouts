// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public abstract class zg
{

    private boolean a;
    xf h;
    yt i;
    zp j;
    boolean k;

    public zg()
    {
        k = false;
        a = false;
    }

    private static int a(int i1, int j1, int k1, boolean flag)
    {
        int l1;
        int i2;
        i2 = 0x40000000;
        l1 = Math.max(0, i1 - j1);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (k1 >= 0)
        {
            i1 = k1;
            j1 = i2;
        } else
        {
            j1 = 0;
            i1 = 0;
        }
_L4:
        return android.view.View.MeasureSpec.makeMeasureSpec(i1, j1);
_L2:
        j1 = i2;
        i1 = k1;
        if (k1 < 0)
        {
            if (k1 == -1)
            {
                i1 = l1;
                j1 = i2;
            } else
            if (k1 == -2)
            {
                j1 = 0x80000000;
                i1 = l1;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(View view, int i1, boolean flag)
    {
        zs zs1;
        zh zh1;
        zs1 = yt.b(view);
        if (flag || zs1.n())
        {
            i.e.b(view);
        } else
        {
            i.e.a(view);
        }
        zh1 = (zh)view.getLayoutParams();
        if (!zs1.g() && !zs1.e()) goto _L2; else goto _L1
_L1:
        if (zs1.e())
        {
            zs1.f();
        } else
        {
            zs1.h();
        }
        h.a(view, i1, view.getLayoutParams(), false);
_L4:
        if (zh1.d)
        {
            zs1.a.invalidate();
            zh1.d = false;
        }
        return;
_L2:
        if (view.getParent() == i)
        {
            int k1 = h.c(view);
            int j1 = i1;
            if (i1 == -1)
            {
                j1 = h.b();
            }
            if (k1 == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(i.indexOfChild(view)).toString());
            }
            if (k1 != j1)
            {
                yt.e(i).a(k1, j1);
            }
        } else
        {
            h.a(view, i1, false);
            zh1.c = true;
            if (j != null && j.c())
            {
                j.b(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int a(int i1, zl zl1, zq zq1)
    {
        return 0;
    }

    public int a(zq zq1)
    {
        return 0;
    }

    public View a(int i1)
    {
        int k1 = k();
        for (int j1 = 0; j1 < k1; j1++)
        {
            View view = e(j1);
            zs zs1 = yt.b(view);
            if (zs1 != null && zs1.d() == i1 && !zs1.c() && (i.e.a() || !zs1.n()))
            {
                return view;
            }
        }

        return null;
    }

    public abstract zh a();

    public zh a(Context context, AttributeSet attributeset)
    {
        return new zh(context, attributeset);
    }

    public zh a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof zh)
        {
            return new zh((zh)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new zh((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new zh(layoutparams);
        }
    }

    public void a(int i1, int j1)
    {
        View view = e(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(i1).toString());
        } else
        {
            d(i1);
            c(view, j1);
            return;
        }
    }

    public void a(int i1, zl zl1)
    {
        View view = e(i1);
        c(i1);
        zl1.a(view);
    }

    public void a(Parcelable parcelable)
    {
    }

    public void a(View view)
    {
        a(view, -1);
    }

    public void a(View view, int i1)
    {
        a(view, i1, true);
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        Rect rect = ((zh)view.getLayoutParams()).b;
        view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
    }

    public void a(View view, int i1, zh zh1)
    {
        zs zs1 = yt.b(view);
        if (zs1.n())
        {
            i.e.b(view);
        } else
        {
            i.e.a(view);
        }
        h.a(view, i1, zh1, zs1.n());
    }

    void a(View view, mq mq1)
    {
        zs zs1 = yt.b(view);
        if (zs1 != null && !zs1.n() && !h.d(zs1.a))
        {
            Object obj = i.a;
            obj = i.e;
            b(view, mq1);
        }
    }

    public void a(View view, zl zl1)
    {
        c(view);
        zl1.a(view);
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        Object obj = i.a;
        obj = i.e;
        b(accessibilityevent);
    }

    public void a(String s1)
    {
        if (i != null)
        {
            i.a(s1);
        }
    }

    void a(mq mq1)
    {
        Object obj = i.a;
        obj = i.e;
        b(mq1);
    }

    void a(yt yt1)
    {
        if (yt1 == null)
        {
            i = null;
            h = null;
            return;
        } else
        {
            i = yt1;
            h = yt1.c;
            return;
        }
    }

    public void a(yt yt1, zl zl1)
    {
    }

    public void a(zl zl1)
    {
        int i1 = k() - 1;
        while (i1 >= 0) 
        {
            View view = e(i1);
            zs zs1 = yt.b(view);
            if (!zs1.c())
            {
                if (zs1.j() && !zs1.n() && !zs1.l() && !yt.g(i).b)
                {
                    c(i1);
                    zl1.a(zs1);
                } else
                {
                    d(i1);
                    zl1.c(view);
                }
            }
            i1--;
        }
    }

    public void a(zl zl1, zq zq1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public boolean a(yt yt1, View view, Rect rect, boolean flag)
    {
        int k2 = n();
        int l1 = o();
        int l2 = l() - p();
        int j2 = m();
        int k3 = q();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (j() == 1)
        {
            if (k1 != 0)
            {
                i1 = k1;
            } else
            {
                i1 = Math.max(i1, j3 - l2);
            }
        } else
        if (i1 == 0)
        {
            i1 = Math.min(i3 - k2, k1);
        }
        if (j1 == 0)
        {
            j1 = Math.min(i2 - l1, j2);
        }
        if (i1 != 0 || j1 != 0)
        {
            if (flag)
            {
                yt1.scrollBy(i1, j1);
            } else
            {
                yt1.a(i1, j1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(zh zh1)
    {
        return zh1 != null;
    }

    public int b(int i1, zl zl1, zq zq1)
    {
        return 0;
    }

    public int b(zq zq1)
    {
        return 0;
    }

    public Parcelable b()
    {
        return null;
    }

    public void b(int i1)
    {
    }

    public void b(int i1, int j1)
    {
        yt.b(i, i1, j1);
    }

    public void b(View view)
    {
        b(view, -1);
    }

    public void b(View view, int i1)
    {
        a(view, i1, false);
    }

    public void b(View view, mq mq1)
    {
        int i1;
        int j1;
        if (d())
        {
            i1 = d(view);
        } else
        {
            i1 = 0;
        }
        if (c())
        {
            j1 = d(view);
        } else
        {
            j1 = 0;
        }
        mq1.b(new nb(mq.o().a(i1, 1, j1, 1, false, false)));
    }

    public void b(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        accessibilityevent = mj.a(accessibilityevent);
        if (i != null)
        {
            boolean flag = flag1;
            if (!kb.b(i, 1))
            {
                flag = flag1;
                if (!kb.b(i, -1))
                {
                    flag = flag1;
                    if (!kb.a(i, -1))
                    {
                        if (kb.a(i, 1))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
            accessibilityevent.a(flag);
            if (yt.g(i) != null)
            {
                accessibilityevent.a(yt.g(i).a());
                return;
            }
        }
    }

    public void b(mq mq1)
    {
        if (kb.b(i, -1) || kb.a(i, -1))
        {
            mq1.a(8192);
            mq1.i(true);
        }
        if (kb.b(i, 1) || kb.a(i, 1))
        {
            mq1.a(4096);
            mq1.i(true);
        }
        int i1 = t();
        int j1 = u();
        mq1.a(new na(mq.o().a(i1, j1, false, 0)));
    }

    void b(yt yt1, zl zl1)
    {
        a = false;
        a(yt1, zl1);
    }

    void b(zl zl1)
    {
        int j1 = zl1.c();
        for (int i1 = j1 - 1; i1 >= 0; i1--)
        {
            View view = zl1.b(i1);
            zs zs1 = yt.b(view);
            if (zs1.c())
            {
                continue;
            }
            zs1.a(false);
            if (zs1.p())
            {
                i.removeDetachedView(view, false);
            }
            if (i.d != null)
            {
                i.d.c(zs1);
            }
            zs1.a(true);
            zl1.b(view);
        }

        zl1.d();
        if (j1 > 0)
        {
            i.invalidate();
        }
    }

    public boolean b(yt yt1)
    {
        return i() || yt1.o();
    }

    public int c(zq zq1)
    {
        return 0;
    }

    public View c(int i1, zl zl1, zq zq1)
    {
        return null;
    }

    public void c(int i1)
    {
        if (e(i1) != null)
        {
            h.a(i1);
        }
    }

    public void c(View view)
    {
        h.b(view);
    }

    public void c(View view, int i1)
    {
        a(view, i1, (zh)view.getLayoutParams());
    }

    public void c(zl zl1)
    {
        for (int i1 = k() - 1; i1 >= 0; i1--)
        {
            if (!yt.b(e(i1)).c())
            {
                a(i1, zl1);
            }
        }

    }

    public boolean c()
    {
        return false;
    }

    public boolean c(yt yt1)
    {
        return b(yt1);
    }

    public int d(View view)
    {
        return ((zh)view.getLayoutParams()).c();
    }

    public int d(zq zq1)
    {
        return 0;
    }

    public void d(int i1)
    {
        e(i1);
        h.d(i1);
    }

    public boolean d()
    {
        return false;
    }

    public int e(zq zq1)
    {
        return 0;
    }

    public View e(int i1)
    {
        if (h != null)
        {
            return h.b(i1);
        } else
        {
            return null;
        }
    }

    public void e(View view)
    {
        zh zh1 = (zh)view.getLayoutParams();
        Rect rect = i.d(view);
        int i1 = rect.left;
        int j1 = rect.right;
        int k1 = rect.top;
        int l1 = rect.bottom;
        view.measure(a(l(), i1 + j1 + 0 + (n() + p() + zh1.leftMargin + zh1.rightMargin), zh1.width, c()), a(m(), l1 + k1 + 0 + (o() + q() + zh1.topMargin + zh1.bottomMargin), zh1.height, d()));
    }

    public int f(View view)
    {
        Rect rect = ((zh)view.getLayoutParams()).b;
        int i1 = view.getMeasuredWidth();
        int j1 = rect.left;
        return rect.right + (i1 + j1);
    }

    public int f(zq zq1)
    {
        return 0;
    }

    public void f(int i1)
    {
        if (i != null)
        {
            i.d(i1);
        }
    }

    public boolean f()
    {
        return false;
    }

    public int g(View view)
    {
        Rect rect = ((zh)view.getLayoutParams()).b;
        int i1 = view.getMeasuredHeight();
        int j1 = rect.top;
        return rect.bottom + (i1 + j1);
    }

    public void g()
    {
        if (i != null)
        {
            i.requestLayout();
        }
    }

    public void g(int i1)
    {
        if (i != null)
        {
            i.c(i1);
        }
    }

    public int h(View view)
    {
        return view.getLeft() - n(view);
    }

    void h()
    {
        a = true;
    }

    boolean h(int i1)
    {
        Object obj = i.a;
        obj = i.e;
        return i(i1);
    }

    public int i(View view)
    {
        return view.getTop() - l(view);
    }

    public boolean i()
    {
        return j != null && j.c();
    }

    public boolean i(int i1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR lookupswitch 2: default 36
    //                   4096: 122
    //                   8192: 59;
           goto _L3 _L4 _L5
_L3:
        int j1;
        i1 = 0;
        j1 = 0;
_L8:
        if (j1 != 0 || i1 != 0)
        {
            i.scrollBy(i1, j1);
            return true;
        }
          goto _L1
_L5:
        int k1;
        int l1;
        int i2;
        if (kb.b(i, -1))
        {
            i1 = -(m() - o() - q());
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (!kb.a(i, -1)) goto _L7; else goto _L6
_L6:
        k1 = -(l() - n() - p());
        j1 = i1;
        i1 = k1;
          goto _L8
_L4:
        if (kb.b(i, 1))
        {
            i1 = m() - o() - q();
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (!kb.a(i, 1)) goto _L7; else goto _L9
_L9:
        k1 = l();
        l1 = n();
        i2 = p();
        j1 = i1;
        i1 = k1 - l1 - i2;
          goto _L8
_L7:
        i1 = 0;
          goto _L8
    }

    public int j()
    {
        return kb.i(i);
    }

    public int j(View view)
    {
        return view.getRight() + o(view);
    }

    public int k()
    {
        if (h != null)
        {
            return h.b();
        } else
        {
            return 0;
        }
    }

    public int k(View view)
    {
        return view.getBottom() + m(view);
    }

    public int l()
    {
        if (i != null)
        {
            return i.getWidth();
        } else
        {
            return 0;
        }
    }

    public int l(View view)
    {
        return ((zh)view.getLayoutParams()).b.top;
    }

    public int m()
    {
        if (i != null)
        {
            return i.getHeight();
        } else
        {
            return 0;
        }
    }

    public int m(View view)
    {
        return ((zh)view.getLayoutParams()).b.bottom;
    }

    public int n()
    {
        if (i != null)
        {
            return i.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public int n(View view)
    {
        return ((zh)view.getLayoutParams()).b.left;
    }

    public int o()
    {
        if (i != null)
        {
            return i.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public int o(View view)
    {
        return ((zh)view.getLayoutParams()).b.right;
    }

    public int p()
    {
        if (i != null)
        {
            return i.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public int q()
    {
        if (i != null)
        {
            return i.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public View r()
    {
        View view;
        if (i != null)
        {
            if ((view = i.getFocusedChild()) != null && !h.d(view))
            {
                return view;
            }
        }
        return null;
    }

    void s()
    {
        if (j != null)
        {
            j.a();
        }
    }

    public int t()
    {
        while (i == null || yt.g(i) == null || !d()) 
        {
            return 1;
        }
        return yt.g(i).a();
    }

    public int u()
    {
        while (i == null || yt.g(i) == null || !c()) 
        {
            return 1;
        }
        return yt.g(i).a();
    }

    boolean v()
    {
        Object obj = i.a;
        obj = i.e;
        return false;
    }
}
