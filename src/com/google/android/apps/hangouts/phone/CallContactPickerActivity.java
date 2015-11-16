// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import aoa;
import ap;
import bhj;
import bkm;
import bnk;
import bpm;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import dcn;
import ddg;
import ddi;
import eev;
import g;
import gqu;
import grn;
import h;
import hlp;
import java.util.ArrayList;
import l;
import pq;

public class CallContactPickerActivity extends bkm
    implements bhj, ddi
{

    private aoa n;
    private int o;

    public CallContactPickerActivity()
    {
        (new grn(this, r)).a(q);
    }

    public int a()
    {
        return o;
    }

    public void a(ddg ddg1)
    {
        if (ddg1.b() == 2)
        {
            g.a(ddg1, n, this, this);
        } else
        if (ddg1.b() == 3)
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(ddg1.a());
            ddg1 = new ArrayList();
            bnk bnk1 = bnk.a();
            bpm bpm1 = bnk1.s();
            if (bpm1 != null && bpm1.i())
            {
                bnk1.b(arraylist, ddg1);
                return;
            }
        }
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            j();
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    public String b()
    {
        return null;
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
            g.a(this, ddg1, n.h(), n.a());
            break;
        }
    }

    public void c()
    {
    }

    public String d()
    {
        return null;
    }

    public void e()
    {
    }

    public boolean h()
    {
        return true;
    }

    protected void j()
    {
        setResult(0);
        finish();
    }

    public void o_()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = getIntent().getIntExtra("com.google.android.apps.hangouts.voiceCallActionMode", -1);
        if (o == -1)
        {
            eev.g("Babel", "Missing EXTRA_VOICE_CALL_ACTION_MODE");
            setResult(0);
            finish();
        } else
        {
            n = dcn.e(((gqu)q.a(gqu)).a());
            setContentView(g.fc);
            bundle = (CallContactPickerFragment)u_().a(h.W);
            bundle.a(this);
            bundle.c();
            if (o == 2)
            {
                setTitle(getString(l.k));
                return;
            }
        }
    }

    protected void onStart()
    {
        super.onStart();
        g().a(true);
    }

    public void p_()
    {
    }
}
