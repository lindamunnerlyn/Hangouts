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

public final class gqz
    implements gqo, gqp
{

    private static final ThreadFactory f;
    private static final Executor g;
    private final Context a;
    private final Intent b;
    private grf c;
    private gqn d;
    private final Runnable e = new gra(this);

    gqz(Context context)
    {
        a = context.getApplicationContext();
        b = new Intent(a, com/google/android/libraries/social/async/BackgroundTaskService);
        d = new gre();
    }

    static grf a(gqz gqz1)
    {
        return gqz1.c;
    }

    static gqn b(gqz gqz1)
    {
        return gqz1.d;
    }

    static Context c(gqz gqz1)
    {
        return gqz1.a;
    }

    static Intent d(gqz gqz1)
    {
        return gqz1.b;
    }

    static Runnable e(gqz gqz1)
    {
        return gqz1.e;
    }

    public void a()
    {
        if (c == null)
        {
            c = (grf)hgx.a(a, grf);
        }
        do
        {
            gqn gqn1 = c.c();
            if (gqn1 != null)
            {
                gqn1.a(this);
                g.execute(inl.a(new grc(this, gqn1)));
            } else
            {
                a.startService(b);
                return;
            }
        } while (true);
    }

    public void a(gqn gqn1, grk grk)
    {
        c.d().post(inl.a(new grd(this, gqn1, grk)));
    }

    static 
    {
        grb grb1 = new grb();
        f = grb1;
        g = Executors.newCachedThreadPool(grb1);
    }
}
