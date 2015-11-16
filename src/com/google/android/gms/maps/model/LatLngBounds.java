// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import erf;
import foc;
import g;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final foc CREATOR = new foc();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    public LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        g.b(latlng, "null southwest");
        g.b(latlng1, "null northeast");
        boolean flag;
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.a), Double.valueOf(latlng1.a)
        });
        c = i;
        a = latlng;
        b = latlng1;
    }

    private int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!a.equals(((LatLngBounds) (obj)).a) || !b.equals(((LatLngBounds) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public String toString()
    {
        return g.c(this).a("southwest", a).a("northeast", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, a, i);
        g.a(parcel, 3, b, i);
        g.q(parcel, j);
    }

}
