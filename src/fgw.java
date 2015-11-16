// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public interface fgw
    extends IInterface
{

    public abstract StreetViewPanoramaOrientation a(ezy ezy);

    public abstract ezy a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int i);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(fje fje);

    public abstract void a(fjh fjh);

    public abstract void a(fjk fjk);

    public abstract void a(fjn fjn);

    public abstract void a(String s);

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract void b(boolean flag);

    public abstract boolean b();

    public abstract void c(boolean flag);

    public abstract boolean c();

    public abstract void d(boolean flag);

    public abstract boolean d();

    public abstract StreetViewPanoramaCamera e();

    public abstract StreetViewPanoramaLocation f();
}
