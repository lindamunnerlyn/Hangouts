// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

final class wy
    implements android.widget.AdapterView.OnItemClickListener
{

    final wu a;
    final wx b;

    wy(wx wx1, wu wu1)
    {
        b = wx1;
        a = wu1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a.setSelection(i);
        if (b.a.getOnItemClickListener() != null)
        {
            b.a.performItemClick(view, i, wx.a(b).getItemId(i));
        }
        b.k();
    }
}
