// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;

public final class ekj
    implements Runnable
{

    final String a;
    final WearableService b;

    public ekj(WearableService wearableservice, String s)
    {
        b = wearableservice;
        a = s;
        super();
    }

    public void run()
    {
        WearableService.a(b, a);
        WearableService.a(b);
    }
}
