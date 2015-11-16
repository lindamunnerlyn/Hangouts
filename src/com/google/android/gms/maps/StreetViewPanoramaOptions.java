// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import flu;
import g;

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final flu CREATOR = new flu();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    public StreetViewPanoramaOptions()
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = 1;
    }

    public StreetViewPanoramaOptions(int k, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = k;
        b = streetviewpanoramacamera;
        d = latlng;
        e = integer;
        c = s;
        f = g.a(byte0);
        g = g.a(byte1);
        h = g.a(byte2);
        i = g.a(byte3);
        j = g.a(byte4);
    }

    public int a()
    {
        return a;
    }

    public byte b()
    {
        return g.a(f);
    }

    public byte c()
    {
        return g.a(g);
    }

    public byte d()
    {
        return g.a(h);
    }

    public int describeContents()
    {
        return 0;
    }

    public byte e()
    {
        return g.a(i);
    }

    public byte f()
    {
        return g.a(j);
    }

    public StreetViewPanoramaCamera g()
    {
        return b;
    }

    public LatLng h()
    {
        return d;
    }

    public Integer i()
    {
        return e;
    }

    public String j()
    {
        return c;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        flu.a(this, parcel, k);
    }

}
