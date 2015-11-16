// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface fja
    extends IInterface
{

    public abstract fcw a();

    public abstract fcw a(float f);

    public abstract fcw a(float f, float f1);

    public abstract fcw a(float f, int i, int j);

    public abstract fcw a(CameraPosition cameraposition);

    public abstract fcw a(LatLng latlng);

    public abstract fcw a(LatLng latlng, float f);

    public abstract fcw a(LatLngBounds latlngbounds, int i);

    public abstract fcw a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract fcw b();

    public abstract fcw b(float f);
}
