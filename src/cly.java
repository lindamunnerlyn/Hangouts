// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cly extends BaseAdapter
{

    final Cursor a;
    final int b[];
    final DebugActivity c;

    public cly(DebugActivity debugactivity, Cursor cursor, int ai[])
    {
        c = debugactivity;
        a = cursor;
        b = ai;
        super();
    }

    public int getCount()
    {
        return a.getCount();
    }

    public Object getItem(int i)
    {
        a.moveToPosition(i);
        return a;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        TextView textview;
        TextView textview1;
        int ai[];
        int j;
        int k;
        view1 = view;
        if (view == null)
        {
            view1 = c.getLayoutInflater().inflate(g.gz, viewgroup, false);
        }
        textview = (TextView)view1.findViewById(h.da);
        textview1 = (TextView)view1.findViewById(h.gz);
        a.moveToPosition(i);
        ai = b;
        k = ai.length;
        view = "";
        j = 0;
_L2:
        int l;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ai[j];
        viewgroup = String.valueOf(view);
        String s = String.valueOf(a.getString(l));
        viewgroup = (new StringBuilder(String.valueOf(viewgroup).length() + 2 + String.valueOf(s).length())).append(viewgroup).append(s).append(", ").toString();
        view = viewgroup;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
        viewgroup;
        view = String.valueOf(view).concat("???, ");
          goto _L3
_L1:
        textview.setText((new StringBuilder(13)).append("@ ").append(i).toString());
        textview1.setText(view);
        view1.setBackgroundColor(-1);
        if (DebugActivity.i(c) != null && com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.b(DebugActivity.i(c)) != null)
        {
            i = a.getColumnIndex("conversation_id");
            if (i >= 0 && TextUtils.equals(a.getString(i), com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.b(DebugActivity.i(c))))
            {
                view1.setBackgroundColor(0xe000f0e0);
            }
        }
        return view1;
    }
}
