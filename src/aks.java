// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

final class aks extends BroadcastReceiver
{

    final akq a;

    aks(akq akq1)
    {
        a = akq1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        akq.b(a).setVisibility(8);
        if (intent.getIntExtra("set_callerid_result", -1) == 0)
        {
            akq.c(a).a(2256);
            akq.d(a).setText(context.getString(g.jk));
            akq.f(a).setText(context.getString(g.ji, new Object[] {
                ebz.o(akq.e(a))
            }));
            akq.g(a).setVisibility(8);
            akq.h(a).setText(context.getString(g.jf));
            akq.h(a).setOnClickListener(new akt(this));
            akq.d(a).sendAccessibilityEvent(32);
            return;
        } else
        {
            Toast.makeText(context, context.getString(g.je), 1).show();
            akq.g(a).setText(context.getString(g.jg));
            akq.h(a).setText(context.getString(g.jc));
            return;
        }
    }
}
