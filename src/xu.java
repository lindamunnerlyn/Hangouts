// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class xu extends ze
{

    int a;
    yo b;
    boolean c;
    int d;
    int e;
    xy f;
    final xv g = new xv(this);
    private xx k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public xu()
    {
        m = false;
        c = false;
        n = false;
        o = true;
        d = -1;
        e = 0x80000000;
        f = null;
        a(((String) (null)));
        if (1 != a)
        {
            a = 1;
            b = null;
            g();
        }
        a(((String) (null)));
        if (!m)
        {
            return;
        } else
        {
            m = false;
            g();
            return;
        }
    }

    private View A()
    {
        int i1;
        if (c)
        {
            i1 = 0;
        } else
        {
            i1 = k() - 1;
        }
        return e(i1);
    }

    private int a(int i1, zj zj1, zo zo1, boolean flag)
    {
        int j1 = b.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, zj1, zo1);
            j1 = k1;
            if (flag)
            {
                i1 = b.d() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(zj zj1, xx xx1, zo zo1, boolean flag)
    {
        int k2 = xx1.c;
        if (xx1.g != 0x80000000)
        {
            if (xx1.c < 0)
            {
                xx1.g = xx1.g + xx1.c;
            }
            a(zj1, xx1);
        }
        int i1 = xx1.c;
        int k1 = xx1.h;
        xw xw1 = new xw();
        k1 = i1 + k1;
        do
        {
label0:
            {
                if (k1 > 0 && xx1.a(zo1))
                {
                    xw1.a();
                    View view = xx1.a(zj1);
                    if (view == null)
                    {
                        xw1.b = true;
                    } else
                    {
                        zf zf1 = (zf)view.getLayoutParams();
                        int l1;
                        int i2;
                        int j2;
                        if (xx1.k == null)
                        {
                            boolean flag3 = c;
                            boolean flag1;
                            if (xx1.f == -1)
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            if (flag3 == flag1)
                            {
                                b(view);
                            } else
                            {
                                b(view, 0);
                            }
                        } else
                        {
                            boolean flag4 = c;
                            boolean flag2;
                            if (xx1.f == -1)
                            {
                                flag2 = true;
                            } else
                            {
                                flag2 = false;
                            }
                            if (flag4 == flag2)
                            {
                                a(view);
                            } else
                            {
                                a(view, 0);
                            }
                        }
                        e(view);
                        xw1.a = b.c(view);
                        if (a == 1)
                        {
                            if (x())
                            {
                                j1 = l() - p();
                                l1 = j1 - b.d(view);
                            } else
                            {
                                l1 = n();
                                j1 = b.d(view) + l1;
                            }
                            if (xx1.f == -1)
                            {
                                i2 = xx1.b;
                                j2 = xx1.b - xw1.a;
                            } else
                            {
                                j2 = xx1.b;
                                i2 = xx1.b;
                                int l2 = xw1.a;
                                i2 += l2;
                            }
                        } else
                        {
                            j2 = o();
                            i2 = b.d(view) + j2;
                            if (xx1.f == -1)
                            {
                                j1 = xx1.b;
                                l1 = xx1.b - xw1.a;
                            } else
                            {
                                l1 = xx1.b;
                                j1 = xx1.b;
                                int i3 = xw1.a;
                                j1 += i3;
                            }
                        }
                        a(view, l1 + zf1.leftMargin, j2 + zf1.topMargin, j1 - zf1.rightMargin, i2 - zf1.bottomMargin);
                        if (zf1.a() || zf1.b())
                        {
                            xw1.c = true;
                        }
                        xw1.d = view.isFocusable();
                    }
                    if (!xw1.b)
                    {
                        xx1.b = xx1.b + xw1.a * xx1.f;
                        int j1;
                        if (!xw1.c || k.k != null || !zo1.a())
                        {
                            xx1.c = xx1.c - xw1.a;
                            j1 = k1 - xw1.a;
                        } else
                        {
                            j1 = k1;
                        }
                        if (xx1.g != 0x80000000)
                        {
                            xx1.g = xx1.g + xw1.a;
                            if (xx1.c < 0)
                            {
                                xx1.g = xx1.g + xx1.c;
                            }
                            a(zj1, xx1);
                        }
                        if (!flag || !xw1.d)
                        {
                            break label0;
                        }
                    }
                }
                return k2 - xx1.c;
            }
            k1 = j1;
        } while (true);
    }

    private View a(int i1, int j1, int k1)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                y();
                int i2 = b.c();
                int j2 = b.d();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                view1 = null;
                while (i1 != j1) 
                {
                    View view2 = e(i1);
                    int k2 = d(view2);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((zf)view2.getLayoutParams()).a())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (b.a(view2) < j2)
                            {
                                view3 = view2;
                                if (b.b(view2) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (view == null)
                            {
                                view = view2;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (view == null)
                {
                    break label0;
                }
                view3 = view;
            }
            return view3;
        }
        return view1;
    }

    private View a(int i1, int j1, boolean flag, boolean flag1)
    {
        y();
        int k1 = b.c();
        int l1 = b.d();
        View view;
        byte byte0;
        if (j1 > i1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        view = null;
        for (; i1 != j1; i1 += byte0)
        {
            View view1 = e(i1);
            int i2 = b.a(view1);
            int j2 = b.b(view1);
            if (i2 >= l1 || j2 <= k1)
            {
                continue;
            }
            if (!flag || i2 >= k1 && j2 <= l1)
            {
                return view1;
            }
            if (view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    private View a(boolean flag)
    {
        if (c)
        {
            return a(k() - 1, -1, flag, true);
        } else
        {
            return a(0, k(), flag, true);
        }
    }

    private void a(int i1, int j1, boolean flag, zo zo1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        k.h = g(zo1);
        k.f = i1;
        if (i1 == 1)
        {
            zo1 = k;
            zo1.h = ((xx) (zo1)).h + b.g();
            zo1 = A();
            xx xx1 = k;
            if (c)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            xx1.e = i1;
            k.d = d(zo1) + k.e;
            k.b = b.b(zo1);
            i1 = b.b(zo1) - b.d();
        } else
        {
            zo1 = z();
            xx xx2 = k;
            xx2.h = xx2.h + b.c();
            xx2 = k;
            if (c)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            xx2.e = i1;
            k.d = d(zo1) + k.e;
            k.b = b.a(zo1);
            i1 = -b.a(zo1) + b.c();
        }
        k.c = j1;
        if (flag)
        {
            zo1 = k;
            zo1.c = ((xx) (zo1)).c - i1;
        }
        k.g = i1;
    }

    private void a(xv xv1)
    {
        c(xv1.a, xv1.b);
    }

    private void a(zj zj1, int i1, int j1)
    {
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1;
        k1 = i1;
        if (j1 <= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1--;
        while (j1 >= i1) 
        {
            a(j1, zj1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, zj1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(zj zj1, xx xx1)
    {
        if (xx1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xx1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = xx1.g;
        int j2 = k();
        if (i1 >= 0)
        {
            int l2 = b.e() - i1;
            if (c)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    xx1 = e(j1);
                    if (b.a(xx1) < l2)
                    {
                        a(zj1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    xx1 = e(k1);
                    if (b.a(xx1) < l2)
                    {
                        a(zj1, j2 - 1, k1);
                        return;
                    }
                    k1--;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k2;
        int i3;
        k2 = xx1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = k();
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            xx1 = e(l1);
            if (b.b(xx1) > k2)
            {
                a(zj1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            xx1 = e(i2);
            if (b.b(xx1) > k2)
            {
                a(zj1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, zj zj1, zo zo1, boolean flag)
    {
        int j1 = i1 - b.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, zj1, zo1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - b.c();
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(-i1);
                    j1 = k1 - i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private View b(zj zj1, zo zo1)
    {
        if (c)
        {
            return k(zo1);
        } else
        {
            return l(zo1);
        }
    }

    private View b(boolean flag)
    {
        if (c)
        {
            return a(0, k(), flag, true);
        } else
        {
            return a(k() - 1, -1, flag, true);
        }
    }

    private void b(xv xv1)
    {
        d(xv1.a, xv1.b);
    }

    private View c(zj zj1, zo zo1)
    {
        if (c)
        {
            return l(zo1);
        } else
        {
            return k(zo1);
        }
    }

    private void c(int i1, int j1)
    {
        k.c = b.d() - j1;
        xx xx1 = k;
        int k1;
        if (c)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        xx1.e = k1;
        k.d = i1;
        k.f = 1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private int d(int i1, zj zj1, zo zo1)
    {
        if (k() == 0 || i1 == 0)
        {
            return 0;
        }
        k.a = true;
        y();
        int j1;
        int k1;
        int l1;
        if (i1 > 0)
        {
            j1 = 1;
        } else
        {
            j1 = -1;
        }
        k1 = Math.abs(i1);
        a(j1, k1, true, zo1);
        l1 = k.g + a(zj1, k, zo1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        b.a(-i1);
        k.j = i1;
        return i1;
    }

    private void d(int i1, int j1)
    {
        k.c = j1 - b.c();
        k.d = i1;
        xx xx1 = k;
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        xx1.e = i1;
        k.f = -1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private int g(zo zo1)
    {
        if (zo1.c())
        {
            return b.f();
        } else
        {
            return 0;
        }
    }

    private int h(zo zo1)
    {
        boolean flag2 = true;
        boolean flag = false;
        int j1;
        if (k() == 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            y();
            yo yo1 = b;
            View view;
            View view1;
            boolean flag1;
            if (!o)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view = a(flag1);
            if (!o)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            view1 = b(flag1);
            flag1 = o;
            flag2 = c;
            j1 = ((flag) ? 1 : 0);
            if (k() != 0)
            {
                j1 = ((flag) ? 1 : 0);
                if (zo1.d() != 0)
                {
                    j1 = ((flag) ? 1 : 0);
                    if (view != null)
                    {
                        j1 = ((flag) ? 1 : 0);
                        if (view1 != null)
                        {
                            int i1 = Math.min(d(view), d(view1));
                            j1 = Math.max(d(view), d(view1));
                            if (flag2)
                            {
                                i1 = Math.max(0, zo1.d() - j1 - 1);
                            } else
                            {
                                i1 = Math.max(0, i1);
                            }
                            j1 = i1;
                            if (flag1)
                            {
                                int k1 = Math.abs(yo1.b(view1) - yo1.a(view));
                                int l1 = Math.abs(d(view) - d(view1));
                                float f1 = (float)k1 / (float)(l1 + 1);
                                float f2 = i1;
                                return Math.round((float)(yo1.c() - yo1.a(view)) + f1 * f2);
                            }
                        }
                    }
                }
            }
        }
        return j1;
    }

    private int i(zo zo1)
    {
        boolean flag1 = true;
        if (k() != 0)
        {
            y();
            yo yo1 = b;
            View view;
            View view1;
            boolean flag;
            if (!o)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!o)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = o;
            if (k() != 0 && zo1.d() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return Math.abs(d(view) - d(view1)) + 1;
                } else
                {
                    int i1 = yo1.b(view1);
                    int j1 = yo1.a(view);
                    return Math.min(yo1.f(), i1 - j1);
                }
            }
        }
        return 0;
    }

    private int j(zo zo1)
    {
        boolean flag1 = true;
        if (k() != 0)
        {
            y();
            yo yo1 = b;
            View view;
            View view1;
            boolean flag;
            if (!o)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!o)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = o;
            if (k() != 0 && zo1.d() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return zo1.d();
                } else
                {
                    int i1 = yo1.b(view1);
                    int j1 = yo1.a(view);
                    int k1 = Math.abs(d(view) - d(view1));
                    return (int)(((float)(i1 - j1) / (float)(k1 + 1)) * (float)zo1.d());
                }
            }
        }
        return 0;
    }

    private View k(zo zo1)
    {
        return a(0, k(), zo1.d());
    }

    private View l(zo zo1)
    {
        return a(k() - 1, -1, zo1.d());
    }

    private void w()
    {
        boolean flag = true;
        if (a != 1 && x()) goto _L2; else goto _L1
_L1:
        flag = m;
_L4:
        c = flag;
        return;
_L2:
        if (m)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean x()
    {
        return j() == 1;
    }

    private void y()
    {
        if (k == null)
        {
            k = new xx();
        }
        if (b != null) goto _L2; else goto _L1
_L1:
        a;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 63
    //                   1 78;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("invalid orientation");
_L4:
        Object obj = new yp(this);
_L7:
        b = ((yo) (obj));
_L2:
        return;
_L5:
        obj = new yq(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    private View z()
    {
        int i1;
        if (c)
        {
            i1 = k() - 1;
        } else
        {
            i1 = 0;
        }
        return e(i1);
    }

    public int a(int i1, zj zj1, zo zo1)
    {
        if (a == 1)
        {
            return 0;
        } else
        {
            return d(i1, zj1, zo1);
        }
    }

    public int a(zo zo1)
    {
        return h(zo1);
    }

    public View a(int i1)
    {
        int j1 = k();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - d(e(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = e(k1);
        view = view1;
        if (d(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.a(i1);
    }

    public zf a()
    {
        return new zf();
    }

    public void a(Parcelable parcelable)
    {
        if (parcelable instanceof xy)
        {
            f = (xy)parcelable;
            g();
        }
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        byte byte0 = -1;
        super.a(accessibilityevent);
        if (k() > 0)
        {
            accessibilityevent = mj.a(accessibilityevent);
            View view = a(0, k(), false, true);
            int i1;
            if (view == null)
            {
                i1 = -1;
            } else
            {
                i1 = d(view);
            }
            accessibilityevent.b(i1);
            view = a(k() - 1, -1, false, true);
            if (view == null)
            {
                i1 = byte0;
            } else
            {
                i1 = d(view);
            }
            accessibilityevent.c(i1);
        }
    }

    public void a(String s)
    {
        if (f == null)
        {
            super.a(s);
        }
    }

    public void a(yr yr, zj zj1)
    {
        super.a(yr, zj1);
        if (p)
        {
            c(zj1);
            zj1.a();
        }
    }

    public void a(zj zj1, zo zo1)
    {
        Object obj2;
        int i1;
        int j1;
        int k1;
        int l1;
        if ((f != null || d != -1) && zo1.d() == 0)
        {
            c(zj1);
            return;
        }
        if (f != null && f.a())
        {
            d = f.a;
        }
        y();
        k.a = false;
        w();
        g.a();
        g.c = c ^ n;
        obj2 = g;
        View view;
        zf zf1;
        int i2;
        if (zo1.a() || d == -1)
        {
            i1 = 0;
        } else
        if (d < 0 || d >= zo1.d())
        {
            d = -1;
            e = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj2.a = d;
                if (f == null || !f.a())
                {
                    break label0;
                }
                obj2.c = f.c;
                if (((xv) (obj2)).c)
                {
                    obj2.b = b.d() - f.b;
                } else
                {
                    obj2.b = b.c() + f.b;
                }
                i1 = 1;
            }
        }
_L8:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (k() == 0)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        view = r();
        if (view == null) goto _L4; else goto _L3
_L3:
        zf1 = (zf)view.getLayoutParams();
        boolean flag;
        if (!zf1.a() && zf1.c() >= 0 && zf1.c() < zo1.d())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        ((xv) (obj2)).a(view);
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((xv) (obj2)).b();
            if (n)
            {
                i1 = zo1.d() - 1;
            } else
            {
                i1 = 0;
            }
            obj2.a = i1;
        }
_L2:
        i1 = g(zo1);
        if (k.j >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + b.c();
        l1 = i1 + b.g();
        i1 = l1;
        j1 = k1;
        if (zo1.a())
        {
            i1 = l1;
            j1 = k1;
            if (d != -1)
            {
                i1 = l1;
                j1 = k1;
                if (e != 0x80000000)
                {
                    Object obj = a(d);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (c)
                        {
                            i1 = b.d() - b.b(((View) (obj))) - e;
                        } else
                        {
                            i1 = b.a(((View) (obj)));
                            j1 = b.c();
                            i1 = e - (i1 - j1);
                        }
                        if (i1 > 0)
                        {
                            j1 = k1 + i1;
                            i1 = l1;
                        } else
                        {
                            i1 = l1 - i1;
                            j1 = k1;
                        }
                    }
                }
            }
        }
        a(zj1);
        k.i = zo1.a();
        if (g.c)
        {
            b(g);
            k.h = j1;
            a(zj1, k, zo1, false);
            l1 = k.b;
            i2 = k.d;
            j1 = i1;
            if (k.c > 0)
            {
                j1 = i1 + k.c;
            }
            a(g);
            k.h = j1;
            obj = k;
            obj.d = ((xx) (obj)).d + k.e;
            a(zj1, k, zo1, false);
            k1 = k.b;
            Object obj1;
            int j2;
            int k2;
            int l2;
            int i3;
            boolean flag1;
            if (k.c > 0)
            {
                i1 = k.c;
                d(i2, l1);
                k.h = i1;
                a(zj1, k, zo1, false);
                i1 = k.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(g);
            k.h = i1;
            a(zj1, k, zo1, false);
            k1 = k.b;
            j2 = k.d;
            i1 = j1;
            if (k.c > 0)
            {
                i1 = j1 + k.c;
            }
            b(g);
            k.h = i1;
            obj1 = k;
            obj1.d = ((xx) (obj1)).d + k.e;
            a(zj1, k, zo1, false);
            l1 = k.b;
            i1 = k1;
            j1 = l1;
            if (k.c > 0)
            {
                i1 = k.c;
                c(j2, k1);
                k.h = i1;
                a(zj1, k, zo1, false);
                i1 = k.b;
                j1 = l1;
            }
        }
        if (k() > 0)
        {
            if (c ^ n)
            {
                k1 = a(i1, zj1, zo1, true);
                l1 = j1 + k1;
                j1 = b(l1, zj1, zo1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, zj1, zo1, true);
                i1 += k1;
                j2 = a(i1, zj1, zo1, false);
                l1 = j1 + k1 + j2;
                k1 = i1 + j2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (zo1.b() && k() != 0 && !zo1.a() && f())
        {
            i1 = 0;
            j1 = 0;
            obj1 = zj1.b();
            l2 = ((List) (obj1)).size();
            i3 = d(e(0));
            j2 = 0;
            while (j2 < l2) 
            {
                obj2 = (zq)((List) (obj1)).get(j2);
                if (!((zq) (obj2)).n())
                {
                    if (((zq) (obj2)).d() < i3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != c)
                    {
                        k2 = -1;
                    } else
                    {
                        k2 = 1;
                    }
                    if (k2 == -1)
                    {
                        k2 = b.c(((zq) (obj2)).a) + i1;
                        i1 = j1;
                        j1 = k2;
                    } else
                    {
                        k2 = b.c(((zq) (obj2)).a) + j1;
                        j1 = i1;
                        i1 = k2;
                    }
                } else
                {
                    k2 = i1;
                    i1 = j1;
                    j1 = k2;
                }
                k2 = j2 + 1;
                j2 = j1;
                j1 = i1;
                i1 = j2;
                j2 = k2;
            }
            k.k = ((List) (obj1));
            if (i1 > 0)
            {
                d(d(z()), l1);
                k.h = i1;
                k.c = 0;
                k.a();
                a(zj1, k, zo1, false);
            }
            if (j1 > 0)
            {
                c(d(A()), k1);
                k.h = j1;
                k.c = 0;
                k.a();
                a(zj1, k, zo1, false);
            }
            k.k = null;
        }
        if (!zo1.a())
        {
            d = -1;
            e = 0x80000000;
            b.a();
        }
        l = n;
        f = null;
        return;
        if (e != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1122;
        }
        obj = a(d);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (b.c(((View) (obj))) > b.f())
        {
            ((xv) (obj2)).b();
        } else
        if (b.a(((View) (obj))) - b.c() < 0)
        {
            obj2.b = b.c();
            obj2.c = false;
        } else
        {
label1:
            {
                if (b.d() - b.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj2.b = b.d();
                obj2.c = true;
            }
        }
_L10:
        i1 = 1;
          goto _L8
        if (((xv) (obj2)).c)
        {
            i1 = b.b(((View) (obj))) + b.b();
        } else
        {
            i1 = b.a(((View) (obj)));
        }
        obj2.b = i1;
_L9:
        i1 = 1;
          goto _L8
_L7:
        if (k() > 0)
        {
            i1 = d(e(0));
            if (d < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj2.c = flag;
        }
        ((xv) (obj2)).b();
          goto _L9
        obj2.c = c;
        if (c)
        {
            obj2.b = b.d() - e;
        } else
        {
            obj2.b = b.c() + e;
        }
          goto _L10
_L4:
        if (l != n)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        if (((xv) (obj2)).c)
        {
            obj = b(zj1, zo1);
        } else
        {
            obj = c(zj1, zo1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        ((xv) (obj2)).b(((View) (obj)));
        if (!zo1.a() && f())
        {
            if (b.a(((View) (obj))) >= b.d() || b.b(((View) (obj))) < b.c())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((xv) (obj2)).c)
                {
                    i1 = b.d();
                } else
                {
                    i1 = b.c();
                }
                obj2.b = i1;
            }
        }
        i1 = 1;
          goto _L11
        i1 = 0;
          goto _L11
    }

    public int b(int i1, zj zj1, zo zo1)
    {
        if (a == 0)
        {
            return 0;
        } else
        {
            return d(i1, zj1, zo1);
        }
    }

    public int b(zo zo1)
    {
        return h(zo1);
    }

    public Parcelable b()
    {
        if (f != null)
        {
            return new xy(f);
        }
        xy xy1 = new xy();
        if (k() > 0)
        {
            y();
            boolean flag = l ^ c;
            xy1.c = flag;
            if (flag)
            {
                View view = A();
                xy1.b = b.d() - b.b(view);
                xy1.a = d(view);
                return xy1;
            } else
            {
                View view1 = z();
                xy1.a = d(view1);
                xy1.b = b.a(view1) - b.c();
                return xy1;
            }
        } else
        {
            xy1.b();
            return xy1;
        }
    }

    public void b(int i1)
    {
        d = i1;
        e = 0x80000000;
        if (f != null)
        {
            f.b();
        }
        g();
    }

    public int c(zo zo1)
    {
        return i(zo1);
    }

    public View c(int i1, zj zj1, zo zo1)
    {
        w();
        if (k() != 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        i1;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 181
    //                   2: 186
    //                   17: 229
    //                   33: 191
    //                   66: 247
    //                   130: 210;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i1 = 0x80000000;
_L10:
        if (i1 != 0x80000000)
        {
            y();
            View view;
            if (i1 == -1)
            {
                view = c(zj1, zo1);
            } else
            {
                view = b(zj1, zo1);
            }
            if (view != null)
            {
                y();
                a(i1, (int)(0.33F * (float)b.f()), false, zo1);
                k.g = 0x80000000;
                k.a = false;
                a(zj1, k, zo1, true);
                if (i1 == -1)
                {
                    zj1 = z();
                } else
                {
                    zj1 = A();
                }
                if (zj1 != view && zj1.isFocusable())
                {
                    return zj1;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        i1 = -1;
          goto _L10
_L5:
        i1 = 1;
          goto _L10
_L7:
        if (a == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (a == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (a == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (a == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public boolean c()
    {
        return a == 0;
    }

    public int d(zo zo1)
    {
        return i(zo1);
    }

    public boolean d()
    {
        return a == 1;
    }

    public int e(zo zo1)
    {
        return j(zo1);
    }

    public void e()
    {
        o = true;
    }

    public int f(zo zo1)
    {
        return j(zo1);
    }

    public boolean f()
    {
        return f == null && l == n;
    }
}
