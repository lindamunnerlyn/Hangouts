// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aih;
import aik;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import ani;
import ap;
import atd;
import bg;
import bjc;
import bjd;
import bka;
import blh;
import bpa;
import cnd;
import dbf;
import dbx;
import dbz;
import dsp;
import g;
import gbh;
import gmo;
import gng;
import h;
import hgx;
import po;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            CallContactPickerActivity

public class EditAudienceActivity extends bka
    implements bjd, dbz
{

    private final gmo m;
    private ani n;

    public EditAudienceActivity()
    {
        m = (new gng(this, q)).a(p);
        (new dsp(this, q)).b(p);
    }

    public void a()
    {
        setResult(-1);
        finish();
    }

    public void a(String s, int i, boolean flag, aik aik1)
    {
        if (flag)
        {
            startActivity(g.a((new bpa(n.a(), 1)).a("conversation").b(s).a(), g.a(this, aik1), g.a(aik1), true, 61, SystemClock.elapsedRealtime()));
            s = new Intent();
            s.putExtra("new_conversation_created", true);
            setResult(-1, s);
        } else
        {
            aik1 = g.a(n.h(), s, i);
            Object obj = new aih(s, i);
            obj.d = true;
            obj.k = getIntent().getIntExtra("opened_from_impression", 0);
            aik1.putExtra("conversation_parameters", ((android.os.Parcelable) (obj)));
            obj = (Intent)getIntent().getParcelableExtra("share_intent");
            if (obj != null)
            {
                ((Intent) (obj)).putExtra("conversation_id", s);
                aik1.putExtra("share_intent", ((android.os.Parcelable) (obj)));
            }
            startActivity(aik1);
        }
        s = new Intent();
        s.putExtra("new_conversation_created", true);
        setResult(-1, s);
        finish();
    }

    protected boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    public void b(dbx dbx1)
    {
        boolean flag = true;
        Intent intent;
        if (dbx1.b() != 1)
        {
            flag = false;
        }
        gbh.a(flag);
        dbx1 = n;
        intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/CallContactPickerActivity);
        intent.putExtra("com.google.android.apps.hangouts.voiceCallActionMode", 2);
        if (dbx1 != null)
        {
            intent.putExtra("account_id", dbx1.h());
        }
        startActivityForResult(intent, 1001);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 5100 && j == -1)
        {
            b((dbx)intent.getParcelableExtra("com.google.android.apps.hangouts.voiceCallActionInfo"));
        } else
        if (i == 1001 && j == -1)
        {
            a();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = dbf.e(m.a());
        setContentView(g.fP);
        ap ap1 = t_();
        bjc bjc1 = (bjc)ap1.a(h.be);
        bundle = bjc1;
        if (bjc1 == null)
        {
            bundle = (atd)getIntent().getSerializableExtra("conversation_type");
            String s = getIntent().getStringExtra("conversation_id");
            cnd cnd1 = (cnd)getIntent().getSerializableExtra("edit_audience_mode");
            aik aik1 = (aik)getIntent().getSerializableExtra("audience");
            bundle = ((blh)hgx.a(this, blh)).a(bundle, s, cnd1, aik1);
            ap1.a().a(h.be, bundle, bjc.getName()).b();
        }
        bundle.a(this);
        setTitle(null);
    }

    protected void onStart()
    {
        super.onStart();
        po po1 = g();
        if (po1 != null)
        {
            po1.a(true);
        }
    }
}
