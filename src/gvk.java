// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.libraries.social.async.BackgroundTaskService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class gvk
    implements guz, gva
{

    private static final ThreadFactory f;
    private static final Executor g;
    private final Context a;
    private final Intent b;
    private gvq c;
    private guy d;
    private final Runnable e = new gvl(this);

    gvk(Context context)
    {
        a = context.getApplicationContext();
        b = new Intent(a, com/google/android/libraries/social/async/BackgroundTaskService);
        d = new gvp();
    }

    static gvq a(gvk gvk1)
    {
        return gvk1.c;
    }

    static guy b(gvk gvk1)
    {
        return gvk1.d;
    }

    static Context c(gvk gvk1)
    {
        return gvk1.a;
    }

    static Intent d(gvk gvk1)
    {
        return gvk1.b;
    }

    static Runnable e(gvk gvk1)
    {
        return gvk1.e;
    }

    public void a()
    {
        if (c == null)
        {
            c = (gvq)hlp.a(a, gvq);
        }
        do
        {
            guy guy1 = c.c();
            if (guy1 != null)
            {
                guy1.a(this);
                g.execute(itp.a(new gvn(this, guy1)));
            } else
            {
                a.startService(b);
                return;
            }
        } while (true);
    }

    public void a(guy guy1, gvv gvv)
    {
        c.d().post(itp.a(new gvo(this, guy1, gvv)));
    }

    static 
    {
        gvm gvm1 = new gvm();
        f = gvm1;
        g = Executors.newCachedThreadPool(gvm1);
    }
}
