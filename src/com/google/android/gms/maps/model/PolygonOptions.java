// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fog;
import g;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
    implements SafeParcelable
{

    public static final fog CREATOR = new fog();
    private final int a;
    private final List b;
    private final List c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public PolygonOptions()
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = 1;
        b = new ArrayList();
        c = new ArrayList();
    }

    public PolygonOptions(int j, List list, List list1, float f1, int k, int l, float f2, 
            boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = j;
        b = list;
        c = list1;
        d = f1;
        e = k;
        f = l;
        g = f2;
        h = flag;
        i = flag1;
    }

    private int a()
    {
        return a;
    }

    private List b()
    {
        return c;
    }

    private List c()
    {
        return b;
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

    private boolean i()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        j = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.c(parcel, 2, c());
        List list = b();
        if (list != null)
        {
            int k = g.p(parcel, 3);
            parcel.writeList(list);
            g.q(parcel, k);
        }
        g.a(parcel, 4, d());
        g.b(parcel, 5, e());
        g.b(parcel, 6, f());
        g.a(parcel, 7, g());
        g.a(parcel, 8, h());
        g.a(parcel, 9, i());
        g.q(parcel, j);
    }

}
