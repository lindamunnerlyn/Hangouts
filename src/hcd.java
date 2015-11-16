// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class hcd extends BaseAdapter
{

    private final Context a;
    private final int b[];
    private final boolean c;

    hcd(Context context, int ai[], boolean flag)
    {
        a = context;
        b = ai;
        c = flag;
    }

    public int getCount()
    {
        int j = b.length;
        int i;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return !c || i != b.length ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 32
    //                   1 67;
           goto _L1 _L2 _L3
_L1:
        viewgroup = null;
_L5:
        return viewgroup;
_L2:
        viewgroup = (hds)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new hds(a);
        }
        view.a(b[i]);
        return view;
_L3:
        viewgroup = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(g.to, null);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int getViewTypeCount()
    {
        return !c ? 1 : 2;
    }
}
