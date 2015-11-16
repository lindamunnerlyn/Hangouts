// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CopyOnWriteArrayList;

final class bki extends bka
    implements bkh
{

    final bkb a;
    private View b;

    public bki(bkb bkb1, Resources resources)
    {
        a = bkb1;
        super(resources, bkb.a(bkb1));
        bkb.b(bkb1).a(this);
    }

    public void a(View view)
    {
        b = view;
    }

    public int getCount()
    {
        return Math.min(bkb.b(a).a().size(), bkb.c(a));
    }

    public long getItemId(int i)
    {
        return (long)g.a((Integer)bkb.b(a).a().get(i), 0);
    }

    public void i_()
    {
        if (b != null && bkb.b(a).a().size() > 0)
        {
            b.findViewById(h.bf).setVisibility(0);
            ViewGroup viewgroup = (ViewGroup)b.findViewById(h.eX);
            viewgroup.setVisibility(8);
            viewgroup.removeViewAt(0);
            b = null;
            notifyDataSetChanged();
        }
    }
}
