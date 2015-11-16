// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

final class gnr
{

    final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
    private final gnz b;
    private final Application c;
    private AtomicBoolean d;

    gnr(gnz gnz1, Application application)
    {
        d = new AtomicBoolean(false);
        b = gnz1;
        c = application;
    }

    public void a()
    {
        if (d.get())
        {
            return;
        } else
        {
            c.registerActivityLifecycleCallbacks(new gnl(c, new gns(this), new gnu(this)));
            d.set(true);
            return;
        }
    }

    public void a(int i)
    {
        if (b.a())
        {
            gnq gnq1 = new gnq(i);
            b.a(gnq1);
        }
    }
}
