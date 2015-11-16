// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import aik;
import ail;
import ais;
import ait;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ani;
import aob;
import aoe;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dac;
import daf;
import dbf;
import dce;
import dhi;
import dkt;
import dnh;
import drk;
import ebw;
import gbh;
import hgx;

public class NoConfirmationSmsSendService extends IntentService
{

    private static final boolean a = false;

    public NoConfirmationSmsSendService()
    {
        super(com/google/android/apps/hangouts/service/NoConfirmationSmsSendService.getName());
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent)
    {
        String s;
        boolean flag;
        flag = true;
        if (a)
        {
            ebw.b("Babel", "NoConfirmationSmsSendService onHandleIntent");
        }
        s = intent.getAction();
        if ("android.intent.action.RESPOND_VIA_MESSAGE".equals(s)) goto _L2; else goto _L1
_L1:
        if (a)
        {
            intent = String.valueOf(s);
            if (intent.length() != 0)
            {
                intent = "NoConfirmationSmsSendService onHandleIntent wrong action: ".concat(intent);
            } else
            {
                intent = new String("NoConfirmationSmsSendService onHandleIntent wrong action: ");
            }
            ebw.b("Babel", intent);
        }
_L4:
        return;
_L2:
        Bundle bundle;
        bundle = intent.getExtras();
        if (bundle != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            ebw.b("Babel", "Called to send SMS but no extras");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1;
        String s2;
        s = bundle.getString("android.intent.extra.TEXT");
        s1 = bundle.getString("android.intent.extra.SUBJECT");
        s2 = drk.b(intent.getData());
        if (!TextUtils.isEmpty(s2))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a)
        {
            ebw.b("Babel", "Recipient(s) cannot be empty");
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!dbf.j()) goto _L4; else goto _L5
_L5:
        ani ani1 = dbf.l();
        if (bundle.getBoolean("showUI", false))
        {
            intent.setClassName(this, "com.google.android.talk.SigningInActivity");
            intent.addFlags(0x10000000);
            intent.putExtra("account_id", ani1.h());
            startActivity(intent);
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            if (a)
            {
                ebw.b("Babel", "Message cannot be empty");
                return;
            }
        } else
        {
            if (!ani1.Q())
            {
                intent = drk.a(new aoe(this, ani1.h()), null, s2);
                ((dkt)hgx.a(getApplicationContext(), dkt)).a(ani1, intent, s, null, 0, null, 0, 0, null, s1, false, null, 0);
                return;
            }
            Object obj;
            if (s2.split(";").length != 1)
            {
                flag = false;
            }
            gbh.a(flag);
            intent = s2.split(";")[0];
            obj = daf.a(intent);
            ((daf) (obj)).a(dac.b(intent));
            intent = ais.newBuilder().a(((daf) (obj)));
            intent = aik.newBuilder().a(intent.a()).a();
            obj = dhi.b();
            RealTimeChatService.a(new dnh(this, getApplicationContext(), ((dhi) (obj)).a(), s1, s));
            RealTimeChatService.a(((dhi) (obj)), (new dce(getApplicationContext())).a(ani1.h()).a(intent).a(aob.c).b(2).a());
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static 
    {
        hik hik = ebw.p;
    }
}
