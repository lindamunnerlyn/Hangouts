// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fuj;
import java.util.List;

public class GetAllCapabilitiesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fuj();
    public final int a;
    public final int b;
    public final List c;

    public GetAllCapabilitiesResponse(int i, int j, List list)
    {
        a = i;
        b = j;
        c = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fuj.a(this, parcel);
    }

}
