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

public final class blj extends BaseAdapter
{

    private final List a;
    private final android.view.View.OnClickListener b;
    private final Context c;

    public blj(Context context, List list, android.view.View.OnClickListener onclicklistener)
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
        blk blk1 = (blk)a.get(i);
        TextView textview;
        CheckBox checkbox;
        if (view == null || view.getId() != h.aC)
        {
            view = LayoutInflater.from(c).inflate(g.fz, viewgroup, false);
            ebr.a(view, true);
        }
        blk1.g = view;
        viewgroup = (TextView)view.findViewById(h.gz);
        textview = (TextView)view.findViewById(h.gm);
        checkbox = (CheckBox)view.findViewById(h.aa);
        viewgroup.setText(blk1.a);
        if (TextUtils.isEmpty(blk1.b))
        {
            textview.setText("");
            textview.setVisibility(8);
        } else
        {
            textview.setText(blk1.b);
            textview.setVisibility(0);
        }
        if (blk1.c)
        {
            checkbox.setVisibility(0);
            checkbox.setChecked(blk1.d);
        } else
        {
            checkbox.setVisibility(8);
        }
        blk1.a();
        view.setTag(Integer.valueOf(blk1.f));
        view.setOnClickListener(b);
        return view;
    }
}
