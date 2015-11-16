// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.google.android.apps.hangouts.views.BalanceView;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;

public final class edf
    implements android.view.View.OnClickListener
{

    final BalanceView a;

    public edf(BalanceView balanceview)
    {
        a = balanceview;
        super();
    }

    public void onClick(View view)
    {
        view = dbf.e(BalanceView.b(a).a());
        if (view.X() == 2)
        {
            a.getContext().startActivity(g.a(view, null));
            return;
        } else
        {
            VoiceRatesAndBalanceView.a(a.getContext());
            return;
        }
    }
}
