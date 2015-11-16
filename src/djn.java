// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class djn
    implements Runnable
{

    final DebugWakelocksActivity a;

    public djn(DebugWakelocksActivity debugwakelocksactivity)
    {
        a = debugwakelocksactivity;
        super();
    }

    public void run()
    {
        Runnable runnable = DebugWakelocksActivity.a(a);
        g.y().removeCallbacks(runnable);
        DebugWakelocksActivity.c(a).setAdapter(DebugWakelocksActivity.b(a));
        g.a(this, 100L);
    }
}
