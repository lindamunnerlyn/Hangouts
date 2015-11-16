// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import aia;
import ais;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import aoa;
import ap;
import bg;
import bib;
import bid;
import bie;
import bjq;
import bkm;
import cco;
import cln;
import com.google.android.apps.hangouts.views.HangoutsToolbar;
import dcn;
import ddg;
import ddi;
import djs;
import eep;
import eev;
import ehy;
import g;
import gqu;
import grn;
import h;
import hlp;
import l;
import pq;

public class ConversationActivity extends bkm
    implements bid, ddi, djs
{

    public bib n;
    private aoa o;
    private android.os.StrictMode.ThreadPolicy p;
    private final gqu s;

    public ConversationActivity()
    {
        s = (new grn(this, r)).a(q);
        new ais(this, r);
        new cco(this, r);
    }

    private static aia c(Intent intent)
    {
        aia aia2 = (aia)intent.getParcelableExtra("conversation_parameters");
        aia aia1 = aia2;
        if (aia2 == null)
        {
            aia1 = new aia(intent.getStringExtra("conversation_id"), intent.getIntExtra("client_conversation_type", 0));
        }
        return aia1;
    }

    public void a()
    {
        a(((Runnable) (null)));
    }

    public void a(ad ad)
    {
        if (ad instanceof bjq)
        {
            ((bjq)ad).a(new cln(this));
        }
    }

    public void a(aia aia1)
    {
        if (eev.a("Babel", 3))
        {
            Object obj = String.valueOf(aia1.a);
            if (((String) (obj)).length() != 0)
            {
                obj = "Restart fragment for new conv id: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Restart fragment for new conv id: ");
            }
            eev.d("Babel", ((String) (obj)));
        }
        n = ((bie)hlp.a(this, bie)).a();
        n.a(this);
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("conversation_parameters", aia1);
        n.setArguments(((Bundle) (obj)));
        u_().a().b(h.as, n, bib.getName()).b();
    }

    public void a(ehy ehy, String s1, String s2)
    {
        g.a(this, o, ehy, s1, s2);
    }

    public void a(Runnable runnable)
    {
        finish();
        if (runnable != null)
        {
            runnable.run();
        }
    }

    public void a(String s1)
    {
        setTitle(getString(l.ay, new Object[] {
            s1
        }));
        g().a(eep.d(s1));
    }

    public void a(String s1, String s2)
    {
        HangoutsToolbar hangoutstoolbar = (HangoutsToolbar)m;
        hangoutstoolbar.c(s1);
        hangoutstoolbar.e(s2);
    }

    public void b(ddg ddg1)
    {
        switch (ddg1.b())
        {
        default:
            int i = ddg1.b();
            eev.g("Babel", (new StringBuilder(32)).append("Unrecognized action: ").append(i).toString());
            // fall through

        case 1: // '\001'
            return;

        case 2: // '\002'
            g.a(this, ddg1, o.h(), o.a());
            break;
        }
    }

    public void b_(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        m.setVisibility(i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag = g.a(this, "babel_conversation_activity_disable_strict_mode", false);
        if (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug") || flag)
        {
            p = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).build());
        }
        setContentView(c(g.fl));
        Object obj = (HangoutsToolbar)m;
        ((HangoutsToolbar) (obj)).v().setFocusableInTouchMode(true);
        ((HangoutsToolbar) (obj)).w().setPadding(0, 0, 0, 0);
        obj = ((HangoutsToolbar) (obj)).x();
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        ((TextView) (obj)).setHorizontalFadingEdgeEnabled(true);
        ((TextView) (obj)).setPadding(0, 0, 0, 0);
        ((TextView) (obj)).setSelected(true);
        obj = getIntent();
        o = dcn.e(s.a());
        if (bundle == null)
        {
            if (((Intent) (obj)).hasExtra("share_intent"))
            {
                ((Intent) (obj)).putExtra("opened_from_impression", 2405);
            }
            g.b(((Intent) (obj)));
        }
        bundle = c(((Intent) (obj)));
        obj = u_();
        n = (bib)((ap) (obj)).a(bib.getName());
        if (n == null)
        {
            n = ((bie)hlp.a(this, bie)).a();
            ((ap) (obj)).a().a(h.as, n, bib.getName()).b();
            obj = new Bundle();
            ((Bundle) (obj)).putParcelable("conversation_parameters", bundle);
            n.setArguments(((Bundle) (obj)));
        }
        n.a(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (p != null)
        {
            StrictMode.setThreadPolicy(p);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(c(intent));
    }
}
