// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public interface fjs
    extends IInterface
{

    public abstract StreetViewPanoramaOrientation a(fcw fcw);

    public abstract fcw a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int i);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(fma fma);

    public abstract void a(fmd fmd);

    public abstract void a(fmg fmg);

    public abstract void a(fmj fmj);

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
