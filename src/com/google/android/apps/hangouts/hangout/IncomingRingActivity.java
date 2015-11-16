// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import ai;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import bqh;
import bqj;
import bqk;
import bql;
import bqm;
import bqn;
import cgd;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import dcn;
import ecn;
import ecw;
import eep;
import g;
import h;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            IncomingRing

public final class IncomingRingActivity extends ai
    implements bqh
{

    public IncomingRing j;
    public GlowPadView k;
    public final Handler l = new Handler(Looper.getMainLooper());
    private List m;
    private boolean n;
    private TextView o;
    private TextView p;
    private TextView q;
    private AvatarView r;
    private Button s;
    private Button t;
    private FixedParticipantsGalleryView u;
    private boolean v;
    private final Runnable w = new bqj(this);
    private final ecw x = new ecw(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active");

    public IncomingRingActivity()
    {
    }

    public static void a(IncomingRingActivity incomingringactivity)
    {
        boolean flag2;
        boolean flag3 = true;
        boolean flag;
        boolean flag1;
        if (!incomingringactivity.j.j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && incomingringactivity.checkCallingOrSelfPermission("android.permission.CAMERA") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (incomingringactivity.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!incomingringactivity.g())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        flag2 = flag3;
        if (!flag)
        {
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            flag2 = flag3;
        }
_L1:
        if (flag2)
        {
            (new android.app.AlertDialog.Builder(incomingringactivity)).setMessage(incomingringactivity.getResources().getString(l.er)).setCancelable(false).setPositiveButton(0x104000a, new bqm(incomingringactivity)).show();
            g.a(incomingringactivity.j.d(), 2682);
            return;
        } else
        {
            incomingringactivity.j.l();
            return;
        }
        flag2 = false;
          goto _L1
    }

    private boolean g()
    {
        return ((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void h()
    {
        if (!v || TextUtils.isEmpty(j.h()))
        {
            return;
        } else
        {
            String s1 = getResources().getString(l.dp, new Object[] {
                j.h()
            });
            eep.a(o, null, s1);
            return;
        }
    }

    public void a()
    {
        finish();
    }

    public void b()
    {
        o.setText(j.a(getResources()));
        o.setVisibility(0);
        Object obj = j;
        getResources();
        obj = ((IncomingRing) (obj)).c();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            p.setText(((CharSequence) (obj)));
            p.setVisibility(0);
        } else
        {
            p.setVisibility(8);
        }
        if (dcn.h())
        {
            q.setText(j.b(getResources()));
            q.setVisibility(0);
        }
        h();
        if (j.e() != m)
        {
            m = j.e();
            u.a(j.d(), m, null);
            u.setVisibility(0);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (n)
        {
            ecn.a(this);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        x.a();
        j = IncomingRing.a();
        if (j == null)
        {
            finish();
            return;
        }
        getWindow().addFlags(0x680080);
        if (ecn.c())
        {
            if (g())
            {
                n = true;
                setTheme(g._fldif);
            }
        } else
        {
            setRequestedOrientation(1);
        }
        setContentView(g.gf);
        if (n)
        {
            ecn.a(this);
        }
        o = (TextView)findViewById(h.cP);
        p = (TextView)findViewById(h.cO);
        r = (AvatarView)findViewById(h.cW);
        q = (TextView)findViewById(h.cU);
        u = (FixedParticipantsGalleryView)findViewById(h.cd);
        k = (GlowPadView)findViewById(h.cL);
        if (ecn.c() || !ecn.a() || eep.a(this))
        {
            k.setVisibility(8);
            findViewById(h.R).setVisibility(0);
            int i = h.k;
            int j1 = h.cE;
            s = (Button)findViewById(i);
            s.setOnClickListener(new bqk(this));
            t = (Button)findViewById(j1);
            t.setOnClickListener(new bql(this));
            r.setBackgroundResource(0x106000b);
            return;
        }
        k.setOnTriggerListener(new bqn(this));
        k.clearAnimation();
        k.setTargetResources(g.cQ);
        k.setTargetDescriptionsResourceId(g.cP);
        k.setDirectionDescriptionsResourceId(g.cO);
        bundle = k;
        Resources resources = getResources();
        int i1;
        if (j.j() || j.i())
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bp;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bq;
        }
        bundle.setHandleDrawable(resources, i1);
        r.setBackgroundResource(0x106000c);
    }

    public void onDestroy()
    {
        super.onDestroy();
        x.b();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i == 24 || i == 25)
        {
            j.a(false);
            flag = true;
        }
        return flag;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return i == 24 || i == 25;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (j != IncomingRing.a())
        {
            finish();
            startActivity(g.i());
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (IncomingRing.a() != j)
        {
            finish();
        } else
        {
            j.a(this);
            b();
            if (j.i())
            {
                r.a(j.k(), true, j.d());
            } else
            {
                cgd cgd1 = cgd.a(j.g());
                r.a(cgd1, j.d());
            }
            if (k != null)
            {
                l.postDelayed(w, 1000L);
                return;
            }
        }
    }

    protected void onStop()
    {
        super.onStop();
        if (v && !((PowerManager)getSystemService("power")).isScreenOn())
        {
            j.a(false);
        }
        j.b(this);
        if (k != null)
        {
            l.removeCallbacks(w);
            k.reset(false);
        }
        u.a();
        u.setVisibility(8);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        v = flag;
        h();
    }
}
