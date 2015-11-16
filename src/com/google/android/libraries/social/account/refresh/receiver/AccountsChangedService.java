// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.account.refresh.receiver;

import android.app.IntentService;
import android.content.Intent;
import gnf;
import gok;
import hgx;

// Referenced classes of package com.google.android.libraries.social.account.refresh.receiver:
//            AccountsChangedReceiver

public final class AccountsChangedService extends IntentService
{

    public AccountsChangedService()
    {
        super("AccountsChangedService");
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        Exception exception;
        try
        {
            ((gok)hgx.a(this, gok)).a();
        }
        catch (gnf gnf1) { }
        finally
        {
            AccountsChangedReceiver.a(intent);
        }
        AccountsChangedReceiver.a(intent);
        return;
        throw exception;
    }
}
