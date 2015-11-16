// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class ve extends BaseAdapter
{

    final vc a;

    ve(vc vc1)
    {
        a = vc1;
        super();
    }

    public int getCount()
    {
        return vc.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((vf)vc.a(a).getChildAt(i)).a();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return vc.a(a, (pt)getItem(i));
        } else
        {
            ((vf)view).a((pt)getItem(i));
            return view;
        }
    }
}
