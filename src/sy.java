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

public final class sy
    implements android.widget.AdapterView.OnItemClickListener, tp
{

    Context a;
    LayoutInflater b;
    ta c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    sz h;
    private tq i;

    private sy(int j)
    {
        g = j;
        f = 0;
    }

    public sy(Context context, int j)
    {
        this(j);
        a = context;
        b = LayoutInflater.from(a);
    }

    public ListAdapter a()
    {
        if (h == null)
        {
            h = new sz(this);
        }
        return h;
    }

    public tr a(ViewGroup viewgroup)
    {
        if (d == null)
        {
            d = (ExpandedMenuView)b.inflate(g.bv, viewgroup, false);
            if (h == null)
            {
                h = new sz(this);
            }
            d.setAdapter(h);
            d.setOnItemClickListener(this);
        }
        return d;
    }

    public void a(Context context, ta ta1)
    {
        if (f == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, f);
        b = LayoutInflater.from(a);
_L4:
        c = ta1;
        if (h != null)
        {
            h.notifyDataSetChanged();
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

    public void a(ta ta1, boolean flag)
    {
        if (i != null)
        {
            i.a(ta1, flag);
        }
    }

    public void a(tq tq1)
    {
        i = tq1;
    }

    public boolean a(tu tu1)
    {
        if (!tu1.hasVisibleItems())
        {
            return false;
        }
        (new td(tu1)).a();
        if (i != null)
        {
            i.a(tu1);
        }
        return true;
    }

    public void b(boolean flag)
    {
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(te te)
    {
        return false;
    }

    public boolean c(te te)
    {
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        c.a(h.a(j), this, 0);
    }
}
