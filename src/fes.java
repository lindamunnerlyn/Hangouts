// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class fes extends fbv
{

    final fer b;

    fes(fer fer, ekm ekm1)
    {
        b = fer;
        super(ekm1);
    }

    public void a(Status status, PredictedNetworkQuality predictednetworkquality)
    {
        a.a(new fet(status, predictednetworkquality));
    }
}
