// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fxa;
import g;

public class GetFdForAssetResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fxa();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    public GetFdForAssetResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = i;
        b = j;
        c = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, b);
        g.a(parcel, 3, c, i | 1);
        g.q(parcel, j);
    }

}
