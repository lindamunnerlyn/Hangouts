// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cgd;
import dcn;
import dmo;
import dmt;
import dnq;
import dnr;
import dnt;
import eev;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class SimulatedIncomingEventReceiver extends BroadcastReceiver
{

    public SimulatedIncomingEventReceiver()
    {
    }

    private static void a(String s)
    {
        String s1 = String.valueOf("[SimulatedEventReceiver] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        eev.e("Babel", s);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = String.valueOf(intent);
        String s = String.valueOf(intent.getAction());
        s = (new StringBuilder(String.valueOf(context).length() + 11 + String.valueOf(s).length())).append("onReceive ").append(context).append(" ").append(s).toString();
        context = String.valueOf("[SimulatedEventReceiver] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        eev.b("Babel", context);
        if (intent.getAction().equals("com.google.android.babel.intent.SIMULATED_MESSAGE_EVENT"))
        {
            a("Message event received");
            String s1 = intent.getStringExtra("conv_id");
            context = String.valueOf(s1);
            String s5;
            cgd cgd1;
            String s7;
            ArrayList arraylist;
            long l;
            if (context.length() != 0)
            {
                context = "conversationId ".concat(context);
            } else
            {
                context = new String("conversationId ");
            }
            a(context);
            s5 = intent.getStringExtra("msg_text");
            context = String.valueOf(s5);
            if (context.length() != 0)
            {
                context = "text ".concat(context);
            } else
            {
                context = new String("text ");
            }
            a(context);
            cgd1 = cgd.a(intent.getStringExtra("sender_id"));
            context = String.valueOf(cgd1);
            a((new StringBuilder(String.valueOf(context).length() + 9)).append("senderId ").append(context).toString());
            l = Long.parseLong(intent.getStringExtra("timestamp"));
            a((new StringBuilder(30)).append("timestamp ").append(l).toString());
            s7 = intent.getStringExtra("event_id");
            context = String.valueOf(s7);
            if (context.length() != 0)
            {
                context = "eventId ".concat(context);
            } else
            {
                context = new String("eventId ");
            }
            a(context);
            context = cgd.a(intent.getStringExtra("recipient_id"));
            intent = String.valueOf(context);
            a((new StringBuilder(String.valueOf(intent).length() + 12)).append("recipientId ").append(intent).toString());
            context = dcn.a(context);
            intent = new ArrayList();
            arraylist = new ArrayList();
            arraylist.add(new dmt(0, s5, 0, null));
            intent.add(dmo.a(s1, arraylist, cgd1, l, s7));
            RealTimeChatService.a(intent, context);
        } else
        {
            if (intent.getAction().equals("com.google.android.babel.intent.SIMULATED_FOCUS_EVENT"))
            {
                a("Focus event received");
                String s2 = intent.getStringExtra("conv_id");
                context = String.valueOf(s2);
                Object obj;
                Object obj3;
                Object obj4;
                int i;
                long l1;
                if (context.length() != 0)
                {
                    context = "conversationId ".concat(context);
                } else
                {
                    context = new String("conversationId ");
                }
                a(context);
                i = intent.getIntExtra("focus_type", -1);
                a((new StringBuilder(16)).append("type ").append(i).toString());
                context = cgd.a(intent.getStringExtra("sender_id"));
                obj = String.valueOf(context);
                a((new StringBuilder(String.valueOf(obj).length() + 9)).append("senderId ").append(((String) (obj))).toString());
                obj = cgd.a(intent.getStringExtra("sender_id2"));
                obj3 = String.valueOf(obj);
                a((new StringBuilder(String.valueOf(obj3).length() + 10)).append("senderId2 ").append(((String) (obj3))).toString());
                obj3 = cgd.a(intent.getStringExtra("sender_id3"));
                obj4 = String.valueOf(obj3);
                a((new StringBuilder(String.valueOf(obj4).length() + 10)).append("senderId3 ").append(((String) (obj4))).toString());
                l1 = Long.parseLong(intent.getStringExtra("timestamp"));
                a((new StringBuilder(30)).append("timestamp ").append(l1).toString());
                intent = cgd.a(intent.getStringExtra("recipient_id"));
                obj4 = String.valueOf(intent);
                a((new StringBuilder(String.valueOf(obj4).length() + 12)).append("recipientId ").append(((String) (obj4))).toString());
                intent = dcn.a(intent);
                obj4 = new ArrayList();
                ((List) (obj4)).add(dnq.a(s2, i, context, l1));
                ((List) (obj4)).add(dnq.a(s2, i, ((cgd) (obj)), l1));
                ((List) (obj4)).add(dnq.a(s2, i, ((cgd) (obj3)), l1));
                RealTimeChatService.a(((List) (obj4)), intent);
                return;
            }
            if (intent.getAction().equals("com.google.android.babel.intent.SIMULATED_WATERMARK_EVENT"))
            {
                a("Watermark event received");
                String s3 = intent.getStringExtra("conv_id");
                context = String.valueOf(s3);
                Object obj1;
                long l2;
                if (context.length() != 0)
                {
                    context = "conversationId ".concat(context);
                } else
                {
                    context = new String("conversationId ");
                }
                a(context);
                context = cgd.a(intent.getStringExtra("sender_id"));
                obj1 = String.valueOf(context);
                a((new StringBuilder(String.valueOf(obj1).length() + 9)).append("senderId ").append(((String) (obj1))).toString());
                l2 = Long.parseLong(intent.getStringExtra("timestamp"));
                a((new StringBuilder(30)).append("timestamp ").append(l2).toString());
                intent = cgd.a(intent.getStringExtra("recipient_id"));
                obj1 = String.valueOf(intent);
                a((new StringBuilder(String.valueOf(obj1).length() + 12)).append("recipientId ").append(((String) (obj1))).toString());
                intent = dcn.a(intent);
                obj1 = new ArrayList();
                ((List) (obj1)).add(dnt.a(s3, context, l2));
                RealTimeChatService.a(((List) (obj1)), intent);
                return;
            }
            if (intent.getAction().equals("com.google.android.babel.intent.SIMULATED_TYPING_EVENT"))
            {
                a("Typing event received");
                String s4 = intent.getStringExtra("conv_id");
                context = String.valueOf(s4);
                Object obj2;
                String s6;
                int j;
                long l3;
                if (context.length() != 0)
                {
                    context = "conversationId ".concat(context);
                } else
                {
                    context = new String("conversationId ");
                }
                a(context);
                context = cgd.a(intent.getStringExtra("sender_id"));
                obj2 = String.valueOf(context);
                a((new StringBuilder(String.valueOf(obj2).length() + 9)).append("senderId ").append(((String) (obj2))).toString());
                l3 = Long.parseLong(intent.getStringExtra("timestamp"));
                a((new StringBuilder(30)).append("timestamp ").append(l3).toString());
                obj2 = cgd.a(intent.getStringExtra("recipient_id"));
                s6 = String.valueOf(obj2);
                a((new StringBuilder(String.valueOf(s6).length() + 12)).append("recipientId ").append(s6).toString());
                j = intent.getIntExtra("typing_type", -1);
                a((new StringBuilder(22)).append("typingType ").append(j).toString());
                intent = dcn.a(((cgd) (obj2)));
                obj2 = new ArrayList();
                ((List) (obj2)).add(dnr.a(s4, context, l3, j));
                RealTimeChatService.a(((List) (obj2)), intent);
                return;
            }
        }
    }
}
