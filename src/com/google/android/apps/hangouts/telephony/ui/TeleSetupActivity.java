// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.telephony.ui;

import android.content.Intent;
import android.os.Bundle;
import ebu;
import ebv;
import edz;
import eev;
import hbd;
import hmo;

public class TeleSetupActivity extends hmo
    implements ebv
{

    private final hbd j;

    public TeleSetupActivity()
    {
        j = (new hbd(this, l)).a(k);
    }

    private ebu h()
    {
        return (ebu)((edz)getIntent().getParcelableExtra("controller")).a();
    }

    public Object g()
    {
        return h();
    }

    protected void onCreate(Bundle bundle)
    {
        eev.e("Babel_telephony", "TeleSetupActivity.onCreate");
        super.onCreate(bundle);
        h().a(this, j);
    }

    public void onDestroy()
    {
        boolean flag = isFinishing();
        eev.e("Babel_telephony", (new StringBuilder(45)).append("TeleSetupActivity.onDestroy, finishing: ").append(flag).toString());
        super.onDestroy();
        if (isFinishing())
        {
            h().e();
        }
    }

    public void onPause()
    {
        boolean flag = isFinishing();
        eev.e("Babel_telephony", (new StringBuilder(43)).append("TeleSetupActivity.onPause, finishing: ").append(flag).toString());
        super.onPause();
    }

    public void onResume()
    {
        eev.e("Babel_telephony", "TeleSetupActivity.onResume");
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = isFinishing();
        eev.e("Babel_telephony", (new StringBuilder(55)).append("TeleSetupActivity.onSaveInstanceState, finishing: ").append(flag).toString());
        super.onSaveInstanceState(bundle);
    }

    public void onStop()
    {
        boolean flag = isFinishing();
        eev.e("Babel_telephony", (new StringBuilder(42)).append("TeleSetupActivity.onStop, finishing: ").append(flag).toString());
        super.onStop();
    }
}
