// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class sx extends BaseAdapter
{

    final sw a;
    private int b;

    public sx(sw sw1)
    {
        a = sw1;
        super();
        b = -1;
        a();
    }

    private void a()
    {
        tc tc1 = a.c.t();
        if (tc1 != null)
        {
            ArrayList arraylist = a.c.n();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((tc)arraylist.get(i) == tc1)
                {
                    b = i;
                    return;
                }
            }

        }
        b = -1;
    }

    public tc a(int i)
    {
        ArrayList arraylist = a.c.n();
        int j = sw.a(a) + i;
        i = j;
        if (b >= 0)
        {
            i = j;
            if (j >= b)
            {
                i = j + 1;
            }
        }
        return (tc)arraylist.get(i);
    }

    public int getCount()
    {
        int i = a.c.n().size() - sw.a(a);
        if (b < 0)
        {
            return i;
        } else
        {
            return i - 1;
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
            view = a.b.inflate(a.f, viewgroup, false);
        }
        ((tq)view).a(a(i));
        return view;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
