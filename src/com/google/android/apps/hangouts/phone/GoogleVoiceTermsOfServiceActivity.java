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
import ani;
import bka;
import cnw;
import cny;
import cnz;
import dbf;
import g;
import gmo;
import gng;
import h;
import l;
import po;

public class GoogleVoiceTermsOfServiceActivity extends bka
{

    private static final int s[][];
    private static final String t[] = {
        "voice_android_calling", "voice_rates", "voice_legal"
    };
    private final gmo m;
    private Button n;
    private Button o;
    private ani r;

    public GoogleVoiceTermsOfServiceActivity()
    {
        m = (new gng(this, q)).a(p);
    }

    public static ani a(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        return googlevoicetermsofserviceactivity.r;
    }

    public static void a(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity, int i)
    {
        googlevoicetermsofserviceactivity.d(i);
    }

    public static gmo b(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        return googlevoicetermsofserviceactivity.m;
    }

    private void d(int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        g.a(r, 1098);
_L4:
        setResult(i, getIntent());
        finish();
        return;
_L2:
        if (i == 0)
        {
            g.a(r, 1099);
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
        setContentView(g.hp);
        r = dbf.e(m.a());
        setTitle(getString(l.fz));
        n = (Button)findViewById(h.gF);
        o = (Button)findViewById(h.gD);
        bundle = s;
        int k = bundle.length;
        for (int i = 0; i < k; i++)
        {
            Spannable spannable = bundle[i];
            TextView textview = (TextView)findViewById(spannable[0]);
            textview.setText(Html.fromHtml(getString(spannable[1], new Object[] {
                g.f("https://www.google.com/support/hangouts/?hl=%locale%", t[spannable[2]]).toString()
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
                spannable.setSpan(new cnz(this, urlspan.getURL()), j1, k1, 0);
            }

            textview.setText(spannable);
        }

        o.setSelected(true);
        o.setOnClickListener(new cnw(this));
        n.setOnClickListener(new cny(this));
    }

    protected void onStart()
    {
        super.onStart();
        g().a(true);
        g.a(r, 1097);
    }

    static 
    {
        int i = h.gE;
        int j = l.tQ;
        int k = h.gG;
        int i1 = l.tR;
        int j1 = h.gH;
        int k1 = l.tS;
        s = (new int[][] {
            new int[] {
                i, j, 0
            }, new int[] {
                k, i1, 1
            }, new int[] {
                j1, k1, 2
            }
        });
    }
}
