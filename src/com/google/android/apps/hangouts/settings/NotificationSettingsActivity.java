// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import drm;
import drn;
import g;
import gqu;
import grn;
import hjr;
import hjx;
import hll;
import hlp;
import hmb;
import hof;

public class NotificationSettingsActivity extends hmb
{

    public NotificationSettingsActivity()
    {
        (new grn(this, r)).a(q).d();
        new hll(this, r);
        new drm(this, this, r);
    }

    public static hjr a(Context context, hof hof1, hjx hjx1, int i, String s, String s1, int j, String s2)
    {
        String s3 = context.getString(i);
        gqu gqu1 = (gqu)hlp.a(context, gqu);
        i = gqu1.a();
        context = new Intent(context, com/google/android/apps/hangouts/settings/NotificationSettingsActivity);
        context.putExtra("account_id", i);
        context.putExtra("title_key", s3);
        context.putExtra("sound_key", s1);
        context.putExtra("sound_type", j);
        context.putExtra("vibrate_key", s2);
        context.putExtra("notifications_key", s);
        context = hjx1.a(s3, null, context);
        hof1.a(new drn(context, gqu1.c(), s, s2, s1));
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fJ);
        setTitle(getIntent().getStringExtra("title_key"));
    }
}
