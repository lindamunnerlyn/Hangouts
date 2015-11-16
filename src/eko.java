// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;

public final class eko
{

    final WearableService a;

    public eko(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(aoa aoa1, String s, String s1, aqs aqs)
    {
        aoa1 = new aqn((new edq(eep.a(s1), aoa1.a())).a(aon.a()).b(true).d(true), aqs, false, s);
        ((dpn)hlp.a(a.getApplicationContext(), dpn)).a(aoa1);
    }
}
