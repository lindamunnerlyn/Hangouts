// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class dkh extends Handler
{

    private RequestWriter a;

    public dkh(RequestWriter requestwriter)
    {
        a = requestwriter;
    }

    public void handleMessage(Message message)
    {
        if (message.arg1 != 1) goto _L2; else goto _L1
_L1:
        dki.a(a.f()).a(a);
        if (RequestWriter.m())
        {
            ebw.b("Babel_RequestWriter", RequestWriter.a(a, "MSG_LOAD"));
        }
_L4:
        if (RequestWriter.m())
        {
            ebw.f("Babel_RequestWriter", RequestWriter.d(a, "Looper release"));
        }
        a.x_();
        return;
_L2:
        Object obj;
        message = (Intent)message.getData().getParcelable("intent");
        obj = message.getExtras();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        int i;
        i = ((Bundle) (obj)).getInt("account_id");
        message = RequestWriter.a(((Bundle) (obj)), dki.a(a.f()), i);
        if (message == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((gms)hgx.a(a.f(), gms)).c(i))
        {
            break MISSING_BLOCK_LABEL_211;
        }
        ebw.f("Babel_RequestWriter", RequestWriter.b(a, (new StringBuilder(28)).append("Invalid account: ").append(i).toString()));
        if (RequestWriter.m())
        {
            ebw.f("Babel_RequestWriter", RequestWriter.d(a, "Looper release"));
        }
        a.x_();
        return;
        if (((Bundle) (obj)).containsKey("server_request"))
        {
            long l = dki.a(a.f()).b(message);
            if (RequestWriter.m())
            {
                ebw.b("Babel_RequestWriter", (new StringBuilder(56)).append("Handling EXTRA_WRITABLE_REQUEST for ").append(l).toString());
            }
        }
        ccg ccg = message.a();
        long l1 = ((Bundle) (obj)).getLong("timestamp");
        if (ccg instanceof cut)
        {
            obj = (cut)ccg;
            obj = (new byy()).b(((cut) (obj)).j).a(((cut) (obj)).c);
            h.a(i, l1, 10, ((byy) (obj)).a(202));
            h.a(i, SystemClock.elapsedRealtime(), 10, ((byy) (obj)).a(203));
        }
        a.a(message);
_L7:
        if (RequestWriter.m())
        {
            ebw.b("Babel_RequestWriter", RequestWriter.c(a, "MSG_INTENT"));
        }
        if (true) goto _L4; else goto _L3
        message;
        if (RequestWriter.m())
        {
            ebw.f("Babel_RequestWriter", RequestWriter.d(a, "Looper release"));
        }
        a.x_();
        throw message;
_L3:
        String s;
        if (!((Bundle) (obj)).containsKey("cancel_request"))
        {
            break MISSING_BLOCK_LABEL_487;
        }
        s = ((Bundle) (obj)).getString("cancel_request");
        if (!RequestWriter.m()) goto _L6; else goto _L5
_L5:
        message = String.valueOf(s);
        if (message.length() == 0)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        message = "Handling EXTRA_CANCEL_STRING for ".concat(message);
_L8:
        ebw.b("Babel_RequestWriter", message);
_L6:
        RequestWriter.a(a, ((Bundle) (obj)).getString("cancel_class"), s);
          goto _L7
        message = new String("Handling EXTRA_CANCEL_STRING for ");
          goto _L8
label0:
        {
            if (!((Bundle) (obj)).containsKey("sms_send_result"))
            {
                break label0;
            }
            long l2 = ((Bundle) (obj)).getLong("sms_request_id", -1L);
            if (RequestWriter.m())
            {
                ebw.b("Babel_RequestWriter", (new StringBuilder(55)).append("Handling EXTRA_SMS_SEND_RESULT for ").append(l2).toString());
            }
            dru.a(l2, ((Bundle) (obj)).getInt("sms_send_result"));
        }
          goto _L7
        if (!((Bundle) (obj)).containsKey("mms_sent_result")) goto _L10; else goto _L9
_L9:
        ((drf)hgx.a(a.getApplicationContext(), drf)).a(((Bundle) (obj)).getLong("mms_request_id", -1L), ((Bundle) (obj)).getInt("mms_sent_result"), ((Bundle) (obj)).getInt("mms_sent_http_status"), ((Bundle) (obj)).getByteArray("mms_sent_response_data"));
          goto _L7
_L10:
        if (!((Bundle) (obj)).containsKey("mms_download_result")) goto _L7; else goto _L11
_L11:
        ((dqy)hgx.a(a.getApplicationContext(), dqy)).a(((Bundle) (obj)).getLong("mms_request_id", -1L), ((Bundle) (obj)).getInt("mms_download_result"), ((Bundle) (obj)).getInt("mms_download_http_status"));
          goto _L7
        RequestWriter.a(a);
        long l3 = message.getLongExtra("backoff_period", 500L);
        if (RequestWriter.m())
        {
            ebw.b("Babel_RequestWriter", (new StringBuilder(65)).append("RequestWriter.handleMessage. resumeAllQueues ").append(l3).toString());
        }
        a.a(l3);
          goto _L7
    }
}
