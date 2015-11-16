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
import bka;
import boy;
import bpn;
import bqs;
import bsh;
import btl;
import btm;
import bu;
import buz;
import bva;
import dbf;
import dih;
import dzj;
import dzs;
import g;
import gmo;
import gng;
import h;
import hgx;
import java.util.Iterator;
import java.util.List;
import po;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            HangoutFragment, IncomingRing

public final class HangoutActivity extends bka
    implements dih
{

    final dzs m = new dzs(this, "com.google.android.apps.hangouts.phone.notify_external_interruption", "com.google.android.apps.hangouts.phone.block_external_interruption");
    final dzs n = new dzs(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active");
    final gmo o;
    private HangoutFragment r;
    private boolean s;
    private boolean t;

    public HangoutActivity()
    {
        o = (new gng(this, q)).a(p);
    }

    private void q()
    {
        Intent intent = g.a(dbf.e(o.a()), r.s());
        r.d();
        startActivity(intent);
        finish();
    }

    public void a(ad ad)
    {
        if (ad instanceof HangoutFragment)
        {
            r = (HangoutFragment)ad;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ((bva)p.a(bva)).a(this, q).a(p);
        ((btm)p.a(btm)).a(this, q).a(p);
        for (bundle = p.c(bsh).iterator(); bundle.hasNext(); ((bsh)bundle.next()).a(this, q)) { }
    }

    protected boolean a(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x102002c)
        {
            g.b(1585);
            q();
        } else
        if (i != h.dB)
        {
            return super.a(menuitem);
        }
        return true;
    }

    public void c(boolean flag)
    {
        if (t)
        {
            return;
        }
        t = true;
        if (flag)
        {
            int i = getIntent().getIntExtra("hangout_pstn_call", 2);
            Intent intent = null;
            if ((i & 1) != 0)
            {
                intent = g.e(dbf.e(o.a()));
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
        return s;
    }

    public boy m()
    {
        return (boy)getIntent().getParcelableExtra("hangout_room_info");
    }

    public void n()
    {
        c(true);
    }

    public HangoutFragment o()
    {
        return r;
    }

    public void onBackPressed()
    {
        if (r.d())
        {
            return;
        }
        if (bu.a(this, g.a(dbf.e(o.a()), r.s())))
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
        if (android.os.Build.VERSION.SDK_INT >= 16 && dzj.d())
        {
            g.l("Device has NFC. Adding NfcHangoutFragment.");
            bqs bqs1 = new bqs();
            t_().a().a(bqs1, null).b();
        }
        a(g.fW, com.google.android.apps.hangouts.R.drawable.bV);
        po po1 = g();
        po1.a();
        po1.b();
        po1.a(new bpn(this));
        getWindow().addFlags(0x688080);
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
        m.a();
        n.a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        m.b();
        n.b();
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
        s = true;
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
        r.r().s();
        n();
    }
}
