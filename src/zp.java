// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class zp
    implements Runnable
{

    final yr a;
    private int b;
    private int c;
    private pe d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public zp(yr yr1)
    {
        a = yr1;
        super();
        e = yr.y();
        f = false;
        g = false;
        d = pe.a(yr1.getContext(), yr.y());
    }

    void a()
    {
        if (f)
        {
            g = true;
            return;
        } else
        {
            a.removeCallbacks(this);
            kb.a(a, this);
            return;
        }
    }

    public void a(int i, int j)
    {
        yr.b(a, 2);
        c = 0;
        b = 0;
        d.a(i, j, 0x80000000, 0x7fffffff);
        a();
    }

    public void a(int i, int j, int k)
    {
        a(i, j, k, yr.y());
    }

    public void a(int i, int j, int k, Interpolator interpolator)
    {
        if (e != interpolator)
        {
            e = interpolator;
            d = pe.a(a.getContext(), interpolator);
        }
        yr.b(a, 2);
        c = 0;
        b = 0;
        d.a(0, 0, i, j, k);
        a();
    }

    public void b()
    {
        a.removeCallbacks(this);
        d.h();
    }

    public void b(int i, int j)
    {
        int i1 = Math.abs(i);
        int j1 = Math.abs(j);
        float f1;
        float f2;
        float f3;
        int k;
        boolean flag;
        int k1;
        int l1;
        int i2;
        if (i1 > j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = (int)Math.sqrt(0.0D);
        l1 = (int)Math.sqrt(i * i + j * j);
        if (flag)
        {
            k = a.getWidth();
        } else
        {
            k = a.getHeight();
        }
        i2 = k / 2;
        f3 = Math.min(1.0F, ((float)l1 * 1.0F) / (float)k);
        f1 = i2;
        f2 = i2;
        f3 = (float)Math.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
        if (k1 > 0)
        {
            k = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k1)) * 4;
        } else
        {
            int l;
            if (flag)
            {
                l = i1;
            } else
            {
                l = j1;
            }
            k = (int)(((float)l / (float)k + 1.0F) * 300F);
        }
        a(i, j, Math.min(k, 2000));
    }

    public void run()
    {
        pe pe1;
        zn zn1;
        g = false;
        f = true;
        yr.f(a);
        pe1 = d;
        zn1 = yr.e(a).j;
        if (!pe1.g()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        k2 = pe1.b();
        l2 = pe1.c();
        i2 = k2 - b;
        j2 = l2 - c;
        j1 = 0;
        i = 0;
        k1 = 0;
        l = 0;
        b = k2;
        c = l2;
        l1 = 0;
        j = 0;
        i1 = 0;
        k = 0;
        if (yr.g(a) == null)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        a.e();
        yr.h(a);
        g.a("RV Scroll");
        if (i2 != 0)
        {
            i = yr.e(a).a(i2, a.a, a.e);
            j = i2 - i;
        }
        if (j2 != 0)
        {
            l = yr.e(a).b(j2, a.a, a.e);
            k = j2 - l;
        }
        g.a();
        if (yr.i(a))
        {
            j1 = a.c.b();
            for (i1 = 0; i1 < j1; i1++)
            {
                View view = a.c.b(i1);
                Object obj = a.a(view);
                if (obj == null || ((zq) (obj)).h == null)
                {
                    continue;
                }
                obj = ((zq) (obj)).h.a;
                k1 = view.getLeft();
                l1 = view.getTop();
                if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
                {
                    ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
                }
            }

        }
        yr.j(a);
        a.a(false);
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (zn1 == null)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (zn1.b())
        {
            break MISSING_BLOCK_LABEL_854;
        }
        i1 = k;
        k1 = l;
        l1 = j;
        j1 = i;
        if (!zn1.c())
        {
            break MISSING_BLOCK_LABEL_854;
        }
        i1 = a.e.d();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        zn1.a();
        j1 = i;
_L5:
        if (!yr.k(a).isEmpty())
        {
            a.invalidate();
        }
        if (kb.a(a) != 2)
        {
            yr.a(a, i2, j2);
        }
        if (j != 0 || k != 0)
        {
            i1 = (int)pe1.f();
            if (j != k2)
            {
                if (j < 0)
                {
                    i = -i1;
                } else
                if (j > 0)
                {
                    i = i1;
                } else
                {
                    i = 0;
                }
                k1 = i;
            } else
            {
                k1 = 0;
            }
            if (k != l2)
            {
                if (k < 0)
                {
                    i = -i1;
                } else
                {
                    i = i1;
                    if (k <= 0)
                    {
                        i = 0;
                    }
                }
            } else
            {
                i = 0;
            }
            if (kb.a(a) != 2)
            {
                a.c(k1, i);
            }
            if ((k1 != 0 || j == k2 || pe1.d() == 0) && (i != 0 || k == l2 || pe1.e() == 0))
            {
                pe1.h();
            }
        }
        if (j1 != 0 || l != 0)
        {
            a.v();
        }
        if (!yr.l(a))
        {
            a.invalidate();
        }
        if (j2 != 0 && yr.e(a).d() && l == j2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i2 != 0 && yr.e(a).c() && j1 == i2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i2 == 0 && j2 == 0 || j != 0 || i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (pe1.a() || i == 0)
        {
            yr.b(a, 0);
        } else
        {
            a();
        }
_L2:
        if (zn1 != null)
        {
            if (zn1.b())
            {
                zn.a(zn1, 0, 0);
            }
            if (!g)
            {
                zn1.a();
            }
        }
        f = false;
        if (g)
        {
            a();
        }
        return;
_L4:
        if (zn1.d() >= i1)
        {
            zn1.a(i1 - 1);
        }
        zn.a(zn1, i2 - j, j2 - k);
        j1 = i;
        l1 = j;
        k1 = l;
        i1 = k;
        l = k1;
        j = l1;
        k = i1;
          goto _L5
    }
}
