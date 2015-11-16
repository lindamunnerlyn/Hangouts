// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class clk extends ArrayAdapter
{

    final DebugActivity a;

    public clk(DebugActivity debugactivity, Context context, int i, int j)
    {
        a = debugactivity;
        super(context, i, j);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        viewgroup = (TextView)view.findViewById(h.dm);
        TextView textview = (TextView)view.findViewById(h.gT);
        Intent intent = (Intent)getItem(i);
        String s = String.valueOf(intent.getStringExtra("___time"));
        String s1 = DebugActivity.b(a).a();
        viewgroup.setText((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(" ").append(s1).toString());
        textview.setText(RealTimeChatService.a(intent, DebugActivity.b(a)));
        return view;
    }
}
