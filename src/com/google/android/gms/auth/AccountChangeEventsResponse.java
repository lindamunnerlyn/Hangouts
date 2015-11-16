// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import elk;
import g;
import java.util.List;

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new elk();
    final int a;
    final List b;

    public AccountChangeEventsResponse(int i, List list)
    {
        a = i;
        b = (List)g.d(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.c(parcel, 2, b);
        g.q(parcel, i);
    }

}
