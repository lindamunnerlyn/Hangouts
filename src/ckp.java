// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.List;

public final class ckp extends BaseAdapter
{

    final List a;
    final List b;
    final DebugActivity c;

    public ckp(DebugActivity debugactivity, List list, List list1)
    {
        c = debugactivity;
        a = list;
        b = list1;
        super();
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return new clm(c, (String)a.get(i), b.get(i));
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = c.getLayoutInflater().inflate(g.gE, viewgroup, false);
        }
        view = (TextView)view1.findViewById(h.dm);
        viewgroup = (TextView)view1.findViewById(h.gT);
        String s = (String)a.get(i);
        view.setText(s);
        viewgroup.setText(DebugActivity.a(s, b.get(i)));
        return view1;
    }
}
