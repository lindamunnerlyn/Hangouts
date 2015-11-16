// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aaa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import g;
import ih;
import iw;
import ja;
import java.util.ArrayList;
import java.util.List;
import jg;
import kb;
import pp;
import ro;
import sy;
import sz;
import tc;
import to;
import ut;
import uz;
import vi;
import vk;
import vl;
import vp;
import vu;
import wg;
import zv;
import zw;
import zx;
import zy;
import zz;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView

public class Toolbar extends ViewGroup
{

    private boolean A;
    private final ArrayList B;
    private final ArrayList C;
    private final int D[];
    private wg E;
    private final wg F;
    private vl G;
    private vu H;
    private zy I;
    private to J;
    private sz K;
    private boolean L;
    private final Runnable M;
    private final vi N;
    public View a;
    private ActionMenuView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    private ImageButton i;
    private Context j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final uz t;
    private int u;
    private CharSequence v;
    private CharSequence w;
    private int x;
    private int y;
    private boolean z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.Q);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = new uz();
        u = 0x800013;
        B = new ArrayList();
        C = new ArrayList();
        D = new int[2];
        F = new zv(this);
        M = new zw(this);
        context = vk.a(getContext(), attributeset, ro.cb, i1);
        l = context.f(ro.cy, 0);
        m = context.f(ro.cq, 0);
        u = context.b(ro.cc, u);
        n = 48;
        i1 = context.c(ro.cx, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.c(ro.cv, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.c(ro.cu, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(ro.cw, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(ro.ct, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.d(ro.cl, -1);
        i1 = context.c(ro.ci, 0x80000000);
        int j1 = context.c(ro.cf, 0x80000000);
        int k1 = context.d(ro.cg, 0);
        int l1 = context.d(ro.ch, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(ro.ce);
        h = context.c(ro.cd);
        attributeset = context.c(ro.cs);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        attributeset = context.c(ro.cp);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        j = getContext();
        a(context.f(ro.co, 0));
        attributeset = context.a(ro.cn);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(ro.cm);
        if (!TextUtils.isEmpty(attributeset))
        {
            d(attributeset);
        }
        attributeset = context.a(ro.cj);
        if (attributeset != null)
        {
            a(attributeset);
        }
        attributeset = context.c(ro.ck);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        if (context.g(ro.cz))
        {
            b(context.f(ro.cz));
        }
        if (context.g(ro.cr))
        {
            c(context.f(ro.cr));
        }
        context.b();
        N = context.c();
    }

    private int a(View view, int i1)
    {
        zz zz1;
        int j1;
        int k1;
        int l1;
        int i2;
        zz1 = (zz)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = zz1.a & 0x70;
        j1 = k1;
        k1;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j1 = u & 0x70;
_L2:
        j1;
        JVM INSTR lookupswitch 2: default 112
    //                   48: 167
    //                   80: 174;
           goto _L3 _L4 _L5
_L3:
        j1 = getPaddingTop();
        k1 = getPaddingBottom();
        i2 = getHeight();
        i1 = (i2 - j1 - k1 - l1) / 2;
        if (i1 >= zz1.topMargin) goto _L7; else goto _L6
_L6:
        i1 = zz1.topMargin;
_L9:
        return i1 + j1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - zz1.bottomMargin - i1;
_L7:
        k1 = i2 - k1 - l1 - i1 - j1;
        if (k1 < zz1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (zz1.bottomMargin - k1));
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private int a(View view, int i1, int j1, int k1, int l1, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = marginlayoutparams.leftMargin - ai[0];
        int j2 = marginlayoutparams.rightMargin - ai[1];
        int k2 = Math.max(0, i2) + Math.max(0, j2);
        ai[0] = Math.max(0, -i2);
        ai[1] = Math.max(0, -j2);
        view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + k2 + j1, marginlayoutparams.width), getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height));
        return view.getMeasuredWidth() + k2;
    }

    private int a(View view, int i1, int ai[], int j1)
    {
        zz zz1 = (zz)view.getLayoutParams();
        int k1 = zz1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return zz1.rightMargin + k1 + i1;
    }

    public static wg a(Toolbar toolbar)
    {
        return toolbar.E;
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, marginlayoutparams.height);
        k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = j1;
        if (k1 != 0x40000000)
        {
            i1 = j1;
            if (l1 >= 0)
            {
                i1 = l1;
                if (k1 != 0)
                {
                    i1 = Math.min(android.view.View.MeasureSpec.getSize(j1), l1);
                }
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            }
        }
        view.measure(i2, i1);
    }

    private void a(View view, boolean flag)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = r();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (zz)obj;
        }
        obj.b = 1;
        if (flag && a != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            C.add(view);
            return;
        } else
        {
            addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    private void a(List list, int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        int k1;
        if (kb.h(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = ih.a(i1, kb.h(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                zz zz1 = (zz)view.getLayoutParams();
                if (zz1.b == 0 && a(view) && f(zz1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                zz zz2 = (zz)view1.getLayoutParams();
                if (zz2.b == 0 && a(view1) && f(zz2.a) == j1)
                {
                    list.add(view1);
                }
            }

        }
    }

    private boolean a(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private static int b(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = iw.a(view);
        return iw.b(view) + i1;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        zz zz1 = (zz)view.getLayoutParams();
        int k1 = zz1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (zz1.leftMargin + k1);
    }

    public static void b(Toolbar toolbar)
    {
        if (toolbar.i == null)
        {
            toolbar.i = new ImageButton(toolbar.getContext(), null, g.P);
            toolbar.i.setImageDrawable(toolbar.g);
            toolbar.i.setContentDescription(toolbar.h);
            zz zz1 = toolbar.r();
            zz1.a = 0x800003 | toolbar.n & 0x70;
            zz1.b = 2;
            toolbar.i.setLayoutParams(zz1);
            toolbar.i.setOnClickListener(new zx(toolbar));
        }
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    public static ImageButton c(Toolbar toolbar)
    {
        return toolbar.i;
    }

    public static int d(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private boolean d(View view)
    {
        return view.getParent() == this || C.contains(view);
    }

    private int f(int i1)
    {
label0:
        {
            int k1 = kb.h(this);
            int j1 = ih.a(i1, k1) & 7;
            i1 = j1;
            switch (j1)
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                if (k1 != 1)
                {
                    break label0;
                }
                i1 = 5;
                break;

            case 1: // '\001'
            case 3: // '\003'
            case 5: // '\005'
                break;
            }
            return i1;
        }
        return 3;
    }

    private void v()
    {
        if (f == null)
        {
            f = new ImageView(getContext());
        }
    }

    private void w()
    {
        if (b == null)
        {
            b = new ActionMenuView(getContext());
            b.a(k);
            b.a(F);
            b.a(J, K);
            zz zz1 = r();
            zz1.a = 0x800005 | n & 0x70;
            b.setLayoutParams(zz1);
            a(b, false);
        }
    }

    private void x()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, g.P);
            zz zz1 = r();
            zz1.a = 0x800003 | n & 0x70;
            e.setLayoutParams(zz1);
        }
    }

    public zz a(AttributeSet attributeset)
    {
        return new zz(getContext(), attributeset);
    }

    protected zz a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof zz)
        {
            return new zz((zz)layoutparams);
        }
        if (layoutparams instanceof pp)
        {
            return new zz((pp)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new zz((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new zz(layoutparams);
        }
    }

    public void a(int i1)
    {
label0:
        {
            if (k != i1)
            {
                k = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                j = getContext();
            }
            return;
        }
        j = new ContextThemeWrapper(getContext(), i1);
    }

    public void a(int i1, int j1)
    {
        t.a(i1, j1);
    }

    public void a(Context context, int i1)
    {
        l = i1;
        if (c != null)
        {
            c.setTextAppearance(context, i1);
        }
    }

    public void a(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        v();
        if (!d(f))
        {
            a(((View) (f)), true);
        }
_L4:
        if (f != null)
        {
            f.setImageDrawable(drawable);
        }
        return;
_L2:
        if (f != null && d(f))
        {
            removeView(f);
            C.remove(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        x();
        e.setOnClickListener(onclicklistener);
    }

    public void a(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            v();
        }
        if (f != null)
        {
            f.setContentDescription(charsequence);
        }
    }

    public void a(sy sy1, vu vu1)
    {
        if (sy1 != null || b != null)
        {
            w();
            sy sy2 = b.e();
            if (sy2 != sy1)
            {
                if (sy2 != null)
                {
                    sy2.b(H);
                    sy2.b(I);
                }
                if (I == null)
                {
                    I = new zy(this);
                }
                vu1.c(true);
                if (sy1 != null)
                {
                    sy1.a(vu1, j);
                    sy1.a(I, j);
                } else
                {
                    vu1.a(j, null);
                    I.a(j, null);
                    vu1.b(true);
                    I.b(true);
                }
                b.a(k);
                b.a(vu1);
                H = vu1;
                return;
            }
        }
    }

    public void a(to to, sz sz)
    {
        J = to;
        K = sz;
    }

    public void a(wg wg)
    {
        E = wg;
    }

    public void a(boolean flag)
    {
        L = flag;
        requestLayout();
    }

    public boolean a()
    {
        return getVisibility() == 0 && b != null && b.a();
    }

    public void b(int i1)
    {
        x = i1;
        if (c != null)
        {
            c.setTextColor(i1);
        }
    }

    public void b(Context context, int i1)
    {
        m = i1;
        if (d != null)
        {
            d.setTextAppearance(context, i1);
        }
    }

    public void b(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        x();
        if (!d(e))
        {
            a(e, true);
        }
_L4:
        if (e != null)
        {
            e.setImageDrawable(drawable);
        }
        return;
_L2:
        if (e != null && d(e))
        {
            removeView(e);
            C.remove(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (c == null)
        {
            Context context = getContext();
            c = new TextView(context);
            c.setSingleLine();
            c.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (l != 0)
            {
                c.setTextAppearance(context, l);
            }
            if (x != 0)
            {
                c.setTextColor(x);
            }
        }
        if (!d(c))
        {
            a(c, true);
        }
_L4:
        if (c != null)
        {
            c.setText(charsequence);
        }
        v = charsequence;
        return;
_L2:
        if (c != null && d(c))
        {
            removeView(c);
            C.remove(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        return b != null && b.h();
    }

    public void c(int i1)
    {
        y = i1;
        if (d != null)
        {
            d.setTextColor(i1);
        }
    }

    public void c(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (d == null)
        {
            Context context = getContext();
            d = new TextView(context);
            d.setSingleLine();
            d.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (m != 0)
            {
                d.setTextAppearance(context, m);
            }
            if (y != 0)
            {
                d.setTextColor(y);
            }
        }
        if (!d(d))
        {
            a(d, true);
        }
_L4:
        if (d != null)
        {
            d.setText(charsequence);
        }
        w = charsequence;
        return;
_L2:
        if (d != null && d(d))
        {
            removeView(d);
            C.remove(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean c()
    {
        return b != null && b.i();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof zz);
    }

    public void d(int i1)
    {
        CharSequence charsequence;
        if (i1 != 0)
        {
            charsequence = getContext().getText(i1);
        } else
        {
            charsequence = null;
        }
        d(charsequence);
    }

    public void d(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            x();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public boolean d()
    {
        return b != null && b.f();
    }

    public void e(int i1)
    {
        b(N.a(i1));
    }

    public boolean e()
    {
        return b != null && b.g();
    }

    public void f()
    {
        if (b != null)
        {
            b.j();
        }
    }

    public boolean g()
    {
        return I != null && I.b != null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return r();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public void h()
    {
        tc tc1;
        if (I == null)
        {
            tc1 = null;
        } else
        {
            tc1 = I.b;
        }
        if (tc1 != null)
        {
            tc1.collapseActionView();
        }
    }

    public CharSequence i()
    {
        return v;
    }

    public CharSequence j()
    {
        return w;
    }

    public CharSequence k()
    {
        if (e != null)
        {
            return e.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable l()
    {
        if (e != null)
        {
            return e.getDrawable();
        } else
        {
            return null;
        }
    }

    public Menu m()
    {
        w();
        if (b.e() == null)
        {
            sy sy1 = (sy)b.d();
            if (I == null)
            {
                I = new zy(this);
            }
            b.k();
            sy1.a(I, j);
        }
        return b.d();
    }

    public int n()
    {
        return t.c();
    }

    public int o()
    {
        return t.d();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(M);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i1 = jg.a(motionevent);
        if (i1 == 9)
        {
            A = false;
        }
        if (!A)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                A = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            A = false;
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Object obj;
        Object obj1;
        int ai[];
        int i2;
        boolean flag1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        boolean flag2;
        if (kb.h(this) == 1)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        k3 = getWidth();
        j4 = getHeight();
        i2 = getPaddingLeft();
        l3 = getPaddingRight();
        i4 = getPaddingTop();
        k4 = getPaddingBottom();
        l1 = k3 - l3;
        ai = D;
        ai[1] = 0;
        ai[0] = 0;
        j3 = kb.n(this);
        zz zz3;
        int k2;
        if (a(e))
        {
            if (l2 != 0)
            {
                l1 = b(e, l1, ai, j3);
                i1 = i2;
            } else
            {
                i1 = a(e, i2, ai, j3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (a(i))
        {
            if (l2 != 0)
            {
                j1 = b(i, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, j3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (a(b))
        {
            if (l2 != 0)
            {
                l1 = a(b, k1, ai, j3);
                i1 = j1;
            } else
            {
                i1 = b(b, j1, ai, j3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, p() - l1);
        ai[1] = Math.max(0, q() - (k3 - l3 - i1));
        k1 = Math.max(l1, p());
        l1 = Math.min(i1, k3 - l3 - q());
        j1 = l1;
        i1 = k1;
        if (a(a))
        {
            if (l2 != 0)
            {
                j1 = b(a, l1, ai, j3);
                i1 = k1;
            } else
            {
                i1 = a(a, k1, ai, j3);
                j1 = l1;
            }
        }
        if (a(f))
        {
            if (l2 != 0)
            {
                j1 = b(f, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(f, i1, ai, j3);
            }
        } else
        {
            k1 = i1;
        }
        flag = a(c);
        flag2 = a(d);
        i1 = 0;
        if (flag)
        {
            zz zz1 = (zz)c.getLayoutParams();
            i1 = zz1.topMargin;
            l1 = c.getMeasuredHeight();
            i1 = zz1.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            zz zz2 = (zz)d.getLayoutParams();
            l1 = zz2.topMargin;
            int j2 = d.getMeasuredHeight();
            i3 = zz2.bottomMargin + (l1 + j2) + i1;
        } else
        {
            i3 = i1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        l1 = j1;
        i1 = k1;
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            obj = c;
        } else
        {
            obj = d;
        }
        if (flag2)
        {
            obj1 = d;
        } else
        {
            obj1 = c;
        }
        obj = (zz)((View) (obj)).getLayoutParams();
        obj1 = (zz)((View) (obj1)).getLayoutParams();
        if (flag && c.getMeasuredWidth() > 0 || flag2 && d.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        u & 0x70;
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((zz) (obj)).topMargin + r)
        {
            i1 = ((zz) (obj)).topMargin + r;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((zz) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, i1 - ((((zz) (obj1)).bottomMargin + s) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (zz)c.getLayoutParams();
                l1 = j1 - c.getMeasuredWidth();
                l2 = c.getMeasuredHeight() + i1;
                c.layout(l1, i1, j1, l2);
                i3 = q;
                i1 = l2 + ((zz) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (zz)d.getLayoutParams();
                i1 = ((zz) (obj)).topMargin + i1;
                l2 = d.getMeasuredWidth();
                i3 = d.getMeasuredHeight();
                d.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = q;
                l2 = ((zz) (obj)).bottomMargin;
                i1 = j1 - i1;
            } else
            {
                i1 = j1;
            }
            if (flag1)
            {
                i1 = Math.min(l1, i1);
            } else
            {
                i1 = j1;
            }
            l1 = i1;
            i1 = k1;
        } else
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (zz)c.getLayoutParams();
                l2 = c.getMeasuredWidth() + k1;
                l1 = c.getMeasuredHeight() + i1;
                c.layout(k1, i1, l2, l1);
                i3 = q;
                i1 = ((zz) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (zz)d.getLayoutParams();
                l1 = i1 + ((zz) (obj)).topMargin;
                i1 = d.getMeasuredWidth() + k1;
                i3 = d.getMeasuredHeight();
                d.layout(k1, l1, i1, i3 + l1);
                l1 = q;
                i3 = ((zz) (obj)).bottomMargin;
                i3 = l1 + i1;
            } else
            {
                i3 = k1;
            }
            l1 = j1;
            i1 = k1;
            if (flag1)
            {
                i1 = Math.max(l2, i3);
                l1 = j1;
            }
        }
_L3:
        a(B, 3);
        k1 = B.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)B.get(j1), i1, ai, j3);
        }

        a(B, 5);
        k2 = B.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)B.get(k1), j1, ai, j3);
        }

        a(B, 1);
        obj = B;
        l2 = ai[0];
        k2 = ai[1];
        i3 = ((List) (obj)).size();
        l1 = 0;
        for (k1 = 0; l1 < i3; k1 += k4 + i4 + j4)
        {
            obj1 = (View)((List) (obj)).get(l1);
            zz3 = (zz)((View) (obj1)).getLayoutParams();
            l2 = zz3.leftMargin - l2;
            k2 = zz3.rightMargin - k2;
            i4 = Math.max(0, l2);
            j4 = Math.max(0, k2);
            l2 = Math.max(0, -l2);
            k2 = Math.max(0, -k2);
            k4 = ((View) (obj1)).getMeasuredWidth();
            l1++;
        }

        l1 = ((k3 - i2 - l3) / 2 + i2) - k1 / 2;
        k1 = l1 + k1;
          goto _L7
_L5:
        i1 = getPaddingTop();
        i1 = ((zz) (obj)).topMargin + i1 + r;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = j4 - k4 - ((zz) (obj1)).bottomMargin - s - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = B.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)B.get(i1), j1, ai, j3);
        }

        break; /* Loop/switch isn't completed */
_L10:
        i1 = l1;
        if (k1 > j1)
        {
            i1 = l1 - (k1 - j1);
        }
        if (true) goto _L9; else goto _L11
_L11:
        B.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = D;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (vp.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (a(e))
        {
            a(e, i1, 0, j1, o);
            k1 = e.getMeasuredWidth() + b(e);
            j2 = Math.max(0, e.getMeasuredHeight() + c(e));
            i2 = vp.a(0, kb.j(e));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(i))
        {
            a(i, i1, 0, j1, o);
            i3 = i.getMeasuredWidth() + b(i);
            l1 = Math.max(j2, i.getMeasuredHeight() + c(i));
            k1 = vp.a(i2, kb.j(i));
        }
        i2 = n();
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(b))
        {
            a(b, i1, k3, j1, o);
            l2 = b.getMeasuredWidth() + b(b);
            j2 = Math.max(l1, b.getMeasuredHeight() + c(b));
            i2 = vp.a(k1, kb.j(b));
        }
        k1 = o();
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(a))
        {
            k2 = i3 + a(a, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, a.getMeasuredHeight() + c(a));
            k1 = vp.a(i2, kb.j(a));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (a(f))
        {
            i2 = k2 + a(f, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, f.getMeasuredHeight() + c(f));
            l2 = vp.a(k1, kb.j(f));
        }
        i3 = getChildCount();
        k2 = 0;
        k1 = l2;
        l1 = j2;
        j2 = k2;
        l2 = i2;
        while (j2 < i3) 
        {
            View view1 = getChildAt(j2);
            View view;
            int j3;
            int l3;
            int i4;
            int j4;
            if (((zz)view1.getLayoutParams()).b == 0 && a(view1))
            {
                l2 += a(view1, i1, l2, j1, 0, ai);
                i2 = Math.max(l1, view1.getMeasuredHeight() + c(view1));
                l1 = vp.a(k1, kb.j(view1));
                k1 = i2;
            } else
            {
                i2 = l1;
                l1 = k1;
                k1 = i2;
            }
            j2++;
            i2 = k1;
            k1 = l1;
            l1 = i2;
        }
        k2 = 0;
        j2 = 0;
        i4 = r + s;
        j4 = p + q;
        i2 = k1;
        if (a(c))
        {
            a(c, i1, l2 + j4, j1, i4, ai);
            i2 = c.getMeasuredWidth();
            k2 = b(c) + i2;
            j2 = c.getMeasuredHeight() + c(c);
            i2 = vp.a(k1, kb.j(c));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(d))
        {
            j3 = Math.max(k2, a(d, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (d.getMeasuredHeight() + c(d));
            k1 = vp.a(i2, kb.j(d));
        }
        i2 = Math.max(l1, l3);
        l1 = getPaddingLeft();
        l3 = getPaddingRight();
        j2 = getPaddingTop();
        k2 = getPaddingBottom();
        l1 = kb.a(Math.max(j3 + l2 + (l1 + l3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        j1 = kb.a(Math.max(i2 + (j2 + k2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (L) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L4:
        if (i1 != 0)
        {
            j1 = 0;
        }
        setMeasuredDimension(l1, j1);
        return;
_L2:
        k1 = getChildCount();
        i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            view = getChildAt(i1);
            if (a(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
            {
                i1 = 0;
                continue; /* Loop/switch isn't completed */
            }
            i1++;
        } while (true);
        i1 = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        aaa aaa1 = (aaa)parcelable;
        super.onRestoreInstanceState(aaa1.getSuperState());
        if (b != null)
        {
            parcelable = b.e();
        } else
        {
            parcelable = null;
        }
        if (aaa1.a != 0 && I != null && parcelable != null)
        {
            parcelable = parcelable.findItem(aaa1.a);
            if (parcelable != null)
            {
                ja.b(parcelable);
            }
        }
        if (aaa1.b)
        {
            removeCallbacks(M);
            post(M);
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        uz uz1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        uz1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        aaa aaa1 = new aaa(super.onSaveInstanceState());
        if (I != null && I.b != null)
        {
            aaa1.a = I.b.getItemId();
        }
        aaa1.b = b();
        return aaa1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = jg.a(motionevent);
        if (i1 == 0)
        {
            z = false;
        }
        if (!z)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                z = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            z = false;
        }
        return true;
    }

    public int p()
    {
        return t.a();
    }

    public int q()
    {
        return t.b();
    }

    public zz r()
    {
        return new zz();
    }

    public ut s()
    {
        if (G == null)
        {
            G = new vl(this, true);
        }
        return G;
    }

    public void t()
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (((zz)view.getLayoutParams()).b != 2 && view != b)
            {
                removeViewAt(i1);
                C.add(view);
            }
        }

    }

    public void u()
    {
        for (int i1 = C.size() - 1; i1 >= 0; i1--)
        {
            addView((View)C.get(i1));
        }

        C.clear();
    }
}
