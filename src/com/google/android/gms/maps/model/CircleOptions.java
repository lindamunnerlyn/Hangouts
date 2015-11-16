// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import foa;
import g;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final foa CREATOR = new foa();
    private final int a;
    private LatLng b;
    private double c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;

    public CircleOptions()
    {
        b = null;
        c = 0.0D;
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        a = 1;
    }

    public CircleOptions(int i, LatLng latlng, double d1, float f1, int j, int k, 
            float f2, boolean flag)
    {
        b = null;
        c = 0.0D;
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        a = i;
        b = latlng;
        c = d1;
        d = f1;
        e = j;
        f = k;
        g = f2;
        h = flag;
    }

    private int a()
    {
        return a;
    }

    private LatLng b()
    {
        return b;
    }

    private double c()
    {
        return c;
    }

    private float d()
    {
        return d;
    }

    private int e()
    {
        return e;
    }

    private int f()
    {
        return f;
    }

    private float g()
    {
        return g;
    }

    private boolean h()
    {
        return h;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, b(), i);
        g.a(parcel, 3, c());
        g.a(parcel, 4, d());
        g.b(parcel, 5, e());
        g.b(parcel, 6, f());
        g.a(parcel, 7, g());
        g.a(parcel, 8, h());
        g.q(parcel, j);
    }

}
