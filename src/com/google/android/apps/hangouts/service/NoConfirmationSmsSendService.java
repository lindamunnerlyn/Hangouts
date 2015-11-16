// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.service;

import aid;
import aie;
import ail;
import aim;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import aoa;
import aot;
import aow;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dbi;
import dbl;
import dcn;
import ddm;
import dir;
import dml;
import dqa;
import due;
import eev;
import gdv;
import hlp;

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
            eev.b("Babel", "NoConfirmationSmsSendService onHandleIntent");
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
            eev.b("Babel", intent);
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
            eev.b("Babel", "Called to send SMS but no extras");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1;
        String s2;
        s = bundle.getString("android.intent.extra.TEXT");
        s1 = bundle.getString("android.intent.extra.SUBJECT");
        s2 = due.b(intent.getData());
        if (!TextUtils.isEmpty(s2))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a)
        {
            eev.b("Babel", "Recipient(s) cannot be empty");
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!dcn.j()) goto _L4; else goto _L5
_L5:
        aoa aoa1 = dcn.l();
        if (bundle.getBoolean("showUI", false))
        {
            intent.setClassName(this, "com.google.android.talk.SigningInActivity");
            intent.addFlags(0x10000000);
            intent.putExtra("account_id", aoa1.h());
            startActivity(intent);
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            if (a)
            {
                eev.b("Babel", "Message cannot be empty");
                return;
            }
        } else
        {
            if (!aoa1.N())
            {
                intent = due.a(new aow(this, aoa1.h()), null, s2);
                ((dml)hlp.a(getApplicationContext(), dml)).a(aoa1, intent, s, null, 0, null, 0, 0, null, s1, false, null, 0);
                return;
            }
            Object obj;
            if (s2.split(";").length != 1)
            {
                flag = false;
            }
            gdv.a("Expected condition to be true", flag);
            intent = s2.split(";")[0];
            obj = dbl.a(intent);
            ((dbl) (obj)).a(dbi.b(intent));
            intent = ail.newBuilder().a(((dbl) (obj)));
            intent = aid.newBuilder().a(intent.a()).a();
            obj = dir.b();
            RealTimeChatService.a(new dqa(this, getApplicationContext(), ((dir) (obj)).a(), s1, s));
            RealTimeChatService.a(((dir) (obj)), (new ddm(getApplicationContext())).a(aoa1.h()).a(intent).a(aot.c).b(2).a());
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
