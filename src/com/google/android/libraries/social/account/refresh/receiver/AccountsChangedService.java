// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.account.refresh.receiver;

import android.app.IntentService;
import android.content.Intent;
import grm;
import gss;
import hlp;

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
            ((gss)hlp.a(this, gss)).a();
        }
        catch (grm grm1) { }
        finally
        {
            AccountsChangedReceiver.a(intent);
        }
        AccountsChangedReceiver.a(intent);
        return;
        throw exception;
    }
}
