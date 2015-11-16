// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.notifications;

import android.content.Context;
import android.content.Intent;
import ani;
import cdb;
import doq;
import g;
import gal;
import gam;
import gap;
import gmo;
import gng;
import hgx;
import hhg;

public class DndDialogActivity extends hhg
{

    private final gmo c;

    public DndDialogActivity()
    {
        c = (new gng(this, b)).a(a);
    }

    public static Intent a(Context context, ani ani1)
    {
        context = new Intent(context, com/google/android/apps/hangouts/notifications/DndDialogActivity);
        context.putExtra("account_id", ani1.h());
        return context;
    }

    public void onStart()
    {
        super.onStart();
        int i = c.a();
        int j = getIntent().getIntExtra("opened_from_impression", -1);
        if (j != -1)
        {
            ((gap)a.a(gap)).a(i).a(j).d();
        }
        String s = g.a(getIntent(), "dnd_duration_choice");
        if (s != null)
        {
            ((doq)a.a(doq)).a(i, s);
            finish();
            return;
        } else
        {
            ((doq)a.a(doq)).a(this, i, new cdb(this));
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        finish();
    }
}
