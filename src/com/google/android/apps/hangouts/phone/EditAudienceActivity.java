// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import aia;
import aid;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import aoa;
import ap;
import atu;
import bg;
import bjo;
import bjp;
import bkm;
import blq;
import bpj;
import cov;
import dcn;
import ddg;
import ddi;
import dvi;
import g;
import gdv;
import gqu;
import grn;
import h;
import hlp;
import pq;

// Referenced classes of package com.google.android.apps.hangouts.phone:
//            CallContactPickerActivity

public class EditAudienceActivity extends bkm
    implements bjp, ddi
{

    private final gqu n;
    private aoa o;

    public EditAudienceActivity()
    {
        n = (new grn(this, r)).a(q);
        (new dvi(this, r)).b(q);
    }

    public void a()
    {
        setResult(-1);
        finish();
    }

    public void a(String s, int i, boolean flag, aid aid1)
    {
        if (flag)
        {
            startActivity(g.a((new bpj(o.a(), 1)).a("conversation").b(s).a(), g.a(this, aid1), g.a(aid1), true, 61, SystemClock.elapsedRealtime()));
            s = new Intent();
            s.putExtra("new_conversation_created", true);
            setResult(-1, s);
        } else
        {
            aid1 = g.a(o.h(), s, i);
            Object obj = new aia(s, i);
            obj.d = true;
            obj.k = getIntent().getIntExtra("opened_from_impression", 0);
            aid1.putExtra("conversation_parameters", ((android.os.Parcelable) (obj)));
            obj = (Intent)getIntent().getParcelableExtra("share_intent");
            if (obj != null)
            {
                ((Intent) (obj)).putExtra("conversation_id", s);
                aid1.putExtra("share_intent", ((android.os.Parcelable) (obj)));
            }
            startActivity(aid1);
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

    public void b(ddg ddg1)
    {
        boolean flag = true;
        Intent intent;
        if (ddg1.b() != 1)
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        ddg1 = o;
        intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/CallContactPickerActivity);
        intent.putExtra("com.google.android.apps.hangouts.voiceCallActionMode", 2);
        if (ddg1 != null)
        {
            intent.putExtra("account_id", ddg1.h());
        }
        startActivityForResult(intent, 1001);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 5100 && j == -1)
        {
            b((ddg)intent.getParcelableExtra("com.google.android.apps.hangouts.voiceCallActionInfo"));
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
        o = dcn.e(n.a());
        setContentView(g.fN);
        ap ap1 = u_();
        bjo bjo1 = (bjo)ap1.a(h.aY);
        bundle = bjo1;
        if (bjo1 == null)
        {
            bundle = (atu)getIntent().getSerializableExtra("conversation_type");
            String s = getIntent().getStringExtra("conversation_id");
            cov cov1 = (cov)getIntent().getSerializableExtra("edit_audience_mode");
            aid aid1 = (aid)getIntent().getSerializableExtra("audience");
            bundle = ((blq)hlp.a(this, blq)).a(bundle, s, cov1, aid1);
            ap1.a().a(h.aY, bundle, bjo.getName()).b();
        }
        bundle.a(this);
        setTitle(null);
    }

    protected void onStart()
    {
        super.onStart();
        pq pq1 = g();
        if (pq1 != null)
        {
            pq1.a(true);
        }
    }
}
