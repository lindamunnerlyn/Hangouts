// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aaa;
import aab;
import aac;
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
import pr;
import rq;
import ta;
import tb;
import te;
import tq;
import uv;
import vb;
import vk;
import vm;
import vn;
import vr;
import vw;
import wi;
import zx;
import zy;
import zz;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView

public class Toolbar extends ViewGroup
{

    private boolean A;
    private boolean B;
    private final ArrayList C;
    private final ArrayList D;
    private final int E[];
    private final wi F;
    private vn G;
    private vw H;
    private aaa I;
    private tq J;
    private tb K;
    private boolean L;
    private final Runnable M;
    private final vk N;
    public ImageButton a;
    public View b;
    public int c;
    public wi d;
    private ActionMenuView e;
    private TextView f;
    private TextView g;
    private ImageButton h;
    private ImageView i;
    private Drawable j;
    private CharSequence k;
    private Context l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final vb u;
    private int v;
    private CharSequence w;
    private CharSequence x;
    private int y;
    private int z;

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
        u = new vb();
        v = 0x800013;
        C = new ArrayList();
        D = new ArrayList();
        E = new int[2];
        F = new zx(this);
        M = new zy(this);
        context = vm.a(getContext(), attributeset, rq.cb, i1);
        n = context.f(rq.cy, 0);
        o = context.f(rq.cq, 0);
        v = context.b(rq.cc, v);
        c = 48;
        i1 = context.c(rq.cx, 0);
        t = i1;
        s = i1;
        r = i1;
        q = i1;
        i1 = context.c(rq.cv, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(rq.cu, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(rq.cw, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        i1 = context.c(rq.ct, -1);
        if (i1 >= 0)
        {
            t = i1;
        }
        p = context.d(rq.cl, -1);
        i1 = context.c(rq.ci, 0x80000000);
        int j1 = context.c(rq.cf, 0x80000000);
        int k1 = context.d(rq.cg, 0);
        int l1 = context.d(rq.ch, 0);
        u.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            u.a(i1, j1);
        }
        j = context.a(rq.ce);
        k = context.c(rq.cd);
        attributeset = context.c(rq.cs);
        if (!TextUtils.isEmpty(attributeset))
        {
            b(attributeset);
        }
        attributeset = context.c(rq.cp);
        if (!TextUtils.isEmpty(attributeset))
        {
            c(attributeset);
        }
        l = getContext();
        a(context.f(rq.co, 0));
        attributeset = context.a(rq.cn);
        if (attributeset != null)
        {
            b(attributeset);
        }
        attributeset = context.c(rq.cm);
        if (!TextUtils.isEmpty(attributeset))
        {
            d(attributeset);
        }
        attributeset = context.a(rq.cj);
        if (attributeset != null)
        {
            a(attributeset);
        }
        attributeset = context.c(rq.ck);
        if (!TextUtils.isEmpty(attributeset))
        {
            a(attributeset);
        }
        if (context.g(rq.cz))
        {
            b(context.f(rq.cz));
        }
        if (context.g(rq.cr))
        {
            c(context.f(rq.cr));
        }
        context.b();
        N = context.c();
    }

    private int a(View view, int i1)
    {
        aab aab1;
        int j1;
        int k1;
        int l1;
        int i2;
        aab1 = (aab)view.getLayoutParams();
        l1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (l1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        k1 = aab1.a & 0x70;
        j1 = k1;
        k1;
        JVM INSTR lookupswitch 3: default 76
    //                   16: 85
    //                   48: 85
    //                   80: 85;
           goto _L1 _L2 _L2 _L2
_L1:
        j1 = v & 0x70;
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
        if (i1 >= aab1.topMargin) goto _L7; else goto _L6
_L6:
        i1 = aab1.topMargin;
_L9:
        return i1 + j1;
_L4:
        return getPaddingTop() - i1;
_L5:
        return getHeight() - getPaddingBottom() - l1 - aab1.bottomMargin - i1;
_L7:
        k1 = i2 - k1 - l1 - i1 - j1;
        if (k1 < aab1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (aab1.bottomMargin - k1));
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
        aab aab1 = (aab)view.getLayoutParams();
        int k1 = aab1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return aab1.rightMargin + k1 + i1;
    }

    public static void a(Toolbar toolbar)
    {
        if (toolbar.a == null)
        {
            toolbar.a = new ImageButton(toolbar.getContext(), null, g.P);
            toolbar.a.setImageDrawable(toolbar.j);
            toolbar.a.setContentDescription(toolbar.k);
            aab aab1 = toolbar.r();
            aab1.a = 0x800003 | toolbar.c & 0x70;
            aab1.b = 2;
            toolbar.a.setLayoutParams(aab1);
            toolbar.a.setOnClickListener(new zz(toolbar));
        }
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
            obj = (aab)obj;
        }
        obj.b = 1;
        if (flag && b != null)
        {
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            D.add(view);
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
        if (kb.i(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = ih.a(i1, kb.i(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                aab aab1 = (aab)view.getLayoutParams();
                if (aab1.b == 0 && a(view) && f(aab1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                aab aab2 = (aab)view1.getLayoutParams();
                if (aab2.b == 0 && a(view1) && f(aab2.a) == j1)
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
        aab aab1 = (aab)view.getLayoutParams();
        int k1 = aab1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (aab1.leftMargin + k1);
    }

    private static int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    private boolean d(View view)
    {
        return view.getParent() == this || D.contains(view);
    }

    private int f(int i1)
    {
label0:
        {
            int k1 = kb.i(this);
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
        if (i == null)
        {
            i = new ImageView(getContext());
        }
    }

    private void w()
    {
        if (e == null)
        {
            e = new ActionMenuView(getContext());
            e.a(m);
            e.a(F);
            e.a(J, K);
            aab aab1 = r();
            aab1.a = 0x800005 | c & 0x70;
            e.setLayoutParams(aab1);
            a(e, false);
        }
    }

    private void x()
    {
        if (h == null)
        {
            h = new ImageButton(getContext(), null, g.P);
            aab aab1 = r();
            aab1.a = 0x800003 | c & 0x70;
            h.setLayoutParams(aab1);
        }
    }

    public aab a(AttributeSet attributeset)
    {
        return new aab(getContext(), attributeset);
    }

    protected aab a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof aab)
        {
            return new aab((aab)layoutparams);
        }
        if (layoutparams instanceof pr)
        {
            return new aab((pr)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new aab((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new aab(layoutparams);
        }
    }

    public void a(int i1)
    {
label0:
        {
            if (m != i1)
            {
                m = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                l = getContext();
            }
            return;
        }
        l = new ContextThemeWrapper(getContext(), i1);
    }

    public void a(int i1, int j1)
    {
        u.a(i1, j1);
    }

    public void a(Context context, int i1)
    {
        n = i1;
        if (f != null)
        {
            f.setTextAppearance(context, i1);
        }
    }

    public void a(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        v();
        if (!d(i))
        {
            a(((View) (i)), true);
        }
_L4:
        if (i != null)
        {
            i.setImageDrawable(drawable);
        }
        return;
_L2:
        if (i != null && d(i))
        {
            removeView(i);
            D.remove(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        x();
        h.setOnClickListener(onclicklistener);
    }

    public void a(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            v();
        }
        if (i != null)
        {
            i.setContentDescription(charsequence);
        }
    }

    public void a(ta ta1, vw vw1)
    {
        if (ta1 != null || e != null)
        {
            w();
            ta ta2 = e.e();
            if (ta2 != ta1)
            {
                if (ta2 != null)
                {
                    ta2.b(H);
                    ta2.b(I);
                }
                if (I == null)
                {
                    I = new aaa(this);
                }
                vw1.c(true);
                if (ta1 != null)
                {
                    ta1.a(vw1, l);
                    ta1.a(I, l);
                } else
                {
                    vw1.a(l, null);
                    I.a(l, null);
                    vw1.b(true);
                    I.b(true);
                }
                e.a(m);
                e.a(vw1);
                H = vw1;
                return;
            }
        }
    }

    public void a(tq tq, tb tb)
    {
        J = tq;
        K = tb;
    }

    public void a(wi wi)
    {
        d = wi;
    }

    public void a(boolean flag)
    {
        L = flag;
        requestLayout();
    }

    public boolean a()
    {
        return getVisibility() == 0 && e != null && e.a();
    }

    public void b(int i1)
    {
        y = i1;
        if (f != null)
        {
            f.setTextColor(i1);
        }
    }

    public void b(Context context, int i1)
    {
        o = i1;
        if (g != null)
        {
            g.setTextAppearance(context, i1);
        }
    }

    public void b(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        x();
        if (!d(h))
        {
            a(h, true);
        }
_L4:
        if (h != null)
        {
            h.setImageDrawable(drawable);
        }
        return;
_L2:
        if (h != null && d(h))
        {
            removeView(h);
            D.remove(h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            Context context = getContext();
            f = new TextView(context);
            f.setSingleLine();
            f.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (n != 0)
            {
                f.setTextAppearance(context, n);
            }
            if (y != 0)
            {
                f.setTextColor(y);
            }
        }
        if (!d(f))
        {
            a(f, true);
        }
_L4:
        if (f != null)
        {
            f.setText(charsequence);
        }
        w = charsequence;
        return;
_L2:
        if (f != null && d(f))
        {
            removeView(f);
            D.remove(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        return e != null && e.h();
    }

    public void c(int i1)
    {
        z = i1;
        if (g != null)
        {
            g.setTextColor(i1);
        }
    }

    public void c(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            Context context = getContext();
            g = new TextView(context);
            g.setSingleLine();
            g.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (o != 0)
            {
                g.setTextAppearance(context, o);
            }
            if (z != 0)
            {
                g.setTextColor(z);
            }
        }
        if (!d(g))
        {
            a(g, true);
        }
_L4:
        if (g != null)
        {
            g.setText(charsequence);
        }
        x = charsequence;
        return;
_L2:
        if (g != null && d(g))
        {
            removeView(g);
            D.remove(g);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean c()
    {
        return e != null && e.i();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof aab);
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
        if (h != null)
        {
            h.setContentDescription(charsequence);
        }
    }

    public boolean d()
    {
        return e != null && e.f();
    }

    public void e(int i1)
    {
        b(N.a(i1));
    }

    public boolean e()
    {
        return e != null && e.g();
    }

    public void f()
    {
        if (e != null)
        {
            e.j();
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
        te te1;
        if (I == null)
        {
            te1 = null;
        } else
        {
            te1 = I.b;
        }
        if (te1 != null)
        {
            te1.collapseActionView();
        }
    }

    public CharSequence i()
    {
        return w;
    }

    public CharSequence j()
    {
        return x;
    }

    public CharSequence k()
    {
        if (h != null)
        {
            return h.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable l()
    {
        if (h != null)
        {
            return h.getDrawable();
        } else
        {
            return null;
        }
    }

    public Menu m()
    {
        w();
        if (e.e() == null)
        {
            ta ta1 = (ta)e.d();
            if (I == null)
            {
                I = new aaa(this);
            }
            e.k();
            ta1.a(I, l);
        }
        return e.d();
    }

    public int n()
    {
        return u.c();
    }

    public int o()
    {
        return u.d();
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
            B = false;
        }
        if (!B)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i1 == 9 && !flag)
            {
                B = true;
            }
        }
        if (i1 == 10 || i1 == 3)
        {
            B = false;
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
        if (kb.i(this) == 1)
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
        ai = E;
        ai[1] = 0;
        ai[0] = 0;
        j3 = kb.o(this);
        aab aab3;
        int k2;
        if (a(h))
        {
            if (l2 != 0)
            {
                l1 = b(h, l1, ai, j3);
                i1 = i2;
            } else
            {
                i1 = a(h, i2, ai, j3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (a(a))
        {
            if (l2 != 0)
            {
                j1 = b(a, l1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(a, i1, ai, j3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (a(e))
        {
            if (l2 != 0)
            {
                l1 = a(e, k1, ai, j3);
                i1 = j1;
            } else
            {
                i1 = b(e, j1, ai, j3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, p() - l1);
        ai[1] = Math.max(0, q() - (k3 - l3 - i1));
        k1 = Math.max(l1, p());
        l1 = Math.min(i1, k3 - l3 - q());
        j1 = l1;
        i1 = k1;
        if (a(b))
        {
            if (l2 != 0)
            {
                j1 = b(b, l1, ai, j3);
                i1 = k1;
            } else
            {
                i1 = a(b, k1, ai, j3);
                j1 = l1;
            }
        }
        if (a(i))
        {
            if (l2 != 0)
            {
                j1 = b(i, j1, ai, j3);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, j3);
            }
        } else
        {
            k1 = i1;
        }
        flag = a(f);
        flag2 = a(g);
        i1 = 0;
        if (flag)
        {
            aab aab1 = (aab)f.getLayoutParams();
            i1 = aab1.topMargin;
            l1 = f.getMeasuredHeight();
            i1 = aab1.bottomMargin + (i1 + l1) + 0;
        }
        if (flag2)
        {
            aab aab2 = (aab)g.getLayoutParams();
            l1 = aab2.topMargin;
            int j2 = g.getMeasuredHeight();
            i3 = aab2.bottomMargin + (l1 + j2) + i1;
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
            obj = f;
        } else
        {
            obj = g;
        }
        if (flag2)
        {
            obj1 = g;
        } else
        {
            obj1 = f;
        }
        obj = (aab)((View) (obj)).getLayoutParams();
        obj1 = (aab)((View) (obj1)).getLayoutParams();
        if (flag && f.getMeasuredWidth() > 0 || flag2 && g.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        v & 0x70;
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (j4 - i4 - k4 - i3) / 2;
        if (i1 < ((aab) (obj)).topMargin + s)
        {
            i1 = ((aab) (obj)).topMargin + s;
        } else
        {
            l1 = j4 - k4 - i3 - i1 - i4;
            if (l1 < ((aab) (obj)).bottomMargin + t)
            {
                i1 = Math.max(0, i1 - ((((aab) (obj1)).bottomMargin + t) - l1));
            }
        }
        i1 = i4 + i1;
_L8:
        if (l2 != 0)
        {
            if (flag1)
            {
                l1 = q;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (aab)f.getLayoutParams();
                l1 = j1 - f.getMeasuredWidth();
                l2 = f.getMeasuredHeight() + i1;
                f.layout(l1, i1, j1, l2);
                i3 = r;
                i1 = l2 + ((aab) (obj)).bottomMargin;
                l1 -= i3;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (aab)g.getLayoutParams();
                i1 = ((aab) (obj)).topMargin + i1;
                l2 = g.getMeasuredWidth();
                i3 = g.getMeasuredHeight();
                g.layout(j1 - l2, i1, j1, i3 + i1);
                i1 = r;
                l2 = ((aab) (obj)).bottomMargin;
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
                l1 = q;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (aab)f.getLayoutParams();
                l2 = f.getMeasuredWidth() + k1;
                l1 = f.getMeasuredHeight() + i1;
                f.layout(k1, i1, l2, l1);
                i3 = r;
                i1 = ((aab) (obj)).bottomMargin;
                l2 += i3;
                i1 += l1;
            } else
            {
                l2 = k1;
            }
            if (flag2)
            {
                obj = (aab)g.getLayoutParams();
                l1 = i1 + ((aab) (obj)).topMargin;
                i1 = g.getMeasuredWidth() + k1;
                i3 = g.getMeasuredHeight();
                g.layout(k1, l1, i1, i3 + l1);
                l1 = r;
                i3 = ((aab) (obj)).bottomMargin;
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
        a(C, 3);
        k1 = C.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)C.get(j1), i1, ai, j3);
        }

        a(C, 5);
        k2 = C.size();
        k1 = 0;
        j1 = l1;
        for (; k1 < k2; k1++)
        {
            j1 = b((View)C.get(k1), j1, ai, j3);
        }

        a(C, 1);
        obj = C;
        l2 = ai[0];
        k2 = ai[1];
        i3 = ((List) (obj)).size();
        l1 = 0;
        for (k1 = 0; l1 < i3; k1 += k4 + i4 + j4)
        {
            obj1 = (View)((List) (obj)).get(l1);
            aab3 = (aab)((View) (obj1)).getLayoutParams();
            l2 = aab3.leftMargin - l2;
            k2 = aab3.rightMargin - k2;
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
        i1 = ((aab) (obj)).topMargin + i1 + s;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = j4 - k4 - ((aab) (obj1)).bottomMargin - t - i3;
          goto _L8
_L7:
        if (l1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = C.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)C.get(i1), j1, ai, j3);
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
        C.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int ai[] = E;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int k3;
        if (vr.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (a(h))
        {
            a(h, i1, 0, j1, p);
            k1 = h.getMeasuredWidth() + b(h);
            j2 = Math.max(0, h.getMeasuredHeight() + c(h));
            i2 = vr.a(0, kb.k(h));
        } else
        {
            i2 = 0;
            j2 = 0;
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (a(a))
        {
            a(a, i1, 0, j1, p);
            i3 = a.getMeasuredWidth() + b(a);
            l1 = Math.max(j2, a.getMeasuredHeight() + c(a));
            k1 = vr.a(i2, kb.k(a));
        }
        i2 = n();
        k3 = Math.max(i2, i3) + 0;
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (a(e))
        {
            a(e, i1, k3, j1, p);
            l2 = e.getMeasuredWidth() + b(e);
            j2 = Math.max(l1, e.getMeasuredHeight() + c(e));
            i2 = vr.a(k1, kb.k(e));
        }
        k1 = o();
        i3 = k3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        k2 = i3;
        k1 = i2;
        l1 = j2;
        if (a(b))
        {
            k2 = i3 + a(b, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, b.getMeasuredHeight() + c(b));
            k1 = vr.a(i2, kb.k(b));
        }
        i2 = k2;
        l2 = k1;
        j2 = l1;
        if (a(i))
        {
            i2 = k2 + a(i, i1, k2, j1, 0, ai);
            j2 = Math.max(l1, i.getMeasuredHeight() + c(i));
            l2 = vr.a(k1, kb.k(i));
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
            if (((aab)view1.getLayoutParams()).b == 0 && a(view1))
            {
                l2 += a(view1, i1, l2, j1, 0, ai);
                i2 = Math.max(l1, view1.getMeasuredHeight() + c(view1));
                l1 = vr.a(k1, kb.k(view1));
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
        i4 = s + t;
        j4 = q + r;
        i2 = k1;
        if (a(f))
        {
            a(f, i1, l2 + j4, j1, i4, ai);
            i2 = f.getMeasuredWidth();
            k2 = b(f) + i2;
            j2 = f.getMeasuredHeight() + c(f);
            i2 = vr.a(k1, kb.k(f));
        }
        l3 = j2;
        j3 = k2;
        k1 = i2;
        if (a(g))
        {
            j3 = Math.max(k2, a(g, i1, l2 + j4, j1, i4 + j2, ai));
            l3 = j2 + (g.getMeasuredHeight() + c(g));
            k1 = vr.a(i2, kb.k(g));
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
        aac aac1 = (aac)parcelable;
        super.onRestoreInstanceState(aac1.getSuperState());
        if (e != null)
        {
            parcelable = e.e();
        } else
        {
            parcelable = null;
        }
        if (aac1.a != 0 && I != null && parcelable != null)
        {
            parcelable = parcelable.findItem(aac1.a);
            if (parcelable != null)
            {
                ja.b(parcelable);
            }
        }
        if (aac1.b)
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
        vb vb1 = u;
        if (i1 != 1)
        {
            flag = false;
        }
        vb1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        aac aac1 = new aac(super.onSaveInstanceState());
        if (I != null && I.b != null)
        {
            aac1.a = I.b.getItemId();
        }
        aac1.b = b();
        return aac1;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = jg.a(motionevent);
        if (i1 == 0)
        {
            A = false;
        }
        if (!A)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                A = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            A = false;
        }
        return true;
    }

    public int p()
    {
        return u.a();
    }

    public int q()
    {
        return u.b();
    }

    public aab r()
    {
        return new aab();
    }

    public uv s()
    {
        if (G == null)
        {
            G = new vn(this, true);
        }
        return G;
    }

    public void t()
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            if (((aab)view.getLayoutParams()).b != 2 && view != e)
            {
                removeViewAt(i1);
                D.add(view);
            }
        }

    }

    public void u()
    {
        for (int i1 = D.size() - 1; i1 >= 0; i1--)
        {
            addView((View)D.get(i1));
        }

        D.clear();
    }
}
