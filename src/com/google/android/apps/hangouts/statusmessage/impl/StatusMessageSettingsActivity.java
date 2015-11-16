// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.statusmessage.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import g;
import gng;
import hhw;

public class StatusMessageSettingsActivity extends hhw
{

    public StatusMessageSettingsActivity()
    {
        (new gng(this, l)).a(k);
    }

    public static void a(Context context, int i, String s)
    {
        Intent intent = new Intent(context, com/google/android/apps/hangouts/statusmessage/impl/StatusMessageSettingsActivity);
        intent.putExtra("account_id", i);
        intent.putExtra("status_message", s);
        context.startActivity(intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.oR);
    }
}
