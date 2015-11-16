// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bkm;
import bnk;
import bpm;
import cpm;
import cqe;
import dcz;
import efu;
import g;
import gaq;
import gar;
import gav;
import gbq;
import gbr;
import gbs;
import gbt;
import gbu;
import gqu;
import h;
import hlp;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import l;
import pq;

public class HelpAndFeedbackActivity extends bkm
{

    private static final Set n;
    private WebView o;

    public HelpAndFeedbackActivity()
    {
    }

    public static Set m()
    {
        return n;
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        }
        if (menuitem.getItemId() == h.bq)
        {
            g.a(null, 1608);
            menuitem = getApplicationContext();
            gaq gaq1 = ((gar)hlp.a(menuitem, gar)).a(((gbs)hlp.a(menuitem, gbs)).a()).a();
            gaq1.a();
            if (g.nT == null)
            {
                g.nT = (gbu)hlp.a(menuitem, gbu);
            }
            Object obj = bnk.a().s();
            if (obj != null)
            {
                g.nT.a("session_id", ((bpm) (obj)).l());
            }
            obj = dcz.R(((gqu)hlp.a(menuitem, gqu)).a());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                g.nT.a("exp", ((String) (obj)));
            }
            obj = g.nT.a().a();
            if (obj != null && ((Bitmap) (obj)).isRecycled())
            {
                g.nT.a(null);
            }
            ((gbr)hlp.a(menuitem, gbr)).a(gaq1).a(g.nT.a()).a(new cpm(gaq1));
            return true;
        }
        if (menuitem.getItemId() == h.gC)
        {
            g.b(this, g.nU.getPackageName());
            g.a(null, 1609);
            return true;
        }
        if (menuitem.getItemId() == h.dr)
        {
            startActivity(g.q(g.a(this, "babel_privacy_policy_url", "https://www.google.com/policies/privacy/")));
            g.a(null, 1610);
            return true;
        }
        if (menuitem.getItemId() == h.dq)
        {
            showDialog(1);
            g.a(null, 1611);
            return true;
        }
        if (menuitem.getItemId() == h.du)
        {
            startActivity(g.q(g.a(this, "babel_tos_url", "https://www.google.com/accounts/tos")));
            g.a(null, 1612);
            return true;
        }
        if (menuitem.getItemId() == h._flddo)
        {
            String s = g.a(this, "babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
            menuitem = s;
            if (!TextUtils.isEmpty(Locale.getDefault().getLanguage()))
            {
                menuitem = String.valueOf(Locale.getDefault().getLanguage());
                menuitem = s.replace("/en/", (new StringBuilder(String.valueOf(menuitem).length() + 2)).append("/").append(menuitem).append("/").toString());
            }
            startActivity(g.q(menuitem));
            g.a(null, 1669);
            return true;
        }
        if (menuitem.getItemId() == h.dl)
        {
            startActivity(g.q(g.a(this, "babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location/")));
            g.a(null, 1613);
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    protected String j()
    {
        return g.f("https://www.google.com/support/hangouts/?hl=%locale%", "androidhelp").toString();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.gk);
        android.view.View view = findViewById(h.de);
        o = (WebView)findViewById(h.cz);
        o.getSettings().setJavaScriptEnabled(true);
        if (bundle == null)
        {
            o.setWebViewClient(new cqe(this, view));
            o.loadUrl(j());
        }
        bundle = g();
        bundle.b(getResources().getString(l.eF, new Object[] {
            ((efu)q.a(efu)).c()
        }));
        bundle.a(true);
    }

    protected Dialog onCreateDialog(int i)
    {
        Dialog dialog;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            dialog = new Dialog(this);
            break;
        }
        dialog.setContentView(g.gH);
        dialog.setTitle(l.fx);
        ((WebView)dialog.findViewById(h.dY)).loadUrl("file:///android_asset/licenses.html");
        return dialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(g.ho, menu);
        boolean flag = super.onCreateOptionsMenu(menu);
        if ("KR".equals(g.v(getApplicationContext())))
        {
            menu.findItem(h.dl).setVisible(true);
        }
        return flag;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        g.nT = null;
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        g.nT = null;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        o.restoreState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        o.saveState(bundle);
    }

    static 
    {
        HashSet hashset = new HashSet();
        n = hashset;
        hashset.add("support.google.com");
        n.add("www.google.co.kr");
        n.add("www.google.com");
    }
}
