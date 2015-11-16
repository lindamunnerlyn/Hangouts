// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import g;
import h;

public class BabelWidgetProvider extends AppWidgetProvider
{

    public BabelWidgetProvider()
    {
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        super.onUpdate(context, appwidgetmanager, ai);
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            Object obj = g.d(null);
            ((Intent) (obj)).putExtra("opened_from_impression", 2150);
            obj = PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0);
            RemoteViews remoteviews = new RemoteViews(context.getPackageName(), g.hi);
            remoteviews.setOnClickPendingIntent(h.gG, ((PendingIntent) (obj)));
            appwidgetmanager.updateAppWidget(k, remoteviews);
        }

    }
}
