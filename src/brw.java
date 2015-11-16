// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.apps.hangouts.hangout.ProximityCoverView;

public final class brw
    implements SensorEventListener
{

    final ProximityCoverView a;

    public brw(ProximityCoverView proximitycoverview)
    {
        a = proximitycoverview;
        super();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        ProximityCoverView.a(a, sensorevent.sensor.getMaximumRange());
        ProximityCoverView.b(a, sensorevent.values[0]);
        a.c();
    }
}
