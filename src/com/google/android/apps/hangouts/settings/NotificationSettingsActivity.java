// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import dot;
import dou;
import g;
import gmo;
import gng;
import hfa;
import hfg;
import hgt;
import hgx;
import hhj;
import hjm;

public class NotificationSettingsActivity extends hhj
{

    public NotificationSettingsActivity()
    {
        (new gng(this, q)).a(p).d();
        new hgt(this, q);
        new dot(this, this, q);
    }

    public static hfa a(Context context, hjm hjm1, hfg hfg1, int i, String s, String s1, int j, String s2)
    {
        String s3 = context.getString(i);
        gmo gmo1 = (gmo)hgx.a(context, gmo);
        i = gmo1.a();
        context = new Intent(context, com/google/android/apps/hangouts/settings/NotificationSettingsActivity);
        context.putExtra("account_id", i);
        context.putExtra("title_key", s3);
        context.putExtra("sound_key", s1);
        context.putExtra("sound_type", j);
        context.putExtra("vibrate_key", s2);
        context.putExtra("notifications_key", s);
        context = hfg1.a(s3, null, context);
        hjm1.a(new dou(context, gmo1.c(), s, s2, s1));
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fL);
        setTitle(getIntent().getStringExtra("title_key"));
    }
}
