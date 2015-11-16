// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class qj
    implements android.widget.AdapterView.OnItemClickListener
{

    final qe a;
    final qg b;

    qj(qg qg1, qe qe1)
    {
        b = qg1;
        a = qe1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.u.onClick(a.a, i);
        if (!b.E)
        {
            a.a.dismiss();
        }
    }
}
