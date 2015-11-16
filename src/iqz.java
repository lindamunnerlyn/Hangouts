// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

final class iqz
    implements Runnable
{

    final Runnable a;
    final iqy b;

    iqz(iqy iqy, Runnable runnable)
    {
        b = iqy;
        a = runnable;
        super();
    }

    public void run()
    {
        Process.setThreadPriority(11);
        a.run();
    }
}
