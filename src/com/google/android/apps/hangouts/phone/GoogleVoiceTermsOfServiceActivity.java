// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import aoa;
import bkm;
import cpn;
import cpp;
import cpq;
import dcn;
import g;
import gqu;
import grn;
import h;
import l;
import pq;

public class GoogleVoiceTermsOfServiceActivity extends bkm
{

    private static final int t[][];
    private static final String u[] = {
        "voice_android_calling", "voice_rates", "voice_legal"
    };
    private final gqu n;
    private Button o;
    private Button p;
    private aoa s;

    public GoogleVoiceTermsOfServiceActivity()
    {
        n = (new grn(this, r)).a(q);
    }

    public static aoa a(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        return googlevoicetermsofserviceactivity.s;
    }

    public static void a(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity, int i)
    {
        googlevoicetermsofserviceactivity.d(i);
    }

    public static gqu b(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        return googlevoicetermsofserviceactivity.n;
    }

    private void d(int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        g.a(s, 1098);
_L4:
        setResult(i, getIntent());
        finish();
        return;
_L2:
        if (i == 0)
        {
            g.a(s, 1099);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            d(0);
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.hh);
        s = dcn.e(n.a());
        setTitle(getString(l.fi));
        o = (Button)findViewById(h.gn);
        p = (Button)findViewById(h.gl);
        bundle = t;
        int k = bundle.length;
        for (int i = 0; i < k; i++)
        {
            Spannable spannable = bundle[i];
            TextView textview = (TextView)findViewById(spannable[0]);
            textview.setText(Html.fromHtml(getString(spannable[1], new Object[] {
                g.f("https://www.google.com/support/hangouts/?hl=%locale%", u[spannable[2]]).toString()
            })));
            textview.setMovementMethod(LinkMovementMethod.getInstance());
            spannable = (Spannable)textview.getText();
            URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
            int i1 = aurlspan.length;
            for (int j = 0; j < i1; j++)
            {
                URLSpan urlspan = aurlspan[j];
                int j1 = spannable.getSpanStart(urlspan);
                int k1 = spannable.getSpanEnd(urlspan);
                spannable.removeSpan(urlspan);
                spannable.setSpan(new cpq(this, urlspan.getURL()), j1, k1, 0);
            }

            textview.setText(spannable);
        }

        p.setSelected(true);
        p.setOnClickListener(new cpn(this));
        o.setOnClickListener(new cpp(this));
    }

    protected void onStart()
    {
        super.onStart();
        g().a(true);
        g.a(s, 1097);
    }

    static 
    {
        int i = h.gm;
        int j = l.ti;
        int ai[] = {
            h.go, l.tj, 1
        };
        int k = h.gp;
        int i1 = l.tk;
        t = (new int[][] {
            new int[] {
                i, j, 0
            }, ai, new int[] {
                k, i1, 2
            }
        });
    }
}
