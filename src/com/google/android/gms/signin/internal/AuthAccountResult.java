// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ftx;
import g;

public class AuthAccountResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ftx();
    final int a;

    public AuthAccountResult()
    {
        this(1);
    }

    public AuthAccountResult(int i)
    {
        a = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.q(parcel, i);
    }

}
