// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.app.IntentService;
import android.content.Intent;
import ebw;
import fd;
import gnf;
import gxa;
import gxd;
import hgx;

public class LoginManagerAccountRefreshService extends IntentService
{

    public LoginManagerAccountRefreshService()
    {
        super("LoginManagerAccountRefreshService");
    }

    protected void onHandleIntent(Intent intent)
    {
        ((gxa)hgx.a(this, gxa)).a((new gxd()).a(intent.getBooleanExtra("new_accounts_only", false)).c());
_L2:
        fd.a(intent);
        return;
        Object obj;
        obj;
        ebw.d("AccountRefresh", "Loading device accounts failed", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        fd.a(intent);
        throw obj;
    }
}
