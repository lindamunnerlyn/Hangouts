// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import ani;
import ap;
import atd;
import bg;
import cnd;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import cpa;
import cpb;
import cpc;
import dbf;
import ebw;
import g;
import gmp;
import gmq;
import gwt;
import gxe;
import gxj;
import gxk;
import h;
import hgi;
import hhw;
import l;

public class ShareIntentActivity extends hhw
    implements gmq
{

    private ConversationListFragment j;
    private ani m;
    private boolean n;
    private gwt o;

    public ShareIntentActivity()
    {
        o = (new gwt(this, l)).a(k).b(this);
    }

    public static ani a(ShareIntentActivity shareintentactivity)
    {
        return shareintentactivity.m;
    }

    private void a(atd atd1)
    {
        atd1 = g.a(m, null, null, cnd.a, atd1);
        atd1.putExtra("share_intent", getIntent());
        startActivityForResult(atd1, 1);
        overridePendingTransition(g.cs, g.ct);
    }

    public void a(ad ad)
    {
        boolean flag;
        byte byte0;
        byte0 = 8;
        flag = false;
        super.a(ad);
        if (!(ad instanceof ConversationListFragment)) goto _L2; else goto _L1
_L1:
        j = (ConversationListFragment)ad;
        j.a(new cpb(this));
        j.b(n);
        j.a(3);
        if (j == null) goto _L2; else goto _L3
_L3:
        ad = t_().a();
        if (m == null) goto _L5; else goto _L4
_L4:
label0:
        {
            j.a(m);
            Button button = (Button)findViewById(h.T);
            Button button1;
            int i;
            if (m.r())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            button.setVisibility(i);
            button1 = (Button)findViewById(h.S);
            i = byte0;
            if (!m.q())
            {
                if (n)
                {
                    i = byte0;
                } else
                {
                    i = 0;
                }
            }
            button1.setVisibility(i);
            if (button.getVisibility() != 0)
            {
                i = ((flag) ? 1 : 0);
                if (button1.getVisibility() != 0)
                {
                    break label0;
                }
            }
            i = 1;
        }
        if (i == 0)
        {
            throw new IllegalStateException(String.valueOf("At least one button must be made visible"));
        }
        ad.c(j);
_L7:
        ad.b();
_L2:
        return;
_L5:
        ad.b(j);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int k)
    {
        if (gmp2 == gmp.c)
        {
            m = dbf.e(k);
            gmp1 = t_().a();
            j = new ConversationListFragment();
            gmp1.a(h.az, j, com/google/android/apps/hangouts/fragments/ConversationListFragment.getName());
            gmp1.b();
            return;
        } else
        {
            finish();
            return;
        }
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (i == 0 || i == 1)
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null)
        {
            ebw.f("Babel", "Sharing detail is not attached");
            finish();
            return;
        }
        if (bundle.getBooleanExtra("sms_convs_only", false))
        {
            n = true;
        }
        if (n && !dbf.j() && dbf.k() == null)
        {
            bundle = hgi.a(getString(l.te), getString(l.td), getString(l.tf), "");
            bundle.a(new cpa(this));
            bundle.a(t_(), "");
            return;
        }
        setContentView(g.ha);
        bundle = new gxk();
        if (n)
        {
            bundle.a(new cpc());
        }
        bundle = (new gxe()).a(gxj, bundle.c());
        o.a(bundle);
    }

    public void onStartNewHangoutButtonClick(View view)
    {
        a(atd.a);
    }

    public void onStartNewSmsButtonClick(View view)
    {
        a(atd.b);
    }
}
