// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fll;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
    implements SafeParcelable
{

    public static final fll CREATOR = new fll();
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

    public int a()
    {
        return a;
    }

    public List b()
    {
        return b;
    }

    public float c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e()
    {
        return e;
    }

    public boolean f()
    {
        return f;
    }

    public boolean g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fll.a(this, parcel);
    }

}
