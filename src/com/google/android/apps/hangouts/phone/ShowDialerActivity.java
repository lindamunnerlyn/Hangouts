// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.text.TextUtils;
import bea;
import cpg;
import dzu;
import ebw;
import g;
import gmq;
import gwn;
import gwt;
import gxe;
import gxj;
import gxk;
import hgx;
import hhw;

public class ShowDialerActivity extends hhw
{

    private bea j;
    private gmq m;
    private gwt n;

    public ShowDialerActivity()
    {
        m = new cpg(this);
        n = (new gwt(this, l)).a(k).b(m);
    }

    public static bea a(ShowDialerActivity showdialeractivity)
    {
        return showdialeractivity.j;
    }

    public void onResume()
    {
        boolean flag1 = true;
        super.onResume();
        boolean flag;
        if (!(new dzu(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption")).a())
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
                ebw.f("Babel", "Received null action when launching Dialer Activity");
                flag = flag1;
            } else
            if (((String) (obj)).equals("android.intent.action.MAIN"))
            {
                ebw.c("Babel", "Received ACTION_MAIN when launching Dialer Activity");
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = "com.google.android.apps.hangouts.phone.recentcalls";
            }
            j = (bea)k.b(bea);
            if (j != null)
            {
                obj = new gxk();
                ((gxk) (obj)).a((new gwn()).b("sms_only"));
                obj = (new gxe()).a(gxj, ((gxk) (obj)).c());
                n.a(((gxe) (obj)));
                return;
            }
            intent = g.e(null);
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
