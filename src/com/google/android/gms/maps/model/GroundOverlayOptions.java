// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fcw;
import fcx;
import fmt;
import fob;
import g;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final fob CREATOR = new fob();
    private final int a;
    private fmt b;
    private LatLng c;
    private float d;
    private float e;
    private LatLngBounds f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;

    public GroundOverlayOptions()
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = 1;
    }

    public GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = i1;
        b = new fmt(fcx.a(ibinder));
        c = latlng;
        d = f1;
        e = f2;
        f = latlngbounds;
        g = f3;
        h = f4;
        i = flag;
        j = f5;
        k = f6;
        l = f7;
    }

    private IBinder a()
    {
        return b.a().asBinder();
    }

    private int b()
    {
        return a;
    }

    private LatLng c()
    {
        return c;
    }

    private float d()
    {
        return d;
    }

    private float e()
    {
        return e;
    }

    private LatLngBounds f()
    {
        return f;
    }

    private float g()
    {
        return g;
    }

    private float h()
    {
        return h;
    }

    private float i()
    {
        return j;
    }

    private float j()
    {
        return k;
    }

    private float k()
    {
        return l;
    }

    private boolean l()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.b(parcel, 1, b());
        g.a(parcel, 2, a());
        g.a(parcel, 3, c(), i1);
        g.a(parcel, 4, d());
        g.a(parcel, 5, e());
        g.a(parcel, 6, f(), i1);
        g.a(parcel, 7, g());
        g.a(parcel, 8, h());
        g.a(parcel, 9, l());
        g.a(parcel, 10, i());
        g.a(parcel, 11, j());
        g.a(parcel, 12, k());
        g.q(parcel, j1);
    }

}
