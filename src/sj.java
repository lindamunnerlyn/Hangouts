// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class sj extends vt
    implements tb
{

    private Context a;
    private ActionBarContextView b;
    private vu c;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private ta g;

    public sj(Context context, ActionBarContextView actionbarcontextview, vu vu1, boolean flag)
    {
        a = context;
        b = actionbarcontextview;
        c = vu1;
        g = (new ta(actionbarcontextview.getContext())).a();
        g.a(this);
        f = flag;
    }

    public MenuInflater a()
    {
        return new MenuInflater(b.getContext());
    }

    public void a(int j)
    {
        b(a.getString(j));
    }

    public void a(View view)
    {
        b.a(view);
        if (view != null)
        {
            view = new WeakReference(view);
        } else
        {
            view = null;
        }
        d = view;
    }

    public void a(CharSequence charsequence)
    {
        b.b(charsequence);
    }

    public void a(ta ta1)
    {
        d();
        b.a();
    }

    public void a(boolean flag)
    {
        super.a(flag);
        b.a(flag);
    }

    public boolean a(ta ta1, MenuItem menuitem)
    {
        return c.a(this, menuitem);
    }

    public Menu b()
    {
        return g;
    }

    public void b(int j)
    {
        a(a.getString(j));
    }

    public void b(CharSequence charsequence)
    {
        b.a(charsequence);
    }

    public void c()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            b.sendAccessibilityEvent(32);
            c.a(this);
            return;
        }
    }

    public void d()
    {
        c.b(this, g);
    }

    public CharSequence f()
    {
        return b.b();
    }

    public CharSequence g()
    {
        return b.c();
    }

    public boolean h()
    {
        return b.f();
    }

    public View i()
    {
        if (d != null)
        {
            return (View)d.get();
        } else
        {
            return null;
        }
    }
}
