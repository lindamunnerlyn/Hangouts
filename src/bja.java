// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class bja extends ArrayAdapter
{

    final biz a;

    public bja(biz biz, Context context, String as[])
    {
        a = biz;
        super(context, g.hc, as);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof TextView))
        {
            view = (TextView)LayoutInflater.from(getContext()).inflate(g.hc, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        viewgroup = (String)getItem(i);
        view.setText(viewgroup);
        view.setOnClickListener(new bjb(this, viewgroup));
        return view;
    }
}
