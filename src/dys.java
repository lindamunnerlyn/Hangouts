// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class dys
    implements android.widget.AdapterView.OnItemClickListener
{

    final dyr a;

    dys(dyr dyr1)
    {
        a = dyr1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            dyr.a(a).e();
            return;
        } else
        {
            dyr.a(a).f();
            return;
        }
    }
}
