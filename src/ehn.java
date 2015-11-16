// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;

public final class ehn
{

    final WearableService a;

    public ehn(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(ani ani1, String s, String s1, aqb aqb)
    {
        ani1 = new apw((new eam(ebr.a(s1), ani1.a())).a(anv.a()).b(true).d(true), aqb, false, s);
        ((dmt)hgx.a(a.getApplicationContext(), dmt)).a(ani1);
    }
}
