// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fof;
import g;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class PointOfInterest
    implements SafeParcelable
{

    public static final fof CREATOR = new fof();
    public final LatLng a;
    public final String b;
    public final String c;
    private final int d;

    public PointOfInterest(int i, LatLng latlng, String s, String s1)
    {
        d = i;
        a = latlng;
        b = s;
        c = s1;
    }

    private int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, a, i);
        g.a(parcel, 3, b);
        g.a(parcel, 4, c);
        g.q(parcel, j);
    }

}
