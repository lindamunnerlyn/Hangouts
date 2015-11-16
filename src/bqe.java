// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class bqe
    implements com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView.OnTriggerListener
{

    final IncomingRingActivity a;

    public bqe(IncomingRingActivity incomingringactivity)
    {
        a = incomingringactivity;
        super();
    }

    public void onFinishFinalAnimation()
    {
    }

    public void onGrabbed(View view, int i)
    {
    }

    public void onGrabbedStateChange(View view, int i)
    {
    }

    public void onReleased(View view, int i)
    {
    }

    public void onTrigger(View view, int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            g.l((new StringBuilder(60)).append("Unexpected trigger for GlowPadView widget value: ").append(i).toString());
            return;

        case 0: // '\0'
            IncomingRingActivity.c(a);
            return;

        case 2: // '\002'
            IncomingRingActivity.d(a).l();
            break;
        }
    }
}
