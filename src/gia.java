// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.libraries.hangouts.video.CallService;

public final class gia
{

    private static boolean d = false;
    private final Context a;
    private final Runnable b;
    private final ggj c;
    private gjn e;
    private final ServiceConnection f = new gib(this);

    public gia(Context context, Runnable runnable)
    {
        a = context;
        b = runnable;
        if (!d)
        {
            hgx.b(a).a(ggj, new ggj());
            d = true;
        }
        runnable = new Intent();
        runnable.setComponent(new ComponentName(a, com/google/android/libraries/hangouts/video/CallService.getName()));
        a.startService(runnable);
        if (!a.bindService(runnable, f, 1))
        {
            gkc.f("vclib", "Failed to initialize CallClient.");
        }
        c = (ggj)hgx.b(context).a(ggj);
    }

    static gjn a(gia gia1)
    {
        return gia1.e;
    }

    static gjn a(gia gia1, gjn gjn1)
    {
        gia1.e = gjn1;
        return gjn1;
    }

    static Runnable b(gia gia1)
    {
        return gia1.b;
    }

    public gjk a()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.b();
        }
    }

    public gjk a(gjl gjl)
    {
        if (e == null)
        {
            throw new IllegalStateException("CallClient not initialized yet; wait for onReadyRunnable");
        } else
        {
            return e.a(gjl);
        }
    }

    public void finalize()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        a.unbindService(f);
        e = null;
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        gkc.b("vclib", "Error disconnecting CallService", illegalargumentexception);
        return;
    }

}
