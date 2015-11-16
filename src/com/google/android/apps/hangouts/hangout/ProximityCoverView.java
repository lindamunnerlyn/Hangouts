// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bnk;
import bsc;
import bsd;
import bse;
import bsf;
import eev;
import g;
import gdv;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ProximityCoverView extends View
{

    public float a;
    public float b;
    private final SensorManager c;
    private final Sensor d;
    private final bsf e = new bsf(this);
    private final bsd f = new bsd(this);
    private boolean g;
    private bse h;
    private android.os.PowerManager.WakeLock i;
    private boolean j;
    private bsc k;
    private int l;

    public ProximityCoverView(Context context, AttributeSet attributeset)
    {
        boolean flag1 = false;
        super(context, attributeset);
        a = 3.402823E+38F;
        b = 0.0F;
        h = null;
        i = null;
        boolean flag = flag1;
        if (g.a(g.nU, "babel_proximity_wakelock_whitelist", false))
        {
            flag = flag1;
            if (!g.a(g.nU, "babel_proximity_wakelock_blacklist", false))
            {
                flag = true;
            }
        }
        j = flag;
        c = (SensorManager)context.getSystemService("sensor");
        d = c.getDefaultSensor(8);
        c();
    }

    private void a(boolean flag)
    {
        int i1 = 0;
        if (flag == g)
        {
            return;
        }
        boolean flag1;
        if (!j)
        {
            flag1 = false;
        } else
        {
            if (flag)
            {
                j = f();
            } else
            {
                g();
            }
            flag1 = j;
        }
        if (!flag1)
        {
            if (!flag)
            {
                i1 = 8;
            }
            setVisibility(i1);
        }
        if (h != null)
        {
            h.a(flag, flag1);
        }
        g = flag;
    }

    private boolean f()
    {
        if (j) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        PowerManager powermanager;
        int i1;
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        powermanager = (PowerManager)getContext().getApplicationContext().getSystemService("power");
        i1 = g.a((Integer)android/os/PowerManager.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null), 0);
        eev.c("Babel", (new StringBuilder(42)).append("PROXIMITY_SCREEN_OFF_WAKE_LOCK:").append(i1).toString());
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L4; else goto _L3
_L3:
        boolean flag;
        flag = g.a((Boolean)powermanager.getClass().getDeclaredMethod("isWakeLockLevelSupported", new Class[] {
            Integer.TYPE
        }).invoke(powermanager, new Object[] {
            Integer.valueOf(i1)
        }), false);
        eev.c("Babel", (new StringBuilder(30)).append("isWakeLockLevelSupported:").append(flag).toString());
_L5:
        if (flag)
        {
            int j1;
            try
            {
                i = powermanager.newWakeLock(i1, "Babel");
                i.acquire();
            }
            catch (Exception exception)
            {
                String s = String.valueOf(exception.toString());
                if (s.length() != 0)
                {
                    s = "Failed to acquire proximity and keyguard locks: ".concat(s);
                } else
                {
                    s = new String("Failed to acquire proximity and keyguard locks: ");
                }
                eev.f("Babel", s);
                g();
                return false;
            }
            break MISSING_BLOCK_LABEL_306;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = g.a((Integer)powermanager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(powermanager, new Object[0]), 0);
        eev.c("Babel", (new StringBuilder(37)).append("getSupportedWakeLockFlags:").append(j1).toString());
        if ((j1 & i1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L5
        if (true) goto _L1; else goto _L6
_L6:
        return true;
    }

    private void g()
    {
        if (i != null)
        {
            i.release();
            i = null;
        }
    }

    public void a()
    {
        int i1 = l + 1;
        l = i1;
        if (i1 > 1)
        {
            return;
        }
        if (d != null)
        {
            c.registerListener(e, d, 3);
        }
        bnk.a().a(f);
        c();
    }

    public void a(bsc bsc1)
    {
        k = bsc1;
    }

    public void a(bse bse1)
    {
        gdv.a("Expected null", h);
        h = bse1;
    }

    public void b()
    {
        int i1 = l - 1;
        l = i1;
        if (i1 > 0)
        {
            return;
        }
        if (l < 0)
        {
            l = 0;
            return;
        }
        if (d != null)
        {
            c.unregisterListener(e);
        }
        bnk.a().b(f);
        a(false);
    }

    public void c()
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (k != null && k.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (0.0D <= (double)a && (a < 1.0F || a <= 5F && b > 5F))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            flag2 = false;
        }
        a(flag2);
    }

    public void d()
    {
        h = null;
    }

    public void e()
    {
        k = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return g;
    }
}
