// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

final class qk extends CursorAdapter
{

    final ListView a;
    final qg b;
    final qi c;
    private final int d;
    private final int e;

    qk(qi qi1, Context context, Cursor cursor, ListView listview, qg qg1)
    {
        c = qi1;
        a = listview;
        b = qg1;
        super(context, cursor, false);
        qi1 = getCursor();
        d = qi1.getColumnIndexOrThrow(c.I);
        e = qi1.getColumnIndexOrThrow(c.J);
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        ((CheckedTextView)view.findViewById(0x1020014)).setText(cursor.getString(d));
        view = a;
        int i = cursor.getPosition();
        boolean flag;
        if (cursor.getInt(e) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setItemChecked(i, flag);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return c.b.inflate(b.l, viewgroup, false);
    }
}
