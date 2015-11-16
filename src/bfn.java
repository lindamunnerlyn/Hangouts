// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class bfn
    implements android.widget.AdapterView.OnItemClickListener
{

    final bfo a;
    final bfk b;

    bfn(bfk bfk, bfo bfo1)
    {
        b = bfk;
        a = bfo1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (a != null)
        {
            a.a((edk)view);
        }
    }
}
