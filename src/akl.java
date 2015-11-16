// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class akl extends BroadcastReceiver
{

    final akf a;

    akl(akf akf1)
    {
        a = akf1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.g.dismiss();
        if (intent.getIntExtra("set_callerid_result", -1) != 0)
        {
            Toast.makeText(context, context.getString(g.iO), 0).show();
        } else
        {
            a.e.a_(false);
        }
        eq.a(context).a(a.f);
    }
}
