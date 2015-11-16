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
import bpy;
import bqa;
import bqb;
import bqc;
import bqd;
import bqe;
import cey;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import dbf;
import dzj;
import dzs;
import ebr;
import g;
import h;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            IncomingRing

public final class IncomingRingActivity extends ai
    implements bpy
{

    private IncomingRing j;
    private List k;
    private boolean l;
    private TextView m;
    private TextView n;
    private TextView o;
    private AvatarView p;
    private GlowPadView q;
    private Button r;
    private Button s;
    private FixedParticipantsGalleryView t;
    private final Handler u = new Handler(Looper.getMainLooper());
    private boolean v;
    private final Runnable w = new bqa(this);
    private final dzs x = new dzs(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active");

    public IncomingRingActivity()
    {
    }

    public static GlowPadView a(IncomingRingActivity incomingringactivity)
    {
        return incomingringactivity.q;
    }

    public static Handler b(IncomingRingActivity incomingringactivity)
    {
        return incomingringactivity.u;
    }

    public static void c(IncomingRingActivity incomingringactivity)
    {
        boolean flag2;
        boolean flag3 = true;
        boolean flag;
        boolean flag1;
        if (!incomingringactivity.j.i())
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
            (new android.app.AlertDialog.Builder(incomingringactivity)).setMessage(incomingringactivity.getResources().getString(l.eI)).setCancelable(false).setPositiveButton(0x104000a, new bqd(incomingringactivity)).show();
            g.a(incomingringactivity.j.c(), 2682);
            return;
        } else
        {
            incomingringactivity.j.k();
            return;
        }
        flag2 = false;
          goto _L1
    }

    public static IncomingRing d(IncomingRingActivity incomingringactivity)
    {
        return incomingringactivity.j;
    }

    private boolean g()
    {
        return ((KeyguardManager)getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void h()
    {
        if (!v || TextUtils.isEmpty(j.g()))
        {
            return;
        } else
        {
            String s1 = getResources().getString(l.dG, new Object[] {
                j.g()
            });
            ebr.a(m, null, s1);
            return;
        }
    }

    public void a()
    {
        finish();
    }

    public void b()
    {
        m.setText(j.a(getResources()));
        m.setVisibility(0);
        Object obj = j;
        getResources();
        obj = ((IncomingRing) (obj)).b();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            n.setText(((CharSequence) (obj)));
            n.setVisibility(0);
        } else
        {
            n.setVisibility(8);
        }
        if (dbf.h())
        {
            o.setText(j.b(getResources()));
            o.setVisibility(0);
        }
        h();
        if (j.d() != k)
        {
            k = j.d();
            t.a(j.c(), k, null);
            t.setVisibility(0);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (l)
        {
            dzj.a(this);
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
        if (dzj.c())
        {
            if (g())
            {
                l = true;
                setTheme(g.in);
            }
        } else
        {
            setRequestedOrientation(1);
        }
        setContentView(g.gj);
        if (l)
        {
            dzj.a(this);
        }
        m = (TextView)findViewById(h.da);
        n = (TextView)findViewById(h.cZ);
        p = (AvatarView)findViewById(h.dh);
        o = (TextView)findViewById(h.df);
        t = (FixedParticipantsGalleryView)findViewById(h.cn);
        q = (GlowPadView)findViewById(h.cW);
        if (dzj.c() || !dzj.a() || ebr.a(this))
        {
            q.setVisibility(8);
            findViewById(h.R).setVisibility(0);
            int i = h.k;
            int j1 = h.cO;
            r = (Button)findViewById(i);
            r.setOnClickListener(new bqb(this));
            s = (Button)findViewById(j1);
            s.setOnClickListener(new bqc(this));
            p.setBackgroundResource(0x106000b);
            return;
        }
        q.setOnTriggerListener(new bqe(this));
        q.clearAnimation();
        q.setTargetResources(g.cR);
        q.setTargetDescriptionsResourceId(g.cQ);
        q.setDirectionDescriptionsResourceId(g.cP);
        bundle = q;
        Resources resources = getResources();
        int i1;
        if (j.i() || j.h())
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bt;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bu;
        }
        bundle.setHandleDrawable(resources, i1);
        p.setBackgroundResource(0x106000c);
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
            startActivity(g.j());
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
            if (j.h())
            {
                p.a(j.j(), true, j.c());
            } else
            {
                cey cey1 = cey.a(j.f());
                p.a(cey1, j.c());
            }
            if (q != null)
            {
                u.postDelayed(w, 1000L);
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
        if (q != null)
        {
            u.removeCallbacks(w);
            q.reset(false);
        }
        t.a();
        t.setVisibility(8);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        v = flag;
        h();
    }
}
