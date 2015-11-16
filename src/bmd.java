// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

final class bmd extends ArrayAdapter
{

    final bmc a;

    public bmd(bmc bmc, Context context, List list)
    {
        a = bmc;
        super(context, g.hb, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof TextView))
        {
            view = (TextView)LayoutInflater.from(getContext()).inflate(g.hb, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        view.setText((String)getItem(i));
        view.setOnClickListener(new bme(this, i));
        return view;
    }
}
