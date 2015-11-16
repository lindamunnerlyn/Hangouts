// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import g;
import h;

public class LicenseActivity extends Activity
{

    public LicenseActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.gB);
        ((WebView)findViewById(h.ao)).loadUrl("file:///android_asset/licenses.html");
    }
}
