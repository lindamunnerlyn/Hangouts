// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.google.android.apps.hangouts.invite.OffnetworkInviteActivity;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

final class bwu
    implements android.view.View.OnClickListener
{

    final ani a;
    final String b;
    final bws c;

    bwu(bws bws1, ani ani1, String s)
    {
        c = bws1;
        a = ani1;
        b = s;
        super();
    }

    public void onClick(View view)
    {
        if (c.c() != null)
        {
            c.c().dismiss();
        }
        if (a.r())
        {
            view = BabelGatewayActivity.a(a.h(), null, b, "", false, null);
        } else
        {
            view = OffnetworkInviteActivity.a(c.getContext(), "", b);
        }
        c.getContext().startActivity(view);
    }
}
