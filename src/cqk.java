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

final class cqk extends ArrayAdapter
{

    final cqf a;

    public cqk(cqf cqf1, Context context, List list)
    {
        a = cqf1;
        super(context, g.nV, list);
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
            view = (TextView)LayoutInflater.from(cqf.e(a)).inflate(g.nV, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        obj = (dll)getItem(i);
        view.setSingleLine(false);
        view.setSingleLine(true);
        viewgroup = String.valueOf(((dll) (obj)).d);
        obj = String.valueOf(((dll) (obj)).c);
        view.setText((new StringBuilder(String.valueOf(viewgroup).length() + 6 + String.valueOf(obj).length())).append(viewgroup).append(" \u202A(+").append(((String) (obj))).append(")\u202C").toString());
        return view;
    }
}
