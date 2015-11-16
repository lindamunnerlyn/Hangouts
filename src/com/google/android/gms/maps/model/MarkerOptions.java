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
import foe;
import g;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final foe CREATOR = new foe();
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private fmt e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;

    public MarkerOptions()
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = 1;
    }

    public MarkerOptions(int i1, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = i1;
        b = latlng;
        c = s;
        d = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new fmt(fcx.a(ibinder));
        }
        e = latlng;
        f = f1;
        g = f2;
        h = flag;
        i = flag1;
        j = flag2;
        k = f3;
        l = f4;
        m = f5;
        n = f6;
    }

    private int a()
    {
        return a;
    }

    private IBinder b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a().asBinder();
        }
    }

    private LatLng c()
    {
        return b;
    }

    private String d()
    {
        return c;
    }

    private String e()
    {
        return d;
    }

    private float f()
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

    private boolean i()
    {
        return i;
    }

    private boolean j()
    {
        return j;
    }

    private float k()
    {
        return k;
    }

    private float l()
    {
        return l;
    }

    private float m()
    {
        return m;
    }

    private float n()
    {
        return n;
    }

    public MarkerOptions a(LatLng latlng)
    {
        b = latlng;
        return this;
    }

    public MarkerOptions a(String s)
    {
        c = s;
        return this;
    }

    public MarkerOptions b(String s)
    {
        d = s;
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
        g.a(parcel, 2, c(), i1);
        g.a(parcel, 3, d());
        g.a(parcel, 4, e());
        g.a(parcel, 5, b());
        g.a(parcel, 6, f());
        g.a(parcel, 7, g());
        g.a(parcel, 8, h());
        g.a(parcel, 9, i());
        g.a(parcel, 10, j());
        g.a(parcel, 11, k());
        g.a(parcel, 12, l());
        g.a(parcel, 13, m());
        g.a(parcel, 14, n());
        g.q(parcel, j1);
    }

}
