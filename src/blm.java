// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

final class blm extends bhi
{

    final bli e;

    public blm(bli bli1, BaseAdapter baseadapter)
    {
        e = bli1;
        super(bli1, true, baseadapter);
    }

    public View a(View view, ViewGroup viewgroup)
    {
        if (view == null || view.getId() != h.aw)
        {
            view = LayoutInflater.from(e.a()).inflate(g.fA, viewgroup, false);
        }
        ((TextView)view.findViewById(h.cI)).setText(l.hW);
        return view;
    }

    public void e()
    {
        if (d() != null)
        {
            ny ny1 = (ny)d();
            if (ny1.a() != null)
            {
                ny1.a().close();
            }
        }
    }
}
