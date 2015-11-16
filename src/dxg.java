// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class dxg
{

    public dvy a;
    public final Intent b;
    public final Context c;

    public dxg(Context context, dvy dvy1, Intent intent)
    {
        c = context;
        a = dvy1;
        b = intent;
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleSetupController.ShowDialogCallback.onError");
        if (a != null)
        {
            String s = g.a(c, "babel_outgoing_wifi_call_show_dialog_error_action", "cellular");
            a.a(s, b);
        }
    }

    public void b()
    {
        ebw.e("Babel_telephony", "TeleSetupController.ShowDialogCallback.onTimeout");
        if (a != null)
        {
            String s = g.a(c, "babel_outgoing_wifi_call_show_dialog_timeout_action", "cellular");
            a.a(s, b);
        }
    }

    public void c()
    {
        a = null;
    }
}
