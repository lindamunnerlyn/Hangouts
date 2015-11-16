// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ani;
import ap;
import bgx;
import bka;
import bnd;
import bpd;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import dbf;
import dbx;
import dbz;
import ebw;
import g;
import gmo;
import gng;
import h;
import hgx;
import java.util.ArrayList;
import l;
import po;

public class CallContactPickerActivity extends bka
    implements bgx, dbz
{

    private ani m;
    private int n;

    public CallContactPickerActivity()
    {
        (new gng(this, q)).a(p);
    }

    public int a()
    {
        return n;
    }

    public void a(dbx dbx1)
    {
        if (dbx1.b() == 2)
        {
            g.a(dbx1, m, this, this);
        } else
        if (dbx1.b() == 3)
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(dbx1.a());
            dbx1 = new ArrayList();
            bnd bnd1 = bnd.a();
            bpd bpd1 = bnd1.t();
            if (bpd1 != null && bpd1.i())
            {
                bnd1.b(arraylist, dbx1);
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

    public String m_()
    {
        return null;
    }

    public void n_()
    {
    }

    public void o_()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = getIntent().getIntExtra("com.google.android.apps.hangouts.voiceCallActionMode", -1);
        if (n == -1)
        {
            ebw.g("Babel", "Missing EXTRA_VOICE_CALL_ACTION_MODE");
            setResult(0);
            finish();
        } else
        {
            m = dbf.e(((gmo)p.a(gmo)).a());
            setContentView(g.fe);
            bundle = (CallContactPickerFragment)t_().a(h.W);
            bundle.a(this);
            bundle.c();
            if (n == 2)
            {
                setTitle(getString(l.l));
                return;
            }
        }
    }

    protected void onStart()
    {
        super.onStart();
        g().a(true);
    }
}
