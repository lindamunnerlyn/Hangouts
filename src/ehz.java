// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class ehz
    implements android.view.View.OnClickListener
{

    final ehy a;

    ehz(ehy ehy1)
    {
        a = ehy1;
        super();
    }

    public void onClick(View view)
    {
        if (ehy.a(a).c())
        {
            return;
        }
        if (ehy.a(a).g())
        {
            ehy.b(a).b(ehy.a(a).s());
            return;
        } else
        {
            ehy.b(a).a((ehy)view, ehy.c(a), a.b);
            return;
        }
    }
}
