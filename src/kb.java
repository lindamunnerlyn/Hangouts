// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewParent;

public final class kb
{

    static final km a;

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static mh a(View view, mh mh)
    {
        return a.a(view, mh);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, ColorStateList colorstatelist)
    {
        a.a(view, colorstatelist);
    }

    public static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        a.a(view, mode);
    }

    public static void a(View view, hp hp)
    {
        a.a(view, hp);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, jp jp)
    {
        a.a(view, jp);
    }

    public static void a(View view, boolean flag)
    {
        a.c(view, flag);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static boolean b(View view)
    {
        return a.b(view);
    }

    public static boolean b(View view, int i1)
    {
        return a.b(view, i1);
    }

    public static void c(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void c(View view, int i1)
    {
        a.c(view, i1);
    }

    public static boolean c(View view)
    {
        return a.c(view);
    }

    public static void d(View view)
    {
        a.a(view, true);
    }

    public static void d(View view, float f1)
    {
        a.d(view, f1);
    }

    public static void d(View view, int i1)
    {
        a.a(view, i1, null);
    }

    public static void e(View view)
    {
        a.d(view);
    }

    public static void e(View view, float f1)
    {
        a.e(view, f1);
    }

    public static void e(View view, int i1)
    {
        a.d(view, i1);
    }

    public static int f(View view)
    {
        return a.e(view);
    }

    public static void f(View view, float f1)
    {
        a.f(view, f1);
    }

    public static float g(View view)
    {
        return a.f(view);
    }

    public static int h(View view)
    {
        return a.g(view);
    }

    public static int i(View view)
    {
        return a.h(view);
    }

    public static ViewParent j(View view)
    {
        return a.i(view);
    }

    public static int k(View view)
    {
        return a.j(view);
    }

    public static float l(View view)
    {
        return a.l(view);
    }

    public static float m(View view)
    {
        return a.m(view);
    }

    public static int n(View view)
    {
        return a.n(view);
    }

    public static int o(View view)
    {
        return a.o(view);
    }

    public static lr p(View view)
    {
        return a.p(view);
    }

    public static float q(View view)
    {
        return a.s(view);
    }

    public static int r(View view)
    {
        return a.q(view);
    }

    public static void s(View view)
    {
        a.r(view);
    }

    public static boolean t(View view)
    {
        return a.t(view);
    }

    public static void u(View view)
    {
        a.u(view);
    }

    public static void v(View view)
    {
        a.b(view, false);
    }

    public static boolean w(View view)
    {
        return a.k(view);
    }

    public static void x(View view)
    {
        a.v(view);
    }

    public static boolean y(View view)
    {
        return a.w(view);
    }

    public static boolean z(View view)
    {
        return a.x(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new kl();
        } else
        if (i1 >= 19)
        {
            a = new kk();
        } else
        if (i1 >= 17)
        {
            a = new ki();
        } else
        if (i1 >= 16)
        {
            a = new kh();
        } else
        if (i1 >= 14)
        {
            a = new kg();
        } else
        if (i1 >= 11)
        {
            a = new kf();
        } else
        if (i1 >= 9)
        {
            a = new ke();
        } else
        if (i1 >= 7)
        {
            a = new kd();
        } else
        {
            a = new kc();
        }
    }
}
