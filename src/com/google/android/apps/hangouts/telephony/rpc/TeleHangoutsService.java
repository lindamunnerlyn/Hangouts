// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony.rpc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import dwz;
import dxd;
import ebw;

public class TeleHangoutsService extends Service
{

    public TeleHangoutsService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        if (!"com.google.android.apps.hangouts.telephony.ITeleHangoutsService".equals(intent.getAction()))
        {
            ebw.g("Babel_telephony", "TeleHangoutService.onBind, unknown action; not binding");
            return null;
        }
        int i = dwz.a(this).b();
        if (i == -1)
        {
            ebw.e("Babel_telephony", "No account; not establishing binding.");
            return null;
        } else
        {
            return new dxd(this, i);
        }
    }
}
