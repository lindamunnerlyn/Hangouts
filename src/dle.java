// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.concurrent.ConcurrentHashMap;

public final class dle
    implements Runnable
{

    final DebugWakelocksActivity a;

    public dle(DebugWakelocksActivity debugwakelocksactivity)
    {
        a = debugwakelocksactivity;
        super();
    }

    public void run()
    {
        Object obj = a.c;
        g.x().removeCallbacks(((Runnable) (obj)));
        obj = a.b;
        DebugWakelocksActivity debugwakelocksactivity = a;
        ((ListView) (obj)).setAdapter(new dli(debugwakelocksactivity, debugwakelocksactivity, h.jb, g.oR, h.b(debugwakelocksactivity.a.b.values())));
        g.a(this, 100L);
    }
}
