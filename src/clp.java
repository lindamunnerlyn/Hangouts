// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;

public final class clp extends Binder
{

    final com.google.android.apps.hangouts.phone.DebugActivity.RecordingService a;

    public clp(com.google.android.apps.hangouts.phone.DebugActivity.RecordingService recordingservice)
    {
        a = recordingservice;
        super();
    }

    com.google.android.apps.hangouts.phone.DebugActivity.RecordingService a()
    {
        return a;
    }
}
