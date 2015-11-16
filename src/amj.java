// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import android.os.StrictMode;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentServiceImpl;

final class amj
    implements Runnable
{

    final Runnable a;
    final ami b;

    amj(ami ami, Runnable runnable)
    {
        b = ami;
        a = runnable;
        super();
    }

    public void run()
    {
        StrictMode.setThreadPolicy(ConcurrentServiceImpl.a());
        Process.setThreadPriority(0);
        a.run();
    }
}
