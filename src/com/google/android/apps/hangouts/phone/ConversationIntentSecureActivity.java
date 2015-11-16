// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bnk;
import eev;
import gcz;
import gda;
import gdd;
import gqv;
import gqw;
import hbd;
import hbo;
import hbu;
import hlp;
import hmo;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            BabelGatewayActivity

public class ConversationIntentSecureActivity extends hmo
    implements gqw
{

    private hbd j;

    public ConversationIntentSecureActivity()
    {
        j = (new hbd(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 != gqv.c) goto _L2; else goto _L1
_L1:
        Intent intent;
        String s;
        String s1;
        String s2;
        String s3;
        Uri uri;
        PendingIntent pendingintent;
        long l1;
        k = j.a();
        intent = getIntent();
        gqv1 = intent.getAction();
        gqv2 = intent.getStringExtra("conversation_id");
        s = intent.getStringExtra("participant_gaia");
        s1 = intent.getStringExtra("participant_name");
        s2 = intent.getStringExtra("auto_join_call_policy");
        s3 = intent.getStringExtra("android.intent.extra.TEXT");
        l1 = intent.getLongExtra("watermark", 0L);
        flag = intent.getBooleanExtra("requires_mms", false);
        uri = (Uri)intent.getParcelableExtra("hangout_uri");
        i = intent.getIntExtra("opened_from_impression", -1);
        if (i != -1)
        {
            ((gdd)this.k.a(gdd)).a(k).a(i).d();
        }
        pendingintent = (PendingIntent)intent.getParcelableExtra("hangout_call_end_intent");
        if (s != null && uri != null)
        {
            String s4 = String.valueOf(uri);
            eev.f("Babel", (new StringBuilder(String.valueOf(s4).length() + 36)).append("Got intent with non-null gaiaId and ").append(s4).toString());
            i = 0;
        } else
        if ("android.intent.action.SENDTO".equals(gqv1) && TextUtils.isEmpty(s3))
        {
            eev.f("Babel", "SENDTO action must include message text");
            i = 0;
        } else
        {
            i = 1;
        }
        if (i == 0)
        {
            setResult(0);
            finish();
            return;
        }
        if (intent.getBooleanExtra("end_video", false))
        {
            gqv1 = bnk.a();
            if (gqv1.s() != null)
            {
                gqv1.a(1004);
            } else
            {
                eev.f("Babel", "invalid request to end video call");
            }
            setResult(-1);
            finish();
            return;
        }
        if (uri == null && !intent.getBooleanExtra("start_video", false)) goto _L4; else goto _L3
_L3:
        i = intent.getIntExtra("hangout_start_source", 59);
        int l = intent.getIntExtra("media_type", 0);
        if ("never".equals(s2))
        {
            gqv1 = BabelGatewayActivity.a(k, s, s1, uri, pendingintent, i, l);
        } else
        {
            gqv1 = BabelGatewayActivity.b(k, s, s1, uri, pendingintent, i, l);
        }
        gqv1.putExtra("hangout_video_source", intent.getIntExtra("hangout_video_source", 0));
        gqv1.putExtra("hangout_mute_playback", intent.getBooleanExtra("hangout_mute_playback", false));
        gqv1.putExtra("hangout_mute_microphone", intent.getBooleanExtra("hangout_mute_microphone", false));
_L5:
        gqv1.putExtra("account_id", k);
        gqv1.addFlags(0x4000000);
        setResult(-1);
        startActivity(gqv1);
        finish();
        return;
_L4:
        if ("android.intent.action.SENDTO".equals(gqv1))
        {
            gqv2 = BabelGatewayActivity.a(this, k, gqv2, s, s1, s3, l1, flag);
            gqv1 = gqv2;
            if (intent.hasExtra("otr_state"))
            {
                gqv2.putExtra("otr_state", intent.getBooleanExtra("otr_state", false));
                gqv1 = gqv2;
            }
        } else
        if ("com.google.android.apps.babel.realtimechat.update-watermark".equals(gqv1))
        {
            gqv1 = BabelGatewayActivity.a(k, gqv2);
        } else
        if (!TextUtils.isEmpty(gqv2))
        {
            gqv1 = BabelGatewayActivity.a(k, gqv2, s3);
        } else
        if (!TextUtils.isEmpty(s))
        {
            gqv1 = BabelGatewayActivity.a(k, s, s1, s3, false, null);
        } else
        {
            gqv1 = BabelGatewayActivity.d(k);
        }
        if (true) goto _L5; else goto _L2
_L2:
        finish();
        return;
    }

    protected boolean g()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!g())
        {
            setResult(0);
            finish();
            return;
        }
        bundle = getIntent();
        if (bundle == null)
        {
            eev.f("Babel", "No intent attached");
            setResult(0);
            finish();
            return;
        } else
        {
            bundle = bundle.getStringExtra("account_name");
            bundle = (new hbo()).b().a(bundle).a(hbu);
            j.a(bundle);
            return;
        }
    }
}
