// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MessageListItemView;

final class eex
    implements android.view.View.OnClickListener
{

    final eew a;

    eex(eew eew1)
    {
        a = eew1;
        super();
    }

    public void onClick(View view)
    {
        if (eew.a(a).c())
        {
            return;
        }
        if (eew.a(a).g())
        {
            eew.b(a).b(eew.a(a).s());
            return;
        } else
        {
            eew.b(a).a((eew)view, eew.c(a), a.b);
            return;
        }
    }
}
