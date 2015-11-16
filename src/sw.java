// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.internal.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public final class sw
    implements android.widget.AdapterView.OnItemClickListener, tn
{

    Context a;
    LayoutInflater b;
    sy c;
    ExpandedMenuView d;
    int e;
    int f;
    sx g;
    private int h;
    private to i;

    private sw(int j)
    {
        f = j;
        e = 0;
    }

    public sw(Context context, int j)
    {
        this(j);
        a = context;
        b = LayoutInflater.from(a);
    }

    static int a(sw sw1)
    {
        return sw1.h;
    }

    public ListAdapter a()
    {
        if (g == null)
        {
            g = new sx(this);
        }
        return g;
    }

    public tp a(ViewGroup viewgroup)
    {
        if (d == null)
        {
            d = (ExpandedMenuView)b.inflate(g.bv, viewgroup, false);
            if (g == null)
            {
                g = new sx(this);
            }
            d.setAdapter(g);
            d.setOnItemClickListener(this);
        }
        return d;
    }

    public void a(Context context, sy sy1)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = sy1;
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(sy sy1, boolean flag)
    {
        if (i != null)
        {
            i.a(sy1, flag);
        }
    }

    public void a(to to1)
    {
        i = to1;
    }

    public boolean a(ts ts1)
    {
        if (!ts1.hasVisibleItems())
        {
            return false;
        }
        (new tb(ts1)).a();
        if (i != null)
        {
            i.a(ts1);
        }
        return true;
    }

    public void b(boolean flag)
    {
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(tc tc)
    {
        return false;
    }

    public boolean c(tc tc)
    {
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        c.a(g.a(j), this, 0);
    }
}
