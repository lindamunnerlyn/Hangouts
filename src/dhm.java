// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhm
    implements Runnable
{

    final PendingIntent a;
    final int b;

    public dhm(PendingIntent pendingintent, int i)
    {
        a = pendingintent;
        b = i;
        super();
    }

    public void run()
    {
        a.send();
        synchronized (RealTimeChatService.n())
        {
            RealTimeChatService.n().put(b, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        return;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (android.app.PendingIntent.CanceledException canceledexception)
        {
            return;
        }
    }
}
