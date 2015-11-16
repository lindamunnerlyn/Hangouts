// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import foh;
import g;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
    implements SafeParcelable
{

    public static final foh CREATOR = new foh();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions()
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = 1;
        b = new ArrayList();
    }

    public PolylineOptions(int i, List list, float f1, int j, float f2, boolean flag, boolean flag1)
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = i;
        b = list;
        c = f1;
        d = j;
        e = f2;
        f = flag;
        g = flag1;
    }

    private int a()
    {
        return a;
    }

    private List b()
    {
        return b;
    }

    private float c()
    {
        return c;
    }

    private int d()
    {
        return d;
    }

    private float e()
    {
        return e;
    }

    private boolean f()
    {
        return f;
    }

    private boolean g()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.c(parcel, 2, b());
        g.a(parcel, 3, c());
        g.b(parcel, 4, d());
        g.a(parcel, 5, e());
        g.a(parcel, 6, f());
        g.a(parcel, 7, g());
        g.q(parcel, i);
    }

}
