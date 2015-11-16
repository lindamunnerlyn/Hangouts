// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import android.app.IntentService;
import android.content.Intent;
import aoc;

public class ReferrerTrackingService extends IntentService
{

    public ReferrerTrackingService()
    {
        super("ReferrerTrackingService");
    }

    protected void onHandleIntent(Intent intent)
    {
        aoc.a(this, intent.getStringExtra("referrer"));
    }
}
