// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ad;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import ap;
import bg;
import bkm;
import bph;
import bpw;
import brb;
import bsq;
import bty;
import btz;
import bu;
import bvm;
import bvn;
import dcn;
import djs;
import ecn;
import ecw;
import g;
import gqu;
import grn;
import h;
import hlp;
import java.util.Iterator;
import java.util.List;
import pq;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            HangoutFragment, IncomingRing

public final class HangoutActivity extends bkm
    implements djs
{

    final ecw n = new ecw(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption");
    final ecw o = new ecw(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active");
    final gqu p;
    private HangoutFragment s;
    private boolean t;
    private boolean u;

    public HangoutActivity()
    {
        p = (new grn(this, r)).a(q);
    }

    private void q()
    {
        Intent intent = g.a(dcn.e(p.a()), s.r());
        s.d();
        startActivity(intent);
        finish();
    }

    public void a(ad ad)
    {
        if (ad instanceof HangoutFragment)
        {
            s = (HangoutFragment)ad;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ((bvn)q.a(bvn)).a(this, r).a(q);
        ((btz)q.a(btz)).a(this, r).a(q);
        for (bundle = q.c(bsq).iterator(); bundle.hasNext(); ((bsq)bundle.next()).a(this, r)) { }
    }

    protected boolean a(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x102002c)
        {
            g.b(1585);
            q();
        } else
        if (i != h.dp)
        {
            return super.a(menuitem);
        }
        return true;
    }

    public void b(boolean flag)
    {
        if (u)
        {
            return;
        }
        u = true;
        if (flag)
        {
            int i = getIntent().getIntExtra("hangout_pstn_call", 2);
            Intent intent = null;
            if ((i & 1) != 0)
            {
                intent = g.d(dcn.e(p.a()));
            }
            if (intent != null)
            {
                startActivity(intent);
            }
        }
        finish();
    }

    public boolean j()
    {
        return t;
    }

    public bph m()
    {
        return (bph)getIntent().getParcelableExtra("hangout_room_info");
    }

    public void n()
    {
        b(true);
    }

    public HangoutFragment o()
    {
        return s;
    }

    public void onBackPressed()
    {
        if (s.d())
        {
            return;
        }
        if (bu.a(this, g.a(dcn.e(p.a()), s.r())))
        {
            finish();
            return;
        } else
        {
            q();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 16 && ecn.d())
        {
            g.l("Device has NFC. Adding NfcHangoutFragment.");
            brb brb1 = new brb();
            u_().a().a(brb1, null).b();
        }
        a(g.fS, com.google.android.apps.hangouts.R.drawable.bN);
        pq pq1 = g();
        pq1.a();
        pq1.b();
        pq1.a(new bpw(this));
        getWindow().addFlags(0x688080);
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
        n.a();
        o.a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        n.b();
        o.b();
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        if (menu != null)
        {
            g.b(1584);
        }
        return super.onMenuOpened(i, menu);
    }

    public void onRestart()
    {
        super.onRestart();
        t = true;
    }

    protected void onStart()
    {
        super.onStart();
        IncomingRing.a(getIntent());
    }

    public void overridePendingTransition(int i, int k)
    {
        super.overridePendingTransition(i, k);
    }

    public void p()
    {
        s.q().s();
        n();
    }
}
