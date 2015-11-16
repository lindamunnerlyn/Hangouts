// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.wearable.WearableService;

public final class ekc
    implements aqs
{

    final WearableService a;

    public ekc(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(eef eef, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        if (flag && eef != null)
        {
            a.n.post(new ekd(this, aqn, eef));
        }
    }
}
