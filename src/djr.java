// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.List;

public final class djr extends ArrayAdapter
{

    final DebugWakelocksActivity a;

    public djr(DebugWakelocksActivity debugwakelocksactivity, Context context, int i, int j, List list)
    {
        a = debugwakelocksactivity;
        super(context, i, j, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (TextView)view.findViewById(g.oO);
        viewgroup.setTextColor(a.getResources().getColor(g.oN));
        int j = ((Intent)((jhc)getItem(i)).a).getIntExtra("android.support.content.wakelockid", -1);
        viewgroup.setText((new StringBuilder(11)).append(j).toString());
        viewgroup = (TextView)view.findViewById(g.oP);
        viewgroup.setTextColor(a.getResources().getColor(g.oN));
        viewgroup.setText(String.format("%.02fs", new Object[] {
            Double.valueOf((double)(new ldg((ldq)((jhc)getItem(i)).b, ldm.a())).a() / 1000D)
        }));
        return view;
    }
}
