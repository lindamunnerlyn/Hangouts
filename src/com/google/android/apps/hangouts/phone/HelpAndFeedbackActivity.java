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
import bka;
import bnd;
import bpd;
import cnu;
import coo;
import dbq;
import ecs;
import fyc;
import fyd;
import fyh;
import fzc;
import fzd;
import fze;
import fzf;
import fzg;
import g;
import gmo;
import h;
import hgx;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import l;
import po;

public class HelpAndFeedbackActivity extends bka
{

    private static final Set m;
    private WebView n;

    public HelpAndFeedbackActivity()
    {
    }

    public static Set m()
    {
        return m;
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        }
        if (menuitem.getItemId() == h.bw)
        {
            g.a(null, 1608);
            menuitem = getApplicationContext();
            fyc fyc1 = ((fyd)hgx.a(menuitem, fyd)).a(((fze)hgx.a(menuitem, fze)).a()).a();
            fyc1.a();
            if (g.nR == null)
            {
                g.nR = (fzg)hgx.a(menuitem, fzg);
            }
            Object obj = bnd.a().t();
            if (obj != null)
            {
                g.nR.a("session_id", ((bpd) (obj)).m());
            }
            obj = dbq.L(((gmo)hgx.a(menuitem, gmo)).a());
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                g.nR.a("exp", ((String) (obj)));
            }
            obj = g.nR.a().a();
            if (obj != null && ((Bitmap) (obj)).isRecycled())
            {
                g.nR.a(null);
            }
            ((fzd)hgx.a(menuitem, fzd)).a(fyc1).a(g.nR.a()).a(new cnu(fyc1));
            return true;
        }
        if (menuitem.getItemId() == h.gW)
        {
            g.b(this, g.nS.getPackageName());
            g.a(null, 1609);
            return true;
        }
        if (menuitem.getItemId() == h.dD)
        {
            startActivity(g.q(g.a(this, "babel_privacy_policy_url", "https://www.google.com/policies/privacy/")));
            g.a(null, 1610);
            return true;
        }
        if (menuitem.getItemId() == h.dC)
        {
            showDialog(1);
            g.a(null, 1611);
            return true;
        }
        if (menuitem.getItemId() == h.dG)
        {
            startActivity(g.q(g.a(this, "babel_tos_url", "https://www.google.com/accounts/tos")));
            g.a(null, 1612);
            return true;
        }
        if (menuitem.getItemId() == h.dA)
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
        if (menuitem.getItemId() == h.dx)
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
        setContentView(g.go);
        android.view.View view = findViewById(h.dq);
        n = (WebView)findViewById(h.cJ);
        n.getSettings().setJavaScriptEnabled(true);
        if (bundle == null)
        {
            n.setWebViewClient(new coo(this, view));
            n.loadUrl(j());
        }
        bundle = g();
        bundle.b(getResources().getString(l.eW, new Object[] {
            ((ecs)p.a(ecs)).c()
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
        dialog.setContentView(g.gP);
        dialog.setTitle(l.fO);
        ((WebView)dialog.findViewById(h.eq)).loadUrl("file:///android_asset/licenses.html");
        return dialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(g.hw, menu);
        boolean flag = super.onCreateOptionsMenu(menu);
        if ("KR".equals(g.v(getApplicationContext())))
        {
            menu.findItem(h.dx).setVisible(true);
        }
        return flag;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        g.nR = null;
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        g.nR = null;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        n.restoreState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        n.saveState(bundle);
    }

    static 
    {
        HashSet hashset = new HashSet();
        m = hashset;
        hashset.add("support.google.com");
        m.add("www.google.co.kr");
        m.add("www.google.com");
    }
}
