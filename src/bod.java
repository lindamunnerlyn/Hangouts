// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.DebugOverlayTextView;

public final class bod extends bns
{

    final DebugOverlayTextView a;

    public bod(DebugOverlayTextView debugoverlaytextview)
    {
        a = debugoverlaytextview;
        super();
    }

    public void c(gmt gmt1)
    {
        if (gmt1.equals(DebugOverlayTextView.a(a)))
        {
            DebugOverlayTextView.a(a, gmt1);
        }
    }

    public void d(gmt gmt1)
    {
        DebugOverlayTextView.a(a, gmt1);
    }
}
