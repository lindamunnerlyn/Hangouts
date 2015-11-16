// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            IncomingRing

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (IncomingRing.r() == null)
        {
            context = intent.getStringExtra("hangout_incoming_notification_tag");
            if (!TextUtils.isEmpty(context))
            {
                IncomingRing.a(context);
                IncomingRing.o();
            }
        } else
        if ("com.google.android.apps.hangouts.hangout.ignore".equals(context))
        {
            IncomingRing.r().m();
            return;
        }
    }

    public ()
    {
    }
}
