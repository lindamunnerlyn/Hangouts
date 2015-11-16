// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.List;

public final class dju extends BaseAdapter
{

    final List a;
    final List b;
    final DebugWakelocksActivity c;

    public dju(DebugWakelocksActivity debugwakelocksactivity, List list, List list1)
    {
        c = debugwakelocksactivity;
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
        return jhc.a(a.get(i), b.get(i));
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
            view1 = c.getLayoutInflater().inflate(h.jd, viewgroup, false);
        }
        view = (TextView)view1.findViewById(g.oO);
        viewgroup = (TextView)view1.findViewById(g.oP);
        view.setText((CharSequence)a.get(i));
        viewgroup.setText((CharSequence)b.get(i));
        return view1;
    }
}
