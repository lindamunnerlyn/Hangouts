// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;

public final class ekg
    implements Runnable
{

    final WearableService a;

    public ekg(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void run()
    {
        WearableService.a(a);
    }
}
