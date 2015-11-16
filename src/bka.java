// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public abstract class bka extends BaseAdapter
{

    private final edj a;
    private final Resources b;
    private final android.widget.AbsListView.LayoutParams c;
    private final String d;
    private edn e[];

    public bka(Resources resources, edj edj1)
    {
        b = resources;
        d = resources.getResourcePackageName(g.cq);
        a = edj1;
        int i = resources.getDimensionPixelSize(g.ef) + resources.getDimensionPixelSize(g.ee) * 2;
        c = new android.widget.AbsListView.LayoutParams(i, i);
    }

    private void a(int i)
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new edn[getCount() / 21 + 1];
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        if (e[i] != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        this;
        JVM INSTR monitorenter ;
        if (e[i] != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        int k = i * 21;
        Object obj;
        int l;
        l = Math.min(21, getCount() - k);
        obj = new int[l];
        int j = 0;
_L4:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[j] = g.a((Integer)getItem(k + j), 0);
        j++;
        if (true) goto _L4; else goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        e[i] = a.a(((int []) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (e != null)
        {
            for (int i = 0; i < e.length; i++)
            {
                if (e[i] != null)
                {
                    e[i].cancel(true);
                }
            }

        }
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public Object getItem(int i)
    {
        if (i >= 0 && i < getCount())
        {
            return Integer.valueOf((int)getItemId(i));
        } else
        {
            return Integer.valueOf(8194);
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int k;
        int l;
        if (view == null)
        {
            view = new ImageView(viewgroup.getContext());
            view.setLayoutParams(c);
            int j = b.getDimensionPixelSize(g.ee);
            view.setPadding(j, j, j, j);
        } else
        {
            view = (ImageView)view;
            view.setImageDrawable(null);
        }
        k = i / 21;
        a(k);
        l = g.a((Integer)getItem(i), 0);
        viewgroup = String.format("spoken_emoji_%04X", new Object[] {
            Integer.valueOf(l)
        });
        i = b.getIdentifier(viewgroup, "string", d);
        viewgroup = b;
        if (i == 0)
        {
            i = g.cq;
        }
        view.setContentDescription(viewgroup.getString(i));
        a.a(b, l, e[k], view);
        return view;
    }

    public boolean isEnabled(int i)
    {
        return i < getCount();
    }
}
