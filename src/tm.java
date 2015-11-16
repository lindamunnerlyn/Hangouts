// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class tm extends BaseAdapter
{

    final tl a;
    private sy b;
    private int c;

    public tm(tl tl1, sy sy1)
    {
        a = tl1;
        super();
        c = -1;
        b = sy1;
        a();
    }

    static sy a(tm tm1)
    {
        return tm1.b;
    }

    private void a()
    {
        tc tc1 = tl.c(a).t();
        if (tc1 != null)
        {
            ArrayList arraylist = tl.c(a).n();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((tc)arraylist.get(i) == tc1)
                {
                    c = i;
                    return;
                }
            }

        }
        c = -1;
    }

    public tc a(int i)
    {
        ArrayList arraylist;
        int j;
        if (tl.a(a))
        {
            arraylist = b.n();
        } else
        {
            arraylist = b.k();
        }
        j = i;
        if (c >= 0)
        {
            j = i;
            if (i >= c)
            {
                j = i + 1;
            }
        }
        return (tc)arraylist.get(j);
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (tl.a(a))
        {
            arraylist = b.n();
        } else
        {
            arraylist = b.k();
        }
        if (c < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = tl.b(a).inflate(tl.a, viewgroup, false);
        }
        viewgroup = (tq)view;
        if (a.b)
        {
            ((ListMenuItemView)view).c();
        }
        viewgroup.a(a(i));
        return view;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
