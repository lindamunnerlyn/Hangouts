// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.content.Context;
import android.content.Intent;
import dbf;
import fd;

// Referenced classes of package com.google.android.apps.hangouts.service:
//            LoginManagerAccountRefreshService

public class AccountRefreshReceiver extends fd
{

    public AccountRefreshReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Intent intent1 = new Intent(context, com/google/android/apps/hangouts/service/LoginManagerAccountRefreshService);
        if (!intent.getAction().equals("com.google.android.apps.enterprise.dmagent.AUTO_REGISTRATION_FINISHED")) goto _L2; else goto _L1
_L1:
        if (!intent.getStringExtra("dmagent_autoregister_error_code").equals("SUCCESS")) goto _L4; else goto _L3
_L3:
        dbf.w();
_L6:
        a(context, intent1);
_L4:
        return;
_L2:
        if (intent.getAction().equals("android.accounts.LOGIN_ACCOUNTS_CHANGED"))
        {
            intent1.putExtra("new_accounts_only", true);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
