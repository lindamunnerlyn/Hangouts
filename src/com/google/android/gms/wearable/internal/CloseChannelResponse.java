// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fys;
import g;

public class CloseChannelResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fys();
    public final int a;
    public final int b;

    public CloseChannelResponse(int i, int j)
    {
        a = i;
        b = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, b);
        g.q(parcel, i);
    }

}
