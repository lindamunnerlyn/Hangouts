// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class xw extends zg
{

    int a;
    yq b;
    boolean c;
    int d;
    int e;
    ya f;
    final xx g = new xx(this);
    private xz l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    public xw()
    {
        n = false;
        c = false;
        o = false;
        p = true;
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
        if (!n)
        {
            return;
        } else
        {
            n = false;
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

    private int a(int i1, zl zl1, zq zq1, boolean flag)
    {
        int j1 = b.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, zl1, zq1);
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

    private int a(zl zl1, xz xz1, zq zq1, boolean flag)
    {
        int k2 = xz1.c;
        if (xz1.g != 0x80000000)
        {
            if (xz1.c < 0)
            {
                xz1.g = xz1.g + xz1.c;
            }
            a(zl1, xz1);
        }
        int i1 = xz1.c;
        int k1 = xz1.h;
        xy xy1 = new xy();
        k1 = i1 + k1;
        do
        {
label0:
            {
                if (k1 > 0 && xz1.a(zq1))
                {
                    xy1.a();
                    View view = xz1.a(zl1);
                    if (view == null)
                    {
                        xy1.b = true;
                    } else
                    {
                        zh zh1 = (zh)view.getLayoutParams();
                        int l1;
                        int i2;
                        int j2;
                        if (xz1.k == null)
                        {
                            boolean flag3 = c;
                            boolean flag1;
                            if (xz1.f == -1)
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
                            if (xz1.f == -1)
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
                        xy1.a = b.c(view);
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
                            if (xz1.f == -1)
                            {
                                i2 = xz1.b;
                                j2 = xz1.b - xy1.a;
                            } else
                            {
                                j2 = xz1.b;
                                i2 = xz1.b;
                                int l2 = xy1.a;
                                i2 += l2;
                            }
                        } else
                        {
                            j2 = o();
                            i2 = b.d(view) + j2;
                            if (xz1.f == -1)
                            {
                                j1 = xz1.b;
                                l1 = xz1.b - xy1.a;
                            } else
                            {
                                l1 = xz1.b;
                                j1 = xz1.b;
                                int i3 = xy1.a;
                                j1 += i3;
                            }
                        }
                        a(view, l1 + zh1.leftMargin, j2 + zh1.topMargin, j1 - zh1.rightMargin, i2 - zh1.bottomMargin);
                        if (zh1.a() || zh1.b())
                        {
                            xy1.c = true;
                        }
                        xy1.d = view.isFocusable();
                    }
                    if (!xy1.b)
                    {
                        xz1.b = xz1.b + xy1.a * xz1.f;
                        int j1;
                        if (!xy1.c || l.k != null || !zq1.a())
                        {
                            xz1.c = xz1.c - xy1.a;
                            j1 = k1 - xy1.a;
                        } else
                        {
                            j1 = k1;
                        }
                        if (xz1.g != 0x80000000)
                        {
                            xz1.g = xz1.g + xy1.a;
                            if (xz1.c < 0)
                            {
                                xz1.g = xz1.g + xz1.c;
                            }
                            a(zl1, xz1);
                        }
                        if (!flag || !xy1.d)
                        {
                            break label0;
                        }
                    }
                }
                return k2 - xz1.c;
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
                        if (((zh)view2.getLayoutParams()).a())
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

    private void a(int i1, int j1, boolean flag, zq zq1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        l.h = g(zq1);
        l.f = i1;
        if (i1 == 1)
        {
            zq1 = l;
            zq1.h = ((xz) (zq1)).h + b.g();
            zq1 = A();
            xz xz1 = l;
            if (c)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            xz1.e = i1;
            l.d = d(zq1) + l.e;
            l.b = b.b(zq1);
            i1 = b.b(zq1) - b.d();
        } else
        {
            zq1 = z();
            xz xz2 = l;
            xz2.h = xz2.h + b.c();
            xz2 = l;
            if (c)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            xz2.e = i1;
            l.d = d(zq1) + l.e;
            l.b = b.a(zq1);
            i1 = -b.a(zq1) + b.c();
        }
        l.c = j1;
        if (flag)
        {
            zq1 = l;
            zq1.c = ((xz) (zq1)).c - i1;
        }
        l.g = i1;
    }

    private void a(xx xx1)
    {
        c(xx1.a, xx1.b);
    }

    private void a(zl zl1, int i1, int j1)
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
            a(j1, zl1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, zl1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(zl zl1, xz xz1)
    {
        if (xz1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (xz1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = xz1.g;
        int j2 = k();
        if (i1 >= 0)
        {
            int l2 = b.e() - i1;
            if (c)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    xz1 = e(j1);
                    if (b.a(xz1) < l2)
                    {
                        a(zl1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    xz1 = e(k1);
                    if (b.a(xz1) < l2)
                    {
                        a(zl1, j2 - 1, k1);
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
        k2 = xz1.g;
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
            xz1 = e(l1);
            if (b.b(xz1) > k2)
            {
                a(zl1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            xz1 = e(i2);
            if (b.b(xz1) > k2)
            {
                a(zl1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, zl zl1, zq zq1, boolean flag)
    {
        int j1 = i1 - b.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, zl1, zq1);
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

    private View b(zl zl1, zq zq1)
    {
        if (c)
        {
            return k(zq1);
        } else
        {
            return l(zq1);
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

    private void b(xx xx1)
    {
        d(xx1.a, xx1.b);
    }

    private View c(zl zl1, zq zq1)
    {
        if (c)
        {
            return l(zq1);
        } else
        {
            return k(zq1);
        }
    }

    private void c(int i1, int j1)
    {
        l.c = b.d() - j1;
        xz xz1 = l;
        int k1;
        if (c)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        xz1.e = k1;
        l.d = i1;
        l.f = 1;
        l.b = j1;
        l.g = 0x80000000;
    }

    private int d(int i1, zl zl1, zq zq1)
    {
        if (k() == 0 || i1 == 0)
        {
            return 0;
        }
        l.a = true;
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
        a(j1, k1, true, zq1);
        l1 = l.g + a(zl1, l, zq1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        b.a(-i1);
        l.j = i1;
        return i1;
    }

    private void d(int i1, int j1)
    {
        l.c = j1 - b.c();
        l.d = i1;
        xz xz1 = l;
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        xz1.e = i1;
        l.f = -1;
        l.b = j1;
        l.g = 0x80000000;
    }

    private int g(zq zq1)
    {
        if (zq1.c())
        {
            return b.f();
        } else
        {
            return 0;
        }
    }

    private int h(zq zq1)
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
            yq yq1 = b;
            View view;
            View view1;
            boolean flag1;
            if (!p)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view = a(flag1);
            if (!p)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            view1 = b(flag1);
            flag1 = p;
            flag2 = c;
            j1 = ((flag) ? 1 : 0);
            if (k() != 0)
            {
                j1 = ((flag) ? 1 : 0);
                if (zq1.d() != 0)
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
                                i1 = Math.max(0, zq1.d() - j1 - 1);
                            } else
                            {
                                i1 = Math.max(0, i1);
                            }
                            j1 = i1;
                            if (flag1)
                            {
                                int k1 = Math.abs(yq1.b(view1) - yq1.a(view));
                                int l1 = Math.abs(d(view) - d(view1));
                                float f1 = (float)k1 / (float)(l1 + 1);
                                float f2 = i1;
                                return Math.round((float)(yq1.c() - yq1.a(view)) + f1 * f2);
                            }
                        }
                    }
                }
            }
        }
        return j1;
    }

    private int i(zq zq1)
    {
        boolean flag1 = true;
        if (k() != 0)
        {
            y();
            yq yq1 = b;
            View view;
            View view1;
            boolean flag;
            if (!p)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!p)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = p;
            if (k() != 0 && zq1.d() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return Math.abs(d(view) - d(view1)) + 1;
                } else
                {
                    int i1 = yq1.b(view1);
                    int j1 = yq1.a(view);
                    return Math.min(yq1.f(), i1 - j1);
                }
            }
        }
        return 0;
    }

    private int j(zq zq1)
    {
        boolean flag1 = true;
        if (k() != 0)
        {
            y();
            yq yq1 = b;
            View view;
            View view1;
            boolean flag;
            if (!p)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!p)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = p;
            if (k() != 0 && zq1.d() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return zq1.d();
                } else
                {
                    int i1 = yq1.b(view1);
                    int j1 = yq1.a(view);
                    int k1 = Math.abs(d(view) - d(view1));
                    return (int)(((float)(i1 - j1) / (float)(k1 + 1)) * (float)zq1.d());
                }
            }
        }
        return 0;
    }

    private View k(zq zq1)
    {
        return a(0, k(), zq1.d());
    }

    private View l(zq zq1)
    {
        return a(k() - 1, -1, zq1.d());
    }

    private void w()
    {
        boolean flag = true;
        if (a != 1 && x()) goto _L2; else goto _L1
_L1:
        flag = n;
_L4:
        c = flag;
        return;
_L2:
        if (n)
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
        if (l == null)
        {
            l = new xz();
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
        Object obj = new yr(this);
_L7:
        b = ((yq) (obj));
_L2:
        return;
_L5:
        obj = new ys(this);
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

    public int a(int i1, zl zl1, zq zq1)
    {
        if (a == 1)
        {
            return 0;
        } else
        {
            return d(i1, zl1, zq1);
        }
    }

    public int a(zq zq1)
    {
        return h(zq1);
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

    public zh a()
    {
        return new zh();
    }

    public void a(Parcelable parcelable)
    {
        if (parcelable instanceof ya)
        {
            f = (ya)parcelable;
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

    public void a(yt yt, zl zl1)
    {
        super.a(yt, zl1);
        if (q)
        {
            c(zl1);
            zl1.a();
        }
    }

    public void a(zl zl1, zq zq1)
    {
        Object obj2;
        int i1;
        int j1;
        int k1;
        int l1;
        if ((f != null || d != -1) && zq1.d() == 0)
        {
            c(zl1);
            return;
        }
        if (f != null && f.a())
        {
            d = f.a;
        }
        y();
        l.a = false;
        w();
        g.a();
        g.c = c ^ o;
        obj2 = g;
        View view;
        zh zh1;
        int i2;
        if (zq1.a() || d == -1)
        {
            i1 = 0;
        } else
        if (d < 0 || d >= zq1.d())
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
                if (((xx) (obj2)).c)
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
        zh1 = (zh)view.getLayoutParams();
        boolean flag;
        if (!zh1.a() && zh1.c() >= 0 && zh1.c() < zq1.d())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        ((xx) (obj2)).a(view);
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((xx) (obj2)).b();
            if (o)
            {
                i1 = zq1.d() - 1;
            } else
            {
                i1 = 0;
            }
            obj2.a = i1;
        }
_L2:
        i1 = g(zq1);
        if (l.j >= 0)
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
        if (zq1.a())
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
        a(zl1);
        l.i = zq1.a();
        if (g.c)
        {
            b(g);
            l.h = j1;
            a(zl1, l, zq1, false);
            l1 = l.b;
            i2 = l.d;
            j1 = i1;
            if (l.c > 0)
            {
                j1 = i1 + l.c;
            }
            a(g);
            l.h = j1;
            obj = l;
            obj.d = ((xz) (obj)).d + l.e;
            a(zl1, l, zq1, false);
            k1 = l.b;
            Object obj1;
            int j2;
            int k2;
            int l2;
            int i3;
            boolean flag1;
            if (l.c > 0)
            {
                i1 = l.c;
                d(i2, l1);
                l.h = i1;
                a(zl1, l, zq1, false);
                i1 = l.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(g);
            l.h = i1;
            a(zl1, l, zq1, false);
            k1 = l.b;
            j2 = l.d;
            i1 = j1;
            if (l.c > 0)
            {
                i1 = j1 + l.c;
            }
            b(g);
            l.h = i1;
            obj1 = l;
            obj1.d = ((xz) (obj1)).d + l.e;
            a(zl1, l, zq1, false);
            l1 = l.b;
            i1 = k1;
            j1 = l1;
            if (l.c > 0)
            {
                i1 = l.c;
                c(j2, k1);
                l.h = i1;
                a(zl1, l, zq1, false);
                i1 = l.b;
                j1 = l1;
            }
        }
        if (k() > 0)
        {
            if (c ^ o)
            {
                k1 = a(i1, zl1, zq1, true);
                l1 = j1 + k1;
                j1 = b(l1, zl1, zq1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, zl1, zq1, true);
                i1 += k1;
                j2 = a(i1, zl1, zq1, false);
                l1 = j1 + k1 + j2;
                k1 = i1 + j2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (zq1.b() && k() != 0 && !zq1.a() && f())
        {
            i1 = 0;
            j1 = 0;
            obj1 = zl1.b();
            l2 = ((List) (obj1)).size();
            i3 = d(e(0));
            j2 = 0;
            while (j2 < l2) 
            {
                obj2 = (zs)((List) (obj1)).get(j2);
                if (!((zs) (obj2)).n())
                {
                    if (((zs) (obj2)).d() < i3)
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
                        k2 = b.c(((zs) (obj2)).a) + i1;
                        i1 = j1;
                        j1 = k2;
                    } else
                    {
                        k2 = b.c(((zs) (obj2)).a) + j1;
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
            l.k = ((List) (obj1));
            if (i1 > 0)
            {
                d(d(z()), l1);
                l.h = i1;
                l.c = 0;
                l.a();
                a(zl1, l, zq1, false);
            }
            if (j1 > 0)
            {
                c(d(A()), k1);
                l.h = j1;
                l.c = 0;
                l.a();
                a(zl1, l, zq1, false);
            }
            l.k = null;
        }
        if (!zq1.a())
        {
            d = -1;
            e = 0x80000000;
            b.a();
        }
        m = o;
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
            ((xx) (obj2)).b();
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
        if (((xx) (obj2)).c)
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
        ((xx) (obj2)).b();
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
        if (m != o)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        if (((xx) (obj2)).c)
        {
            obj = b(zl1, zq1);
        } else
        {
            obj = c(zl1, zq1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        ((xx) (obj2)).b(((View) (obj)));
        if (!zq1.a() && f())
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
                if (((xx) (obj2)).c)
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

    public int b(int i1, zl zl1, zq zq1)
    {
        if (a == 0)
        {
            return 0;
        } else
        {
            return d(i1, zl1, zq1);
        }
    }

    public int b(zq zq1)
    {
        return h(zq1);
    }

    public Parcelable b()
    {
        if (f != null)
        {
            return new ya(f);
        }
        ya ya1 = new ya();
        if (k() > 0)
        {
            y();
            boolean flag = m ^ c;
            ya1.c = flag;
            if (flag)
            {
                View view = A();
                ya1.b = b.d() - b.b(view);
                ya1.a = d(view);
                return ya1;
            } else
            {
                View view1 = z();
                ya1.a = d(view1);
                ya1.b = b.a(view1) - b.c();
                return ya1;
            }
        } else
        {
            ya1.b();
            return ya1;
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

    public int c(zq zq1)
    {
        return i(zq1);
    }

    public View c(int i1, zl zl1, zq zq1)
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
                view = c(zl1, zq1);
            } else
            {
                view = b(zl1, zq1);
            }
            if (view != null)
            {
                y();
                a(i1, (int)(0.33F * (float)b.f()), false, zq1);
                l.g = 0x80000000;
                l.a = false;
                a(zl1, l, zq1, true);
                if (i1 == -1)
                {
                    zl1 = z();
                } else
                {
                    zl1 = A();
                }
                if (zl1 != view && zl1.isFocusable())
                {
                    return zl1;
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

    public int d(zq zq1)
    {
        return i(zq1);
    }

    public boolean d()
    {
        return a == 1;
    }

    public int e(zq zq1)
    {
        return j(zq1);
    }

    public void e()
    {
        p = true;
    }

    public int f(zq zq1)
    {
        return j(zq1);
    }

    public boolean f()
    {
        return f == null && m == o;
    }
}
