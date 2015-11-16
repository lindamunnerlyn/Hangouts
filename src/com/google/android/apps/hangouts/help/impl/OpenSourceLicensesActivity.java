// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.help.impl;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import g;

public class OpenSourceLicensesActivity extends Activity
{

    public OpenSourceLicensesActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.mm);
        bundle = (WebView)findViewById(g.ml);
        bundle.loadUrl("file:///android_asset/licenses.html");
        bundle.getSettings().setJavaScriptEnabled(true);
    }
}
