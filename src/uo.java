// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class uo extends BaseAdapter
{

    final ActivityChooserView a;
    private ue b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public uo(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
        c = 4;
    }

    public int a()
    {
        int i = 0;
        int k = c;
        c = 0x7fffffff;
        int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int j1 = getCount();
        View view = null;
        int j = 0;
        for (; i < j1; i++)
        {
            view = getView(i, view, null);
            view.measure(l, i1);
            j = Math.max(j, view.getMeasuredWidth());
        }

        c = k;
        return j;
    }

    public void a(int i)
    {
        if (c != i)
        {
            c = i;
            notifyDataSetChanged();
        }
    }

    public void a(ue ue1)
    {
        ue ue2 = ActivityChooserView.a(a).e();
        if (ue2 != null && a.isShown())
        {
            ue2.unregisterObserver(ActivityChooserView.i(a));
        }
        b = ue1;
        if (ue1 != null && a.isShown())
        {
            ue1.registerObserver(ActivityChooserView.i(a));
        }
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            notifyDataSetChanged();
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        if (d != flag || e != flag1)
        {
            d = flag;
            e = flag1;
            notifyDataSetChanged();
        }
    }

    public ResolveInfo b()
    {
        return b.b();
    }

    public int c()
    {
        return b.a();
    }

    public int d()
    {
        return b.c();
    }

    public ue e()
    {
        return b;
    }

    public boolean f()
    {
        return d;
    }

    public int getCount()
    {
        int j = b.a();
        int i = j;
        if (!d)
        {
            i = j;
            if (b.b() != null)
            {
                i = j - 1;
            }
        }
        j = Math.min(i, c);
        i = j;
        if (f)
        {
            i = j + 1;
        }
        return i;
    }

    public Object getItem(int i)
    {
        int j;
        switch (getItemViewType(i))
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return null;

        case 0: // '\0'
            j = i;
            break;
        }
        if (!d)
        {
            j = i;
            if (b.b() != null)
            {
                j = i + 1;
            }
        }
        return b.a(j);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return !f || i != getCount() - 1 ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 107
    //                   1 36;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        if (view == null) goto _L5; else goto _L4
_L4:
        View view1 = view;
        if (view.getId() == 1) goto _L6; else goto _L5
_L5:
        view1 = LayoutInflater.from(a.getContext()).inflate(g.bt, viewgroup, false);
        view1.setId(1);
        ((TextView)view1.findViewById(g.bk)).setText(a.getContext().getString(g.bF));
_L6:
        return view1;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        view1 = view;
        if (view.getId() == g.bf) goto _L9; else goto _L8
_L8:
        view1 = LayoutInflater.from(a.getContext()).inflate(g.bt, viewgroup, false);
_L9:
        view = a.getContext().getPackageManager();
        viewgroup = (ImageView)view1.findViewById(g.bd);
        ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
        viewgroup.setImageDrawable(resolveinfo.loadIcon(view));
        ((TextView)view1.findViewById(g.bk)).setText(resolveinfo.loadLabel(view));
        if (d && i == 0 && e)
        {
            kb.a(view1, true);
            return view1;
        } else
        {
            kb.a(view1, false);
            return view1;
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }
}
