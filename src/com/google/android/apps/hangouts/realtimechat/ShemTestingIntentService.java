// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import aid;
import aie;
import ail;
import aim;
import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import aoa;
import aot;
import aow;
import aoz;
import cfz;
import dbi;
import dbl;
import dcn;
import ddm;
import dir;
import dml;
import eev;
import hlp;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class ShemTestingIntentService extends IntentService
{

    public ShemTestingIntentService()
    {
        super("Babel");
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = String.valueOf(intent.toString());
        String s;
        if (((String) (obj)).length() != 0)
        {
            obj = "Intent received at Service!. intent=".concat(((String) (obj)));
        } else
        {
            obj = new String("Intent received at Service!. intent=");
        }
        eev.f("Babel", ((String) (obj)));
        obj = String.valueOf(intent.getAction());
        if (((String) (obj)).length() != 0)
        {
            obj = "Intent Action: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Intent Action: ");
        }
        eev.f("Babel", ((String) (obj)));
        s = intent.getStringExtra("account_name");
        obj = null;
        if (s != null)
        {
            obj = dcn.a(s, null);
        }
        if (obj == null)
        {
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", "Received intent couldn't resolve account.");
            }
        } else
        {
            if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.realtimechat.shemtesting.send_message"))
            {
                String s1 = intent.getStringExtra("conversation_id");
                String s4 = intent.getStringExtra("text");
                intent = intent.getStringExtra("uri");
                String s6 = String.valueOf(obj);
                eev.c("Babel", (new StringBuilder(String.valueOf(s6).length() + 49 + String.valueOf(s1).length() + String.valueOf(s4).length() + String.valueOf(intent).length())).append("Sending Message account=").append(s6).append(" conversation=").append(s1).append(" text=").append(s4).append(" uri=").append(intent).toString());
                ((dml)hlp.a(getApplicationContext(), dml)).a(((aoa) (obj)), s1, s4, intent, 0, null, 0, 0, null, null, false, null, 0);
                return;
            }
            if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.realtimechat.shemtesting.set_conversation_name"))
            {
                String s2 = intent.getStringExtra("conversation_id");
                intent = intent.getStringExtra("conversation_name");
                String s5 = String.valueOf(obj);
                eev.c("Babel", (new StringBuilder(String.valueOf(s5).length() + 61 + String.valueOf(s2).length() + String.valueOf(intent).length())).append("Create Conversation account=").append(s5).append(" conversation=").append(s2).append(" conversation name=").append(intent).toString());
                RealTimeChatService.c(((aoa) (obj)), s2, intent);
                return;
            }
            if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.realtimechat.shemtesting.create_conversation"))
            {
                intent = intent.getStringExtra("gids");
                String as[] = intent.split(",");
                Object obj1 = new aow(this, ((aoa) (obj)).h());
                aie aie1 = aid.newBuilder();
                int j = as.length;
                int i = 0;
                while (i < j) 
                {
                    String s7 = as[i];
                    aim aim1 = ail.newBuilder();
                    cfz cfz1 = ((aow) (obj1)).a(dbi.a(s7));
                    if (cfz1 != null)
                    {
                        s7 = String.valueOf(obj);
                        String s8 = String.valueOf(cfz1.toString());
                        eev.c("Babel", (new StringBuilder(String.valueOf(s7).length() + 30 + String.valueOf(s8).length())).append("Lookup Entity account=").append(s7).append(" entity=").append(s8).toString());
                        aim1.a(dbl.a(cfz1));
                    } else
                    {
                        eev.c("Babel", (new StringBuilder(String.valueOf(s7).length() + 58)).append("Lookup for gid: ").append(s7).append(" failed. Setting current time as temp name").toString());
                        aim1.a(dbl.a(s7, Long.toString(System.currentTimeMillis())));
                    }
                    aie1.a(aim1.a());
                    i++;
                }
                aid aid1 = aie1.a();
                obj1 = String.valueOf(obj);
                eev.c("Babel", (new StringBuilder(String.valueOf(obj1).length() + 34 + String.valueOf(intent).length())).append("Create Conversation account=").append(((String) (obj1))).append(" gids=").append(intent).toString());
                RealTimeChatService.a(dir.b(), (new ddm(getApplicationContext())).a(((aoa) (obj)).h()).a(aid1).a(aot.c).a());
                return;
            }
            if (TextUtils.equals(intent.getAction(), "com.google.android.apps.hangouts.realtimechat.shemtesting.delete_conversation"))
            {
                String s3 = intent.getStringExtra("conversation_id");
                intent = intent.getStringExtra("timestamp");
                aow aow1 = new aow(this, ((aoa) (obj)).h());
                if (aow1.e(s3).b == 1)
                {
                    long l;
                    if (intent == null)
                    {
                        l = aow1.m(s3);
                    } else
                    {
                        l = Long.parseLong(intent);
                    }
                    intent = String.valueOf(obj);
                    eev.c("Babel", (new StringBuilder(String.valueOf(intent).length() + 73 + String.valueOf(s3).length())).append("Delete Conversation account=").append(intent).append(" conversation=").append(s3).append(" timestamp=").append(l).toString());
                    RealTimeChatService.a(((aoa) (obj)), s3, l);
                    return;
                } else
                {
                    intent = String.valueOf(obj);
                    eev.c("Babel", (new StringBuilder(String.valueOf(intent).length() + 41 + String.valueOf(s3).length())).append("Leave Conversation account=").append(intent).append(" conversation=").append(s3).toString());
                    RealTimeChatService.h(((aoa) (obj)), s3);
                    return;
                }
            }
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", "Received intent was not processed.");
                return;
            }
        }
    }
}
