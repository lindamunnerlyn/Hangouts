// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import flt;
import g;

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final flt CREATOR = new flt();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    public GoogleMapOptions(int i1, byte byte0, byte byte1, int j1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        d = -1;
        a = i1;
        b = g.a(byte0);
        c = g.a(byte1);
        d = j1;
        e = cameraposition;
        f = g.a(byte2);
        g = g.a(byte3);
        h = g.a(byte4);
        i = g.a(byte5);
        j = g.a(byte6);
        k = g.a(byte7);
        l = g.a(byte8);
        m = g.a(byte9);
    }

    public int a()
    {
        return a;
    }

    public GoogleMapOptions a(boolean flag)
    {
        l = Boolean.valueOf(flag);
        return this;
    }

    public byte b()
    {
        return g.a(b);
    }

    public byte c()
    {
        return g.a(c);
    }

    public byte d()
    {
        return g.a(f);
    }

    public int describeContents()
    {
        return 0;
    }

    public byte e()
    {
        return g.a(g);
    }

    public byte f()
    {
        return g.a(h);
    }

    public byte g()
    {
        return g.a(i);
    }

    public byte h()
    {
        return g.a(j);
    }

    public byte i()
    {
        return g.a(k);
    }

    public byte j()
    {
        return g.a(l);
    }

    public byte k()
    {
        return g.a(m);
    }

    public int l()
    {
        return d;
    }

    public CameraPosition m()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        flt.a(this, parcel, i1);
    }

}
