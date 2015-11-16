// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class vc extends BaseAdapter
{

    final va a;

    vc(va va1)
    {
        a = va1;
        super();
    }

    public int getCount()
    {
        return va.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((vd)va.a(a).getChildAt(i)).a();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return va.a(a, (pr)getItem(i));
        } else
        {
            ((vd)view).a((pr)getItem(i));
            return view;
        }
    }
}
