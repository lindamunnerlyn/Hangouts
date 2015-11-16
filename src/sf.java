// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class sf extends vt
    implements tb
{

    final sb a;
    private final Context b;
    private final ta c;
    private vu d;
    private WeakReference e;

    public sf(sb sb1, Context context, vu vu1)
    {
        a = sb1;
        super();
        b = context;
        d = vu1;
        c = (new ta(context)).a();
        c.a(this);
    }

    public MenuInflater a()
    {
        return new sm(b);
    }

    public void a(int j)
    {
        b(sb.j(a).getResources().getString(j));
    }

    public void a(View view)
    {
        sb.h(a).a(view);
        e = new WeakReference(view);
    }

    public void a(CharSequence charsequence)
    {
        sb.h(a).b(charsequence);
    }

    public void a(ta ta1)
    {
        if (d == null)
        {
            return;
        } else
        {
            d();
            sb.h(a).a();
            return;
        }
    }

    public void a(boolean flag)
    {
        super.a(flag);
        sb.h(a).a(flag);
    }

    public boolean a(ta ta1, MenuItem menuitem)
    {
        if (d != null)
        {
            return d.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public Menu b()
    {
        return c;
    }

    public void b(int j)
    {
        a(sb.j(a).getResources().getString(j));
    }

    public void b(CharSequence charsequence)
    {
        sb.h(a).a(charsequence);
    }

    public void c()
    {
        if (a.a != this)
        {
            return;
        }
        if (!sb.a(sb.f(a), sb.g(a)))
        {
            a.b = this;
            a.c = d;
        } else
        {
            d.a(this);
        }
        d = null;
        a.f(false);
        sb.h(a).d();
        sb.i(a).a().sendAccessibilityEvent(32);
        sb.e(a).b(a.d);
        a.a = null;
    }

    public void d()
    {
        if (a.a != this)
        {
            return;
        }
        c.g();
        d.b(this, c);
        c.h();
        return;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public boolean e()
    {
        c.g();
        boolean flag = d.a(this, c);
        c.h();
        return flag;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public CharSequence f()
    {
        return sb.h(a).b();
    }

    public CharSequence g()
    {
        return sb.h(a).c();
    }

    public boolean h()
    {
        return sb.h(a).f();
    }

    public View i()
    {
        if (e != null)
        {
            return (View)e.get();
        } else
        {
            return null;
        }
    }
}
