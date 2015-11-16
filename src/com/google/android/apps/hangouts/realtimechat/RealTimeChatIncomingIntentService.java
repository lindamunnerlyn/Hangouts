// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.app.IntentService;
import android.content.Intent;
import dez;
import hgx;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jle;
import jme;
import jmf;

public class RealTimeChatIncomingIntentService extends IntentService
{

    private static final String a = com/google/android/apps/hangouts/realtimechat/RealTimeChatIncomingIntentService.getSimpleName();
    private jme b;

    public RealTimeChatIncomingIntentService()
    {
        super(a);
    }

    public void onCreate()
    {
        super.onCreate();
        jmf jmf1 = jme.a();
        for (Iterator iterator = hgx.c(getApplicationContext(), dez).iterator(); iterator.hasNext();)
        {
            dez dez1 = (dez)iterator.next();
            Iterator iterator1 = dez1.a().iterator();
            while (iterator1.hasNext()) 
            {
                jmf1.a((Integer)iterator1.next(), dez1);
            }
        }

        b = jmf1.a();
    }

    public void onHandleIntent(Intent intent)
    {
        if (intent.hasExtra("op_code"))
        {
            for (jqy jqy = b.c(Integer.valueOf(intent.getIntExtra("op_code", -1))).a(); jqy.hasNext(); ((dez)jqy.next()).a(getApplicationContext(), intent)) { }
        }
    }

}
