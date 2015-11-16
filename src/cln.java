// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Handler;

public final class cln
    implements dgo
{

    final com.google.android.apps.hangouts.phone.DebugActivity.RecordingService a;

    public cln(com.google.android.apps.hangouts.phone.DebugActivity.RecordingService recordingservice)
    {
        a = recordingservice;
        super();
    }

    public void a(Intent intent)
    {
        com.google.android.apps.hangouts.phone.DebugActivity.RecordingService.d(a).post(new clo(this, intent));
    }
}
