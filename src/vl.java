// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public final class vl
    implements ut
{

    Toolbar a;
    CharSequence b;
    android.view.Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private vu n;
    private int o;
    private final vi p;
    private int q;
    private Drawable r;

    public vl(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, g.bE, g.ak);
    }

    private vl(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        o = 0;
        q = 0;
        a = toolbar;
        b = toolbar.i();
        l = toolbar.j();
        boolean flag1;
        if (b != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = flag1;
        j = toolbar.l();
        if (flag)
        {
            toolbar = vk.a(toolbar.getContext(), null, ro.a, g.g);
            Object obj = toolbar.c(ro.r);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.c(ro.p);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                c(((CharSequence) (obj)));
            }
            obj = toolbar.a(ro.n);
            if (obj != null)
            {
                i = ((Drawable) (obj));
                p();
            }
            obj = toolbar.a(ro.m);
            if (j == null && obj != null)
            {
                h = ((Drawable) (obj));
                p();
            }
            obj = toolbar.a(ro.l);
            if (obj != null)
            {
                a(((Drawable) (obj)));
            }
            a(toolbar.a(ro.h, 0));
            int k1 = toolbar.f(ro.g, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                a(e | 0x10);
            }
            k1 = toolbar.e(ro.j, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            k1 = toolbar.c(ro.f, -1);
            int i2 = toolbar.c(ro.e, -1);
            if (k1 >= 0 || i2 >= 0)
            {
                a.a(Math.max(k1, 0), Math.max(i2, 0));
            }
            k1 = toolbar.f(ro.s, 0);
            if (k1 != 0)
            {
                a.a(a.getContext(), k1);
            }
            k1 = toolbar.f(ro.q, 0);
            if (k1 != 0)
            {
                a.b(a.getContext(), k1);
            }
            k1 = toolbar.f(ro.o, 0);
            if (k1 != 0)
            {
                a.a(k1);
            }
            toolbar.b();
            p = toolbar.c();
        } else
        {
            int l1 = 11;
            if (a.l() != null)
            {
                l1 = 15;
            }
            e = l1;
            p = vi.a(toolbar.getContext());
        }
        if (i1 != q)
        {
            q = i1;
            if (TextUtils.isEmpty(a.k()))
            {
                c(q);
            }
        }
        m = a.k();
        toolbar = p.a(j1);
        if (r != toolbar)
        {
            r = toolbar;
            r();
        }
        a.a(new vm(this));
    }

    private void d(CharSequence charsequence)
    {
        b = charsequence;
        if ((e & 8) != 0)
        {
            a.b(charsequence);
        }
    }

    private void p()
    {
        Drawable drawable = null;
        if ((e & 2) != 0)
        {
            if ((e & 1) != 0)
            {
                if (i != null)
                {
                    drawable = i;
                } else
                {
                    drawable = h;
                }
            } else
            {
                drawable = h;
            }
        }
        a.a(drawable);
    }

    private void q()
    {
label0:
        {
            if ((e & 4) != 0)
            {
                if (!TextUtils.isEmpty(m))
                {
                    break label0;
                }
                a.d(q);
            }
            return;
        }
        a.d(m);
    }

    private void r()
    {
        if ((e & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (j != null)
            {
                drawable = j;
            } else
            {
                drawable = r;
            }
            toolbar.b(drawable);
        }
    }

    public ViewGroup a()
    {
        return a;
    }

    public lr a(int i1, long l1)
    {
        if (i1 == 8)
        {
            lr lr1 = kb.o(a).a(0.0F);
            lr1.a(l1);
            lr1.a(new vn(this));
            return lr1;
        }
        if (i1 == 0)
        {
            lr lr2 = kb.o(a).a(1.0F);
            lr2.a(l1);
            lr2.a(new vo(this));
            return lr2;
        } else
        {
            return null;
        }
    }

    public void a(int i1)
    {
label0:
        {
            int j1 = e ^ i1;
            e = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        r();
                        q();
                    } else
                    {
                        a.b(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    p();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.b(b);
                        a.c(l);
                    } else
                    {
                        a.b(null);
                        a.c(null);
                    }
                }
                if ((j1 & 0x10) != 0 && g != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(g);
                }
            }
            return;
        }
        a.removeView(g);
    }

    public void a(Drawable drawable)
    {
        j = drawable;
        r();
    }

    public void a(Menu menu, to to)
    {
        if (n == null)
        {
            n = new vu(a.getContext());
            n.a(g.aR);
        }
        n.a(to);
        a.a((sy)menu, n);
    }

    public void a(View view)
    {
        if (g != null && (e & 0x10) != 0)
        {
            a.removeView(g);
        }
        g = view;
        if (view != null && (e & 0x10) != 0)
        {
            a.addView(g);
        }
    }

    public void a(android.view.Window.Callback callback)
    {
        c = callback;
    }

    public void a(CharSequence charsequence)
    {
        if (!k)
        {
            d(charsequence);
        }
    }

    public void a(to to, sz sz)
    {
        a.a(to, sz);
    }

    public void a(va va1)
    {
        if (f != null && f.getParent() == a)
        {
            a.removeView(f);
        }
        f = va1;
        if (va1 != null && o == 2)
        {
            a.addView(f, 0);
            zz zz1 = (zz)f.getLayoutParams();
            zz1.width = -2;
            zz1.height = -2;
            zz1.a = 0x800053;
            va1.a(true);
        }
    }

    public void a(boolean flag)
    {
        a.a(flag);
    }

    public Context b()
    {
        return a.getContext();
    }

    public void b(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public void b(CharSequence charsequence)
    {
        k = true;
        d(charsequence);
    }

    public void c(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = b().getString(i1);
        }
        m = ((CharSequence) (obj));
        q();
    }

    public void c(CharSequence charsequence)
    {
        l = charsequence;
        if ((e & 8) != 0)
        {
            a.c(charsequence);
        }
    }

    public boolean c()
    {
        return a.g();
    }

    public void d()
    {
        a.h();
    }

    public void d(int i1)
    {
        a.setVisibility(i1);
    }

    public boolean e()
    {
        return a.a();
    }

    public boolean f()
    {
        return a.b();
    }

    public boolean g()
    {
        return a.c();
    }

    public boolean h()
    {
        return a.d();
    }

    public boolean i()
    {
        return a.e();
    }

    public void j()
    {
        d = true;
    }

    public void k()
    {
        a.f();
    }

    public int l()
    {
        return e;
    }

    public int m()
    {
        return o;
    }

    public View n()
    {
        return g;
    }

    public Menu o()
    {
        return a.m();
    }
}
