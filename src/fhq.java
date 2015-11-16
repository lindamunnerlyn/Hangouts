// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class fhq extends fet
{

    final fhp b;

    fhq(fhp fhp, enn enn1)
    {
        b = fhp;
        super(enn1);
    }

    public void a(Status status, PredictedNetworkQuality predictednetworkquality)
    {
        a.a(new fhr(status, predictednetworkquality));
    }
}
