// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

public interface fjd
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract fmy a(PolylineOptions polylineoptions);

    public abstract fne a(CircleOptions circleoptions);

    public abstract fnh a(GroundOverlayOptions groundoverlayoptions);

    public abstract fnn a(MarkerOptions markeroptions);

    public abstract fnq a(PolygonOptions polygonoptions);

    public abstract fnt a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(Bundle bundle);

    public abstract void a(fcw fcw);

    public abstract void a(fcw fcw, int i1, fke fke);

    public abstract void a(fcw fcw, fke fke);

    public abstract void a(fjg fjg);

    public abstract void a(fkk fkk);

    public abstract void a(fkn fkn);

    public abstract void a(fkq fkq);

    public abstract void a(fkt fkt);

    public abstract void a(fkz fkz);

    public abstract void a(flc flc);

    public abstract void a(flf flf);

    public abstract void a(fli fli);

    public abstract void a(fll fll);

    public abstract void a(flo flo);

    public abstract void a(flr flr);

    public abstract void a(flu flu);

    public abstract void a(flx flx);

    public abstract void a(fmp fmp, fcw fcw);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(Bundle bundle);

    public abstract void b(fcw fcw);

    public abstract boolean b(boolean flag);

    public abstract float c();

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(boolean flag);

    public abstract void e();

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract Location j();

    public abstract fkb k();

    public abstract fjp l();

    public abstract boolean m();

    public abstract fnk n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
