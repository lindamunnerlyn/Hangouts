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

public final class dll extends BaseAdapter
{

    final List a;
    final List b;
    final DebugWakelocksActivity c;

    dll(DebugWakelocksActivity debugwakelocksactivity, List list, List list1)
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
        return jnw.a(a.get(i), b.get(i));
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
            view1 = c.getLayoutInflater().inflate(h.jb, viewgroup, false);
        }
        view = (TextView)view1.findViewById(g.oQ);
        viewgroup = (TextView)view1.findViewById(g.oR);
        view.setText((CharSequence)a.get(i));
        viewgroup.setText((CharSequence)b.get(i));
        return view1;
    }
}
