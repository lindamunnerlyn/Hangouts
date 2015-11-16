// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

final class qm
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final qg b;
    final qi c;

    qm(qi qi1, ListView listview, qg qg1)
    {
        c = qi1;
        a = listview;
        b = qg1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (c.C != null)
        {
            c.C[i] = a.isItemChecked(i);
        }
        c.G.onClick(b.a, i, a.isItemChecked(i));
    }
}
