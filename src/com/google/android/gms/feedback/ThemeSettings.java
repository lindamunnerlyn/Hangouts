// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fan;

public class ThemeSettings
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fan();
    public final int a;
    public int b;
    public int c;

    public ThemeSettings()
    {
        this(1, 0, 0);
    }

    public ThemeSettings(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public ThemeSettings a(int i)
    {
        b = i;
        return this;
    }

    public ThemeSettings b(int i)
    {
        c = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fan.a(this, parcel);
    }

}
