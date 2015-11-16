// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface fge
    extends IInterface
{

    public abstract ezy a();

    public abstract ezy a(float f);

    public abstract ezy a(float f, float f1);

    public abstract ezy a(float f, int i, int j);

    public abstract ezy a(CameraPosition cameraposition);

    public abstract ezy a(LatLng latlng);

    public abstract ezy a(LatLng latlng, float f);

    public abstract ezy a(LatLngBounds latlngbounds, int i);

    public abstract ezy a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract ezy b();

    public abstract ezy b(float f);
}
