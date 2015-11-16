// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

final class xa
    implements android.widget.AdapterView.OnItemClickListener
{

    final ww a;
    final wz b;

    xa(wz wz1, ww ww1)
    {
        b = wz1;
        a = ww1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a.setSelection(i);
        if (b.a.getOnItemClickListener() != null)
        {
            b.a.performItemClick(view, i, wz.a(b).getItemId(i));
        }
        b.k();
    }
}
