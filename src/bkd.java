// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

public abstract class bkd extends bjy
    implements android.widget.AbsListView.OnScrollListener
{

    private int a;
    private int b;
    private int c;
    private int d;
    public AbsListView h;

    public bkd()
    {
        c = -1;
        d = -1;
    }

    protected void aa()
    {
        if (h != null)
        {
            a = h.getFirstVisiblePosition();
            View view = h.getChildAt(0);
            if (view != null)
            {
                b = view.getTop();
            } else
            {
                b = 0;
            }
            if (g.a(g.nS, "babel_extra_log_scrolling", false))
            {
                int i = a;
                int j = b;
                ebw.e("Babel_Scroll", (new StringBuilder(45)).append("saveScrollPosition: ").append(i).append(" : ").append(j).toString());
                return;
            }
        }
    }

    public void ab()
    {
        while (h == null || !(h instanceof ListView) || b == 0 && a == 0) 
        {
            return;
        }
        ((ListView)h).setSelectionFromTop(a, b);
        if (g.a(g.nS, "babel_extra_log_scrolling", false))
        {
            int i = a;
            int j = b;
            ebw.e("Babel_Scroll", (new StringBuilder(48)).append("restoreScrollPosition: ").append(i).append(" : ").append(j).toString());
        }
        a = 0;
        b = 0;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a = bundle.getInt("scroll_pos");
            b = bundle.getInt("scroll_off");
            return;
        } else
        {
            a = 0;
            b = 0;
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle, int i)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, i);
        h = (AbsListView)layoutinflater.findViewById(0x102000a);
        h.setOnScrollListener(this);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        h.setOnScrollListener(null);
        h = null;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (!getActivity().isFinishing() && h != null)
        {
            aa();
            bundle.putInt("scroll_pos", a);
            bundle.putInt("scroll_off", b);
        }
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (k > 0)
        {
            c = i + j;
            d = k;
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
