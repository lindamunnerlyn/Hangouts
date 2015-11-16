// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.wearable.WearableService;

public final class eha
    implements aqb
{

    final WearableService a;

    public eha(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(ebh ebh, eab eab, boolean flag, apw apw, boolean flag1)
    {
        if (flag && ebh != null)
        {
            a.n.post(new ehb(this, apw, ebh));
        }
    }
}
