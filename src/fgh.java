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

public interface fgh
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract fkc a(PolylineOptions polylineoptions);

    public abstract fki a(CircleOptions circleoptions);

    public abstract fkl a(GroundOverlayOptions groundoverlayoptions);

    public abstract fkr a(MarkerOptions markeroptions);

    public abstract fku a(PolygonOptions polygonoptions);

    public abstract fkx a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(Bundle bundle);

    public abstract void a(ezy ezy);

    public abstract void a(ezy ezy, int i1, fhi fhi);

    public abstract void a(ezy ezy, fhi fhi);

    public abstract void a(fgk fgk);

    public abstract void a(fho fho);

    public abstract void a(fhr fhr);

    public abstract void a(fhu fhu);

    public abstract void a(fhx fhx);

    public abstract void a(fid fid);

    public abstract void a(fig fig);

    public abstract void a(fij fij);

    public abstract void a(fim fim);

    public abstract void a(fip fip);

    public abstract void a(fis fis);

    public abstract void a(fiv fiv);

    public abstract void a(fiy fiy);

    public abstract void a(fjb fjb);

    public abstract void a(fjt fjt, ezy ezy);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(Bundle bundle);

    public abstract void b(ezy ezy);

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

    public abstract fhf k();

    public abstract fgt l();

    public abstract boolean m();

    public abstract fko n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
