// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ad;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import aoa;
import ap;
import atu;
import bg;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import cov;
import cqq;
import cqr;
import cqs;
import dcn;
import eev;
import g;
import gqv;
import gqw;
import h;
import hbd;
import hbo;
import hbu;
import hbv;
import hla;
import hmo;
import l;

public class ShareIntentActivity extends hmo
    implements gqw
{

    public aoa j;
    private ConversationListFragment m;
    private boolean n;
    private hbd o;

    public ShareIntentActivity()
    {
        o = (new hbd(this, l)).a(k).b(this);
    }

    private void a(atu atu1)
    {
        atu1 = g.a(j, null, null, cov.a, atu1);
        atu1.putExtra("share_intent", getIntent());
        startActivityForResult(atu1, 1);
        overridePendingTransition(g.cr, g.cs);
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
        m = (ConversationListFragment)ad;
        m.a(new cqr(this));
        m.b(n);
        m.a(3);
        if (m == null) goto _L2; else goto _L3
_L3:
        ad = u_().a();
        if (j == null) goto _L5; else goto _L4
_L4:
label0:
        {
            m.a(j);
            Button button = (Button)findViewById(h.T);
            Button button1;
            int i;
            if (j.p())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            button.setVisibility(i);
            button1 = (Button)findViewById(h.S);
            i = byte0;
            if (!j.o())
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
        ad.c(m);
_L7:
        ad.b();
_L2:
        return;
_L5:
        ad.b(m);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int k)
    {
        if (gqv2 == gqv.c)
        {
            j = dcn.e(k);
            gqv1 = u_().a();
            m = new ConversationListFragment();
            gqv1.a(h.au, m, com/google/android/apps/hangouts/fragments/ConversationListFragment.getName());
            gqv1.b();
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
            eev.f("Babel", "Sharing detail is not attached");
            finish();
            return;
        }
        if (bundle.getBooleanExtra("sms_convs_only", false))
        {
            n = true;
        }
        if (n && !dcn.j() && dcn.k() == null)
        {
            bundle = hla.a(getString(l.sx), getString(l.sw), getString(l.sy), "");
            bundle.a(new cqq(this));
            bundle.a(u_(), "");
            return;
        }
        setContentView(g.gS);
        bundle = new hbv();
        if (n)
        {
            bundle.a(new cqs());
        }
        bundle = (new hbo()).a(hbu, bundle.c());
        o.a(bundle);
    }

    public void onStartNewHangoutButtonClick(View view)
    {
        a(atu.a);
    }

    public void onStartNewSmsButtonClick(View view)
    {
        a(atu.b);
    }
}
