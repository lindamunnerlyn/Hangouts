// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.hangouts.phone.HelpAndFeedbackActivity;
import java.util.Set;

public final class coo extends WebViewClient
{

    final View a;
    final HelpAndFeedbackActivity b;

    public coo(HelpAndFeedbackActivity helpandfeedbackactivity, View view)
    {
        b = helpandfeedbackactivity;
        a = view;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        a.setVisibility(8);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        a.setVisibility(0);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri = Uri.parse(s);
        if ("https".equals(uri.getScheme()) && HelpAndFeedbackActivity.m().contains(uri.getHost()))
        {
            webview.loadUrl(s);
        } else
        {
            webview = new Intent("android.intent.action.VIEW");
            webview.setData(uri);
            b.startActivity(webview);
        }
        return true;
    }
}
