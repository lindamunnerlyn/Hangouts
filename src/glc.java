// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.libraries.hangouts.video.CallService;

public final class glc
{

    private static boolean e = false;
    final Runnable a;
    gmp b;
    private final Context c;
    private final gjj d;
    private final ServiceConnection f = new gld(this);

    public glc(Context context, Runnable runnable)
    {
        c = context;
        a = runnable;
        if (!e)
        {
            hlp.b(c).a(gjj, new gjj());
            e = true;
        }
        runnable = new Intent();
        runnable.setComponent(new ComponentName(c, com/google/android/libraries/hangouts/video/CallService.getName()));
        c.startService(runnable);
        if (!c.bindService(runnable, f, 1))
        {
            gne.a("vclib", "Failed to initialize CallClient.");
        }
        d = (gjj)hlp.b(context).a(gjj);
    }

    public gmm a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.b();
        }
    }

    public gmm a(gmn gmn)
    {
        if (b == null)
        {
            throw new IllegalStateException("CallClient not initialized yet; wait for onReadyRunnable");
        } else
        {
            return b.a(gmn);
        }
    }

    public void finalize()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c.unbindService(f);
        b = null;
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        gne.a("vclib", "Error disconnecting CallService", illegalargumentexception);
        return;
    }

}
