// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video.sdk;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import eq;
import gkc;

public class  extends Activity
{

    public void onActivityResult(int i, int j, Intent intent)
    {
        Intent intent1 = new Intent("com.google.android.libraries.hangouts.video.sdk.ScreenCapturer");
        intent1.putExtra("share_result_code", j);
        intent1.putExtra("share_result_data", intent);
        eq.a(getApplicationContext()).a(intent1);
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        setFinishOnTouchOutside(false);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.onCreate(bundle);
        bundle = (Intent)getIntent().getParcelableExtra("share_permission_intent");
        gkc.a("vclib", "requesting capture now...");
        startActivityForResult(bundle, 1);
    }

    public ()
    {
    }
}
