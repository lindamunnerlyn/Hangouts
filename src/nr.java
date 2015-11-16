// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class nr
    implements android.view.View.OnTouchListener
{

    private static final int r = ViewConfiguration.getTapTimeout();
    private final ns a = new ns();
    private final Interpolator b = new AccelerateInterpolator();
    private final View c;
    private Runnable d;
    private float e[] = {
        0.0F, 0.0F
    };
    private float f[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private int g;
    private int h;
    private float i[] = {
        0.0F, 0.0F
    };
    private float j[] = {
        0.0F, 0.0F
    };
    private float k[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    public nr(View view)
    {
        c = view;
        view = Resources.getSystem().getDisplayMetrics();
        int i1 = (int)(1575F * ((DisplayMetrics) (view)).density + 0.5F);
        int j1 = (int)(((DisplayMetrics) (view)).density * 315F + 0.5F);
        a(i1, i1);
        b(j1, j1);
        b();
        d();
        c();
        a();
        a(r);
        e();
        f();
    }

    static float a(float f1)
    {
        return a(f1, 0.0F, 1.0F);
    }

    private static float a(float f1, float f2, float f3)
    {
        if (f1 > f3)
        {
            return f3;
        }
        if (f1 < f2)
        {
            return f2;
        } else
        {
            return f1;
        }
    }

    private float a(int i1, float f1, float f2, float f3)
    {
        float f4 = a(e[i1] * f2, 0.0F, f[i1]);
        float f6 = c(f1, f4);
        f1 = c(f2 - f1, f4) - f6;
        if (f1 >= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = -b.getInterpolation(-f1);
_L6:
        f1 = a(f1, -1F, 1.0F);
_L4:
        if (f1 == 0.0F)
        {
            return 0.0F;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (f1 > 0.0F)
        {
            f1 = b.getInterpolation(f1);
            continue; /* Loop/switch isn't completed */
        }
        f1 = 0.0F;
        if (true) goto _L4; else goto _L3
_L3:
        float f7 = i[i1];
        f2 = j[i1];
        float f5 = k[i1];
        f3 = f7 * f3;
        if (f1 > 0.0F)
        {
            return a(f1 * f3, f2, f5);
        }
        return -a(-f1 * f3, f2, f5);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int a(int i1, int j1)
    {
        if (i1 > j1)
        {
            return j1;
        }
        if (i1 < 0)
        {
            return 0;
        } else
        {
            return i1;
        }
    }

    static boolean a(nr nr1)
    {
        return nr1.o;
    }

    static boolean b(nr nr1)
    {
        return nr1.m;
    }

    private float c(float f1, float f2)
    {
        if (f2 != 0.0F) goto _L2; else goto _L1
_L1:
        return 0.0F;
_L2:
        g;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 42
    //                   2 77;
           goto _L3 _L4 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return 0.0F;
_L4:
        if (f1 >= f2) goto _L1; else goto _L6
_L6:
        if (f1 >= 0.0F)
        {
            return 1.0F - f1 / f2;
        }
        if (!o || g != 1) goto _L1; else goto _L7
_L7:
        return 1.0F;
        if (f1 >= 0.0F) goto _L1; else goto _L8
_L8:
        return f1 / -f2;
    }

    static boolean c(nr nr1)
    {
        nr1.m = false;
        return false;
    }

    static ns d(nr nr1)
    {
        return nr1.a;
    }

    static boolean e(nr nr1)
    {
        return nr1.g();
    }

    static boolean f(nr nr1)
    {
        nr1.o = false;
        return false;
    }

    private boolean g()
    {
        ns ns1 = a;
        int i1 = ns1.f();
        int j1 = ns1.e();
        if (i1 == 0 || !c(i1))
        {
            if (j1 == 0);
            return false;
        } else
        {
            return true;
        }
    }

    static boolean g(nr nr1)
    {
        return nr1.n;
    }

    private void h()
    {
        if (m)
        {
            o = false;
            return;
        } else
        {
            a.b();
            return;
        }
    }

    static boolean h(nr nr1)
    {
        nr1.n = false;
        return false;
    }

    static void i(nr nr1)
    {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        nr1.c.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    static View j(nr nr1)
    {
        return nr1.c;
    }

    public nr a()
    {
        i[0] = 0.001F;
        i[1] = 0.001F;
        return this;
    }

    public nr a(float f1, float f2)
    {
        k[0] = f1 / 1000F;
        k[1] = f2 / 1000F;
        return this;
    }

    public nr a(int i1)
    {
        h = i1;
        return this;
    }

    public nr a(boolean flag)
    {
        if (p && !flag)
        {
            h();
        }
        p = flag;
        return this;
    }

    public nr b()
    {
        g = 1;
        return this;
    }

    public nr b(float f1, float f2)
    {
        j[0] = f1 / 1000F;
        j[1] = f2 / 1000F;
        return this;
    }

    public abstract void b(int i1);

    public nr c()
    {
        e[0] = 0.2F;
        e[1] = 0.2F;
        return this;
    }

    public abstract boolean c(int i1);

    public nr d()
    {
        f[0] = 3.402823E+38F;
        f[1] = 3.402823E+38F;
        return this;
    }

    public nr e()
    {
        a.a(500);
        return this;
    }

    public nr f()
    {
        a.b(500);
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (p) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        jg.a(motionevent);
        JVM INSTR tableswitch 0 3: default 44
    //                   0 60
    //                   1 220
    //                   2 70
    //                   3 220;
           goto _L3 _L4 _L5 _L6 _L5
_L5:
        break MISSING_BLOCK_LABEL_220;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        if (q && o)
        {
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        n = true;
        l = false;
_L6:
        float f1 = a(0, motionevent.getX(), view.getWidth(), c.getWidth());
        float f2 = a(1, motionevent.getY(), view.getHeight(), c.getHeight());
        a.a(f1, f2);
        if (!o && g())
        {
            if (d == null)
            {
                d = new nt(this);
            }
            o = true;
            m = true;
            if (!l && h > 0)
            {
                kb.a(c, d, h);
            } else
            {
                d.run();
            }
            l = true;
        }
          goto _L8
        h();
          goto _L8
    }

}
