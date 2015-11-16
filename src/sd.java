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

public final class sd extends vr
    implements sz
{

    final rz a;
    private final Context b;
    private final sy c;
    private vs d;
    private WeakReference e;

    public sd(rz rz1, Context context, vs vs1)
    {
        a = rz1;
        super();
        b = context;
        d = vs1;
        c = (new sy(context)).a();
        c.a(this);
    }

    public MenuInflater a()
    {
        return new sk(b);
    }

    public void a(int j)
    {
        b(rz.j(a).getResources().getString(j));
    }

    public void a(View view)
    {
        rz.h(a).a(view);
        e = new WeakReference(view);
    }

    public void a(CharSequence charsequence)
    {
        rz.h(a).b(charsequence);
    }

    public void a(sy sy1)
    {
        if (d == null)
        {
            return;
        } else
        {
            d();
            rz.h(a).a();
            return;
        }
    }

    public void a(boolean flag)
    {
        super.a(flag);
        rz.h(a).a(flag);
    }

    public boolean a(sy sy1, MenuItem menuitem)
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
        a(rz.j(a).getResources().getString(j));
    }

    public void b(CharSequence charsequence)
    {
        rz.h(a).a(charsequence);
    }

    public void c()
    {
        if (a.a != this)
        {
            return;
        }
        if (!rz.a(rz.f(a), rz.g(a)))
        {
            a.b = this;
            a.c = d;
        } else
        {
            d.a(this);
        }
        d = null;
        a.f(false);
        rz.h(a).d();
        rz.i(a).a().sendAccessibilityEvent(32);
        rz.e(a).b(a.d);
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
        return rz.h(a).b();
    }

    public CharSequence g()
    {
        return rz.h(a).c();
    }

    public boolean h()
    {
        return rz.h(a).f();
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
