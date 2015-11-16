// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import foq;
import g;

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final foq CREATOR = new foq();
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

    private int a()
    {
        return a;
    }

    private byte b()
    {
        return g.a(f);
    }

    private byte c()
    {
        return g.a(g);
    }

    private byte d()
    {
        return g.a(h);
    }

    private byte e()
    {
        return g.a(i);
    }

    private byte f()
    {
        return g.a(j);
    }

    private StreetViewPanoramaCamera g()
    {
        return b;
    }

    private LatLng h()
    {
        return d;
    }

    private Integer i()
    {
        return e;
    }

    private String j()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        int l = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, g(), k);
        g.a(parcel, 3, j());
        g.a(parcel, 4, h(), k);
        Integer integer = i();
        if (integer != null)
        {
            g.a(parcel, 5, 4);
            parcel.writeInt(integer.intValue());
        }
        g.a(parcel, 6, b());
        g.a(parcel, 7, c());
        g.a(parcel, 8, d());
        g.a(parcel, 9, e());
        g.a(parcel, 10, f());
        g.q(parcel, l);
    }

}
