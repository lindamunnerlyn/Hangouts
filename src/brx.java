// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import java.util.Set;

public final class brx extends bnk
{

    private Context a;
    private android.os.PowerManager.WakeLock b;
    private giw c;

    public brx(Context context)
    {
        a = context;
        ebw.c("Babel_Proximity", "Created");
    }

    public static boolean a(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
            if (!g.a(context, "babel_proximity_wakelock_blacklist", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private void b()
    {
        if (a(a) && (c == null || c == giw.b))
        {
            if (b != null)
            {
                ebw.c("Babel_Proximity", "WakeLock already held.");
                return;
            }
            PowerManager powermanager = (PowerManager)a.getApplicationContext().getSystemService("power");
            if (!g.nT && !powermanager.isWakeLockLevelSupported(32))
            {
                ebw.c("Babel_Proximity", "Proximity WakeLock not supported.");
                return;
            } else
            {
                b = powermanager.newWakeLock(32, "Babel_Proximity");
                b.acquire();
                ebw.c("Babel_Proximity", "WakeLock acquired");
                return;
            }
        } else
        {
            c();
            return;
        }
    }

    private void c()
    {
        if (b != null)
        {
            ebw.c("Babel_Proximity", "WakeLock released");
            b.release();
            b = null;
        }
    }

    public void a(int i)
    {
        ebw.c("Babel_Proximity", "onCallEnd");
        c();
    }

    public void a(giw giw1, Set set)
    {
        set = String.valueOf(giw1);
        ebw.c("Babel_Proximity", (new StringBuilder(String.valueOf(set).length() + 17)).append("audioDeviceState:").append(set).toString());
        c = giw1;
        b();
    }

    public void a(gjq gjq)
    {
        ebw.c("Babel_Proximity", "onCallJoin");
        b();
    }

    protected void finalize()
    {
        super.finalize();
        if (b != null)
        {
            c();
            gbh.a("Leak found.");
        }
    }
}
