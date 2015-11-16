// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aih;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import ani;
import ap;
import bhr;
import bka;
import bkw;
import cbj;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import dbf;
import eew;
import g;
import gmo;
import gng;
import h;

public class InvitationActivity extends bka
    implements bhr, bkw
{

    private ani m;
    private InvitationFragment n;
    private final gmo o;

    public InvitationActivity()
    {
        o = (new gng(this, q)).a(p);
        new cbj(this, q);
    }

    public void a()
    {
        a(((Runnable) (null)));
    }

    public void a(aih aih1)
    {
        n.restartFragment(aih1);
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
    }

    public void a(String s, String s1)
    {
    }

    public void b(String s)
    {
        aih aih1 = new aih(s, 0);
        aih1.d = true;
        s = g.a(m.h(), s, aih1.b);
        s.putExtra("conversation_parameters", aih1);
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
        l.setVisibility(i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(c(g.gu));
        Intent intent = getIntent();
        m = dbf.e(o.a());
        n = (InvitationFragment)t_().a(h.cY);
        n.setHostInterface(this, this);
        n.initialize(intent.getExtras());
        if (bundle == null)
        {
            g.b(intent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        n.initialize(intent.getExtras());
    }

    public void u_()
    {
        finish();
    }
}
