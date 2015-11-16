// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class bnv
    implements Runnable
{

    final DebugOverlayTextView a;

    public bnv(DebugOverlayTextView debugoverlaytextview)
    {
        a = debugoverlaytextview;
        super();
    }

    public void run()
    {
        g.y().postDelayed(DebugOverlayTextView.a(a), DebugOverlayTextView.c());
        if (!ebw.a("hangout_overlay"))
        {
            a.setText(null);
            a.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(0);
            a.setText(DebugOverlayTextView.b(a));
            return;
        }
    }
}
