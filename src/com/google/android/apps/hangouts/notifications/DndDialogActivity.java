// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.notifications;

import android.content.Context;
import android.content.Intent;
import ceg;
import drj;
import g;
import gcz;
import gda;
import gdd;
import gqu;
import grn;
import hlp;
import hly;

public class DndDialogActivity extends hly
{

    private final gqu c;

    public DndDialogActivity()
    {
        c = (new grn(this, b)).a(a);
    }

    public static Intent a(Context context, int i)
    {
        context = new Intent(context, com/google/android/apps/hangouts/notifications/DndDialogActivity);
        context.putExtra("account_id", i);
        return context;
    }

    public void onStart()
    {
        super.onStart();
        int i = c.a();
        int j = getIntent().getIntExtra("opened_from_impression", -1);
        if (j != -1)
        {
            ((gdd)a.a(gdd)).a(i).a(j).d();
        }
        String s = g.a(getIntent(), "dnd_duration_choice");
        if (s != null)
        {
            ((drj)a.a(drj)).a(i, s);
            finish();
            return;
        } else
        {
            ((drj)a.a(drj)).a(this, i, new ceg(this));
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        finish();
    }
}
