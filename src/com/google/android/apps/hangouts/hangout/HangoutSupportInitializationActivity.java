// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import aoa;
import bkm;
import bnk;
import bph;
import dcn;
import gdv;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            HangoutActivity

public final class HangoutSupportInitializationActivity extends bkm
    implements android.content.DialogInterface.OnClickListener
{

    public HangoutSupportInitializationActivity()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bnk.a();
        if (bnk.c())
        {
            bundle = getIntent();
            bundle.setClass(this, com/google/android/apps/hangouts/hangout/HangoutActivity);
            bundle.putExtra("account_id", dcn.a(((bph)getIntent().getParcelableExtra("hangout_room_info")).a(), null).h());
            startActivity(bundle);
            finish();
            return;
        }
        ((bph)getIntent().getParcelableExtra("hangout_room_info")).s();
        int i;
        if (getPackageManager().hasSystemFeature("android.hardware.microphone"))
        {
            i = l.ec;
        } else
        {
            i = l.ed;
        }
        bundle = new android.app.AlertDialog.Builder(this);
        bundle.setMessage(getString(i));
        bundle.setPositiveButton(l.hd, this);
        bundle.setCancelable(false);
        bundle.show();
    }

    public Dialog onCreateDialog(int i, Bundle bundle)
    {
        gdv.a(Integer.valueOf(i), Integer.valueOf(0));
        bundle = new ProgressDialog(this);
        bundle.setMessage(getString(l.fg));
        bundle.setProgressStyle(0);
        bundle.setCancelable(false);
        return bundle;
    }
}
