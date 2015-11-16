// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ckx
    implements android.widget.AdapterView.OnItemClickListener
{

    final Cursor a;
    final DebugActivity b;

    public ckx(DebugActivity debugactivity, Cursor cursor)
    {
        b = debugactivity;
        a = cursor;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.moveToPosition(i);
        adapterview = a.getString(a.getColumnIndex("_id"));
        adapterview = DebugActivity.e(b).e().a("conversation_participants_view", null, "_id=?", new String[] {
            adapterview
        }, null);
        view = b.getLayoutInflater().inflate(g.fM, null);
        ((ListView)view.findViewById(0x102000a)).setAdapter(DebugActivity.c(b, adapterview));
        DebugActivity.a(b, view, adapterview, null);
    }
}
