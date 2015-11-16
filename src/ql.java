// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ql
    implements android.widget.AdapterView.OnItemClickListener
{

    final qg a;
    final qi b;

    ql(qi qi1, qg qg1)
    {
        b = qi1;
        a = qg1;
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
