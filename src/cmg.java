// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmg
    implements android.widget.AdapterView.OnItemClickListener
{

    final Cursor a;
    final DebugActivity b;

    public cmg(DebugActivity debugactivity, Cursor cursor)
    {
        b = debugactivity;
        a = cursor;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.moveToPosition(i);
        adapterview = a.getString(a.getColumnIndex("conversation_id"));
        DebugActivity.a(b, adapterview, "conversations");
    }
}
