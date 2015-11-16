// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class bqc
    implements android.view.View.OnClickListener
{

    final IncomingRingActivity a;

    public bqc(IncomingRingActivity incomingringactivity)
    {
        a = incomingringactivity;
        super();
    }

    public void onClick(View view)
    {
        if (!a.isFinishing())
        {
            IncomingRingActivity.d(a).l();
        }
    }
}
