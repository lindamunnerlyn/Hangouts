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

final class akp extends BroadcastReceiver
{

    final akn a;

    akp(akn akn1)
    {
        a = akn1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        akn.b(a).setVisibility(8);
        if (intent.getIntExtra("set_callerid_result", -1) == 0)
        {
            akn.c(a).a(2256);
            akn.d(a).setText(context.getString(g.jc));
            akn.f(a).setText(context.getString(g.ja, new Object[] {
                eey.o(akn.e(a))
            }));
            akn.g(a).setVisibility(8);
            akn.h(a).setText(context.getString(g.iX));
            akn.h(a).setOnClickListener(new akq(this));
            akn.d(a).sendAccessibilityEvent(32);
            return;
        } else
        {
            Toast.makeText(context, context.getString(g.iW), 0).show();
            akn.g(a).setText(context.getString(g.iY));
            akn.h(a).setText(context.getString(g.iU));
            return;
        }
    }
}
