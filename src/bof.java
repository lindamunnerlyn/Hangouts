// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class bof
    implements Runnable
{

    final DebugOverlayTextView a;

    public bof(DebugOverlayTextView debugoverlaytextview)
    {
        a = debugoverlaytextview;
        super();
    }

    public void run()
    {
        g.x().postDelayed(DebugOverlayTextView.d(a), DebugOverlayTextView.d());
        if (eev.a("hangout_overlay", 2))
        {
            eev.a("hangout_overlay", DebugOverlayTextView.c(a));
        }
    }
}
