// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fui;

public class DeleteDataItemsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fui();
    public final int a;
    public final int b;
    public final int c;

    public DeleteDataItemsResponse(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fui.a(this, parcel);
    }

}
