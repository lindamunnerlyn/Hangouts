// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import fuq;

public class GetConfigResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fuq();
    public final int a;
    public final int b;
    public final ConnectionConfiguration c;

    public GetConfigResponse(int i, int j, ConnectionConfiguration connectionconfiguration)
    {
        a = i;
        b = j;
        c = connectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fuq.a(this, parcel, i);
    }

}
