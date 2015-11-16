// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class bhs extends BaseAdapter
{

    public final Context a;
    private bhu b[];
    private int c;
    private int d;
    private boolean e;
    private bht f;

    public bhs(Context context)
    {
        c = 0;
        d = 0;
        e = true;
        a = context;
        f = new bht(this);
        b = new bhu[2];
    }

    private void d()
    {
        int i = 0;
        if (!e)
        {
            d = 0;
            while (i < c) 
            {
                d = d + b[i].c();
                i++;
            }
        }
    }

    public Context a()
    {
        return a;
    }

    public void a(bhu bhu1)
    {
        if (c >= b.length)
        {
            bhu abhu[] = new bhu[c + 2];
            System.arraycopy(b, 0, abhu, 0, c);
            b = abhu;
        }
        bhu abhu1[] = b;
        int i = c;
        c = i + 1;
        abhu1[i] = bhu1;
        bhu1.d().registerDataSetObserver(f);
        c();
        notifyDataSetChanged();
    }

    public void b()
    {
        for (int i = 0; i < c; i++)
        {
            bhu bhu1 = b[i];
            bhu1.e();
            bhu1.d().unregisterDataSetObserver(f);
        }

        c();
        notifyDataSetChanged();
    }

    public void c()
    {
        e = false;
    }

    public int getCount()
    {
        d();
        return d;
    }

    public Object getItem(int i)
    {
        int j = 0;
        d();
        int l;
        for (int k = 0; j < c; k = l)
        {
            l = b[j].c() + k;
            if (i >= k && i < l)
            {
                i -= k;
                bhu bhu1 = b[j];
                if (bhu1.b() && i == 0 && (bhu1.c() > 0 || bhu1.a()))
                {
                    return null;
                } else
                {
                    return b[j].d().getItem(i);
                }
            }
            j++;
        }

        return null;
    }

    public long getItemId(int i)
    {
        int j = 0;
        d();
        int l;
        for (int k = 0; j < c; k = l)
        {
            l = b[j].c() + k;
            if (i >= k && i < l)
            {
                i -= k;
                bhu bhu1 = b[j];
                if (bhu1.b() && i == 0 && (bhu1.c() > 0 || bhu1.a()))
                {
                    return 0L;
                } else
                {
                    return b[j].d().getItemId(i);
                }
            }
            j++;
        }

        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = 0;
        d();
        int k = 0;
        while (j < c) 
        {
            bhu bhu1 = b[j];
            int l = bhu1.c() + k;
            if (i >= k && i < l)
            {
                i -= k;
                if (bhu1.b() && (bhu1.c() > 0 || bhu1.a()))
                {
                    i--;
                }
                if (i == -1)
                {
                    view = bhu1.a(view, viewgroup);
                } else
                {
                    view = bhu1.d().getView(i, view, viewgroup);
                }
                if (view == null)
                {
                    throw new NullPointerException((new StringBuilder(69)).append("View should not be null, partition: ").append(j).append(" position: ").append(i).toString());
                } else
                {
                    return view;
                }
            }
            j++;
            k = l;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }
}
