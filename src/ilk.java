// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import android.os.StrictMode;

final class ilk
    implements Runnable
{

    final Runnable a;
    final ilj b;

    ilk(ilj ilj, Runnable runnable)
    {
        b = ilj;
        a = runnable;
        super();
    }

    public void run()
    {
        StrictMode.setThreadPolicy(ili.c());
        Process.setThreadPriority(0);
        a.run();
    }
}
