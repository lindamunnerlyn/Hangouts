// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ckr
    implements android.view.View.OnClickListener
{

    final String a;
    final View b;
    final View c;
    final View d;
    final DebugActivity e;

    public ckr(DebugActivity debugactivity, String s, View view, View view1, View view2)
    {
        e = debugactivity;
        a = s;
        b = view;
        c = view1;
        d = view2;
        super();
    }

    public void onClick(View view)
    {
        view = DebugActivity.e(e).e().a("messages", null, "conversation_id=?", new String[] {
            a
        }, "timestamp ASC");
        Object obj = e.getLayoutInflater().inflate(g.fM, null);
        DebugActivity.a(e, ((View) (obj)), view, new cks(this));
        b.setVisibility(8);
        c.setVisibility(8);
        d.setVisibility(8);
        obj = (ListView)((View) (obj)).findViewById(0x102000a);
        ((ListView) (obj)).setAdapter(DebugActivity.a(e, view, new int[] {
            view.getColumnIndex("text")
        }));
        ((ListView) (obj)).setOnItemClickListener(DebugActivity.a(e, view));
    }
}
