// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.text.TextUtils;
import beq;
import cqw;
import ecy;
import eev;
import g;
import gqw;
import hax;
import hbd;
import hbo;
import hbu;
import hbv;
import hlp;
import hmo;

public class ShowDialerActivity extends hmo
{

    public beq j;
    private gqw m;
    private hbd n;

    public ShowDialerActivity()
    {
        m = new cqw(this);
        n = (new hbd(this, l)).a(k).b(m);
    }

    public void onResume()
    {
        boolean flag1 = true;
        super.onResume();
        boolean flag;
        if (!(new ecy(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption")).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Object obj1 = getIntent();
            Object obj = ((Intent) (obj1)).getAction();
            Intent intent;
            if (obj == null)
            {
                eev.f("Babel", "Received null action when launching Dialer Activity");
                flag = flag1;
            } else
            if (((String) (obj)).equals("android.intent.action.MAIN"))
            {
                eev.c("Babel", "Received ACTION_MAIN when launching Dialer Activity");
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = "com.google.android.apps.hangouts.phone.recentcalls";
            }
            j = (beq)k.b(beq);
            if (j != null)
            {
                obj = new hbv();
                ((hbv) (obj)).a((new hax()).b("sms_only"));
                obj = (new hbo()).a(hbu, ((hbv) (obj)).c());
                n.a(((hbo) (obj)));
                return;
            }
            intent = g.d(null);
            if (TextUtils.equals(((CharSequence) (obj)), "com.google.android.apps.hangouts.phone.dialpad"))
            {
                obj1 = ((Intent) (obj1)).getStringExtra("number_to_call");
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    intent.putExtra("number_to_call", ((String) (obj1)));
                }
            }
            intent.setAction(((String) (obj)));
            intent.putExtra("use_dialer_activity", false);
            startActivity(intent);
        }
        finish();
    }
}
