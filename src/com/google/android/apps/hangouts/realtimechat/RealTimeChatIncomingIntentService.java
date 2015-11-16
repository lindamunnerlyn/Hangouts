// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.app.IntentService;
import android.content.Intent;
import dgi;
import hlp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jsd;
import jte;
import jtf;

public class RealTimeChatIncomingIntentService extends IntentService
{

    private static final String a = com/google/android/apps/hangouts/realtimechat/RealTimeChatIncomingIntentService.getSimpleName();
    private jte b;

    public RealTimeChatIncomingIntentService()
    {
        super(a);
    }

    public void onCreate()
    {
        super.onCreate();
        jtf jtf1 = new jtf();
        for (Iterator iterator = hlp.c(getApplicationContext(), dgi).iterator(); iterator.hasNext();)
        {
            dgi dgi1 = (dgi)iterator.next();
            Iterator iterator1 = dgi1.a().iterator();
            while (iterator1.hasNext()) 
            {
                jtf1.a((Integer)iterator1.next(), dgi1);
            }
        }

        b = jtf1.a();
    }

    public void onHandleIntent(Intent intent)
    {
        if (intent.hasExtra("op_code"))
        {
            for (jyh jyh = b.d(Integer.valueOf(intent.getIntExtra("op_code", -1))).a(); jyh.hasNext(); ((dgi)jyh.next()).a(getApplicationContext(), intent)) { }
        }
    }

}
