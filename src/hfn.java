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

public final class hfn extends BaseAdapter
    implements hfd
{

    private hfm a;
    private List b;
    private ArrayList c;
    private hfp d;
    private boolean e;
    private volatile boolean f;
    private Handler g;
    private Runnable h;

    public hfn(hfm hfm1)
    {
        d = new hfp();
        e = false;
        f = false;
        g = new Handler();
        h = new hfo(this);
        a = hfm1;
        a.a = this;
        b = new ArrayList();
        c = new ArrayList();
        c();
    }

    private hfa a(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        } else
        {
            return (hfa)b.get(i);
        }
    }

    private static hfp a(hfa hfa1, hfp hfp1)
    {
        if (hfp1 == null)
        {
            hfp1 = new hfp();
        }
        hfp.a(hfp1, hfa1.getClass().getName());
        hfp.a(hfp1, hfa1.l());
        hfp.b(hfp1, hfa1.m());
        return hfp1;
    }

    static void a(hfn hfn1)
    {
        hfn1.c();
    }

    private void a(List list, hfm hfm1)
    {
        hfm1.h();
        int j = hfm1.c();
        for (int i = 0; i < j; i++)
        {
            hfa hfa1 = hfm1.a(i);
            list.add(hfa1);
            if (!e && hfa1.F())
            {
                hfp hfp1 = a(hfa1, ((hfp) (null)));
                int k = Collections.binarySearch(c, hfp1);
                if (k < 0)
                {
                    k = -k;
                    c.add(k - 1, hfp1);
                }
            }
            if (hfa1 instanceof hfm)
            {
                hfm hfm2 = (hfm)hfa1;
                if (hfm2.f())
                {
                    a(list, hfm2);
                }
            }
            hfa1.a = this;
        }

    }

    private void c()
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
        hfa hfa1 = a(i);
        if (hfa1.F())
        {
            d = a(hfa1, d);
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
        hfa hfa1 = a(i);
        d = a(hfa1, d);
        if (Collections.binarySearch(c, d) < 0)
        {
            view = null;
        }
        return hfa1.a(view, viewgroup);
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
