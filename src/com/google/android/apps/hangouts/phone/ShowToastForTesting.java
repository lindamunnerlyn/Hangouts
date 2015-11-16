// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class ShowToastForTesting extends Activity
{

    public ShowToastForTesting()
    {
    }

    public void onStart()
    {
        super.onStart();
        Toast.makeText(this, getIntent().getStringExtra("toast_text"), 1).show();
        finish();
    }
}
