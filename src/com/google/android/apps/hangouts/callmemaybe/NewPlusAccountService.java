// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.callmemaybe;

import alj;
import android.app.IntentService;
import android.content.Intent;
import hlp;

public class NewPlusAccountService extends IntentService
{

    public NewPlusAccountService()
    {
        super("NewPlusAccountService");
    }

    protected void onHandleIntent(Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        ((alj)hlp.a(getApplicationContext(), alj)).a(i);
    }
}
