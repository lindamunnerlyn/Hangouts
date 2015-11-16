// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class bnw
    implements Runnable
{

    final DebugOverlayTextView a;

    public bnw(DebugOverlayTextView debugoverlaytextview)
    {
        a = debugoverlaytextview;
        super();
    }

    public void run()
    {
        g.y().postDelayed(DebugOverlayTextView.c(a), DebugOverlayTextView.d());
        if (ebw.a("hangout_overlay", 2))
        {
            ebw.a("hangout_overlay", DebugOverlayTextView.b(a));
        }
    }
}
