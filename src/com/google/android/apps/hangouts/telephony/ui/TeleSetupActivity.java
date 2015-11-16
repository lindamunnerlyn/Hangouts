// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import dyj;
import dyk;
import eav;
import ebw;
import gbh;
import gwt;
import hhw;

public class TeleSetupActivity extends hhw
    implements dyk
{

    private final gwt j;

    public TeleSetupActivity()
    {
        j = (new gwt(this, l)).a(k);
    }

    public static Intent a(Context context, dyj dyj1)
    {
        gbh.b(dyj1);
        context = new Intent(context, com/google/android/apps/hangouts/telephony/ui/TeleSetupActivity);
        context.putExtra("controller", new eav(dyj1));
        return context;
    }

    private dyj h()
    {
        return (dyj)((eav)getIntent().getParcelableExtra("controller")).a();
    }

    public Object g()
    {
        return h();
    }

    protected void onCreate(Bundle bundle)
    {
        ebw.e("Babel_telephony", "TeleSetupActivity.onCreate");
        super.onCreate(bundle);
        h().a(this, j);
    }

    public void onDestroy()
    {
        boolean flag = isFinishing();
        ebw.e("Babel_telephony", (new StringBuilder(45)).append("TeleSetupActivity.onDestroy, finishing: ").append(flag).toString());
        super.onDestroy();
        if (isFinishing())
        {
            h().d();
        }
    }

    public void onPause()
    {
        boolean flag = isFinishing();
        ebw.e("Babel_telephony", (new StringBuilder(43)).append("TeleSetupActivity.onPause, finishing: ").append(flag).toString());
        super.onPause();
    }

    public void onResume()
    {
        ebw.e("Babel_telephony", "TeleSetupActivity.onResume");
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = isFinishing();
        ebw.e("Babel_telephony", (new StringBuilder(55)).append("TeleSetupActivity.onSaveInstanceState, finishing: ").append(flag).toString());
        super.onSaveInstanceState(bundle);
    }

    public void onStop()
    {
        boolean flag = isFinishing();
        ebw.e("Babel_telephony", (new StringBuilder(42)).append("TeleSetupActivity.onStop, finishing: ").append(flag).toString());
        super.onStop();
    }
}
