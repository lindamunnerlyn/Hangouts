// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class ako extends BroadcastReceiver
{

    final aki a;

    ako(aki aki1)
    {
        a = aki1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        aki.f(a).dismiss();
        if (intent.getIntExtra("set_callerid_result", -1) != 0)
        {
            Toast.makeText(context, context.getString(g.iW), 1).show();
        } else
        {
            aki.g(a).a_(false);
        }
        eq.a(context).a(aki.h(a));
    }
}
