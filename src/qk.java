// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

final class qk
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final qe b;
    final qg c;

    qk(qg qg1, ListView listview, qe qe1)
    {
        c = qg1;
        a = listview;
        b = qe1;
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
