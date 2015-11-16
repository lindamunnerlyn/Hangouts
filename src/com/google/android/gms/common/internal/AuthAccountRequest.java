// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import epq;
import epw;
import g;
import java.util.Set;

public class AuthAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epw();
    final int a;
    final IBinder b;
    final Scope c[];

    public AuthAccountRequest(int i, IBinder ibinder, Scope ascope[])
    {
        a = i;
        b = ibinder;
        c = ascope;
    }

    public AuthAccountRequest(epq epq1, Set set)
    {
        this(1, epq1.asBinder(), (Scope[])set.toArray(new Scope[set.size()]));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.a(parcel, 3, c, i);
        g.q(parcel, j);
    }

}
