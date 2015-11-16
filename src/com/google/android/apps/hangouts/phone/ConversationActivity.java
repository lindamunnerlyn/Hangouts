// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import aih;
import aiv;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import ani;
import ap;
import bg;
import bhp;
import bhr;
import bhs;
import bje;
import bka;
import cbj;
import cki;
import com.google.android.apps.hangouts.views.HangoutsToolbar;
import dbf;
import dbx;
import dbz;
import dih;
import ebr;
import ebw;
import eew;
import g;
import gmo;
import gng;
import h;
import hgx;
import l;
import po;

public class ConversationActivity extends bka
    implements bhr, dbz, dih
{

    private ani m;
    private bhp n;
    private android.os.StrictMode.ThreadPolicy o;
    private final gmo r;

    public ConversationActivity()
    {
        r = (new gng(this, q)).a(p);
        new aiv(this, q);
        new cbj(this, q);
    }

    public static bhp a(ConversationActivity conversationactivity)
    {
        return conversationactivity.n;
    }

    private static aih c(Intent intent)
    {
        aih aih2 = (aih)intent.getParcelableExtra("conversation_parameters");
        aih aih1 = aih2;
        if (aih2 == null)
        {
            aih1 = new aih(intent.getStringExtra("conversation_id"), intent.getIntExtra("client_conversation_type", 0));
        }
        return aih1;
    }

    public void a()
    {
        a(((Runnable) (null)));
    }

    public void a(ad ad)
    {
        if (ad instanceof bje)
        {
            ((bje)ad).a(new cki(this));
        }
    }

    public void a(aih aih1)
    {
        if (ebw.a("Babel", 3))
        {
            Object obj = String.valueOf(aih1.a);
            if (((String) (obj)).length() != 0)
            {
                obj = "Restart fragment for new conv id: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Restart fragment for new conv id: ");
            }
            ebw.d("Babel", ((String) (obj)));
        }
        n = ((bhs)hgx.a(this, bhs)).a();
        n.a(this);
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("conversation_parameters", aih1);
        n.setArguments(((Bundle) (obj)));
        t_().a().b(h.ax, n, bhp.getName()).b();
    }

    public void a(eew eew, String s, String s1)
    {
        g.a(this, m, eew, s, s1);
    }

    public void a(Runnable runnable)
    {
        finish();
        if (runnable != null)
        {
            runnable.run();
        }
    }

    public void a(String s)
    {
        setTitle(getString(l.aD, new Object[] {
            s
        }));
        g().a(ebr.d(s));
    }

    public void a(String s, String s1)
    {
        HangoutsToolbar hangoutstoolbar = (HangoutsToolbar)l;
        hangoutstoolbar.c(s);
        hangoutstoolbar.e(s1);
    }

    public void b(dbx dbx1)
    {
        switch (dbx1.b())
        {
        default:
            int i = dbx1.b();
            ebw.g("Babel", (new StringBuilder(32)).append("Unrecognized action: ").append(i).toString());
            // fall through

        case 1: // '\001'
            return;

        case 2: // '\002'
            g.a(this, dbx1, m.h(), m.a());
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
        l.setVisibility(i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag = g.a(this, "babel_conversation_activity_disable_strict_mode", false);
        if (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug") || flag)
        {
            o = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).build());
        }
        setContentView(c(g.fn));
        Object obj = (HangoutsToolbar)l;
        ((HangoutsToolbar) (obj)).v().setFocusableInTouchMode(true);
        ((HangoutsToolbar) (obj)).w().setPadding(0, 0, 0, 0);
        obj = ((HangoutsToolbar) (obj)).x();
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        ((TextView) (obj)).setHorizontalFadingEdgeEnabled(true);
        ((TextView) (obj)).setPadding(0, 0, 0, 0);
        ((TextView) (obj)).setSelected(true);
        obj = getIntent();
        m = dbf.e(r.a());
        if (bundle == null)
        {
            if (((Intent) (obj)).hasExtra("share_intent"))
            {
                ((Intent) (obj)).putExtra("opened_from_impression", 2405);
            }
            g.b(((Intent) (obj)));
        }
        bundle = c(((Intent) (obj)));
        obj = t_();
        n = (bhp)((ap) (obj)).a(bhp.getName());
        if (n == null)
        {
            n = ((bhs)hgx.a(this, bhs)).a();
            ((ap) (obj)).a().a(h.ax, n, bhp.getName()).b();
            obj = new Bundle();
            ((Bundle) (obj)).putParcelable("conversation_parameters", bundle);
            n.setArguments(((Bundle) (obj)));
        }
        n.a(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (o != null)
        {
            StrictMode.setThreadPolicy(o);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(c(intent));
    }
}
