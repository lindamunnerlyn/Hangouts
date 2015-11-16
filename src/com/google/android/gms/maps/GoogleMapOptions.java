// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import fop;
import g;

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final fop CREATOR = new fop();
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

    private int a()
    {
        return a;
    }

    private byte b()
    {
        return g.a(b);
    }

    private byte c()
    {
        return g.a(c);
    }

    private byte d()
    {
        return g.a(f);
    }

    private byte e()
    {
        return g.a(g);
    }

    private byte f()
    {
        return g.a(h);
    }

    private byte g()
    {
        return g.a(i);
    }

    private byte h()
    {
        return g.a(j);
    }

    private byte i()
    {
        return g.a(k);
    }

    private byte j()
    {
        return g.a(l);
    }

    private byte k()
    {
        return g.a(m);
    }

    private int l()
    {
        return d;
    }

    private CameraPosition m()
    {
        return e;
    }

    public GoogleMapOptions a(boolean flag)
    {
        l = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, b());
        g.a(parcel, 3, c());
        g.b(parcel, 4, l());
        g.a(parcel, 5, m(), i1);
        g.a(parcel, 6, d());
        g.a(parcel, 7, e());
        g.a(parcel, 8, f());
        g.a(parcel, 9, g());
        g.a(parcel, 10, h());
        g.a(parcel, 11, i());
        g.a(parcel, 12, j());
        g.a(parcel, 14, k());
        g.q(parcel, j1);
    }

}
