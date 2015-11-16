// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;

public final class dlf extends ListView
{

    final DebugWakelocksActivity a;

    public dlf(DebugWakelocksActivity debugwakelocksactivity, Context context)
    {
        a = debugwakelocksactivity;
        super(context);
        setOnItemClickListener(new dlj(a));
    }
}
