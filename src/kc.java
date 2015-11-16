// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

class kc
    implements km
{

    WeakHashMap a;

    kc()
    {
        a = null;
    }

    public int a(int i1, int j1, int k1)
    {
        return View.resolveSize(i1, j1);
    }

    public int a(View view)
    {
        return 2;
    }

    long a()
    {
        return 10L;
    }

    public mh a(View view, mh mh)
    {
        return mh;
    }

    public void a(View view, float f1)
    {
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, ColorStateList colorstatelist)
    {
        if (view instanceof jw)
        {
            ((jw)view).a(colorstatelist);
        }
    }

    public void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        if (view instanceof jw)
        {
            ((jw)view).a(mode);
        }
    }

    public void a(View view, hp hp)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long l1)
    {
        view.postDelayed(runnable, a() + l1);
    }

    public void a(View view, jp jp)
    {
    }

    public void a(View view, boolean flag)
    {
    }

    public boolean a(View view, int i1)
    {
        if (!(view instanceof jv)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (jv)view;
        j1 = view.computeHorizontalScrollOffset();
        k1 = view.computeHorizontalScrollRange() - view.computeHorizontalScrollExtent();
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 >= 0) goto _L6; else goto _L5
_L5:
        if (j1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L7:
        if (i1 != 0)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (j1 < k1 - 1)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public void b(View view, float f1)
    {
    }

    public void b(View view, boolean flag)
    {
    }

    public boolean b(View view)
    {
        return false;
    }

    public boolean b(View view, int i1)
    {
        if (!(view instanceof jv)) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        view = (jv)view;
        j1 = view.computeVerticalScrollOffset();
        k1 = view.computeVerticalScrollRange() - view.computeVerticalScrollExtent();
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if (i1 >= 0) goto _L6; else goto _L5
_L5:
        if (j1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L7:
        if (i1 != 0)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (j1 < k1 - 1)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    public void c(View view, float f1)
    {
    }

    public void c(View view, int i1)
    {
    }

    public void c(View view, boolean flag)
    {
    }

    public boolean c(View view)
    {
        return false;
    }

    public void d(View view)
    {
        view.invalidate();
    }

    public void d(View view, float f1)
    {
    }

    public void d(View view, int i1)
    {
    }

    public int e(View view)
    {
        return 0;
    }

    public void e(View view, float f1)
    {
    }

    public float f(View view)
    {
        return 1.0F;
    }

    public void f(View view, float f1)
    {
    }

    public int g(View view)
    {
        return 0;
    }

    public int h(View view)
    {
        return 0;
    }

    public ViewParent i(View view)
    {
        return view.getParent();
    }

    public int j(View view)
    {
        return 0;
    }

    public boolean k(View view)
    {
        return true;
    }

    public float l(View view)
    {
        return 0.0F;
    }

    public float m(View view)
    {
        return 0.0F;
    }

    public int n(View view)
    {
        return g.b(view);
    }

    public int o(View view)
    {
        return g.c(view);
    }

    public lr p(View view)
    {
        return new lr(view);
    }

    public int q(View view)
    {
        return 0;
    }

    public void r(View view)
    {
    }

    public float s(View view)
    {
        return 0.0F;
    }

    public boolean t(View view)
    {
        return false;
    }

    public void u(View view)
    {
    }

    public void v(View view)
    {
        if (view instanceof jl)
        {
            ((jl)view).stopNestedScroll();
        }
    }

    public boolean w(View view)
    {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public boolean x(View view)
    {
        return view.getWindowToken() != null;
    }
}
