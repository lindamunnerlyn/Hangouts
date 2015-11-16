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
import dbf;
import dui;
import duj;
import ebw;
import fzg;
import hgx;
import iob;
import jdh;

public class  extends ai
{

    String j;

    private void b(int i)
    {
        jdh jdh1 = new jdh();
        jdh1.p = Integer.valueOf(59);
        jdh1.c = getIntent().getStringExtra("participant_log_id");
        jdh1.g = new iob();
        String s = getIntent().getStringExtra("session_id");
        jdh1.d = s;
        jdh1.g.a = s;
        jdh1.g.c = Integer.valueOf(i);
        ani ani = dbf.e(getIntent().getIntExtra("account_id", -1));
        if (ani != null)
        {
            RealTimeChatService.a(ani, s, jdh1);
        }
        finish();
    }

    private void b(boolean flag)
    {
        dui dui1 = dui.a(getIntent().getIntExtra("telephony_rating", 0), flag, getIntent().getBooleanExtra("is_incoming", false));
        ap ap = t_();
        String s;
        if (flag)
        {
            s = "audio_issue_chooser";
        } else
        {
            s = "call_issue_chooser";
        }
        dui1.a(ap, s);
    }

    public void a(String s)
    {
        ebw.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onAudioIssueSelected, sending feedback");
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
        ebw.e("Babel_telephony", ((String) (obj)));
        obj1 = getIntent().getBundleExtra("telephony_call_info");
        i = getIntent().getIntExtra("telephony_rating", 0);
        if (duj.d != null)
        {
            obj = duj.d;
        } else
        {
            obj = new duj(this);
        }
        s1 = dbf.a(this, getIntent().getIntExtra("account_id", -1));
        ((duj) (obj)).a(((fzg)hgx.a(this, fzg)).a(((Bundle) (obj1))).a("rating", Integer.toString(i)).b(s).c("com.google.android.talk.telephony").a(s1).a());
        b(1);
    }

    public void a(String s, boolean flag)
    {
        if (flag)
        {
            ebw.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, good call, closing");
            b(5);
            return;
        } else
        {
            ebw.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCallIssueSelected, showing audio issues");
            j = s;
            b(true);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        ebw.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate");
        super.onCreate(bundle);
        ((NotificationManager)getSystemService("notification")).cancel("telephony_call_feedback", getIntent().getIntExtra("telephony_id", 0));
        int i = getIntent().getIntExtra("telephony_rating", 0);
        if (i == 5)
        {
            ebw.e("Babel_telephony", "TeleFeedback.FeedbackActivity.onCreate, rated good, doing nothing");
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
