// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class hke extends BaseAdapter
    implements hju
{

    private hkd a;
    private List b;
    private ArrayList c;
    private hkg d;
    private boolean e;
    private volatile boolean f;
    private Handler g;
    private Runnable h;

    public hke(hkd hkd1)
    {
        d = new hkg();
        e = false;
        f = false;
        g = new Handler();
        h = new hkf(this);
        a = hkd1;
        a.b = this;
        b = new ArrayList();
        c = new ArrayList();
        c();
    }

    private hjr a(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        } else
        {
            return (hjr)b.get(i);
        }
    }

    private static hkg a(hjr hjr1, hkg hkg1)
    {
        if (hkg1 == null)
        {
            hkg1 = new hkg();
        }
        hkg1.c = hjr1.getClass().getName();
        hkg1.a = hjr1.l();
        hkg1.b = hjr1.m();
        return hkg1;
    }

    private void a(List list, hkd hkd1)
    {
        hkd1.h();
        int j = hkd1.c();
        for (int i = 0; i < j; i++)
        {
            hjr hjr1 = hkd1.a(i);
            list.add(hjr1);
            if (!e && hjr1.F())
            {
                hkg hkg1 = a(hjr1, ((hkg) (null)));
                int k = Collections.binarySearch(c, hkg1);
                if (k < 0)
                {
                    k = -k;
                    c.add(k - 1, hkg1);
                }
            }
            if (hjr1 instanceof hkd)
            {
                hkd hkd2 = (hkd)hjr1;
                if (hkd2.f())
                {
                    a(list, hkd2);
                }
            }
            hjr1.b = this;
        }

    }

    public void a()
    {
        notifyDataSetChanged();
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public void b()
    {
        g.removeCallbacks(h);
        g.post(h);
    }

    void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        f = true;
        this;
        JVM INSTR monitorexit ;
        ArrayList arraylist = new ArrayList(b.size());
        a(arraylist, a);
        b = arraylist;
        notifyDataSetChanged();
        this;
        JVM INSTR monitorenter ;
        f = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return 0x8000000000000000L;
        } else
        {
            return a(i).q();
        }
    }

    public int getItemViewType(int i)
    {
        if (!e)
        {
            e = true;
        }
        hjr hjr1 = a(i);
        if (hjr1.F())
        {
            d = a(hjr1, d);
            i = Collections.binarySearch(c, d);
            if (i >= 0)
            {
                return i;
            }
        }
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        hjr hjr1 = a(i);
        d = a(hjr1, d);
        if (Collections.binarySearch(c, d) < 0)
        {
            view = null;
        }
        return hjr1.a(view, viewgroup);
    }

    public int getViewTypeCount()
    {
        if (!e)
        {
            e = true;
        }
        return Math.max(1, c.size());
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEnabled(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return true;
        } else
        {
            return a(i).p();
        }
    }
}
