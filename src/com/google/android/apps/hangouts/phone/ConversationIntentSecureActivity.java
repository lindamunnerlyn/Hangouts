// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bnd;
import ebw;
import gal;
import gam;
import gap;
import gmp;
import gmq;
import gwt;
import gxe;
import gxj;
import hgx;
import hhw;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            BabelGatewayActivity

public class ConversationIntentSecureActivity extends hhw
    implements gmq
{

    private gwt j;

    public ConversationIntentSecureActivity()
    {
        j = (new gwt(this, l)).a("active-hangouts-account").a(k).b(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 != gmp.c) goto _L2; else goto _L1
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
        gmp1 = intent.getAction();
        gmp2 = intent.getStringExtra("conversation_id");
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
            ((gap)this.k.a(gap)).a(k).a(i).d();
        }
        pendingintent = (PendingIntent)intent.getParcelableExtra("hangout_call_end_intent");
        if (s != null && uri != null)
        {
            String s4 = String.valueOf(uri);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s4).length() + 36)).append("Got intent with non-null gaiaId and ").append(s4).toString());
            i = 0;
        } else
        if ("android.intent.action.SENDTO".equals(gmp1) && TextUtils.isEmpty(s3))
        {
            ebw.f("Babel", "SENDTO action must include message text");
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
            gmp1 = bnd.a();
            if (gmp1.t() != null)
            {
                gmp1.a(1004);
            } else
            {
                ebw.f("Babel", "invalid request to end video call");
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
            gmp1 = BabelGatewayActivity.a(k, s, s1, uri, pendingintent, i, l);
        } else
        {
            gmp1 = BabelGatewayActivity.b(k, s, s1, uri, pendingintent, i, l);
        }
        gmp1.putExtra("hangout_video_source", intent.getIntExtra("hangout_video_source", 0));
        gmp1.putExtra("hangout_mute_playback", intent.getBooleanExtra("hangout_mute_playback", false));
        gmp1.putExtra("hangout_mute_microphone", intent.getBooleanExtra("hangout_mute_microphone", false));
_L5:
        gmp1.putExtra("account_id", k);
        gmp1.addFlags(0x4000000);
        setResult(-1);
        startActivity(gmp1);
        finish();
        return;
_L4:
        if ("android.intent.action.SENDTO".equals(gmp1))
        {
            gmp2 = BabelGatewayActivity.a(this, k, gmp2, s, s1, s3, l1, flag);
            gmp1 = gmp2;
            if (intent.hasExtra("otr_state"))
            {
                gmp2.putExtra("otr_state", intent.getBooleanExtra("otr_state", false));
                gmp1 = gmp2;
            }
        } else
        if ("com.google.android.apps.babel.realtimechat.update-watermark".equals(gmp1))
        {
            gmp1 = BabelGatewayActivity.a(k, gmp2);
        } else
        if (!TextUtils.isEmpty(gmp2))
        {
            gmp1 = BabelGatewayActivity.a(k, gmp2, s3);
        } else
        if (!TextUtils.isEmpty(s))
        {
            gmp1 = BabelGatewayActivity.a(k, s, s1, s3, false, null);
        } else
        {
            gmp1 = BabelGatewayActivity.d(k);
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
            ebw.f("Babel", "No intent attached");
            setResult(0);
            finish();
            return;
        } else
        {
            bundle = bundle.getStringExtra("account_name");
            bundle = (new gxe()).b().a(bundle).a(gxj);
            j.a(bundle);
            return;
        }
    }
}
