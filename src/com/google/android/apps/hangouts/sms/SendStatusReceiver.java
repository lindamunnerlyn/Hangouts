// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.BroadcastReceiver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import eev;

public class SendStatusReceiver extends BroadcastReceiver
{

    public static final boolean a = false;

    public SendStatusReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        int i = getResultCode();
        if (a)
        {
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 28)).append("Action: ").append(((String) (obj))).append(" result: ").append(i).toString());
            if (i == 1 && intent.hasExtra("errorCode"))
            {
                int j = intent.getIntExtra("errorCode", 0);
                eev.b("Babel_SMS", (new StringBuilder(23)).append("Error code: ").append(j).toString());
            }
        }
        if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_SENT".equals(obj))
        {
            long l = ContentUris.parseId(intent.getData());
            if (a)
            {
                eev.b("Babel_SMS", (new StringBuilder(32)).append("Request ID: ").append(l).toString());
            }
            intent = RequestWriter.k();
            intent.putExtra("sms_request_id", l);
            intent.putExtra("sms_send_result", i);
            context.startService(intent);
        } else
        {
            if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_SENT".equals(obj))
            {
                long l1 = ContentUris.parseId(intent.getData());
                obj = RequestWriter.k();
                ((Intent) (obj)).putExtra("mms_request_id", l1);
                ((Intent) (obj)).putExtra("mms_sent_result", i);
                ((Intent) (obj)).putExtra("mms_sent_http_status", intent.getIntExtra("android.telephony.extra.MMS_HTTP_STATUS", 0));
                ((Intent) (obj)).putExtra("mms_sent_response_data", intent.getByteArrayExtra("android.telephony.extra.MMS_DATA"));
                context.startService(((Intent) (obj)));
                return;
            }
            if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MMS_DOWNLOADED".equals(obj))
            {
                long l2 = ContentUris.parseId(intent.getData());
                obj = RequestWriter.k();
                ((Intent) (obj)).putExtra("mms_request_id", l2);
                ((Intent) (obj)).putExtra("mms_download_result", i);
                ((Intent) (obj)).putExtra("mms_download_http_status", intent.getIntExtra("android.telephony.extra.MMS_HTTP_STATUS", 0));
                context.startService(((Intent) (obj)));
                return;
            }
            if ("com.google.android.apps.hangouts.sms.SendStatusReceiver.MESSAGE_DELIVERED".equals(obj))
            {
                RealTimeChatService.d(intent);
                return;
            }
        }
    }

    static 
    {
        hnc hnc = eev.r;
    }
}
