// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class boe
    implements Runnable
{

    final DebugOverlayTextView a;

    public boe(DebugOverlayTextView debugoverlaytextview)
    {
        a = debugoverlaytextview;
        super();
    }

    public void run()
    {
        g.x().postDelayed(DebugOverlayTextView.b(a), DebugOverlayTextView.c());
        if (!eev.a("hangout_overlay"))
        {
            a.setText(null);
            a.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(0);
            a.setText(DebugOverlayTextView.c(a));
            return;
        }
    }
}
