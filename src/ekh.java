// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.wearable.WearableService;

public final class ekh
    implements enb
{

    final WearableService a;

    public ekh(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(int i)
    {
    }

    public void a_(Bundle bundle)
    {
        a.d.a(a.b, WearableService.a).a(new eki(this));
    }
}
