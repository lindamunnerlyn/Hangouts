// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.List;

public final class bls extends BaseAdapter
{

    private final List a;
    private final android.view.View.OnClickListener b;
    private final Context c;

    public bls(Context context, List list, android.view.View.OnClickListener onclicklistener)
    {
        c = context;
        a = list;
        b = onclicklistener;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a;
    }

    public long getItemId(int i)
    {
        return (long)(-i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        blt blt1 = (blt)a.get(i);
        TextView textview;
        CheckBox checkbox;
        if (view == null || view.getId() != h.ax)
        {
            view = LayoutInflater.from(c).inflate(g.fx, viewgroup, false);
            eep.a(view, true);
        }
        blt1.g = view;
        viewgroup = (TextView)view.findViewById(h.gh);
        textview = (TextView)view.findViewById(h.fU);
        checkbox = (CheckBox)view.findViewById(h.Z);
        viewgroup.setText(blt1.a);
        if (TextUtils.isEmpty(blt1.b))
        {
            textview.setText("");
            textview.setVisibility(8);
        } else
        {
            textview.setText(blt1.b);
            textview.setVisibility(0);
        }
        if (blt1.c)
        {
            checkbox.setVisibility(0);
            checkbox.setChecked(blt1.d);
        } else
        {
            checkbox.setVisibility(8);
        }
        blt1.a();
        view.setTag(Integer.valueOf(blt1.f));
        view.setOnClickListener(b);
        return view;
    }
}
