// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ani;
import cnv;
import dbf;
import eoi;
import g;
import gmo;
import gms;
import gmu;
import gmw;
import gng;
import h;
import hgx;
import hhw;
import l;

public class GooglePlusUpgradeActivity extends hhw
{

    private final gmo j;
    private Button m;
    private Button n;

    public GooglePlusUpgradeActivity()
    {
        j = (new gng(this, l)).a(k);
    }

    public static Button a(GooglePlusUpgradeActivity googleplusupgradeactivity)
    {
        return googleplusupgradeactivity.m;
    }

    public static void b(GooglePlusUpgradeActivity googleplusupgradeactivity)
    {
        googleplusupgradeactivity.i();
    }

    public static Button c(GooglePlusUpgradeActivity googleplusupgradeactivity)
    {
        return googleplusupgradeactivity.n;
    }

    private void i()
    {
        startActivityForResult(eoi.a(dbf.e(j.a()).a()), 1);
    }

    protected int g()
    {
        return g.fU;
    }

    protected void h()
    {
        int k;
        int i1;
        int j1;
        if ("g_plus_upgrade_photo".equals(getIntent().getStringExtra("g_plus_upgrade_type")))
        {
            k = com.google.android.apps.hangouts.R.drawable.bI;
            i1 = l.ti;
            j1 = l.aJ;
        } else
        {
            j1 = 0;
            i1 = -1;
            k = 0;
        }
        if (i1 != -1)
        {
            ((ImageView)findViewById(h.gQ)).setImageResource(k);
            ((TextView)findViewById(h.gR)).setText(i1);
            n.setText(j1);
        }
    }

    protected void onActivityResult(int k, int i1, Intent intent)
    {
        if (k == 1)
        {
            intent = new Intent();
            if (i1 == -1)
            {
                Toast.makeText(this, getString(l.cj, new Object[] {
                    j.c().b("account_name")
                }), 1).show();
                ((gms)getBinder().a(gms)).b(j.a()).c("is_google_plus", true).d();
                setResult(-1, intent);
            } else
            {
                Toast.makeText(this, getString(l.ci), 0).show();
                setResult(0, intent);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("g_plus_upgrade_now", false))
        {
            i();
            return;
        } else
        {
            setContentView(g());
            m = (Button)findViewById(h.dj);
            n = (Button)findViewById(h.aM);
            h();
            bundle = new cnv(this);
            m.setOnClickListener(bundle);
            n.setOnClickListener(bundle);
            return;
        }
    }
}
