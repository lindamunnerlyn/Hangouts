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

final class csb extends ArrayAdapter
{

    final crw a;

    public csb(crw crw1, Context context, List list)
    {
        a = crw1;
        super(context, g.nX, list);
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return getView(i, view, viewgroup);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null || !(view instanceof TextView))
        {
            view = (TextView)LayoutInflater.from(crw.e(a)).inflate(g.nX, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        obj = (doi)getItem(i);
        view.setSingleLine(false);
        view.setSingleLine(true);
        viewgroup = String.valueOf(((doi) (obj)).d);
        obj = String.valueOf(((doi) (obj)).c);
        view.setText((new StringBuilder(String.valueOf(viewgroup).length() + 6 + String.valueOf(obj).length())).append(viewgroup).append(" \u202A(+").append(((String) (obj))).append(")\u202C").toString());
        return view;
    }
}
