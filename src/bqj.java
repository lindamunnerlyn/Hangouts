// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView;

public final class bqj
    implements Runnable
{

    final IncomingRingActivity a;

    public bqj(IncomingRingActivity incomingringactivity)
    {
        a = incomingringactivity;
        super();
    }

    public void run()
    {
        if (a.k != null)
        {
            a.k.ping();
        }
        if (a.l != null)
        {
            a.l.postDelayed(this, 2000L);
        }
    }
}
