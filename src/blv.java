// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

final class blv extends bhu
{

    final blr e;

    public blv(blr blr1, BaseAdapter baseadapter)
    {
        e = blr1;
        super(blr1, true, baseadapter);
    }

    public View a(View view, ViewGroup viewgroup)
    {
        if (view == null || view.getId() != h.ar)
        {
            view = LayoutInflater.from(e.a()).inflate(g.fy, viewgroup, false);
        }
        ((TextView)view.findViewById(h.cy)).setText(l.hq);
        return view;
    }

    public void e()
    {
        if (d() != null)
        {
            oa oa1 = (oa)d();
            if (oa1.a() != null)
            {
                oa1.a().close();
            }
        }
    }
}
