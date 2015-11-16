// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aia;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import aoa;
import ap;
import bid;
import bkm;
import blf;
import cco;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import dcn;
import ehy;
import g;
import gqu;
import grn;
import h;

public class InvitationActivity extends bkm
    implements bid, blf
{

    private aoa n;
    private InvitationFragment o;
    private final gqu p;

    public InvitationActivity()
    {
        p = (new grn(this, r)).a(q);
        new cco(this, r);
    }

    public void a()
    {
        a(((Runnable) (null)));
    }

    public void a(aia aia1)
    {
        o.restartFragment(aia1);
    }

    public void a(ehy ehy, String s, String s1)
    {
        g.a(this, n, ehy, s, s1);
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
    }

    public void a(String s, String s1)
    {
    }

    public void b()
    {
        finish();
    }

    public void b(String s)
    {
        aia aia1 = new aia(s, 0);
        aia1.d = true;
        s = g.a(n.h(), s, aia1.b);
        s.putExtra("conversation_parameters", aia1);
        s.putExtra("opened_from_impression", 1636);
        startActivity(s);
        finish();
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
        setContentView(c(g.gq));
        Intent intent = getIntent();
        n = dcn.e(p.a());
        o = (InvitationFragment)u_().a(h.cN);
        o.setHostInterface(this, this);
        o.initialize(intent.getExtras());
        if (bundle == null)
        {
            g.b(intent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        o.initialize(intent.getExtras());
    }
}
