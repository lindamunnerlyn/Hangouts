// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.notifications;

import android.content.Intent;
import apc;
import ccv;
import cde;
import cdf;
import cdl;
import cdm;
import cdw;
import cdx;
import dln;
import dlo;
import ebw;
import jhb;

public class NotificationService extends dln
{

    public NotificationService()
    {
        super("NotificationService");
    }

    public void a(Intent intent, jhb jhb)
    {
        try
        {
            super.a(intent, jhb);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jhb jhb)
        {
            int i = intent.getIntExtra("account_id", -1);
            ebw.f("Babel", (new StringBuilder(71)).append("Ignoring NotificationService intent for invalid account id: ").append(i).toString());
            return;
        }
    }

    protected dlo[] a()
    {
        return (new dlo[] {
            new cdx(), new cdm(), new cdf(), new ccv(), new cdw(), new cdl(), new cde()
        });
    }
}
