// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CopyOnWriteArrayList;

final class bjw extends bjo
    implements bjv
{

    final bjp a;
    private View b;

    public bjw(bjp bjp1, Resources resources)
    {
        a = bjp1;
        super(resources, bjp.a(bjp1));
        bjp.b(bjp1).a(this);
    }

    public void a(View view)
    {
        b = view;
    }

    public void g_()
    {
        if (b != null && bjp.b(a).a().size() > 0)
        {
            b.findViewById(h.bl).setVisibility(0);
            ViewGroup viewgroup = (ViewGroup)b.findViewById(h.fp);
            viewgroup.setVisibility(8);
            viewgroup.removeViewAt(0);
            b = null;
            notifyDataSetChanged();
        }
    }

    public int getCount()
    {
        return Math.min(bjp.b(a).a().size(), bjp.c(a));
    }

    public long getItemId(int i)
    {
        return (long)g.a((Integer)bjp.b(a).a().get(i), 0);
    }
}
