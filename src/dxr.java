// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class dxr
    implements android.widget.AdapterView.OnItemClickListener
{

    final dxq a;

    dxr(dxq dxq1)
    {
        a = dxq1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        dxq.a(a, a.getView());
    }
}
