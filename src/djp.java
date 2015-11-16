// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class djp extends LinearLayout
{

    final DebugWakelocksActivity a;

    public djp(DebugWakelocksActivity debugwakelocksactivity, Context context)
    {
        a = debugwakelocksactivity;
        super(context);
        setOrientation(1);
        addView(new djq(this, a));
        addView(DebugWakelocksActivity.c(a));
    }
}
