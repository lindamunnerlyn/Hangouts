// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony;

import ai;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import dcn;
import dxq;
import dxr;
import eev;
import gbu;
import hlp;
import iug;
import jjt;

public class  extends ai
{

    String j;

    private void b(int i)
    {
        jjt jjt1 = new jjt();
        jjt1.p = Integer.valueOf(59);
        jjt1.c = getIntent().getStringExtra("participant_log_id");
        jjt1.g = new iug();
        String s = getIntent().getStringExtra("session_id");
        jjt1.d = s;
        jjt1.g.a = s;
        jjt1.g.c = Integer.valueOf(i);
        aoa aoa = dcn.e(getIntent().getIntExtra("account_id", -1));
        if (aoa != null)
        {
            RealTimeChatService.a(aoa, s, jjt1);
        }
        finish();
    }

    private void b(boolean flag)
    {
        dxq dxq1 = dxq.a(getIntent().getIntExtra("telephony_rating", 0), flag, getIntent().getBooleanExtra("is_incoming", false));
        ap ap = u_();
        String s;
        if (flag)
        {
            s = "audio_issue_chooser";
        } else
        {
            s = "call_issue_chooser";
        }
        dxq1.a(ap, s);
    }

    public void a(String s)
    {
        eev.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onAudioIssueSelected, sending feedback");
        Object obj1 = j;
        Object obj;
        String s1;
        int i;
        if (getIntent().getBooleanExtra("handoff_attempted", false))
        {
            obj = "[HANDOFF] ";
        } else
        if (getIntent().getIntExtra("call_type", 0) == 2)
        {
            obj = "[WIFI] ";
        } else
        {
            obj = "[CELL] ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            if (TextUtils.isEmpty(s))
            {
                s = ((String) (obj1));
            } else
            {
                s = (new StringBuilder(String.valueOf(obj1).length() + 2 + String.valueOf(s).length())).append(((String) (obj1))).append(", ").append(s).toString();
            }
        }
        if (TextUtils.isEmpty(s))
        {
            s = ((String) (obj));
        } else
        {
            obj = String.valueOf(obj);
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = ((String) (obj)).concat(s);
            } else
            {
                s = new String(((String) (obj)));
            }
        }
        obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            obj = "TeleFeedback.FeedbackActivity.sendFeedback: ".concat(((String) (obj)));
        } else
        {
            obj = new String("TeleFeedback.FeedbackActivity.sendFeedback: ");
        }
        eev.e("Babel_telephony", ((String) (obj)));
        obj1 = getIntent().getBundleExtra("telephony_call_info");
        i = getIntent().getIntExtra("telephony_rating", 0);
        if (dxr.d != null)
        {
            obj = dxr.d;
        } else
        {
            obj = new dxr(this);
        }
        s1 = dcn.a(this, getIntent().getIntExtra("account_id", -1));
        ((dxr) (obj)).a(((gbu)hlp.a(this, gbu)).a(((Bundle) (obj1))).a("rating", Integer.toString(i)).b(s).c("com.google.android.talk.telephony").a(s1).a());
        b(1);
    }

    public void a(String s, boolean flag)
    {
        if (flag)
        {
            eev.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, good call, closing");
            b(5);
            return;
        } else
        {
            eev.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, showing audio issues");
            j = s;
            b(true);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        eev.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate");
        super.onCreate(bundle);
        ((NotificationManager)getSystemService("notification")).cancel("telephony_call_feedback", getIntent().getIntExtra("telephony_id", 0));
        int i = getIntent().getIntExtra("telephony_rating", 0);
        if (i == 5)
        {
            eev.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate, rated good, doing nothing");
            b(i);
            return;
        } else
        {
            b(false);
            return;
        }
    }

    public ()
    {
    }
}
