// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class bjm extends ArrayAdapter
{

    final bjl a;

    public bjm(bjl bjl, Context context, String as[])
    {
        a = bjl;
        super(context, g.gU, as);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof TextView))
        {
            view = (TextView)LayoutInflater.from(getContext()).inflate(g.gU, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        viewgroup = (String)getItem(i);
        view.setText(viewgroup);
        view.setOnClickListener(new bjn(this, viewgroup));
        return view;
    }
}
