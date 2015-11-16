// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class to extends BaseAdapter
{

    ta a;
    final tn b;
    private int c;

    public to(tn tn1, ta ta1)
    {
        b = tn1;
        super();
        c = -1;
        a = ta1;
        a();
    }

    private void a()
    {
        te te1 = b.c.t();
        if (te1 != null)
        {
            ArrayList arraylist = b.c.n();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((te)arraylist.get(i) == te1)
                {
                    c = i;
                    return;
                }
            }

        }
        c = -1;
    }

    public te a(int i)
    {
        ArrayList arraylist;
        int j;
        if (b.d)
        {
            arraylist = a.n();
        } else
        {
            arraylist = a.k();
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
        return (te)arraylist.get(j);
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (b.d)
        {
            arraylist = a.n();
        } else
        {
            arraylist = a.k();
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
            view = b.b.inflate(tn.a, viewgroup, false);
        }
        viewgroup = (ts)view;
        if (b.e)
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
